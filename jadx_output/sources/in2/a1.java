package in2;

/* loaded from: classes10.dex */
public final class a1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f292794d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f292795e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f292796f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f292797g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f292798h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.p f292799i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.q f292800m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.p f292801n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.l f292802o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f292803p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f292804q;

    /* renamed from: r, reason: collision with root package name */
    public int f292805r;

    /* renamed from: s, reason: collision with root package name */
    public final int f292806s;

    public a1(gk2.e liveData, android.content.Context context) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(context, "context");
        this.f292794d = liveData;
        this.f292795e = context;
        this.f292796f = "FinderLiveAnchorSingSongListAdapter";
        this.f292797g = "finder_live_sing_song_play.pag";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f292798h = arrayList;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        this.f292803p = true;
        this.f292804q = "-";
        this.f292806s = 8;
        zl2.q4.f473933a.R("FinderLiveAnchorSingSongListAdapter");
        arrayList.addAll(((mm2.m6) liveData.a(mm2.m6.class)).f329241f.f234053b);
    }

    public final void B(boolean z17) {
        java.util.ArrayList<dk2.yg> arrayList = this.f292798h;
        if (z17) {
            java.util.LinkedList linkedList = ((mm2.m6) this.f292794d.a(mm2.m6.class)).f329247o;
            for (dk2.yg ygVar : arrayList) {
                if (!linkedList.contains(ygVar.f234393a)) {
                    ygVar.f234397e = true;
                }
            }
        } else {
            int i17 = 0;
            for (java.lang.Object obj : arrayList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                dk2.yg ygVar2 = (dk2.yg) obj;
                ygVar2.f234397e = false;
                ygVar2.f234394b = 0L;
                ygVar2.f234400h = "";
                if (ygVar2.f234395c == 4) {
                    z(i17, ygVar2);
                }
                i17 = i18;
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f292798h.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((dk2.yg) this.f292798h.get(i17)).f234395c;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        in2.w0 holder = (in2.w0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        y(holder, i17);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.ana, null);
        kotlin.jvm.internal.o.d(inflate);
        return new in2.w0(this, inflate);
    }

    public final void x(in2.w0 holder, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = this.f292795e;
        android.widget.TextView textView = holder.f292923i;
        if (z17) {
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.p1m));
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478553an));
            textView.setBackground(textView.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481694a06));
        } else {
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.ef_));
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
            textView.setBackground(textView.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a07));
        }
    }

    public final void y(in2.w0 w0Var, int i17) {
        java.lang.CharSequence charSequence;
        int i18;
        java.util.ArrayList arrayList = this.f292798h;
        java.lang.Object obj = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        dk2.yg ygVar = (dk2.yg) obj;
        dk2.yg ygVar2 = (dk2.yg) arrayList.get(i17);
        if (ygVar2.f234397e && ygVar2.a()) {
            w0Var.f292920f.setAlpha(1.0f);
            w0Var.f292921g.setAlpha(1.0f);
            w0Var.f292922h.setAlpha(1.0f);
            w0Var.f292926o.setAlpha(1.0f);
        } else {
            w0Var.f292920f.setAlpha(0.3f);
            w0Var.f292921g.setAlpha(0.3f);
            w0Var.f292922h.setAlpha(0.3f);
            w0Var.f292926o.setAlpha(0.3f);
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String str = ygVar.f234393a;
        android.widget.TextView textView = w0Var.f292921g;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        long j17 = ygVar.f234394b;
        java.lang.String str2 = this.f292804q;
        android.widget.TextView textView2 = w0Var.f292926o;
        if (j17 > 0) {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.String valueOf = java.lang.String.valueOf(ygVar.f234394b);
            float textSize2 = textView2.getTextSize();
            ((ke0.e) xVar2).getClass();
            charSequence = com.tencent.mm.pluginsdk.ui.span.c0.j(context2, valueOf, textSize2);
        } else {
            charSequence = str2;
        }
        textView2.setText(charSequence);
        java.lang.String str3 = ygVar.f234400h;
        boolean z17 = str3 == null || str3.length() == 0;
        android.widget.TextView textView3 = w0Var.f292922h;
        if (z17) {
            textView3.setVisibility(8);
        } else {
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.String str4 = ygVar.f234400h;
            float textSize3 = textView3.getTextSize();
            ((ke0.e) xVar3).getClass();
            textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context3, str4, textSize3));
            textView3.setVisibility(0);
        }
        boolean a86 = ((mm2.c1) this.f292794d.a(mm2.c1.class)).a8();
        android.widget.FrameLayout frameLayout = w0Var.f292918d;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = w0Var.f292925n;
        android.widget.TextView textView4 = w0Var.f292920f;
        if (a86) {
            frameLayout.setVisibility(0);
            android.view.ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i65.a.b(w0Var.itemView.getContext(), 8);
            android.widget.TextView textView5 = w0Var.f292923i;
            if (textView5.getVisibility() == 8) {
                textView2.setVisibility(0);
            }
            com.tencent.mm.view.MMPAGView mMPAGView = w0Var.f292919e;
            kotlin.jvm.internal.o.f(mMPAGView, "<get-singSongIcon>(...)");
            int i19 = ygVar.f234395c;
            boolean z18 = this.f292803p;
            if (i19 != 4) {
                if (z18) {
                    mMPAGView.n();
                }
                mMPAGView.setVisibility(8);
            } else if (z18) {
                mMPAGView.setVisibility(0);
                if (!mMPAGView.f()) {
                    mMPAGView.g();
                }
            } else {
                mMPAGView.setVisibility(8);
            }
            textView4.setText(java.lang.String.valueOf((i17 + 1) - this.f292805r));
            if (((dk2.yg) arrayList.get(i17)).f234395c == 4) {
                x(w0Var, false);
            } else {
                x(w0Var, true);
            }
            if (ygVar.f234395c == 4) {
                mMPAGView.setVisibility(0);
                textView4.setVisibility(8);
                textView2.setVisibility(8);
                textView5.setVisibility(0);
                textView.setTextColor(w0Var.itemView.getResources().getColor(com.tencent.mm.R.color.f478502m));
                textView3.setTextColor(w0Var.itemView.getResources().getColor(com.tencent.mm.R.color.Brand_Alpha_0_5));
            } else {
                mMPAGView.setVisibility(8);
                textView4.setVisibility(0);
                textView2.setVisibility(0);
                textView5.setVisibility(8);
                textView.setTextColor(w0Var.itemView.getResources().getColor(com.tencent.mm.R.color.FG_0));
                textView3.setTextColor(w0Var.itemView.getResources().getColor(com.tencent.mm.R.color.f479222ta));
            }
            if (ygVar.f234398f) {
                textView4.setText(str2);
            }
            zl2.r4 r4Var = zl2.r4.f473950a;
            kotlin.jvm.internal.o.f(textView5, "<get-singSongClickBtn>(...)");
            zl2.r4.c3(r4Var, textView5, 0, 0, 6, null);
            textView5.setOnClickListener(new in2.x0(ygVar, this, i17));
            kotlin.jvm.internal.o.f(textView5, "<get-singSongClickBtn>(...)");
            com.tencent.mm.ui.fk.a(textView5);
            w0Var.itemView.setOnClickListener(new in2.y0(this, ygVar, i17));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = i65.a.b(w0Var.itemView.getContext(), 16);
            frameLayout.setVisibility(8);
            textView3.setVisibility(8);
            textView2.setVisibility(8);
        }
        android.widget.TextView textView6 = w0Var.f292927p;
        kotlin.jvm.internal.o.f(textView6, "<get-auditStatus>(...)");
        in2.b1.a(textView6, ygVar);
        if (ygVar.a()) {
            i18 = 8;
        } else {
            kotlin.jvm.internal.o.f(textView2, "<get-singSongHeat>(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            i18 = 8;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(textView2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter", "onBindSingSongHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter$SingSongViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(textView2, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter", "onBindSingSongHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter$SingSongViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            kotlin.jvm.internal.o.f(textView4, "<get-singSongRank>(...)");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(textView4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter", "onBindSingSongHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter$SingSongViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(textView4, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter", "onBindSingSongHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter$SingSongViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int i27 = this.f292806s;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = w0Var.f292924m;
        if (i17 < i27 || i17 != arrayList.size() - 1) {
            constraintLayout2.setVisibility(i18);
        } else {
            constraintLayout2.setVisibility(0);
        }
        w0Var.itemView.setOnLongClickListener(new in2.z0(this, i17, ygVar));
    }

    public final void z(int i17, dk2.yg songItem) {
        kotlin.jvm.internal.o.g(songItem, "songItem");
        com.tencent.mars.xlog.Log.i(this.f292796f, ((dk2.yg) this.f292798h.get(i17)).f234393a + ", MUSIC_DEFAULT}");
        yz5.p pVar = this.f292801n;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(i17), songItem);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        in2.w0 holder = (in2.w0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            y(holder, i17);
            return;
        }
        if (((dk2.yg) this.f292798h.get(i17)).f234395c != 4) {
            for (java.lang.Object obj : payloads) {
                if (obj instanceof java.lang.Boolean) {
                    java.lang.Boolean bool = (java.lang.Boolean) obj;
                    holder.f292923i.setVisibility(bool.booleanValue() ? 0 : 8);
                    holder.f292926o.setVisibility(bool.booleanValue() ? 8 : 0);
                }
            }
        }
    }
}
