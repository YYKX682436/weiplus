package os0;

/* loaded from: classes10.dex */
public class d extends os0.a {
    public final is0.c C;
    public final is0.c D;
    public final is0.c E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public final int f348019J;
    public final int K;
    public final int L;
    public java.nio.ByteBuffer M;
    public java.nio.ByteBuffer N;
    public java.nio.ByteBuffer O;
    public byte[] P;
    public os0.e Q;
    public ps0.a R;

    public d(int i17, int i18, int i19, int i27, int i28, int i29, int i37, kotlin.jvm.internal.i iVar) {
        super(i17, i18, (i37 & 4) != 0 ? i17 : i19, (i37 & 8) != 0 ? i18 : i27, (i37 & 16) != 0 ? 1 : i28, (i37 & 32) != 0 ? 1 : i29);
        this.P = new byte[0];
        int t17 = rs0.i.f399296a.t("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D y_texture;\n        uniform sampler2D u_texture;\n        uniform sampler2D v_texture;\n\n        void main () {\n           float r, g, b, y, u, v;\n\n        //We had put the Y values of each pixel to the R,G,B components by GL_LUMINANCE,\n        //that's why we're pulling it from the R component, we could also use G or B\n           y = texture2D(y_texture, v_texCoord).r;\n\n        //We had put the U and V values of each pixel to the A and R,G,B components of the\n        //texture respectively using GL_LUMINANCE_ALPHA. Since U,V bytes are interspread\n        //in the texture, this is probably the fastest way to use them in the shader\n        //GL_LUMINANCE_ALPHA is a luminance/alpha pair, so r correspond to v, and\n        //a correspond to u\n        //NV21 is a VUVU pair\n           v = texture2D(v_texture, v_texCoord).r;\n           u = texture2D(u_texture, v_texCoord).r;\n           u = u - 0.5;\n           v = v - 0.5;\n\n        //The numbers are just YUV to RGB conversion constants\n        //https://en.wikipedia.org/wiki/YUV#Y.E2.80.B2UV420sp_.28NV21.29_to_RGB_conversion_.28Android.29\n           r = y + 1.370705 * v;\n           g = y - 0.337633 * u - 0.698001 * v;\n           b = y + 1.732446 * u;\n\n        //We finally set the RGB color of our pixel\n           gl_FragColor = vec4(r, g, b, 1.0);\n        }\n        ");
        this.F = t17;
        if (t17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GLTextureRenderProcI420ToRgb", "checkInit, load program failed!");
        }
        this.H = android.opengl.GLES20.glGetAttribLocation(t17, "a_position");
        this.G = android.opengl.GLES20.glGetAttribLocation(t17, "a_texCoord");
        this.I = android.opengl.GLES20.glGetUniformLocation(t17, "y_texture");
        this.f348019J = android.opengl.GLES20.glGetUniformLocation(t17, "u_texture");
        this.K = android.opengl.GLES20.glGetUniformLocation(t17, "v_texture");
        this.L = android.opengl.GLES20.glGetUniformLocation(t17, "uMatrix");
        this.C = is0.b.b(true, 5L);
        this.D = is0.b.b(true, 5L);
        this.E = is0.b.b(true, 5L);
    }

    @Override // os0.a
    public void f() {
        super.f();
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override // os0.a
    public void n() {
        super.n();
        this.C.close();
        this.D.close();
        os0.e eVar = this.Q;
        if (eVar != null) {
            eVar.n();
        }
        ps0.a aVar = this.R;
        if (aVar != null) {
            ((go0.w1) aVar).b();
        }
        this.R = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r3 != false) goto L48;
     */
    @Override // os0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p() {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os0.d.p():void");
    }

    @Override // os0.a
    public void q(byte[] frame) {
        kotlin.jvm.internal.o.g(frame, "frame");
        this.P = frame;
    }
}
