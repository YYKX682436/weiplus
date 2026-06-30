package ly4;

/* loaded from: classes14.dex */
public final class d implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ly4.e f322282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f322283b;

    public d(ly4.e eVar, kotlin.jvm.internal.h0 h0Var) {
        this.f322282a = eVar;
        this.f322283b = h0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mars.xlog.Log.i("Byp.BypSendPCRemindService", "click btn confirm");
        this.f322282a.b(true);
        ((com.tencent.mm.ui.widget.dialog.z2) this.f322283b.f310123d).B();
    }
}
