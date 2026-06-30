package w05;

/* loaded from: classes9.dex */
public final class h extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f441939d;

    public h() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "cardType"), com.tencent.mm.protobuf.i.i(-1, "cardVersion"), com.tencent.mm.protobuf.i.u(-1, "realAppId"), com.tencent.mm.protobuf.i.n(-1, "activityId"), com.tencent.mm.protobuf.i.n(-1, "bulkId"), com.tencent.mm.protobuf.i.u(-1, "ecsJumpInfoBase64"), com.tencent.mm.protobuf.i.u(-1, "ecmsgsignature"), com.tencent.mm.protobuf.i.u(-1, "sceneNote"), com.tencent.mm.protobuf.i.u(-1, "reportExtraInfoJson"), com.tencent.mm.protobuf.i.u(-1, "bizReportData"), com.tencent.mm.protobuf.i.u(-1, "friendReceiveTitle"), com.tencent.mm.protobuf.i.u(-1, "friendReceiveDesc"), com.tencent.mm.protobuf.i.u(-1, "friendReceiveSourceName"), com.tencent.mm.protobuf.i.u(-1, "friendReceiveImageUrl"), com.tencent.mm.protobuf.i.u(-1, "passBuffer"), com.tencent.mm.protobuf.i.i(-1, "fetchAndPreloadFlags")});
        this.f441939d = appendAttrs;
        super.set__serialName("ecsInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, 0, "", 0L, 0L, "", "", "", "", "", "", "", "", "", "", 0});
    }

    public java.lang.String A() {
        return super.getString(this.f441939d + 7);
    }

    public final boolean B() {
        int i17 = this.f441939d;
        return super.getLong(i17 + 4) > 0 && super.getLong(i17 + 3) > 0 && !com.tencent.mm.sdk.platformtools.t8.K0(super.getString(i17 + 2));
    }

    public final boolean C() {
        int i17 = this.f441939d;
        return (super.getInteger(i17 + 0) != 9 || com.tencent.mm.sdk.platformtools.t8.K0(super.getString(i17 + 10)) || com.tencent.mm.sdk.platformtools.t8.K0(super.getString(i17 + 11)) || com.tencent.mm.sdk.platformtools.t8.K0(super.getString(i17 + 12)) || com.tencent.mm.sdk.platformtools.t8.K0(super.getString(i17 + 13))) ? false : true;
    }

    public void E(long j17) {
        super.set(this.f441939d + 3, java.lang.Long.valueOf(j17));
    }

    public void F(java.lang.String str) {
        super.set(this.f441939d + 9, str);
    }

    public void G(long j17) {
        super.set(this.f441939d + 4, java.lang.Long.valueOf(j17));
    }

    public void H(int i17) {
        super.set(this.f441939d + 0, java.lang.Integer.valueOf(i17));
    }

    public void I(int i17) {
        super.set(this.f441939d + 1, java.lang.Integer.valueOf(i17));
    }

    public void J(java.lang.String str) {
        super.set(this.f441939d + 6, str);
    }

    public void K(java.lang.String str) {
        super.set(this.f441939d + 5, str);
    }

    public void L(int i17) {
        super.set(this.f441939d + 15, java.lang.Integer.valueOf(i17));
    }

    public void N(java.lang.String str) {
        super.set(this.f441939d + 11, str);
    }

    public void O(java.lang.String str) {
        super.set(this.f441939d + 13, str);
    }

    public void P(java.lang.String str) {
        super.set(this.f441939d + 12, str);
    }

    public void Q(java.lang.String str) {
        super.set(this.f441939d + 10, str);
    }

    public void R(java.lang.String str) {
        super.set(this.f441939d + 14, str);
    }

    public void S(java.lang.String str) {
        super.set(this.f441939d + 2, str);
    }

    public void T(java.lang.String str) {
        super.set(this.f441939d + 8, str);
    }

    public void U(java.lang.String str) {
        super.set(this.f441939d + 7, str);
    }

    public long j() {
        return super.getLong(this.f441939d + 3);
    }

    public java.lang.String k() {
        return super.getString(this.f441939d + 9);
    }

    public long l() {
        return super.getLong(this.f441939d + 4);
    }

    public int n() {
        return super.getInteger(this.f441939d + 0);
    }

    public int o() {
        return super.getInteger(this.f441939d + 1);
    }

    public java.lang.String p() {
        return super.getString(this.f441939d + 6);
    }

    public java.lang.String q() {
        return super.getString(this.f441939d + 5);
    }

    public int r() {
        return super.getInteger(this.f441939d + 15);
    }

    public java.lang.String s() {
        return super.getString(this.f441939d + 11);
    }

    public java.lang.String t() {
        return super.getString(this.f441939d + 13);
    }

    public java.lang.String u() {
        return super.getString(this.f441939d + 12);
    }

    public java.lang.String w() {
        return super.getString(this.f441939d + 10);
    }

    public java.lang.String x() {
        return super.getString(this.f441939d + 14);
    }

    public java.lang.String y() {
        return super.getString(this.f441939d + 2);
    }

    public java.lang.String z() {
        return super.getString(this.f441939d + 8);
    }
}
