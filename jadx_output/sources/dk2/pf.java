package dk2;

/* loaded from: classes10.dex */
public final class pf {

    /* renamed from: a, reason: collision with root package name */
    public final int f233926a;

    /* renamed from: b, reason: collision with root package name */
    public final int f233927b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f233928c;

    /* renamed from: d, reason: collision with root package name */
    public final int f233929d;

    /* renamed from: e, reason: collision with root package name */
    public final int f233930e;

    public pf(int i17, int i18, java.lang.String giftId, int i19, int i27) {
        kotlin.jvm.internal.o.g(giftId, "giftId");
        this.f233926a = i17;
        this.f233927b = i18;
        this.f233928c = giftId;
        this.f233929d = i19;
        this.f233930e = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.pf)) {
            return false;
        }
        dk2.pf pfVar = (dk2.pf) obj;
        return this.f233926a == pfVar.f233926a && this.f233927b == pfVar.f233927b && kotlin.jvm.internal.o.b(this.f233928c, pfVar.f233928c) && this.f233929d == pfVar.f233929d && this.f233930e == pfVar.f233930e;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f233926a) * 31) + java.lang.Integer.hashCode(this.f233927b)) * 31) + this.f233928c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f233929d)) * 31) + java.lang.Integer.hashCode(this.f233930e);
    }

    public java.lang.String toString() {
        return "FinderLiveVisitorBattleRequestData(battleMode=" + this.f233926a + ", battleWinWay=" + this.f233927b + ", giftId=" + this.f233928c + ", battleDuration=" + this.f233929d + ", battleScope=" + this.f233930e + ')';
    }
}
