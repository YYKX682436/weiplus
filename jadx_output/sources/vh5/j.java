package vh5;

/* loaded from: classes10.dex */
public final class j implements mg3.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh5.k f437222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mg3.e f437223e;

    public j(vh5.k kVar, mg3.e eVar) {
        this.f437222d = kVar;
        this.f437223e = eVar;
    }

    @Override // mg3.e
    public void a(float f17, float f18) {
        mg3.e eVar;
        if (this.f437222d.f437227d || (eVar = this.f437223e) == null) {
            return;
        }
        eVar.a(f17, f18);
    }

    @Override // mg3.e
    public void d() {
        mg3.e eVar;
        if (this.f437222d.f437227d || (eVar = this.f437223e) == null) {
            return;
        }
        eVar.d();
    }

    @Override // mg3.e
    public boolean f(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        mg3.e eVar = this.f437223e;
        if (eVar != null) {
            return eVar.f(event);
        }
        return false;
    }

    @Override // mg3.e
    public boolean g(android.view.MotionEvent event) {
        com.tencent.mm.ui.base.MMViewPager mMViewPager;
        kotlin.jvm.internal.o.g(event, "event");
        vh5.k kVar = this.f437222d;
        if (kVar.f437227d || (mMViewPager = kVar.f437224a) == null) {
            return false;
        }
        return mMViewPager.dispatchTouchEvent(event);
    }

    @Override // mg3.e
    public boolean i() {
        kg3.s sVar;
        vh5.s sVar2 = this.f437222d.f437226c;
        return (sVar2 == null || (sVar = sVar2.f437242d) == null || sVar.f307729i == 0) ? false : true;
    }
}
