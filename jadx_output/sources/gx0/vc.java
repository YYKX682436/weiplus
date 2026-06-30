package gx0;

/* loaded from: classes5.dex */
public final class vc implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.dd f277073d;

    public vc(gx0.dd ddVar) {
        this.f277073d = ddVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.maas.moviecomposing.segments.WhenWhereSegment z76;
        com.tencent.maas.base.MJID mjid;
        gx0.dd ddVar = this.f277073d;
        if (ddVar.x7().isPlaying() || !ddVar.X6() || (z76 = ddVar.z7()) == null || (mjid = z76.f48532a) == null) {
            return;
        }
        du0.o.o7((gx0.x4) ((jz5.n) ddVar.f276341w).getValue(), mjid, false, false, 4, null);
    }
}
