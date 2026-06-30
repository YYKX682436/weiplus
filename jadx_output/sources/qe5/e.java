package qe5;

/* loaded from: classes8.dex */
public final class e extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.handoff.model.AbsHandOffFile f362088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new qe5.d(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.handoff.model.AbsHandOffFile absHandOffFile = this.f362088d;
        if (absHandOffFile != null) {
            ((d73.i) i95.n0.c(d73.i.class)).a9(absHandOffFile);
        }
    }
}
