package yu0;

/* loaded from: classes5.dex */
public final class q implements yu0.s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f465830a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f465831b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f465832c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo f465833d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f465834e;

    public q(java.lang.String text, java.lang.String roleID, java.lang.String roleName, com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo mJAsyncSpeechSubmitResponseInfo, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(roleID, "roleID");
        kotlin.jvm.internal.o.g(roleName, "roleName");
        this.f465830a = text;
        this.f465831b = roleID;
        this.f465832c = roleName;
        this.f465833d = mJAsyncSpeechSubmitResponseInfo;
        this.f465834e = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0.q)) {
            return false;
        }
        yu0.q qVar = (yu0.q) obj;
        return kotlin.jvm.internal.o.b(this.f465830a, qVar.f465830a) && kotlin.jvm.internal.o.b(this.f465831b, qVar.f465831b) && kotlin.jvm.internal.o.b(this.f465832c, qVar.f465832c) && kotlin.jvm.internal.o.b(this.f465833d, qVar.f465833d) && kotlin.jvm.internal.o.b(this.f465834e, qVar.f465834e);
    }

    public int hashCode() {
        int hashCode = ((((this.f465830a.hashCode() * 31) + this.f465831b.hashCode()) * 31) + this.f465832c.hashCode()) * 31;
        com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo mJAsyncSpeechSubmitResponseInfo = this.f465833d;
        int hashCode2 = (hashCode + (mJAsyncSpeechSubmitResponseInfo == null ? 0 : mJAsyncSpeechSubmitResponseInfo.hashCode())) * 31;
        java.lang.Object obj = this.f465834e;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "TTSTaskResponse(text=" + this.f465830a + ", roleID=" + this.f465831b + ", roleName=" + this.f465832c + ", response=" + this.f465833d + ", identity=" + this.f465834e + ')';
    }
}
