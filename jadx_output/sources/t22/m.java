package t22;

/* loaded from: classes10.dex */
public final class m implements q25.a {
    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] args, java.lang.String username) {
        kotlin.jvm.internal.o.g(args, "args");
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureCommand", "processCommand: ".concat(kz5.z.d0(args, " ", null, null, 0, null, null, 62, null)));
        if (args.length <= 1 || !kotlin.jvm.internal.o.b(args[1], "sticker") || args.length <= 2) {
            return false;
        }
        java.lang.String str = args[2];
        if (kotlin.jvm.internal.o.b(str, "clean")) {
            v85.e eVar = v85.e.f434103a;
            v85.e.f434108f.f383710d.clear();
            eVar.b();
        } else if (kotlin.jvm.internal.o.b(str, "assets")) {
            p05.a3.f350439a.a();
        }
        return true;
    }
}
