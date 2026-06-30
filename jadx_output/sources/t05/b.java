package t05;

/* loaded from: classes9.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f414528d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.t(-1, "datalist", h15.a.class, "dataitem")});
        this.f414528d = appendAttrs;
        super.set__serialName("group_notice_item");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{new java.util.LinkedList()});
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
        return super.getLinkedList(this.f414528d + 0);
    }
}
