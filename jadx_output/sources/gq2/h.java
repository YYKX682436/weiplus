package gq2;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gq2.j f274560d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(gq2.j jVar, hq2.c cVar) {
        super(1);
        this.f274560d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager = this.f274560d.f274565h;
        com.tencent.mars.xlog.Log.i("LiveTabViewPagerConvert", "onTabClick currentItem: " + intValue);
        if (finderViewPager != null) {
            finderViewPager.setCurrentItem(intValue);
        }
        return jz5.f0.f302826a;
    }
}
