package yu0;

/* loaded from: classes5.dex */
public final class a implements yu0.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f465773a;

    /* renamed from: b, reason: collision with root package name */
    public final long f465774b;

    /* renamed from: c, reason: collision with root package name */
    public final float f465775c;

    /* renamed from: d, reason: collision with root package name */
    public final yu0.n f465776d;

    /* renamed from: e, reason: collision with root package name */
    public final yu0.o f465777e;

    public a(java.lang.String voiceID, long j17, float f17, yu0.n audioParams, yu0.o postRequestParams) {
        kotlin.jvm.internal.o.g(voiceID, "voiceID");
        kotlin.jvm.internal.o.g(audioParams, "audioParams");
        kotlin.jvm.internal.o.g(postRequestParams, "postRequestParams");
        this.f465773a = voiceID;
        this.f465774b = j17;
        this.f465775c = f17;
        this.f465776d = audioParams;
        this.f465777e = postRequestParams;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0.a)) {
            return false;
        }
        yu0.a aVar = (yu0.a) obj;
        return kotlin.jvm.internal.o.b(this.f465773a, aVar.f465773a) && this.f465774b == aVar.f465774b && java.lang.Float.compare(this.f465775c, aVar.f465775c) == 0 && kotlin.jvm.internal.o.b(this.f465776d, aVar.f465776d) && kotlin.jvm.internal.o.b(this.f465777e, aVar.f465777e);
    }

    public int hashCode() {
        return (((((((this.f465773a.hashCode() * 31) + java.lang.Long.hashCode(this.f465774b)) * 31) + java.lang.Float.hashCode(this.f465775c)) * 31) + this.f465776d.hashCode()) * 31) + this.f465777e.hashCode();
    }

    public java.lang.String toString() {
        return "ASRPartTaskRequest(voiceID=" + this.f465773a + ", timeOffsetMs=" + this.f465774b + ", speed=" + this.f465775c + ", audioParams=" + this.f465776d + ", postRequestParams=" + this.f465777e + ')';
    }
}
