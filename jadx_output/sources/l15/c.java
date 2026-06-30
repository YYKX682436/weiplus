package l15;

/* loaded from: classes9.dex */
public class c extends l15.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f315012d;

    public c() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "appmsg", v05.b.class), com.tencent.mm.protobuf.i.u(-1, "ShakePageResult"), com.tencent.mm.protobuf.i.u(-1, "fromusername"), com.tencent.mm.protobuf.i.i(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.r(-1, "appinfo", l15.b.class), com.tencent.mm.protobuf.i.u(-1, "commenturl"), com.tencent.mm.protobuf.i.r(-1, "liteappmsg", z05.d.class), com.tencent.mm.protobuf.i.r(-1, "gamesharecardmsg", z05.b.class), com.tencent.mm.protobuf.i.r(-1, "extcommoninfo", r15.b.class), com.tencent.mm.protobuf.i.r(-1, "forwardmediainfo", f15.a.class)});
        this.f315012d = appendAttrs;
        super.set__serialName("msg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, "", null, 0, null, null, null, null, null, null});
    }

    public java.lang.String getFromUsername() {
        return super.getString(this.f315012d + 2);
    }

    public l15.b j() {
        return (l15.b) super.getCustom(this.f315012d + 4);
    }

    public v05.b k() {
        return (v05.b) super.getCustom(this.f315012d + 0);
    }

    public r15.b l() {
        return (r15.b) super.getCustom(this.f315012d + 8);
    }

    public f15.a n() {
        return (f15.a) super.getCustom(this.f315012d + 9);
    }

    public z05.b o() {
        return (z05.b) super.getCustom(this.f315012d + 7);
    }

    public z05.d p() {
        return (z05.d) super.getCustom(this.f315012d + 6);
    }

    public void q(v05.b bVar) {
        super.set(this.f315012d + 0, bVar);
    }

    public void r(r15.b bVar) {
        super.set(this.f315012d + 8, bVar);
    }

    public void s(f15.a aVar) {
        super.set(this.f315012d + 9, aVar);
    }

    public void t(z05.b bVar) {
        super.set(this.f315012d + 7, bVar);
    }

    public void u(z05.d dVar) {
        super.set(this.f315012d + 6, dVar);
    }
}
