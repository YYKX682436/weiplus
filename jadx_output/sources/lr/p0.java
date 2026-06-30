package lr;

/* loaded from: classes8.dex */
public final class p0 extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final androidx.recyclerview.widget.f2 f320573c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.GridLayoutManager f320574d;

    public p0(androidx.recyclerview.widget.f2 adapter, androidx.recyclerview.widget.GridLayoutManager layoutManager) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        this.f320573c = adapter;
        this.f320574d = layoutManager;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        switch (this.f320573c.getItemViewType(i17)) {
            case 2:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return this.f320574d.f11861w;
            case 3:
            case 6:
            default:
                return 1;
        }
    }
}
