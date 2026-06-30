package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class oi extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f113756p;

    /* renamed from: q, reason: collision with root package name */
    public zy2.gc f113757q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public oi(android.view.ViewGroup r1, qo0.c r2, r45.qt2 r3, int r4, kotlin.jvm.internal.i r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r4 = "root"
            kotlin.jvm.internal.o.g(r1, r4)
            java.lang.String r4 = "statusMonitor"
            kotlin.jvm.internal.o.g(r2, r4)
            r0.<init>(r1, r2, r3)
            r0.f113756p = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.oi.<init>(android.view.ViewGroup, qo0.c, r45.qt2, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (com.tencent.mm.plugin.finder.live.plugin.di.f112292a[status.ordinal()] == 1) {
            if (!((mm2.d) S0().a(mm2.d.class)).f328942f) {
                ya2.b2 b17 = ya2.h.f460484a.b(V0().f309129d.f68542m);
                t1(b17 != null ? b17.getAvatarUrl() : null, b17 != null ? b17.w0() : "", b17 != null ? b17.field_authInfo : null, ((mm2.c1) S0().a(mm2.c1.class)).U1, new com.tencent.mm.plugin.finder.live.plugin.ni(b17, this));
            } else {
                java.lang.String string = this.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.dfh, ((mm2.d) S0().a(mm2.d.class)).f328944h);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                t1(null, string, null, ((mm2.d) S0().a(mm2.d.class)).f328946m, new com.tencent.mm.plugin.finder.live.plugin.mi(this));
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1(java.lang.String str, java.lang.String str2, com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo, int i17, yz5.a aVar) {
        int intValue;
        com.tencent.mm.plugin.finder.live.plugin.ki kiVar = new com.tencent.mm.plugin.finder.live.plugin.ki(this);
        boolean x07 = x0();
        android.view.ViewGroup viewGroup = this.f365323d;
        if (x07) {
            viewGroup.findViewById(com.tencent.mm.R.id.i4f).getLayoutParams().width = viewGroup.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480446y5);
        }
        ((android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.i4d)).setImageDrawable(viewGroup.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.bhp));
        if (str == null || str.length() == 0) {
            android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.i4d);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveFollowGuidePlugin", "showGuide", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/FinderAuthInfo;ILkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveFollowGuidePlugin", "showGuide", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/FinderAuthInfo;ILkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d a17 = g1Var.a();
            mn2.n nVar = new mn2.n(str, null, 2, null);
            android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.i4d);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            a17.c(nVar, (android.widget.ImageView) findViewById2, g1Var.h(mn2.f1.f329957h));
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.i4h);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = viewGroup.getContext();
        float textSize = ((android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.i4h)).getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str2, textSize));
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.i4j);
        if (finderAuthInfo != null) {
            intValue = java.lang.Integer.valueOf(finderAuthInfo.getAuthIconType() > 0 ? 0 : 8).intValue();
        } else {
            java.lang.Integer num = 8;
            intValue = num.intValue();
        }
        imageView.setVisibility(intValue);
        if (imageView.getVisibility() == 0) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.m1.f460511a.c(imageView, finderAuthInfo, 0);
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.i4e);
        textView2.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f491394cy4, com.tencent.mm.plugin.finder.assist.w2.o(i17, false)));
        textView2.setVisibility(i17 > 0 ? 0 : 8);
        ((android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.i4g)).setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.fi(aVar));
        viewGroup.findViewById(com.tencent.mm.R.id.i4i).setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.gi(kiVar));
        android.view.View findViewById3 = viewGroup.findViewById(com.tencent.mm.R.id.f483758bz2);
        findViewById3.post(new com.tencent.mm.plugin.finder.live.plugin.hi(findViewById3));
        findViewById3.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.ii(this));
        viewGroup.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.ji(this));
        K0(0);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.f328046g, null, null, null, null, null, false, 126, null);
        i95.m c18 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb.I8((zy2.zb) c18, ml2.u1.f328049h, null, null, null, null, null, false, 126, null);
        i95.m c19 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        zy2.zb.I8((zy2.zb) c19, ml2.u1.f328052i, null, null, null, null, null, false, 126, null);
    }
}
