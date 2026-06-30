package tg0;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f419021a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f419022b;

    /* renamed from: c, reason: collision with root package name */
    public final int f419023c;

    /* renamed from: d, reason: collision with root package name */
    public final int f419024d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f419025e;

    public a(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        this.f419021a = str;
        this.f419022b = str2;
        this.f419023c = i17;
        this.f419024d = i18;
        this.f419025e = str3;
    }

    public final java.util.Map a() {
        jz5.l lVar = new jz5.l("dataType", 2);
        java.lang.String str = this.f419021a;
        jz5.l lVar2 = new jz5.l("token", str);
        java.lang.String str2 = this.f419022b;
        jz5.l lVar3 = new jz5.l("enckey", str2);
        int i17 = this.f419023c;
        jz5.l lVar4 = new jz5.l("encIdx", java.lang.Integer.valueOf(i17));
        int i18 = this.f419024d;
        jz5.l lVar5 = new jz5.l("type", java.lang.Integer.valueOf(i18));
        java.lang.String str3 = this.f419025e;
        java.util.Map k17 = kz5.c1.k(lVar, lVar2, lVar3, lVar4, lVar5, new jz5.l("url", str3));
        com.tencent.mars.xlog.Log.i("MicroMsg.CircleSearch.ReuseImageInfoForMoment", "reuse image info, " + str + ' ' + str2 + ' ' + i17 + ' ' + i18 + ' ' + str3 + '}');
        return k17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg0.a)) {
            return false;
        }
        tg0.a aVar = (tg0.a) obj;
        return kotlin.jvm.internal.o.b(this.f419021a, aVar.f419021a) && kotlin.jvm.internal.o.b(this.f419022b, aVar.f419022b) && this.f419023c == aVar.f419023c && this.f419024d == aVar.f419024d && kotlin.jvm.internal.o.b(this.f419025e, aVar.f419025e);
    }

    public int hashCode() {
        java.lang.String str = this.f419021a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f419022b;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Integer.hashCode(this.f419023c)) * 31) + java.lang.Integer.hashCode(this.f419024d)) * 31;
        java.lang.String str3 = this.f419025e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CircleSearchReuseImageInfoForMoment(token=" + this.f419021a + ", enckey=" + this.f419022b + ", encIdx=" + this.f419023c + ", type=" + this.f419024d + ", url=" + this.f419025e + ')';
    }
}
