package vd2;

/* loaded from: classes3.dex */
public final class m1 extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd2.s1 f435807a;

    public m1(vd2.s1 s1Var) {
        this.f435807a = s1Var;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        com.tencent.mars.xlog.Log.i(this.f435807a.f435907m, "lxltest onChanged");
    }

    @Override // androidx.recyclerview.widget.h2
    public void c(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(this.f435807a.f435907m, "lxltest onItemRangeChanged positionStart:" + i17 + ", itemCount:" + i18);
    }

    @Override // androidx.recyclerview.widget.h2
    public void d(int i17, int i18, java.lang.Object obj) {
        c(i17, i18);
        com.tencent.mars.xlog.Log.i(this.f435807a.f435907m, "lxltest onItemRangeChanged positionStart:" + i17 + ", itemCount:" + i18 + ", payload:" + obj);
    }

    @Override // androidx.recyclerview.widget.h2
    public void e(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(this.f435807a.f435907m, "lxltest onItemRangeInserted positionStart:" + i17 + ", itemCount:" + i18);
    }

    @Override // androidx.recyclerview.widget.h2
    public void f(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i(this.f435807a.f435907m, "lxltest onItemRangeMoved fromPosition:" + i17 + ", toPosition:" + i18 + ", itemCount:" + i19);
    }

    @Override // androidx.recyclerview.widget.h2
    public void g(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(this.f435807a.f435907m, "lxltest onItemRangeRemoved positionStart:" + i17 + ", itemCount:" + i18);
    }
}
