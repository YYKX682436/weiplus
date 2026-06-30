package so3;

/* loaded from: classes8.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so3.c f410744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410745e;

    public b(so3.c cVar, java.lang.String str) {
        this.f410744d = cVar;
        this.f410745e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        so3.c cVar = this.f410744d;
        cVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CoverSubscribeNotifyMsgInterceptor", "require sync contact");
        c01.p8 a17 = c01.n8.a();
        ((c01.k7) a17).b(this.f410745e, 5, new so3.a(cVar));
    }
}
