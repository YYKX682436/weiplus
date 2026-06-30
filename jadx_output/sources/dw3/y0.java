package dw3;

/* loaded from: classes10.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final dw3.y0 f244294a = new dw3.y0();

    public final java.lang.String a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPluginNameUtil", "nameTranslate " + str);
        return kotlin.jvm.internal.o.b(str, yt3.i.class.getName()) ? "plugin_emoji" : kotlin.jvm.internal.o.b(str, yt3.m.class.getName()) ? "plugin_text" : kotlin.jvm.internal.o.b(str, iu3.e.class.getName()) ? "plugin_music" : kotlin.jvm.internal.o.b(str, au3.l.class.getName()) ? "plugin_video_crop" : kotlin.jvm.internal.o.b(str, yt3.u0.class.getName()) ? "plugin_photo_crop" : kotlin.jvm.internal.o.b(str, yt3.q.class.getName()) ? "plugin_back" : kotlin.jvm.internal.o.b(str, yt3.p.class.getName()) ? "plugin_tip" : kotlin.jvm.internal.o.b(str, yt3.j.class.getName()) ? "plugin_poi" : kotlin.jvm.internal.o.b(str, yt3.f0.class.getName()) ? "plugin_menu" : kotlin.jvm.internal.o.b(str, yt3.v0.class.getName()) ? "plugin_doodle" : str;
    }
}
