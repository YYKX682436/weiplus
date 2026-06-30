package va1;

/* loaded from: classes7.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f434231a;

    public static void a(android.content.Context context) {
        java.lang.String str = wo.v1.f447831k.f447587b;
        if (f434231a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WAGameShowFailDialogUtil", "hy: already shown");
            return;
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.a0v);
        com.tencent.mm.plugin.appbrand.ipc.d.a(context, !com.tencent.mm.sdk.platformtools.t8.K0(str) ? str : string, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f490573yv), com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f490507x1), "", new va1.c(), new va1.d(), new va1.e());
        f434231a = true;
    }
}
