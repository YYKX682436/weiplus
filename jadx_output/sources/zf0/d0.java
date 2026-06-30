package zf0;

/* loaded from: classes11.dex */
public final class d0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472397f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472398g;

    public d0(zf0.v0 v0Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f472395d = v0Var;
        this.f472396e = str;
        this.f472397f = str2;
        this.f472398g = str3;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.SendVideoTask", this.f472395d.id() + " cancelUploadFlow reason:" + this.f472396e + " tag:" + this.f472397f + " clientId:" + this.f472398g + " ret:" + ((com.tencent.mm.modelcdntran.n1) obj));
        return jz5.f0.f302826a;
    }
}
