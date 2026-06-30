package com.tencent.mm.protocal.protobuf;

/* loaded from: classes2.dex */
public class FinderMedia extends com.tencent.mm.protobuf.e {
    public FinderMedia() {
        super(com.tencent.mm.protobuf.i.u(1, "url"), com.tencent.mm.protobuf.i.u(2, "thumbUrl"), com.tencent.mm.protobuf.i.i(3, "mediaType"), com.tencent.mm.protobuf.i.i(4, "videoDuration"), com.tencent.mm.protobuf.i.g(5, "width"), com.tencent.mm.protobuf.i.g(6, "height"), com.tencent.mm.protobuf.i.u(7, "md5sum"), com.tencent.mm.protobuf.i.i(8, "fileSize"), com.tencent.mm.protobuf.i.i(9, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE), com.tencent.mm.protobuf.i.s(10, "spec", r45.vf2.class), com.tencent.mm.protobuf.i.u(11, "coverUrl"), com.tencent.mm.protobuf.i.u(12, "decodeKey"), com.tencent.mm.protobuf.i.u(13, "url_token"), com.tencent.mm.protobuf.i.u(14, "thumb_url_token"), com.tencent.mm.protobuf.i.u(15, "cover_url_token"), com.tencent.mm.protobuf.i.r(16, "codec_info", r45.uf2.class), com.tencent.mm.protobuf.i.r(17, "live_spec", r45.qz1.class), com.tencent.mm.protobuf.i.r(18, "hls_spec", r45.kb1.class), com.tencent.mm.protobuf.i.i(19, "hot_flag"), com.tencent.mm.protobuf.i.r(20, "half_rect", r45.bb1.class), com.tencent.mm.protobuf.i.u(21, "full_thumb_url"), com.tencent.mm.protobuf.i.u(22, "full_thumb_url_token"), com.tencent.mm.protobuf.i.u(23, "full_url"), com.tencent.mm.protobuf.i.g(24, "full_width"), com.tencent.mm.protobuf.i.g(25, "full_height"), com.tencent.mm.protobuf.i.u(26, "full_md5sum"), com.tencent.mm.protobuf.i.i(27, "full_file_size"), com.tencent.mm.protobuf.i.i(28, "full_bitrate"), com.tencent.mm.protobuf.i.u(29, "full_url_token"), com.tencent.mm.protobuf.i.u(30, "full_cover_url"), com.tencent.mm.protobuf.i.u(31, "full_cover_url_token"), com.tencent.mm.protobuf.i.r(32, "hdr_spec", r45.cb1.class), com.tencent.mm.protobuf.i.s(33, "live_cover_imgs", r45.lw1.class), com.tencent.mm.protobuf.i.r(34, "scaling_info", r45.gn2.class), com.tencent.mm.protobuf.i.i(35, "card_show_style"), com.tencent.mm.protobuf.i.i(36, "dynamic_range_type"), com.tencent.mm.protobuf.i.i(37, "video_type"), com.tencent.mm.protobuf.i.n(38, "duplicate_file_size"), com.tencent.mm.protobuf.i.s(39, "audio_spec", r45.uu0.class), com.tencent.mm.protobuf.i.r(40, "media_cdn_info", r45.tf2.class), com.tencent.mm.protobuf.i.r(43, "cover_scaling_info", r45.zz0.class), com.tencent.mm.protobuf.i.u(46, "livephoto_url"), com.tencent.mm.protobuf.i.u(47, "url_original_check_sum"), com.tencent.mm.protobuf.i.u(48, "url_calculate_check_sum"), com.tencent.mm.protobuf.i.r(49, "livephoto", r45.a42.class), com.tencent.mm.protobuf.i.u(50, "video_title"), com.tencent.mm.protobuf.i.u(52, "share_cover_url"), com.tencent.mm.protobuf.i.u(53, "share_cover_url_token"), com.tencent.mm.protobuf.i.i(54, "share_cover_show_style"), com.tencent.mm.protobuf.i.n(55, "cdn_file_size"), com.tencent.mm.protobuf.i.a(56, "media_cdn_info_bytes"), com.tencent.mm.protobuf.i.r(57, "poi_info", r45.ze2.class), com.tencent.mm.protobuf.i.r(58, "progress_preview", r45.ir2.class));
        this.__printBytes = true;
    }

    public static com.tencent.mm.protocal.protobuf.FinderMedia create() {
        return new com.tencent.mm.protocal.protobuf.FinderMedia();
    }

    public com.tencent.mm.protocal.protobuf.FinderMedia addElementAudio_spec(r45.uu0 uu0Var) {
        addElement(38, uu0Var);
        return this;
    }

    public com.tencent.mm.protocal.protobuf.FinderMedia addElementLive_cover_imgs(r45.lw1 lw1Var) {
        addElement(32, lw1Var);
        return this;
    }

    public com.tencent.mm.protocal.protobuf.FinderMedia addElementSpec(r45.vf2 vf2Var) {
        addElement(9, vf2Var);
        return this;
    }

    public final java.util.LinkedList<r45.uu0> getAudio_spec() {
        return getList(38);
    }

    public final int getBitrate() {
        return getInteger(8);
    }

    public final int getCard_show_style() {
        return getInteger(34);
    }

    public final long getCdn_file_size() {
        return getLong(49);
    }

    public final r45.uf2 getCodec_info() {
        return (r45.uf2) getCustom(15);
    }

    public final java.lang.String getCoverUrl() {
        return getString(10);
    }

    public final r45.zz0 getCover_scaling_info() {
        return (r45.zz0) getCustom(40);
    }

    public final java.lang.String getCover_url_token() {
        return getString(14);
    }

    public final java.lang.String getDecodeKey() {
        return getString(11);
    }

    public final long getDuplicate_file_size() {
        return getLong(37);
    }

    public final int getDynamic_range_type() {
        return getInteger(35);
    }

    public final int getFileSize() {
        return getInteger(7);
    }

    public final int getFull_bitrate() {
        return getInteger(27);
    }

    public final java.lang.String getFull_cover_url() {
        return getString(29);
    }

    public final java.lang.String getFull_cover_url_token() {
        return getString(30);
    }

    public final int getFull_file_size() {
        return getInteger(26);
    }

    public final float getFull_height() {
        return getFloat(24);
    }

    public final java.lang.String getFull_md5sum() {
        return getString(25);
    }

    public final java.lang.String getFull_thumb_url() {
        return getString(20);
    }

    public final java.lang.String getFull_thumb_url_token() {
        return getString(21);
    }

    public final java.lang.String getFull_url() {
        return getString(22);
    }

    public final java.lang.String getFull_url_token() {
        return getString(28);
    }

    public final float getFull_width() {
        return getFloat(23);
    }

    public final r45.bb1 getHalf_rect() {
        return (r45.bb1) getCustom(19);
    }

    public final r45.cb1 getHdr_spec() {
        return (r45.cb1) getCustom(31);
    }

    public final float getHeight() {
        return getFloat(5);
    }

    public final r45.kb1 getHls_spec() {
        return (r45.kb1) getCustom(17);
    }

    public final int getHot_flag() {
        return getInteger(18);
    }

    public final java.util.LinkedList<r45.lw1> getLive_cover_imgs() {
        return getList(32);
    }

    public final r45.qz1 getLive_spec() {
        return (r45.qz1) getCustom(16);
    }

    public final r45.a42 getLivephoto() {
        return (r45.a42) getCustom(44);
    }

    public final java.lang.String getLivephoto_url() {
        return getString(41);
    }

    public final java.lang.String getMd5sum() {
        return getString(6);
    }

    public final int getMediaType() {
        return getInteger(2);
    }

    public final r45.tf2 getMedia_cdn_info() {
        return (r45.tf2) getCustom(39);
    }

    public final com.tencent.mm.protobuf.g getMedia_cdn_info_bytes() {
        return getByteString(50);
    }

    public final r45.ze2 getPoi_info() {
        return (r45.ze2) getCustom(51);
    }

    public final r45.ir2 getProgress_preview() {
        return (r45.ir2) getCustom(52);
    }

    public final r45.gn2 getScaling_info() {
        return (r45.gn2) getCustom(33);
    }

    public final int getShare_cover_show_style() {
        return getInteger(48);
    }

    public final java.lang.String getShare_cover_url() {
        return getString(46);
    }

    public final java.lang.String getShare_cover_url_token() {
        return getString(47);
    }

    public final java.util.LinkedList<r45.vf2> getSpec() {
        return getList(9);
    }

    public final java.lang.String getThumbUrl() {
        return getString(1);
    }

    public final java.lang.String getThumb_url_token() {
        return getString(13);
    }

    public final java.lang.String getUrl() {
        return getString(0);
    }

    public final java.lang.String getUrl_calculate_check_sum() {
        return getString(43);
    }

    public final java.lang.String getUrl_original_check_sum() {
        return getString(42);
    }

    public final java.lang.String getUrl_token() {
        return getString(12);
    }

    public final int getVideoDuration() {
        return getInteger(3);
    }

    public final java.lang.String getVideo_title() {
        return getString(45);
    }

    public final int getVideo_type() {
        return getInteger(36);
    }

    public final float getWidth() {
        return getFloat(4);
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setAudio_spec(java.util.LinkedList<r45.uu0> linkedList) {
        set(38, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setBitrate(int i17) {
        set(8, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setCard_show_style(int i17) {
        set(34, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setCdn_file_size(long j17) {
        set(49, java.lang.Long.valueOf(j17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setCodec_info(r45.uf2 uf2Var) {
        set(15, uf2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setCoverUrl(java.lang.String str) {
        set(10, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setCover_scaling_info(r45.zz0 zz0Var) {
        set(40, zz0Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setCover_url_token(java.lang.String str) {
        set(14, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setDecodeKey(java.lang.String str) {
        set(11, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setDuplicate_file_size(long j17) {
        set(37, java.lang.Long.valueOf(j17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setDynamic_range_type(int i17) {
        set(35, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setFileSize(int i17) {
        set(7, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setFull_bitrate(int i17) {
        set(27, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setFull_cover_url(java.lang.String str) {
        set(29, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setFull_cover_url_token(java.lang.String str) {
        set(30, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setFull_file_size(int i17) {
        set(26, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setFull_height(float f17) {
        set(24, java.lang.Float.valueOf(f17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setFull_md5sum(java.lang.String str) {
        set(25, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setFull_thumb_url(java.lang.String str) {
        set(20, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setFull_thumb_url_token(java.lang.String str) {
        set(21, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setFull_url(java.lang.String str) {
        set(22, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setFull_url_token(java.lang.String str) {
        set(28, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setFull_width(float f17) {
        set(23, java.lang.Float.valueOf(f17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setHalf_rect(r45.bb1 bb1Var) {
        set(19, bb1Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setHdr_spec(r45.cb1 cb1Var) {
        set(31, cb1Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setHeight(float f17) {
        set(5, java.lang.Float.valueOf(f17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setHls_spec(r45.kb1 kb1Var) {
        set(17, kb1Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setHot_flag(int i17) {
        set(18, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setLive_cover_imgs(java.util.LinkedList<r45.lw1> linkedList) {
        set(32, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setLive_spec(r45.qz1 qz1Var) {
        set(16, qz1Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setLivephoto(r45.a42 a42Var) {
        set(44, a42Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setLivephoto_url(java.lang.String str) {
        set(41, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setMd5sum(java.lang.String str) {
        set(6, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setMediaType(int i17) {
        set(2, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setMedia_cdn_info(r45.tf2 tf2Var) {
        set(39, tf2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setMedia_cdn_info_bytes(com.tencent.mm.protobuf.g gVar) {
        set(50, gVar);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setPoi_info(r45.ze2 ze2Var) {
        set(51, ze2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setProgress_preview(r45.ir2 ir2Var) {
        set(52, ir2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setScaling_info(r45.gn2 gn2Var) {
        set(33, gn2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setShare_cover_show_style(int i17) {
        set(48, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setShare_cover_url(java.lang.String str) {
        set(46, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setShare_cover_url_token(java.lang.String str) {
        set(47, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setSpec(java.util.LinkedList<r45.vf2> linkedList) {
        set(9, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setThumbUrl(java.lang.String str) {
        set(1, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setThumb_url_token(java.lang.String str) {
        set(13, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setUrl(java.lang.String str) {
        set(0, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setUrl_calculate_check_sum(java.lang.String str) {
        set(43, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setUrl_original_check_sum(java.lang.String str) {
        set(42, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setUrl_token(java.lang.String str) {
        set(12, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setVideoDuration(int i17) {
        set(3, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setVideo_title(java.lang.String str) {
        set(45, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setVideo_type(int i17) {
        set(36, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMedia setWidth(float f17) {
        set(4, java.lang.Float.valueOf(f17));
        return this;
    }
}
