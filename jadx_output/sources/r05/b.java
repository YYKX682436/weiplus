package r05;

/* loaded from: classes9.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f368358d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "designeruin"), com.tencent.mm.protobuf.i.u(-1, "designername"), com.tencent.mm.protobuf.i.u(-1, "designerrediretcturl")});
        this.f368358d = appendAttrs;
        super.set__serialName("AppMsgDesignerShared");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, "", ""});
    }

    public java.lang.String j() {
        return super.getString(this.f368358d + 1);
    }

    public java.lang.String k() {
        return super.getString(this.f368358d + 2);
    }

    public int l() {
        return super.getInteger(this.f368358d + 0);
    }

    public void n(java.lang.String str) {
        super.set(this.f368358d + 1, str);
    }

    public void o(java.lang.String str) {
        super.set(this.f368358d + 2, str);
    }

    public void p(int i17) {
        super.set(this.f368358d + 0, java.lang.Integer.valueOf(i17));
    }
}
