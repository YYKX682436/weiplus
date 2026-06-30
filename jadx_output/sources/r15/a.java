package r15;

/* loaded from: classes5.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f368640d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "type"), com.tencent.mm.protobuf.i.n(-1, "svrid"), com.tencent.mm.protobuf.i.u(-1, "fromusr"), com.tencent.mm.protobuf.i.u(-1, "chatusr"), com.tencent.mm.protobuf.i.u(-1, "displayname"), com.tencent.mm.protobuf.i.u(-1, "content"), com.tencent.mm.protobuf.i.u(-1, "msgsource"), com.tencent.mm.protobuf.i.u(-1, "strid"), com.tencent.mm.protobuf.i.n(-1, "createtime"), com.tencent.mm.protobuf.i.r(-1, "partialtext", r15.g.class)});
        this.f368640d = appendAttrs;
        super.set__serialName("refermsg");
        super.set__xmlPrefixTag("msg.appmsg");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, 0L, "", "", "", "", "", "", 0L, null});
    }

    public void A(long j17) {
        super.set(this.f368640d + 1, java.lang.Long.valueOf(j17));
    }

    public void B(int i17) {
        super.set(this.f368640d + 0, java.lang.Integer.valueOf(i17));
    }

    public java.lang.String getContent() {
        return super.getString(this.f368640d + 5);
    }

    public long getCreateTime() {
        return super.getLong(this.f368640d + 8);
    }

    public int getType() {
        return super.getInteger(this.f368640d + 0);
    }

    public java.lang.String j() {
        return super.getString(this.f368640d + 3);
    }

    public java.lang.String k() {
        return super.getString(this.f368640d + 4);
    }

    public java.lang.String l() {
        return super.getString(this.f368640d + 2);
    }

    public java.lang.String n() {
        return super.getString(this.f368640d + 6);
    }

    public r15.g o() {
        return (r15.g) super.getCustom(this.f368640d + 9);
    }

    public java.lang.String p() {
        return super.getString(this.f368640d + 7);
    }

    public long q() {
        return super.getLong(this.f368640d + 1);
    }

    public void r(java.lang.String str) {
        super.set(this.f368640d + 3, str);
    }

    public void s(java.lang.String str) {
        super.set(this.f368640d + 5, str);
    }

    public void t(long j17) {
        super.set(this.f368640d + 8, java.lang.Long.valueOf(j17));
    }

    public void u(java.lang.String str) {
        super.set(this.f368640d + 4, str);
    }

    public void w(java.lang.String str) {
        super.set(this.f368640d + 2, str);
    }

    public void x(java.lang.String str) {
        super.set(this.f368640d + 6, str);
    }

    public void y(r15.g gVar) {
        super.set(this.f368640d + 9, gVar);
    }

    public void z(java.lang.String str) {
        super.set(this.f368640d + 7, str);
    }
}
