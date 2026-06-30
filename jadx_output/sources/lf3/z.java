package lf3;

/* loaded from: classes10.dex */
public final class z implements mg3.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mg3.e f318346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf3.c0 f318347e;

    public z(mg3.e eVar, lf3.c0 c0Var) {
        this.f318346d = eVar;
        this.f318347e = c0Var;
    }

    @Override // mg3.e
    public void a(float f17, float f18) {
        mg3.e eVar = this.f318346d;
        if (eVar != null) {
            eVar.a(f17, f18);
        }
    }

    @Override // mg3.e
    public void d() {
        mg3.e eVar = this.f318346d;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // mg3.e
    public boolean f(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        mg3.e eVar = this.f318346d;
        if (eVar != null) {
            return eVar.f(event);
        }
        return false;
    }

    @Override // mg3.e
    public boolean g(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = this.f318347e.f318310d;
        if (viewPager2 != null) {
            return viewPager2.dispatchTouchEvent(event);
        }
        return false;
    }

    @Override // mg3.e
    public boolean i() {
        return this.f318347e.f318313g.f307729i != 0;
    }
}
