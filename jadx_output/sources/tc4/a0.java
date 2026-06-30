package tc4;

/* loaded from: classes4.dex */
public final class a0 extends tc4.v0 implements xd4.d {
    public static final /* synthetic */ int P1 = 0;
    public final jz5.g A1;
    public final jz5.g B1;
    public final jz5.g C1;
    public final jz5.g D1;
    public final jz5.g E1;
    public final jz5.g F1;
    public final jz5.g G1;
    public final jz5.g H1;
    public long I1;
    public long J1;
    public long K1;
    public c50.m0 L1;
    public boolean M1;
    public int N1;
    public boolean O1;

    /* renamed from: y1, reason: collision with root package name */
    public android.view.View f417270y1;

    /* renamed from: z1, reason: collision with root package name */
    public final jz5.g f417271z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f417271z1 = jz5.h.b(new tc4.z(this));
        this.A1 = jz5.h.b(new tc4.f(this));
        this.B1 = jz5.h.b(new tc4.q(this));
        this.C1 = jz5.h.b(new tc4.r(this));
        this.D1 = jz5.h.b(new tc4.o(this));
        this.E1 = jz5.h.b(new tc4.n(this));
        this.F1 = jz5.h.b(new tc4.p(this));
        this.G1 = jz5.h.b(new tc4.l(this));
        this.H1 = jz5.h.b(new tc4.m(this));
    }

    public static final /* synthetic */ android.view.View T(tc4.a0 a0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getFinderLiveView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.view.View view = a0Var.f417270y1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getFinderLiveView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return view;
    }

    public static final /* synthetic */ android.view.View U(tc4.a0 a0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getFinderLivingUI", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.view.View finderLivingUI = a0Var.getFinderLivingUI();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getFinderLivingUI", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return finderLivingUI;
    }

    private final android.widget.TextView getBansTv() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBansTv", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.A1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBansTv", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return textView;
    }

    private final android.view.View getFinderLiveBottomArea() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderLiveBottomArea", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.view.View view = (android.view.View) ((jz5.n) this.G1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderLiveBottomArea", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return view;
    }

    private final android.widget.TextView getFinderLiveDesc() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderLiveDesc", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.H1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderLiveDesc", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return textView;
    }

    private final android.widget.TextView getFinderLiveLongFeedTip() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderLiveLongFeedTip", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.E1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderLiveLongFeedTip", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return textView;
    }

    private final android.view.View getFinderLiveLongFeedUI() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderLiveLongFeedUI", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.view.View view = (android.view.View) ((jz5.n) this.D1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderLiveLongFeedUI", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return view;
    }

    private final android.view.View getFinderLivePlayerContainer() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderLivePlayerContainer", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.view.View view = (android.view.View) ((jz5.n) this.F1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderLivePlayerContainer", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return view;
    }

    private final android.view.View getFinderLivingUI() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderLivingUI", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.view.View view = (android.view.View) ((jz5.n) this.B1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderLivingUI", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return view;
    }

    private final android.widget.TextView getFinderLivingUITip() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderLivingUITip", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.C1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderLivingUITip", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return textView;
    }

    private final android.widget.ImageView getThumbImg() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getThumbImg", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f417271z1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbImg", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return imageView;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // tc4.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            java.lang.String r0 = "loadCustomItemInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r12 instanceof tc4.s
            if (r2 == 0) goto L1b
            r2 = r12
            tc4.s r2 = (tc4.s) r2
            int r3 = r2.f417458i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f417458i = r3
            goto L20
        L1b:
            tc4.s r2 = new tc4.s
            r2.<init>(r11, r12)
        L20:
            java.lang.Object r12 = r2.f417456g
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f417458i
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L4f
            if (r4 == r6) goto L3f
            if (r4 != r5) goto L34
            kotlin.ResultKt.throwOnFailure(r12)
            goto Lc7
        L34:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r12
        L3f:
            java.lang.Object r4 = r2.f417455f
            r45.g92 r4 = (r45.g92) r4
            java.lang.Object r6 = r2.f417454e
            xc4.p r6 = (xc4.p) r6
            java.lang.Object r8 = r2.f417453d
            tc4.a0 r8 = (tc4.a0) r8
            kotlin.ResultKt.throwOnFailure(r12)
            goto L93
        L4f:
            kotlin.ResultKt.throwOnFailure(r12)
            zc4.b r12 = r11.getData()
            if (r12 == 0) goto Lcd
            xc4.p r12 = r12.n()
            if (r12 != 0) goto L60
            goto Lcd
        L60:
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r12.h1()
            r45.a90 r4 = r4.ContentObj
            if (r4 == 0) goto L6b
            r45.g92 r4 = r4.f369848s
            goto L6c
        L6b:
            r4 = r7
        L6c:
            if (r4 != 0) goto L74
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r12
        L74:
            kotlinx.coroutines.p0 r8 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r8 = kotlinx.coroutines.internal.b0.f310484a
            tc4.t r9 = new tc4.t
            r9.<init>(r11, r4, r7)
            r2.f417453d = r11
            r2.f417454e = r12
            r2.f417455f = r4
            r2.f417458i = r6
            java.lang.Object r6 = kotlinx.coroutines.l.g(r8, r9, r2)
            if (r6 != r3) goto L8f
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L8f:
            r8 = r11
            r10 = r6
            r6 = r12
            r12 = r10
        L93:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lc7
            r2.f417453d = r7
            r2.f417454e = r7
            r2.f417455f = r7
            r2.f417458i = r5
            r8.getClass()
            java.lang.String r12 = "checkLiveStatus"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r1)
            kotlinx.coroutines.p0 r5 = kotlinx.coroutines.q1.f310568a
            tc4.i r9 = new tc4.i
            r9.<init>(r4, r8, r6, r7)
            java.lang.Object r2 = kotlinx.coroutines.l.g(r5, r9, r2)
            if (r2 != r3) goto Lbc
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r1)
            goto Lc1
        Lbc:
            jz5.f0 r2 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r1)
        Lc1:
            if (r2 != r3) goto Lc7
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        Lc7:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r12
        Lcd:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.a0.E(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.v0
    public android.view.View Q(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.view.View view = this.f417270y1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return view;
    }

    public final boolean V(android.widget.ImageView imageView, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        if (imageView == null) {
            w("MicroMsg.Improve.FinderLiveTimelineItem", "notice!thumb view is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return false;
        }
        java.lang.Object tag = imageView.getTag(com.tencent.mm.R.id.n8h);
        x("MicroMsg.Improve.FinderLiveTimelineItem", "checkIsImageLoaded[" + kotlin.jvm.internal.o.b(tag, str + i17) + "] last:" + tag + " current:$" + str + i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(i17);
        boolean b17 = kotlin.jvm.internal.o.b(tag, sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return b17;
    }

    public final void W(boolean z17, r45.g92 g92Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShowDesc", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.view.View finderLiveBottomArea = getFinderLiveBottomArea();
        if (finderLiveBottomArea != null) {
            if (z17) {
                java.lang.String string = g92Var.getString(4);
                if (!(string == null || string.length() == 0) && ((r40.i) ((tc.e) i95.n0.c(tc.e.class))).Ai()) {
                    if (!(finderLiveBottomArea.getBackground() instanceof m95.b)) {
                        finderLiveBottomArea.setBackground(m95.a.e(getContext().getResources(), com.tencent.mm.R.raw.sns_finder_live_item_bottom_bg, 0.0f));
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(finderLiveBottomArea, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "checkShowDesc", "(ZLcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    finderLiveBottomArea.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(finderLiveBottomArea, "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "checkShowDesc", "(ZLcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.widget.TextView finderLiveDesc = getFinderLiveDesc();
                    if (finderLiveDesc != null) {
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        android.content.Context context = finderLiveBottomArea.getContext();
                        java.lang.String string2 = g92Var.getString(4);
                        ((ke0.e) xVar).getClass();
                        finderLiveDesc.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string2));
                    }
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(finderLiveBottomArea, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "checkShowDesc", "(ZLcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderLiveBottomArea.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(finderLiveBottomArea, "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "checkShowDesc", "(ZLcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowDesc", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
    }

    public final tc4.x3 X(r45.g92 g92Var, r45.l71 l71Var) {
        r45.lw1 lw1Var;
        java.lang.String string;
        java.util.LinkedList list;
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoverUrl", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        tc4.x3 x3Var = new tc4.x3(null, null, 3, null);
        r45.d84 d84Var = l71Var != null ? (r45.d84) l71Var.getCustom(9) : null;
        boolean z17 = true;
        if (l71Var == null || (list = l71Var.getList(15)) == null) {
            lw1Var = null;
        } else {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.lw1) obj).getInteger(5) == 2) {
                    break;
                }
            }
            lw1Var = (r45.lw1) obj;
        }
        java.lang.String string2 = lw1Var != null ? lw1Var.getString(0) : null;
        if (string2 == null || string2.length() == 0) {
            java.lang.String string3 = d84Var != null ? d84Var.getString(0) : null;
            if (string3 == null || string3.length() == 0) {
                java.lang.String string4 = g92Var.getString(5);
                if (string4 == null || string4.length() == 0) {
                    java.lang.String string5 = g92Var.getString(11);
                    if (string5 != null && string5.length() != 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        java.lang.String string6 = g92Var.getString(11);
                        x3Var.d(string6 != null ? string6 : "");
                        x3Var.c(x3Var.b());
                    }
                } else {
                    java.lang.String string7 = g92Var.getString(5);
                    if (string7 == null) {
                        string7 = "";
                    }
                    x3Var.d(string7);
                    java.lang.String url = x3Var.b();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeParam", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItemKt");
                    kotlin.jvm.internal.o.g(url, "url");
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile("&?token=[^&]*");
                    kotlin.jvm.internal.o.f(compile, "compile(...)");
                    java.lang.String replaceAll = compile.matcher(url).replaceAll("");
                    kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeParam", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItemKt");
                    x3Var.c(replaceAll);
                }
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(d84Var != null ? d84Var.getString(0) : null);
                java.lang.String string8 = d84Var != null ? d84Var.getString(1) : null;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (string8 == null) {
                    string8 = "";
                }
                sb6.append(string8);
                x3Var.d(sb6.toString());
                string = d84Var != null ? d84Var.getString(0) : null;
                x3Var.c(string != null ? string : "");
            }
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(lw1Var != null ? lw1Var.getString(0) : null);
            java.lang.String string9 = lw1Var != null ? lw1Var.getString(1) : null;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (string9 == null) {
                string9 = "";
            }
            sb7.append(string9);
            x3Var.d(sb7.toString());
            string = lw1Var != null ? lw1Var.getString(0) : null;
            x3Var.c(string != null ? string : "");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoverUrl", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return x3Var;
    }

    public final boolean Y(r45.g92 g92Var, r45.nw1 nw1Var) {
        boolean Ni;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLiveReplay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        if (nw1Var != null) {
            Ni = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).bj(g92Var.getString(1), nw1Var);
        } else {
            Ni = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ni(g92Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLiveReplay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return Ni;
    }

    public final void Z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetThumbForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.widget.ImageView thumbImg = getThumbImg();
        if (thumbImg != null) {
            thumbImg.setImageResource(com.tencent.mm.R.color.f478492d);
        }
        android.widget.ImageView thumbImg2 = getThumbImg();
        if (thumbImg2 != null) {
            thumbImg2.setTag(com.tencent.mm.R.id.n8h, "");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetThumbForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
    }

    public final void a0(android.widget.ImageView imageView, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLoadedImageTagAndClearOther", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        if (imageView != null) {
            imageView.setTag(com.tencent.mm.R.id.n8h, str + i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLoadedImageTagAndClearOther", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final void b0(r45.nw1 nw1Var, tc4.x3 x3Var, int i17, r45.g92 g92Var) {
        java.lang.String str;
        java.lang.String str2;
        ?? r57;
        java.lang.String str3;
        r45.co1 co1Var;
        r45.co1 co1Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showEndTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        x("MicroMsg.Improve.FinderLiveTimelineItem", "showEndTag flag:" + i17);
        android.view.View finderLivingUI = getFinderLivingUI();
        if (finderLivingUI == null) {
            str = "showEndTag";
            str2 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem";
            r57 = 0;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            str = "showEndTag";
            str2 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem";
            r57 = 0;
            yj0.a.d(finderLivingUI, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showEndTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderLivingUI.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(finderLivingUI, "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showEndTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View finderLiveLongFeedUI = getFinderLiveLongFeedUI();
        if (finderLiveLongFeedUI != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf((int) r57));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(finderLiveLongFeedUI, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showEndTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderLiveLongFeedUI.setVisibility(((java.lang.Integer) arrayList2.get(r57)).intValue());
            yj0.a.f(finderLiveLongFeedUI, "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showEndTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        W(r57, g92Var);
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Gk(getFinderLiveLongFeedTip(), true, i17, g92Var);
        if ((nw1Var == null || (co1Var2 = (r45.co1) nw1Var.getCustom(43)) == 0 || co1Var2.getInteger(r57) != 1) ? r57 : true) {
            if (!V(getThumbImg(), x3Var.a(), 1)) {
                x("MicroMsg.Improve.FinderLiveTimelineItem", "loadImage ban");
                i95.m c17 = i95.n0.c(vd2.i5.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                vd2.i5.Fb((vd2.i5) c17, x3Var.b(), getThumbImg(), x3Var.a(), null, 8, null);
                a0(getThumbImg(), x3Var.a(), 1);
            }
            android.widget.TextView bansTv = getBansTv();
            if (bansTv != null) {
                if (nw1Var == null || (co1Var = (r45.co1) nw1Var.getCustom(43)) == null || (str3 = co1Var.getString(1)) == null) {
                    str3 = "";
                }
                bansTv.setText(str3);
            }
            android.widget.TextView bansTv2 = getBansTv();
            if (bansTv2 != 0) {
                bansTv2.setVisibility(r57);
            }
        } else {
            if (!V(getThumbImg(), x3Var.a(), r57)) {
                x("MicroMsg.Improve.FinderLiveTimelineItem", "loadImage not ban");
                i95.m c18 = i95.n0.c(vd2.i5.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                vd2.i5.Ac((vd2.i5) c18, x3Var.b(), getThumbImg(), x3Var.a(), null, 8, null);
                a0(getThumbImg(), x3Var.a(), r57);
            }
            android.widget.TextView bansTv3 = getBansTv();
            if (bansTv3 != null) {
                bansTv3.setVisibility(8);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    @Override // xd4.d
    public void c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17) {
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            x("MicroMsg.Improve.FinderLiveTimelineItem", "play: is in teen mode, position=" + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return;
        }
        this.N1 = i17;
        zc4.b data = getData();
        if (data == null || (n17 = data.n()) == null) {
            w("MicroMsg.Improve.FinderLiveTimelineItem", "play: sns info is null, position=" + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return;
        }
        r45.a90 a90Var = n17.h1().ContentObj;
        r45.g92 g92Var = a90Var != null ? a90Var.f369848s : null;
        if (g92Var == null) {
            w("MicroMsg.Improve.FinderLiveTimelineItem", "play: finderLiveShareObject is null, position=" + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return;
        }
        this.O1 = true;
        r45.nw1 nw1Var = (r45.nw1) g92Var.getCustom(24);
        if (nw1Var == null) {
            nw1Var = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Gj(pm0.v.Z(g92Var.getString(0)));
            if (nw1Var == null) {
                x("MicroMsg.Improve.FinderLiveTimelineItem", "play: live info is null, liveId=" + g92Var.getString(0) + ", position=" + i17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
                return;
            }
        }
        r45.nw1 nw1Var2 = nw1Var;
        if (nw1Var2.getInteger(2) != 1) {
            this.O1 = false;
            x("MicroMsg.Improve.FinderLiveTimelineItem", "play: live is end, position=" + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return;
        }
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        long j17 = nw1Var2.getLong(0);
        qs5.d dVar = qs5.d.f366426e;
        java.lang.Integer Uj = ((com.tencent.mm.feature.finder.live.v4) w0Var).Uj(j17, 2);
        if (Uj == null || (Uj.intValue() & 1) == 0) {
            if (Uj != null) {
                this.O1 = false;
                stop();
                x("MicroMsg.Improve.FinderLiveTimelineItem", "play: server ban auto play, auto_play_control_flag=" + Uj + ", position=" + i17);
            } else {
                x("MicroMsg.Improve.FinderLiveTimelineItem", "play: flag is null wait cgi back, position=" + i17);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return;
        }
        if (this.L1 == null) {
            c50.q0 q0Var = (c50.q0) i95.n0.c(c50.q0.class);
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            c50.m0 Ai = ((v40.q) q0Var).Ai((androidx.appcompat.app.AppCompatActivity) context);
            this.L1 = Ai;
            ((gp2.l0) Ai).f(c50.a.f38587f, 15);
        }
        if (!this.M1) {
            this.M1 = true;
            c50.m0 m0Var = this.L1;
            if (m0Var != null) {
                ((gp2.l0) m0Var).e(null);
            }
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        finderObject.setId(pm0.v.Z(g92Var.getString(2)));
        finderObject.setUsername(g92Var.getString(1));
        finderObject.setNickname(g92Var.getString(3));
        finderObject.setObjectNonceId(g92Var.getString(12));
        com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc = new com.tencent.mm.protocal.protobuf.FinderObjectDesc();
        finderObjectDesc.setMediaType(9);
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media = finderObjectDesc.getMedia();
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = new com.tencent.mm.protocal.protobuf.FinderMedia();
        finderMedia.setMediaType(9);
        finderMedia.setThumbUrl(X(g92Var, ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Hj(nw1Var2.getLong(0))).b());
        media.add(finderMedia);
        finderObject.setObjectDesc(finderObjectDesc);
        finderObject.setLiveInfo(nw1Var2);
        android.view.View finderLivePlayerContainer = getFinderLivePlayerContainer();
        if (finderLivePlayerContainer != null) {
            c50.m0 m0Var2 = this.L1;
            boolean C = m0Var2 != null ? ((gp2.l0) m0Var2).C("MicroMsg.Improve.FinderLiveTimelineItem", nw1Var2.getLong(0)) : false;
            x("MicroMsg.Improve.FinderLiveTimelineItem", "play: start play live, isPlaying=" + C + ", liveId=" + nw1Var2.getLong(0) + ", position=" + i17 + ", feedId=" + g92Var.getString(2));
            if (C) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
                return;
            }
            xd4.o0.d().j();
            xd4.g.a().d(this);
            c50.m0 m0Var3 = this.L1;
            if (m0Var3 != null) {
                ((gp2.l0) m0Var3).F(finderObject, finderLivePlayerContainer, new tc4.v(this, nw1Var2, i17, g92Var, finderObject), new tc4.x(this, nw1Var2, i17, g92Var), null, true);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
    }

    public final void c0(r45.nw1 nw1Var, r45.g92 g92Var, tc4.x3 x3Var, int i17, r45.l71 l71Var) {
        java.lang.String str;
        r45.co1 co1Var;
        r45.co1 co1Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        x("MicroMsg.Improve.FinderLiveTimelineItem", "showLiveTag flag:" + i17);
        if (((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).vk(nw1Var, "timelineimprove") && i17 == 4) {
            android.view.View finderLivingUI = getFinderLivingUI();
            if (finderLivingUI != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(finderLivingUI, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                finderLivingUI.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(finderLivingUI, "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View finderLiveLongFeedUI = getFinderLiveLongFeedUI();
            if (finderLiveLongFeedUI != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(finderLiveLongFeedUI, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                finderLiveLongFeedUI.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(finderLiveLongFeedUI, "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Gk(getFinderLiveLongFeedTip(), false, i17, g92Var);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).cj(l71Var != null ? (r45.nw1) l71Var.getCustom(1) : null, 37);
        } else {
            android.view.View finderLivingUI2 = getFinderLivingUI();
            if (finderLivingUI2 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(finderLivingUI2, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                finderLivingUI2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(finderLivingUI2, "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View finderLiveLongFeedUI2 = getFinderLiveLongFeedUI();
            if (finderLiveLongFeedUI2 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(finderLiveLongFeedUI2, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                finderLiveLongFeedUI2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(finderLiveLongFeedUI2, "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Ik(getFinderLivingUITip(), false, i17, g92Var);
        }
        if (g92Var != null) {
            W(true, g92Var);
        }
        if ((nw1Var == null || (co1Var2 = (r45.co1) nw1Var.getCustom(43)) == null || co1Var2.getInteger(0) != 1) ? false : true) {
            if (!V(getThumbImg(), x3Var.a(), 1)) {
                x("MicroMsg.Improve.FinderLiveTimelineItem", "loadImage ban");
                i95.m c17 = i95.n0.c(vd2.i5.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                vd2.i5.Fb((vd2.i5) c17, x3Var.b(), getThumbImg(), x3Var.a(), null, 8, null);
                a0(getThumbImg(), x3Var.a(), 1);
            }
            android.widget.TextView bansTv = getBansTv();
            if (bansTv != null) {
                if (nw1Var == null || (co1Var = (r45.co1) nw1Var.getCustom(43)) == null || (str = co1Var.getString(1)) == null) {
                    str = "";
                }
                bansTv.setText(str);
            }
            android.widget.TextView bansTv2 = getBansTv();
            if (bansTv2 != null) {
                bansTv2.setVisibility(0);
            }
        } else {
            if (!V(getThumbImg(), x3Var.a(), 0)) {
                x("MicroMsg.Improve.FinderLiveTimelineItem", "loadImage not ban");
                i95.m c18 = i95.n0.c(vd2.i5.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                vd2.i5.Ac((vd2.i5) c18, x3Var.b(), getThumbImg(), x3Var.a(), null, 8, null);
                a0(getThumbImg(), x3Var.a(), 0);
            }
            android.widget.TextView bansTv3 = getBansTv();
            if (bansTv3 != null) {
                bansTv3.setVisibility(8);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
    }

    public final void d0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopAutoPlay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        this.O1 = false;
        c50.m0 m0Var = this.L1;
        if (m0Var != null) {
            tc4.y yVar = new tc4.y(this);
            gp2.l0 l0Var = (gp2.l0) m0Var;
            l0Var.m();
            l0Var.M(yVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopAutoPlay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
    }

    @Override // xd4.d
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        x("MicroMsg.Improve.FinderLiveTimelineItem", "onUIPause: ");
        d0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
    }

    public final boolean e0(r45.g92 g92Var, r45.l71 l71Var) {
        boolean Ri;
        r45.o52 o52Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        tc4.x3 X = X(g92Var, l71Var);
        r45.nw1 nw1Var = (r45.nw1) g92Var.getCustom(24);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isChargeLive", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        boolean hk6 = nw1Var != null ? ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(nw1Var) : g92Var.getInteger(22) == 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isChargeLive", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        boolean Y = Y(g92Var, (r45.nw1) g92Var.getCustom(24));
        r45.nw1 nw1Var2 = (r45.nw1) g92Var.getCustom(24);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replayAuditing", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        if (nw1Var2 != null) {
            Ri = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ri(nw1Var2);
        } else {
            ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
            long Z = pm0.v.Z(g92Var.getString(0));
            vd2.d5 d5Var = (vd2.d5) i0Var;
            d5Var.getClass();
            Ri = d5Var.Ri(((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Gj(Z));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replayAuditing", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLiveTag, isChargeLive:");
        sb6.append(hk6);
        sb6.append(" isLiveReplay:");
        sb6.append(Y);
        sb6.append(" replayAuditing:");
        sb6.append(Ri);
        sb6.append(" getCoverUrl:");
        sb6.append(X);
        sb6.append(", finderShareObject.liveStatus=");
        sb6.append(g92Var.getInteger(13));
        sb6.append(", chargeFlat=");
        r45.nw1 nw1Var3 = (r45.nw1) g92Var.getCustom(24);
        sb6.append((nw1Var3 == null || (o52Var = (r45.o52) nw1Var3.getCustom(28)) == null) ? null : java.lang.Integer.valueOf(o52Var.getInteger(0)));
        sb6.append(", flag=");
        r45.nw1 nw1Var4 = (r45.nw1) g92Var.getCustom(24);
        sb6.append(nw1Var4 != null ? java.lang.Integer.valueOf(nw1Var4.getInteger(37)) : null);
        x("MicroMsg.Improve.FinderLiveTimelineItem", sb6.toString());
        if (hk6) {
            c0((r45.nw1) g92Var.getCustom(24), g92Var, X, 2, l71Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return true;
        }
        if (Y) {
            c0((r45.nw1) g92Var.getCustom(24), g92Var, X, 4, l71Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return true;
        }
        if (Ri) {
            b0((r45.nw1) g92Var.getCustom(24), X, 3, g92Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return true;
        }
        if (g92Var.getInteger(13) == 1) {
            c0((r45.nw1) g92Var.getCustom(24), g92Var, X, 0, l71Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return true;
        }
        b0((r45.nw1) g92Var.getCustom(24), X, 0, g92Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return true;
    }

    @Override // xd4.d
    public android.graphics.Rect getDisplayRect() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.view.View finderLivePlayerContainer = getFinderLivePlayerContainer();
        if (finderLivePlayerContainer == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return null;
        }
        int[] iArr = new int[2];
        finderLivePlayerContainer.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, finderLivePlayerContainer.getMeasuredWidth() + i17, finderLivePlayerContainer.getMeasuredHeight() + i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return rect;
    }

    @Override // tc4.x1
    public int getViewType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return 20;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // tc4.v0, uc4.f1, tc4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(in5.s0 r20, zc4.b r21, int r22, boolean r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.a0.h(in5.s0, zc4.b, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.x1
    public jz5.l k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        this.f417270y1 = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.crn, (android.view.ViewGroup) this, false);
        if (pc4.d.f353410a.x()) {
            android.view.View view = this.f417270y1;
            android.widget.ImageView imageView = view != null ? (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n8n) : null;
            zl5.b bVar = zl5.b.f474086a;
            zl5.b.b(bVar, imageView, i65.a.b(getContext(), 2), false, false, 12, null);
            android.view.View view2 = this.f417270y1;
            zl5.b.b(bVar, view2 != null ? (android.widget.FrameLayout) view2.findViewById(com.tencent.mm.R.id.icp) : null, i65.a.b(getContext(), 2), false, false, 12, null);
        }
        android.util.Pair j17 = m21.y.j(getContext());
        java.lang.Object first = j17.first;
        kotlin.jvm.internal.o.f(first, "first");
        int intValue = ((java.lang.Number) first).intValue();
        java.lang.Object second = j17.second;
        kotlin.jvm.internal.o.f(second, "second");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(intValue, ((java.lang.Number) second).intValue());
        android.view.View view3 = this.f417270y1;
        kotlin.jvm.internal.o.d(view3);
        jz5.l lVar = new jz5.l(view3, layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return lVar;
    }

    @Override // tc4.x1, tc4.s0
    public java.lang.String name() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return "FinderImproveLiveTimelineItem";
    }

    @Override // tc4.i2
    public void o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        super.o();
        zc4.b data = getData();
        xc4.p n17 = data != null ? data.n() : null;
        if (n17 == null) {
            Z();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return;
        }
        r45.a90 a90Var = n17.h1().ContentObj;
        r45.g92 g92Var = a90Var != null ? a90Var.f369848s : null;
        if (g92Var == null) {
            Z();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        } else {
            if (!V(getThumbImg(), X(g92Var, null).a(), 0)) {
                Z();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        }
    }

    @Override // xd4.d
    public void pause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        x("MicroMsg.Improve.FinderLiveTimelineItem", "pause: ");
        d0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
    }

    @Override // xd4.d
    public void stop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        x("MicroMsg.Improve.FinderLiveTimelineItem", "stop: ");
        d0();
        c50.m0 m0Var = this.L1;
        if (m0Var != null) {
            ((gp2.l0) m0Var).o();
        }
        this.M1 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
    }
}
