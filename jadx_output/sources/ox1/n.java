package ox1;

/* loaded from: classes12.dex */
public class n implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox1.s f349609d;

    public n(ox1.s sVar) {
        this.f349609d = sVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        ox1.c cVar;
        ox1.s sVar = this.f349609d;
        androidx.recyclerview.widget.RecyclerView i17 = sVar.i();
        ox1.c cVar2 = sVar.f349638x;
        boolean z17 = cVar2 != null && cVar2.f349583c < ((float) sVar.k(i17));
        ox1.c cVar3 = sVar.f349638x;
        boolean z18 = cVar3 != null && cVar3.f349583c > ((float) sVar.j());
        if (!ox1.s.K || i17 == null || (cVar = sVar.f349638x) == null || cVar.a() != 1 || (!z17 && !z18)) {
            com.tencent.mm.sdk.platformtools.b4 b4Var = sVar.f349639y;
            if (b4Var != null) {
                b4Var.d();
            }
        } else if (z17 && i17.canScrollVertically(-1)) {
            if (sVar.f349638x.f349581a == 3) {
                sVar.b();
            }
            sVar.G(false);
            sVar.n();
            sVar.p();
            i17.smoothScrollBy(0, org.chromium.net.NetError.ERR_INVALID_URL);
        } else if (z18 && i17.canScrollVertically(1)) {
            sVar.G(false);
            sVar.n();
            sVar.p();
            i17.smoothScrollBy(0, 300);
        }
        return true;
    }
}
