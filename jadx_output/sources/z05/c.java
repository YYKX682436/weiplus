package z05;

/* loaded from: classes9.dex */
public class c extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f469249d;

    public c() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH), com.tencent.mm.protobuf.i.u(-1, "query"), com.tencent.mm.protobuf.i.u(-1, dm.i4.COL_ID), com.tencent.mm.protobuf.i.i(-1, ya.b.SOURCE), com.tencent.mm.protobuf.i.i(-1, "istransparent"), com.tencent.mm.protobuf.i.u(-1, "minversion"), com.tencent.mm.protobuf.i.i(-1, "hideicon"), com.tencent.mm.protobuf.i.i(-1, "forbidforward"), com.tencent.mm.protobuf.i.u(-1, "imageConf"), com.tencent.mm.protobuf.i.u(-1, "transformedThumbUrl"), com.tencent.mm.protobuf.i.r(-1, "oldImageCDNInfo", z05.e.class)});
        this.f469249d = appendAttrs;
        super.set__serialName(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP);
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", 0, 0, null, 0, 0, null, null, null});
    }

    public java.lang.String getId() {
        return super.getString(this.f469249d + 2);
    }

    public java.lang.String getPath() {
        return super.getString(this.f469249d + 0);
    }

    public int getSource() {
        return super.getInteger(this.f469249d + 3);
    }

    public int j() {
        return super.getInteger(this.f469249d + 7);
    }

    public int k() {
        return super.getInteger(this.f469249d + 6);
    }

    public java.lang.String l() {
        return super.getString(this.f469249d + 8);
    }

    public java.lang.String n() {
        return super.getString(this.f469249d + 5);
    }

    public z05.e o() {
        return (z05.e) super.getCustom(this.f469249d + 10);
    }

    public java.lang.String p() {
        return super.getString(this.f469249d + 1);
    }

    public java.lang.String q() {
        return super.getString(this.f469249d + 9);
    }

    public int r() {
        return super.getInteger(this.f469249d + 4);
    }

    public void s(java.lang.String str) {
        super.set(this.f469249d + 8, str);
    }

    public void t(z05.e eVar) {
        super.set(this.f469249d + 10, eVar);
    }

    public void u(java.lang.String str) {
        super.set(this.f469249d + 9, str);
    }
}
