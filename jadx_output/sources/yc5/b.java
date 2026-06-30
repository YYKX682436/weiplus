package yc5;

/* loaded from: classes5.dex */
public final class b implements i40.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.z f460888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f460889b;

    public b(kotlinx.coroutines.z zVar, com.tencent.mm.storage.f9 f9Var) {
        this.f460888a = zVar;
        this.f460889b = f9Var;
    }

    @Override // i40.a
    public void a(long j17, long j18) {
    }

    @Override // i40.a
    public void c() {
        ((kotlinx.coroutines.a0) this.f460888a).U(java.lang.Boolean.TRUE);
    }

    @Override // i40.a
    public void d(int i17, int i18, java.lang.String errMsg, boolean z17) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryFileHelper", "downloadFile: failed, msgId=" + this.f460889b.getMsgId() + ", errType=" + i17 + ", errCode=" + i18);
        ((kotlinx.coroutines.a0) this.f460888a).U(java.lang.Boolean.FALSE);
    }

    @Override // i40.a
    public void e() {
        ((kotlinx.coroutines.a0) this.f460888a).U(java.lang.Boolean.FALSE);
    }
}
