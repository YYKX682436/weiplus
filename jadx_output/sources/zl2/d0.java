package zl2;

/* loaded from: classes.dex */
public final class d0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f473710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f473711e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.zc4 f473712f;

    public d0(com.tencent.mm.ui.widget.dialog.k0 k0Var, androidx.appcompat.app.AppCompatActivity appCompatActivity, r45.zc4 zc4Var) {
        this.f473710d = k0Var;
        this.f473711e = appCompatActivity;
        this.f473712f = zc4Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        this.f473710d.o(null);
        g4Var.clear();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f473711e;
        g4Var.j(0, appCompatActivity.getResources().getString(com.tencent.mm.R.string.lel), com.tencent.mm.R.raw.finder_icons_filled_share, appCompatActivity.getResources().getColor(com.tencent.mm.R.color.f478502m), false);
        r45.zc4 zc4Var = this.f473712f;
        if (zc4Var.getBoolean(25)) {
            g4Var.j(5, appCompatActivity.getResources().getString(com.tencent.mm.R.string.f492075f54), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, !zc4Var.getBoolean(26));
        }
        if (zc4Var.getBoolean(21)) {
            return;
        }
        boolean z17 = zc4Var.getBoolean(20);
        g4Var.j(4, appCompatActivity.getResources().getString(z17 ? com.tencent.mm.R.string.nvg : com.tencent.mm.R.string.nvh), com.tencent.mm.R.raw.icons_filled_gift, appCompatActivity.getResources().getColor(com.tencent.mm.R.color.alt), !z17);
    }
}
