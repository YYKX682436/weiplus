package tl;

/* loaded from: classes12.dex */
public class r extends com.tencent.mm.sdk.platformtools.b4 {

    /* renamed from: g, reason: collision with root package name */
    public final long f420107g;

    public r(tl.t tVar, long j17) {
        super(new tl.p(tVar), true);
        this.f420107g = 0L;
        this.f420107g = j17;
    }

    @Override // com.tencent.mm.sdk.platformtools.b4
    public void c(long j17, long j18) {
        if (e()) {
            long j19 = this.f420107g;
            if (j19 > 0) {
                postDelayed(new tl.q(this), j19);
            }
        }
        super.c(j17, j18);
    }

    @Override // com.tencent.mm.sdk.platformtools.b4
    public void d() {
        super.d();
    }
}
