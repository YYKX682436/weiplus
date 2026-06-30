package v22;

/* loaded from: classes10.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.z f432864d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v22.z zVar) {
        super(0);
        this.f432864d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zv3.a a17;
        v22.z zVar = this.f432864d;
        int i17 = zVar.f432879j + 1;
        zVar.f432879j = i17;
        d32.j jVar = zVar.f432878i;
        if (jVar == null) {
            kotlin.jvm.internal.o.o("mixPixelBuffer");
            throw null;
        }
        wu3.v1 v1Var = zVar.f432880k;
        if (v1Var == null) {
            kotlin.jvm.internal.o.o("syncMgr");
            throw null;
        }
        java.lang.String str = "after syncMixNextFrame, framePass " + i17 + ", videoPassFrame:" + v1Var.f449815f + ", targetPassFrame:" + v1Var.f449819j + ", emojiPassDuration: " + v1Var.f449817h;
        java.lang.String str2 = v1Var.f449811b;
        com.tencent.mars.xlog.Log.i(str2, str);
        int i18 = i17 - 1;
        if (i18 > 0 && v1Var.f449815f < i18) {
            v1Var.f449815f = i18;
        }
        v1Var.f449823n = v1Var.f449822m * v1Var.f449819j;
        while (v1Var.f449823n >= v1Var.f449817h && (a17 = v1Var.f449810a.a()) != null) {
            long j17 = a17.f476428b;
            if (j17 <= 0) {
                break;
            }
            v1Var.f449817h += (float) j17;
            v1Var.f449816g = a17.f476427a;
        }
        android.graphics.Bitmap bitmap = v1Var.f449816g;
        float f17 = v1Var.f449821l * v1Var.f449815f;
        float f18 = v1Var.f449822m;
        int i19 = v1Var.f449819j;
        boolean z17 = f17 < f18 * ((float) i19);
        if (z17) {
            com.tencent.mars.xlog.Log.i(str2, "syncMixNextFrame, skip frame");
        } else {
            v1Var.f449819j = i19 + 1;
            com.tencent.mars.xlog.Log.i(str2, "syncMixNextFrame pass frame: " + v1Var.f449819j);
        }
        v1Var.f449815f++;
        v22.t tVar = new v22.t(zVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureEGLPixelBuffer", "mixVideoAndEmojiFrame, skip: " + java.lang.Boolean.valueOf(z17));
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (kotlin.jvm.internal.o.b(valueOf, bool)) {
            d32.k kVar = jVar.f226156i;
            if (kVar == null) {
                kotlin.jvm.internal.o.o("renderer");
                throw null;
            }
            kVar.f226166e = bitmap;
            javax.microedition.khronos.opengles.GL10 gl10 = jVar.f226155h;
            if (gl10 == null) {
                kotlin.jvm.internal.o.o("gl");
                throw null;
            }
            kVar.onDrawFrame(gl10);
            tVar.invoke(bool);
        } else {
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
            surfaceTexture.updateTexImage();
            tVar.invoke(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}
