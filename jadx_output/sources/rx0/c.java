package rx0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.instamovie.base.MJError f400909a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.camstudio.MJAIGCQueryResponse f400910b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.r41 f400911c;

    public c(com.tencent.maas.instamovie.base.MJError mJError, com.tencent.maas.camstudio.MJAIGCQueryResponse mJAIGCQueryResponse, r45.r41 r41Var) {
        this.f400909a = mJError;
        this.f400910b = mJAIGCQueryResponse;
        this.f400911c = r41Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx0.c)) {
            return false;
        }
        rx0.c cVar = (rx0.c) obj;
        return kotlin.jvm.internal.o.b(this.f400909a, cVar.f400909a) && kotlin.jvm.internal.o.b(this.f400910b, cVar.f400910b) && kotlin.jvm.internal.o.b(this.f400911c, cVar.f400911c);
    }

    public int hashCode() {
        com.tencent.maas.instamovie.base.MJError mJError = this.f400909a;
        int hashCode = (mJError == null ? 0 : mJError.hashCode()) * 31;
        com.tencent.maas.camstudio.MJAIGCQueryResponse mJAIGCQueryResponse = this.f400910b;
        int hashCode2 = (hashCode + (mJAIGCQueryResponse == null ? 0 : mJAIGCQueryResponse.hashCode())) * 31;
        r45.r41 r41Var = this.f400911c;
        return hashCode2 + (r41Var != null ? r41Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MJAIGCQueryRespExt(error=" + this.f400909a + ", mjResp=" + this.f400910b + ", svrResp=" + this.f400911c + ')';
    }
}
