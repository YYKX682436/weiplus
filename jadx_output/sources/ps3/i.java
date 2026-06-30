package ps3;

/* loaded from: classes11.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ps3.m f358090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f358091e;

    public i(ps3.m mVar, com.tencent.mm.storage.z3 z3Var) {
        this.f358090d = mVar;
        this.f358091e = z3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((com.tencent.mm.plugin.radar.ui.RadarViewController) this.f358090d.f358102d).l(this.f358091e);
    }
}
