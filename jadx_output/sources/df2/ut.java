package df2;

/* loaded from: classes3.dex */
public final class ut extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.wt f231554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f231555e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.e32 f231556f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut(df2.wt wtVar, r45.h32 h32Var, r45.e32 e32Var) {
        super(0);
        this.f231554d = wtVar;
        this.f231555e = h32Var;
        this.f231556f = e32Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        df2.wt wtVar = this.f231554d;
        if (currentTimeMillis - wtVar.f231710p < 1000) {
            com.tencent.mars.xlog.Log.i("LiveReserveNoticeGuideController", "showBubble: can not double click");
        } else {
            wtVar.f231710p = java.lang.System.currentTimeMillis();
            r45.h32 h32Var = this.f231555e;
            java.lang.String string = h32Var.getString(4);
            if (string == null) {
                string = "";
            }
            wtVar.o7(2, string);
            if (h32Var.getInteger(1) != 0) {
                df2.wt.m7(wtVar, h32Var, 1);
            } else {
                df2.wt.m7(wtVar, h32Var, 2);
            }
            kotlinx.coroutines.r2 r2Var = wtVar.f231712r;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            kotlinx.coroutines.r2 r2Var2 = wtVar.f231713s;
            if (r2Var2 != null && r2Var2.a()) {
                com.tencent.mars.xlog.Log.i("LiveReserveNoticeGuideController", "checkDismissAfterReserve: is delaying");
            } else {
                java.lang.Number valueOf = java.lang.Integer.valueOf(this.f231556f.getInteger(3));
                if (!(valueOf.intValue() > 0)) {
                    valueOf = null;
                }
                if (valueOf == null) {
                    valueOf = 5000L;
                }
                wtVar.f231713s = com.tencent.mm.plugin.finder.live.util.y.o(wtVar, null, null, new df2.qt(valueOf.longValue(), wtVar, null), 3, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
