package zd5;

/* loaded from: classes8.dex */
public final class o extends androidx.fragment.app.y1 {

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f471703i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.fragment.app.FragmentManager fm6, java.util.ArrayList fragmentList) {
        super(fm6, 0);
        kotlin.jvm.internal.o.g(fm6, "fm");
        kotlin.jvm.internal.o.g(fragmentList, "fragmentList");
        this.f471703i = fragmentList;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f471703i.size();
    }

    @Override // androidx.fragment.app.y1
    public androidx.fragment.app.Fragment getItem(int i17) {
        java.lang.Object obj = this.f471703i.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return (androidx.fragment.app.Fragment) obj;
    }
}
