package yu;

/* loaded from: classes3.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f465769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f465770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.aw2 f465771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f465772g;

    public l(java.lang.String str, java.lang.String str2, r45.aw2 aw2Var, yz5.l lVar) {
        this.f465769d = str;
        this.f465770e = str2;
        this.f465771f = aw2Var;
        this.f465772g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f465769d, true);
        int i17 = (n17 == null || !n17.k2()) ? 0 : 2;
        s40.a1 a1Var = (s40.a1) i95.n0.c(s40.a1.class);
        yu.k kVar = new yu.k(this.f465771f, this.f465772g);
        ((com.tencent.mm.feature.finder.live.z5) a1Var).getClass();
        java.lang.String anchorUsername = this.f465770e;
        kotlin.jvm.internal.o.g(anchorUsername, "anchorUsername");
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new com.tencent.mm.feature.finder.live.s5(kVar, anchorUsername, i17, null), 3, null);
    }
}
