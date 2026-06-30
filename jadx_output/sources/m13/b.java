package m13;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final m13.b f322862a = new m13.b();

    public final void a(android.content.Context context, int i17, boolean z17, i50.n callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(context)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ForceNotifyPermissionUtil", "checkPermission already granted");
            callback.a(true);
            return;
        }
        com.tencent.mm.storage.u3 u3Var = i17 == 2 ? com.tencent.mm.storage.u3.USERINFO_FORCE_NOTIFY_PERMISSION_LIVE_POP_COUNT_INT_SYNC : null;
        if (u3Var != null) {
            int r17 = gm0.j1.u().c().r(u3Var, 0);
            if (r17 >= 1) {
                callback.a(false);
                return;
            }
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
        }
        m13.a aVar = new m13.a(callback, context);
        jz5.l lVar = i17 != 1 ? i17 != 2 ? i17 != 3 ? new jz5.l(context.getString(com.tencent.mm.R.string.f492155ff4), context.getString(com.tencent.mm.R.string.f492152ff1)) : new jz5.l(context.getString(com.tencent.mm.R.string.f492155ff4), context.getString(com.tencent.mm.R.string.f492154ff3)) : new jz5.l(context.getString(com.tencent.mm.R.string.f492156ff5), context.getString(com.tencent.mm.R.string.f492153ff2)) : new jz5.l(context.getString(com.tencent.mm.R.string.f492155ff4), context.getString(com.tencent.mm.R.string.f492152ff1));
        java.lang.String title = (java.lang.String) lVar.f302833d;
        java.lang.String warningContent = (java.lang.String) lVar.f302834e;
        k13.h hVar = com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUI.f137329f;
        java.lang.String a17 = n25.a.a();
        kotlin.jvm.internal.o.f(a17, "getMessageChannelIdUse(...)");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(warningContent, "warningContent");
        com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUI.f137329f = aVar;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUI.class);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, title);
        intent.putExtra("warning_content", warningContent);
        if (z17) {
            intent.addFlags(805306368);
        }
        uf0.e eVar = (uf0.e) i95.n0.c(uf0.e.class);
        java.lang.String canonicalName = com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUI.class.getCanonicalName();
        kotlin.jvm.internal.o.d(canonicalName);
        ((tf0.a) eVar).getClass();
        bm5.e.a(context, intent, warningContent, canonicalName, false, a17, false);
    }
}
