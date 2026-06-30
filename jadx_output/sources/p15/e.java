package p15;

/* loaded from: classes12.dex */
public class e extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f351255d;

    public e() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "sec_msg_node", p15.s.class), com.tencent.mm.protobuf.i.i(-1, "silence"), com.tencent.mm.protobuf.i.i(-1, "membercount"), com.tencent.mm.protobuf.i.u(-1, "NotAutoDownloadRange"), com.tencent.mm.protobuf.i.u(-1, "signature"), com.tencent.mm.protobuf.i.i(-1, "bizflag"), com.tencent.mm.protobuf.i.r(-1, "alnode", p15.f.class), com.tencent.mm.protobuf.i.r(-1, "share_msg", p15.t.class), com.tencent.mm.protobuf.i.u(-1, "atuserlist"), com.tencent.mm.protobuf.i.r(-1, "mediaeditcontent", p15.p.class), com.tencent.mm.protobuf.i.r(-1, "passthrough", p15.q.class), com.tencent.mm.protobuf.i.r(-1, "tmp_node", p15.v.class), com.tencent.mm.protobuf.i.r(-1, "imgmsg_pd", p15.l.class), com.tencent.mm.protobuf.i.r(-1, "videomsg_pd", p15.w.class), com.tencent.mm.protobuf.i.r(-1, "appmsg_pd", p15.k.class), com.tencent.mm.protobuf.i.r(-1, "bizmsg", p15.g.class), com.tencent.mm.protobuf.i.r(-1, "kf", p15.o.class), com.tencent.mm.protobuf.i.r(-1, "enterprise_info", p15.j.class), com.tencent.mm.protobuf.i.r(-1, "strangerantispamticket", p15.u.class), com.tencent.mm.protobuf.i.i(-1, "DownloadLimitKbps"), com.tencent.mm.protobuf.i.i(-1, "videopreloadlen"), com.tencent.mm.protobuf.i.i(-1, "PreDownload"), com.tencent.mm.protobuf.i.i(-1, "PreDownloadNetType"), com.tencent.mm.protobuf.i.u(-1, "NoPreDownloadRange"), com.tencent.mm.protobuf.i.i(-1, "msg_cluster_type"), com.tencent.mm.protobuf.i.i(-1, "service_type"), com.tencent.mm.protobuf.i.i(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.r(-1, "wxaInfo", p15.x.class), com.tencent.mm.protobuf.i.r(-1, "mpInfo", p15.h.class), com.tencent.mm.protobuf.i.u(-1, "realcreatetime"), com.tencent.mm.protobuf.i.r(-1, "code_info", p15.r.class), com.tencent.mm.protobuf.i.u(-1, "byp_sessionId"), com.tencent.mm.protobuf.i.i(-1, "eggIncluded"), com.tencent.mm.protobuf.i.i(-1, "eggBlocked"), com.tencent.mm.protobuf.i.n(-1, "eggSeed"), com.tencent.mm.protobuf.i.u(-1, "weappsourceUsername"), com.tencent.mm.protobuf.i.u(-1, "live")});
        this.f351255d = appendAttrs;
        super.set__serialName("msgsource");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, 0, 0, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
    }

    public void A(p15.q qVar) {
        super.set(this.f351255d + 10, qVar);
    }

    public void B(java.lang.String str) {
        super.set(this.f351255d + 29, str);
    }

    public void C(p15.s sVar) {
        super.set(this.f351255d + 0, sVar);
    }

    public void E(p15.v vVar) {
        super.set(this.f351255d + 11, vVar);
    }

    public void F(java.lang.String str) {
        super.set(this.f351255d + 35, str);
    }

    public void G(p15.x xVar) {
        super.set(this.f351255d + 27, xVar);
    }

    @Override // e14.l
    public boolean checkValueSkip(java.lang.String fieldSerializeName, java.lang.Object obj, boolean z17) {
        kotlin.jvm.internal.o.g(fieldSerializeName, "fieldSerializeName");
        if (kotlin.jvm.internal.o.b(fieldSerializeName, "live")) {
            return false;
        }
        return super.checkValueSkip(fieldSerializeName, obj, z17);
    }

    public p15.f j() {
        return (p15.f) super.getCustom(this.f351255d + 6);
    }

    public p15.r k() {
        return (p15.r) super.getCustom(this.f351255d + 30);
    }

    public java.lang.Integer l() {
        return super.getIntegerWrapper(this.f351255d + 32);
    }

    public java.lang.Long n() {
        return super.getLongWrapper(this.f351255d + 34);
    }

    public p15.p o() {
        return (p15.p) super.getCustom(this.f351255d + 9);
    }

    public p15.q p() {
        return (p15.q) super.getCustom(this.f351255d + 10);
    }

    public p15.s q() {
        return (p15.s) super.getCustom(this.f351255d + 0);
    }

    public p15.v r() {
        return (p15.v) super.getCustom(this.f351255d + 11);
    }

    public java.lang.String s() {
        return super.getString(this.f351255d + 35);
    }

    public p15.x t() {
        return (p15.x) super.getCustom(this.f351255d + 27);
    }

    public void u(p15.f fVar) {
        super.set(this.f351255d + 6, fVar);
    }

    public void w(p15.r rVar) {
        super.set(this.f351255d + 30, rVar);
    }

    public void x(java.lang.Integer num) {
        super.set(this.f351255d + 32, num);
    }

    public void y(java.lang.Long l17) {
        super.set(this.f351255d + 34, l17);
    }

    public void z(p15.p pVar) {
        super.set(this.f351255d + 9, pVar);
    }
}
