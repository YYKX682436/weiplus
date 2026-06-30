package x51;

/* loaded from: classes13.dex */
public abstract class z0 {
    public static void a(android.content.Context context, java.lang.String str, boolean z17) {
        android.net.Uri defaultUri = str == null ? android.media.RingtoneManager.getDefaultUri(2) : z17 ? com.tencent.mm.sdk.platformtools.i1.b(context, com.tencent.mm.vfs.r6.j(new java.io.File(str))) : android.net.Uri.parse(str);
        to.g gVar = new to.g();
        try {
            gVar.setDataSource(context, defaultUri);
            gVar.setOnCompletionListener(new x51.y0());
            if (ym1.f.Di(5) != 0) {
                if (ym1.f.Ri()) {
                    int Di = ym1.f.Di(8);
                    ym1.e eVar = ym1.f.f463134h;
                    int g17 = eVar.b().g(8);
                    int Di2 = ym1.f.Di(5);
                    if (Di2 <= g17) {
                        g17 = Di2;
                    }
                    eVar.b().z(8, g17, 0);
                    gVar.setAudioStreamType(8);
                    gVar.setLooping(true);
                    gVar.prepare();
                    gVar.setLooping(false);
                    gVar.start();
                    eVar.b().z(8, Di, 0);
                } else {
                    gVar.setAudioStreamType(5);
                    gVar.setLooping(true);
                    gVar.prepare();
                    gVar.setLooping(false);
                    gVar.start();
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MiroMsg.NotificationUtil", e17, "", new java.lang.Object[0]);
        }
    }
}
