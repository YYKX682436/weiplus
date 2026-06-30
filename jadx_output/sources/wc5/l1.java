package wc5;

/* loaded from: classes10.dex */
public final class l1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f444601d;

    /* renamed from: e, reason: collision with root package name */
    public ed5.v f444602e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.v2 f444603f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(androidx.appcompat.app.AppCompatActivity baseActivity) {
        super(baseActivity);
        kotlin.jvm.internal.o.g(baseActivity, "baseActivity");
        this.f444601d = baseActivity;
    }

    public final void T6() {
        android.view.LayoutInflater.Factory factory = this.f444601d;
        kotlin.jvm.internal.o.e(factory, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryController");
        com.tencent.mm.view.recyclerview.WxRecyclerView m76 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) ((uc5.r) factory)).m7();
        androidx.recyclerview.widget.v2 v2Var = this.f444603f;
        if (v2Var != null) {
            m76.U0(v2Var);
        }
        this.f444603f = null;
        ed5.v vVar = this.f444602e;
        if (vVar != null) {
            m76.S0(vVar);
        }
        this.f444602e = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        T6();
        super.onFinished();
    }
}
