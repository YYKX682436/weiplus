package yo3;

/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.ref.WeakReference f464143a;

    public static final void a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        intent.putExtra("android.intent.extra.shortcut.NAME", context.getString(com.tencent.mm.R.string.pej));
        intent.putExtra("duplicate", false);
        android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.ui.ShortCutDispatchAction");
        intent2.putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_offline_wallet");
        intent2.putExtra("from_pinned_shortcut", true);
        intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
        intent.putExtra("shortcut_is_adaptive_icon", true);
        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", android.content.Intent.ShortcutIconResource.fromContext(context, com.tencent.mm.R.drawable.dbi));
        intent.putExtra("shortcut_icon_resource_id", com.tencent.mm.R.drawable.dbi);
        ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
        xp1.c.b(context, intent, "offline_pay_shortcut", null, false, com.tencent.mm.plugin.offline.util.OfflinePayShortcutReceiver.class);
    }

    public static final void b(java.lang.String url, int i17) {
        kotlin.jvm.internal.o.g(url, "url");
        try {
            com.tencent.kinda.gen.KindaGlobalReporter createReporter = com.tencent.kinda.gen.KindaGlobalReporter.createReporter();
            if (createReporter != null) {
                createReporter.log(new com.tencent.kinda.gen.KindaLogRecord(3, "", 0L, url, i17, null));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OfflinePayShortcutUtil", "reportViaKindaReporter failed: %s", th6.getMessage());
        }
    }
}
