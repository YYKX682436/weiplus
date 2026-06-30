package o15;

/* loaded from: classes9.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f342327d;

    public a() {
        com.tencent.mm.protobuf.k h17 = com.tencent.mm.protobuf.i.h(-1, "x");
        h17.f192167h = true;
        com.tencent.mm.protobuf.k h18 = com.tencent.mm.protobuf.i.h(-1, "y");
        h18.f192167h = true;
        com.tencent.mm.protobuf.k c17 = com.tencent.mm.protobuf.i.c(-1, "isFromPoiList");
        c17.f192167h = true;
        com.tencent.mm.protobuf.k g17 = com.tencent.mm.protobuf.i.g(-1, "poiPriceTips");
        g17.f192167h = true;
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{h17, h18, com.tencent.mm.protobuf.i.j(-1, "scale"), com.tencent.mm.protobuf.i.v(-1, "label"), com.tencent.mm.protobuf.i.v(-1, "poiname"), com.tencent.mm.protobuf.i.v(-1, "infourl"), com.tencent.mm.protobuf.i.v(-1, "maptype"), com.tencent.mm.protobuf.i.v(-1, "poiid"), c17, com.tencent.mm.protobuf.i.v(-1, "poiCategoryTips"), com.tencent.mm.protobuf.i.v(-1, "poiBusinessHour"), com.tencent.mm.protobuf.i.v(-1, "poiPhone"), g17, com.tencent.mm.protobuf.i.v(-1, "buildingId"), com.tencent.mm.protobuf.i.v(-1, "floorName")});
        this.f342327d = appendAttrs;
        super.set__serialName(ya.b.LOCATION);
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        java.lang.Double valueOf = java.lang.Double.valueOf(0.0d);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{valueOf, valueOf, 0, null, null, null, null, null, java.lang.Boolean.FALSE, null, null, null, java.lang.Float.valueOf(0.0f), null, null});
    }

    public void A(java.lang.String str) {
        super.set(this.f342327d + 7, str);
    }

    public void B(java.lang.String str) {
        super.set(this.f342327d + 4, str);
    }

    public void C(int i17) {
        super.set(this.f342327d + 2, java.lang.Integer.valueOf(i17));
    }

    public void E(double d17) {
        super.set(this.f342327d + 0, java.lang.Double.valueOf(d17));
    }

    public void F(double d17) {
        super.set(this.f342327d + 1, java.lang.Double.valueOf(d17));
    }

    public java.lang.String j() {
        return super.getString(this.f342327d + 13);
    }

    public java.lang.String k() {
        return super.getString(this.f342327d + 14);
    }

    public java.lang.String l() {
        return super.getString(this.f342327d + 3);
    }

    public java.lang.String n() {
        return super.getString(this.f342327d + 10);
    }

    public java.lang.String o() {
        return super.getString(this.f342327d + 9);
    }

    public java.lang.String p() {
        return super.getString(this.f342327d + 11);
    }

    public float q() {
        return super.getFloat(this.f342327d + 12);
    }

    public java.lang.String r() {
        return super.getString(this.f342327d + 7);
    }

    public java.lang.String s() {
        return super.getString(this.f342327d + 4);
    }

    public int t() {
        return super.getInteger(this.f342327d + 2);
    }

    public double u() {
        return super.getDouble(this.f342327d + 0);
    }

    public double w() {
        return super.getDouble(this.f342327d + 1);
    }

    public boolean x() {
        return super.getBoolean(this.f342327d + 8);
    }

    public void y(java.lang.String str) {
        super.set(this.f342327d + 3, str);
    }

    public void z(java.lang.String str) {
        super.set(this.f342327d + 6, str);
    }
}
