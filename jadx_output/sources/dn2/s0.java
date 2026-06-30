package dn2;

/* loaded from: classes3.dex */
public final class s0 implements dn2.e {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cf, code lost:
    
        if (r15 == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r1v3, types: [r45.bv1, com.tencent.mm.protobuf.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(dn2.s0 r9, android.widget.TextView r10, long r11, com.tencent.mm.plugin.finder.live.view.k0 r13, java.lang.String r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dn2.s0.e(dn2.s0, android.widget.TextView, long, com.tencent.mm.plugin.finder.live.view.k0, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // dn2.e
    public java.lang.Integer a() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dn2.e
    public java.lang.Object b(android.view.View view, dk2.zf zfVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object e17;
        java.lang.Object D = zfVar.D();
        r45.pj1 pj1Var = D instanceof r45.pj1 ? (r45.pj1) D : null;
        java.lang.Object[] objArr = pj1Var != null && pj1Var.getInteger(5) == 1;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (objArr == true) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cjk);
            textView.setTextSize(1, 12.0f);
            java.lang.Object D2 = zfVar.D();
            r45.pj1 pj1Var2 = D2 instanceof r45.pj1 ? (r45.pj1) D2 : null;
            if (pj1Var2 != null && pj1Var2.getInteger(5) == 1) {
                r45.n32 n32Var = (r45.n32) pj1Var2.getCustom(4);
                r45.y23 y23Var = (r45.y23) pj1Var2.getCustom(0);
                long j17 = y23Var != null ? y23Var.getLong(0) : 0L;
                if (textView != null && n32Var != null && (e17 = xt2.a0.f456611a.e(textView, j17, n32Var, "notification", continuation)) == pz5.a.f359186d) {
                    return e17;
                }
            }
        } else {
            if (pj1Var != null && pj1Var.getInteger(5) == 2) {
                java.lang.Object b17 = kotlinx.coroutines.k1.b(((zfVar instanceof dk2.y7 ? (dk2.y7) zfVar : null) != null ? r3.f234375b : 0) * 1000, continuation);
                if (b17 == pz5.a.f359186d) {
                    return b17;
                }
            }
        }
        return f0Var;
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        r45.pj1 pj1Var;
        kotlinx.coroutines.f1 f1Var;
        yg2.b viewScope;
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(liveMsg, "liveMsg");
        kotlin.jvm.internal.o.g(widget, "widget");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.cg7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.rbw);
        ((android.widget.TextView) findViewById2).setTextSize(1, 12.0f);
        kotlin.jvm.internal.o.f(findViewById2, "also(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.l7a);
        ((android.widget.TextView) findViewById3).setTextSize(1, 12.0f);
        kotlin.jvm.internal.o.f(findViewById3, "also(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.f486441l74);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.tencent.mm.R.id.utk);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById5;
        textView3.setTextSize(1, 14.0f);
        hc2.o.a(textView3, false);
        kotlin.jvm.internal.o.f(findViewById5, "also(...)");
        android.widget.TextView textView4 = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.tencent.mm.R.id.u2w);
        android.widget.TextView textView5 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.lod);
        textView5.setTextSize(1, 10.0f);
        java.lang.Object D = liveMsg.D();
        r45.pj1 pj1Var2 = D instanceof r45.pj1 ? (r45.pj1) D : null;
        if (pj1Var2 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on bind ShoppingHotSaleNotificationItem, productInfo = ");
            r45.y23 y23Var = (r45.y23) pj1Var2.getCustom(0);
            sb6.append(y23Var != null ? y23Var.toJSON() : null);
            com.tencent.mars.xlog.Log.i("ShoppingHotSaleNotificationItem", sb6.toString());
            r45.y23 y23Var2 = (r45.y23) pj1Var2.getCustom(0);
            if (y23Var2 == null || (str = y23Var2.getString(1)) == null) {
                str = "";
            }
            textView2.setText(str);
            if (pj1Var2.getInteger(5) == 1) {
                viewGroup.setBackgroundResource(com.tencent.mm.R.drawable.ct6);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                str2 = "";
                yj0.a.d(findViewById6, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/ShoppingHotSaleNotificationItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/ShoppingHotSaleNotificationItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView5.setVisibility(8);
                textView.setText(pj1Var2.getString(1));
                com.tencent.mm.ui.fk.a(textView);
                i17 = 2;
            } else {
                str2 = "";
                if (pj1Var2.getInteger(5) == 2) {
                    viewGroup.setBackgroundResource(com.tencent.mm.R.drawable.d3d);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    i17 = 2;
                    yj0.a.d(findViewById6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/ShoppingHotSaleNotificationItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/ShoppingHotSaleNotificationItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    textView5.setVisibility(0);
                    textView5.setText(pj1Var2.getString(1));
                } else {
                    i17 = 2;
                }
            }
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
            vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
            r45.y23 y23Var3 = (r45.y23) pj1Var2.getCustom(0);
            d1Var.a(((c61.i8) i5Var).Ai((y23Var3 == null || (list = y23Var3.getList(i17)) == null) ? null : (java.lang.String) kz5.n0.Z(list), com.tencent.mm.plugin.finder.storage.y90.f128356f)).c(imageView);
            dk2.ef efVar = dk2.ef.f233372a;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            r45.y23 y23Var4 = (r45.y23) pj1Var2.getCustom(0);
            long j17 = y23Var4 != null ? y23Var4.getLong(0) : 0L;
            if (k0Var == null || (viewScope = k0Var.getViewScope()) == null) {
                pj1Var = pj1Var2;
                f1Var = null;
            } else {
                pj1Var = pj1Var2;
                f1Var = kotlinx.coroutines.l.b(viewScope, null, null, new dn2.r0(this, textView4, j17, k0Var, pj1Var, null), 3, null);
            }
            rootView.setOnClickListener(new dn2.q0(this, pj1Var, k0Var, f1Var, rootView));
            r45.pj1 pj1Var3 = pj1Var;
            f(pj1Var3, false);
            g(ml2.f4.M, pj1Var3, str2);
        }
        return rootView;
    }

    public final void f(r45.pj1 pj1Var, boolean z17) {
        java.lang.String str;
        byte[] bArr;
        r45.nw1 nw1Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.x92 x92Var = new r45.x92();
        r45.y23 y23Var = (r45.y23) pj1Var.getCustom(0);
        x92Var.set(0, java.lang.Long.valueOf(y23Var != null ? y23Var.getLong(0) : 0L));
        x92Var.set(1, pj1Var.getString(7));
        r45.u92 u92Var = new r45.u92();
        u92Var.set(0, java.lang.Integer.valueOf(z17 ? 3 : 2));
        u92Var.set(2, x92Var);
        linkedList.add(u92Var);
        r45.y92 y92Var = new r45.y92();
        y92Var.set(1, db2.t4.f228171a.a(13215));
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        y92Var.set(3, java.lang.Long.valueOf((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? 0L : nw1Var.getLong(0)));
        gk2.e eVar2 = dk2.ef.I;
        y92Var.set(4, java.lang.Long.valueOf(eVar2 != null ? ((mm2.e1) eVar2.a(mm2.e1.class)).f328983m : 0L));
        gk2.e eVar3 = dk2.ef.I;
        y92Var.set(2, (eVar3 == null || (bArr = ((mm2.e1) eVar3.a(mm2.e1.class)).f328985o) == null) ? null : new com.tencent.mm.protobuf.g(bArr, 0, bArr.length));
        gk2.e eVar4 = dk2.ef.I;
        if (eVar4 == null || (str = ((mm2.e1) eVar4.a(mm2.e1.class)).f328992v) == null) {
            str = "";
        }
        y92Var.set(5, str);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        y92Var.set(6, xy2.c.e(context));
        y92Var.set(7, linkedList);
        y92Var.d().l().K(new dn2.m0(this, z17));
    }

    public final void g(ml2.f4 f4Var, r45.pj1 pj1Var, java.lang.String str) {
        long j17;
        java.util.Map map;
        java.lang.Long l17;
        r45.y23 y23Var = (r45.y23) pj1Var.getCustom(0);
        long j18 = y23Var != null ? y23Var.getLong(0) : 0L;
        r45.n32 n32Var = (r45.n32) pj1Var.getCustom(4);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        java.lang.String u17 = pm0.v.u(j18);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("notice_type", pj1Var.getInteger(5));
        if (n32Var != null) {
            mm2.f6 f6Var = (mm2.f6) dk2.ef.f233372a.i(mm2.f6.class);
            if (f6Var != null && (map = f6Var.D1) != null) {
                java.util.Map map2 = (java.util.Map) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(j18));
                if (map2 != null && (l17 = (java.lang.Long) map2.get(java.lang.Integer.valueOf(n32Var.getInteger(4)))) != null) {
                    j17 = l17.longValue();
                    jSONObject.put("cur_initial_value", j17);
                    jSONObject.put("cur_end_value", n32Var.getLong(3));
                }
            }
            j17 = n32Var.getLong(2);
            jSONObject.put("cur_initial_value", j17);
            jSONObject.put("cur_end_value", n32Var.getLong(3));
        }
        ml2.r0.Dj(r0Var, f4Var, null, u17, null, null, null, 0, 0L, jSONObject, null, null, null, false, str, 7928, null);
    }

    @Override // dn2.e
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dov;
    }
}
