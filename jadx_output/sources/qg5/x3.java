package qg5;

/* loaded from: classes8.dex */
public final class x3 implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qg5.a4 f363254a;

    public x3(qg5.a4 a4Var) {
        this.f363254a = a4Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoCopyChatRecordsTosDialog", "Dialog is dismissed");
        qg5.a4 a4Var = this.f363254a;
        if (a4Var.f362911e) {
            ((qg5.e3) a4Var.a()).uj(2);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoCopyChatRecordsTosDialog", "User rejected TOS");
        ((qg5.e3) a4Var.a()).uj(1);
        yz5.a aVar = a4Var.f362909c;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
