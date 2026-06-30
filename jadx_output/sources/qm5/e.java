package qm5;

/* loaded from: classes14.dex */
public class e extends qm5.h {

    /* renamed from: t, reason: collision with root package name */
    public int f364809t;

    public e() {
        super("varying mediump vec2 textureCoordinate;\nvarying mediump vec2 textureCoordinate2;\nvarying mediump vec2 textureCoordinate3;\n \nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nuniform sampler2D inputImageTexture3;\nuniform mediump int srfControl;\nuniform mediump int srfSwitch;\nvoid main()\n{\nmediump vec4 motionMask = texture2D(inputImageTexture3, textureCoordinate3);\nmediump vec4 curFrame = texture2D(inputImageTexture, textureCoordinate);\nmediump vec4 preFrame = texture2D(inputImageTexture2,textureCoordinate2);\nmediump vec4 smoothFrame;\nif(srfSwitch == 1){\ngl_FragColor = curFrame;\n} else {\nsmoothFrame = preFrame * (1.0 - motionMask.r) + curFrame * motionMask.r;\ngl_FragColor = smoothFrame;\n}\n}\n");
    }

    @Override // qm5.h, qm5.j, qm5.c
    public void e() {
        super.e();
        int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.f364795d, "srfSwitch");
        this.f364809t = glGetUniformLocation;
        g(new qm5.a(this, glGetUniformLocation, 1));
    }
}
