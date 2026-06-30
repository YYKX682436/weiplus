package r72;

/* loaded from: classes16.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393130d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.u(-1, "appid"), com.tencent.mm.protobuf.i.i(-1, "pkgtype"), com.tencent.mm.protobuf.i.u(-1, "iconurl"), com.tencent.mm.protobuf.i.i(-1, "type"), com.tencent.mm.protobuf.i.u(-1, "pagepath"), com.tencent.mm.protobuf.i.u(-1, "sourcedisplayname"), com.tencent.mm.protobuf.i.i(-1, "version"), com.tencent.mm.protobuf.i.i(-1, "disableforward"), com.tencent.mm.protobuf.i.i(-1, "tradingguaranteeflag"), com.tencent.mm.protobuf.i.i(-1, "showRelievedBuyFlag"), com.tencent.mm.protobuf.i.u(-1, "messageextradata"), com.tencent.mm.protobuf.i.i(-1, "subtype")});
        this.f393130d = appendAttrs;
        super.set__serialName("appbranditem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", 0, "", 0, "", "", 0, 0, 0, 0, "", 0});
    }

    public void A(java.lang.String str) {
        super.set(this.f393130d + 6, str);
    }

    public void B(int i17) {
        super.set(this.f393130d + 12, java.lang.Integer.valueOf(i17));
    }

    public void C(int i17) {
        super.set(this.f393130d + 9, java.lang.Integer.valueOf(i17));
    }

    public void E(int i17) {
        super.set(this.f393130d + 4, java.lang.Integer.valueOf(i17));
    }

    public void F(java.lang.String str) {
        super.set(this.f393130d + 0, str);
    }

    public void G(int i17) {
        super.set(this.f393130d + 7, java.lang.Integer.valueOf(i17));
    }

    public java.lang.String getAppid() {
        return super.getString(this.f393130d + 1);
    }

    public java.lang.String getIconUrl() {
        return super.getString(this.f393130d + 3);
    }

    public int getSubType() {
        return super.getInteger(this.f393130d + 12);
    }

    public int getType() {
        return super.getInteger(this.f393130d + 4);
    }

    public int getVersion() {
        return super.getInteger(this.f393130d + 7);
    }

    public int j() {
        return super.getInteger(this.f393130d + 8);
    }

    public java.lang.String k() {
        return super.getString(this.f393130d + 11);
    }

    public java.lang.String l() {
        return super.getString(this.f393130d + 5);
    }

    public int n() {
        return super.getInteger(this.f393130d + 2);
    }

    public int o() {
        return super.getInteger(this.f393130d + 10);
    }

    public java.lang.String p() {
        return super.getString(this.f393130d + 6);
    }

    @Override // e14.l
    public boolean processXmlValueUseCData(java.lang.Object value, java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(tagName, "tagName");
        kotlin.jvm.internal.o.g(itemTagName, "itemTagName");
        if (kotlin.jvm.internal.o.b(tagName, "messageextradata")) {
            return true;
        }
        return super.processXmlValueUseCData(value, tagName, itemTagName, z17);
    }

    public int q() {
        return super.getInteger(this.f393130d + 9);
    }

    public java.lang.String r() {
        return super.getString(this.f393130d + 0);
    }

    public void s(java.lang.String str) {
        super.set(this.f393130d + 1, str);
    }

    public void t(int i17) {
        super.set(this.f393130d + 8, java.lang.Integer.valueOf(i17));
    }

    public void u(java.lang.String str) {
        super.set(this.f393130d + 3, str);
    }

    public void w(java.lang.String str) {
        super.set(this.f393130d + 11, str);
    }

    public void x(java.lang.String str) {
        super.set(this.f393130d + 5, str);
    }

    public void y(int i17) {
        super.set(this.f393130d + 2, java.lang.Integer.valueOf(i17));
    }

    public void z(int i17) {
        super.set(this.f393130d + 10, java.lang.Integer.valueOf(i17));
    }
}
