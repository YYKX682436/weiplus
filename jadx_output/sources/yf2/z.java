package yf2;

/* loaded from: classes3.dex */
public final class z extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f461820m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f461821n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f461822o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f461823p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public final void Z6(boolean z17) {
        android.widget.TextView textView;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        if (this.f461823p == z17) {
            return;
        }
        this.f461823p = z17;
        com.tencent.mars.xlog.Log.i("FinderStartLivePostButtonController", "applyInviteeWaitingStyle: invitee=" + z17);
        android.view.View view = this.f461820m;
        if (view == null || (textView = this.f461821n) == null || (weImageView = this.f461822o) == null) {
            return;
        }
        if (!z17) {
            view.setBackgroundResource(com.tencent.mm.R.drawable.a0f);
            view.setEnabled(true);
            view.setClickable(true);
            textView.setText(com.tencent.mm.R.string.f6o);
            textView.setAlpha(1.0f);
            weImageView.setVisibility(0);
            weImageView.setAlpha(1.0f);
            return;
        }
        view.setBackgroundResource(com.tencent.mm.R.drawable.d27);
        view.setEnabled(false);
        view.setClickable(false);
        textView.setText(com.tencent.mm.R.string.onq);
        textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        textView.setAlpha(1.0f);
        weImageView.setVisibility(8);
        weImageView.setAlpha(1.0f);
    }

    public final void a7(boolean z17) {
        if (this.f461823p && z17) {
            com.tencent.mars.xlog.Log.i("FinderStartLivePostButtonController", "setButtonEnabled(" + z17 + ") ignored due to invitee waiting state");
            return;
        }
        android.view.View view = this.f461820m;
        if (view == null) {
            return;
        }
        view.setEnabled(z17);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f461820m = pluginLayout.findViewById(com.tencent.mm.R.id.fg_);
        this.f461821n = (android.widget.TextView) pluginLayout.findViewById(com.tencent.mm.R.id.f484761fg1);
        this.f461822o = (com.tencent.mm.ui.widget.imageview.WeImageView) pluginLayout.findViewById(com.tencent.mm.R.id.f484762fg2);
        android.view.View view = this.f461820m;
        if (view != null) {
            view.postDelayed(new yf2.x(this), 1000L);
        }
        android.view.View view2 = this.f461820m;
        if (view2 != null) {
            view2.setOnTouchListener(new yf2.y(this));
        }
        android.widget.TextView textView = this.f461821n;
        if (textView != null) {
            textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        }
        mm2.n0 n0Var = (mm2.n0) business(mm2.n0.class);
        java.lang.String e17 = xy2.c.e(O6());
        Z6(n0Var.Q6(e17));
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new yf2.v(n0Var, e17, this, null), 3, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        com.tencent.mars.xlog.Log.i("FinderStartLivePostButtonController", "onViewUnmount: Cleaning up post button");
        this.f461820m = null;
        this.f461821n = null;
        this.f461822o = null;
    }
}
