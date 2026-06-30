package df2;

/* loaded from: classes3.dex */
public final class mp implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.sp f230793d;

    public mp(df2.sp spVar) {
        this.f230793d = spVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        df2.ip ipVar;
        r45.o35 o35Var = (r45.o35) obj;
        df2.sp spVar = this.f230793d;
        com.tencent.mars.xlog.Log.i(spVar.f231353m, "newGiftRecommend receive info = " + o35Var);
        if (o35Var == null) {
            spVar.c7("newGiftRecommend", true);
        } else {
            if (!df2.sp.Z6(spVar, o35Var) || (ipVar = (df2.ip) spVar.controller(df2.ip.class)) == null) {
                return;
            }
            ipVar.f230422q = java.lang.Long.valueOf(o35Var.getLong(0));
        }
    }
}
