package w15;

/* loaded from: classes5.dex */
public class d extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f442245d;

    public d() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.c(-1, "isRead"), com.tencent.mm.protobuf.i.u(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.u(-1, "reEditStringContent"), com.tencent.mm.protobuf.i.n(-1, "reEditMsgSvrId"), com.tencent.mm.protobuf.i.u(-1, "stringContent"), com.tencent.mm.protobuf.i.n(-1, "reEditServerTime"), com.tencent.mm.protobuf.i.i(-1, "canReEdit"), com.tencent.mm.protobuf.i.u(-1, "reEditAtUserList"), com.tencent.mm.protobuf.i.n(-1, "reEditType")});
        this.f442245d = appendAttrs;
        super.set__serialName("link");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{java.lang.Boolean.FALSE, "", "", 0L, "", 0L, 0, "", 0L});
    }

    public java.lang.String getScene() {
        return super.getString(this.f442245d + 1);
    }

    public int j() {
        return super.getInteger(this.f442245d + 6);
    }

    public java.lang.String k() {
        return super.getString(this.f442245d + 7);
    }

    public long l() {
        return super.getLong(this.f442245d + 5);
    }

    public long n() {
        return super.getLong(this.f442245d + 8);
    }

    public java.lang.String o() {
        return super.getString(this.f442245d + 4);
    }

    public void p(int i17) {
        super.set(this.f442245d + 6, java.lang.Integer.valueOf(i17));
    }

    public void q(java.lang.String str) {
        super.set(this.f442245d + 7, str);
    }

    public void r(long j17) {
        super.set(this.f442245d + 3, java.lang.Long.valueOf(j17));
    }

    public void s(long j17) {
        super.set(this.f442245d + 5, java.lang.Long.valueOf(j17));
    }

    public void t(long j17) {
        super.set(this.f442245d + 8, java.lang.Long.valueOf(j17));
    }

    public void u(java.lang.String str) {
        super.set(this.f442245d + 1, str);
    }

    public void w(java.lang.String str) {
        super.set(this.f442245d + 4, str);
    }
}
