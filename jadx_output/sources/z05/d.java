package z05;

/* loaded from: classes9.dex */
public class d extends r05.k {

    /* renamed from: e, reason: collision with root package name */
    public final int f469250e;

    public d() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE), com.tencent.mm.protobuf.i.u(-1, "query"), com.tencent.mm.protobuf.i.u(-1, "minVersion"), com.tencent.mm.protobuf.i.u(-1, "srcId"), com.tencent.mm.protobuf.i.u(-1, ya.b.SOURCE), com.tencent.mm.protobuf.i.u(-1, "isGameShareCard"), com.tencent.mm.protobuf.i.c(-1, "isTransparent"), com.tencent.mm.protobuf.i.c(-1, "hideIcon"), com.tencent.mm.protobuf.i.c(-1, "forbidForward")});
        this.f469250e = appendAttrs;
        super.set__serialName("liteappmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, null, null, null, null, bool, bool, bool});
    }

    public void A(java.lang.String str) {
        super.set(this.f469250e + 3, str);
    }

    public void B(boolean z17) {
        super.set(this.f469250e + 6, java.lang.Boolean.valueOf(z17));
    }

    public boolean j() {
        return super.getBoolean(this.f469250e + 8);
    }

    public boolean k() {
        return super.getBoolean(this.f469250e + 7);
    }

    public java.lang.String l() {
        return super.getString(this.f469250e + 2);
    }

    public java.lang.String n() {
        return super.getString(this.f469250e + 0);
    }

    public java.lang.String o() {
        return super.getString(this.f469250e + 1);
    }

    public java.lang.String p() {
        return super.getString(this.f469250e + 4);
    }

    public java.lang.String q() {
        return super.getString(this.f469250e + 3);
    }

    public boolean r() {
        return super.getBoolean(this.f469250e + 6);
    }

    public void s(boolean z17) {
        super.set(this.f469250e + 8, java.lang.Boolean.valueOf(z17));
    }

    public void t(java.lang.String str) {
        super.set(this.f469250e + 5, str);
    }

    public void u(boolean z17) {
        super.set(this.f469250e + 7, java.lang.Boolean.valueOf(z17));
    }

    public void w(java.lang.String str) {
        super.set(this.f469250e + 2, str);
    }

    public void x(java.lang.String str) {
        super.set(this.f469250e + 0, str);
    }

    public void y(java.lang.String str) {
        super.set(this.f469250e + 1, str);
    }

    public void z(java.lang.String str) {
        super.set(this.f469250e + 4, str);
    }
}
