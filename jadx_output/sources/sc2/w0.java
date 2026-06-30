package sc2;

/* loaded from: classes2.dex */
public final class w0 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f406322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.t01 f406324f;

    public w0(sc2.h1 h1Var, in5.s0 s0Var, r45.t01 t01Var) {
        this.f406322d = h1Var;
        this.f406323e = s0Var;
        this.f406324f = t01Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        sc2.h1 h1Var = this.f406322d;
        if (h1Var.A1 == com.tencent.mm.plugin.finder.report.g3.f125045e) {
            h1Var.A1 = com.tencent.mm.plugin.finder.report.g3.f125046f;
        }
        h1Var.P(this.f406323e, true, true, this.f406324f);
    }
}
