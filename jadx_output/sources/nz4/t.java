package nz4;

/* loaded from: classes12.dex */
public class t implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nz4.y f341637d;

    public t(nz4.y yVar) {
        this.f341637d = yVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        nz4.f fVar;
        nz4.y yVar = this.f341637d;
        androidx.recyclerview.widget.RecyclerView i17 = yVar.i();
        nz4.f fVar2 = yVar.f341666x;
        boolean z17 = fVar2 != null && fVar2.f341604c < ((float) yVar.k(i17));
        nz4.f fVar3 = yVar.f341666x;
        boolean z18 = fVar3 != null && fVar3.f341604c > ((float) yVar.j());
        if (!nz4.y.M || i17 == null || (fVar = yVar.f341666x) == null || fVar.a() != 1 || (!z17 && !z18)) {
            com.tencent.mm.sdk.platformtools.b4 b4Var = yVar.f341667y;
            if (b4Var != null) {
                b4Var.d();
            }
        } else if (z17 && i17.canScrollVertically(-1)) {
            if (yVar.f341666x.f341602a == 3) {
                yVar.b();
            }
            yVar.K(false);
            yVar.n();
            yVar.p();
            i17.smoothScrollBy(0, org.chromium.net.NetError.ERR_INVALID_URL);
        } else if (z18 && i17.canScrollVertically(1)) {
            yVar.K(false);
            yVar.n();
            yVar.p();
            i17.smoothScrollBy(0, 300);
        }
        return true;
    }
}
