package so4;

/* loaded from: classes10.dex */
public final class e implements wm5.f {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f410773a = "";

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.h1 f410774b;

    public e(com.tencent.mm.plugin.vlog.model.h1 h1Var) {
        this.f410774b = h1Var;
    }

    @Override // wm5.f
    public void a(long j17) {
        java.lang.String str;
        so4.g gVar = so4.g.f410776a;
        so4.a aVar = so4.g.f410780e;
        if ((aVar != null ? aVar.f410766a : null) != null) {
            com.tencent.mm.plugin.vlog.model.i1 c17 = com.tencent.mm.plugin.vlog.model.x.c(this.f410774b, j17);
            if (kotlin.jvm.internal.o.b(c17 != null ? c17.f175616a : null, this.f410773a)) {
                return;
            }
            int a17 = gVar.a(c17 != null ? c17.f175616a : null);
            if (((java.util.ArrayList) so4.g.f410784i).contains(java.lang.Integer.valueOf(a17))) {
                gVar.g(a17);
            }
            if (c17 == null || (str = c17.f175616a) == null) {
                str = "";
            }
            this.f410773a = str;
        }
    }

    @Override // wm5.f
    public void b() {
    }
}
