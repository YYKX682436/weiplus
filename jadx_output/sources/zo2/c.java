package zo2;

/* loaded from: classes2.dex */
public class c extends androidx.fragment.app.y1 {

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f474847i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.fragment.app.FragmentManager fm6, java.util.List fragments) {
        super(fm6, 0);
        kotlin.jvm.internal.o.g(fm6, "fm");
        kotlin.jvm.internal.o.g(fragments, "fragments");
        this.f474847i = fragments;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f474847i.size();
    }

    @Override // androidx.fragment.app.y1
    public androidx.fragment.app.Fragment getItem(int i17) {
        return (androidx.fragment.app.Fragment) this.f474847i.get(i17);
    }
}
