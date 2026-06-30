package qx0;

/* loaded from: classes5.dex */
public final class e extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f367272b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f367273c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f367274d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f367275e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, qx0.b bVar) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f367272b = context;
        setContentView(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.die, (android.view.ViewGroup) null));
        android.view.View findViewById = getContentView().findViewById(com.tencent.mm.R.id.oqc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = getContentView().findViewById(com.tencent.mm.R.id.hk9);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f367273c = findViewById2;
        setOutsideTouchable(true);
        getContentView().setOnClickListener(new qx0.a(this));
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) context).mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.mj_publisher.finder.shoot_composing.guide.StartShootingGuideBubble$2
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public final void onDestroy() {
                    qx0.e eVar = qx0.e.this;
                    eVar.dismiss();
                    ((com.tencent.mm.ui.MMActivity) eVar.f367272b).mo133getLifecycle().c(this);
                }
            });
        }
        this.f367275e = new qx0.c(this);
    }

    @Override // db5.d5, android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        android.view.View contentView = getContentView();
        if (contentView != null) {
            contentView.removeCallbacks(new qx0.d(this.f367275e));
        }
    }
}
