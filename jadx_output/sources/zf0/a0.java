package zf0;

/* loaded from: classes11.dex */
public final class a0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472357f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472358g;

    public a0(zf0.v0 v0Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f472355d = v0Var;
        this.f472356e = str;
        this.f472357f = str2;
        this.f472358g = str3;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.SendVideoTask", this.f472355d.id() + " cancelDownloadFlow reason:" + this.f472356e + " tag:" + this.f472357f + " mediaId:" + this.f472358g + " ret:" + ((com.tencent.mm.modelcdntran.n1) obj));
        return jz5.f0.f302826a;
    }
}
