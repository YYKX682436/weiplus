package z33;

/* loaded from: classes11.dex */
public class i implements com.tencent.mm.pluginsdk.ui.m1 {

    /* renamed from: d, reason: collision with root package name */
    public a43.g f469968d;

    @Override // com.tencent.mm.pluginsdk.ui.m1
    public com.tencent.mm.pluginsdk.ui.j1 get(java.lang.String str) {
        if (!str.endsWith("@gamelifechatroom")) {
            return null;
        }
        if (this.f469968d == null) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
            com.tencent.mm.pluginsdk.ui.j1 c17 = com.tencent.mm.pluginsdk.ui.u.c();
            if (c17 instanceof com.tencent.mm.pluginsdk.ui.w) {
                this.f469968d = new a43.g(((com.tencent.mm.pluginsdk.ui.w) c17).f192033d);
            }
        }
        return this.f469968d;
    }
}
