package gt4;

/* loaded from: classes8.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f275481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gt4.s0 f275482e;

    public o0(android.widget.TextView textView, gt4.s0 s0Var) {
        this.f275481d = textView;
        this.f275482e = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f275481d;
        textView.setSelected(true);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        textView.setTextColor(this.f275482e.f275534d.getResources().getColor(com.tencent.mm.R.color.FG_0));
    }
}
