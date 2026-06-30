package com.tencent.thumbplayer.core.postprocessor.filter;

/* loaded from: classes14.dex */
public class Hdr2SdrFilter {
    private static final int FLOAT_SIZE_BYTES = 4;
    private static final java.lang.String FRAGMENT_SHADER = "#version 300 es\nprecision mediump float;\nin vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform sampler2D lookupTexture;\nuniform float uAlpha;\nuniform int uIsEnableLut;\nout vec4 outColor;\nvoid main() {\n   vec4 textureColor = texture(sTexture, vTextureCoord);\n  textureColor = mix(vec4(0,0,0,1), textureColor, uAlpha);\n  if(uIsEnableLut == 1) {\n     textureColor = mix(vec4(0,0,0,1), textureColor, uAlpha);\n     textureColor.b = clamp(textureColor.b, 0.0, 1.0);\n     textureColor.r = clamp(textureColor.r, 0.0, 1.0);\n     textureColor.g = clamp(textureColor.g, 0.0, 1.0);\n     highp float blueColor = textureColor.b * 63.0;\n\n     highp vec2 pointQuad1;\n     pointQuad1.y = floor(floor(blueColor) / 8.0);\n     pointQuad1.x = floor(blueColor) - (pointQuad1.y * 8.0);\n\n     highp vec2 pointQuad2;\n     pointQuad2.y = floor(ceil(blueColor) / 8.0);\n     pointQuad2.x = ceil(blueColor) - (pointQuad2.y * 8.0);\n\n     highp vec2 texPoint1;\n     texPoint1.x = (pointQuad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPoint1.y = (pointQuad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n    highp vec2 texPoint2;\n     texPoint2.x = (pointQuad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPoint2.y = (pointQuad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n     lowp vec4 newColor1 = texture(lookupTexture, texPoint1);\n     lowp vec4 newColor2 = texture(lookupTexture, texPoint2);\n\n     lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n     textureColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), 1.0);\n  }\n  outColor = textureColor;\n}\n";
    private static final int TRIANGLE_VERTICES_DATA_POS_OFFSET = 0;
    private static final int TRIANGLE_VERTICES_DATA_STRIDE_BYTES = 8;
    private static final java.lang.String VERTEX_SHADER = "#version 300 es\nuniform vec2 uScreenSize;\nuniform vec2 uTextureSize;\nuniform mat3 uMatrix;\nuniform mat3 stMatrix;\nin vec2 aPosition;\nout vec2 vTextureCoord;\nvoid main() {\n  vec3 position = uMatrix * vec3(aPosition, 1);\n  vec2 clipSpace = (position.xy / uScreenSize) * 2.0 - 1.0;\n  gl_Position = vec4(clipSpace, 0, 1);\n  vec3 coord = vec3(aPosition / uTextureSize, 1);\n  vTextureCoord = (stMatrix * coord).xy;\n}\n";
    private byte _hellAccFlag_;
    private int aPositionHandle;
    private int mTextureid;
    protected int program;
    private int rendererHeight;
    private int rendererWidth;
    private int stMatrixHandle;
    private java.nio.FloatBuffer triangleVertices;
    private int uAlphaHandle;
    private int uMatrixHandle;
    private int uScreenSizeHandle;
    private int uTextureSizeHandle;
    private int uLookupTextureHandle = -1;
    private int uLookupEnableHandle = -1;
    private int lookupHDR10TextureId = -1;
    private int lookupHLGTextureId = -1;
    private int bgColor = -16777216;
    private boolean useLut = false;
    private final android.graphics.Matrix stMatrix = null;
    private final android.graphics.Matrix matrix = null;
    private final int[] shaderIndexes = new int[2];
    private int frameBuffer = -1;
    private int[] defaultViewport = new int[4];

    /* loaded from: classes14.dex */
    public static class Rectangle {
        public float height;
        public float width;

        /* renamed from: x, reason: collision with root package name */
        public float f215543x;

        /* renamed from: y, reason: collision with root package name */
        public float f215544y;

        public Rectangle() {
            this(0.0f, 0.0f, 0.0f, 0.0f);
        }

        public Rectangle(float f17, float f18, float f19, float f27) {
            this.f215543x = f17;
            this.f215544y = f18;
            this.width = f19;
            this.height = f27;
        }
    }

    public Hdr2SdrFilter() {
        java.io.InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream("assets/HDR_lut/HDR10.png");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(resourceAsStream);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/thumbplayer/core/postprocessor/filter/Hdr2SdrFilter", "<init>", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0));
        yj0.a.e(obj, decodeStream, "com/tencent/thumbplayer/core/postprocessor/filter/Hdr2SdrFilter", "<init>", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
        resourceAsStream.close();
        java.io.InputStream resourceAsStream2 = getClass().getClassLoader().getResourceAsStream("assets/HDR_lut/HLG.png");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(resourceAsStream2);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/thumbplayer/core/postprocessor/filter/Hdr2SdrFilter", "<init>", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeStream2 = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList2.get(0));
        yj0.a.e(obj2, decodeStream2, "com/tencent/thumbplayer/core/postprocessor/filter/Hdr2SdrFilter", "<init>", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
        resourceAsStream2.close();
        initShaders();
        initLutInfo(decodeStream, decodeStream2);
    }

    private void initFrameBuffer() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        int i17 = iArr[0];
        this.mTextureid = i17;
        android.opengl.GLES20.glBindTexture(3553, i17);
        com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup.checkGlError("glBindTexture mTextureID");
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
        com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup.checkGlError("glTexParameter");
        android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGB, this.rendererWidth, this.rendererHeight, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGB, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
        int[] iArr2 = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr2, 0);
        int i18 = iArr2[0];
        android.opengl.GLES20.glBindFramebuffer(36160, i18);
        com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup.checkGlError("glBindFramebuffer frameBuffer");
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.mTextureid, 0);
        com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup.checkGlError("glCheckFramebufferStatus frameBuffer");
        if (android.opengl.GLES20.glCheckFramebufferStatus(36160) != 36053) {
            new java.lang.RuntimeException("EGL error encountered: FramebufferStatus is not complete.");
        } else {
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            this.frameBuffer = i18;
        }
    }

    private void initLutInfo(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        boolean z17 = (bitmap == null || bitmap.isRecycled() || bitmap2 == null || bitmap2.isRecycled()) ? false : true;
        this.useLut = z17;
        if (z17) {
            this.uLookupTextureHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "lookupTexture");
            com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup.checkGlError("glGetUniformLocation uLookupTextureHandle");
            if (this.uLookupTextureHandle == -1) {
                new java.lang.RuntimeException("Could not get uniform location for uLookupTextureHandle");
                return;
            }
            this.uLookupEnableHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "uIsEnableLut");
            com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup.checkGlError("glGetUniformLocation uLookupTextureHandle");
            if (this.uLookupEnableHandle == -1) {
                new java.lang.RuntimeException("Could not get uniform location for uLookupTextureHandle");
                return;
            }
            if (this.lookupHDR10TextureId == -1) {
                int[] iArr = {-1};
                android.opengl.GLES20.glGenTextures(1, iArr, 0);
                android.opengl.GLES20.glBindTexture(3553, iArr[0]);
                android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
                android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
                android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
                android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
                android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
                this.lookupHDR10TextureId = iArr[0];
            }
            if (this.lookupHLGTextureId == -1) {
                int[] iArr2 = {-1};
                android.opengl.GLES20.glGenTextures(1, iArr2, 0);
                android.opengl.GLES20.glBindTexture(3553, iArr2[0]);
                android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
                android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
                android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
                android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
                android.opengl.GLUtils.texImage2D(3553, 0, bitmap2, 0);
                this.lookupHLGTextureId = iArr2[0];
            }
        }
    }

    private static void swap(float[] fArr, int i17, int i18) {
        float f17 = fArr[i17];
        fArr[i17] = fArr[i18];
        fArr[i18] = f17;
    }

    private static float[] toOpenGL2DMatrix(android.graphics.Matrix matrix) {
        float[] fArr = new float[9];
        if (matrix == null) {
            for (int i17 = 0; i17 < 9; i17++) {
                fArr[i17] = i17 % 4 == 0 ? 1.0f : 0.0f;
            }
        } else {
            matrix.getValues(fArr);
            swap(fArr, 1, 3);
            swap(fArr, 2, 6);
            swap(fArr, 5, 7);
        }
        return fArr;
    }

    public void destroyBuffers() {
        int i17 = this.frameBuffer;
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i17}, 0);
            this.frameBuffer = -1;
        }
        int i18 = this.mTextureid;
        if (i18 != 0) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i18}, 0);
            this.mTextureid = 0;
        }
        int i19 = this.lookupHDR10TextureId;
        if (i19 != -1) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i19}, 0);
        }
        int i27 = this.lookupHLGTextureId;
        if (i27 != -1) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i27}, 0);
        }
        int i28 = this.program;
        if (i28 > 0) {
            android.opengl.GLES20.glDeleteProgram(i28);
            this.program = 0;
        }
        int i29 = 0;
        while (true) {
            int[] iArr = this.shaderIndexes;
            if (i29 >= iArr.length) {
                return;
            }
            int i37 = iArr[i29];
            if (i37 > 0) {
                android.opengl.GLES20.glDeleteShader(i37);
                this.shaderIndexes[i29] = 0;
            }
            i29++;
        }
    }

    public void finishDraw() {
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, 0);
    }

    public void initShaders() {
        this.triangleVertices = java.nio.ByteBuffer.allocateDirect(64).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        int createProgram = com.tencent.thumbplayer.core.postprocessor.TPProgramUtils.createProgram(VERTEX_SHADER, FRAGMENT_SHADER, this.shaderIndexes);
        this.program = createProgram;
        if (createProgram == 0) {
            new java.lang.RuntimeException("failed creating program");
            return;
        }
        this.aPositionHandle = android.opengl.GLES20.glGetAttribLocation(createProgram, "aPosition");
        com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup.checkGlError("glGetAttribLocation aPosition");
        if (this.aPositionHandle == -1) {
            new java.lang.RuntimeException("Could not get attribute location for aPosition");
            return;
        }
        this.uMatrixHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "uMatrix");
        com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup.checkGlError("glGetUniformLocation uMatrix");
        if (this.uMatrixHandle == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uMatrix");
            return;
        }
        this.uAlphaHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "uAlpha");
        com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup.checkGlError("glGetUniformLocation uAlpha");
        if (this.uAlphaHandle == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uAlpha");
            return;
        }
        this.stMatrixHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "stMatrix");
        com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup.checkGlError("glGetUniformLocation stMatrix");
        if (this.stMatrixHandle == -1) {
            new java.lang.RuntimeException("Could not get uniform location for stMatrix");
            return;
        }
        this.uScreenSizeHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "uScreenSize");
        com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup.checkGlError("glGetUniformLocation uScreenSize");
        if (this.uScreenSizeHandle == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uScreenSize");
            return;
        }
        this.uTextureSizeHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "uTextureSize");
        com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup.checkGlError("glGetUniformLocation uTextureSize");
        if (this.uTextureSizeHandle == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uTextureSize");
        }
    }

    public void prepareDraw(int i17, int i18, float[] fArr, int i19, int i27) {
        int i28;
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, i18);
        this.triangleVertices.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.aPositionHandle, 2, 5126, false, 8, (java.nio.Buffer) this.triangleVertices);
        com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup.checkGlError("glVertexAttribPointer maPosition");
        android.opengl.GLES20.glEnableVertexAttribArray(this.aPositionHandle);
        com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup.checkGlError("glEnableVertexAttribArray aPositionHandle");
        android.opengl.GLES20.glUniformMatrix3fv(this.uMatrixHandle, 1, false, fArr, 0);
        android.opengl.GLES20.glUniform2f(this.uTextureSizeHandle, i19, i27);
        android.opengl.GLES20.glUniform2f(this.uScreenSizeHandle, this.rendererWidth, this.rendererHeight);
        int i29 = i17 == 2 ? this.lookupHDR10TextureId : i17 == 5 ? this.lookupHLGTextureId : -1;
        if (!this.useLut || (i28 = this.uLookupEnableHandle) == -1 || this.uLookupTextureHandle == -1) {
            return;
        }
        if (i29 == -1) {
            android.opengl.GLES20.glUniform1i(i28, 0);
            return;
        }
        android.opengl.GLES20.glUniform1i(i28, 1);
        android.opengl.GLES20.glActiveTexture(33987);
        android.opengl.GLES20.glBindTexture(3553, i29);
        android.opengl.GLES20.glUniform1i(this.uLookupTextureHandle, 3);
    }

    public int process(int i17, int i18, int i19, int i27) {
        if (this.rendererWidth != i19 || this.rendererHeight != i27) {
            this.rendererWidth = i19;
            this.rendererHeight = i27;
            initFrameBuffer();
        }
        com.tencent.thumbplayer.core.postprocessor.filter.Hdr2SdrFilter.Rectangle rectangle = new com.tencent.thumbplayer.core.postprocessor.filter.Hdr2SdrFilter.Rectangle(0.0f, 0.0f, i19, i27);
        float f17 = rectangle.f215543x;
        float f18 = rectangle.f215544y;
        float f19 = rectangle.height;
        float f27 = rectangle.width;
        this.triangleVertices.rewind();
        this.triangleVertices.put(new float[]{f17, f18 + f19, f17, f18, f17 + f27, f19 + f18, f17 + f27, f18});
        android.opengl.GLES20.glGetIntegerv(2978, this.defaultViewport, 0);
        int i28 = this.frameBuffer;
        if (i28 != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, i28);
            android.opengl.GLES20.glGetIntegerv(2978, this.defaultViewport, 0);
            android.opengl.GLES20.glViewport(0, 0, this.rendererWidth, this.rendererHeight);
        }
        android.opengl.GLES20.glUseProgram(this.program);
        com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup.checkGlError("glUseProgram");
        android.opengl.GLES20.glUniformMatrix3fv(this.stMatrixHandle, 1, false, toOpenGL2DMatrix(this.stMatrix), 0);
        android.opengl.GLES20.glUniform1f(this.uAlphaHandle, 1.0f);
        prepareDraw(i17, i18, toOpenGL2DMatrix(this.matrix), i19, i27);
        int i29 = this.bgColor;
        android.opengl.GLES20.glClearColor(((16711680 & i29) >> 16) / 255.0f, ((65280 & i29) >> 8) / 255.0f, (i29 & 255) / 255.0f, 1.0f);
        android.opengl.GLES20.glClear(16640);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup.checkGlError("glDrawArrays");
        finishDraw();
        if (this.frameBuffer != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            int[] iArr = this.defaultViewport;
            android.opengl.GLES20.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        return this.mTextureid;
    }
}
