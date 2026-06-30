package el2;

/* loaded from: classes3.dex */
public final class x2 implements el2.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f253945a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo f253946b;

    public x2(int i17, com.tencent.mm.protocal.protobuf.FinderJumpInfo item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f253945a = i17;
        this.f253946b = item;
    }

    @Override // el2.v2
    public java.lang.String a() {
        return this.f253946b.getJump_id();
    }

    @Override // el2.v2
    public java.lang.String b() {
        return this.f253946b.getWording();
    }

    @Override // el2.v2
    public java.lang.String c() {
        java.lang.String icon_name = this.f253946b.getIcon_name();
        return icon_name == null ? "" : icon_name;
    }

    @Override // el2.v2
    public java.lang.String d() {
        return this.f253946b.getIcon_url();
    }

    @Override // el2.v2
    public r45.a52 e() {
        r45.a52 a52Var = new r45.a52();
        a52Var.set(0, java.lang.Integer.valueOf(this.f253945a));
        a52Var.set(2, new com.tencent.mm.protobuf.g(this.f253946b.toByteArray()));
        return a52Var;
    }

    @Override // el2.v2
    public jz5.l f() {
        return null;
    }

    @Override // el2.v2
    public java.lang.Object getData() {
        return this.f253946b;
    }

    @Override // el2.v2
    public java.lang.String getTitle() {
        return this.f253946b.getRecommend_reason();
    }

    @Override // el2.v2
    public int getType() {
        return this.f253945a;
    }
}
