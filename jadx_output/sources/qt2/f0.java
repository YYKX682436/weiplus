package qt2;

/* loaded from: classes2.dex */
public class f0 extends qt2.j {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f366572r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f366573s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Runnable f366574t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f366575u;

    /* renamed from: v, reason: collision with root package name */
    public int f366576v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f366577w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f366578x;

    /* renamed from: y, reason: collision with root package name */
    public float f366579y;

    /* renamed from: z, reason: collision with root package name */
    public final int f366580z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f366572r = "FinderShareGuidePopupTipUIC";
        this.f366573s = "";
        this.f366577w = new java.util.LinkedList();
        this.f366578x = true;
        this.f366579y = -1.0f;
        this.f366580z = android.view.ViewConfiguration.getTouchSlop();
    }

    @Override // qt2.j
    public int Q6() {
        return com.tencent.mm.R.id.jrp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qt2.j
    public void S6(androidx.recyclerview.widget.RecyclerView recyclerView) {
        android.view.View findViewById;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        androidx.recyclerview.widget.k3 p07;
        android.view.View view;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.S6(recyclerView);
        if ((((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127670e3).getValue()).r()).intValue() == 1) != false && (recyclerView2 = this.f366590g) != null && (p07 = recyclerView2.p0(0)) != null && (view = p07.itemView) != null) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.g1y);
            java.util.LinkedList linkedList = this.f366577w;
            if (viewGroup != null) {
                linkedList.add(viewGroup);
            }
            android.view.ViewGroup viewGroup2 = this.f366592i;
            if (viewGroup2 != null) {
                android.view.View findViewById2 = viewGroup2.findViewById(com.tencent.mm.R.id.gbz);
                int childCount = viewGroup2.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    android.view.View childAt = viewGroup2.getChildAt(i17);
                    if (childAt.getVisibility() == 0 && !kotlin.jvm.internal.o.b(childAt, findViewById2) && !kotlin.jvm.internal.o.b(childAt, this.f366588e)) {
                        linkedList.add(childAt);
                    }
                }
            }
        }
        android.view.View view2 = this.f366588e;
        r5 = null;
        r5 = null;
        r5 = null;
        java.lang.String str = null;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = view2 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.f484966g32) : null;
        android.view.View view3 = this.f366588e;
        android.widget.TextView textView = view3 != null ? (android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.f484967g33) : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f366573s)) {
            this.f366573s = getString(com.tencent.mm.R.string.f491378cw5);
        }
        if (textView != null) {
            textView.setText(this.f366573s);
        }
        android.view.View view4 = this.f366588e;
        android.widget.TextView textView2 = view4 != null ? (android.widget.TextView) view4.findViewById(com.tencent.mm.R.id.f484965g31) : null;
        if ((((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127670e3).getValue()).r()).intValue() == 1) == true) {
            android.view.View view5 = this.f366588e;
            if (view5 != null && (weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view5.findViewById(com.tencent.mm.R.id.f484966g32)) != null) {
                weImageView.setImageResource(com.tencent.mm.R.raw.finder_outlined_arrow);
            }
            com.tencent.mm.ui.bk.r0(textView2 != null ? textView2.getPaint() : null, 0.8f);
            java.util.List list = this.f366595o;
            so2.j5 j5Var = list != null ? (so2.j5) kz5.n0.a0(list, 1) : null;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && (feedObject2 = feedObject.getFeedObject()) != null && (objectDesc = feedObject2.getObjectDesc()) != null) {
                str = objectDesc.getDescription();
            }
            if ((str == null || str.length() == 0) != true) {
                java.lang.String str2 = "\"" + str + '\"';
                if (textView2 != null) {
                    android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                    getContext().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                    int b17 = displayMetrics.widthPixels - i65.a.b(getContext(), 94);
                    android.text.TextPaint paint = textView2.getPaint();
                    kotlin.jvm.internal.o.f(paint, "getPaint(...)");
                    android.text.StaticLayout staticLayout = new android.text.StaticLayout(str2, 0, str2.length(), paint, b17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
                    if (staticLayout.getLineCount() > 2) {
                        java.lang.String string = textView2.getContext().getString(com.tencent.mm.R.string.f4l);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        float measureText = textView2.getPaint().measureText(string);
                        android.text.TextPaint paint2 = textView2.getPaint();
                        kotlin.jvm.internal.o.f(paint2, "getPaint(...)");
                        java.lang.String substring = str2.substring(0, staticLayout.getLineEnd(1) - new android.text.StaticLayout(string, 0, string.length(), paint2, (int) measureText, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true).getLineEnd(0));
                        kotlin.jvm.internal.o.f(substring, "substring(...)");
                        textView2.setText(new android.text.SpannableString(substring.concat(string)));
                    } else {
                        textView2.setText(str2);
                    }
                }
            } else if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else {
            com.tencent.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        android.view.View view6 = this.f366588e;
        if (view6 != null && (findViewById = view6.findViewById(com.tencent.mm.R.id.f484968g34)) != null) {
            findViewById.setOnClickListener(new qt2.c0(this));
        }
        if (Z6()) {
            return;
        }
        if (weImageView2 != null) {
            weImageView2.setVisibility(4);
        }
        if (textView != null) {
            textView.setVisibility(4);
        }
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }

    @Override // qt2.j
    public void U6() {
        super.U6();
        e7(0);
    }

    @Override // qt2.j
    public void V6(float f17) {
        if (this.f366578x) {
            android.view.View view = this.f366588e;
            if (view != null && view.getVisibility() == 0) {
                android.view.View view2 = this.f366588e;
                if (view2 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC", "onScrollDown", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC", "onScrollDown", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                a7();
                this.f366578x = false;
            }
        }
    }

    @Override // qt2.j
    public boolean X6() {
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.W3).getValue()).r()).intValue() != 1 && !((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).f39226d && ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127689f3).getValue()).r()).intValue() == 0 && ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127632c3).getValue()).r()).intValue() == 1 && hc2.e.a() && !((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.D1().r()).booleanValue();
    }

    @Override // qt2.j
    public void Y6() {
        android.view.View view;
        if (this.f366589f || T6() || (view = this.f366588e) == null) {
            return;
        }
        this.f366575u = new qt2.e0(this, view);
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f366575u);
        }
    }

    public boolean Z6() {
        return true;
    }

    public final void a7() {
        qt2.j.P6(this, c7(), 260L, 0.0f, 4, null);
    }

    public void b7(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        android.view.View view = this.f366588e;
        boolean z17 = false;
        if (view != null && view.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            int action = event.getAction();
            if (action == 0) {
                this.f366579y = event.getY();
                return;
            }
            if (action != 1) {
                return;
            }
            float y17 = event.getY() - this.f366579y;
            if (y17 <= 0.0f || y17 <= this.f366580z) {
                return;
            }
            a7();
        }
    }

    public final int c7() {
        int i17 = this.f366576v;
        return i17 > 0 ? i17 : i65.a.b(getContext(), 170);
    }

    public void d7() {
        a7();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f366590g;
        if (recyclerView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(1);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC", "onClickGuide", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC", "onClickGuide", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }

    public final void e7(int i17) {
        for (android.view.View view : this.f366577w) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC", "setViewListVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC", "setViewListVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // qt2.j
    public java.lang.String getTag() {
        return this.f366572r;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        android.view.View view = this.f366588e;
        if (view != null) {
            view.removeCallbacks(this.f366574t);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f366572r = "FinderShareGuidePopupTipUIC";
        this.f366573s = "";
        this.f366577w = new java.util.LinkedList();
        this.f366578x = true;
        this.f366579y = -1.0f;
        this.f366580z = android.view.ViewConfiguration.getTouchSlop();
    }
}
