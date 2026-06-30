package s15;

/* loaded from: classes9.dex */
public class b0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402154d;

    public b0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.u(-1, "nickname"), com.tencent.mm.protobuf.i.u(-1, "brandIconUrl"), com.tencent.mm.protobuf.i.i(-1, "certFlag"), com.tencent.mm.protobuf.i.i(-1, "brandType")});
        this.f402154d = appendAttrs;
        super.set__serialName("RecordPhotoAccountShareNameCardItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", 0, 0});
    }

    public void j(java.lang.String str) {
        super.set(this.f402154d + 2, str);
    }

    public void k(int i17) {
        super.set(this.f402154d + 4, java.lang.Integer.valueOf(i17));
    }

    public void l(int i17) {
        super.set(this.f402154d + 3, java.lang.Integer.valueOf(i17));
    }

    public void n(java.lang.String str) {
        super.set(this.f402154d + 1, str);
    }

    public void o(java.lang.String str) {
        super.set(this.f402154d + 0, str);
    }
}
