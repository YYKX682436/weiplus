package nz4;

/* loaded from: classes12.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f341631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nz4.y f341632e;

    public p(nz4.y yVar, boolean z17) {
        this.f341632e = yVar;
        this.f341631d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nz4.y yVar = this.f341632e;
        androidx.recyclerview.widget.RecyclerView i17 = yVar.i();
        if (i17 == null) {
            return;
        }
        for (int i18 = 0; i18 < i17.getChildCount(); i18++) {
            android.view.View childAt = i17.getChildAt(i18);
            if (childAt != null) {
                androidx.recyclerview.widget.k3 m07 = i17.m0(childAt);
                if ((m07 instanceof sz4.t) && (r4 = ((sz4.t) m07).r()) != null) {
                    yVar.G(r4, childAt, this.f341631d);
                }
            }
            nz4.g a17 = nz4.z.a(childAt);
            yVar.G(a17, childAt, this.f341631d);
        }
    }
}
