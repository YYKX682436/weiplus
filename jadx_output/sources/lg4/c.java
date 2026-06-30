package lg4;

/* loaded from: classes5.dex */
public final class c implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final lg4.b f318578a = new lg4.b(null);

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] args, java.lang.String username) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(args, "args");
        kotlin.jvm.internal.o.g(username, "username");
        lg4.b bVar = f318578a;
        if (!kotlin.jvm.internal.o.b(args.length > 0 ? args[0] : "", "//surface")) {
            return false;
        }
        java.lang.String str = args.length > 1 ? args[1] : "";
        if (kotlin.jvm.internal.o.b(str, "ui")) {
            android.content.Intent intent = new android.content.Intent();
            if (args.length > 2) {
                intent.putStringArrayListExtra("appIds", nf.e.e(kz5.v.s(args, 2, args.length)));
            }
            j45.l.j(context, "surface", ".test.TestUI", intent, null);
        } else if (!kotlin.jvm.internal.o.b(str, "downloadPkg")) {
            if (!kotlin.jvm.internal.o.b(str, "clearpkg")) {
                if (!(r26.n0.B("mainProcess", str, false) ? true : kotlin.jvm.internal.o.b(str, "preloadPs") ? true : kotlin.jvm.internal.o.b(str, "mainScriptParallel"))) {
                    return false;
                }
                if (args.length > 2) {
                    boolean y17 = com.tencent.mm.sdk.platformtools.t8.y(args[2], false);
                    java.lang.String command = args.length > 1 ? args[1] : "";
                    kotlin.jvm.internal.o.g(command, "command");
                    com.tencent.mm.sdk.platformtools.o4.M("MagicBrushDebugStorage").putBoolean("MagicBrushTestSwitch_".concat(command), y17);
                }
            } else if (com.tencent.mm.vfs.w6.g(((com.tencent.mm.plugin.magicbrush.s7) ((com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class))).Di().concat("mbpkgs/"), true)) {
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490918b90);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                lg4.b.a(bVar, string);
            } else {
                java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b8z);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                lg4.b.a(bVar, string2);
            }
        }
        return true;
    }
}
