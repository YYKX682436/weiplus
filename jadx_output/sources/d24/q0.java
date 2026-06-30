package d24;

/* loaded from: classes11.dex */
public final class q0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f225958a;

    public q0(com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f225958a = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "onCancel");
        this.f225958a.B();
    }
}
