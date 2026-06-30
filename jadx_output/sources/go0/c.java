package go0;

/* loaded from: classes10.dex */
public final class c extends os0.a {
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public int H;
    public ps0.a I;

    /* renamed from: J, reason: collision with root package name */
    public os0.e f273741J;

    public c(int i17, int i18, int i19, int i27, int i28, int i29, int i37, kotlin.jvm.internal.i iVar) {
        super(i17, i18, (i37 & 4) != 0 ? i17 : i19, (i37 & 8) != 0 ? i18 : i27, (i37 & 16) != 0 ? 1 : i28, (i37 & 32) != 0 ? 1 : i29);
        this.H = -1;
        int t17 = rs0.i.f399296a.t("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        this.C = t17;
        this.D = android.opengl.GLES20.glGetAttribLocation(t17, "a_position");
        this.E = android.opengl.GLES20.glGetAttribLocation(t17, "a_texCoord");
        this.F = android.opengl.GLES20.glGetUniformLocation(t17, "texture");
        this.G = android.opengl.GLES20.glGetUniformLocation(t17, "uMatrix");
    }

    @Override // os0.a
    public void f() {
        super.f();
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override // os0.a
    public void n() {
        super.n();
        os0.e eVar = this.f273741J;
        if (eVar != null) {
            eVar.n();
        }
        ps0.a aVar = this.I;
        if (aVar != null) {
            ((go0.w1) aVar).b();
        }
        this.I = null;
        this.f273741J = null;
        android.opengl.GLES20.glDeleteProgram(this.C);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0034  */
    @Override // os0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p() {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: go0.c.p():void");
    }

    @Override // os0.a
    public void r(int i17) {
        this.H = i17;
    }
}
