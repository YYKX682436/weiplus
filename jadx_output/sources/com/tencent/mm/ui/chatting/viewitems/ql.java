package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ql implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public long f205379d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot0.q f205380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ue4.z f205381f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f205382g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205383h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.wl f205384i;

    public ql(com.tencent.mm.ui.chatting.viewitems.wl wlVar, ot0.q qVar, ue4.z zVar, boolean z17, yb5.d dVar) {
        this.f205384i = wlVar;
        this.f205380e = qVar;
        this.f205381f = zVar;
        this.f205382g = z17;
        this.f205383h = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (java.lang.System.currentTimeMillis() - this.f205379d <= 2000) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f205379d = java.lang.System.currentTimeMillis();
        ot0.q qVar = this.f205380e;
        if (qVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemHardDeviceMsg", "onClick: content is null");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ue4.z zVar = this.f205381f;
        if (zVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemHardDeviceMsg", "onClick: finalSportsAppMsgContent == null");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean z17 = this.f205382g;
        yb5.d dVar = this.f205383h;
        if (z17) {
            a42.g.f1206a.b(dVar.g(), zVar.f426943l, zVar.f426944m, zVar.f426945n, zVar.f426946o);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemHardDeviceMsg", "onClick: setTextStatusLl");
            int i17 = qVar.D0;
            java.lang.String str = zVar.f426935d;
            com.tencent.mm.ui.chatting.viewitems.wl wlVar = this.f205384i;
            if (wlVar.d0(i17, str)) {
                db5.t7.i(dVar.g(), dVar.g().getString(com.tencent.mm.R.string.c4z), com.tencent.mm.R.raw.icons_outlined_info);
            } else {
                int parseInt = java.lang.Integer.parseInt(qVar.f348703r0);
                jx3.f.INSTANCE.d(13168, 44, 0, java.lang.Integer.valueOf(parseInt), zVar.f426933b);
                java.lang.String str2 = zVar.f426933b;
                java.lang.String str3 = zVar.f426934c;
                int parseInt2 = java.lang.Integer.parseInt(qVar.f348703r0);
                if (!android.text.TextUtils.isEmpty(str2)) {
                    xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
                    android.app.Activity context = wlVar.f205950s.g();
                    com.tencent.mm.ui.chatting.viewitems.ul ulVar = new com.tencent.mm.ui.chatting.viewitems.ul(wlVar, str2, parseInt2, str3);
                    ((we0.j1) l0Var).getClass();
                    kotlin.jvm.internal.o.g(context, "context");
                    if (str2 != null) {
                        ej4.c cVar = new ej4.c(str2, 1);
                        com.tencent.mm.ui.widget.dialog.u3 P = db5.e1.P(context, context.getString(com.tencent.mm.R.string.f490468vx), 3, context.getString(com.tencent.mm.R.string.f490468vx), false, true, new we0.h1(cVar));
                        kotlin.jvm.internal.o.f(P, "showProgressDlg(...)");
                        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
                        kotlin.jvm.internal.o.f(d17, "getNetSceneQueue(...)");
                        ii4.a.a(d17, cVar, null, new we0.g1(cVar, ulVar, P));
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
