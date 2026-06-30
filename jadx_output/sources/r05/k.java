package r05;

/* loaded from: classes9.dex */
public class k extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f368365d;

    public k() {
        int appendAttrs = appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.v(-1, "appid"), com.tencent.mm.protobuf.i.j(-1, "sdkver"), com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.u(-1, "des"), com.tencent.mm.protobuf.i.u(-1, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.u(-1, "action"), com.tencent.mm.protobuf.i.i(-1, "type"), com.tencent.mm.protobuf.i.i(-1, "showtype"), com.tencent.mm.protobuf.i.u(-1, "content"), com.tencent.mm.protobuf.i.u(-1, "url")});
        this.f368365d = appendAttrs;
        set__serialName("appmsg");
        set__xmlPrefixTag("msg");
        set__trim(true);
        replaceDefault(appendAttrs, new java.lang.Object[]{"", 0, "", "", "", "", 0, 0, "", ""});
    }

    @Override // e14.l
    public boolean checkValueSkip(java.lang.String fieldSerializeName, java.lang.Object obj, boolean z17) {
        kotlin.jvm.internal.o.g(fieldSerializeName, "fieldSerializeName");
        if (kotlin.jvm.internal.o.b(fieldSerializeName, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            return false;
        }
        return super.checkValueSkip(fieldSerializeName, obj, z17);
    }
}
