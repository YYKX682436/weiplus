package qg5;

/* loaded from: classes8.dex */
public final class h implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qg5.p f363005a;

    public h(qg5.p pVar) {
        this.f363005a = pVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsAnalyzeStagingDialog", "Dialog is dismissed");
        qg5.p pVar = this.f363005a;
        if (pVar.f363129k) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsAnalyzeStagingDialog", "User cancelled by dismissing");
        qg5.p.a(pVar, 1, pVar.b());
        yz5.a aVar = pVar.f363121c;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
