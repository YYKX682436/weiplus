package ji4;

/* loaded from: classes11.dex */
public class t implements com.tencent.mm.pluginsdk.ui.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f299950d;

    /* renamed from: e, reason: collision with root package name */
    public ji4.s f299951e;

    public t() {
        java.lang.String str = com.tencent.mm.storage.v3.f196273a;
        this.f299950d = new java.lang.String[]{"@status"};
    }

    @Override // com.tencent.mm.pluginsdk.ui.m1
    public com.tencent.mm.pluginsdk.ui.j1 get(java.lang.String str) {
        for (java.lang.String str2 : this.f299950d) {
            if (str.endsWith(str2)) {
                if (this.f299951e == null) {
                    ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
                    com.tencent.mm.pluginsdk.ui.j1 c17 = com.tencent.mm.pluginsdk.ui.u.c();
                    if (c17 instanceof com.tencent.mm.pluginsdk.ui.w) {
                        this.f299951e = new ji4.s(c17);
                    }
                }
                return this.f299951e;
            }
        }
        return null;
    }
}
