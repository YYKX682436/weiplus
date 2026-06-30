package rx0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.instamovie.base.MJError f400912a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.camstudio.MJAIGCSubmitResponse f400913b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.d01 f400914c;

    public d(com.tencent.maas.instamovie.base.MJError mJError, com.tencent.maas.camstudio.MJAIGCSubmitResponse mJAIGCSubmitResponse, r45.d01 svrResp) {
        kotlin.jvm.internal.o.g(svrResp, "svrResp");
        this.f400912a = mJError;
        this.f400913b = mJAIGCSubmitResponse;
        this.f400914c = svrResp;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx0.d)) {
            return false;
        }
        rx0.d dVar = (rx0.d) obj;
        return kotlin.jvm.internal.o.b(this.f400912a, dVar.f400912a) && kotlin.jvm.internal.o.b(this.f400913b, dVar.f400913b) && kotlin.jvm.internal.o.b(this.f400914c, dVar.f400914c);
    }

    public int hashCode() {
        com.tencent.maas.instamovie.base.MJError mJError = this.f400912a;
        int hashCode = (mJError == null ? 0 : mJError.hashCode()) * 31;
        com.tencent.maas.camstudio.MJAIGCSubmitResponse mJAIGCSubmitResponse = this.f400913b;
        return ((hashCode + (mJAIGCSubmitResponse != null ? mJAIGCSubmitResponse.hashCode() : 0)) * 31) + this.f400914c.hashCode();
    }

    public java.lang.String toString() {
        return "MJAIGCSubmitRespExt(error=" + this.f400912a + ", mjResp=" + this.f400913b + ", svrResp=" + this.f400914c + ')';
    }
}
