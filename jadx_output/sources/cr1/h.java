package cr1;

/* loaded from: classes11.dex */
public final class h implements com.tencent.mm.pluginsdk.ui.m1 {

    /* renamed from: d, reason: collision with root package name */
    public cr1.g f221843d;

    public final com.tencent.mm.pluginsdk.ui.j1 b() {
        if (this.f221843d == null) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
            com.tencent.mm.pluginsdk.ui.j1 c17 = com.tencent.mm.pluginsdk.ui.u.c();
            if (c17 instanceof com.tencent.mm.pluginsdk.ui.w) {
                this.f221843d = new cr1.g(c17);
            }
        }
        return this.f221843d;
    }

    @Override // com.tencent.mm.pluginsdk.ui.m1
    public com.tencent.mm.pluginsdk.ui.j1 get(java.lang.String str) {
        if (str != null && r26.i0.n(str, "@bizfansmsg", false)) {
            return b();
        }
        if (str != null && r26.i0.n(str, "@picfansmsg", false)) {
            return b();
        }
        return null;
    }
}
