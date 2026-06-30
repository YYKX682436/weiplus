package v05;

/* loaded from: classes9.dex */
public class a extends r05.j {

    /* renamed from: e, reason: collision with root package name */
    public final int f432314e;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "emoticonmd5"), com.tencent.mm.protobuf.i.i(-1, "thumbheight"), com.tencent.mm.protobuf.i.i(-1, "thumbwidth"), com.tencent.mm.protobuf.i.u(-1, "cdnthumburl"), com.tencent.mm.protobuf.i.u(-1, "cdnthumbmd5"), com.tencent.mm.protobuf.i.i(-1, "cdnthumblength"), com.tencent.mm.protobuf.i.i(-1, "cdnthumbheight"), com.tencent.mm.protobuf.i.i(-1, "cdnthumbwidth"), com.tencent.mm.protobuf.i.u(-1, "cdnthumbaeskey"), com.tencent.mm.protobuf.i.i(-1, "encryver"), com.tencent.mm.protobuf.i.u(-1, "fileext"), com.tencent.mm.protobuf.i.i(-1, "islargefilemsg"), com.tencent.mm.protobuf.i.n(-1, "overwrite_newmsgid"), com.tencent.mm.protobuf.i.u(-1, "fileuploadtoken"), com.tencent.mm.protobuf.i.u(-1, "tpthumburl"), com.tencent.mm.protobuf.i.u(-1, "tpthumbaeskey"), com.tencent.mm.protobuf.i.u(-1, "tpauthkey"), com.tencent.mm.protobuf.i.u(-1, "tpthumbmd5"), com.tencent.mm.protobuf.i.i(-1, "tpthumbwidth"), com.tencent.mm.protobuf.i.i(-1, "tpthumbheight"), com.tencent.mm.protobuf.i.n(-1, "tpthumblength"), com.tencent.mm.protobuf.i.u(-1, "tpurl"), com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_FILENAME), com.tencent.mm.protobuf.i.i(-1, "uploadstatus")});
        this.f432314e = appendAttrs;
        super.set__serialName("CommonAppAttach");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", 0, 0, "", "", 0, 0, 0, "", 0, "", 0, 0L, "", "", "", "", "", 0, 0, 0L, "", "", 0});
    }

    public java.lang.String A() {
        return super.getString(this.f432314e + 14);
    }

    public int B() {
        return super.getInteger(this.f432314e + 18);
    }

    public java.lang.String C() {
        return super.getString(this.f432314e + 21);
    }

    public int E() {
        return super.getInteger(this.f432314e + 23);
    }

    public int F() {
        return super.getInteger(this.f432314e + 11);
    }

    public void G(java.lang.String str) {
        super.set(this.f432314e + 8, str);
    }

    public void H(int i17) {
        super.set(this.f432314e + 6, java.lang.Integer.valueOf(i17));
    }

    public void I(int i17) {
        super.set(this.f432314e + 5, java.lang.Integer.valueOf(i17));
    }

    public void J(java.lang.String str) {
        super.set(this.f432314e + 4, str);
    }

    public void K(java.lang.String str) {
        super.set(this.f432314e + 3, str);
    }

    public void L(int i17) {
        super.set(this.f432314e + 7, java.lang.Integer.valueOf(i17));
    }

    public void N(java.lang.String str) {
        super.set(this.f432314e + 10, str);
    }

    public void O(java.lang.String str) {
        super.set(this.f432314e + 22, str);
    }

    public void P(java.lang.String str) {
        super.set(this.f432314e + 13, str);
    }

    public void Q(long j17) {
        super.set(this.f432314e + 12, java.lang.Long.valueOf(j17));
    }

    public void R(java.lang.String str) {
        super.set(this.f432314e + 16, str);
    }

    public void S(java.lang.String str) {
        super.set(this.f432314e + 21, str);
    }

    public void T(int i17) {
        super.set(this.f432314e + 23, java.lang.Integer.valueOf(i17));
    }

    public java.lang.String j() {
        return super.getString(this.f432314e + 8);
    }

    public int k() {
        return super.getInteger(this.f432314e + 6);
    }

    public int l() {
        return super.getInteger(this.f432314e + 5);
    }

    public java.lang.String n() {
        return super.getString(this.f432314e + 4);
    }

    public java.lang.String o() {
        return super.getString(this.f432314e + 3);
    }

    public int p() {
        return super.getInteger(this.f432314e + 7);
    }

    @Override // e14.l
    public boolean processXmlValueUseCData(java.lang.Object value, java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(tagName, "tagName");
        kotlin.jvm.internal.o.g(itemTagName, "itemTagName");
        if (kotlin.jvm.internal.o.b(tagName, "fileuploadtoken")) {
            return true;
        }
        return super.processXmlValueUseCData(value, tagName, itemTagName, z17);
    }

    public java.lang.String q() {
        return super.getString(this.f432314e + 0);
    }

    public java.lang.String r() {
        return super.getString(this.f432314e + 10);
    }

    public java.lang.String s() {
        return super.getString(this.f432314e + 22);
    }

    public long t() {
        return super.getLong(this.f432314e + 12);
    }

    public java.lang.String u() {
        return super.getString(this.f432314e + 16);
    }

    public java.lang.String w() {
        return super.getString(this.f432314e + 15);
    }

    public int x() {
        return super.getInteger(this.f432314e + 19);
    }

    public long y() {
        return super.getLong(this.f432314e + 20);
    }

    public java.lang.String z() {
        return super.getString(this.f432314e + 17);
    }
}
