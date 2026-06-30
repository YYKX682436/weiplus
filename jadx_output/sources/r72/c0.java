package r72;

/* loaded from: classes12.dex */
public class c0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393134d;

    public c0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.t(-1, "datalist", r72.d.class, "dataitem"), com.tencent.mm.protobuf.i.u(-1, "favlocalid"), com.tencent.mm.protobuf.i.u(-1, "noteauthor"), com.tencent.mm.protobuf.i.u(-1, "noteeditor"), com.tencent.mm.protobuf.i.u(-1, "editusr"), com.tencent.mm.protobuf.i.n(-1, "edittime")});
        this.f393134d = appendAttrs;
        super.set__serialName("noteinfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{new java.util.LinkedList(), "", "", "", "", 0L});
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

    public java.util.LinkedList j() {
        return super.getLinkedList(this.f393134d + 0);
    }

    public long k() {
        return super.getLong(this.f393134d + 5);
    }

    public java.lang.String l() {
        return super.getString(this.f393134d + 1);
    }

    public java.lang.String n() {
        return super.getString(this.f393134d + 2);
    }

    public java.lang.String o() {
        return super.getString(this.f393134d + 3);
    }

    public void p(long j17) {
        super.set(this.f393134d + 5, java.lang.Long.valueOf(j17));
    }

    public void q(java.lang.String str) {
        super.set(this.f393134d + 4, str);
    }

    public void r(java.lang.String str) {
        super.set(this.f393134d + 1, str);
    }

    public void s(java.lang.String str) {
        super.set(this.f393134d + 2, str);
    }

    public void t(java.lang.String str) {
        super.set(this.f393134d + 3, str);
    }
}
