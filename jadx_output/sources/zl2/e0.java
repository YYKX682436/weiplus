package zl2;

/* loaded from: classes.dex */
public final class e0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.zc4 f473729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f473730e;

    public e0(r45.zc4 zc4Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f473729d = zc4Var;
        this.f473730e = appCompatActivity;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        r45.zc4 zc4Var = this.f473729d;
        boolean z17 = zc4Var.getBoolean(9);
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f473730e;
        if (z17) {
            g4Var.j(1, appCompatActivity.getResources().getString(com.tencent.mm.R.string.loo), com.tencent.mm.R.raw.icons_outlined_qr_code, appCompatActivity.getResources().getColor(com.tencent.mm.R.color.f478712f3), false);
        }
        if (zc4Var.getBoolean(10)) {
            g4Var.j(2, appCompatActivity.getResources().getString(com.tencent.mm.R.string.leg), com.tencent.mm.R.raw.icons_outlined_link, appCompatActivity.getResources().getColor(com.tencent.mm.R.color.f478712f3), false);
        }
        if (zc4Var.getBoolean(11)) {
            g4Var.j(3, appCompatActivity.getResources().getString(com.tencent.mm.R.string.lon), com.tencent.mm.R.raw.icons_outlined_exclamation_mark_triangle, appCompatActivity.getResources().getColor(com.tencent.mm.R.color.f478712f3), false);
        }
    }
}
