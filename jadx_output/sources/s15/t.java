package s15;

/* loaded from: classes9.dex */
public class t extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402179d;

    public t() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "topicId"), com.tencent.mm.protobuf.i.u(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME), com.tencent.mm.protobuf.i.u(-1, "creatorNickName"), com.tencent.mm.protobuf.i.n(-1, "hiddenMark"), com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)});
        this.f402179d = appendAttrs;
        super.set__serialName("RecordFinderTopicEventItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", 0L, ""});
    }

    public java.lang.String getName() {
        return super.getString(this.f402179d + 1);
    }

    public java.lang.String j() {
        return super.getString(this.f402179d + 2);
    }

    public long k() {
        return super.getLong(this.f402179d + 3);
    }

    public void l(java.lang.String str) {
        super.set(this.f402179d + 2, str);
    }

    public void n(long j17) {
        super.set(this.f402179d + 3, java.lang.Long.valueOf(j17));
    }

    public void o(java.lang.String str) {
        super.set(this.f402179d + 1, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f402179d + 4, str);
    }

    public void q(java.lang.String str) {
        super.set(this.f402179d + 0, str);
    }
}
