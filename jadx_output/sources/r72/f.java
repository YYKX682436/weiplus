package r72;

/* loaded from: classes16.dex */
public class f extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393137d;

    public f() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "label"), com.tencent.mm.protobuf.i.h(-1, "lat"), com.tencent.mm.protobuf.i.h(-1, "lng"), com.tencent.mm.protobuf.i.i(-1, "scale"), com.tencent.mm.protobuf.i.u(-1, "poiname"), com.tencent.mm.protobuf.i.u(-1, "poiid"), com.tencent.mm.protobuf.i.u(-1, "poiCategoryTips"), com.tencent.mm.protobuf.i.u(-1, "poiBusinessHour"), com.tencent.mm.protobuf.i.u(-1, "poiPhone"), com.tencent.mm.protobuf.i.g(-1, "poiPriceTips"), com.tencent.mm.protobuf.i.i(-1, "isfrompoilist"), com.tencent.mm.protobuf.i.u(-1, "buildingId"), com.tencent.mm.protobuf.i.u(-1, "floorName")});
        this.f393137d = appendAttrs;
        super.set__serialName("locitem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        java.lang.Double valueOf = java.lang.Double.valueOf(0.0d);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", valueOf, valueOf, 0, "", "", "", "", "", java.lang.Float.valueOf(0.0f), 0, "", ""});
    }

    public void A(double d17) {
        super.set(this.f393137d + 1, java.lang.Double.valueOf(d17));
    }

    public void B(double d17) {
        super.set(this.f393137d + 2, java.lang.Double.valueOf(d17));
    }

    public void C(java.lang.String str) {
        super.set(this.f393137d + 7, str);
    }

    public void E(java.lang.String str) {
        super.set(this.f393137d + 6, str);
    }

    public void F(java.lang.String str) {
        super.set(this.f393137d + 5, str);
    }

    public void G(java.lang.String str) {
        super.set(this.f393137d + 4, str);
    }

    public void H(java.lang.String str) {
        super.set(this.f393137d + 8, str);
    }

    public void I(float f17) {
        super.set(this.f393137d + 9, java.lang.Float.valueOf(f17));
    }

    public void J(int i17) {
        super.set(this.f393137d + 3, java.lang.Integer.valueOf(i17));
    }

    public java.lang.String getPoiId() {
        return super.getString(this.f393137d + 5);
    }

    public java.lang.String getPoiName() {
        return super.getString(this.f393137d + 4);
    }

    public java.lang.String j() {
        return super.getString(this.f393137d + 11);
    }

    public java.lang.String k() {
        return super.getString(this.f393137d + 12);
    }

    public java.lang.String l() {
        return super.getString(this.f393137d + 0);
    }

    public double n() {
        return super.getDouble(this.f393137d + 1);
    }

    public double o() {
        return super.getDouble(this.f393137d + 2);
    }

    public java.lang.String p() {
        return super.getString(this.f393137d + 7);
    }

    public java.lang.String q() {
        return super.getString(this.f393137d + 6);
    }

    public java.lang.String r() {
        return super.getString(this.f393137d + 8);
    }

    public float s() {
        return super.getFloat(this.f393137d + 9);
    }

    public int t() {
        return super.getInteger(this.f393137d + 3);
    }

    public int u() {
        return super.getInteger(this.f393137d + 10);
    }

    public void w(java.lang.String str) {
        super.set(this.f393137d + 11, str);
    }

    public void x(java.lang.String str) {
        super.set(this.f393137d + 12, str);
    }

    public void y(int i17) {
        super.set(this.f393137d + 10, java.lang.Integer.valueOf(i17));
    }

    public void z(java.lang.String str) {
        super.set(this.f393137d + 0, str);
    }
}
