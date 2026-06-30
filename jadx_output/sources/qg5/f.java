package qg5;

/* loaded from: classes8.dex */
public final class f implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f362971a;

    public f(com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f362971a = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        this.f362971a.B();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsAnalyzeStagingDialog", "User clicked cancel button");
    }
}
