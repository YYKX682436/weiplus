package ly4;

/* loaded from: classes14.dex */
public final class c implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ly4.e f322280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f322281b;

    public c(ly4.e eVar, kotlin.jvm.internal.h0 h0Var) {
        this.f322280a = eVar;
        this.f322281b = h0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mars.xlog.Log.i("Byp.BypSendPCRemindService", "click btn cancel");
        this.f322280a.b(false);
        ((com.tencent.mm.ui.widget.dialog.z2) this.f322281b.f310123d).B();
    }
}
