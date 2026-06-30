package s15;

/* loaded from: classes9.dex */
public class y extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402184d;

    public y() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "label"), com.tencent.mm.protobuf.i.h(-1, "lat"), com.tencent.mm.protobuf.i.h(-1, "lng"), com.tencent.mm.protobuf.i.i(-1, "scale"), com.tencent.mm.protobuf.i.u(-1, "poiname"), com.tencent.mm.protobuf.i.u(-1, "poiid"), com.tencent.mm.protobuf.i.u(-1, "poiCategoryTips"), com.tencent.mm.protobuf.i.u(-1, "poiBusinessHour"), com.tencent.mm.protobuf.i.u(-1, "poiPhone"), com.tencent.mm.protobuf.i.g(-1, "poiPriceTips"), com.tencent.mm.protobuf.i.c(-1, "isFromPoiList"), com.tencent.mm.protobuf.i.u(-1, "buildingId"), com.tencent.mm.protobuf.i.u(-1, "floorName")});
        this.f402184d = appendAttrs;
        super.set__serialName("RecordLocationItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        java.lang.Double valueOf = java.lang.Double.valueOf(0.0d);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", valueOf, valueOf, 0, "", "", "", "", "", java.lang.Float.valueOf(0.0f), java.lang.Boolean.FALSE, "", ""});
    }

    public void A(float f17) {
        super.set(this.f402184d + 9, java.lang.Float.valueOf(f17));
    }

    public void B(java.lang.String str) {
        super.set(this.f402184d + 5, str);
    }

    public void C(int i17) {
        super.set(this.f402184d + 3, java.lang.Integer.valueOf(i17));
    }

    public java.lang.String getPoiName() {
        return super.getString(this.f402184d + 4);
    }

    public java.lang.String j() {
        return super.getString(this.f402184d + 0);
    }

    public double k() {
        return super.getDouble(this.f402184d + 1);
    }

    public double l() {
        return super.getDouble(this.f402184d + 2);
    }

    public java.lang.String n() {
        return super.getString(this.f402184d + 5);
    }

    public int o() {
        return super.getInteger(this.f402184d + 3);
    }

    public void p(java.lang.String str) {
        super.set(this.f402184d + 11, str);
    }

    public void q(java.lang.String str) {
        super.set(this.f402184d + 12, str);
    }

    public void r(boolean z17) {
        super.set(this.f402184d + 10, java.lang.Boolean.valueOf(z17));
    }

    public void s(java.lang.String str) {
        super.set(this.f402184d + 0, str);
    }

    public void t(double d17) {
        super.set(this.f402184d + 1, java.lang.Double.valueOf(d17));
    }

    public void u(double d17) {
        super.set(this.f402184d + 2, java.lang.Double.valueOf(d17));
    }

    public void w(java.lang.String str) {
        super.set(this.f402184d + 7, str);
    }

    public void x(java.lang.String str) {
        super.set(this.f402184d + 6, str);
    }

    public void y(java.lang.String str) {
        super.set(this.f402184d + 4, str);
    }

    public void z(java.lang.String str) {
        super.set(this.f402184d + 8, str);
    }
}
