package ry2;

/* loaded from: classes10.dex */
public final class g implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f401390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f401391e;

    public g(java.util.List list, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f401390d = list;
        this.f401391e = appCompatActivity;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var == null || !g4Var.z()) {
            return;
        }
        for (ry2.f fVar : this.f401390d) {
            int i17 = fVar.f401385b;
            if (i17 <= 0) {
                i17 = com.tencent.mm.R.color.FG_0;
            }
            int i18 = fVar.f401384a;
            int i19 = fVar.f401386c;
            if (i19 <= 0) {
                java.lang.Integer num = (java.lang.Integer) ry2.j.f401399b.get(java.lang.Integer.valueOf(i18));
                i19 = num != null ? num.intValue() : 0;
            }
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f401391e;
            g4Var.d(i18, b3.l.getColor(appCompatActivity, i17), appCompatActivity.getResources().getString(i19));
        }
    }
}
