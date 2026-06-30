package hu;

/* loaded from: classes9.dex */
public class f extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public oi3.e f285004d;

    /* renamed from: e, reason: collision with root package name */
    public s15.w f285005e;

    /* renamed from: f, reason: collision with root package name */
    public final int f285006f;

    public f() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.n(-1, "msgId"), com.tencent.mm.protobuf.i.n(-1, "msgSvrId"), com.tencent.mm.protobuf.i.u(-1, "msgTalker"), com.tencent.mm.protobuf.i.u(-1, "msgSender"), com.tencent.mm.protobuf.i.u(-1, "recordInfoXml"), com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.i(-1, "appBrandChatType"), com.tencent.mm.protobuf.i.i(-1, "fromScene"), com.tencent.mm.protobuf.i.i(-1, "favLocalId"), com.tencent.mm.protobuf.i.c(-1, "showShare"), com.tencent.mm.protobuf.i.i(-1, "embeddedNum")});
        this.f285006f = appendAttrs;
        super.set__serialName("RecordDetailUIParams");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0L, null, "", "", "", "", 0, 0, null, java.lang.Boolean.TRUE, 1});
    }

    public void A(java.lang.String str) {
        super.set(this.f285006f + 4, str);
    }

    public void B(boolean z17) {
        super.set(this.f285006f + 9, java.lang.Boolean.valueOf(z17));
    }

    public void C(java.lang.String str) {
        super.set(this.f285006f + 5, str);
    }

    public java.lang.String getTitle() {
        return super.getString(this.f285006f + 5);
    }

    public int j() {
        return super.getInteger(this.f285006f + 10);
    }

    public java.lang.Integer k() {
        return super.getIntegerWrapper(this.f285006f + 8);
    }

    public int l() {
        return super.getInteger(this.f285006f + 7);
    }

    public long n() {
        return super.getLong(this.f285006f + 0);
    }

    public java.lang.String o() {
        return super.getString(this.f285006f + 3);
    }

    public java.lang.Long p() {
        return super.getLongWrapper(this.f285006f + 1);
    }

    public java.lang.String q() {
        return super.getString(this.f285006f + 2);
    }

    public java.lang.String r() {
        return super.getString(this.f285006f + 4);
    }

    public boolean s() {
        return super.getBoolean(this.f285006f + 9);
    }

    public void t(int i17) {
        super.set(this.f285006f + 10, java.lang.Integer.valueOf(i17));
    }

    public void u(int i17) {
        super.set(this.f285006f + 7, java.lang.Integer.valueOf(i17));
    }

    public void w(long j17) {
        super.set(this.f285006f + 0, java.lang.Long.valueOf(j17));
    }

    public void x(java.lang.String str) {
        super.set(this.f285006f + 3, str);
    }

    public void y(java.lang.Long l17) {
        super.set(this.f285006f + 1, l17);
    }

    public void z(java.lang.String str) {
        super.set(this.f285006f + 2, str);
    }
}
