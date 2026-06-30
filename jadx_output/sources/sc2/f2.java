package sc2;

/* loaded from: classes2.dex */
public abstract class f2 extends ad2.h {

    /* renamed from: x, reason: collision with root package name */
    public static final sc2.i1 f405880x = new sc2.i1(null);

    /* renamed from: y, reason: collision with root package name */
    public static final java.lang.Object f405881y = new java.lang.Object();

    /* renamed from: w, reason: collision with root package name */
    public final int f405882w = 2;

    public final void G(android.view.View view, float f17, int i17, boolean z17) {
        if (f17 == 0.0f) {
            f17 = 1.0f;
        }
        int i18 = view.getLayoutParams().height;
        int i19 = view.getLayoutParams().width;
        float f18 = i18 / i19;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        int dimensionPixelSize = i17 != 1 ? i17 != 2 ? i17 != 3 ? 0 : z17 ? context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479657bu) : context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479649bo) : z17 ? context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479727dj) : context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz) : z17 ? context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479649bo) : context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
        com.tencent.mars.xlog.Log.i(k(), "adjustIconRatio height:" + i18 + ", width:" + i19 + ", curRatio:" + f18 + ", targetRatio:" + f17 + ", imageSizeType=" + i17 + ", isBigCard=" + z17);
        if (dimensionPixelSize <= 0) {
            if (f18 == f17) {
                return;
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (dimensionPixelSize > 0) {
            i18 = dimensionPixelSize;
        }
        layoutParams.width = (int) (i18 / f17);
        layoutParams.height = i18;
        view.setLayoutParams(layoutParams);
    }

    public final void H(android.view.View jumpView, r45.su suVar, r45.su suVar2) {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        if (suVar == null || suVar2 == null || (viewGroup = (android.view.ViewGroup) jumpView.findViewById(com.tencent.mm.R.id.h1u)) == null || (viewGroup2 = (android.view.ViewGroup) jumpView.findViewById(com.tencent.mm.R.id.h1t)) == null) {
            return;
        }
        float f17 = 0.0f;
        if (suVar.getInteger(11) == 0 && suVar.getInteger(10) == 0 && suVar2.getInteger(11) == 0 && suVar2.getInteger(10) == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(viewGroup2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "originalExpandAnimate", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(viewGroup2, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "originalExpandAnimate", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(viewGroup2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "originalExpandAnimate", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            viewGroup2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(viewGroup2, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "originalExpandAnimate", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            pm0.v.b(viewGroup2, new sc2.d2(jumpView, viewGroup2, this, viewGroup));
            return;
        }
        int childCount = viewGroup2.getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            android.view.View childAt = viewGroup2.getChildAt(i17);
            kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(childAt, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "fadeExpandAnimate", "(Landroid/view/View;Landroid/view/ViewGroup;Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            childAt.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(childAt, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "fadeExpandAnimate", "(Landroid/view/View;Landroid/view/ViewGroup;Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            i17++;
            f17 = 0.0f;
        }
        viewGroup2.setVisibility(0);
        viewGroup2.setAlpha(0.0f);
        pm0.v.b(viewGroup2, new sc2.w1(this, viewGroup, viewGroup2));
    }

    public final void I(android.view.View jumpView, r45.su suVar, r45.su suVar2) {
        android.view.ViewGroup viewGroup;
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        if (suVar == null || suVar2 == null) {
            return;
        }
        int integer = suVar2.getInteger(20);
        if (integer != 1) {
            if (integer != 2) {
                return;
            }
            H(jumpView, suVar, suVar2);
            return;
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) jumpView.findViewById(com.tencent.mm.R.id.h1u);
        if (viewGroup2 == null || (viewGroup = (android.view.ViewGroup) jumpView.findViewById(com.tencent.mm.R.id.f485253u31)) == null) {
            return;
        }
        viewGroup.setVisibility(0);
        viewGroup.setAlpha(0.0f);
        pm0.v.b(viewGroup, new sc2.k1(jumpView, viewGroup, this, viewGroup2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x07ef  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0cdd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0ceb  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0d05  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0d34  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0d40  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0dcb  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0dd6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0ddd  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0e73  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0e90  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0e9e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0ec8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0f11  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0f1c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0f29  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0f42  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0f4c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x1018  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0f96  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0f24  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0ead  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0e96  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0e75  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0dda  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0dcf  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0d81  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0d25  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0cfa  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0ce3  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0476  */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v110, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v127 */
    /* JADX WARN: Type inference failed for: r0v128, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v188 */
    /* JADX WARN: Type inference failed for: r0v237 */
    /* JADX WARN: Type inference failed for: r0v238 */
    /* JADX WARN: Type inference failed for: r0v239 */
    /* JADX WARN: Type inference failed for: r0v240 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29, types: [android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r3v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(com.tencent.mm.plugin.finder.model.BaseFinderFeed r55, in5.s0 r56, android.view.View r57, xc2.p0 r58, java.lang.String r59, r45.su r60, boolean r61) {
        /*
            Method dump skipped, instructions count: 4266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.f2.J(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0, android.view.View, xc2.p0, java.lang.String, r45.su, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:279:0x01bc, code lost:
    
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x01ce, code lost:
    
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0195, code lost:
    
        if (r0 != null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(com.tencent.mm.plugin.finder.model.BaseFinderFeed r39, in5.s0 r40, android.view.View r41, xc2.p0 r42, java.lang.String r43, r45.su r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 2171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.f2.K(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0, android.view.View, xc2.p0, java.lang.String, r45.su, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x01e3, code lost:
    
        if (r9 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0223, code lost:
    
        if (r9 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(com.tencent.mm.plugin.finder.model.BaseFinderFeed r37, in5.s0 r38, android.view.View r39, xc2.p0 r40, r45.su r41, java.lang.String r42) {
        /*
            Method dump skipped, instructions count: 2080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.f2.L(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0, android.view.View, xc2.p0, r45.su, java.lang.String):void");
    }

    public final r45.su M(xc2.p0 infoEx) {
        java.lang.Object obj;
        r45.zf0 zf0Var;
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        java.util.LinkedList<r45.wf6> style = infoEx.f453234a.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).getInteger(2) == 7) {
                break;
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        if (wf6Var == null || (zf0Var = (r45.zf0) wf6Var.getCustom(10)) == null) {
            return null;
        }
        return (r45.su) zf0Var.getCustom(1);
    }

    public final r45.su N(xc2.p0 infoEx) {
        java.lang.Object obj;
        r45.ag0 ag0Var;
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        java.util.LinkedList<r45.wf6> style = infoEx.f453234a.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).getInteger(2) == 31) {
                break;
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        if (wf6Var == null || (ag0Var = (r45.ag0) wf6Var.getCustom(40)) == null) {
            return null;
        }
        return (r45.su) ag0Var.getCustom(0);
    }

    public final int O(android.content.Context context) {
        return (int) ((com.tencent.mm.ui.bh.a(context).f197135a * 0.6d) - context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479729dl));
    }

    public final r45.su P(xc2.p0 infoEx) {
        java.lang.Object obj;
        r45.ag0 ag0Var;
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        java.util.LinkedList<r45.wf6> style = infoEx.f453234a.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).getInteger(2) == 31) {
                break;
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        if (wf6Var == null || (ag0Var = (r45.ag0) wf6Var.getCustom(40)) == null) {
            return null;
        }
        return (r45.su) ag0Var.getCustom(1);
    }

    public final r45.su Q(xc2.p0 infoEx) {
        java.lang.Object obj;
        r45.zf0 zf0Var;
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        java.util.LinkedList<r45.wf6> style = infoEx.f453234a.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).getInteger(2) == 7) {
                break;
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        if (wf6Var == null || (zf0Var = (r45.zf0) wf6Var.getCustom(10)) == null) {
            return null;
        }
        return (r45.su) zf0Var.getCustom(0);
    }

    public final void R(com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        roundedCornerFrameLayout.setRadius(finderJumpInfo.getBusiness_type() == 8 ? roundedCornerFrameLayout.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479642bh) : roundedCornerFrameLayout.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl));
    }

    public final void S(in5.s0 s0Var, android.view.View view, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        gs2.c.f275072a.e(s0Var, view, j(finderJumpInfo), finderJumpInfo.getBusiness_type() == 2);
    }

    public final void T(java.lang.String str, android.view.View iconLayout, com.tencent.mm.ui.widget.imageview.WeImageView iconView, boolean z17, yz5.l lVar) {
        kotlin.jvm.internal.o.g(iconLayout, "iconLayout");
        kotlin.jvm.internal.o.g(iconView, "iconView");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(iconLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "loadImage", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;ZLkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            iconLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(iconLayout, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "loadImage", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;ZLkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(iconLayout, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "loadImage", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;ZLkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        iconLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(iconLayout, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "loadImage", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;ZLkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mn2.g1 g1Var = mn2.g1.f329975a;
        wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.B));
        sc2.z1 z1Var = new sc2.z1(this, iconLayout, z17, lVar);
        b17.getClass();
        b17.f447873d = z1Var;
        b17.f447879j = new sc2.a2(this, iconLayout);
        b17.f447878i = new sc2.b2(this, iconLayout);
        b17.c(iconView);
    }

    public final void U(android.widget.ImageView imageView, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || imageView == null) {
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.e().b(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.f329964r)).c(imageView);
        }
    }

    public final void V(android.widget.TextView textView, java.lang.CharSequence charSequence, boolean z17) {
        if (textView == null) {
            return;
        }
        if (z17) {
            zy2.s6 s6Var = (zy2.s6) i95.n0.c(zy2.s6.class);
            if (charSequence == null) {
                charSequence = "";
            }
            charSequence = ((ht2.y0) s6Var).mj(charSequence, (int) textView.getTextSize(), true);
        }
        textView.setText(charSequence);
        textView.setVisibility(com.tencent.mm.sdk.platformtools.t8.J0(textView.getText()) ? 8 : 0);
    }

    public final void W(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sc2.a8 a8Var = (sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(sc2.a8.class);
        com.tencent.mm.sdk.platformtools.n3 n3Var = a8Var != null ? a8Var.f406209e : null;
        java.lang.Object obj = f405881y;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(obj);
        }
        android.view.View findViewById = jumpView.findViewById(com.tencent.mm.R.id.h1t);
        boolean z17 = false;
        if (findViewById != null && findViewById.getVisibility() == 0) {
            z17 = true;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i(k(), "startCarouselDesc: has not shown big card, source=".concat(source));
            return;
        }
        int size = infoEx.f453237b0.size();
        if (size >= 2) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis() + 3000;
            if (n3Var != null) {
                n3Var.postAtTime(new sc2.e2(infoEx, jumpView, this, source, holder), obj, uptimeMillis);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i(k(), "startCarouselDesc: descSize=" + size + ", source=" + source);
    }

    public final void X(android.content.Context context, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(k(), "stopCarouselDesc: source=" + str);
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sc2.a8 a8Var = (sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(sc2.a8.class);
        com.tencent.mm.sdk.platformtools.n3 n3Var = a8Var != null ? a8Var.f406209e : null;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(f405881y);
        }
    }

    @Override // ad2.h
    public gs2.a j(com.tencent.mm.protocal.protobuf.FinderJumpInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        return info.getBusiness_type() == 2 ? info.getExt_type() == 3 ? gs2.a.f275052h : gs2.a.f275054m : super.j(info);
    }

    @Override // ad2.h
    public void v(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.v(holder, jumpView, infoEx);
        W(holder, jumpView, infoEx, "onJumpViewFocus");
    }

    @Override // ad2.h
    public void w(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.w(holder, jumpView, infoEx);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        X(context, "onJumpViewUnFocus");
    }

    @Override // ad2.h
    public void x(android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.x(jumpView, infoEx);
        android.content.Context context = jumpView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        X(context, "onPause");
    }
}
