package nu0;

/* loaded from: classes5.dex */
public final class x implements com.tencent.maas.imagestudio.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.imagestudio.g f340132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f340133b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f340134c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f340135d;

    public x(com.tencent.maas.imagestudio.g gVar, int i17, int i18, nu0.q0 q0Var) {
        this.f340132a = gVar;
        this.f340133b = i17;
        this.f340134c = i18;
        this.f340135d = q0Var;
    }

    @Override // com.tencent.maas.imagestudio.g
    public final void a(java.lang.String[] strArr, java.lang.String str) {
        com.tencent.maas.imagestudio.MJImageSession mJImageSession;
        com.tencent.maas.imagestudio.MJImageScene[] imageScenes;
        com.tencent.maas.imagestudio.MJImageScene[] imageScenes2;
        this.f340132a.a(strArr, str);
        if (!(str == null || str.length() == 0)) {
            return;
        }
        int i17 = this.f340134c;
        int i18 = this.f340133b;
        int i19 = (i17 + i18) - 1;
        if (i18 > i19) {
            return;
        }
        while (true) {
            nu0.q0 q0Var = this.f340135d;
            com.tencent.maas.imagestudio.MJImageSession mJImageSession2 = q0Var.f340075r;
            com.tencent.maas.imagestudio.MJImageScene mJImageScene = (!(i18 >= 0 && i18 < ((mJImageSession2 == null || (imageScenes2 = mJImageSession2.getImageScenes()) == null) ? 0 : imageScenes2.length)) || (mJImageSession = q0Var.f340075r) == null || (imageScenes = mJImageSession.getImageScenes()) == null) ? null : imageScenes[i18];
            if (mJImageScene != null) {
                q0Var.g7(i18, mJImageScene, new nu0.w(q0Var, i18, i19));
            }
            if (i18 == i19) {
                return;
            } else {
                i18++;
            }
        }
    }
}
