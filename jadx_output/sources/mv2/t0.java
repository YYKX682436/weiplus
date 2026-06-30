package mv2;

/* loaded from: classes2.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final mv2.t0 f331631a = new mv2.t0();

    /* renamed from: b, reason: collision with root package name */
    public static final mn2.g0 f331632b = new mv2.s0();

    public final void a(com.tencent.mm.protocal.protobuf.FinderMedia media, r45.mb4 fullMedia) {
        kotlin.jvm.internal.o.g(media, "media");
        kotlin.jvm.internal.o.g(fullMedia, "fullMedia");
        com.tencent.mars.xlog.Log.i("Finder.HalfMediaLogic", "fillBack " + fullMedia.getString(36));
        media.setUrl(fullMedia.getString(11));
        media.setThumbUrl(fullMedia.getString(12));
        media.setMd5sum(fullMedia.getString(6));
        media.setWidth(fullMedia.getFloat(4));
        media.setHeight(fullMedia.getFloat(5));
        media.setFileSize(fullMedia.getInteger(7));
        media.setBitrate(fullMedia.getInteger(8));
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.f126426y).getValue()).r()).intValue() == 0) {
            media.setFull_thumb_url(fullMedia.getString(27));
            media.setFull_url(fullMedia.getString(11));
            media.setFull_md5sum(fullMedia.getString(6));
            media.setFull_width(fullMedia.getFloat(4));
            media.setFull_height(fullMedia.getFloat(5));
            media.setFull_file_size(fullMedia.getInteger(7));
            media.setFull_bitrate(fullMedia.getInteger(8));
        }
        com.tencent.mars.xlog.Log.i("Finder.HalfMediaLogic", "no half");
        com.tencent.mars.xlog.Log.i("Finder.HalfMediaLogic", "media.url:" + media.getUrl());
        com.tencent.mars.xlog.Log.i("Finder.HalfMediaLogic", "media.thumbUrl:" + media.getThumbUrl());
        com.tencent.mars.xlog.Log.i("Finder.HalfMediaLogic", "media.full_url:" + media.getFull_url());
        com.tencent.mars.xlog.Log.i("Finder.HalfMediaLogic", "media.full_thumb_url:" + media.getFull_thumb_url());
        media.setCoverUrl(fullMedia.getString(23));
        media.setFull_cover_url(fullMedia.getString(40));
        media.setShare_cover_url(fullMedia.getString(65));
        com.tencent.mars.xlog.Log.i("Finder.HalfMediaLogic", "media.coverUrl:" + media.getCoverUrl());
        com.tencent.mars.xlog.Log.i("Finder.HalfMediaLogic", "media.fullCover:" + media.getFull_cover_url());
        com.tencent.mars.xlog.Log.i("Finder.HalfMediaLogic", "media.shareCover:" + media.getShare_cover_url());
        media.setHalf_rect((r45.bb1) fullMedia.getCustom(34));
    }
}
