package w05;

/* loaded from: classes9.dex */
public class e extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f441936d;

    public e() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "orderid"), com.tencent.mm.protobuf.i.u(-1, "skuimgurl"), com.tencent.mm.protobuf.i.u(-1, "skutitle"), com.tencent.mm.protobuf.i.u(-1, "skusaleparams"), com.tencent.mm.protobuf.i.n(-1, "skuprice"), com.tencent.mm.protobuf.i.n(-1, "giftstatus"), com.tencent.mm.protobuf.i.n(-1, "canChangeSku"), com.tencent.mm.protobuf.i.u(-1, "skuId"), com.tencent.mm.protobuf.i.u(-1, "statuswording"), com.tencent.mm.protobuf.i.n(-1, "statusstyle"), com.tencent.mm.protobuf.i.n(-1, "statusversion"), com.tencent.mm.protobuf.i.u(-1, "detailstatuswording"), com.tencent.mm.protobuf.i.u(-1, "presentcntwording"), com.tencent.mm.protobuf.i.i(-1, "delivery_method"), com.tencent.mm.protobuf.i.u(-1, "skutitletagname"), com.tencent.mm.protobuf.i.r(-1, "secret_present_info", w05.m.class)});
        this.f441936d = appendAttrs;
        super.set__serialName("gift");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", "", -1L, -1L, -1L, "", "", -1L, -1L, "", "", 0, "", null});
    }

    public void A(long j17) {
        super.set(this.f441936d + 9, java.lang.Long.valueOf(j17));
    }

    public void B(long j17) {
        super.set(this.f441936d + 10, java.lang.Long.valueOf(j17));
    }

    public void C(java.lang.String str) {
        super.set(this.f441936d + 8, str);
    }

    public int j() {
        return super.getInteger(this.f441936d + 13);
    }

    public java.lang.String k() {
        return super.getString(this.f441936d + 11);
    }

    public long l() {
        return super.getLong(this.f441936d + 5);
    }

    public java.lang.String n() {
        return super.getString(this.f441936d + 0);
    }

    public java.lang.String o() {
        return super.getString(this.f441936d + 12);
    }

    public w05.m p() {
        return (w05.m) super.getCustom(this.f441936d + 15);
    }

    public java.lang.String q() {
        return super.getString(this.f441936d + 1);
    }

    public java.lang.String r() {
        return super.getString(this.f441936d + 3);
    }

    public java.lang.String s() {
        return super.getString(this.f441936d + 2);
    }

    public java.lang.String t() {
        return super.getString(this.f441936d + 14);
    }

    public long u() {
        return super.getLong(this.f441936d + 9);
    }

    public long w() {
        return super.getLong(this.f441936d + 10);
    }

    public java.lang.String x() {
        return super.getString(this.f441936d + 8);
    }

    public void y(java.lang.String str) {
        super.set(this.f441936d + 11, str);
    }

    public void z(long j17) {
        super.set(this.f441936d + 5, java.lang.Long.valueOf(j17));
    }
}
