package pn4;

/* loaded from: classes4.dex */
public class d2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn4.e2 f357075d;

    public d2(pn4.e2 e2Var) {
        this.f357075d = e2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        pn4.e2 e2Var = this.f357075d;
        if (e2Var.f357095e) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkingTranslate", "this work is time out, index: %s", java.lang.Integer.valueOf(e2Var.f357098h));
            e2Var.f357096f = null;
            e2Var.f357095e = false;
            ((pn4.q1) e2Var.f357097g).b(e2Var.f357098h, 1, -1, null, e2Var.f357094d, null);
        }
        return false;
    }
}
