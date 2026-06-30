package um2;

/* loaded from: classes3.dex */
public final class w4 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f429008d;

    public w4(um2.x5 x5Var) {
        this.f429008d = x5Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        um2.x5 x5Var = this.f429008d;
        com.tencent.mars.xlog.Log.i(x5Var.f429032f, "value " + booleanValue + ", hasShown " + ((mm2.c1) x5Var.c(mm2.c1.class)).V);
        if (booleanValue && !((mm2.c1) x5Var.c(mm2.c1.class)).V) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = x5Var.f19605b;
            db5.t7.e(appCompatActivity, appCompatActivity.getResources().getString(com.tencent.mm.R.string.d2w), com.tencent.mm.R.raw.icons_outlined_person_tie);
            ((mm2.c1) x5Var.c(mm2.c1.class)).V = true;
        }
        return jz5.f0.f302826a;
    }
}
