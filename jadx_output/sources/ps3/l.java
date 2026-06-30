package ps3;

/* loaded from: classes11.dex */
public final class l implements ps3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f358099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ps3.m f358100b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f358101c;

    public l(java.lang.String str, ps3.m mVar, long j17) {
        this.f358099a = str;
        this.f358100b = mVar;
        this.f358101c = j17;
    }

    @Override // ps3.d
    public void a(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        ps3.m mVar = this.f358100b;
        if (z17) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (n17 == null || ((int) n17.E2) == 0) {
                com.tencent.mm.storage.z3 a17 = ps3.m.a(mVar, com.tencent.mm.storage.e9.f(this.f358099a));
                if (!(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().i0(a17) > 0)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.RadarAddContact", "canAddContact fail, insert fail");
                    z17 = false;
                }
                n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(a17.d1(), true);
            }
            c01.e2.m0(n17);
            ps3.m.b(mVar, str, 1);
        }
        mVar.f358108m.post(new ps3.k(mVar, z17, str2, str, this.f358101c));
    }
}
