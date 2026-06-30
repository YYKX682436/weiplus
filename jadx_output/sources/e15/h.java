package e15;

/* loaded from: classes9.dex */
public class h extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f246448d;

    public h() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "type"), com.tencent.mm.protobuf.i.u(-1, "categoryItem"), com.tencent.mm.protobuf.i.u(-1, "categoryId")});
        this.f246448d = appendAttrs;
        super.set__serialName("tingCategoryItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, null, null});
    }

    public int getType() {
        return super.getInteger(this.f246448d + 0);
    }

    public java.lang.String j() {
        return super.getString(this.f246448d + 2);
    }

    public java.lang.String k() {
        return super.getString(this.f246448d + 1);
    }

    public void l(java.lang.String str) {
        super.set(this.f246448d + 2, str);
    }

    public void n(java.lang.String str) {
        super.set(this.f246448d + 1, str);
    }

    public void o(int i17) {
        super.set(this.f246448d + 0, java.lang.Integer.valueOf(i17));
    }
}
