package dg5;

/* loaded from: classes11.dex */
public class f implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f232360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dg5.g f232361e;

    public f(dg5.g gVar, long j17) {
        this.f232361e = gVar;
        this.f232360d = j17;
    }

    @Override // c01.da
    public boolean a() {
        return this.f232361e.f232364f;
    }

    @Override // c01.da
    public void c() {
        dg5.g gVar = this.f232361e;
        if (gVar.f232365g != null) {
            s01.m Ui = r01.q3.Ui();
            long j17 = this.f232360d;
            Ui.y0(j17);
            r01.q3.aj().D0(j17);
            if (r01.q3.aj().P0(gVar.f232367i) <= 0) {
                ((com.tencent.mm.storage.m4) c01.d9.b().r()).k(gVar.f232367i);
            }
            gVar.f232365g.dismiss();
        }
    }
}
