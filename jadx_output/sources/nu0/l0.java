package nu0;

/* loaded from: classes5.dex */
public final class l0 implements com.tencent.maas.imagestudio.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f340004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f340005b;

    public l0(nu0.q0 q0Var, kotlinx.coroutines.q qVar) {
        this.f340004a = q0Var;
        this.f340005b = qVar;
    }

    @Override // com.tencent.maas.imagestudio.h
    public final void a(java.lang.String str) {
        com.tencent.maas.imagestudio.MJImageScene[] imageScenes;
        com.tencent.maas.imagestudio.MJImageScene[] imageScenes2;
        int i17 = 0;
        if (!(str == null || str.length() == 0)) {
            kotlinx.coroutines.q qVar = this.f340005b;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl("Startup failed: " + str));
            return;
        }
        com.tencent.maas.imagestudio.MJImageSession mJImageSession = this.f340004a.f340075r;
        int length = (mJImageSession == null || (imageScenes2 = mJImageSession.getImageScenes()) == null) ? 0 : imageScenes2.length;
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        com.tencent.maas.imagestudio.MJImageSession mJImageSession2 = this.f340004a.f340075r;
        if (mJImageSession2 != null && (imageScenes = mJImageSession2.getImageScenes()) != null) {
            nu0.q0 q0Var = this.f340004a;
            kotlinx.coroutines.q qVar2 = this.f340005b;
            int length2 = imageScenes.length;
            int i18 = 0;
            while (i17 < length2) {
                com.tencent.maas.imagestudio.MJImageScene mJImageScene = imageScenes[i17];
                kotlin.jvm.internal.o.d(mJImageScene);
                q0Var.g7(i18, mJImageScene, new nu0.k0(q0Var, f0Var, length, qVar2));
                i17++;
                i18++;
            }
        }
        if (length == 0) {
            ((kotlinx.coroutines.r) this.f340005b).resumeWith(kotlin.Result.m521constructorimpl(""));
            nu0.q0.W6(this.f340004a);
        }
    }
}
