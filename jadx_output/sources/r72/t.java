package r72;

/* loaded from: classes16.dex */
public class t extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393157d;

    public t() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "topicId"), com.tencent.mm.protobuf.i.u(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME), com.tencent.mm.protobuf.i.u(-1, "creatorNickName"), com.tencent.mm.protobuf.i.n(-1, "hiddenMark"), com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)});
        this.f393157d = appendAttrs;
        super.set__serialName("finderTopicEvent");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", 0L, ""});
    }

    public java.lang.String getName() {
        return super.getString(this.f393157d + 1);
    }

    public java.lang.String getTitle() {
        return super.getString(this.f393157d + 4);
    }

    public java.lang.String getTopicId() {
        return super.getString(this.f393157d + 0);
    }

    public java.lang.String j() {
        return super.getString(this.f393157d + 2);
    }

    public long k() {
        return super.getLong(this.f393157d + 3);
    }

    public void l(java.lang.String str) {
        super.set(this.f393157d + 2, str);
    }

    public void n(long j17) {
        super.set(this.f393157d + 3, java.lang.Long.valueOf(j17));
    }

    public void o(java.lang.String str) {
        super.set(this.f393157d + 1, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f393157d + 4, str);
    }

    public void q(java.lang.String str) {
        super.set(this.f393157d + 0, str);
    }
}
