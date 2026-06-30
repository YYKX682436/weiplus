package x05;

/* loaded from: classes9.dex */
public class f extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f451190d;

    public f() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "createTime"), com.tencent.mm.protobuf.i.i(-1, "commentEggCount"), com.tencent.mm.protobuf.i.i(-1, "activityType"), com.tencent.mm.protobuf.i.i(-1, "isInnerQuickShare"), com.tencent.mm.protobuf.i.r(-1, "desc", x05.g.class), com.tencent.mm.protobuf.i.u(-1, "info")});
        this.f451190d = appendAttrs;
        super.set__serialName("content");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, 0, 0, 0, null, null});
    }

    public int getCreateTime() {
        return super.getInteger(this.f451190d + 0);
    }

    public int j() {
        return super.getInteger(this.f451190d + 2);
    }

    public int k() {
        return super.getInteger(this.f451190d + 1);
    }

    public x05.g l() {
        return (x05.g) super.getCustom(this.f451190d + 4);
    }

    public int n() {
        return super.getInteger(this.f451190d + 3);
    }

    public void o(int i17) {
        super.set(this.f451190d + 2, java.lang.Integer.valueOf(i17));
    }

    public void p(int i17) {
        super.set(this.f451190d + 1, java.lang.Integer.valueOf(i17));
    }

    public void q(int i17) {
        super.set(this.f451190d + 0, java.lang.Integer.valueOf(i17));
    }

    public void r(x05.g gVar) {
        super.set(this.f451190d + 4, gVar);
    }

    public void s(int i17) {
        super.set(this.f451190d + 3, java.lang.Integer.valueOf(i17));
    }
}
