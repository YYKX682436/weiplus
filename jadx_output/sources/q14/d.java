package q14;

/* loaded from: classes5.dex */
public final class d extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f359690d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f359691e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.eih;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        mMActivity.setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        mMActivity.setMMTitle("");
        mMActivity.hideActionbarLine();
        mMActivity.setBackBtn(new q14.a(mMActivity));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        android.view.ViewGroup viewGroup;
        android.view.ViewTreeObserver viewTreeObserver;
        if (this.f359691e == null || (viewGroup = this.f359690d) == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this.f359691e);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        android.view.ViewTreeObserver viewTreeObserver;
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        this.f359690d = (android.view.ViewGroup) contentView;
        boolean Ri = ((is.f) ((js.r0) i95.n0.c(js.r0.class))).Ri();
        com.tencent.mm.ui.widget.WeSwitch weSwitch = (com.tencent.mm.ui.widget.WeSwitch) contentView.findViewById(com.tencent.mm.R.id.f486148um3);
        if (weSwitch != null) {
            weSwitch.setCheck(Ri);
            weSwitch.setSwitchListener(q14.b.f359688a);
        }
        this.f359691e = new q14.c(this);
        android.view.ViewGroup viewGroup = this.f359690d;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f359691e);
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Gj(50320, "page_in", kz5.c1.k(new jz5.l("one_clk_login_status", java.lang.Integer.valueOf(Ri ? 1 : 0)), new jz5.l(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, wo.w0.k())), 34575);
    }
}
