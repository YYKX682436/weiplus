package i53;

/* loaded from: classes8.dex */
public class h0 extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.n0 f288588c;

    public h0(i53.n0 n0Var) {
        this.f288588c = n0Var;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        int itemViewType = this.f288588c.f288671e2.getItemViewType(i17);
        return (itemViewType == Integer.MAX_VALUE || itemViewType == 2147483646 || itemViewType == 1 || itemViewType == 2) ? 2 : 1;
    }
}
