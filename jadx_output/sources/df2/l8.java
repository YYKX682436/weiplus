package df2;

/* loaded from: classes3.dex */
public final class l8 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f230650d;

    public l8(df2.s8 s8Var) {
        this.f230650d = s8Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        int hashCode = num.hashCode();
        df2.s8 s8Var = this.f230650d;
        android.view.View f76 = s8Var.f7();
        boolean z17 = hashCode == (f76 != null ? f76.hashCode() : 0);
        java.lang.String str = s8Var.f231299m;
        com.tencent.mars.xlog.Log.i(str, "view = " + num + ", match = " + z17);
        if (s8Var.B1 == df2.h7.f230302e && z17) {
            com.tencent.mars.xlog.Log.i(str, "sendBtn unregister by other");
            s8Var.m7(df2.h7.f230301d);
        }
    }
}
