package pi3;

/* loaded from: classes12.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f354822d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "errType"), com.tencent.mm.protobuf.i.i(-1, "errCode"), com.tencent.mm.protobuf.i.u(-1, "errMsg"), com.tencent.mm.protobuf.i.i(-1, "cdnCode"), com.tencent.mm.protobuf.i.i(-1, "processKill")});
        this.f354822d = appendAttrs;
        super.set__serialName("msgFailInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, 0, "", 0, 0});
    }

    public int getErrCode() {
        return super.getInteger(this.f354822d + 1);
    }

    public java.lang.String getErrMsg() {
        return super.getString(this.f354822d + 2);
    }

    public int j() {
        return super.getInteger(this.f354822d + 3);
    }

    public int k() {
        return super.getInteger(this.f354822d + 4);
    }

    public void l(int i17) {
        super.set(this.f354822d + 1, java.lang.Integer.valueOf(i17));
    }

    public void n(java.lang.String str) {
        super.set(this.f354822d + 2, str);
    }

    public void o(int i17) {
        super.set(this.f354822d + 0, java.lang.Integer.valueOf(i17));
    }

    public void p(int i17) {
        super.set(this.f354822d + 4, java.lang.Integer.valueOf(i17));
    }
}
