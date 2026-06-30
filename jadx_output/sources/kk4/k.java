package kk4;

/* loaded from: classes12.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck4.b f308556d;

    public k(ck4.b bVar) {
        this.f308556d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).markVideoBufferingStatus(this.f308556d.field_mediaId, 0);
    }
}
