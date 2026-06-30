package yu0;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f465819a;

    /* renamed from: b, reason: collision with root package name */
    public final tu0.a f465820b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.vfs.r6 f465821c;

    public n(int i17, tu0.a encodeType, com.tencent.mm.vfs.r6 audioPartFile) {
        kotlin.jvm.internal.o.g(encodeType, "encodeType");
        kotlin.jvm.internal.o.g(audioPartFile, "audioPartFile");
        this.f465819a = i17;
        this.f465820b = encodeType;
        this.f465821c = audioPartFile;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0.n)) {
            return false;
        }
        yu0.n nVar = (yu0.n) obj;
        return this.f465819a == nVar.f465819a && this.f465820b == nVar.f465820b && kotlin.jvm.internal.o.b(this.f465821c, nVar.f465821c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f465819a) * 31) + this.f465820b.hashCode()) * 31) + this.f465821c.hashCode();
    }

    public java.lang.String toString() {
        return "PartRequestAudioParams(audioDurationMs=" + this.f465819a + ", encodeType=" + this.f465820b + ", audioPartFile=" + this.f465821c + ')';
    }
}
