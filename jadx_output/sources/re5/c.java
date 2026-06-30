package re5;

/* loaded from: classes11.dex */
public final class c extends sh5.d {
    @Override // sh5.d, hg3.a
    public void a(com.tencent.mm.pluginsdk.ui.tools.f4 videoView, gg3.c param) {
        kotlin.jvm.internal.o.g(videoView, "videoView");
        kotlin.jvm.internal.o.g(param, "param");
        super.a(videoView, param);
        com.tencent.mm.autogen.mmdata.rpt.FileVideoPlayerReportStruct fileVideoPlayerReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FileVideoPlayerReportStruct();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        re5.e[] eVarArr = re5.e.f394569d;
        linkedHashMap.put("tp_flow_id", param.f271726a);
        re5.e[] eVarArr2 = re5.e.f394569d;
        java.lang.String path = param.f271728c;
        java.lang.String n17 = com.tencent.mm.vfs.w6.n(path);
        kotlin.jvm.internal.o.f(n17, "getFileExt(...)");
        linkedHashMap.put("file_ext", n17);
        re5.e[] eVarArr3 = re5.e.f394569d;
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(path);
        kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
        linkedHashMap.put("file_path_md5", a17);
        re5.e[] eVarArr4 = re5.e.f394569d;
        kotlin.jvm.internal.o.g(path, "path");
        linkedHashMap.put("tp_audio_format_support_check", java.lang.Boolean.valueOf(((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).Bi(path)));
        re5.e[] eVarArr5 = re5.e.f394569d;
        linkedHashMap.put("file_size", java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(path)));
        ((com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer) videoView).f(new re5.e0(linkedHashMap, fileVideoPlayerReportStruct, 0L, 4, null));
    }
}
