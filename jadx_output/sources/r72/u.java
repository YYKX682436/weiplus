package r72;

/* loaded from: classes16.dex */
public class u extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393158d;

    public u() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "topic"), com.tencent.mm.protobuf.i.i(-1, "topicType"), com.tencent.mm.protobuf.i.u(-1, "fromFeedId"), com.tencent.mm.protobuf.i.u(-1, "iconUrl"), com.tencent.mm.protobuf.i.u(-1, "desc"), com.tencent.mm.protobuf.i.u(-1, "patMusicId"), com.tencent.mm.protobuf.i.r(-1, ya.b.LOCATION, r72.w.class), com.tencent.mm.protobuf.i.r(-1, "event", r72.t.class), com.tencent.mm.protobuf.i.r(-1, "templateItem", r72.x.class)});
        this.f393158d = appendAttrs;
        super.set__serialName("finderTopic");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", 0, "", "", "", "", null, null, null});
    }

    public void A(java.lang.String str) {
        super.set(this.f393158d + 0, str);
    }

    public void B(int i17) {
        super.set(this.f393158d + 1, java.lang.Integer.valueOf(i17));
    }

    public java.lang.String getIconUrl() {
        return super.getString(this.f393158d + 3);
    }

    public java.lang.String j() {
        return super.getString(this.f393158d + 4);
    }

    public r72.t k() {
        return (r72.t) super.getCustom(this.f393158d + 7);
    }

    public java.lang.String l() {
        return super.getString(this.f393158d + 2);
    }

    public r72.w n() {
        return (r72.w) super.getCustom(this.f393158d + 6);
    }

    public java.lang.String o() {
        return super.getString(this.f393158d + 5);
    }

    public r72.x p() {
        return (r72.x) super.getCustom(this.f393158d + 8);
    }

    public java.lang.String q() {
        return super.getString(this.f393158d + 0);
    }

    public int r() {
        return super.getInteger(this.f393158d + 1);
    }

    public void s(java.lang.String str) {
        super.set(this.f393158d + 4, str);
    }

    public void t(r72.t tVar) {
        super.set(this.f393158d + 7, tVar);
    }

    public void u(java.lang.String str) {
        super.set(this.f393158d + 2, str);
    }

    public void w(java.lang.String str) {
        super.set(this.f393158d + 3, str);
    }

    public void x(r72.w wVar) {
        super.set(this.f393158d + 6, wVar);
    }

    public void y(java.lang.String str) {
        super.set(this.f393158d + 5, str);
    }

    public void z(r72.x xVar) {
        super.set(this.f393158d + 8, xVar);
    }
}
