package vc2;

/* loaded from: classes15.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView.LayoutManager f435242a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f435243b;

    public g(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f435242a = layoutManager;
        this.f435243b = recyclerView;
    }

    public static boolean b(int i17, int i18, int i19, int i27, int i28, vc2.f fVar) {
        vc2.e eVar = fVar.f435240a;
        int i29 = eVar.f435239b;
        if ((i29 > 0) && fVar.f435241b == i29) {
            return true;
        }
        return eVar.f435238a.ordinal() != 1 ? (i17 + i18) + i28 > i27 : (i17 - i18) - i28 < i19;
    }

    public android.graphics.Point a(vc2.f fVar) {
        int ordinal = fVar.f435240a.f435238a.ordinal();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f435242a;
        return ordinal != 1 ? new android.graphics.Point(this.f435243b.getPaddingLeft(), layoutManager.getPaddingTop()) : new android.graphics.Point(layoutManager.getWidth() - layoutManager.getPaddingRight(), layoutManager.getPaddingTop());
    }

    public int c() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f435242a;
        return (layoutManager.getWidth() - layoutManager.getPaddingRight()) - this.f435243b.getPaddingLeft();
    }
}
