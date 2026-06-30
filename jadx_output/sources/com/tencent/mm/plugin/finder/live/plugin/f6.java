package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class f6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.w f112503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.i6 f112504e;

    public f6(cm2.w wVar, com.tencent.mm.plugin.finder.live.plugin.i6 i6Var) {
        this.f112503d = wVar;
        this.f112504e = i6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorInviteMicBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cm2.w wVar = this.f112503d;
        if (wVar.f43406v.getInteger(2) == 3) {
            ml2.n4 n4Var = ml2.n4.f327759x1;
            com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 60");
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
        } else {
            ml2.n4 n4Var2 = ml2.n4.N;
            com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 37");
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.r0.ik((ml2.r0) c18, n4Var2, null, 0, 6, null);
        }
        com.tencent.mm.plugin.finder.live.plugin.i6 i6Var = this.f112504e;
        if (((mm2.e1) i6Var.f112920e.a(mm2.e1.class)).g7()) {
            r45.ih1 ih1Var = wVar.f43406v;
            i6Var.getClass();
            com.tencent.mars.xlog.Log.i(i6Var.f112924i, "requestAudioMic pos: " + ih1Var.getInteger(1));
            zl2.r4 r4Var = zl2.r4.f473950a;
            gk2.e eVar = i6Var.f112920e;
            android.content.Context context = i6Var.f112919d;
            java.lang.String string = context.getString(com.tencent.mm.R.string.ec6);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.f491825ec4);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            if (r4Var.B(context, eVar, string, string2, new com.tencent.mm.plugin.finder.live.plugin.h6(i6Var, ih1Var))) {
                i6Var.a();
            } else {
                i6Var.b(ih1Var);
            }
        } else {
            r45.ih1 ih1Var2 = wVar.f43406v;
            i6Var.getClass();
            qo0.b bVar = qo0.b.V3;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_POSITION", ih1Var2.getInteger(1));
            com.tencent.mm.protobuf.g byteString = ih1Var2.getByteString(4);
            bundle.putByteArray("PARAM_FINDER_LIVE_LINK_MIC_BUFFER", byteString != null ? byteString.f192156a : null);
            bundle.putBoolean("PARAM_FINDER_LIVE_LINK_MIC_CAN_AUTO_LINK", true);
            bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_SOURCE", 4);
            i6Var.f112921f.statusChange(bVar, bundle);
            i6Var.a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorInviteMicBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
