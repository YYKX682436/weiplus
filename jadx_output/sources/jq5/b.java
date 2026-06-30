package jq5;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final jq5.b f301255a = new jq5.b();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f301256b = jz5.h.b(jq5.a.f301254d);

    public final void a(java.util.Set imgPathSet, java.util.Set videoPathSet) {
        kotlin.jvm.internal.o.g(imgPathSet, "imgPathSet");
        kotlin.jvm.internal.o.g(videoPathSet, "videoPathSet");
        b().F("select_img_path", imgPathSet);
        b().F("select_video_path", videoPathSet);
        b().B("last_select_time", c01.id.c());
    }

    public final com.tencent.mm.sdk.platformtools.o4 b() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f301256b).getValue();
    }
}
