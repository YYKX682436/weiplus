package org.webrtc;

/* loaded from: classes14.dex */
public interface EglBase {
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final int EGL_OPENGL_ES3_BIT = 64;
    public static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final java.lang.Object lock = new java.lang.Object();
    public static final int[] CONFIG_PLAIN = org.webrtc.EglBase.EglBaseStatic.configBuilder().createConfigAttributes();
    public static final int[] CONFIG_RGBA = org.webrtc.EglBase.EglBaseStatic.configBuilder().setHasAlphaChannel(true).createConfigAttributes();
    public static final int[] CONFIG_PIXEL_BUFFER = org.webrtc.EglBase.EglBaseStatic.configBuilder().setSupportsPixelBuffer(true).createConfigAttributes();
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER = org.webrtc.EglBase.EglBaseStatic.configBuilder().setHasAlphaChannel(true).setSupportsPixelBuffer(true).createConfigAttributes();
    public static final int[] CONFIG_RECORDABLE = org.webrtc.EglBase.EglBaseStatic.configBuilder().setIsRecordable(true).createConfigAttributes();

    /* loaded from: classes14.dex */
    public static class ConfigBuilder {
        private boolean hasAlphaChannel;
        private boolean isRecordable;
        private int openGlesVersion = 2;
        private boolean supportsPixelBuffer;

        public int[] createConfigAttributes() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(12324);
            arrayList.add(8);
            arrayList.add(12323);
            arrayList.add(8);
            arrayList.add(12322);
            arrayList.add(8);
            if (this.hasAlphaChannel) {
                arrayList.add(12321);
                arrayList.add(8);
            }
            int i17 = this.openGlesVersion;
            if (i17 == 2 || i17 == 3) {
                arrayList.add(12352);
                arrayList.add(java.lang.Integer.valueOf(this.openGlesVersion == 3 ? 64 : 4));
            }
            if (this.supportsPixelBuffer) {
                arrayList.add(12339);
                arrayList.add(1);
            }
            if (this.isRecordable) {
                arrayList.add(java.lang.Integer.valueOf(org.webrtc.EglBase.EGL_RECORDABLE_ANDROID));
                arrayList.add(1);
            }
            arrayList.add(12344);
            int[] iArr = new int[arrayList.size()];
            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                iArr[i18] = ((java.lang.Integer) arrayList.get(i18)).intValue();
            }
            return iArr;
        }

        public org.webrtc.EglBase.ConfigBuilder setHasAlphaChannel(boolean z17) {
            this.hasAlphaChannel = z17;
            return this;
        }

        public org.webrtc.EglBase.ConfigBuilder setIsRecordable(boolean z17) {
            this.isRecordable = z17;
            return this;
        }

        public org.webrtc.EglBase.ConfigBuilder setOpenGlesVersion(int i17) {
            if (i17 >= 1 && i17 <= 3) {
                this.openGlesVersion = i17;
                return this;
            }
            throw new java.lang.IllegalArgumentException("OpenGL ES version " + i17 + " not supported");
        }

        public org.webrtc.EglBase.ConfigBuilder setSupportsPixelBuffer(boolean z17) {
            this.supportsPixelBuffer = z17;
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public interface Context {
        public static final long NO_CONTEXT = 0;

        long getNativeEglContext();
    }

    /* loaded from: classes14.dex */
    public static class EglBaseStatic {
        public static org.webrtc.EglBase.ConfigBuilder configBuilder() {
            return new org.webrtc.EglBase.ConfigBuilder();
        }

        public static org.webrtc.EglBase create(org.webrtc.EglBase.Context context, int[] iArr) {
            if (context == null) {
                return org.webrtc.EglBase14Impl.isEGL14Supported() ? createEgl14(iArr) : createEgl10(iArr);
            }
            if (context instanceof org.webrtc.EglBase14.Context) {
                return createEgl14((org.webrtc.EglBase14.Context) context, iArr);
            }
            if (context instanceof org.webrtc.EglBase10.Context) {
                return createEgl10((org.webrtc.EglBase10.Context) context, iArr);
            }
            throw new java.lang.IllegalArgumentException("Unrecognized Context");
        }

        public static org.webrtc.EglBase10 createEgl10(int[] iArr) {
            return new org.webrtc.EglBase10Impl(null, iArr);
        }

        public static org.webrtc.EglBase14 createEgl14(int[] iArr) {
            return new org.webrtc.EglBase14Impl(null, iArr);
        }

        public static int getOpenGlesVersionFromConfig(int[] iArr) {
            for (int i17 = 0; i17 < iArr.length - 1; i17++) {
                if (iArr[i17] == 12352) {
                    int i18 = iArr[i17 + 1];
                    if (i18 != 4) {
                        return i18 != 64 ? 1 : 3;
                    }
                    return 2;
                }
            }
            return 1;
        }

        public static org.webrtc.EglBase10 createEgl10(org.webrtc.EglBase10.Context context, int[] iArr) {
            return new org.webrtc.EglBase10Impl(context == null ? null : context.getRawContext(), iArr);
        }

        public static org.webrtc.EglBase14 createEgl14(org.webrtc.EglBase14.Context context, int[] iArr) {
            return new org.webrtc.EglBase14Impl(context == null ? null : context.getRawContext(), iArr);
        }

        public static org.webrtc.EglBase10 createEgl10(javax.microedition.khronos.egl.EGLContext eGLContext, int[] iArr) {
            return new org.webrtc.EglBase10Impl(eGLContext, iArr);
        }

        public static org.webrtc.EglBase14 createEgl14(android.opengl.EGLContext eGLContext, int[] iArr) {
            return new org.webrtc.EglBase14Impl(eGLContext, iArr);
        }

        public static org.webrtc.EglBase create() {
            return create(null, org.webrtc.EglBase.CONFIG_PLAIN);
        }

        public static org.webrtc.EglBase create(org.webrtc.EglBase.Context context) {
            return create(context, org.webrtc.EglBase.CONFIG_PLAIN);
        }
    }

    void createDummyPbufferSurface();

    void createPbufferSurface(int i17, int i18);

    void createSurface(android.graphics.SurfaceTexture surfaceTexture);

    void createSurface(android.view.Surface surface);

    void detachCurrent();

    org.webrtc.EglBase.Context getEglBaseContext();

    boolean hasSurface();

    void makeCurrent();

    void release();

    void releaseSurface();

    int surfaceHeight();

    int surfaceWidth();

    void swapBuffers();

    void swapBuffers(long j17);
}
