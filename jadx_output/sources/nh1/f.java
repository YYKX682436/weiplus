package nh1;

/* loaded from: classes7.dex */
public class f implements nh1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f337090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nh1.g f337091b;

    public f(com.tencent.mm.ui.widget.dialog.k0 k0Var, nh1.g gVar) {
        this.f337090a = k0Var;
        this.f337091b = gVar;
    }

    @Override // nh1.g
    public void a(android.view.View view, int i17) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f337090a;
        if (k0Var.i()) {
            k0Var.u();
        }
        this.f337091b.a(view, i17);
    }
}
