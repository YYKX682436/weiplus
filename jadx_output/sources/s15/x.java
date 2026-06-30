package s15;

/* loaded from: classes9.dex */
public class x extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402183d;

    public x() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH), com.tencent.mm.protobuf.i.u(-1, "query"), com.tencent.mm.protobuf.i.u(-1, "appId"), com.tencent.mm.protobuf.i.i(-1, ya.b.SOURCE), com.tencent.mm.protobuf.i.i(-1, "istransparent"), com.tencent.mm.protobuf.i.u(-1, "minversion"), com.tencent.mm.protobuf.i.i(-1, "hideicon"), com.tencent.mm.protobuf.i.i(-1, "forbidforward"), com.tencent.mm.protobuf.i.r(-1, "imageConf", s15.c.class), com.tencent.mm.protobuf.i.r(-1, "oldImageCDNInfo", z05.e.class)});
        this.f402183d = appendAttrs;
        super.set__serialName("RecordLiteAppItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", 0, 0, null, 0, 0, null, null});
    }

    public java.lang.String getAppId() {
        return super.getString(this.f402183d + 2);
    }

    public java.lang.String getPath() {
        return super.getString(this.f402183d + 0);
    }

    public s15.c j() {
        return (s15.c) super.getCustom(this.f402183d + 8);
    }

    public java.lang.String k() {
        return super.getString(this.f402183d + 5);
    }

    public java.lang.String l() {
        return super.getString(this.f402183d + 1);
    }

    public int n() {
        return super.getInteger(this.f402183d + 4);
    }

    public void o(java.lang.String str) {
        super.set(this.f402183d + 2, str);
    }

    public void p(int i17) {
        super.set(this.f402183d + 6, java.lang.Integer.valueOf(i17));
    }

    public void q(s15.c cVar) {
        super.set(this.f402183d + 8, cVar);
    }

    public void r(java.lang.String str) {
        super.set(this.f402183d + 5, str);
    }

    public void s(z05.e eVar) {
        super.set(this.f402183d + 9, eVar);
    }

    public void t(java.lang.String str) {
        super.set(this.f402183d + 0, str);
    }

    public void u(java.lang.String str) {
        super.set(this.f402183d + 1, str);
    }

    public void w(int i17) {
        super.set(this.f402183d + 3, java.lang.Integer.valueOf(i17));
    }

    public void x(int i17) {
        super.set(this.f402183d + 4, java.lang.Integer.valueOf(i17));
    }
}
