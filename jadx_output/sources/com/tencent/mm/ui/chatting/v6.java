package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class v6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.f7 f202797d;

    public v6(com.tencent.mm.ui.chatting.f7 f7Var) {
        this.f202797d = f7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.content.Intent intent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.f7 f7Var = this.f202797d;
        int ordinal = f7Var.f200496i.ordinal();
        if (ordinal == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 6);
            android.content.Context context = f7Var.f200489b;
            if (!com.tencent.mars.comm.NetStatusUtil.isConnected(context)) {
                db5.e1.y(context, i65.a.r(context, com.tencent.mm.R.string.azn), "", i65.a.r(context, com.tencent.mm.R.string.azi), null);
            } else if (com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
                android.content.Context context2 = f7Var.f200489b;
                db5.e1.p(context2, context2.getString(com.tencent.mm.R.string.azl), 0, context.getString(com.tencent.mm.R.string.azg), context.getString(com.tencent.mm.R.string.azf), new com.tencent.mm.ui.chatting.x6(f7Var), new com.tencent.mm.ui.chatting.y6(f7Var));
            } else {
                db5.e1.j(f7Var.f200489b, com.tencent.mm.R.string.azk, 0, com.tencent.mm.R.string.azg, com.tencent.mm.R.string.azf, new com.tencent.mm.ui.chatting.w6(f7Var), null);
            }
        } else if (ordinal == 2) {
            f7Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingQQMailFooterHandler", "dz[cancelDownload]");
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.r0.i().t(f7Var.f200503p);
            f7Var.b();
        } else if (ordinal == 3) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 7);
            f7Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingQQMailFooterHandler", "dz[installQQMail]");
            java.lang.String str = f7Var.f200502o;
            ((yb0.c) ((zb0.y) i95.n0.c(zb0.y.class))).getClass();
            com.tencent.mm.pluginsdk.model.app.n1.d(f7Var.f200489b, str, null, false);
        } else if (ordinal == 4) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 5);
            f7Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingQQMailFooterHandler", "dz[openQQMail]");
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingQQMailFooterHandler", "mQQMailScheme = %s", f7Var.f200504q);
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(f7Var.f200504q);
            android.content.Context context3 = f7Var.f200489b;
            if (K0) {
                intent = context3.getPackageManager().getLaunchIntentForPackage("com.tencent.androidqqmail");
            } else {
                intent = new android.content.Intent();
                intent.setData(android.net.Uri.parse(f7Var.f200504q));
                intent.addFlags(268435456);
                intent.addFlags(32768);
                if (!com.tencent.mm.sdk.platformtools.t8.I0(context3, intent, false, false)) {
                    intent = context3.getPackageManager().getLaunchIntentForPackage("com.tencent.androidqqmail");
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingQQMailFooterHandler", "intent = %s", intent);
            p95.a.a(new com.tencent.mm.ui.chatting.z6(f7Var, intent));
        } else if (ordinal == 5 && f7Var.f200498k) {
            com.tencent.mm.ui.chatting.f7.a(f7Var);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
