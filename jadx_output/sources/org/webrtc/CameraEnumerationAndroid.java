package org.webrtc;

/* loaded from: classes14.dex */
public class CameraEnumerationAndroid {
    static final java.util.ArrayList<org.webrtc.Size> COMMON_RESOLUTIONS = new java.util.ArrayList<>(java.util.Arrays.asList(new org.webrtc.Size(160, 120), new org.webrtc.Size(240, 160), new org.webrtc.Size(com.tencent.mapsdk.internal.km.f50100e, 240), new org.webrtc.Size(400, 240), new org.webrtc.Size(480, com.tencent.mapsdk.internal.km.f50100e), new org.webrtc.Size(640, com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1), new org.webrtc.Size(640, 480), new org.webrtc.Size(768, 480), new org.webrtc.Size(td1.q.CTRL_INDEX, 480), new org.webrtc.Size(800, 600), new org.webrtc.Size(com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH), new org.webrtc.Size(com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, 640), new org.webrtc.Size(1024, 576), new org.webrtc.Size(1024, 600), new org.webrtc.Size(1280, com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH), new org.webrtc.Size(1280, 1024), new org.webrtc.Size(1920, 1080), new org.webrtc.Size(1920, 1440), new org.webrtc.Size(2560, 1440), new org.webrtc.Size(3840, 2160)));
    private static final java.lang.String TAG = "CameraEnumerationAndroid";

    /* loaded from: classes14.dex */
    public static class CaptureFormat {
        public final org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange framerate;
        public final int height;
        public final int imageFormat = 17;
        public final int width;

        /* loaded from: classes14.dex */
        public static class FramerateRange {
            public int max;
            public int min;

            public FramerateRange(int i17, int i18) {
                this.min = i17;
                this.max = i18;
            }

            public boolean equals(java.lang.Object obj) {
                if (!(obj instanceof org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange)) {
                    return false;
                }
                org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange = (org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange) obj;
                return this.min == framerateRange.min && this.max == framerateRange.max;
            }

            public int hashCode() {
                return (this.min * 65537) + 1 + this.max;
            }

            public java.lang.String toString() {
                return "[" + (this.min / 1000.0f) + ":" + (this.max / 1000.0f) + "]";
            }
        }

        public CaptureFormat(int i17, int i18, int i19, int i27) {
            this.width = i17;
            this.height = i18;
            this.framerate = new org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange(i19, i27);
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof org.webrtc.CameraEnumerationAndroid.CaptureFormat)) {
                return false;
            }
            org.webrtc.CameraEnumerationAndroid.CaptureFormat captureFormat = (org.webrtc.CameraEnumerationAndroid.CaptureFormat) obj;
            return this.width == captureFormat.width && this.height == captureFormat.height && this.framerate.equals(captureFormat.framerate);
        }

        public int frameSize() {
            return frameSize(this.width, this.height, 17);
        }

        public int hashCode() {
            return (((this.width * 65497) + this.height) * 251) + 1 + this.framerate.hashCode();
        }

        public java.lang.String toString() {
            return this.width + "x" + this.height + "@" + this.framerate;
        }

        public static int frameSize(int i17, int i18, int i19) {
            if (i19 == 17) {
                return ((i17 * i18) * android.graphics.ImageFormat.getBitsPerPixel(i19)) / 8;
            }
            throw new java.lang.UnsupportedOperationException("Don't know how to calculate the frame size of non-NV21 image formats.");
        }

        public CaptureFormat(int i17, int i18, org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange) {
            this.width = i17;
            this.height = i18;
            this.framerate = framerateRange;
        }
    }

    /* loaded from: classes14.dex */
    public static abstract class ClosestComparator<T> implements java.util.Comparator<T> {
        private ClosestComparator() {
        }

        @Override // java.util.Comparator
        public int compare(T t17, T t18) {
            return diff(t17) - diff(t18);
        }

        public abstract int diff(T t17);
    }

    public static org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange getClosestSupportedFramerateRange(java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange> list, final int i17) {
        return (org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange) java.util.Collections.min(list, new org.webrtc.CameraEnumerationAndroid.ClosestComparator<org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange>() { // from class: org.webrtc.CameraEnumerationAndroid.1
            private static final int MAX_FPS_DIFF_THRESHOLD = 5000;
            private static final int MAX_FPS_HIGH_DIFF_WEIGHT = 3;
            private static final int MAX_FPS_LOW_DIFF_WEIGHT = 1;
            private static final int MIN_FPS_HIGH_VALUE_WEIGHT = 4;
            private static final int MIN_FPS_LOW_VALUE_WEIGHT = 1;
            private static final int MIN_FPS_THRESHOLD = 8000;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            private int progressivePenalty(int i18, int i19, int i27, int i28) {
                if (i18 < i19) {
                    return i18 * i27;
                }
                return ((i18 - i19) * i28) + (i27 * i19);
            }

            @Override // org.webrtc.CameraEnumerationAndroid.ClosestComparator
            public int diff(org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange) {
                return progressivePenalty(framerateRange.min, 8000, 1, 4) + progressivePenalty(java.lang.Math.abs((i17 * 1000) - framerateRange.max), 5000, 1, 3);
            }
        });
    }

    public static org.webrtc.Size getClosestSupportedSize(java.util.List<org.webrtc.Size> list, final int i17, final int i18) {
        return (org.webrtc.Size) java.util.Collections.min(list, new org.webrtc.CameraEnumerationAndroid.ClosestComparator<org.webrtc.Size>() { // from class: org.webrtc.CameraEnumerationAndroid.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // org.webrtc.CameraEnumerationAndroid.ClosestComparator
            public int diff(org.webrtc.Size size) {
                return java.lang.Math.abs(i17 - size.width) + java.lang.Math.abs(i18 - size.height);
            }
        });
    }

    public static void reportCameraResolution(org.webrtc.Histogram histogram, org.webrtc.Size size) {
        histogram.addSample(COMMON_RESOLUTIONS.indexOf(size) + 1);
    }
}
