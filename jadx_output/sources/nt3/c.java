package nt3;

/* loaded from: classes10.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.f f339752d;

    public c(nt3.f fVar) {
        this.f339752d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        nt3.f fVar = this.f339752d;
        fVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Story.GLThread", "initGL");
        fVar.f339778d = rs0.i.f399296a.m(fVar.f339776b, fVar.f339775a, 0, 0, android.opengl.EGL14.EGL_NO_CONTEXT);
        nt3.f0 f0Var = fVar.f339777c;
        if (f0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Story.StoryImageVideoRender", "initGL");
            android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            nt3.e0 e0Var = f0Var.f339785e;
            e0Var.f339774d = false;
            nt3.b bVar = e0Var.f339772b;
            bVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Story.FadeImageShader", "comipleAndLinkProgram");
            int[] iArr = new int[1];
            int a17 = bVar.a(35633, "attribute vec4 a_position;\nattribute vec2 a_texCoords;\nattribute vec2 a_texBgCoords;\nvarying vec2 v_texCoords;\nvarying vec2 v_texBgCoords;\nuniform mat4 uMVPMatrix; \nvoid main()\n{\n  gl_Position = uMVPMatrix * a_position;\n  v_texCoords = a_texCoords;\n  v_texBgCoords = a_texBgCoords;\n}");
            int a18 = bVar.a(35632, "precision mediump float;\nuniform sampler2D u_Texture;\nuniform sampler2D u_TextureBg;\nvarying vec2 v_texCoords;\nvarying vec2 v_texBgCoords;\nuniform float u_texAlphaRatio;\nuniform vec4 centerPic; // 按top bottom left right来传\nvoid main()\n{\n    vec4 fcolor = vec4(0.0);\n    if (gl_FragCoord.y > centerPic[0] || gl_FragCoord.y < centerPic[1] || \n        gl_FragCoord.x > centerPic[3] || gl_FragCoord.x < centerPic[2]) {\n        // >top <bottom >right <left, 不是中间的图片区域，取背景色\n        fcolor = texture2D(u_TextureBg, v_texBgCoords);\n    } else {\n        fcolor = texture2D(u_Texture, v_texCoords);\n    } \n    fcolor.a *= u_texAlphaRatio;\n    gl_FragColor = fcolor;\n}");
            int glCreateProgram = android.opengl.GLES20.glCreateProgram();
            if (glCreateProgram != 0) {
                android.opengl.GLES20.glAttachShader(glCreateProgram, a17);
                android.opengl.GLES20.glAttachShader(glCreateProgram, a18);
                android.opengl.GLES20.glBindAttribLocation(glCreateProgram, 0, "a_position");
                android.opengl.GLES20.glBindAttribLocation(glCreateProgram, 1, "a_texCoords");
                android.opengl.GLES20.glBindAttribLocation(glCreateProgram, 2, "a_texBgCoords");
                android.opengl.GLES20.glLinkProgram(glCreateProgram);
                android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                if (iArr[0] == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Story.FadeImageShader", "Error linking program:");
                    com.tencent.mars.xlog.Log.e("MicroMsg.Story.FadeImageShader", android.opengl.GLES20.glGetProgramInfoLog(glCreateProgram));
                    android.opengl.GLES20.glDeleteProgram(glCreateProgram);
                } else {
                    bVar.f339742h = android.opengl.GLES20.glGetUniformLocation(glCreateProgram, "uMVPMatrix");
                    bVar.f339743i = android.opengl.GLES20.glGetUniformLocation(glCreateProgram, "u_texAlphaRatio");
                    bVar.f339744j = android.opengl.GLES20.glGetUniformLocation(glCreateProgram, "centerPic");
                    bVar.f339740f = android.opengl.GLES20.glGetUniformLocation(glCreateProgram, "u_Texture");
                    bVar.f339741g = android.opengl.GLES20.glGetUniformLocation(glCreateProgram, "u_TextureBg");
                    bVar.f339708a = glCreateProgram;
                }
            }
            android.opengl.GLES20.glEnable(3042);
            android.opengl.GLES20.glBlendFunc(770, 771);
            ib5.j jVar = e0Var.f339773c;
            if (jVar != null) {
                jVar.destroy();
            }
            e0Var.f339773c = new ib5.j(com.tencent.mm.sdk.platformtools.x2.f193071a);
            f0Var.c();
            int[] iArr2 = new int[1];
            nt3.b0 b0Var = f0Var.f339786f;
            int a19 = b0Var.a(35633, "attribute vec4 a_position;    \nattribute vec2 a_texCoords; \nvarying vec2 v_texCoords; \nuniform mat4 uMVPMatrix; \nvoid main()                  \n{                            \n   gl_Position = uMVPMatrix * a_position;  \n    v_texCoords = a_texCoords; \n}                            \n");
            int a27 = b0Var.a(35632, "precision mediump float;\t\t\t\t\t  \nuniform sampler2D u_Texture; \nvarying vec2 v_texCoords; \nvoid main()                                  \n{                                            \n  vec4 fcolor = texture2D(u_Texture, v_texCoords) ;\n  gl_FragColor = fcolor ;\n}                                            \n");
            int glCreateProgram2 = android.opengl.GLES20.glCreateProgram();
            if (glCreateProgram2 != 0) {
                android.opengl.GLES20.glAttachShader(glCreateProgram2, a19);
                android.opengl.GLES20.glAttachShader(glCreateProgram2, a27);
                android.opengl.GLES20.glBindAttribLocation(glCreateProgram2, 0, "a_position");
                android.opengl.GLES20.glBindAttribLocation(glCreateProgram2, 1, "a_texCoords");
                android.opengl.GLES20.glLinkProgram(glCreateProgram2);
                android.opengl.GLES20.glGetProgramiv(glCreateProgram2, 35714, iArr2, 0);
                if (iArr2[0] == 0) {
                    android.opengl.GLES20.glGetProgramInfoLog(glCreateProgram2);
                    android.opengl.GLES20.glDeleteProgram(glCreateProgram2);
                } else {
                    b0Var.f339750g = android.opengl.GLES20.glGetUniformLocation(glCreateProgram2, "uMVPMatrix");
                    b0Var.f339749f = android.opengl.GLES20.glGetUniformLocation(glCreateProgram2, "u_Texture");
                    b0Var.f339708a = glCreateProgram2;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Story.GLThread", "initGL succ");
    }
}
