package yw2;

/* loaded from: classes2.dex */
public final class o implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw2.a0 f466661d;

    public o(yw2.a0 a0Var) {
        this.f466661d = a0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f466661d.f466611g;
        if (weImageView != null) {
            weImageView.s(com.tencent.mm.R.raw.arrow_down_regular, com.tencent.mm.R.color.abw);
        }
    }
}
