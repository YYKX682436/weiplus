package s15;

/* loaded from: classes9.dex */
public class c0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402156d;

    public c0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.j(-1, "type"), com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.u(-1, "desc"), com.tencent.mm.protobuf.i.u(-1, "thumburl"), com.tencent.mm.protobuf.i.u(-1, "productinfo")});
        this.f402156d = appendAttrs;
        super.set__serialName("RecordProductItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, "", "", "", ""});
    }

    public void j(java.lang.String str) {
        super.set(this.f402156d + 2, str);
    }

    public void k(java.lang.String str) {
        super.set(this.f402156d + 4, str);
    }

    public void l(java.lang.String str) {
        super.set(this.f402156d + 3, str);
    }

    public void n(java.lang.String str) {
        super.set(this.f402156d + 1, str);
    }

    public void o(int i17) {
        super.set(this.f402156d + 0, java.lang.Integer.valueOf(i17));
    }
}
