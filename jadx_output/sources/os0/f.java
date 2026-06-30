package os0;

/* loaded from: classes10.dex */
public class f extends os0.a {
    public final is0.c C;
    public final is0.c D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public final int f348020J;
    public java.nio.ByteBuffer K;
    public java.nio.ByteBuffer L;
    public byte[] M;

    public f(int i17, int i18, int i19, int i27, int i28, int i29) {
        super(i17, i18, i19, i27, i28, i29);
        this.M = new byte[0];
        int t17 = rs0.i.f399296a.t("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D y_texture;\n        uniform sampler2D uv_texture;\n\n        void main () {\n           float r, g, b, y, u, v;\n\n        //We had put the Y values of each pixel to the R,G,B components by GL_LUMINANCE,\n        //that's why we're pulling it from the R component, we could also use G or B\n           y = texture2D(y_texture, v_texCoord).r;\n\n        //We had put the U and V values of each pixel to the A and R,G,B components of the\n        //texture respectively using GL_LUMINANCE_ALPHA. Since U,V bytes are interspread\n        //in the texture, this is probably the fastest way to use them in the shader\n        //GL_LUMINANCE_ALPHA is a luminance/alpha pair, so r correspond to v, and\n        //a correspond to u\n        //NV21 is a VUVU pair\n           u = texture2D(uv_texture, v_texCoord).a;\n           v = texture2D(uv_texture, v_texCoord).r;\n           u = u - 0.5;\n           v = v - 0.5;\n\n        //The numbers are just YUV to RGB conversion constants\n        //https://en.wikipedia.org/wiki/YUV#Y.E2.80.B2UV420sp_.28NV21.29_to_RGB_conversion_.28Android.29\n           r = y + 1.370705 * v;\n           g = y - 0.337633 * u - 0.698001 * v;\n           b = y + 1.732446 * u;\n\n        //We finally set the RGB color of our pixel\n           gl_FragColor = vec4(r, g, b, 1.0);\n        }\n        ");
        this.E = t17;
        if (t17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GLTextureRenderProcYuvToRgb", "checkInit, load program failed!");
        }
        this.G = android.opengl.GLES20.glGetAttribLocation(t17, "a_position");
        this.F = android.opengl.GLES20.glGetAttribLocation(t17, "a_texCoord");
        this.H = android.opengl.GLES20.glGetUniformLocation(t17, "y_texture");
        this.I = android.opengl.GLES20.glGetUniformLocation(t17, "uv_texture");
        this.f348020J = android.opengl.GLES20.glGetUniformLocation(t17, "uMatrix");
        this.C = is0.b.b(true, 5L);
        this.D = is0.b.b(true, 5L);
    }

    @Override // os0.a
    public void n() {
        super.n();
        android.opengl.GLES20.glDeleteProgram(this.E);
        this.C.close();
        this.D.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r1.capacity() != ((r13.f347992a * r13.f347993b) / 2)) goto L22;
     */
    @Override // os0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p() {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os0.f.p():void");
    }

    @Override // os0.a
    public void q(byte[] frame) {
        kotlin.jvm.internal.o.g(frame, "frame");
        this.M = frame;
    }
}
