package dk2;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f233738a;

    /* renamed from: b, reason: collision with root package name */
    public final int f233739b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f233740c;

    /* renamed from: d, reason: collision with root package name */
    public final int f233741d;

    /* renamed from: e, reason: collision with root package name */
    public final int f233742e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f233743f;

    /* renamed from: g, reason: collision with root package name */
    public int f233744g;

    public m(int i17, int i18, java.lang.String giftId, int i19, int i27, java.util.List battleTeam, int i28) {
        kotlin.jvm.internal.o.g(giftId, "giftId");
        kotlin.jvm.internal.o.g(battleTeam, "battleTeam");
        this.f233738a = i17;
        this.f233739b = i18;
        this.f233740c = giftId;
        this.f233741d = i19;
        this.f233742e = i27;
        this.f233743f = battleTeam;
        this.f233744g = i28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.m)) {
            return false;
        }
        dk2.m mVar = (dk2.m) obj;
        return this.f233738a == mVar.f233738a && this.f233739b == mVar.f233739b && kotlin.jvm.internal.o.b(this.f233740c, mVar.f233740c) && this.f233741d == mVar.f233741d && this.f233742e == mVar.f233742e && kotlin.jvm.internal.o.b(this.f233743f, mVar.f233743f) && this.f233744g == mVar.f233744g;
    }

    public int hashCode() {
        return (((((((((((java.lang.Integer.hashCode(this.f233738a) * 31) + java.lang.Integer.hashCode(this.f233739b)) * 31) + this.f233740c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f233741d)) * 31) + java.lang.Integer.hashCode(this.f233742e)) * 31) + this.f233743f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f233744g);
    }

    public java.lang.String toString() {
        return "battleMode: " + this.f233738a + " battleWinWay: " + this.f233739b + " selectGiftId: " + this.f233740c + " battleDuration: " + this.f233741d + " battleScope: " + this.f233742e + " battleLayout: " + this.f233744g + " battleTeam: " + com.tencent.mm.plugin.finder.live.util.a0.f115437a.a(this.f233743f) + ' ';
    }
}
