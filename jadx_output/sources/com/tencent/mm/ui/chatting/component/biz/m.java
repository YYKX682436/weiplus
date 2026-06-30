package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes8.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.a f198798d;

    public m(com.tencent.mm.ui.chatting.component.biz.a aVar) {
        this.f198798d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.biz.a aVar = this.f198798d;
        qk.o oVar = aVar.f198746h;
        if (oVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "bizInfo is null");
            return;
        }
        if (!oVar.Q0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "bizInfo is not serviceType: %d", java.lang.Integer.valueOf(aVar.f198746h.field_type));
            return;
        }
        if (aVar.f198580d.u() == null || aVar.f198580d.u().d1() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "talker or username is null");
            return;
        }
        java.lang.String d17 = aVar.f198580d.u().d1();
        if (!d17.equals(aVar.f198746h.field_username)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "biz username is not equal chatting talker: %s", d17);
            return;
        }
        if (c01.e2.d(d17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "in whitelist, talker: %s", d17);
            return;
        }
        com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
        if (launcherUI == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "launcherUI is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "showBottomSheet");
        com.tencent.mm.sdk.platformtools.o4.M("biz_mute_guide_config_" + c01.z1.r()).putLong("biz_mute_guide_show_time", c01.id.a());
        com.tencent.mm.ui.chatting.component.biz.m0 m0Var = new com.tencent.mm.ui.chatting.component.biz.m0(launcherUI);
        android.view.LayoutInflater.from(m0Var.f198801f.getContext()).inflate(com.tencent.mm.R.layout.f488227nl, (android.view.ViewGroup) m0Var.f198801f.findViewById(com.tencent.mm.R.id.av6), true);
        android.widget.ImageView imageView = (android.widget.ImageView) m0Var.f198801f.findViewById(com.tencent.mm.R.id.aj_);
        android.widget.ImageView imageView2 = (android.widget.ImageView) m0Var.f198801f.findViewById(com.tencent.mm.R.id.f483391aj5);
        android.widget.ImageView imageView3 = (android.widget.ImageView) m0Var.f198801f.findViewById(com.tencent.mm.R.id.aj9);
        android.widget.TextView textView = (android.widget.TextView) m0Var.f198801f.findViewById(com.tencent.mm.R.id.o_u);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) m0Var.f198801f.findViewById(com.tencent.mm.R.id.aj6);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new com.tencent.mm.ui.chatting.component.biz.p(aVar));
        imageView.setClickable(false);
        imageView.setLongClickable(false);
        imageView2.setClickable(false);
        imageView2.setLongClickable(false);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, d17, null);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView2, d17, null);
        oa5.b.b(imageView3).j(1000L).g(450L).e(0.625f).f(0.625f).k(new com.tencent.mm.ui.chatting.component.biz.q(aVar, textView)).l();
        com.tencent.mm.autogen.events.GetConvEvent getConvEvent = new com.tencent.mm.autogen.events.GetConvEvent();
        am.pf pfVar = getConvEvent.f54388g;
        pfVar.f7618c = 1;
        pfVar.f7616a = new com.tencent.mm.ui.chatting.component.biz.s(aVar, d17, m0Var);
        getConvEvent.e();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(d17);
        m0Var.f198801f.findViewById(com.tencent.mm.R.id.aj8).setOnClickListener(new com.tencent.mm.ui.chatting.component.biz.x(aVar, launcherUI, arrayList, m0Var));
        m0Var.f198802g = m0Var.a();
        m0Var.f198803h = launcherUI instanceof android.app.Activity ? launcherUI.getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0;
        if (m0Var.f198799d != null) {
            ((android.view.ViewGroup) m0Var.f198801f.getParent()).setVisibility(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) m0Var.f198801f.getLayoutParams();
            boolean z17 = m0Var.f198802g;
            android.view.View view = m0Var.f198804i;
            if (z17 && view != null) {
                android.graphics.Rect rect = new android.graphics.Rect();
                view.getWindowVisibleDisplayFrame(rect);
                layoutParams.width = rect.right;
            }
            m0Var.f198801f.setLayoutParams(layoutParams);
            m0Var.f198799d.getWindow().addFlags(Integer.MIN_VALUE);
            m0Var.f198799d.getWindow().clearFlags(8);
            m0Var.f198799d.getWindow().clearFlags(131072);
            m0Var.f198799d.getWindow().clearFlags(128);
            m0Var.f198799d.getWindow().getDecorView().setSystemUiVisibility(0);
            if (view != null) {
                boolean z18 = m0Var.f198805m == null;
                android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                m0Var.f198805m = viewTreeObserver;
                if (z18) {
                    viewTreeObserver.addOnGlobalLayoutListener(m0Var);
                }
            }
            if (!launcherUI.isFinishing()) {
                m0Var.f198799d.show();
            }
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = m0Var.f198806n;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f44443p = false;
            }
        }
    }
}
