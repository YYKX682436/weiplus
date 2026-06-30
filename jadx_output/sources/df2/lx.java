package df2;

/* loaded from: classes3.dex */
public final class lx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ox f230724d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx(df2.ox oxVar) {
        super(0);
        this.f230724d = oxVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAutoShow moreActionBtn:");
        df2.ox oxVar = this.f230724d;
        android.view.View view = oxVar.f231013n;
        sb6.append(view != null ? view.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("Finder.MoreActionController", sb6.toString());
        android.view.View view2 = oxVar.f231013n;
        if (view2 != null) {
            view2.performClick();
        }
        return jz5.f0.f302826a;
    }
}
