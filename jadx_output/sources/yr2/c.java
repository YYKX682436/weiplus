package yr2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final yr2.c f464661a = new yr2.c();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f464662b = jz5.h.b(yr2.b.f464660d);

    public final dk4.a a(com.tencent.mm.protocal.protobuf.FinderMedia finderMedia, long j17, boolean z17) {
        if (finderMedia == null) {
            return null;
        }
        r45.mb4 i17 = bu2.z.i(finderMedia);
        mn2.g4 c17 = z17 ? ds2.h.f242866a.c(j17, i17, false) : ((yr2.k) ((jz5.n) f464662b).getValue()).b(j17, i17);
        java.lang.String n17 = c17.n();
        java.lang.String path = c17.getPath();
        java.lang.String url = c17.getUrl();
        java.lang.String i18 = c17.i();
        java.lang.String h17 = c17.h();
        long videoDuration = finderMedia.getVideoDuration();
        java.lang.String g17 = c17.g();
        mn2.c1 c1Var = new mn2.c1(i17, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null);
        java.lang.String path2 = c1Var.getPath();
        java.lang.String l17 = c1Var.l();
        java.lang.String m17 = c1Var.m();
        int width = (int) finderMedia.getWidth();
        int height = (int) finderMedia.getHeight();
        dk4.a aVar = new dk4.a(n17, path, url, width, height);
        aVar.f234467d = h17;
        aVar.f234466c = i18;
        aVar.f234470g = videoDuration;
        aVar.f234465b = g17;
        aVar.f234473j = path2;
        aVar.f234471h = l17;
        aVar.f234472i = m17;
        aVar.f234485v = width;
        aVar.f234486w = height;
        aVar.f234487x = finderMedia.getFileSize();
        return aVar;
    }
}
