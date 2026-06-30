package gx0;

/* loaded from: classes5.dex */
public final class d6 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276320a;

    public d6(gx0.w8 w8Var) {
        this.f276320a = w8Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        gx0.w8 w8Var = this.f276320a;
        ex0.a0 a0Var = w8Var.W6().f276642r;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = a0Var != null ? a0Var.E : null;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = w8Var.v7().f69348m;
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = recordConfigProvider != null ? recordConfigProvider.I : null;
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("finder_tab_context_id", videoCaptureReportInfo != null ? videoCaptureReportInfo.f155698o : null);
        lVarArr[1] = new jz5.l("finder_context_id", videoCaptureReportInfo != null ? videoCaptureReportInfo.f155697n : null);
        lVarArr[2] = new jz5.l("comment_scene", videoCaptureReportInfo != null ? java.lang.Integer.valueOf(videoCaptureReportInfo.f155693g) : null);
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        lVarArr[3] = new jz5.l("finder_post_sessionid", ((qs2.q) ((w40.e) c17)).hj());
        lVarArr[4] = new jz5.l("songid", audioCacheInfo != null ? audioCacheInfo.e() : null);
        lVarArr[5] = new jz5.l("session_buffer", audioCacheInfo != null ? audioCacheInfo.D : null);
        return kz5.c1.k(lVarArr);
    }
}
