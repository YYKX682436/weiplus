package jy;

/* loaded from: classes14.dex */
public final class q implements jy.s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f302476a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f302477b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f302478c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f302479d;

    public q(java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        this.f302476a = str;
        this.f302477b = str2;
        this.f302478c = z17;
        this.f302479d = z18;
    }

    public static jy.q a(jy.q qVar, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = qVar.f302476a;
        }
        if ((i17 & 2) != 0) {
            str2 = qVar.f302477b;
        }
        if ((i17 & 4) != 0) {
            z17 = qVar.f302478c;
        }
        if ((i17 & 8) != 0) {
            z18 = qVar.f302479d;
        }
        qVar.getClass();
        return new jy.q(str, str2, z17, z18);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy.q)) {
            return false;
        }
        jy.q qVar = (jy.q) obj;
        return kotlin.jvm.internal.o.b(this.f302476a, qVar.f302476a) && kotlin.jvm.internal.o.b(this.f302477b, qVar.f302477b) && this.f302478c == qVar.f302478c && this.f302479d == qVar.f302479d;
    }

    public int hashCode() {
        java.lang.String str = this.f302476a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f302477b;
        return ((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f302478c)) * 31) + java.lang.Boolean.hashCode(this.f302479d);
    }

    public java.lang.String toString() {
        return "ScreenState(headImageUrl=" + this.f302476a + ", roomName=" + this.f302477b + ", ttsBegin=" + this.f302478c + ", aiJoinRoomSuccess=" + this.f302479d + ')';
    }
}
