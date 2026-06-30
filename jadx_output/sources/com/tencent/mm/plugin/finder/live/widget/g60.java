package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class g60 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z60 f118409d;

    public g60(com.tencent.mm.plugin.finder.live.widget.z60 z60Var) {
        this.f118409d = z60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        kotlinx.coroutines.flow.f3 f3Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$createCoLiveOptionsContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.z60 z60Var = this.f118409d;
        z60Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "Show co live setting panel");
        gk2.e eVar = dk2.ef.I;
        mm2.n0 n0Var = eVar != null ? (mm2.n0) eVar.a(mm2.n0.class) : null;
        android.content.Context context = z60Var.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        boolean z17 = n0Var != null && n0Var.O6();
        boolean z18 = n0Var != null && n0Var.P6(e17);
        r45.f50 f50Var = (n0Var == null || (f3Var = n0Var.f329265g) == null) ? null : (r45.f50) ((kotlinx.coroutines.flow.l2) f3Var).getValue();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        re2.e0 e0Var = re2.j1.f394438b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[showCoLiveSettingDialog] hasActiveInvitation=");
        sb6.append(z17);
        sb6.append(", isInitiator=");
        sb6.append(z18);
        sb6.append(", invitationId=");
        sb6.append(f50Var != null ? java.lang.Long.valueOf(f50Var.f374013d) : null);
        sb6.append(", status=");
        sb6.append(f50Var != null ? java.lang.Integer.valueOf(f50Var.f374014e) : null);
        sb6.append(", role=");
        sb6.append(f50Var != null ? java.lang.Integer.valueOf(f50Var.f374019m) : null);
        sb6.append(", initiatorUsername=");
        sb6.append((f50Var == null || (finderContact = f50Var.f374017h) == null) ? null : finderContact.getUsername());
        sb6.append(", myFinderUsername=");
        sb6.append(e17);
        sb6.append(", expireTime=");
        sb6.append(f50Var != null ? java.lang.Long.valueOf(f50Var.f374018i) : null);
        sb6.append(", now=");
        sb6.append(currentTimeMillis);
        sb6.append(", existingTaskPhase=");
        sb6.append(e0Var != null ? e0Var.f394389b : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", sb6.toString());
        if ((e0Var == null || !e0Var.d()) && !(z17 && z18)) {
            com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "[showCoLiveSettingDialog] 无有效邀请 → 打开 SettingPanel");
            android.content.Context context2 = z60Var.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            com.tencent.mm.plugin.finder.live.widget.yb ybVar = new com.tencent.mm.plugin.finder.live.widget.yb(context2);
            ybVar.I = new com.tencent.mm.plugin.finder.live.widget.y60(ybVar, e17, z60Var);
            ybVar.V(null, true, 0);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "[showCoLiveSettingDialog] 复用/恢复 Task → 打开 PreparePanel");
            if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                com.tencent.mm.plugin.finder.live.widget.ta taVar = com.tencent.mm.plugin.finder.live.widget.nb.W;
                android.content.Context context3 = z60Var.getContext();
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                taVar.a(context3);
            } else {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.finder.live.widget.t60(z60Var));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$createCoLiveOptionsContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
