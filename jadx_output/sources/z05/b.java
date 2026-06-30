package z05;

/* loaded from: classes9.dex */
public class b extends r05.k {

    /* renamed from: e, reason: collision with root package name */
    public final int f469248e;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "bizData"), com.tencent.mm.protobuf.i.u(-1, com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY), com.tencent.mm.protobuf.i.u(-1, "gameShareId"), com.tencent.mm.protobuf.i.u(-1, "gameShareData"), com.tencent.mm.protobuf.i.u(-1, "isVideo"), com.tencent.mm.protobuf.i.u(-1, "duration")});
        this.f469248e = appendAttrs;
        super.set__serialName("gamesharecardmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, null, null, null, null});
    }

    public java.lang.String j() {
        return super.getString(this.f469248e + 0);
    }

    public java.lang.String k() {
        return super.getString(this.f469248e + 5);
    }

    public java.lang.String l() {
        return super.getString(this.f469248e + 3);
    }

    public java.lang.String n() {
        return super.getString(this.f469248e + 2);
    }

    public java.lang.String o() {
        return super.getString(this.f469248e + 1);
    }

    public java.lang.String p() {
        return super.getString(this.f469248e + 4);
    }

    public void q(java.lang.String str) {
        super.set(this.f469248e + 0, str);
    }

    public void r(java.lang.String str) {
        super.set(this.f469248e + 5, str);
    }

    public void s(java.lang.String str) {
        super.set(this.f469248e + 3, str);
    }

    public void t(java.lang.String str) {
        super.set(this.f469248e + 2, str);
    }

    public void u(java.lang.String str) {
        super.set(this.f469248e + 1, str);
    }

    public void w(java.lang.String str) {
        super.set(this.f469248e + 4, str);
    }
}
