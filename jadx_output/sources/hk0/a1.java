package hk0;

/* loaded from: classes3.dex */
public final class a1 extends hk0.n {

    /* renamed from: b, reason: collision with root package name */
    public final hk0.l f281692b;

    /* renamed from: c, reason: collision with root package name */
    public hk0.p f281693c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f281694d;

    /* renamed from: e, reason: collision with root package name */
    public final int f281695e;

    /* renamed from: f, reason: collision with root package name */
    public final int f281696f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f281697g;

    /* renamed from: h, reason: collision with root package name */
    public xk0.f f281698h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f281699i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(hk0.l editType, hk0.p handleType, java.lang.String str, int i17, int i18, java.lang.String font, xk0.f fVar, java.lang.String str2) {
        super(editType, handleType, str2, fVar);
        kotlin.jvm.internal.o.g(editType, "editType");
        kotlin.jvm.internal.o.g(handleType, "handleType");
        kotlin.jvm.internal.o.g(font, "font");
        this.f281692b = editType;
        this.f281693c = handleType;
        this.f281694d = str;
        this.f281695e = i17;
        this.f281696f = i18;
        this.f281697g = font;
        this.f281698h = fVar;
        this.f281699i = str2;
    }

    @Override // hk0.n
    public xk0.f a() {
        return this.f281698h;
    }

    @Override // hk0.n
    public hk0.p b() {
        return this.f281693c;
    }

    @Override // hk0.n
    public java.lang.String c() {
        return this.f281699i;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.a1)) {
            return false;
        }
        hk0.a1 a1Var = (hk0.a1) obj;
        return this.f281692b == a1Var.f281692b && this.f281693c == a1Var.f281693c && kotlin.jvm.internal.o.b(this.f281694d, a1Var.f281694d) && this.f281695e == a1Var.f281695e && this.f281696f == a1Var.f281696f && kotlin.jvm.internal.o.b(this.f281697g, a1Var.f281697g) && kotlin.jvm.internal.o.b(this.f281698h, a1Var.f281698h) && kotlin.jvm.internal.o.b(this.f281699i, a1Var.f281699i);
    }

    public int hashCode() {
        int hashCode = ((this.f281692b.hashCode() * 31) + this.f281693c.hashCode()) * 31;
        java.lang.String str = this.f281694d;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f281695e)) * 31) + java.lang.Integer.hashCode(this.f281696f)) * 31) + this.f281697g.hashCode()) * 31;
        xk0.f fVar = this.f281698h;
        int hashCode3 = (hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        java.lang.String str2 = this.f281699i;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "TextEditData(editType=" + this.f281692b + ", handleType=" + this.f281693c + ", text=" + this.f281694d + ", color=" + this.f281695e + ", bgColor=" + this.f281696f + ", font=" + this.f281697g + ", emojiItem=" + this.f281698h + ", lastEditId=" + this.f281699i + ')';
    }
}
