package qg5;

/* loaded from: classes8.dex */
public final class q5 implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qg5.v5 f363149a;

    public q5(qg5.v5 v5Var) {
        this.f363149a = v5Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        com.tencent.mars.xlog.Log.i("YuanBaoSummarizeTosDialog", "Dialog is dismissed");
        qg5.v5 v5Var = this.f363149a;
        if (v5Var.f363230e) {
            qg5.v5.a(v5Var, 2);
            return;
        }
        com.tencent.mars.xlog.Log.i("YuanBaoSummarizeTosDialog", "User rejected TOS");
        qg5.v5.a(v5Var, 1);
        yz5.a aVar = v5Var.f363228c;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
