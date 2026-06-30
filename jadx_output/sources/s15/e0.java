package s15;

/* loaded from: classes9.dex */
public class e0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402160d;

    public e0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.u(-1, "desc"), com.tencent.mm.protobuf.i.u(-1, "thumburl"), com.tencent.mm.protobuf.i.u(-1, "tvinfo")});
        this.f402160d = appendAttrs;
        super.set__serialName("RecordTVItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", ""});
    }

    public void j(java.lang.String str) {
        super.set(this.f402160d + 1, str);
    }

    public void k(java.lang.String str) {
        super.set(this.f402160d + 2, str);
    }

    public void l(java.lang.String str) {
        super.set(this.f402160d + 0, str);
    }

    public void n(java.lang.String str) {
        super.set(this.f402160d + 3, str);
    }
}
