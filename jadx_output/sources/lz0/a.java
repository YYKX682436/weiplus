package lz0;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CdnManager.C2CDownloadRequest f322313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest) {
        super(1);
        this.f322313d = c2CDownloadRequest;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).cancelTask(this.f322313d.fileKey);
        return jz5.f0.f302826a;
    }
}
