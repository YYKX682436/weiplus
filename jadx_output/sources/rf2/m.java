package rf2;

/* loaded from: classes3.dex */
public final class m implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rf2.q f394804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s71.b f394805b;

    public m(rf2.q qVar, s71.b bVar) {
        this.f394804a = qVar;
        this.f394805b = bVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            rf2.q qVar = this.f394804a;
            df2.ln lnVar = qVar.f394854e;
            r45.f02 f02Var = lnVar.f230685v;
            if (f02Var != null) {
                com.tencent.mm.plugin.finder.live.util.y.d(lnVar, kotlinx.coroutines.q1.f310570c, null, new rf2.l(qVar, this.f394805b, f02Var, null), 2, null);
            } else {
                com.tencent.mars.xlog.Log.e(qVar.f394855f, "post addr but lotteryInfo is empty!");
            }
        }
    }
}
