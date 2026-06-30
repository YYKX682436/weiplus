package s15;

/* loaded from: classes9.dex */
public class c extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402155d;

    public c() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, com.tencent.tmassistantsdk.downloadservice.DownloadInfo.CONTENTTYPE), com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.u(-1, "thumbUrl"), com.tencent.mm.protobuf.i.u(-1, "ratioType"), com.tencent.mm.protobuf.i.i(-1, "count"), com.tencent.mm.protobuf.i.i(-1, "duration"), com.tencent.mm.protobuf.i.u(-1, "subSource")});
        this.f402155d = appendAttrs;
        super.set__serialName("ImageConf");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, "", null, "1:1", 0, 0, null});
    }

    public int getCount() {
        return super.getInteger(this.f402155d + 4);
    }

    public java.lang.String getThumbUrl() {
        return super.getString(this.f402155d + 2);
    }

    public java.lang.String getTitle() {
        return super.getString(this.f402155d + 1);
    }

    public java.lang.String j() {
        return super.getString(this.f402155d + 0);
    }

    public int k() {
        return super.getInteger(this.f402155d + 5);
    }

    public java.lang.String l() {
        return super.getString(this.f402155d + 3);
    }

    public java.lang.String n() {
        return super.getString(this.f402155d + 6);
    }

    public void o(java.lang.String str) {
        super.set(this.f402155d + 0, str);
    }

    public void p(int i17) {
        super.set(this.f402155d + 4, java.lang.Integer.valueOf(i17));
    }

    public void q(int i17) {
        super.set(this.f402155d + 5, java.lang.Integer.valueOf(i17));
    }

    public void r(java.lang.String str) {
        super.set(this.f402155d + 3, str);
    }

    public void s(java.lang.String str) {
        super.set(this.f402155d + 6, str);
    }

    public void t(java.lang.String str) {
        super.set(this.f402155d + 2, str);
    }

    public void u(java.lang.String str) {
        super.set(this.f402155d + 1, str);
    }
}
