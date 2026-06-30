package df2;

/* loaded from: classes3.dex */
public final class m8 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f230763d;

    public m8(df2.s8 s8Var) {
        this.f230763d = s8Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        df2.s8 s8Var = this.f230763d;
        if (booleanValue) {
            com.tencent.mars.xlog.Log.i(s8Var.f231299m, "[hideViewSelf] liveBubbleShowStatusLiveData");
            df2.pv pvVar = (df2.pv) s8Var.controller(df2.pv.class);
            if (pvVar != null) {
                pvVar.b7(s8Var);
                return;
            }
            return;
        }
        if (kz5.c0.i(df2.h7.f230306i, df2.h7.f230307m).contains(s8Var.B1)) {
            return;
        }
        com.tencent.mars.xlog.Log.i(s8Var.f231299m, "[tryToShow] liveBubbleShowStatusLiveData");
        df2.pv pvVar2 = (df2.pv) s8Var.controller(df2.pv.class);
        if (pvVar2 != null) {
            pvVar2.d7(s8Var);
        }
    }
}
