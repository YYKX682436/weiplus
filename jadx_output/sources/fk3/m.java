package fk3;

/* loaded from: classes8.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk3.o f263579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk3.d f263580e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f263581f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f263582g;

    public m(fk3.o oVar, kk3.d dVar, android.graphics.Bitmap bitmap, int i17) {
        this.f263579d = oVar;
        this.f263580e = dVar;
        this.f263581f = bitmap;
        this.f263582g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f263579d.f263592h = false;
        com.tencent.mm.sdk.platformtools.u3.h(new fk3.l(this.f263580e, this.f263581f, this.f263582g));
    }
}
