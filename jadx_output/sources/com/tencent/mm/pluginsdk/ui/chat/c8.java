package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class c8 {
    public static int B;
    public final jz5.g A;

    /* renamed from: a, reason: collision with root package name */
    public boolean f190219a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190220b;

    /* renamed from: c, reason: collision with root package name */
    public final fl5.i f190221c;

    /* renamed from: d, reason: collision with root package name */
    public android.animation.ObjectAnimator f190222d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View.OnLayoutChangeListener f190223e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f190224f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.s7 f190225g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f190226h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f190227i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f190228j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f190229k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f190230l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f190231m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f190232n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f190233o;

    /* renamed from: p, reason: collision with root package name */
    public int f190234p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f190235q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f190236r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f190237s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f190238t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f190239u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f190240v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f190241w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f190242x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f190243y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f190244z;

    static {
        new com.tencent.mm.pluginsdk.ui.chat.l6(null);
        B = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_chatting_full_screen_edt_and, bm5.h0.RepairerConfig_Global_FullScreenEdt_Int, 1);
    }

    public c8(com.tencent.mm.pluginsdk.ui.chat.ChatFooter mChatFooter, fl5.i mOriEdt) {
        kotlin.jvm.internal.o.g(mChatFooter, "mChatFooter");
        kotlin.jvm.internal.o.g(mOriEdt, "mOriEdt");
        this.f190220b = mChatFooter;
        this.f190221c = mOriEdt;
        com.tencent.mm.pluginsdk.ui.chat.o7 o7Var = new com.tencent.mm.pluginsdk.ui.chat.o7(this);
        com.tencent.mm.pluginsdk.ui.chat.g7 g7Var = new com.tencent.mm.pluginsdk.ui.chat.g7(this);
        this.f190223e = g7Var;
        mOriEdt.addOnLayoutChangeListener(g7Var);
        java.util.LinkedList linkedList = (java.util.LinkedList) mChatFooter.J1;
        if (!linkedList.contains(o7Var)) {
            linkedList.add(o7Var);
        }
        this.f190224f = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.k7(this));
        this.f190225g = new com.tencent.mm.pluginsdk.ui.chat.s7(this);
        this.f190226h = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.w7(this));
        this.f190227i = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.t7(this));
        this.f190228j = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.n7(this));
        this.f190229k = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.j7(this));
        this.f190230l = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.a7(this));
        this.f190231m = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.m6(this));
        this.f190232n = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.b7(this));
        jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.q7(this));
        this.f190233o = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.r7(this));
        this.f190235q = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.d7(this));
        this.f190236r = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.e7(this));
        this.f190237s = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.u6(this));
        this.f190238t = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.x6(this));
        this.f190239u = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.y6(this));
        this.f190240v = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.y7(this));
        jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.b8(this));
        this.f190241w = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.a8(this));
        this.f190242x = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.v7(this));
        this.f190243y = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.f7(this));
        this.f190244z = "";
        this.A = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.m7(this));
    }

    public final void a() {
        fl5.i iVar = this.f190221c;
        iVar.getSelectHelper().a();
        java.lang.Object value = ((jz5.n) this.f190233o).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        int i17 = this.f190234p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "animClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "animClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object value2 = ((jz5.n) this.f190235q).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        java.lang.Object tag = ((android.widget.LinearLayout) value2).getTag(com.tencent.mm.R.id.bkw);
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type android.view.View");
        android.view.View view2 = (android.view.View) tag;
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int measuredWidth = view2.getMeasuredWidth();
        int measuredHeight = view2.getMeasuredHeight();
        android.view.ViewGroup.LayoutParams layoutParams = g().getLayoutParams();
        layoutParams.width = measuredWidth;
        g().setLayoutParams(layoutParams);
        int[] iArr2 = new int[2];
        iVar.l().getLocationOnScreen(iArr2);
        float translationY = iArr2[1] - h().getTranslationY();
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190220b;
        chatFooter.S1();
        int left = g().getLeft();
        int top = g().getTop();
        int i18 = top + measuredHeight;
        int i19 = iArr[0] - iArr2[0];
        float f17 = iArr[1] - translationY;
        int intValue = ((java.lang.Number) ((jz5.n) this.f190243y).getValue()).intValue();
        int h17 = i65.a.h(f(), com.tencent.mm.R.dimen.f479672c9);
        android.view.ViewPropertyAnimator translationY2 = h().animate().translationX(i19).translationY(f17);
        translationY2.setInterpolator(ta5.h.f416879a.a());
        translationY2.setDuration(300L);
        translationY2.start();
        translationY2.setUpdateListener(new com.tencent.mm.pluginsdk.ui.chat.o6(this, left, top, measuredWidth + left, i18, h17, intValue, 0.5f, 0.0f));
        translationY2.setListener(new com.tencent.mm.pluginsdk.ui.chat.p6(this, translationY2));
        u35.c.f424434a.a(3, chatFooter.getChattingContext() != null ? e() : null);
    }

    public void b(boolean z17) {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = e().f460717l.getSwipeBackLayout();
        if (swipeBackLayout != null) {
            swipeBackLayout.setEnableGesture(z17);
        }
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageButton c() {
        java.lang.Object value = ((jz5.n) this.f190238t).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageButton) value;
    }

    public android.view.View d() {
        java.lang.Object value = ((jz5.n) this.f190230l).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public yb5.d e() {
        yb5.d a17 = this.f190220b.getChattingContext().a();
        kotlin.jvm.internal.o.f(a17, "getChattingContext(...)");
        return a17;
    }

    public android.app.Activity f() {
        return e().g();
    }

    public final android.widget.LinearLayout g() {
        java.lang.Object value = ((jz5.n) this.f190236r).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.LinearLayout) value;
    }

    public final android.view.View h() {
        java.lang.Object value = ((jz5.n) this.f190229k).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public android.view.View i() {
        java.lang.Object value = ((jz5.n) this.f190224f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final com.tencent.mm.pluginsdk.ui.chat.lb j() {
        return (com.tencent.mm.pluginsdk.ui.chat.lb) ((jz5.n) this.A).getValue();
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageButton k() {
        java.lang.Object value = ((jz5.n) this.f190240v).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageButton) value;
    }

    public final void l(int i17) {
        int i18;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190220b;
        if (!(chatFooter.getChattingContext() == null || chatFooter.getChattingContext().a() == null) || chatFooter.getFullScreenEditEnable()) {
            if (o() && n()) {
                return;
            }
            android.view.View d17 = d();
            if (o() && i17 > 2 && chatFooter.f189959b2) {
                if (d().getVisibility() != 0) {
                    u35.c.f424434a.a(1, chatFooter.getChattingContext() != null ? e() : null);
                }
                i18 = 0;
            } else {
                i18 = 8;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(d17, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "handleLineCountChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(d17, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "handleLineCountChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void m() {
        java.lang.Object value = ((jz5.n) this.f190241w).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "hideVoiceInputRecording", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "hideVoiceInputRecording", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        k().setVisibility(0);
        android.animation.ObjectAnimator objectAnimator = this.f190222d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final boolean n() {
        return o() && this.f190219a && i().getParent() != null;
    }

    public final boolean o() {
        if (B < 1) {
            return false;
        }
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190220b;
        return (chatFooter.getChattingContext() != null && chatFooter.getChattingContext().a() != null) || chatFooter.getFullScreenEditEnable();
    }

    public final void p() {
        com.tencent.mm.ui.chatting.db l17;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190220b;
        chatFooter.y0();
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = chatFooter.getChatFooterPanel();
        if (chatFooterPanel != null) {
            chatFooterPanel.setVisibleChangeListener(this.f190225g);
        }
        jz5.g gVar = this.f190233o;
        java.lang.Object value = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        this.f190234p = ((android.view.View) value).getVisibility();
        java.lang.Object value2 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        android.view.View view = (android.view.View) value2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "openFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "openFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object value3 = ((jz5.n) this.f190242x).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        android.animation.ObjectAnimator ofPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder((android.view.View) value3, android.animation.PropertyValuesHolder.ofFloat("scaleX", 1.0f, 1.1f, 1.0f), android.animation.PropertyValuesHolder.ofFloat("scaleY", 1.0f, 1.1f, 1.0f));
        ofPropertyValuesHolder.setDuration(1000L);
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.setRepeatMode(2);
        ofPropertyValuesHolder.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        this.f190222d = ofPropertyValuesHolder;
        if (chatFooter.getChattingContext() == null) {
            k().setVisibility(8);
        } else if (((com.tencent.mm.ui.chatting.component.y8) ((sb5.i0) e().f460708c.a(sb5.i0.class))).f200304y) {
            k().setVisibility(8);
        } else {
            com.tencent.mm.pluginsdk.ui.SpeechInputLayout B0 = ((com.tencent.mm.ui.chatting.component.y8) ((sb5.i0) e().f460708c.a(sb5.i0.class))).B0();
            if ((B0 != null ? B0.getCurV2TStatus() : 0) >= 2) {
                s();
            } else {
                m();
            }
        }
        com.tencent.mm.pluginsdk.ui.chat.y4 chattingContext = chatFooter.getChattingContext();
        yb5.d a17 = chattingContext != null ? chattingContext.a() : null;
        if (a17 != null && (l17 = a17.l()) != null) {
            l17.V6(i());
        }
        android.view.ViewParent parent = i().getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null && viewGroup.indexOfChild(i()) != viewGroup.getChildCount() - 1) {
            viewGroup.removeView(i());
            viewGroup.addView(i());
        }
        fl5.i iVar = this.f190221c;
        android.view.View l18 = iVar.l();
        kotlin.jvm.internal.o.f(l18, "wrapView(...)");
        int[] iArr = new int[2];
        l18.getLocationOnScreen(iArr);
        com.tencent.mm.pluginsdk.ui.chat.k6 k6Var = new com.tencent.mm.pluginsdk.ui.chat.k6(l18.getMeasuredWidth(), l18.getMeasuredHeight(), iArr);
        this.f190219a = true;
        android.view.View i17 = i();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(i17, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "openFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        i17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(i17, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "openFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c().setVisibility(4);
        java.lang.Object value4 = ((jz5.n) this.f190239u).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        android.view.View view2 = (android.view.View) value4;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "openFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "openFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewGroup.LayoutParams layoutParams = g().getLayoutParams();
        layoutParams.width = -1;
        g().setLayoutParams(layoutParams);
        r(g());
        iVar.setMaxHeight(Integer.MAX_VALUE);
        u();
        com.tencent.mars.xlog.Log.i("ChatFooterKt", "openFullScreenEdt() called: %s", h().getLayoutParams().toString());
        java.lang.Object value5 = ((jz5.n) this.f190237s).getValue();
        kotlin.jvm.internal.o.f(value5, "getValue(...)");
        v();
        w();
        iVar.getSizeAnimController().a(false);
        iVar.l().post(new com.tencent.mm.pluginsdk.ui.chat.p7(this, k6Var));
        b(false);
        chatFooter.getSeqAutoCompleteHelper().f190686b = false;
        java.lang.String Y = com.tencent.mm.sdk.platformtools.t8.Y(16);
        kotlin.jvm.internal.o.f(Y, "getRandomString(...)");
        this.f190244z = Y;
        j().e(true);
        com.tencent.mm.autogen.mmdata.rpt.FullScreenSeqAutoCompleteStruct fullScreenSeqAutoCompleteStruct = new com.tencent.mm.autogen.mmdata.rpt.FullScreenSeqAutoCompleteStruct();
        fullScreenSeqAutoCompleteStruct.f58267d = 1;
        fullScreenSeqAutoCompleteStruct.f58268e = fullScreenSeqAutoCompleteStruct.b("CompleteSeq", "", true);
        fullScreenSeqAutoCompleteStruct.f58269f = 0;
        java.lang.String n17 = fullScreenSeqAutoCompleteStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("SAInputReporter", "report%s %s", 27027, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
        fullScreenSeqAutoCompleteStruct.k();
    }

    public final java.lang.String q(int[] iArr) {
        kotlin.jvm.internal.o.g(iArr, "<this>");
        return "0:" + iArr[0] + " 1:" + iArr[1];
    }

    public final void r(android.view.ViewGroup viewGroup) {
        fl5.i iVar = this.f190221c;
        int selectionStart = iVar.getSelectionStart();
        android.view.ViewParent g17 = iVar.g();
        android.view.ViewGroup viewGroup2 = g17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) g17 : null;
        if (viewGroup2 != null) {
            iVar.getSelectHelper().M = true;
            int indexOfChild = viewGroup2.indexOfChild(iVar.l());
            android.view.ViewGroup.LayoutParams layoutParams = iVar.l().getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams((android.widget.LinearLayout.LayoutParams) layoutParams);
            layoutParams2.width = iVar.l().getMeasuredWidth();
            layoutParams2.height = iVar.l().getMeasuredHeight();
            android.view.View view = new android.view.View(f());
            viewGroup2.addView(view, indexOfChild, layoutParams2);
            viewGroup2.setTag(com.tencent.mm.R.id.bkw, view);
            viewGroup2.setTag(com.tencent.mm.R.id.bkx, java.lang.Integer.valueOf(indexOfChild));
            viewGroup2.removeView(iVar.l());
            iVar.getSelectHelper().M = false;
        }
        java.lang.Object tag = viewGroup.getTag(com.tencent.mm.R.id.bkx);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        viewGroup.addView(iVar.l(), num != null ? num.intValue() : -1);
        java.lang.Object tag2 = viewGroup.getTag(com.tencent.mm.R.id.bkw);
        android.view.View view2 = tag2 instanceof android.view.View ? (android.view.View) tag2 : null;
        if (view2 != null) {
            viewGroup.removeView(view2);
        }
        iVar.k();
        iVar.setSelection(selectionStart);
    }

    public final void s() {
        java.lang.Object value = ((jz5.n) this.f190241w).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "showVoiceInputRecording", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "showVoiceInputRecording", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        k().setVisibility(8);
        android.animation.ObjectAnimator objectAnimator = this.f190222d;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
    }

    public final void t() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190220b;
        if (chatFooter.getConfigEnableEnterButtonSend()) {
            chatFooter.L1();
            boolean z17 = chatFooter.W2;
            if (!z17 && chatFooter.X1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "jacks chatting footer disable enter button send");
                chatFooter.X1 = false;
                chatFooter.f190021m.setImeOptions(0);
                fl5.i iVar = chatFooter.f190021m;
                iVar.setInputType(iVar.getInputType() | 64);
            } else if (z17 && !chatFooter.X1) {
                chatFooter.f0();
            }
            chatFooter.getChatFooterPanel().setShowSend(chatFooter.W2);
            chatFooter.getChatFooterPanel().i();
        }
    }

    public final void u() {
        int i17;
        int i18;
        int i19;
        android.app.Activity f17 = f();
        boolean z17 = f17 != null && com.tencent.mm.ui.b4.c(f17);
        jz5.g gVar = this.f190232n;
        jz5.g gVar2 = this.f190231m;
        if (z17) {
            int[] iArr = new int[2];
            java.lang.Object value = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((android.view.View) value).getLocationOnScreen(iArr);
            if (com.tencent.mm.ui.b4.c(f())) {
                android.graphics.Rect rect = new android.graphics.Rect();
                java.lang.Object value2 = ((jz5.n) gVar2).getValue();
                kotlin.jvm.internal.o.f(value2, "getValue(...)");
                ((android.view.View) value2).getWindowVisibleDisplayFrame(rect);
                i19 = iArr[1];
                i18 = rect.top;
            } else {
                int[] iArr2 = new int[2];
                java.lang.Object value3 = ((jz5.n) gVar2).getValue();
                kotlin.jvm.internal.o.f(value3, "getValue(...)");
                ((android.view.View) value3).getLocationOnScreen(iArr2);
                int i27 = iArr[1];
                i18 = iArr2[1];
                i19 = i27;
            }
            i17 = i19 - i18;
            q(iArr);
        } else {
            int[] iArr3 = new int[2];
            java.lang.Object value4 = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value4, "getValue(...)");
            ((android.view.View) value4).getLocationOnScreen(iArr3);
            int[] iArr4 = new int[2];
            java.lang.Object value5 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value5, "getValue(...)");
            ((android.view.View) value5).getLocationOnScreen(iArr4);
            i17 = iArr4[1] - iArr3[1];
            q(iArr3);
            q(iArr4);
        }
        com.tencent.mars.xlog.Log.i("ChatFooterKt", "updateFullScreenEdtLayoutHeight:" + i17);
        android.view.ViewGroup.LayoutParams layoutParams = h().getLayoutParams();
        layoutParams.height = i17;
        h().setLayoutParams(layoutParams);
    }

    public final void v() {
        if (this.f190220b.getPanelType() == 2) {
            c().setImageResource(com.tencent.mm.R.drawable.f481236o2);
            c().setContentDescription(f().getResources().getString(com.tencent.mm.R.string.aze));
        } else {
            c().setImageResource(com.tencent.mm.R.raw.icons_outlined_emoji);
            c().setContentDescription(f().getResources().getString(com.tencent.mm.R.string.azc));
        }
        c().setIconColor(f().getResources().getColor(com.tencent.mm.R.color.FG_0));
    }

    public final void w() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190220b;
        if (chatFooter.getPanelType() == 2) {
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = chatFooter.getChatFooterPanel();
            if (chatFooterPanel != null) {
                chatFooterPanel.n();
            }
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = chatFooter.getChatFooterPanel();
            if (chatFooterPanel2 != null) {
                chatFooterPanel2.f(true);
            }
            chatFooter.R1();
        }
    }
}
