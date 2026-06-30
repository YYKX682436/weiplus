package yu0;

/* loaded from: classes5.dex */
public final class b implements yu0.s {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo f465778a;

    /* renamed from: b, reason: collision with root package name */
    public final long f465779b;

    /* renamed from: c, reason: collision with root package name */
    public final float f465780c;

    public b(com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo mJAsyncSpeechSubmitResponseInfo, long j17, float f17) {
        this.f465778a = mJAsyncSpeechSubmitResponseInfo;
        this.f465779b = j17;
        this.f465780c = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0.b)) {
            return false;
        }
        yu0.b bVar = (yu0.b) obj;
        return kotlin.jvm.internal.o.b(this.f465778a, bVar.f465778a) && this.f465779b == bVar.f465779b && java.lang.Float.compare(this.f465780c, bVar.f465780c) == 0;
    }

    public int hashCode() {
        com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo mJAsyncSpeechSubmitResponseInfo = this.f465778a;
        return ((((mJAsyncSpeechSubmitResponseInfo == null ? 0 : mJAsyncSpeechSubmitResponseInfo.hashCode()) * 31) + java.lang.Long.hashCode(this.f465779b)) * 31) + java.lang.Float.hashCode(this.f465780c);
    }

    public java.lang.String toString() {
        return "ASRPartTaskResponse(response=" + this.f465778a + ", timeOffsetMs=" + this.f465779b + ", speed=" + this.f465780c + ')';
    }
}
