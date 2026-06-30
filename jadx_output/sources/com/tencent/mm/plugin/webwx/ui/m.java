package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public final class m extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f188044d;

    /* renamed from: e, reason: collision with root package name */
    public int f188045e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.webwx.ui.r f188046f;

    public m(java.util.ArrayList onlineInfoList, int i17, com.tencent.mm.plugin.webwx.ui.r rVar) {
        kotlin.jvm.internal.o.g(onlineInfoList, "onlineInfoList");
        this.f188044d = onlineInfoList;
        this.f188045e = i17;
        this.f188046f = rVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f188044d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        int i18;
        com.tencent.mm.plugin.webwx.ui.k0 viewHolder = (com.tencent.mm.plugin.webwx.ui.k0) k3Var;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        java.lang.Object obj = this.f188044d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        ug3.k kVar = (ug3.k) obj;
        boolean z17 = this.f188045e == i17;
        int i19 = kVar.f392471n;
        android.widget.RelativeLayout relativeLayout = viewHolder.f188026i;
        if (i19 != 6 || com.tencent.mm.sdk.platformtools.t8.K0(kVar.f427562z)) {
            relativeLayout.setVisibility(8);
        } else {
            relativeLayout.setVisibility(0);
            relativeLayout.setOnClickListener(new com.tencent.mm.plugin.webwx.ui.s(kVar, viewHolder));
        }
        if (!ip.b.s() || kVar.H) {
            android.view.View view = viewHolder.f188031q;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "fillContent", "(Lcom/tencent/mm/plugin/messenger/extdevice/NetSceneGetOnlineInfo$LocalOnlineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "fillContent", "(Lcom/tencent/mm/plugin/messenger/extdevice/NetSceneGetOnlineInfo$LocalOnlineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewHolder.f188020J = false;
        } else {
            boolean K = c01.z1.K();
            viewHolder.f188020J = K;
            viewHolder.j(K);
            viewHolder.f188032r.setOnClickListener(new com.tencent.mm.plugin.webwx.ui.v(viewHolder, kVar));
        }
        viewHolder.f188028n.setVisibility(z17 ? 0 : 8);
        viewHolder.f188027m.setRotation(z17 ? 270.0f : 90.0f);
        viewHolder.f188023f.setOnClickListener(new com.tencent.mm.plugin.webwx.ui.w(kVar, z17, viewHolder, i17));
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginDeviceAdapter", kVar.f392471n + ", need hide lock bt : " + kVar.G + ", isLock:" + viewHolder.K + ", isWebWXLocked:" + kVar.f427554J);
        boolean z18 = kVar.G;
        android.widget.LinearLayout linearLayout = viewHolder.f188034t;
        if (z18) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            android.content.Context context = viewHolder.f188021d;
            android.animation.Animator loadAnimator = android.animation.AnimatorInflater.loadAnimator(context, com.tencent.mm.R.animator.f477960e);
            com.tencent.mm.ui.widget.progress.MMProgressWheel mMProgressWheel = viewHolder.f188038x;
            loadAnimator.setTarget(mMProgressWheel);
            android.animation.Animator loadAnimator2 = android.animation.AnimatorInflater.loadAnimator(context, com.tencent.mm.R.animator.f477961f);
            loadAnimator2.setTarget(mMProgressWheel);
            loadAnimator2.addListener(new com.tencent.mm.plugin.webwx.ui.x(viewHolder));
            viewHolder.I = loadAnimator2;
            boolean z19 = kVar.f427554J;
            viewHolder.K = z19;
            viewHolder.k(z19);
            viewHolder.f188035u.setOnClickListener(new com.tencent.mm.plugin.webwx.ui.z(viewHolder, kVar, loadAnimator));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginDeviceAdapter", kVar.f392471n + ", need hide file bt:" + kVar.I);
        boolean z27 = kVar.I;
        android.widget.LinearLayout linearLayout2 = viewHolder.f188039y;
        if (z27) {
            linearLayout2.setVisibility(8);
        } else {
            linearLayout2.setVisibility(0);
            viewHolder.f188040z.setOnClickListener(new com.tencent.mm.plugin.webwx.ui.a0(viewHolder, kVar));
        }
        android.view.View view2 = viewHolder.f188031q;
        if (view2.getVisibility() == 0 && linearLayout.getVisibility() == 0 && linearLayout2.getVisibility() == 0) {
            android.view.View view3 = viewHolder.G;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = viewHolder.H;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (view2.getVisibility() == 8 && linearLayout.getVisibility() == 8 && linearLayout2.getVisibility() == 8) {
            android.view.View view5 = viewHolder.G;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = viewHolder.H;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (view2.getVisibility() == 8 && linearLayout.getVisibility() == 0 && linearLayout2.getVisibility() == 0) {
            android.view.View view7 = viewHolder.G;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view8 = viewHolder.H;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (view2.getVisibility() == 0 && linearLayout.getVisibility() == 8 && linearLayout2.getVisibility() == 0) {
            android.view.View view9 = viewHolder.G;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view9, arrayList8.toArray(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view10 = viewHolder.H;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view10, arrayList9.toArray(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (view2.getVisibility() == 0 && linearLayout.getVisibility() == 0 && linearLayout2.getVisibility() == 8) {
            android.view.View view11 = viewHolder.G;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view11, arrayList10.toArray(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view11, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view12 = viewHolder.H;
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view12, arrayList11.toArray(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view12, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (view2.getVisibility() == 0 && linearLayout.getVisibility() == 8 && linearLayout2.getVisibility() == 8) {
            android.view.View view13 = viewHolder.G;
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
            arrayList12.add(8);
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(view13, arrayList12.toArray(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(view13, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view14 = viewHolder.H;
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            arrayList13.add(8);
            java.util.Collections.reverse(arrayList13);
            yj0.a.d(view14, arrayList13.toArray(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view14.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
            yj0.a.f(view14, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (view2.getVisibility() == 8 && linearLayout.getVisibility() == 0 && linearLayout2.getVisibility() == 8) {
            android.view.View view15 = viewHolder.G;
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
            arrayList14.add(8);
            java.util.Collections.reverse(arrayList14);
            yj0.a.d(view15, arrayList14.toArray(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
            yj0.a.f(view15, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view16 = viewHolder.H;
            java.util.ArrayList arrayList15 = new java.util.ArrayList();
            arrayList15.add(8);
            java.util.Collections.reverse(arrayList15);
            yj0.a.d(view16, arrayList15.toArray(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view16.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
            yj0.a.f(view16, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (view2.getVisibility() == 8 && linearLayout.getVisibility() == 8 && linearLayout2.getVisibility() == 0) {
            android.view.View view17 = viewHolder.G;
            java.util.ArrayList arrayList16 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
            arrayList16.add(8);
            java.util.Collections.reverse(arrayList16);
            yj0.a.d(view17, arrayList16.toArray(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view17.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
            yj0.a.f(view17, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view18 = viewHolder.H;
            java.util.ArrayList arrayList17 = new java.util.ArrayList();
            arrayList17.add(8);
            java.util.Collections.reverse(arrayList17);
            yj0.a.d(view18, arrayList17.toArray(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view18.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
            yj0.a.f(view18, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean z28 = kVar.K;
        android.widget.RelativeLayout relativeLayout2 = viewHolder.C;
        if (z28) {
            relativeLayout2.setVisibility(0);
            viewHolder.D.setChecked(kVar.L);
            relativeLayout2.setOnClickListener(new com.tencent.mm.plugin.webwx.ui.d0(kVar, viewHolder));
        } else {
            relativeLayout2.setVisibility(8);
        }
        boolean z29 = kVar.M;
        android.widget.RelativeLayout relativeLayout3 = viewHolder.E;
        if (z29) {
            relativeLayout3.setVisibility(0);
            viewHolder.F.setChecked(kVar.N);
            relativeLayout3.setOnClickListener(new com.tencent.mm.plugin.webwx.ui.i0(kVar, viewHolder));
            i18 = 8;
        } else {
            i18 = 8;
            relativeLayout3.setVisibility(8);
        }
        int visibility = view2.getVisibility();
        android.widget.RelativeLayout relativeLayout4 = viewHolder.f188029o;
        if (visibility == i18 && linearLayout.getVisibility() == i18 && linearLayout2.getVisibility() == i18) {
            relativeLayout4.setVisibility(i18);
            android.view.View view19 = viewHolder.f188030p;
            java.util.ArrayList arrayList18 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal10 = zj0.c.f473285a;
            arrayList18.add(8);
            java.util.Collections.reverse(arrayList18);
            yj0.a.d(view19, arrayList18.toArray(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "fillContent", "(Lcom/tencent/mm/plugin/messenger/extdevice/NetSceneGetOnlineInfo$LocalOnlineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view19.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
            yj0.a.f(view19, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "fillContent", "(Lcom/tencent/mm/plugin/messenger/extdevice/NetSceneGetOnlineInfo$LocalOnlineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            relativeLayout4.setVisibility(0);
            android.view.View view20 = viewHolder.f188030p;
            java.util.ArrayList arrayList19 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal11 = zj0.c.f473285a;
            arrayList19.add(0);
            java.util.Collections.reverse(arrayList19);
            yj0.a.d(view20, arrayList19.toArray(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "fillContent", "(Lcom/tencent/mm/plugin/messenger/extdevice/NetSceneGetOnlineInfo$LocalOnlineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view20.setVisibility(((java.lang.Integer) arrayList19.get(0)).intValue());
            yj0.a.f(view20, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "fillContent", "(Lcom/tencent/mm/plugin/messenger/extdevice/NetSceneGetOnlineInfo$LocalOnlineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(kVar.f427561y)) {
            viewHolder.B.setText(kVar.f427561y);
        }
        viewHolder.A.setOnClickListener(new com.tencent.mm.plugin.webwx.ui.j0(kVar, viewHolder));
        viewHolder.l(kVar);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        kotlin.jvm.internal.o.g(viewGroup, "viewGroup");
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.view.View inflate = com.tencent.mm.ui.id.b(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.bsx, viewGroup, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.plugin.webwx.ui.k0(context, inflate, this.f188046f);
    }
}
