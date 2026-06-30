package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class mm implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.wm f119081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi2.w f119082e;

    public mm(com.tencent.mm.plugin.finder.live.widget.wm wmVar, zi2.w wVar) {
        this.f119081d = wmVar;
        this.f119082e = wVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        mm2.y0 y0Var = (mm2.y0) obj;
        int ordinal = y0Var.f329548a.ordinal();
        com.tencent.mm.plugin.finder.live.widget.wm wmVar = this.f119081d;
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2) {
                com.tencent.mars.xlog.Log.w(wmVar.f120208f, "Gift send failed: " + y0Var.f329548a);
                return;
            }
            return;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_KTV_SEND_GIFT_SHOWN_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        android.os.Bundle bundle = y0Var.f329550c;
        if (kotlin.jvm.internal.o.b(bundle.getString("PARAM_FINDER_LIVE_GIFT_ID"), wmVar.f120212m)) {
            ce2.i e17 = dk2.u7.f234181a.e(wmVar.f120212m);
            java.lang.String R0 = e17 != null ? e17.R0() : null;
            boolean z17 = bundle.getBoolean("PARAM_FINDER_LIVE_IS_LONG_CLICK_GIFT", false);
            int[] iArr = new int[2];
            android.view.ViewGroup viewGroup = wmVar.f120209g;
            viewGroup.getLocationOnScreen(iArr);
            int width = iArr[0] + (viewGroup.getWidth() / 2);
            int height = iArr[1] + (viewGroup.getHeight() / 2);
            com.tencent.mars.xlog.Log.i(wmVar.f120208f, "Gift send success, triggering flower animation");
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("gift_thumb_url", R0);
            bundle2.putBoolean("gift_is_long_click", z17);
            bundle2.putInt("gift_start_x", width);
            bundle2.putInt("gift_start_y", height);
            this.f119082e.f473153p.statusChange(qo0.b.S, bundle2);
        }
    }
}
