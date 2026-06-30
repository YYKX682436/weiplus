package com.tencent.mm.pluginsdk.ui.preference;

/* loaded from: classes11.dex */
public class AccountInfoPreference extends com.tencent.mm.ui.base.preference.Preference {
    public final android.view.View.OnClickListener A1;
    public android.text.SpannableString L;
    public java.lang.String M;
    public java.lang.String N;
    public android.view.View P;
    public android.view.View Q;
    public android.view.View R;
    public android.view.View S;
    public android.view.View T;
    public bi4.i0 U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public com.tencent.mm.ui.base.NoMeasuredTextView Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.LinearLayout f191053l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.ImageView f191054p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f191055p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.RelativeLayout f191056x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f191057x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.FrameLayout f191058y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.view.View.OnLayoutChangeListener f191059y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.view.View.OnClickListener f191060z1;

    public AccountInfoPreference(android.content.Context context) {
        this(context, null);
    }

    public void M() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountInfoPreference", "checkUnreadBubbleTip isListVisible:%s", java.lang.Boolean.valueOf(this.f191055p1));
        N();
        if (this.f191057x1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AccountInfoPreference", "checkUnreadBubbleTip mBubbleContentNewGroup.visible:%s, mStoryBubbleTipViews.visible:%s", java.lang.Integer.valueOf(this.f191053l1.getVisibility()), java.lang.Integer.valueOf(this.f191054p0.getVisibility()));
        }
    }

    public void N() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountInfoPreference", "forceStopBubbleTip this:%s, bindView:%s", this, java.lang.Boolean.valueOf(this.f191057x1));
        if (this.f191057x1) {
            this.f191056x0.setVisibility(8);
            ((ye4.e) i95.n0.c(ye4.e.class)).getClass();
            if (bf4.f.f19715b.f()) {
                this.f191053l1.setVisibility(8);
                return;
            }
            this.f191054p0.setVisibility(8);
            this.f191058y0.setVisibility(8);
            ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).getClass();
            e51.f fVar = ef4.j0.f252452a;
            android.widget.ImageView anchor = this.f191054p0;
            kotlin.jvm.internal.o.g(anchor, "anchor");
            java.util.ArrayList arrayList = ef4.j0.f252454c;
            java.util.Objects.toString(arrayList);
            e51.j jVar = (e51.j) ef4.j0.f252453b.get(anchor);
            if (jVar == null || !arrayList.contains(jVar)) {
                return;
            }
            com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.StoryUIFactory", "stopUnreadBubbleConfetti", new java.lang.Object[0]);
            jVar.h();
            arrayList.remove(jVar);
        }
    }

    public void O(boolean z17, boolean z18, boolean z19) {
        android.view.View view;
        this.X = z17;
        this.Y = z18;
        this.W = z19;
        boolean g17 = bi4.v1.g();
        this.V = g17;
        com.tencent.mm.ui.base.NoMeasuredTextView noMeasuredTextView = this.Z;
        android.content.Context context = this.f197770d;
        if (noMeasuredTextView != null && !g17) {
            if (z17) {
                noMeasuredTextView.setTextColor(i65.a.e(context, com.tencent.mm.R.color.f479549ab0));
            } else {
                noMeasuredTextView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
            }
        }
        if (this.V && z19) {
            android.view.View view2 = this.Q;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view3 = this.Q;
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (!this.V || z19) {
            android.view.View view4 = this.P;
            if (view4 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view5 = this.P;
            if (view5 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.V && (view = this.R) != null) {
            view.setOnClickListener(this.A1);
        }
        if (this.R != null) {
            int f17 = (z17 || !z18) ? i65.a.f(context, com.tencent.mm.R.dimen.a8f) : i65.a.f(context, com.tencent.mm.R.dimen.a8g);
            if (this.V) {
                f17 = i65.a.f(context, com.tencent.mm.R.dimen.a8g);
            }
            android.view.View view6 = this.R;
            view6.setPadding(view6.getPaddingLeft(), f17, this.R.getPaddingRight(), this.R.getPaddingBottom());
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        this.S = view;
        android.view.View.OnLayoutChangeListener onLayoutChangeListener = this.f191059y1;
        this.f191059y1 = onLayoutChangeListener;
        if (onLayoutChangeListener != null) {
            view.addOnLayoutChangeListener(onLayoutChangeListener);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a_4);
        if (this.M != null && imageView != null && gm0.j1.a()) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, this.M, null);
        }
        android.view.View.OnClickListener onClickListener = this.A1;
        imageView.setOnClickListener(onClickListener);
        com.tencent.mm.ui.base.NoMeasuredTextView noMeasuredTextView = (com.tencent.mm.ui.base.NoMeasuredTextView) view.findViewById(com.tencent.mm.R.id.kbb);
        this.Z = noMeasuredTextView;
        java.lang.String str = this.M;
        android.content.Context context = this.f197770d;
        if (str != null && noMeasuredTextView != null) {
            noMeasuredTextView.setShouldEllipsize(true);
            this.Z.i(0, i65.a.h(context, com.tencent.mm.R.dimen.f479854h3));
            if (!this.V) {
                if (this.X) {
                    this.Z.setTextColor(i65.a.e(context, com.tencent.mm.R.color.f479549ab0));
                } else {
                    this.Z.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
                }
            }
            com.tencent.mm.ui.base.NoMeasuredTextView noMeasuredTextView2 = this.Z;
            java.lang.CharSequence charSequence = this.L;
            if (charSequence == null) {
                charSequence = this.M;
            }
            noMeasuredTextView2.setText(charSequence);
            if (this.Z.getPaint() != null) {
                this.Z.getPaint().setFakeBoldText(true);
            }
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ouv);
        if (this.N != null && textView != null) {
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.f490003i5, this.N));
        } else if (textView != null) {
            textView.setVisibility(8);
        }
        textView.setOnClickListener(onClickListener);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.m47);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        view.findViewById(com.tencent.mm.R.id.leo).setOnClickListener(new y35.b(this));
        this.P = view.findViewById(com.tencent.mm.R.id.gxn);
        this.Q = view.findViewById(com.tencent.mm.R.id.gxp);
        this.R = view.findViewById(com.tencent.mm.R.id.gxv);
        this.T = view.findViewById(com.tencent.mm.R.id.ovx);
        if (this.R != null) {
            int f17 = (this.X || !this.Y) ? i65.a.f(context, com.tencent.mm.R.dimen.a8f) : i65.a.f(context, com.tencent.mm.R.dimen.a8g);
            if (this.V) {
                f17 = i65.a.f(context, com.tencent.mm.R.dimen.a8g);
            }
            android.view.View view2 = this.R;
            view2.setPadding(view2.getPaddingLeft(), f17, this.R.getPaddingRight(), this.R.getPaddingBottom());
            if (this.V) {
                this.R.setOnClickListener(onClickListener);
            } else {
                this.R.setOnClickListener(this.f191060z1);
            }
        }
        android.view.View view3 = this.R;
        bi4.i0 i0Var = this.U;
        if (i0Var != null) {
            if (((com.tencent.mm.plugin.textstatus.ui.h1) i0Var).n(view, view3)) {
                ((com.tencent.mm.plugin.textstatus.ui.h1) this.U).c();
            }
            O(this.X, this.Y, this.W);
            view.post(new y35.c(this, view));
        }
        if (bi4.v1.g() && (view instanceof android.widget.RelativeLayout)) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view;
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.textstatus.ui.h1 h1Var = new com.tencent.mm.plugin.textstatus.ui.h1(context, relativeLayout, (android.widget.LinearLayout) view3, 0);
            android.view.View view4 = h1Var.f173924g;
            relativeLayout.addView(view4);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view4.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.addRule(3, com.tencent.mm.R.id.gxv);
            h1Var.b4(this.M);
            this.U = h1Var;
        }
        O(this.X, this.Y, this.W);
        view.post(new y35.c(this, view));
    }

    public AccountInfoPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountInfoPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.U = null;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = true;
        this.Z = null;
        this.f191054p0 = null;
        this.f191056x0 = null;
        this.f191058y0 = null;
        this.f191053l1 = null;
        this.f191055p1 = true;
        this.f191057x1 = false;
        this.f191059y1 = null;
        this.f191060z1 = null;
        this.A1 = new y35.a(this);
    }
}
