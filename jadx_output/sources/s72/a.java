package s72;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f403982a;

    /* renamed from: b, reason: collision with root package name */
    public final int f403983b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f403984c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f403985d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f403986e;

    public a(int i17, int i18, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f403982a = i17;
        this.f403983b = i18;
        this.f403984c = str;
        this.f403985d = v0Var;
        this.f403986e = bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(s72.a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.api.sync.FavSyncRequestWrapper.CgiResult");
        s72.a aVar = (s72.a) obj;
        return this.f403982a == aVar.f403982a && this.f403983b == aVar.f403983b && kotlin.jvm.internal.o.b(this.f403984c, aVar.f403984c) && kotlin.jvm.internal.o.b(this.f403985d, aVar.f403985d) && java.util.Arrays.equals(this.f403986e, aVar.f403986e);
    }

    public int hashCode() {
        int i17 = ((this.f403982a * 31) + this.f403983b) * 31;
        java.lang.String str = this.f403984c;
        int hashCode = (i17 + (str != null ? str.hashCode() : 0)) * 31;
        com.tencent.mm.network.v0 v0Var = this.f403985d;
        return ((hashCode + (v0Var != null ? v0Var.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.f403986e);
    }

    public java.lang.String toString() {
        return "CgiResult(errType=" + this.f403982a + ", errCode=" + this.f403983b + ", errMsg=" + this.f403984c + ", rr=" + this.f403985d + ", cookie=" + java.util.Arrays.toString(this.f403986e) + ')';
    }
}
