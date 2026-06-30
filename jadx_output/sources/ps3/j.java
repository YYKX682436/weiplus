package ps3;

/* loaded from: classes11.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ps3.m f358092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f358093e;

    public j(ps3.m mVar, com.tencent.mm.storage.z3 z3Var) {
        this.f358092d = mVar;
        this.f358093e = z3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((com.tencent.mm.plugin.radar.ui.RadarViewController) this.f358092d.f358102d).m(this.f358093e);
    }
}
