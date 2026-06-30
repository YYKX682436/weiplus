package ym5;

/* loaded from: classes3.dex */
public final class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RecyclerHorizontalViewPager f463451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f463452e;

    public o3(com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager, int i17) {
        this.f463451d = recyclerHorizontalViewPager;
        this.f463452e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f463451d.g1(this.f463452e, true, true);
    }
}
