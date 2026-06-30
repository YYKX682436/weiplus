package m50;

/* loaded from: classes.dex */
public final class c implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m50.x f323474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f323475b;

    public c(m50.x xVar, java.util.List list) {
        this.f323474a = xVar;
        this.f323475b = list;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String str;
        java.util.ArrayList arrayList;
        wi5.n0 n0Var;
        m50.x xVar = this.f323474a;
        j75.f Q6 = xVar.Q6();
        boolean z17 = (Q6 == null || (n0Var = (wi5.n0) Q6.getState()) == null || !n0Var.G) ? false : true;
        java.util.List<java.lang.String> list = this.f323475b;
        if (!z17) {
            j75.f Q62 = xVar.Q6();
            if (Q62 != null) {
                Q62.B3(new xi5.g(list, intent, i17));
                return;
            }
            return;
        }
        if (i17 == -1) {
            if (intent == null || (str = intent.getStringExtra("Retr_ForwardExtraText")) == null) {
                str = "";
            }
            xVar.f323514f = !r26.n0.N(str);
            if (xVar.U6()) {
                for (java.lang.String str2 : list) {
                    if (!r26.n0.N(str2)) {
                        j75.f Q63 = xVar.Q6();
                        if (Q63 != null) {
                            Q63.B3(new xi5.a(str2));
                        }
                        xVar.o7(str2);
                        if (xVar.f323514f) {
                            ((dk5.s5) tg3.t1.a()).Ui(str, str2);
                        }
                    }
                }
                xVar.n7();
            }
            boolean z18 = list.size() > 1;
            boolean booleanExtra = xVar.getIntent().getBooleanExtra("msg_forward_exteral", false);
            xVar.Y6(z18, booleanExtra, (!booleanExtra || z18 || (arrayList = xVar.f323513e) == null || arrayList.size() <= 0) ? null : (java.lang.String) xVar.f323513e.get(0));
        }
    }
}
