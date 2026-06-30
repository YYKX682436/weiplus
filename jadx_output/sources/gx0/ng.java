package gx0;

/* loaded from: classes5.dex */
public final class ng implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bh f276779d;

    public ng(gx0.bh bhVar) {
        this.f276779d = bhVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        gx0.bh bhVar = this.f276779d;
        gx0.bh.Z6(bhVar, (com.tencent.maas.model.time.MJTime) bhVar.V6().A.getValue(), (com.tencent.maas.model.time.MJTime) obj);
    }
}
