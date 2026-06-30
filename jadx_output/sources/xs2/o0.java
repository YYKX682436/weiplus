package xs2;

/* loaded from: classes3.dex */
public class o0 extends yp.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f456361a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f456362b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f456363c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f456364d;

    public o0(android.content.Context context, gk2.e buContext) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f456361a = context;
        this.f456362b = buContext;
        this.f456363c = "LiveDanmakuRender";
        this.f456364d = jz5.h.b(xs2.n0.f456360d);
    }

    @Override // yp.p, yp.a
    public boolean a(wp.a aVar) {
        return aVar instanceof xs2.p0;
    }

    @Override // yp.p
    public int j(java.lang.Object obj) {
        return 2;
    }

    @Override // yp.p
    public void l(int i17, yp.o oVar, wp.i iVar) {
        jz5.f0 f0Var;
        boolean z17 = oVar instanceof xs2.m0;
        java.lang.String str = this.f456363c;
        if (!z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("viewHolder:");
            sb6.append(oVar);
            sb6.append(" error,data:");
            sb6.append(iVar != null ? iVar.f448354y : null);
            com.tencent.mars.xlog.Log.e(str, sb6.toString());
            return;
        }
        gk2.e eVar = this.f456362b;
        mm2.y1 P6 = ((mm2.j2) eVar.a(mm2.j2.class)).P6();
        if (P6 != null) {
            int ordinal = P6.f329552a.ordinal();
            jz5.f0 f0Var2 = jz5.f0.f302826a;
            if (ordinal == 0) {
                xs2.m0 m0Var = (xs2.m0) oVar;
                android.view.View view = m0Var.f456352d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuRender", "onBindViewHolder", "(ILcom/tencent/mm/danmaku/render/ViewDanmakuRender$ViewHolder;Lcom/tencent/mm/danmaku/data/ViewDanmaku;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuRender", "onBindViewHolder", "(ILcom/tencent/mm/danmaku/render/ViewDanmakuRender$ViewHolder;Lcom/tencent/mm/danmaku/data/ViewDanmaku;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                m0Var.f456356h.setTextColor(m0Var.f456352d.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
                if (!P6.f329553b) {
                    com.tencent.mars.xlog.Log.e(str, "bind view holder wrong mode and privilege config!");
                    return;
                }
                java.lang.Object obj = iVar != null ? iVar.f448354y : null;
                dk2.zf zfVar = obj instanceof dk2.zf ? (dk2.zf) obj : null;
                if (zfVar != null) {
                    s("case1_NormalComment_" + zfVar.j());
                    if (zfVar.l()) {
                        r(eVar, m0Var, iVar, zfVar);
                    } else {
                        com.tencent.mars.xlog.Log.e(str, "bind view holder wrong msg type!");
                    }
                    f0Var = f0Var2;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.e(str, "bind view holder wrong mode and privilege config!");
                    return;
                }
                return;
            }
            if (ordinal != 1) {
                return;
            }
            xs2.m0 m0Var2 = (xs2.m0) oVar;
            android.view.View view2 = m0Var2.f456352d;
            float f17 = ((mm2.j2) eVar.a(mm2.j2.class)).f329162g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuRender", "onBindViewHolder", "(ILcom/tencent/mm/danmaku/render/ViewDanmakuRender$ViewHolder;Lcom/tencent/mm/danmaku/data/ViewDanmaku;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuRender", "onBindViewHolder", "(ILcom/tencent/mm/danmaku/render/ViewDanmakuRender$ViewHolder;Lcom/tencent/mm/danmaku/data/ViewDanmaku;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            if (m0Var2.f456352d.getAlpha() == 1.0f) {
                m0Var2.f456356h.setTextColor(m0Var2.f456352d.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
            } else {
                m0Var2.f456356h.setTextColor(m0Var2.f456352d.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            }
            if (!P6.f329553b) {
                java.lang.Object obj2 = iVar != null ? iVar.f448354y : null;
                dk2.zf zfVar2 = obj2 instanceof dk2.zf ? (dk2.zf) obj2 : null;
                if (zfVar2 != null) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("case_4.2_Danmaku_normalComment_");
                    sb7.append(iVar.f448332c);
                    sb7.append('_');
                    sb7.append(zfVar2.j());
                    s(sb7.toString());
                    q(eVar, m0Var2, iVar, zfVar2);
                } else {
                    java.lang.Object obj3 = iVar != null ? iVar.f448354y : null;
                    lm2.c cVar = obj3 instanceof lm2.c ? (lm2.c) obj3 : null;
                    if (cVar != null) {
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("case_5_Danmaku_normalBox_");
                        sb8.append(iVar.f448332c);
                        sb8.append('_');
                        sb8.append(cVar.j());
                        s(sb8.toString());
                    } else {
                        f0Var2 = null;
                    }
                }
                if (f0Var2 == null) {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("bind view holder error,");
                    sb9.append(iVar != null ? java.lang.Long.valueOf(iVar.f448332c) : null);
                    sb9.append(",data:");
                    sb9.append(iVar != null ? iVar.f448354y : null);
                    com.tencent.mars.xlog.Log.e(str, sb9.toString());
                    return;
                }
                return;
            }
            java.lang.Object obj4 = iVar != null ? iVar.f448354y : null;
            dk2.zf zfVar3 = obj4 instanceof dk2.zf ? (dk2.zf) obj4 : null;
            if (zfVar3 == null) {
                java.lang.Object obj5 = iVar != null ? iVar.f448354y : null;
                lm2.c cVar2 = obj5 instanceof lm2.c ? (lm2.c) obj5 : null;
                if (cVar2 != null) {
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder("case_4_Danmaku_Box_");
                    sb10.append(iVar.f448332c);
                    sb10.append('_');
                    sb10.append(cVar2.j());
                    s(sb10.toString());
                } else {
                    f0Var2 = null;
                }
            } else if (zfVar3.l()) {
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder("case_2_Danmaku_privilege_");
                sb11.append(iVar.f448332c);
                sb11.append('_');
                sb11.append(zfVar3.j());
                s(sb11.toString());
                r(eVar, m0Var2, iVar, zfVar3);
            } else {
                java.lang.StringBuilder sb12 = new java.lang.StringBuilder("case_3_Danmaku_comment_");
                sb12.append(iVar.f448332c);
                sb12.append('_');
                sb12.append(zfVar3.j());
                s(sb12.toString());
                q(eVar, m0Var2, iVar, zfVar3);
            }
            if (f0Var2 == null) {
                java.lang.StringBuilder sb13 = new java.lang.StringBuilder("bind view holder with privilege error,");
                sb13.append(iVar != null ? java.lang.Long.valueOf(iVar.f448332c) : null);
                sb13.append(",data:");
                sb13.append(iVar != null ? iVar.f448354y : null);
                com.tencent.mars.xlog.Log.e(str, sb13.toString());
            }
        }
    }

    @Override // yp.p
    public yp.o m(int i17) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f456361a).inflate(com.tencent.mm.R.layout.apb, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        xs2.m0 m0Var = new xs2.m0(inflate);
        m0Var.f456356h.setEnsureStrokeTextMeasureBeforeDraw(((java.lang.Boolean) ((jz5.n) this.f456364d).getValue()).booleanValue());
        return m0Var;
    }

    @Override // yp.p, yp.a
    /* renamed from: p */
    public void h(wp.i iVar, boolean z17, java.lang.Runnable runnable) {
        yp.o oVar = iVar != null ? iVar.H : null;
        xs2.m0 m0Var = oVar instanceof xs2.m0 ? (xs2.m0) oVar : null;
        if (m0Var != null) {
            android.view.View view = m0Var.f456358j;
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
            }
            android.view.View view2 = m0Var.f456357i;
            android.view.ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = -2;
            }
            android.view.ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.height = -2;
            }
            com.tencent.mm.plugin.finder.view.DanmakuStrokeTextView danmakuStrokeTextView = m0Var.f456356h;
            android.view.ViewGroup.LayoutParams layoutParams5 = danmakuStrokeTextView.getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.width = -2;
            }
            android.view.ViewGroup.LayoutParams layoutParams6 = danmakuStrokeTextView.getLayoutParams();
            if (layoutParams6 != null) {
                layoutParams6.height = -2;
            }
            android.view.View view3 = m0Var.f456352d;
            android.view.ViewGroup.LayoutParams layoutParams7 = view3.getLayoutParams();
            if (layoutParams7 != null) {
                layoutParams7.width = -2;
            }
            android.view.ViewGroup.LayoutParams layoutParams8 = view3.getLayoutParams();
            if (layoutParams8 != null) {
                layoutParams8.height = -2;
            }
            danmakuStrokeTextView.setVisibility(0);
            android.view.View view4 = m0Var.f456358j;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/danmakuitem/DanmakuItemEmoji", "resetItem", "(Lcom/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuRender$BulletViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/model/danmakuitem/DanmakuItemEmoji", "resetItem", "(Lcom/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuRender$BulletViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = m0Var.f456359k;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/model/danmakuitem/DanmakuItemEmoji", "resetItem", "(Lcom/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuRender$BulletViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/model/danmakuitem/DanmakuItemEmoji", "resetItem", "(Lcom/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuRender$BulletViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view3.findViewById(com.tencent.mm.R.id.f484612ti3);
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                android.view.ViewGroup.LayoutParams layoutParams9 = viewGroup.getLayoutParams();
                if (layoutParams9 != null) {
                    layoutParams9.width = -2;
                }
                android.view.ViewGroup.LayoutParams layoutParams10 = viewGroup.getLayoutParams();
                if (layoutParams10 != null) {
                    layoutParams10.height = -2;
                }
            }
            com.tencent.mm.plugin.finder.live.view.FinderLiveEmojiView finderLiveEmojiView = (com.tencent.mm.plugin.finder.live.view.FinderLiveEmojiView) view3.findViewById(com.tencent.mm.R.id.f484611ti2);
            if (finderLiveEmojiView != null) {
                finderLiveEmojiView.setEmojiInfo(null);
                finderLiveEmojiView.setStatusListener(null);
            }
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view3.findViewById(com.tencent.mm.R.id.f484613ti4);
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                android.view.ViewGroup.LayoutParams layoutParams11 = linearLayout.getLayoutParams();
                if (layoutParams11 != null) {
                    layoutParams11.width = -2;
                }
                android.view.ViewGroup.LayoutParams layoutParams12 = linearLayout.getLayoutParams();
                if (layoutParams12 != null) {
                    layoutParams12.height = -2;
                }
            }
        }
        super.h(iVar, z17, runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0a50  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0a55  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0acd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0269  */
    /* JADX WARN: Type inference failed for: r1v70, types: [gm2.c1] */
    /* JADX WARN: Type inference failed for: r7v107 */
    /* JADX WARN: Type inference failed for: r7v68 */
    /* JADX WARN: Type inference failed for: r7v69, types: [java.util.LinkedList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(gk2.e r35, xs2.m0 r36, wp.i r37, dk2.zf r38) {
        /*
            Method dump skipped, instructions count: 2984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xs2.o0.q(gk2.e, xs2.m0, wp.i, dk2.zf):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(gk2.e r30, xs2.m0 r31, wp.i r32, dk2.zf r33) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xs2.o0.r(gk2.e, xs2.m0, wp.i, dk2.zf):void");
    }

    public final void s(java.lang.String str) {
        if (zl2.q4.f473933a.E()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bind view holder curThread:");
            sb6.append(java.lang.Thread.currentThread().getName());
            sb6.append(",commentMode:");
            gk2.e eVar = this.f456362b;
            mm2.y1 P6 = ((mm2.j2) eVar.a(mm2.j2.class)).P6();
            sb6.append(P6 != null ? P6.f329552a : null);
            sb6.append(',');
            sb6.append(str);
            sb6.append(",alphaValue:");
            sb6.append(((mm2.j2) eVar.a(mm2.j2.class)).f329162g);
            sb6.append(",showPrivilegeDanmaku:");
            mm2.y1 P62 = ((mm2.j2) eVar.a(mm2.j2.class)).P6();
            sb6.append(P62 != null ? java.lang.Boolean.valueOf(P62.f329553b) : null);
            sb6.append('!');
            com.tencent.mars.xlog.Log.i(this.f456363c, sb6.toString());
        }
    }
}
