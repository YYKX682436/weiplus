package i53;

/* loaded from: classes8.dex */
public class w0 extends androidx.fragment.app.y1 {

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f288767i;

    public w0(androidx.fragment.app.FragmentManager fragmentManager, java.util.ArrayList arrayList) {
        super(fragmentManager, 0);
        this.f288767i = arrayList;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f288767i.size();
    }

    @Override // androidx.fragment.app.y1
    public androidx.fragment.app.Fragment getItem(int i17) {
        java.util.ArrayList arrayList = this.f288767i;
        return (androidx.fragment.app.Fragment) arrayList.get(i17 % arrayList.size());
    }
}
