package mn2;

/* loaded from: classes11.dex */
public final class s implements com.tencent.mm.pluginsdk.ui.m1 {

    /* renamed from: e, reason: collision with root package name */
    public static final mn2.r f330106e = new mn2.r(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f330107f = {"@findermsg", "@finder", "@findermsgstranger", "@findermsgalias"};

    /* renamed from: d, reason: collision with root package name */
    public mn2.q f330108d;

    @Override // com.tencent.mm.pluginsdk.ui.m1
    public com.tencent.mm.pluginsdk.ui.j1 get(java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        if (!f330106e.a(tag)) {
            return null;
        }
        if (this.f330108d == null) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
            com.tencent.mm.pluginsdk.ui.j1 c17 = com.tencent.mm.pluginsdk.ui.u.c();
            if (c17 instanceof com.tencent.mm.pluginsdk.ui.w) {
                this.f330108d = new mn2.q(c17);
            }
        }
        return this.f330108d;
    }
}
