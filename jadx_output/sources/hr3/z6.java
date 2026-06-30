package hr3;

/* loaded from: classes9.dex */
public class z6 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.a7 f284233d;

    public z6(hr3.a7 a7Var) {
        this.f284233d = a7Var;
    }

    @Override // c01.da
    public boolean a() {
        return this.f284233d.f283385n;
    }

    @Override // c01.da
    public void c() {
        hr3.a7 a7Var = this.f284233d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = a7Var.f283384m;
        if (u3Var != null) {
            u3Var.dismiss();
            a7Var.f283384m = null;
        }
    }
}
