package xk3;

/* loaded from: classes8.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.model.MultiTaskInfo f455024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f455025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f455026f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f455027g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f455028h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.view.View view, in5.s0 s0Var) {
        super(0);
        this.f455024d = multiTaskInfo;
        this.f455025e = imageView;
        this.f455026f = imageView2;
        this.f455027g = view;
        this.f455028h = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f455024d;
        multiTaskInfo.v0().set(7, java.lang.Boolean.TRUE);
        android.widget.ImageView imageView = this.f455025e;
        imageView.setVisibility(0);
        this.f455026f.setVisibility(8);
        this.f455027g.setBackgroundColor(this.f455028h.f293121e.getResources().getColor(com.tencent.mm.R.color.f479443zf));
        imageView.setImageResource(wk3.a.f446957a.b(multiTaskInfo.field_type));
        return jz5.f0.f302826a;
    }
}
