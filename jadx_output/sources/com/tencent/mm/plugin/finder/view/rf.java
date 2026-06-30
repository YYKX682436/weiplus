package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class rf extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f132953b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View.OnClickListener f132954c;

    /* renamed from: d, reason: collision with root package name */
    public final long f132955d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f132956e;

    /* renamed from: f, reason: collision with root package name */
    public int f132957f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f132958g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(android.content.Context context, android.view.View.OnClickListener onClickListener) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f132953b = context;
        this.f132954c = onClickListener;
        this.f132955d = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
        setContentView(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.b4_, (android.view.ViewGroup) null));
        setClippingEnabled(false);
        setOutsideTouchable(true);
        getContentView().findViewById(com.tencent.mm.R.id.ftg).setOnClickListener(new com.tencent.mm.plugin.finder.view.of(this));
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) context).mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.view.FinderMusicTipsBubbleWindow$2
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public final void onDestroy() {
                    com.tencent.mm.plugin.finder.view.rf rfVar = com.tencent.mm.plugin.finder.view.rf.this;
                    rfVar.dismiss();
                    ((com.tencent.mm.ui.MMActivity) rfVar.f132953b).mo133getLifecycle().c(this);
                }
            });
        }
        this.f132958g = new com.tencent.mm.plugin.finder.view.pf(this);
    }

    @Override // db5.d5, android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        android.view.View contentView = getContentView();
        if (contentView != null) {
            contentView.removeCallbacks(new com.tencent.mm.plugin.finder.view.qf(this.f132958g));
        }
    }
}
