package hr3;

/* loaded from: classes9.dex */
public class t7 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f284022d;

    public t7(com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f284022d = u3Var;
    }

    @Override // c01.da
    public boolean a() {
        return hr3.u7.f284046g;
    }

    @Override // c01.da
    public void c() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f284022d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
