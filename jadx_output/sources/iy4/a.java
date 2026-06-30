package iy4;

/* loaded from: classes11.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iy4.c f295923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f295924e;

    public a(iy4.c cVar, long j17) {
        this.f295923d = cVar;
        this.f295924e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iy4.c cVar = this.f295923d;
        cVar.a(com.tencent.mm.R.string.l3n);
        com.tencent.wechat.aff.ext_device.b bVar = cVar.f295935a;
        if (bVar != null) {
            bVar.v0(this.f295924e);
        }
    }
}
