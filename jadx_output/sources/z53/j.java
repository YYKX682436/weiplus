package z53;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f470251a;

    /* renamed from: b, reason: collision with root package name */
    public final long f470252b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f470253c;

    /* renamed from: d, reason: collision with root package name */
    public final int f470254d;

    /* renamed from: e, reason: collision with root package name */
    public final long f470255e;

    public j(java.lang.String str, long j17, java.lang.String str2, int i17, long j18) {
        this.f470251a = str;
        this.f470252b = j17;
        this.f470253c = str2;
        this.f470254d = i17;
        this.f470255e = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z53.j)) {
            return false;
        }
        z53.j jVar = (z53.j) obj;
        return kotlin.jvm.internal.o.b(this.f470251a, jVar.f470251a) && this.f470252b == jVar.f470252b && kotlin.jvm.internal.o.b(this.f470253c, jVar.f470253c) && this.f470254d == jVar.f470254d && this.f470255e == jVar.f470255e;
    }

    public int hashCode() {
        java.lang.String str = this.f470251a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + java.lang.Long.hashCode(this.f470252b)) * 31;
        java.lang.String str2 = this.f470253c;
        return ((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f470254d)) * 31) + java.lang.Long.hashCode(this.f470255e);
    }

    public java.lang.String toString() {
        return "GameLifeConversationInfo(talker=" + this.f470251a + ", msgId=" + this.f470252b + ", externInfo=" + this.f470253c + ", msgType=" + this.f470254d + ", updateTime=" + this.f470255e + ')';
    }
}
