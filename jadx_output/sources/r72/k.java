package r72;

/* loaded from: classes16.dex */
public class k extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393147d;

    public k() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.j(-1, "type"), com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.u(-1, "desc"), com.tencent.mm.protobuf.i.n(-1, "edittime"), com.tencent.mm.protobuf.i.u(-1, "editusr"), com.tencent.mm.protobuf.i.r(-1, "remark", r72.f0.class), com.tencent.mm.protobuf.i.i(-1, "ctrlflag"), com.tencent.mm.protobuf.i.i(-1, "version"), com.tencent.mm.protobuf.i.u(-1, "deviceid"), com.tencent.mm.protobuf.i.r(-1, ya.b.SOURCE, r72.g0.class), com.tencent.mm.protobuf.i.t(-1, "datalist", r72.d.class, "dataitem"), com.tencent.mm.protobuf.i.r(-1, "locitem", r72.z.class), com.tencent.mm.protobuf.i.r(-1, "productitem", r72.d0.class), com.tencent.mm.protobuf.i.r(-1, "tvitem", r72.k0.class), com.tencent.mm.protobuf.i.r(-1, "noteinfo", r72.b0.class), com.tencent.mm.protobuf.i.r(-1, "appbranditem", r72.a.class), com.tencent.mm.protobuf.i.r(-1, "finderFeed", x05.j.class), com.tencent.mm.protobuf.i.r(-1, "weburlitem", r72.m0.class), com.tencent.mm.protobuf.i.x(-1, "taglist", "tag"), com.tencent.mm.protobuf.i.m(-1, "tagidlist", "tagid"), com.tencent.mm.protobuf.i.r(-1, "liteappitem", r72.y.class), com.tencent.mm.protobuf.i.x(-1, "recommendtaglist", "tag"), com.tencent.mm.protobuf.i.r(-1, "finderCollection", r72.m.class)});
        this.f393147d = appendAttrs;
        super.set__serialName("favitem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, "", "", 0L, "", null, 0, 0, "", null, new java.util.LinkedList(), null, null, null, null, null, null, null, new java.util.LinkedList(), new java.util.LinkedList(), null, new java.util.LinkedList(), null});
    }

    public java.util.LinkedList A() {
        return super.getLinkedList(this.f393147d + 19);
    }

    public java.util.LinkedList B() {
        return super.getLinkedList(this.f393147d + 18);
    }

    public r72.k0 C() {
        return (r72.k0) super.getCustom(this.f393147d + 13);
    }

    public r72.m0 E() {
        return (r72.m0) super.getCustom(this.f393147d + 17);
    }

    public void F(r72.a aVar) {
        super.set(this.f393147d + 15, aVar);
    }

    public void G(int i17) {
        super.set(this.f393147d + 6, java.lang.Integer.valueOf(i17));
    }

    public void H(java.lang.String str) {
        super.set(this.f393147d + 2, str);
    }

    public void I(java.lang.String str) {
        super.set(this.f393147d + 8, str);
    }

    public void J(long j17) {
        super.set(this.f393147d + 3, java.lang.Long.valueOf(j17));
    }

    public void K(java.lang.String str) {
        super.set(this.f393147d + 4, str);
    }

    public void L(r72.m mVar) {
        super.set(this.f393147d + 22, mVar);
    }

    public void N(x05.j jVar) {
        super.set(this.f393147d + 16, jVar);
    }

    public void O(r72.y yVar) {
        super.set(this.f393147d + 20, yVar);
    }

    public void P(r72.z zVar) {
        super.set(this.f393147d + 11, zVar);
    }

    public void Q(r72.b0 b0Var) {
        super.set(this.f393147d + 14, b0Var);
    }

    public void R(r72.d0 d0Var) {
        super.set(this.f393147d + 12, d0Var);
    }

    public void S(r72.f0 f0Var) {
        super.set(this.f393147d + 5, f0Var);
    }

    public void T(r72.g0 g0Var) {
        super.set(this.f393147d + 9, g0Var);
    }

    public void U(java.lang.String str) {
        super.set(this.f393147d + 1, str);
    }

    public void V(r72.k0 k0Var) {
        super.set(this.f393147d + 13, k0Var);
    }

    public void W(int i17) {
        super.set(this.f393147d + 0, java.lang.Integer.valueOf(i17));
    }

    public void Y(r72.m0 m0Var) {
        super.set(this.f393147d + 17, m0Var);
    }

    public void Z(int i17) {
        super.set(this.f393147d + 7, java.lang.Integer.valueOf(i17));
    }

    public java.lang.String getDeviceid() {
        return super.getString(this.f393147d + 8);
    }

    public java.lang.String getTitle() {
        return super.getString(this.f393147d + 1);
    }

    public int getType() {
        return super.getInteger(this.f393147d + 0);
    }

    public int getVersion() {
        return super.getInteger(this.f393147d + 7);
    }

    @Override // e14.l
    public boolean isXmlListNeedCountAttr(java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        kotlin.jvm.internal.o.g(tagName, "tagName");
        kotlin.jvm.internal.o.g(itemTagName, "itemTagName");
        if (kotlin.jvm.internal.o.b(tagName, "datalist")) {
            return true;
        }
        return super.isXmlListNeedCountAttr(tagName, itemTagName, z17);
    }

    public r72.a j() {
        return (r72.a) super.getCustom(this.f393147d + 15);
    }

    public int k() {
        return super.getInteger(this.f393147d + 6);
    }

    public java.util.LinkedList l() {
        return super.getLinkedList(this.f393147d + 10);
    }

    public java.lang.String n() {
        return super.getString(this.f393147d + 2);
    }

    public long o() {
        return super.getLong(this.f393147d + 3);
    }

    public java.lang.String p() {
        return super.getString(this.f393147d + 4);
    }

    @Override // e14.l
    public java.lang.String processXmlValue(java.lang.Object value, java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(tagName, "tagName");
        kotlin.jvm.internal.o.g(itemTagName, "itemTagName");
        return kotlin.jvm.internal.o.b(tagName, "finderFeed") ? value.toString() : super.processXmlValue(value, tagName, itemTagName, z17);
    }

    public r72.m q() {
        return (r72.m) super.getCustom(this.f393147d + 22);
    }

    public x05.j r() {
        return (x05.j) super.getCustom(this.f393147d + 16);
    }

    public r72.y s() {
        return (r72.y) super.getCustom(this.f393147d + 20);
    }

    public r72.z t() {
        return (r72.z) super.getCustom(this.f393147d + 11);
    }

    public r72.b0 u() {
        return (r72.b0) super.getCustom(this.f393147d + 14);
    }

    public r72.d0 w() {
        return (r72.d0) super.getCustom(this.f393147d + 12);
    }

    public java.util.LinkedList x() {
        return super.getLinkedList(this.f393147d + 21);
    }

    public r72.f0 y() {
        return (r72.f0) super.getCustom(this.f393147d + 5);
    }

    public r72.g0 z() {
        return (r72.g0) super.getCustom(this.f393147d + 9);
    }
}
