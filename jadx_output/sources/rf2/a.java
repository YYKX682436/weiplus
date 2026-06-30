package rf2;

/* loaded from: classes10.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f394636d;

    /* renamed from: e, reason: collision with root package name */
    public final df2.ln f394637e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f394638f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f394639g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f394640h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f394641i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f394642m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f394643n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f394644o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f394645p;

    public a(android.view.View root, df2.ln controller) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f394636d = root;
        this.f394637e = controller;
        this.f394638f = controller.f230676m;
    }

    public final void a() {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        android.view.ViewGroup viewGroup3;
        android.view.ViewGroup viewGroup4;
        android.view.ViewGroup viewGroup5;
        android.widget.TextView textView;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2;
        android.view.ViewGroup viewGroup6 = this.f394639g;
        android.widget.TextView textView4 = null;
        if (viewGroup6 == null) {
            viewGroup6 = (android.view.ViewGroup) this.f394636d.findViewById(com.tencent.mm.R.id.is8);
            if (viewGroup6 != null) {
                viewGroup6.setOnClickListener(this);
            } else {
                viewGroup6 = null;
            }
        }
        this.f394639g = viewGroup6;
        android.view.View view = this.f394640h;
        if (view == null) {
            if (viewGroup6 == null || (view = viewGroup6.findViewById(com.tencent.mm.R.id.kpj)) == null) {
                view = null;
            } else {
                view.setOnClickListener(this);
            }
        }
        this.f394640h = view;
        android.widget.TextView textView5 = this.f394641i;
        d92.f fVar = d92.f.f227470a;
        if (textView5 == null) {
            android.view.ViewGroup viewGroup7 = this.f394639g;
            if (viewGroup7 == null || (textView5 = (android.widget.TextView) viewGroup7.findViewById(com.tencent.mm.R.id.kcw)) == null) {
                textView5 = null;
            } else {
                android.content.Context context = textView5.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                d92.f.a(fVar, context, textView5, 17.0f, 0.0f, 8, null);
            }
        }
        this.f394641i = textView5;
        android.widget.ImageView imageView = this.f394642m;
        if (imageView == null) {
            android.view.ViewGroup viewGroup8 = this.f394639g;
            imageView = viewGroup8 != null ? (android.widget.ImageView) viewGroup8.findViewById(com.tencent.mm.R.id.f486381l22) : null;
        }
        this.f394642m = imageView;
        android.widget.TextView textView6 = this.f394643n;
        if (textView6 == null) {
            android.view.ViewGroup viewGroup9 = this.f394639g;
            if (viewGroup9 == null || (textView6 = (android.widget.TextView) viewGroup9.findViewById(com.tencent.mm.R.id.kpn)) == null) {
                textView6 = null;
            } else {
                textView6.setOnClickListener(this);
            }
        }
        this.f394643n = textView6;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f394644o;
        if (weImageView3 == null) {
            android.view.ViewGroup viewGroup10 = this.f394639g;
            if (viewGroup10 == null || (weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup10.findViewById(com.tencent.mm.R.id.kpo)) == null) {
                weImageView3 = null;
            } else {
                weImageView3.setOnClickListener(this);
            }
        }
        this.f394644o = weImageView3;
        android.widget.TextView textView7 = this.f394645p;
        if (textView7 == null) {
            android.view.ViewGroup viewGroup11 = this.f394639g;
            if (viewGroup11 != null && (textView7 = (android.widget.TextView) viewGroup11.findViewById(com.tencent.mm.R.id.nfl)) != null) {
                android.content.Context context2 = textView7.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                d92.f.a(fVar, context2, textView7, 14.0f, 0.0f, 8, null);
            }
            this.f394645p = textView4;
            viewGroup = this.f394639g;
            if (viewGroup != null && (weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.f486266r43)) != null) {
                com.tencent.mm.plugin.finder.live.util.k2.c(weImageView2, 3);
            }
            viewGroup2 = this.f394639g;
            if (viewGroup2 != null && (textView3 = (android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.kcw)) != null) {
                com.tencent.mm.plugin.finder.live.util.k2.e(textView3, 3);
            }
            viewGroup3 = this.f394639g;
            if (viewGroup3 != null && (textView2 = (android.widget.TextView) viewGroup3.findViewById(com.tencent.mm.R.id.kpn)) != null) {
                com.tencent.mm.plugin.finder.live.util.k2.e(textView2, 3);
            }
            viewGroup4 = this.f394639g;
            if (viewGroup4 != null && (weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup4.findViewById(com.tencent.mm.R.id.kpo)) != null) {
                com.tencent.mm.plugin.finder.live.util.k2.c(weImageView, 3);
            }
            viewGroup5 = this.f394639g;
            if (viewGroup5 != null || (textView = (android.widget.TextView) viewGroup5.findViewById(com.tencent.mm.R.id.nfl)) == null) {
            }
            com.tencent.mm.plugin.finder.live.util.k2.e(textView, 5);
            return;
        }
        textView4 = textView7;
        this.f394645p = textView4;
        viewGroup = this.f394639g;
        if (viewGroup != null) {
            com.tencent.mm.plugin.finder.live.util.k2.c(weImageView2, 3);
        }
        viewGroup2 = this.f394639g;
        if (viewGroup2 != null) {
            com.tencent.mm.plugin.finder.live.util.k2.e(textView3, 3);
        }
        viewGroup3 = this.f394639g;
        if (viewGroup3 != null) {
            com.tencent.mm.plugin.finder.live.util.k2.e(textView2, 3);
        }
        viewGroup4 = this.f394639g;
        if (viewGroup4 != null) {
            com.tencent.mm.plugin.finder.live.util.k2.c(weImageView, 3);
        }
        viewGroup5 = this.f394639g;
        if (viewGroup5 != null) {
        }
    }

    public final void b(boolean z17, boolean z18, java.lang.Integer num) {
        java.lang.String str;
        if (!z17) {
            android.widget.TextView textView = this.f394643n;
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f394644o;
            if (weImageView == null) {
                return;
            }
            weImageView.setVisibility(8);
            return;
        }
        android.widget.TextView textView2 = this.f394643n;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f394644o;
        if (weImageView2 != null) {
            weImageView2.setVisibility(0);
        }
        rf2.t tVar = rf2.t.f394890a;
        r45.f02 f02Var = this.f394637e.f230685v;
        if (f02Var == null || (str = f02Var.f373878d) == null) {
            str = "";
        }
        tVar.e(str, 20, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : num);
    }

    public final void c(int i17) {
        boolean E = zl2.q4.f473933a.E();
        java.lang.String str = this.f394638f;
        if (E) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVisible:");
            sb6.append(i17);
            sb6.append(",participantContainner visibility:");
            android.view.ViewGroup viewGroup = this.f394639g;
            sb6.append(viewGroup != null ? java.lang.Integer.valueOf(viewGroup.getVisibility()) : null);
            com.tencent.mm.sdk.platformtools.Log.c(str, sb6.toString(), new java.lang.Object[0]);
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setVisible:");
            sb7.append(i17);
            sb7.append(",participantContainner visibility:");
            android.view.ViewGroup viewGroup2 = this.f394639g;
            sb7.append(viewGroup2 != null ? java.lang.Integer.valueOf(viewGroup2.getVisibility()) : null);
            com.tencent.mars.xlog.Log.i(str, sb7.toString());
        }
        if (this.f394639g == null) {
            a();
        }
        android.view.ViewGroup viewGroup3 = this.f394639g;
        if (viewGroup3 == null) {
            return;
        }
        viewGroup3.setVisibility(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(r45.f02 r22) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf2.a.d(r45.f02):void");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultParticipantPage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        boolean z17 = true;
        if ((valueOf == null || valueOf.intValue() != com.tencent.mm.R.id.kpn) && (valueOf == null || valueOf.intValue() != com.tencent.mm.R.id.kpo)) {
            z17 = false;
        }
        df2.ln lnVar = this.f394637e;
        if (z17) {
            rf2.t tVar = rf2.t.f394890a;
            r45.f02 f02Var = lnVar.f230685v;
            if (f02Var == null || (str = f02Var.f373878d) == null) {
                str = "";
            }
            tVar.e(str, 21, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : 3);
            lnVar.c7(this.f394639g);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.kpj) {
            yz5.l lVar = lnVar.f230687x;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.FALSE);
            }
            lnVar.Z6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultParticipantPage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
