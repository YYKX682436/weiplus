package iy4;

/* loaded from: classes11.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iy4.c f295930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f295931e;

    public b(iy4.c cVar, long j17) {
        this.f295930d = cVar;
        this.f295931e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iy4.c cVar = this.f295930d;
        cVar.a(com.tencent.mm.R.string.l3e);
        com.tencent.wechat.aff.ext_device.b bVar = cVar.f295935a;
        if (bVar != null) {
            bVar.y1(this.f295931e);
        }
    }
}
