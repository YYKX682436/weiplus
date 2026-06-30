package uo1;

/* loaded from: classes5.dex */
public final class e extends com.tencent.mm.ui.widget.dialog.g2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f429552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f429553f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f429554g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f429555h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f429556i;

    public e(com.tencent.mm.ui.widget.dialog.y1 y1Var, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.g0 g0Var, long j17, yz5.a aVar) {
        this.f429552e = y1Var;
        this.f429553f = f0Var;
        this.f429554g = g0Var;
        this.f429555h = j17;
        this.f429556i = aVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dpz, (android.view.ViewGroup) null);
        inflate.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, this.f429552e.B.getHeight()));
        ((com.tencent.mm.plugin.backup.roambackup.ui.component.DialogActionBar) inflate.findViewById(com.tencent.mm.R.id.r4w)).setCancelBack(new uo1.c(this));
        ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.r4x)).setOnClickListener(new uo1.d(this.f429553f, this.f429554g, this.f429555h, this.f429552e));
        return inflate;
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public void f() {
        this.f429556i.invoke();
    }
}
