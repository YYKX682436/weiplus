package el2;

/* loaded from: classes3.dex */
public final class w2 implements el2.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f253937a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.k92 f253938b;

    public w2(int i17, r45.k92 item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f253937a = i17;
        this.f253938b = item;
    }

    @Override // el2.v2
    public java.lang.String a() {
        return "";
    }

    @Override // el2.v2
    public java.lang.String b() {
        return this.f253938b.getString(4);
    }

    @Override // el2.v2
    public java.lang.String c() {
        java.lang.String string = this.f253938b.getString(6);
        return string == null ? "" : string;
    }

    @Override // el2.v2
    public java.lang.String d() {
        return this.f253938b.getString(3);
    }

    @Override // el2.v2
    public r45.a52 e() {
        r45.a52 a52Var = new r45.a52();
        a52Var.set(0, java.lang.Integer.valueOf(this.f253937a));
        a52Var.set(2, new com.tencent.mm.protobuf.g(this.f253938b.toByteArray()));
        return a52Var;
    }

    @Override // el2.v2
    public jz5.l f() {
        return null;
    }

    @Override // el2.v2
    public java.lang.Object getData() {
        return this.f253938b;
    }

    @Override // el2.v2
    public java.lang.String getTitle() {
        return this.f253938b.getString(2);
    }

    @Override // el2.v2
    public int getType() {
        return this.f253937a;
    }
}
