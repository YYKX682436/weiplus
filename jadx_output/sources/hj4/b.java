package hj4;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final hj4.a f281660a;

    /* renamed from: b, reason: collision with root package name */
    public int f281661b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f281662c;

    public b(hj4.a aVar, int i17, java.lang.String str, int i18, kotlin.jvm.internal.i iVar) {
        aVar = (i18 & 1) != 0 ? null : aVar;
        i17 = (i18 & 2) != 0 ? 0 : i17;
        str = (i18 & 4) != 0 ? "" : str;
        this.f281660a = aVar;
        this.f281661b = i17;
        this.f281662c = str;
    }

    public final int a() {
        if (this.f281661b > 0) {
            return 1;
        }
        return this.f281660a != null ? 2 : 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj4.b)) {
            return false;
        }
        hj4.b bVar = (hj4.b) obj;
        return kotlin.jvm.internal.o.b(this.f281660a, bVar.f281660a) && this.f281661b == bVar.f281661b && kotlin.jvm.internal.o.b(this.f281662c, bVar.f281662c);
    }

    public int hashCode() {
        hj4.a aVar = this.f281660a;
        int hashCode = (((aVar == null ? 0 : aVar.hashCode()) * 31) + java.lang.Integer.hashCode(this.f281661b)) * 31;
        java.lang.String str = this.f281662c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "TextStatusNotifyShowInfo(latestNewMsgInfo=" + this.f281660a + ", notifyUnreadCount=" + this.f281661b + ", notifyUnreadCountUser=" + this.f281662c + ')';
    }
}
