package vn;

/* loaded from: classes8.dex */
public class d implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f438171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f438172e;

    public d(com.tencent.mm.ui.widget.dialog.k0 k0Var, android.view.View view) {
        this.f438171d = k0Var;
        this.f438172e = view;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f438171d;
        k0Var.o(null);
        k0Var.o(this.f438172e);
    }
}
