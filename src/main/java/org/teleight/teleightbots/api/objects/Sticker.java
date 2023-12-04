package org.teleight.teleightbots.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.Nullable;
import org.teleight.teleightbots.api.ApiResult;

public record Sticker(
        @JsonProperty(value = "file_id", required = true)
        String fileId,

        @JsonProperty(value = "file_unique_id", required = true)
        String fileUniqueId,

        @JsonProperty(value = "type", required = true)
        String type,

        @JsonProperty(value = "width", required = true)
        Integer width,

        @JsonProperty(value = "height", required = true)
        Integer height,

        @JsonProperty(value = "is_animated", required = true)
        Boolean isAnimated,

        @JsonProperty(value = "is_video", required = true)
        Boolean isVideo,

        @JsonProperty("thumbnail")
        @Nullable
        PhotoSize thumbnail,

        @JsonProperty("emoji")
        @Nullable
        String emoji,

        @JsonProperty("set_name")
        @Nullable
        String setName,

        @JsonProperty("premium_annotation")
        @Nullable
        File premiumAnnotation,

        @JsonProperty("mask_position")
        @Nullable
        MaskPosition maskPosition,

        @JsonProperty("custom_emoji_id")
        @Nullable
        String customEmojiId,

        @JsonProperty("needs_repainting")
        @Nullable
        Boolean needsRepainting,

        @JsonProperty("file_size")
        @Nullable
        Long fileSize
) implements ApiResult {
}
