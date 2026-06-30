package s15;

/* loaded from: classes9.dex */
public class v extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402181d;

    public v() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "topic"), com.tencent.mm.protobuf.i.i(-1, "topicType"), com.tencent.mm.protobuf.i.u(-1, "fromFeedId"), com.tencent.mm.protobuf.i.u(-1, "iconUrl"), com.tencent.mm.protobuf.i.u(-1, "desc"), com.tencent.mm.protobuf.i.u(-1, "patMusicId"), com.tencent.mm.protobuf.i.r(-1, ya.b.LOCATION, s15.u.class), com.tencent.mm.protobuf.i.r(-1, "event", s15.t.class)});
        this.f402181d = appendAttrs;
        super.set__serialName("RecordFinderTopicShareItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", -1, null, "", "", "", null, null});
    }

    @Override // e14.l
    public boolean checkValueSkip(java.lang.String fieldSerializeName, java.lang.Object obj, boolean z17) {
        kotlin.jvm.internal.o.g(fieldSerializeName, "fieldSerializeName");
        boolean checkValueSkip = super.checkValueSkip(fieldSerializeName, obj, z17);
        if (!checkValueSkip && kotlin.jvm.internal.o.b(fieldSerializeName, "topicType") && kotlin.jvm.internal.o.b(obj, -1) && z17) {
            return true;
        }
        return checkValueSkip;
    }

    public java.lang.String j() {
        return super.getString(this.f402181d + 4);
    }

    public java.lang.String k() {
        return super.getString(this.f402181d + 0);
    }

    public s15.t l() {
        return (s15.t) super.getCustom(this.f402181d + 7);
    }

    public int n() {
        return super.getInteger(this.f402181d + 1);
    }

    public void o(java.lang.String str) {
        super.set(this.f402181d + 4, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f402181d + 3, str);
    }

    public void q(java.lang.String str) {
        super.set(this.f402181d + 5, str);
    }

    public void r(java.lang.String str) {
        super.set(this.f402181d + 0, str);
    }

    public void s(s15.t tVar) {
        super.set(this.f402181d + 7, tVar);
    }

    public void t(s15.u uVar) {
        super.set(this.f402181d + 6, uVar);
    }

    public void u(int i17) {
        super.set(this.f402181d + 1, java.lang.Integer.valueOf(i17));
    }
}
