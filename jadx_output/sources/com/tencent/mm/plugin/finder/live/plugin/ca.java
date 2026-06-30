package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ca implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.fa f112128d;

    public ca(com.tencent.mm.plugin.finder.live.plugin.fa faVar) {
        this.f112128d = faVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.ca caVar;
        boolean z17;
        java.lang.String str;
        java.lang.String string;
        java.lang.String string2;
        r45.ba4 ba4Var = (r45.ba4) obj;
        if (ba4Var != null) {
            if (zl2.r4.f473950a.l2(ba4Var)) {
                caVar = this;
                z17 = true;
            } else {
                caVar = this;
                z17 = false;
            }
            com.tencent.mm.plugin.finder.live.plugin.fa faVar = caVar.f112128d;
            if (!z17) {
                com.tencent.mars.xlog.Log.i(faVar.f112525p, "liveRoomImg invaild = " + pm0.b0.g(ba4Var));
                return;
            }
            faVar.getClass();
            java.lang.String str2 = "[showLiveRoomImg] info = " + pm0.b0.g(ba4Var);
            java.lang.String str3 = faVar.f112525p;
            com.tencent.mars.xlog.Log.i(str3, str2);
            faVar.y1();
            int integer = ba4Var.getInteger(2);
            str = "";
            android.widget.FrameLayout frameLayout = faVar.f112527r;
            if (integer == 0) {
                frameLayout.removeAllViews();
                frameLayout.setVisibility(8);
                faVar.f112526q.setVisibility(0);
                java.lang.String string3 = ba4Var.getString(0);
                faVar.v1(string3 != null ? string3 : "");
                return;
            }
            if (integer != 1) {
                com.tencent.mars.xlog.Log.i(str3, "[showLiveRoomImg] unknown img type");
                return;
            }
            r45.gg0 gg0Var = (r45.gg0) ba4Var.getCustom(1);
            if (gg0Var != null && (string2 = gg0Var.getString(1)) != null) {
                str = string2;
            }
            faVar.v1(str);
            frameLayout.removeAllViews();
            if (faVar.f112530u) {
                com.tencent.mars.xlog.Log.i(str3, "plugin has unmount, dont new player");
                return;
            }
            android.content.Context context = faVar.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = new com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy(context);
            finderLiveThumbPlayerProxy.setLoop(true);
            finderLiveThumbPlayerProxy.setMute(true);
            finderLiveThumbPlayerProxy.setScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
            r45.mb4 mb4Var = new r45.mb4();
            r45.gg0 gg0Var2 = (r45.gg0) ba4Var.getCustom(1);
            mb4Var.set(0, gg0Var2 != null ? gg0Var2.getString(0) : null);
            r45.gg0 gg0Var3 = (r45.gg0) ba4Var.getCustom(1);
            mb4Var.set(1, gg0Var3 != null ? gg0Var3.getString(1) : null);
            mb4Var.set(9, kk.k.e(mb4Var.getString(0)));
            mn2.g4 g4Var = new mn2.g4(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128357g, "xV0", 0, 0, null, false, null, 248, null);
            r45.gg0 gg0Var4 = (r45.gg0) ba4Var.getCustom(1);
            finderLiveThumbPlayerProxy.n(g4Var, (gg0Var4 == null || (string = gg0Var4.getString(0)) == null || r26.i0.y(string, "http", false)) ? false : true, new com.tencent.mm.plugin.finder.storage.FeedData());
            faVar.f112528s = finderLiveThumbPlayerProxy;
            finderLiveThumbPlayerProxy.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
            com.tencent.mars.xlog.Log.i(str3, "playerView new " + faVar.f112528s);
            frameLayout.addView(faVar.f112528s);
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy2 = faVar.f112528s;
            if (finderLiveThumbPlayerProxy2 != null) {
                finderLiveThumbPlayerProxy2.setVideoViewFocused(true);
            }
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy3 = faVar.f112528s;
            if (finderLiveThumbPlayerProxy3 != null) {
                zy2.g5.u(finderLiveThumbPlayerProxy3, null, 1, null);
            }
            frameLayout.setVisibility(0);
        }
    }
}
