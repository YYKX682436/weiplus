package mf5;

/* loaded from: classes5.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f326177d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.u(-1, "cover"), com.tencent.mm.protobuf.i.u(-1, "jumpurl")});
        this.f326177d = appendAttrs;
        super.set__serialName("dataitem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", ""});
    }

    public java.lang.String getTitle() {
        return super.getString(this.f326177d + 0);
    }

    public java.lang.String j() {
        return super.getString(this.f326177d + 2);
    }

    public java.lang.String k() {
        return super.getString(this.f326177d + 1);
    }
}
