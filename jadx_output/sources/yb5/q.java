package yb5;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f460742a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f460743b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.storage.z3 f460744c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f460745d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f460746e;

    public q(java.lang.String talkerUserName, java.lang.String str, com.tencent.mm.storage.z3 talker, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(talkerUserName, "talkerUserName");
        kotlin.jvm.internal.o.g(talker, "talker");
        this.f460742a = talkerUserName;
        this.f460743b = str;
        this.f460744c = talker;
        this.f460745d = z17;
        this.f460746e = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb5.q)) {
            return false;
        }
        yb5.q qVar = (yb5.q) obj;
        return kotlin.jvm.internal.o.b(this.f460742a, qVar.f460742a) && kotlin.jvm.internal.o.b(this.f460743b, qVar.f460743b) && kotlin.jvm.internal.o.b(this.f460744c, qVar.f460744c) && this.f460745d == qVar.f460745d && this.f460746e == qVar.f460746e;
    }

    public int hashCode() {
        int hashCode = this.f460742a.hashCode() * 31;
        java.lang.String str = this.f460743b;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f460744c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f460745d)) * 31) + java.lang.Boolean.hashCode(this.f460746e);
    }

    public java.lang.String toString() {
        return "ChattingTalkerInfo(talkerUserName=" + this.f460742a + ", talkerNickName=" + this.f460743b + ", talker=" + this.f460744c + ", isGroupChat=" + this.f460745d + ", isAppBrandServiceChat=" + this.f460746e + ')';
    }
}
