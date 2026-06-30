package qg5;

/* loaded from: classes8.dex */
public final class t4 implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qg5.w4 f363192a;

    public t4(qg5.w4 w4Var) {
        this.f363192a = w4Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoForwardChatRecordsTosDialog", "Dialog is dismissed");
        qg5.w4 w4Var = this.f363192a;
        if (w4Var.f363249e) {
            qg5.w4.a(w4Var, 2);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoForwardChatRecordsTosDialog", "User rejected TOS");
        qg5.w4.a(w4Var, 1);
        yz5.a aVar = w4Var.f363247c;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
