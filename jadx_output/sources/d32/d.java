package d32;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d32.j f226140d;

    public d(d32.j jVar) {
        this.f226140d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        javax.microedition.khronos.egl.EGLConfig eGLConfig;
        int i17;
        java.lang.Object obj = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY;
        d32.j jVar = this.f226140d;
        javax.microedition.khronos.egl.EGL10 egl10 = jVar.f226150c;
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(obj);
        jVar.f226151d = eglGetDisplay;
        if (eglGetDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmojiCaptureEGLPixelBuffer", "egl get display error: %s", android.opengl.GLUtils.getEGLErrorString(egl10.eglGetError()));
        }
        int i18 = 0;
        if (egl10.eglInitialize(jVar.f226151d, new int[2])) {
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = jVar.f226151d;
            kotlin.jvm.internal.o.f(eGLDisplay, "eGLDisplay");
            int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12344};
            int[] iArr2 = new int[1];
            egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, iArr2);
            int i19 = iArr2[0];
            javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[i19];
            if (egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i19, iArr2)) {
                eGLConfig = eGLConfigArr[0];
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.EmojiCaptureGLUtil", "egl choose config failed: %s", android.opengl.GLUtils.getEGLErrorString(egl10.eglGetError()));
                eGLConfig = null;
            }
            jVar.f226154g = eGLConfig;
            if (eGLConfig != null) {
                jVar.f226152e = egl10.eglCreateContext(jVar.f226151d, eGLConfig, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                javax.microedition.khronos.egl.EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(jVar.f226151d, eGLConfig, new int[]{12375, com.tencent.mapsdk.internal.km.f50100e, 12374, com.tencent.mapsdk.internal.km.f50100e, 12344});
                jVar.f226153f = eglCreatePbufferSurface;
                if (eglCreatePbufferSurface == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE || jVar.f226152e == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
                    if (egl10.eglGetError() == 12299) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.EmojiCaptureEGLPixelBuffer", "eglCreateWindowSurface returned EGL_BAD_NATIVE_WINDOW. ");
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.EmojiCaptureEGLPixelBuffer", "eglCreateWindowSurface failed : %s", android.opengl.GLUtils.getEGLErrorString(egl10.eglGetError()));
                    }
                    i17 = -1;
                } else {
                    i17 = 0;
                }
                if (i17 < 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.EmojiCaptureEGLPixelBuffer", "createEGLContext failed " + i17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markPixelBufferInitFailed");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1012L, 25L, 1L);
                } else {
                    javax.microedition.khronos.egl.EGLDisplay eGLDisplay2 = jVar.f226151d;
                    javax.microedition.khronos.egl.EGLSurface eGLSurface = jVar.f226153f;
                    if (!egl10.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, jVar.f226152e)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.EmojiCaptureEGLPixelBuffer", "eglMakeCurrent failed : " + android.opengl.GLUtils.getEGLErrorString(egl10.eglGetError()));
                        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markPixelBufferInitFailed");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1012L, 25L, 1L);
                    }
                    javax.microedition.khronos.opengles.GL gl6 = jVar.f226152e.getGL();
                    kotlin.jvm.internal.o.e(gl6, "null cannot be cast to non-null type javax.microedition.khronos.opengles.GL10");
                    jVar.f226155h = (javax.microedition.khronos.opengles.GL10) gl6;
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmojiCaptureEGLPixelBuffer", "egl init error: %s", android.opengl.GLUtils.getEGLErrorString(egl10.eglGetError()));
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markPixelBufferInitFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1012L, 25L, 1L);
        }
        d32.k kVar = new d32.k(jVar.f226148a, jVar.f226149b);
        jVar.f226156i = kVar;
        if (!kVar.H) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureMixRenderer", "init: ");
            is0.c b17 = is0.b.b(false, -1L);
            kVar.f226168g = new android.graphics.SurfaceTexture(b17.f294395e);
            kVar.f226167f = b17;
            d32.b bVar = d32.c.f226136a;
            kVar.f226169h = is0.b.b(true, -1L);
            int b18 = bVar.b("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES videoExternalTexture;\n        uniform sampler2D videoNormalTexture;\n        uniform sampler2D emojiTexture;\n        uniform vec2 size;\n        uniform float radius;\n        uniform int hasEmojiTexture;\n        uniform int useNormalVideoTexture;\n        uniform int enableAlpha;\n\n        vec4 blendTexture(vec4 source, vec4 blend) {\n            if (blend.a <= 0.0) {\n                return source;\n            }\n            float sourceAlpha = 1.0 - blend.a;\n            float alpha = max(source.a, blend.a);\n            float r = max(0.0, min(sourceAlpha * source.r + blend.r, 1.0));\n            float g = max(0.0, min(sourceAlpha * source.g + blend.g, 1.0));\n            float b = max(0.0, min(sourceAlpha * source.b + blend.b, 1.0));\n            vec4 result = vec4(r, g, b, alpha);\n            if (alpha != 1.0) {\n                r = r + (1.0 - alpha) * 0.95;\n                g = g + (1.0 - alpha) * 0.95;\n                b = b + (1.0 - alpha) * 0.95;\n                r = max(0.0, min(r, 1.0));\n                g = max(0.0, min(g, 1.0));\n                b = max(0.0, min(b, 1.0));\n                return vec4(r, g, b, 1.0);\n            } else {\n                return vec4(r, g, b, alpha);\n            }\n        }\n\n        void main () {\n            vec2 bottomLeftCenter = vec2(radius, radius);\n            vec2 bottomRightCenter = vec2(size.x - radius, radius);\n            vec2 topLeftCenter = vec2(radius, size.y - radius);\n            vec2 topRightCenter = vec2(size.x - radius, size.y - radius);\n            if ((gl_FragCoord.x < bottomLeftCenter.x && gl_FragCoord.y < bottomLeftCenter.y && distance(gl_FragCoord.xy, bottomLeftCenter) > radius) ||\n                    (gl_FragCoord.x > bottomRightCenter.x && gl_FragCoord.y < bottomRightCenter.y && distance(gl_FragCoord.xy, bottomRightCenter) > radius) ||\n                    (gl_FragCoord.x < topLeftCenter.x && gl_FragCoord.y > topLeftCenter.y && distance(gl_FragCoord.xy, topLeftCenter) > radius) ||\n                    (gl_FragCoord.x > topRightCenter.x && gl_FragCoord.y > topRightCenter.y && distance(gl_FragCoord.xy, topRightCenter) > radius))  {\n                gl_FragColor = vec4(0.0, 0.0, 0.0, 0.0);\n                return;\n            } else {\n                vec4 videoColor;\n                if (useNormalVideoTexture == 1) {\n                    videoColor = texture2D(videoNormalTexture, v_texCoord);\n                } else {\n                    videoColor = texture2D(videoExternalTexture, v_texCoord);\n                }\n                if (enableAlpha == 0) {\n                    if (videoColor.a < 0.3) {\n                        videoColor = vec4(0.0, 0.0, 0.0, 0.0);\n                    } else {\n                        videoColor.a = 1.0;\n                    }\n                } else {\n                    if (videoColor.a == 0.0) {\n                        videoColor = vec4(0.0, 0.0, 0.0, 0.0);\n                    }\n                }\n                if (hasEmojiTexture == 1) {\n                    gl_FragColor = blendTexture(videoColor, texture2D(emojiTexture, v_texCoord));\n                } else {\n                    gl_FragColor = videoColor;\n                }\n            }\n        }\n        ");
            kVar.f226171j = b18;
            kVar.f226172k = android.opengl.GLES20.glGetAttribLocation(b18, "a_position");
            kVar.f226173l = android.opengl.GLES20.glGetAttribLocation(kVar.f226171j, "a_texCoord");
            kVar.f226174m = android.opengl.GLES20.glGetUniformLocation(kVar.f226171j, "videoExternalTexture");
            kVar.f226175n = android.opengl.GLES20.glGetUniformLocation(kVar.f226171j, "videoNormalTexture");
            kVar.f226176o = android.opengl.GLES20.glGetUniformLocation(kVar.f226171j, "emojiTexture");
            kVar.f226177p = android.opengl.GLES20.glGetUniformLocation(kVar.f226171j, "size");
            kVar.f226178q = android.opengl.GLES20.glGetUniformLocation(kVar.f226171j, "radius");
            kVar.f226179r = android.opengl.GLES20.glGetUniformLocation(kVar.f226171j, "hasEmojiTexture");
            kVar.f226181t = android.opengl.GLES20.glGetUniformLocation(kVar.f226171j, "uMatrix");
            kVar.f226180s = android.opengl.GLES20.glGetUniformLocation(kVar.f226171j, "useNormalVideoTexture");
            kVar.f226182u = android.opengl.GLES20.glGetUniformLocation(kVar.f226171j, "enableAlpha");
            int b19 = bVar.b("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        void main() {\n            gl_Position = a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
            kVar.f226183v = b19;
            kVar.f226184w = android.opengl.GLES20.glGetAttribLocation(b19, "a_position");
            kVar.f226185x = android.opengl.GLES20.glGetAttribLocation(kVar.f226183v, "a_texCoord");
            kVar.f226186y = android.opengl.GLES20.glGetUniformLocation(kVar.f226183v, "texture");
            kVar.D.put(d32.c.f226137b);
            kVar.E.put(d32.c.f226138c);
            int[] iArr3 = new int[1];
            android.opengl.GLES20.glGenFramebuffers(1, iArr3, 0);
            int i27 = iArr3[0];
            if (i27 == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EmojiCaptureGLUtil", "gen frame buffer error");
            } else {
                i18 = i27;
            }
            kVar.A = i18;
            kVar.B = is0.b.b(true, -1L);
            kVar.C = is0.b.b(true, -1L);
            kVar.H = true;
        }
        d32.k kVar2 = jVar.f226156i;
        if (kVar2 == null) {
            kotlin.jvm.internal.o.o("renderer");
            throw null;
        }
        android.graphics.SurfaceTexture surfaceTexture = kVar2.f226168g;
        if (surfaceTexture == null) {
            kotlin.jvm.internal.o.o("videoDecodeSurfaceTexture");
            throw null;
        }
        surfaceTexture.setOnFrameAvailableListener(new d32.g(jVar));
        d32.k kVar3 = jVar.f226156i;
        if (kVar3 == null) {
            kotlin.jvm.internal.o.o("renderer");
            throw null;
        }
        android.graphics.SurfaceTexture surfaceTexture2 = kVar3.f226168g;
        if (surfaceTexture2 != null) {
            jVar.f226157j = new android.view.Surface(surfaceTexture2);
        } else {
            kotlin.jvm.internal.o.o("videoDecodeSurfaceTexture");
            throw null;
        }
    }
}
