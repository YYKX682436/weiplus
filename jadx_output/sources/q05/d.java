package q05;

/* loaded from: classes14.dex */
public class d {

    /* renamed from: t, reason: collision with root package name */
    public static final float[] f359454t = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: u, reason: collision with root package name */
    public static final float[] f359455u = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: v, reason: collision with root package name */
    public static final float[] f359456v = {8.0f, 0.25f, 0.4f, 0.35f, 0.25f, 20.0f, 4.0f, 0.25f, 0.35f, 0.35f, 0.3f, 20.0f};

    /* renamed from: w, reason: collision with root package name */
    public static final float[] f359457w = {4.0f, 0.25f, 0.5f, 0.5f, 0.0f, 25.0f, 4.0f, 0.25f, 0.5f, 0.5f, 0.0f, 30.0f};

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.FloatBuffer f359458a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.FloatBuffer f359459b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f359460c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f359461d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f359462e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f359463f;

    /* renamed from: g, reason: collision with root package name */
    public int f359464g;

    /* renamed from: h, reason: collision with root package name */
    public int f359465h;

    /* renamed from: i, reason: collision with root package name */
    public int f359466i;

    /* renamed from: j, reason: collision with root package name */
    public int f359467j;

    /* renamed from: k, reason: collision with root package name */
    public int f359468k;

    /* renamed from: l, reason: collision with root package name */
    public int f359469l;

    /* renamed from: m, reason: collision with root package name */
    public int f359470m;

    /* renamed from: n, reason: collision with root package name */
    public int f359471n;

    /* renamed from: o, reason: collision with root package name */
    public int f359472o;

    /* renamed from: p, reason: collision with root package name */
    public int f359473p;

    /* renamed from: q, reason: collision with root package name */
    public int f359474q;

    /* renamed from: r, reason: collision with root package name */
    public int f359475r;

    /* renamed from: s, reason: collision with root package name */
    public final int f359476s;

    public d() {
        this.f359460c = new float[16];
        float[] fArr = new float[16];
        this.f359461d = fArr;
        this.f359464g = 0;
        this.f359467j = 0;
        this.f359468k = 0;
        this.f359469l = 0;
        this.f359470m = 0;
        this.f359471n = 0;
        this.f359472o = 0;
        this.f359473p = 0;
        this.f359474q = 0;
        this.f359475r = 0;
        this.f359476s = 0;
        this.f359476s = 0;
        this.f359462e = r3;
        int[] iArr = {0};
        this.f359463f = r3;
        int[] iArr2 = {0};
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(48).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f359458a = asFloatBuffer;
        asFloatBuffer.put(f359454t).position(0);
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f359459b = asFloatBuffer2;
        asFloatBuffer2.put(f359455u).position(0);
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (!c() || a("USM3FusionFilter") != 0) {
            throw new java.lang.RuntimeException("USM3FusionFilter create failed");
        }
    }

    public final int a(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError == 0) {
            return 0;
        }
        com.tencent.mars.xlog.Log.i("SharpenFilter.USM3Fusion", str + ": EGL error: 0x" + java.lang.Integer.toHexString(glGetError));
        return glGetError;
    }

    public int b(java.lang.String str, int i17) {
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        android.opengl.GLES20.glGetShaderInfoLog(glCreateShader);
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public boolean c() {
        int b17 = b("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 position;\nattribute vec4 texCoord;\nvarying vec2 coordinate;\nvoid main()\n{\n   gl_Position = uMVPMatrix * position;\n   coordinate = (uSTMatrix * texCoord).xy;\n}\n", 35633);
        if (b17 == 0) {
            return false;
        }
        int i17 = this.f359476s;
        int b18 = i17 == 0 ? b("precision mediump float;\nvarying highp vec2 coordinate;\nuniform float paras[6];\nuniform sampler2D inputImageTexture;\nuniform sampler2D blurredImageTexture1;\nuniform sampler2D blurredImageTexture2;\nuniform sampler2D blurredImageTexture3;\nvec3 YUV2RGB(vec3 yuv)\n{\n  yuv.x = yuv.x - 0.00627;\n  yuv.y = yuv.y - 0.50196;\n  yuv.z = yuv.z - 0.50196;\n  vec3 rgb = vec3(0.0);\n  rgb.r = yuv.x * 1.164 +                 yuv.z * 1.596;\n  rgb.g = yuv.x * 1.164 + yuv.y * -0.392 + yuv.z * -0.813;\n  rgb.b = yuv.x * 1.164 + yuv.y * 2.017;\n  return rgb;\n}\nvoid main()\n{\n    vec3 orgColor = texture2D(inputImageTexture, coordinate).rgb;\n\n    float y0 = orgColor.r;\n\n    float y_lowpass1 = texture2D(blurredImageTexture1, coordinate).r;\n\n    float y_lowpass2 = texture2D(blurredImageTexture2, coordinate).r;\n\n    float y_lowpass3 = texture2D(blurredImageTexture3, coordinate).r;\n\n    float para1 = paras[0];\n    float para3 = paras[5];\n    float y_residue = abs(y0-y_lowpass1);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue;  //24\n    float ay_residue = y_residue*255.0;\n    float resw1 = para3/((1.0+exp(-(ay_residue-para1)))*(ay_residue+2.0))*y_residue;\n\n    y_residue = abs(y0-y_lowpass2);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue; //24\n    ay_residue = y_residue*255.0;\n    float resw2 = para3/((1.0+exp(-(ay_residue-para1)))*(ay_residue+2.0))*y_residue;\n\n    y_residue = abs(y0-y_lowpass3);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue; //24\n    ay_residue = y_residue*255.0;\n    float resw3 = para3/((1.0+exp(-(ay_residue-para1)))*(ay_residue+2.0))*y_residue;\n\n    float resw;\n   // if ((y0-y_lowpass1)*(y0-y_lowpass2)<0.0 || (y0-y_lowpass1)*(y0-y_lowpass3)<0.0) resw = 0.0; \n    resw = y0-y_lowpass1>=0.0?pow(resw1, paras[2])*pow(resw2, paras[3])*pow(resw3, paras[4]):-pow(resw1, paras[2])*pow(resw2, paras[3])*pow(resw3, paras[4]);\n\n    float cvalue = clamp(y0+resw, 0.0, 1.0);\n\n    float para2 = paras[1];\n    float val_weight = cvalue <= (1.0 - para2)? 1.0 : (resw<0.0?1.0:pow((1.0-cvalue)/para2,3.0));\n    float yres = val_weight*cvalue + (1.0-val_weight)*y0;\n\n    vec3 rgbColor = YUV2RGB(vec3(yres, orgColor.gb));\n    gl_FragColor = vec4(rgbColor, 1.0);\n    // if (coordinate.x<0.2 && coordinate.y<0.2) gl_FragColor = vec4(vec3(paras[4]*2.0), 1.0);\n}\n", 35632) : i17 == 1 ? b("precision mediump float;\nvarying highp vec2 coordinate;\nuniform sampler2D inputImageTexture;\nuniform sampler2D blurredImageTexture1;\nuniform sampler2D blurredImageTexture2;\nuniform sampler2D blurredImageTexture3;\nvec3 YUV2RGB(vec3 yuv)\n{\n  yuv.x = yuv.x - 0.00627;\n  yuv.y = yuv.y - 0.50196;\n  yuv.z = yuv.z - 0.50196;\n  vec3 rgb = vec3(0.0);\n  rgb.r = yuv.x * 1.164 +                 yuv.z * 1.596;\n  rgb.g = yuv.x * 1.164 + yuv.y * -0.392 + yuv.z * -0.813;\n  rgb.b = yuv.x * 1.164 + yuv.y * 2.017;\n  return rgb;\n}\nvoid main()\n{\n    vec3 orgColor = texture2D(inputImageTexture, coordinate).rgb;\n\n    float y0 = orgColor.r;\n\n    float y_lowpass1 = texture2D(blurredImageTexture1, coordinate).r;\n\n    float y_lowpass2 = texture2D(blurredImageTexture2, coordinate).r;\n\n    float y_lowpass3 = texture2D(blurredImageTexture3, coordinate).r;\n\n    float y_residue = abs(y0-y_lowpass1);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue;  //24\n    float ay_residue = y_residue*255.0;\n    float resw1 = 20.0/((1.0+exp(-(ay_residue-4.0)))*(ay_residue+4.0))*y_residue;\n\n    y_residue = abs(y0-y_lowpass2);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue; //24\n    ay_residue = y_residue*255.0;\n    float resw2 = 20.0/((1.0+exp(-(ay_residue-4.0)))*(ay_residue+4.0))*y_residue;\n\n    y_residue = abs(y0-y_lowpass3);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue; //24\n    ay_residue = y_residue*255.0;\n    float resw3 = 20.0/((1.0+exp(-(ay_residue-4.0)))*(ay_residue+4.0))*y_residue;\n\n    float resw;\n   // if ((y0-y_lowpass1)*(y0-y_lowpass2)<0.0 || (y0-y_lowpass1)*(y0-y_lowpass3)<0.0) resw = 0.0; \n    resw = y0-y_lowpass1>=0.0?pow(resw1, 0.4)*pow(resw2, 0.3)*pow(resw3, 0.3):-pow(resw1, 0.4)*pow(resw2, 0.3)*pow(resw3, 0.3);\n\n    float cvalue = clamp(y0+resw, 0.0, 1.0);\n\n    float val_weight = 1.0; //cvalue <= (1.0 - para2)? 1.0 : (resw<0.0?1.0:pow((1.0-cvalue)/para2,3.0));\n    float yres = val_weight*cvalue + (1.0-val_weight)*y0;\n\n    vec3 rgbColor = YUV2RGB(vec3(yres, orgColor.gb));\n    gl_FragColor = vec4(rgbColor, 1.0);\n    // if (coordinate.x<0.2 && coordinate.y<0.2) gl_FragColor = vec4(1.0);\n}\n", 35632) : (i17 == 2 || i17 == 4) ? b("precision mediump float;\nvarying highp vec2 coordinate;\nuniform float paras[6];\nuniform sampler2D inputImageTexture;\nuniform sampler2D blurredImageTexture1;\nuniform sampler2D blurredImageTexture2;\nuniform sampler2D blurredImageTexture3;\nvec3 YUV2RGB(vec3 yuv)\n{\n  yuv.x = yuv.x - 0.06275;\n  yuv.y = yuv.y - 0.50196;\n  yuv.z = yuv.z - 0.50196;\n  vec3 rgb = vec3(0.0);\n  rgb.r = yuv.x * 1.164 +                 yuv.z * 1.596;\n  rgb.g = yuv.x * 1.164 + yuv.y * -0.392 + yuv.z * -0.813;\n  rgb.b = yuv.x * 1.164 + yuv.y * 2.017;\n  return rgb;\n}\nvoid main()\n{\n    vec3 orgColor = texture2D(inputImageTexture, coordinate).rgb;\n\n    float y0 = orgColor.r;\n\n    float y_lowpass1 = texture2D(blurredImageTexture1, coordinate).r;\n\n    float y_lowpass2 = texture2D(blurredImageTexture2, coordinate).r;\n\n    float para1 = paras[0];\n    float para3 = paras[5];\n    float y_residue = abs(y0-y_lowpass1);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue;  //24\n    float ay_residue = y_residue*255.0;\n    float resw1 = para3/((1.0+exp(-(ay_residue-para1)))*(ay_residue+2.0))*y_residue;\n\n    y_residue = abs(y0-y_lowpass2);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue; //24\n    ay_residue = y_residue*255.0;\n    float resw2 = para3/((1.0+exp(-(ay_residue-para1)))*(ay_residue+2.0))*y_residue;\n\n    float resw;\n    resw = y0-y_lowpass1>=0.0?pow(resw1, paras[2])*pow(resw2, paras[3]):-pow(resw1, paras[2])*pow(resw2, paras[3]);\n\n    float cvalue = clamp(y0+resw, 0.0, 1.0);\n\n    float para2 = paras[1];\n    float val_weight = cvalue <= (1.0 - para2)? 1.0 : (resw<0.0?1.0:pow((1.0-cvalue)/para2,3.0));\n    float yres = val_weight*cvalue + (1.0-val_weight)*y0;\n\n    vec3 rgbColor = YUV2RGB(vec3(yres, orgColor.gb));\n    gl_FragColor = vec4(rgbColor, 1.0);\n    // if (coordinate.x<0.2 && coordinate.y<0.2) gl_FragColor = vec4(vec3(paras[4]*2.0), 1.0);\n}\n", 35632) : i17 == 3 ? b("precision mediump float;\nvarying highp vec2 coordinate;\nuniform float paras[6];\nuniform sampler2D inputImageTexture;\nuniform sampler2D blurredImageTexture1;\nuniform sampler2D blurredImageTexture2;\nuniform sampler2D blurredImageTexture3;\nvoid main()\n{\n    float y0 = texture2D(inputImageTexture, coordinate).r;\n\n    float y_lowpass1 = texture2D(blurredImageTexture1, coordinate).r;\n\n    float y_lowpass2 = texture2D(blurredImageTexture2, coordinate).r;\n\n    float para1 = paras[0];\n    float para3 = paras[5];\n    float y_residue = abs(y0-y_lowpass1);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue;  //24\n    float ay_residue = y_residue*255.0;\n    float resw1 = para3/((1.0+exp(-(ay_residue-para1)))*(ay_residue+2.0))*y_residue;\n\n    y_residue = abs(y0-y_lowpass2);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue; //24\n    ay_residue = y_residue*255.0;\n    float resw2 = para3/((1.0+exp(-(ay_residue-para1)))*(ay_residue+2.0))*y_residue;\n\n    float resw;\n    resw = y0-y_lowpass1>=0.0?pow(resw1, paras[2])*pow(resw2, paras[3]):-pow(resw1, paras[2])*pow(resw2, paras[3]);\n\n    float cvalue = clamp(y0+resw, 0.0, 1.0);\n\n    float para2 = paras[1];\n    float val_weight = cvalue <= (1.0 - para2)? 1.0 : (resw<0.0?1.0:pow((1.0-cvalue)/para2,3.0));\n    float yres = val_weight*cvalue + (1.0-val_weight)*y0;\n\n    gl_FragColor = vec4(yres, vec3(1.0));\n    // if (coordinate.x<0.2 && coordinate.y<0.2) gl_FragColor = vec4(vec3(paras[4]*2.0), 1.0);\n}\n", 35632) : b("precision mediump float;\nvarying highp vec2 coordinate;\nuniform float paras[6];\nuniform sampler2D inputImageTexture;\nuniform sampler2D blurredImageTexture1;\nuniform sampler2D blurredImageTexture2;\nuniform sampler2D blurredImageTexture3;\nvec3 YUV2RGB(vec3 yuv)\n{\n  yuv.x = yuv.x - 0.00627;\n  yuv.y = yuv.y - 0.50196;\n  yuv.z = yuv.z - 0.50196;\n  vec3 rgb = vec3(0.0);\n  rgb.r = yuv.x * 1.164 +                 yuv.z * 1.596;\n  rgb.g = yuv.x * 1.164 + yuv.y * -0.392 + yuv.z * -0.813;\n  rgb.b = yuv.x * 1.164 + yuv.y * 2.017;\n  return rgb;\n}\nvoid main()\n{\n    vec3 orgColor = texture2D(inputImageTexture, coordinate).rgb;\n\n    float y0 = orgColor.r;\n\n    float y_lowpass1 = texture2D(blurredImageTexture1, coordinate).r;\n\n    float y_lowpass2 = texture2D(blurredImageTexture2, coordinate).r;\n\n    float y_lowpass3 = texture2D(blurredImageTexture3, coordinate).r;\n\n    float para1 = paras[0];\n    float para3 = paras[5];\n    float y_residue = abs(y0-y_lowpass1);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue;  //24\n    float ay_residue = y_residue*255.0;\n    float resw1 = para3/((1.0+exp(-(ay_residue-para1)))*(ay_residue+2.0))*y_residue;\n\n    y_residue = abs(y0-y_lowpass2);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue; //24\n    ay_residue = y_residue*255.0;\n    float resw2 = para3/((1.0+exp(-(ay_residue-para1)))*(ay_residue+2.0))*y_residue;\n\n    y_residue = abs(y0-y_lowpass3);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue; //24\n    ay_residue = y_residue*255.0;\n    float resw3 = para3/((1.0+exp(-(ay_residue-para1)))*(ay_residue+2.0))*y_residue;\n\n    float resw;\n   // if ((y0-y_lowpass1)*(y0-y_lowpass2)<0.0 || (y0-y_lowpass1)*(y0-y_lowpass3)<0.0) resw = 0.0; \n    resw = y0-y_lowpass1>=0.0?pow(resw1, paras[2])*pow(resw2, paras[3])*pow(resw3, paras[4]):-pow(resw1, paras[2])*pow(resw2, paras[3])*pow(resw3, paras[4]);\n\n    float cvalue = clamp(y0+resw, 0.0, 1.0);\n\n    float para2 = paras[1];\n    float val_weight = cvalue <= (1.0 - para2)? 1.0 : (resw<0.0?1.0:pow((1.0-cvalue)/para2,3.0));\n    float yres = val_weight*cvalue + (1.0-val_weight)*y0;\n\n    vec3 rgbColor = YUV2RGB(vec3(yres, orgColor.gb));\n    gl_FragColor = vec4(rgbColor, 1.0);\n    // if (coordinate.x<0.2 && coordinate.y<0.2) gl_FragColor = vec4(vec3(paras[4]*2.0), 1.0);\n}\n", 35632);
        if (b18 == 0) {
            return false;
        }
        this.f359464g = android.opengl.GLES20.glCreateProgram();
        if (a("glCreateProgram") != 0) {
            return false;
        }
        android.opengl.GLES20.glAttachShader(this.f359464g, b17);
        if (a("glAttachShader") != 0) {
            return false;
        }
        android.opengl.GLES20.glAttachShader(this.f359464g, b18);
        if (a("glAttachShader") != 0) {
            return false;
        }
        android.opengl.GLES20.glLinkProgram(this.f359464g);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetProgramiv(this.f359464g, 35714, iArr, 0);
        if (iArr[0] != 1) {
            android.opengl.GLES20.glGetProgramInfoLog(this.f359464g);
            android.opengl.GLES20.glDeleteProgram(this.f359464g);
            this.f359464g = 0;
            return false;
        }
        android.opengl.GLES20.glUseProgram(this.f359464g);
        int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.f359464g, "position");
        this.f359469l = glGetAttribLocation;
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(this.f359464g, "texCoord");
        this.f359470m = glGetAttribLocation2;
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        this.f359471n = android.opengl.GLES20.glGetUniformLocation(this.f359464g, "inputImageTexture");
        this.f359472o = android.opengl.GLES20.glGetUniformLocation(this.f359464g, "blurredImageTexture1");
        this.f359473p = android.opengl.GLES20.glGetUniformLocation(this.f359464g, "blurredImageTexture2");
        this.f359474q = android.opengl.GLES20.glGetUniformLocation(this.f359464g, "blurredImageTexture3");
        this.f359475r = android.opengl.GLES20.glGetUniformLocation(this.f359464g, "paras");
        this.f359465h = android.opengl.GLES20.glGetUniformLocation(this.f359464g, "uMVPMatrix");
        int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.f359464g, "uSTMatrix");
        this.f359466i = glGetUniformLocation;
        return (this.f359469l == -1 || this.f359470m == -1 || this.f359471n == -1 || this.f359465h == -1 || glGetUniformLocation == -1 || this.f359472o == -1 || this.f359473p == -1 || ((i17 == 0 || i17 == 1) && this.f359474q == -1) || (i17 != 1 && this.f359475r == -1)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x019a  */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q05.d.d(int, int, int, int, int, int, int, int):int");
    }

    public d(int i17) {
        this.f359460c = new float[16];
        float[] fArr = new float[16];
        this.f359461d = fArr;
        this.f359464g = 0;
        this.f359467j = 0;
        this.f359468k = 0;
        this.f359469l = 0;
        this.f359470m = 0;
        this.f359471n = 0;
        this.f359472o = 0;
        this.f359473p = 0;
        this.f359474q = 0;
        this.f359475r = 0;
        this.f359476s = 0;
        this.f359476s = i17;
        this.f359462e = r2;
        int[] iArr = {0};
        this.f359463f = r2;
        int[] iArr2 = {0};
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(48).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f359458a = asFloatBuffer;
        asFloatBuffer.put(f359454t).position(0);
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f359459b = asFloatBuffer2;
        asFloatBuffer2.put(f359455u).position(0);
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (!c() || a("USM3FusionFilter") != 0) {
            throw new java.lang.RuntimeException("USM3FusionFilter create failed");
        }
    }
}
