package yu0;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f465822a;

    /* renamed from: b, reason: collision with root package name */
    public final long f465823b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f465824c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f465825d;

    public o(long j17, long j18, boolean z17, java.util.List minorLangList) {
        kotlin.jvm.internal.o.g(minorLangList, "minorLangList");
        this.f465822a = j17;
        this.f465823b = j18;
        this.f465824c = z17;
        this.f465825d = minorLangList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0.o)) {
            return false;
        }
        yu0.o oVar = (yu0.o) obj;
        return this.f465822a == oVar.f465822a && this.f465823b == oVar.f465823b && this.f465824c == oVar.f465824c && kotlin.jvm.internal.o.b(this.f465825d, oVar.f465825d);
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.f465822a) * 31) + java.lang.Long.hashCode(this.f465823b)) * 31) + java.lang.Boolean.hashCode(this.f465824c)) * 31) + this.f465825d.hashCode();
    }

    public java.lang.String toString() {
        return "PartRequestPostParams(audioDataOffset=" + this.f465822a + ", totalAudioDataLength=" + this.f465823b + ", enableMinorLangTrans=" + this.f465824c + ", minorLangList=" + this.f465825d + ')';
    }
}
