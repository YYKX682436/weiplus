package io.clipworks.androidplus.media;

/* loaded from: classes13.dex */
public class ImageDecoderUtils {
    private static final java.lang.String TAG = "ImageDecoderUtils";
    private byte _hellAccFlag_;

    /* loaded from: classes8.dex */
    public static final class ImageInfo {
        private int height;
        private java.lang.String mimeType;
        private int rotation;
        private int width;

        public ImageInfo(java.lang.String str, int i17, int i18, int i19) {
            this.mimeType = str;
            this.width = i17;
            this.height = i18;
            this.rotation = i19;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof io.clipworks.androidplus.media.ImageDecoderUtils.ImageInfo)) {
                return false;
            }
            io.clipworks.androidplus.media.ImageDecoderUtils.ImageInfo imageInfo = (io.clipworks.androidplus.media.ImageDecoderUtils.ImageInfo) obj;
            return imageInfo.width == this.width && imageInfo.height == this.height && imageInfo.rotation == this.rotation && imageInfo.mimeType.equals(this.mimeType);
        }

        public int getHeight() {
            return this.height;
        }

        public java.lang.String getMimeType() {
            return this.mimeType;
        }

        public int getRotation() {
            return this.rotation;
        }

        public int getWidth() {
            return this.width;
        }

        public java.lang.String toString() {
            return "ImageInfo{width=" + this.width + ", height=" + this.height + ", rotation=" + this.rotation + ", mimeType='" + this.mimeType + "'}";
        }
    }

    private ImageDecoderUtils() {
    }

    public static android.graphics.Bitmap decodeImageBuffer(java.nio.ByteBuffer byteBuffer) {
        return decodeImageBuffer(byteBuffer, -1);
    }

    public static android.graphics.Bitmap decodeImageFile(java.io.File file) {
        return decodeImageFile(file, -1);
    }

    private static android.graphics.Bitmap decodeImageFileP(java.io.File file, int i17) {
        return decodeImageSource(android.graphics.ImageDecoder.createSource(file), i17);
    }

    private static android.graphics.Bitmap decodeImageFilePreP(java.io.File file, int i17) {
        return null;
    }

    private static android.graphics.Bitmap decodeImageSource(android.graphics.ImageDecoder.Source source, final int i17) {
        return android.graphics.ImageDecoder.decodeBitmap(source, new android.graphics.ImageDecoder.OnHeaderDecodedListener() { // from class: io.clipworks.androidplus.media.ImageDecoderUtils.1
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public void onHeaderDecoded(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source2) {
                int max;
                int i18;
                if (i17 > 0) {
                    android.util.Size size = imageInfo.getSize();
                    if (size.getWidth() > i17 || size.getWidth() > i17) {
                        float max2 = i17 / java.lang.Math.max(size.getWidth(), size.getHeight());
                        int max3 = java.lang.Math.max(java.lang.Math.round(size.getWidth() * max2), 1);
                        max = java.lang.Math.max(java.lang.Math.round(size.getHeight() * max2), 1);
                        i18 = max3;
                    } else {
                        i18 = size.getWidth();
                        max = size.getHeight();
                    }
                    imageDecoder.setTargetSize(i18, max);
                    imageDecoder.setAllocator(1);
                }
            }
        });
    }

    private static android.graphics.Bitmap decodeStreamP(java.nio.ByteBuffer byteBuffer, int i17) {
        return decodeImageSource(android.graphics.ImageDecoder.createSource(byteBuffer), i17);
    }

    private static android.graphics.Bitmap decodeStreamPreP(java.nio.ByteBuffer byteBuffer, int i17) {
        return null;
    }

    public static io.clipworks.androidplus.media.ImageDecoderUtils.ImageInfo getImageInfoFromFile(java.lang.String str) {
        int i17;
        int i18;
        android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
        io.clipworks.androidplus.media.ImageDecoderUtils.ImageInfo imageInfo = null;
        try {
            try {
                mediaMetadataRetriever.setDataSource(str);
                java.lang.String extractMetadata = mediaMetadataRetriever.extractMetadata(12);
                if (extractMetadata.startsWith("image/")) {
                    imageInfo = new io.clipworks.androidplus.media.ImageDecoderUtils.ImageInfo(extractMetadata, java.lang.Integer.parseInt(mediaMetadataRetriever.extractMetadata(29)), java.lang.Integer.parseInt(mediaMetadataRetriever.extractMetadata(30)), java.lang.Integer.parseInt(mediaMetadataRetriever.extractMetadata(31)));
                }
            } catch (java.lang.Exception unused) {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(options);
                    arrayList.add(str);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "io/clipworks/androidplus/media/ImageDecoderUtils", "getImageInfoFromFile", "(Ljava/lang/String;)Lio/clipworks/androidplus/media/ImageDecoderUtils$ImageInfo;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                    yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "io/clipworks/androidplus/media/ImageDecoderUtils", "getImageInfoFromFile", "(Ljava/lang/String;)Lio/clipworks/androidplus/media/ImageDecoderUtils$ImageInfo;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                    java.lang.String str2 = options.outMimeType;
                    if (str2 != null && str2.startsWith("image/") && (i17 = options.outWidth) != -1 && (i18 = options.outHeight) != -1) {
                        imageInfo = new io.clipworks.androidplus.media.ImageDecoderUtils.ImageInfo(options.outMimeType, i17, i18, 0);
                    }
                } catch (java.lang.Exception unused2) {
                }
            }
            try {
                mediaMetadataRetriever.release();
            } catch (java.lang.Exception unused3) {
                return imageInfo;
            }
        } catch (java.lang.Throwable th6) {
            try {
                mediaMetadataRetriever.release();
            } catch (java.lang.Exception unused4) {
            }
            throw th6;
        }
    }

    public static android.graphics.Bitmap decodeImageBuffer(java.nio.ByteBuffer byteBuffer, int i17) {
        try {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return decodeStreamP(byteBuffer, i17);
            }
            return decodeStreamPreP(byteBuffer, i17);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public static android.graphics.Bitmap decodeImageFile(java.io.File file, int i17) {
        try {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return decodeImageFileP(file, i17);
            }
            return decodeImageFilePreP(file, i17);
        } catch (java.io.IOException unused) {
            return null;
        }
    }
}
