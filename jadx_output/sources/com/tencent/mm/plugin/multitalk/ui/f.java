package com.tencent.mm.plugin.multitalk.ui;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modeltalkroom.MultiTalkGroup f150281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.h f150282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f150283f;

    public f(com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup, com.tencent.mm.plugin.multitalk.ui.h hVar, android.content.Intent intent) {
        this.f150281d = multiTalkGroup;
        this.f150282e = hVar;
        this.f150283f = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup = this.f150281d;
        if (multiTalkGroup != null) {
            com.tencent.mm.plugin.multitalk.ui.h hVar = this.f150282e;
            android.content.Intent intent = this.f150283f;
            com.tencent.mm.plugin.multitalk.ui.a aVar = hVar.f150285w;
            if (aVar != null) {
                com.tencent.mm.plugin.multitalk.model.j1 j1Var = (com.tencent.mm.plugin.multitalk.model.j1) aVar;
                java.lang.String d17 = com.tencent.mm.plugin.multitalk.model.o2.d(multiTalkGroup);
                if (fp.h.b(28) || android.os.Build.VERSION.CODENAME.equals("Q")) {
                    com.tencent.mm.plugin.multitalk.model.v0 v0Var = j1Var.f150019a;
                    v0Var.f150185y0 = new com.tencent.mm.plugin.multitalk.model.s1(v0Var, multiTalkGroup, java.lang.Boolean.FALSE);
                }
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.h1x);
                intent.putExtra("Voip_User", d17);
                tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String d18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(intent.getStringExtra("Voip_User"), true).d1();
                ((sg3.a) v0Var2).getClass();
                java.lang.String e17 = c01.a2.e(d18);
                android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(com.tencent.mm.sdk.platformtools.x2.f193072b, com.tencent.mm.R.layout.f489310c32);
                remoteViews.setTextViewText(com.tencent.mm.R.id.kg7, string);
                remoteViews.setTextViewText(com.tencent.mm.R.id.f486168kg0, e17);
                remoteViews.setImageViewResource(com.tencent.mm.R.id.pjk, com.tencent.mm.R.drawable.btt);
                remoteViews.setImageViewResource(com.tencent.mm.R.id.kfq, com.tencent.mm.R.drawable.btq);
                java.lang.String str = e17 + string;
                uf0.e eVar = (uf0.e) i95.n0.c(uf0.e.class);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                if (com.tencent.mm.sdk.platformtools.t8.K0(n25.a.f334318b)) {
                    n25.a.f334318b = gm0.m.v().getString("voip_notify_channel_new_id", "voip_notify_channel_new_id");
                }
                ((tf0.a) eVar).Ai(context, "multitalk", ".ui.MultiTalkMainUI", intent, remoteViews, str, true, n25.a.f334318b, true);
            }
        }
    }
}
