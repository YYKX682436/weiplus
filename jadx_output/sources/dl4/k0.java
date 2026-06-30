package dl4;

/* loaded from: classes3.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ff0.z f235425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f235426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dl4.m0 f235427f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(ff0.z zVar, android.view.View view, dl4.m0 m0Var) {
        super(0);
        this.f235425d = zVar;
        this.f235426e = view;
        this.f235427f = m0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f235426e;
        ff0.z zVar = this.f235425d;
        if (zVar != null) {
            boolean C = com.tencent.mm.ui.bk.C();
            int i17 = zVar.f261596b;
            if (C) {
                if (view != null) {
                    view.setBackgroundColor(e3.b.c(i17, -16777216, 0.5f));
                }
            } else if (view != null) {
                view.setBackgroundColor(i17);
            }
        } else if (view != null) {
            this.f235427f.getClass();
            view.setBackgroundColor(com.tencent.mm.R.color.a8u);
        }
        return jz5.f0.f302826a;
    }
}
