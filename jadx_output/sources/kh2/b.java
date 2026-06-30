package kh2;

/* loaded from: classes10.dex */
public final class b implements com.tme.karaoke.lib_singscore.IGroveAndHitCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kh2.l f307987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ om2.u f307988b;

    public b(kh2.l lVar, om2.u uVar) {
        this.f307987a = lVar;
        this.f307988b = uVar;
    }

    @Override // com.tme.karaoke.lib_singscore.IGroveAndHitCallback
    public void hitGrove(int i17, boolean z17, float f17) {
        jh2.a aVar = this.f307987a.f308005b;
        if (aVar != null) {
            aVar.M4(this.f307988b.f346383a, i17, z17, f17);
        }
    }
}
