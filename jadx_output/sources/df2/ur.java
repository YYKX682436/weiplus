package df2;

/* loaded from: classes10.dex */
public final class ur extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f231550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.h f231552f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur(df2.lt ltVar, java.lang.String str, dk2.h hVar) {
        super(0);
        this.f231550d = ltVar;
        this.f231551e = str;
        this.f231552f = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.lt ltVar = this.f231550d;
        kotlinx.coroutines.r2 r2Var = ltVar.B;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager = ltVar.f230706n;
        if (recyclerHorizontalViewPager != null) {
            recyclerHorizontalViewPager.setFrozeTouch(true);
        }
        java.lang.String str = df2.lt.W;
        dk2.h hVar = this.f231552f;
        java.lang.String str2 = this.f231551e;
        df2.lt.f230703y1 = new df2.tr(ltVar, hVar, str2);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = ltVar.f230707o;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyItemChanged(ltVar.f230712t, str2);
        }
        return jz5.f0.f302826a;
    }
}
