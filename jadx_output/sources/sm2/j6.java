package sm2;

/* loaded from: classes3.dex */
public final class j6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409524e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(fm2.a aVar, sm2.o4 o4Var) {
        super(0);
        this.f409523d = aVar;
        this.f409524e = o4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup;
        fm2.a aVar = this.f409523d;
        android.view.View findViewById = aVar.findViewById(com.tencent.mm.R.id.tjw);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById;
        int childCount = viewGroup2.getChildCount();
        sm2.o4 o4Var = this.f409524e;
        if (childCount == 0) {
            if (android.os.Build.VERSION.SDK_INT > 25) {
                zl2.w4 w4Var = zl2.w4.f474017a;
                zl2.u4 u4Var = zl2.u4.f473989e;
                androidx.appcompat.app.AppCompatActivity appCompatActivity = o4Var.f19594b;
                android.view.LayoutInflater layoutInflater = appCompatActivity.getLayoutInflater();
                kotlin.jvm.internal.o.f(layoutInflater, "getLayoutInflater(...)");
                viewGroup = (android.view.ViewGroup) w4Var.b(com.tencent.mm.R.layout.dxu, viewGroup2, false, u4Var, appCompatActivity, layoutInflater);
            } else {
                android.view.View inflate = android.view.LayoutInflater.from(o4Var.f19594b).inflate(com.tencent.mm.R.layout.dxu, viewGroup2, false);
                kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                viewGroup = (android.view.ViewGroup) inflate;
            }
            viewGroup2.addView(viewGroup);
            o4Var.f409633s = (com.tencent.mm.plugin.finder.live.plugin.iv) o4Var.N(new sm2.h6(viewGroup, aVar));
        } else {
            android.view.View childAt = viewGroup2.getChildAt(0);
            android.view.ViewGroup viewGroup3 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
            if (viewGroup3 != null) {
                o4Var.f409633s = (com.tencent.mm.plugin.finder.live.plugin.iv) o4Var.N(new sm2.i6(viewGroup3, aVar));
            }
        }
        return o4Var.f409633s;
    }
}
