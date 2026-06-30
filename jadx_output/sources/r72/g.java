package r72;

/* loaded from: classes9.dex */
public class g extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393139d;

    public g() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.u(-1, "desc"), com.tencent.mm.protobuf.i.u(-1, "cdn_thumburl"), com.tencent.mm.protobuf.i.u(-1, "cdn_thumbkey"), com.tencent.mm.protobuf.i.u(-1, "thumb_fullmd5"), com.tencent.mm.protobuf.i.n(-1, "thumb_size"), com.tencent.mm.protobuf.i.u(-1, "favusername"), com.tencent.mm.protobuf.i.u(-1, "favcreatetime"), com.tencent.mm.protobuf.i.t(-1, "datalist", r72.d.class, "dataitem"), com.tencent.mm.protobuf.i.n(-1, "edittime"), com.tencent.mm.protobuf.i.u(-1, "editusr"), com.tencent.mm.protobuf.i.i(-1, "isChatRoom")});
        this.f393139d = appendAttrs;
        super.set__serialName("recordinfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", "", "", 0L, "", "", new java.util.LinkedList(), 0L, "", 0});
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
        return super.getLinkedList(this.f393139d + 8);
    }
}
