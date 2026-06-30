package ir4;

/* loaded from: classes11.dex */
public final class l implements com.tencent.mm.pluginsdk.ui.m1 {

    /* renamed from: d, reason: collision with root package name */
    public ir4.k f294275d;

    @Override // com.tencent.mm.pluginsdk.ui.m1
    public com.tencent.mm.pluginsdk.ui.j1 get(java.lang.String str) {
        if (!(str != null && r26.i0.n(str, "@zhugeprivate", false))) {
            if (!(str != null && r26.i0.n(str, "@zhugepublic", false))) {
                return null;
            }
        }
        if (this.f294275d == null) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
            com.tencent.mm.pluginsdk.ui.j1 c17 = com.tencent.mm.pluginsdk.ui.u.c();
            if (c17 instanceof com.tencent.mm.pluginsdk.ui.w) {
                this.f294275d = new ir4.k(c17);
            }
        }
        return this.f294275d;
    }
}
