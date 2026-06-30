package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class ed {

    /* renamed from: a */
    public static final com.tencent.mm.plugin.finder.view.ed f131999a = new com.tencent.mm.plugin.finder.view.ed();

    public static /* synthetic */ void b(com.tencent.mm.plugin.finder.view.ed edVar, android.content.Context context, r45.h32 h32Var, java.lang.String str, long j17, java.util.List list, java.lang.String str2, boolean z17, yz5.a aVar, yz5.l lVar, int i17, java.lang.Object obj) {
        edVar.a(context, h32Var, str, j17, list, str2, (i17 & 64) != 0 ? true : z17, (i17 & 128) != 0 ? null : aVar, (i17 & 256) != 0 ? null : lVar);
    }

    public final void a(android.content.Context ctx, r45.h32 h32Var, java.lang.String str, long j17, java.util.List couponInfo, java.lang.String anchorFinderUsername, boolean z17, yz5.a aVar, yz5.l lVar) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(couponInfo, "couponInfo");
        kotlin.jvm.internal.o.g(anchorFinderUsername, "anchorFinderUsername");
        if (couponInfo.isEmpty()) {
            return;
        }
        com.tencent.mm.plugin.finder.view.kd kdVar = z17 ? new com.tencent.mm.plugin.finder.view.kd(ctx) : new com.tencent.mm.plugin.finder.view.ld(ctx);
        kdVar.f132489h = aVar;
        kdVar.f132497s = lVar;
        kdVar.f132495q = anchorFinderUsername;
        java.util.ArrayList arrayList = (java.util.ArrayList) kdVar.f132496r;
        arrayList.clear();
        arrayList.addAll(couponInfo);
        android.content.Context context = kdVar.f118381d;
        if (j17 > 0) {
            if (h32Var != null) {
                android.widget.TextView textView = kdVar.f132491m;
                if (textView != null) {
                    textView.setText(zl2.q4.t(zl2.q4.f473933a, h32Var, com.tencent.mm.R.string.csf, false, false, false, 28, null));
                }
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                java.lang.String r17 = zl2.q4.r(zl2.q4.f473933a, j17, null, false, false, 14, null);
                android.widget.TextView textView2 = kdVar.f132491m;
                if (textView2 != null) {
                    textView2.setText(context.getResources().getString(com.tencent.mm.R.string.csf, r17));
                }
            }
        } else {
            android.widget.TextView textView3 = kdVar.f132491m;
            if (textView3 != null) {
                textView3.setText(context.getResources().getString(com.tencent.mm.R.string.lhx));
            }
            android.widget.TextView textView4 = kdVar.f132490i;
            if (textView4 != null) {
                textView4.setText(context.getResources().getString(com.tencent.mm.R.string.lhw));
            }
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = kdVar.f132492n;
        if (weImageView != null) {
            weImageView.setOnClickListener(new com.tencent.mm.plugin.finder.view.jd(kdVar));
        }
        kdVar.w();
    }
}
