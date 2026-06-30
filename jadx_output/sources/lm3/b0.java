package lm3;

/* loaded from: classes10.dex */
public final class b0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f319470e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.uic.m8 f319471f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f319472g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319473h;

    public b0(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f319470e = activity;
        this.f319471f = new com.tencent.mm.plugin.mv.ui.uic.m8();
        this.f319472g = new lm3.g(this);
    }

    public static final void n(lm3.b0 b0Var, in5.s0 s0Var, lm3.e eVar, int i17) {
        androidx.appcompat.app.AppCompatActivity activity = b0Var.f319470e;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var = (com.tencent.mm.plugin.mv.ui.uic.n0) a17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("likeMvClick ");
        sb6.append(eVar.f319482d.f264123c);
        sb6.append(' ');
        fm3.u uVar = eVar.f319482d;
        sb6.append(uVar.f264124d);
        sb6.append(' ');
        sb6.append(uVar.f264136p);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvItemConvert", sb6.toString());
        int i18 = uVar.f264136p;
        fm3.j0 j0Var = fm3.j0.f264078a;
        if (i18 == 1) {
            boolean z17 = !uVar.f264134n;
            uVar.f264134n = z17;
            if (z17) {
                uVar.f264131k++;
            } else {
                uVar.f264131k--;
            }
            b0Var.s(s0Var, eVar);
            java.lang.Long l17 = uVar.f264123c;
            java.lang.String str = uVar.f264124d;
            if (l17 == null || str == null) {
                return;
            }
            long longValue = l17.longValue();
            j0Var.h(b0Var.f319470e, n0Var.f151310i, uVar, uVar.f264134n ? 1 : 2, i17);
            gm0.j1.d().g(new hm3.h(longValue, str, uVar.f264134n));
            return;
        }
        if (i18 == 4) {
            boolean z18 = !uVar.f264134n;
            uVar.f264134n = z18;
            if (z18) {
                uVar.f264131k++;
            } else {
                uVar.f264131k--;
            }
            b0Var.s(s0Var, eVar);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = uVar.f264140t;
            java.lang.Long valueOf = finderObject != null ? java.lang.Long.valueOf(finderObject.getId()) : null;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = uVar.f264140t;
            java.lang.String objectNonceId = finderObject2 != null ? finderObject2.getObjectNonceId() : null;
            if (valueOf == null || objectNonceId == null) {
                return;
            }
            gm0.j1.d().g(new hm3.h(valueOf.longValue(), objectNonceId, uVar.f264134n));
            j0Var.h(b0Var.f319470e, n0Var.f151310i, uVar, uVar.f264134n ? 1 : 2, i17);
        }
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489322c51;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x095d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0a90  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0b03  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0c30  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0c6d  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0c7d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0c87  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0703  */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int, boolean] */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r47, in5.c r48, int r49, int r50, boolean r51, java.util.List r52) {
        /*
            Method dump skipped, instructions count: 3217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lm3.b0.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        ((com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar) holder.itemView.findViewById(com.tencent.mm.R.id.j8z)).setOnSeekBarChange(new lm3.z(this, holder));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) holder.itemView.findViewById(com.tencent.mm.R.id.j7o);
        if (recyclerView2 != null) {
            android.content.Context context = holder.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            recyclerView2.setLayoutManager(new com.tencent.mm.plugin.mv.ui.adapter.MusicLyricLayoutManager(context, 0, false, 6, null));
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) (recyclerView2 != null ? recyclerView2.getLayoutParams() : null);
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.topMargin = (int) ((this.f319470e.getResources().getDisplayMetrics().heightPixels * 0.37f) - i65.a.b(holder.itemView.getContext(), 15));
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public final java.lang.String o(int i17) {
        return ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Zi(i17);
    }

    public final void p(in5.s0 holder, lm3.e item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        androidx.appcompat.app.AppCompatActivity activity = this.f319470e;
        kotlin.jvm.internal.o.g(activity, "activity");
        if (((com.tencent.mm.plugin.mv.ui.uic.n0) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.n0.class)).f151318t) {
            android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.im7);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = holder.itemView.findViewById(com.tencent.mm.R.id.f485682im3);
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int i17 = item.f319482d.f264136p;
        if (i17 == 1) {
            android.view.View findViewById3 = holder.itemView.findViewById(com.tencent.mm.R.id.im7);
            if (findViewById3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById4 = holder.itemView.findViewById(com.tencent.mm.R.id.f485682im3);
            if (findViewById4 == null) {
                return;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 == 2) {
            android.view.View findViewById5 = holder.itemView.findViewById(com.tencent.mm.R.id.im7);
            if (findViewById5 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById5, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById6 = holder.itemView.findViewById(com.tencent.mm.R.id.f485682im3);
            if (findViewById6 == null) {
                return;
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 != 3) {
            if (i17 != 4) {
                return;
            }
            android.view.View findViewById7 = holder.itemView.findViewById(com.tencent.mm.R.id.im7);
            if (findViewById7 != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(findViewById7, arrayList7.toArray(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(findViewById7, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById8 = holder.itemView.findViewById(com.tencent.mm.R.id.f485682im3);
            if (findViewById8 == null) {
                return;
            }
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(findViewById8, arrayList8.toArray(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(findViewById8, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById9 = holder.itemView.findViewById(com.tencent.mm.R.id.im7);
        if (findViewById9 != null) {
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(findViewById9, arrayList9.toArray(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(findViewById9, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById10 = holder.itemView.findViewById(com.tencent.mm.R.id.f485682im3);
        if (findViewById10 != null) {
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal10 = zj0.c.f473285a;
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(findViewById10, arrayList10.toArray(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(findViewById10, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById11 = holder.itemView.findViewById(com.tencent.mm.R.id.f485682im3);
        if (findViewById11 != null) {
            findViewById11.setOnClickListener(new lm3.p(item));
        }
    }

    public final void q(in5.s0 s0Var, lm3.e eVar) {
        android.widget.TextView textView = (android.widget.TextView) s0Var.itemView.findViewById(com.tencent.mm.R.id.c6s);
        int i17 = eVar.f319482d.f264133m;
        if (i17 > 0) {
            textView.setText(o(i17));
        } else {
            textView.setText(this.f319470e.getResources().getString(com.tencent.mm.R.string.cpb));
        }
    }

    public final void r(in5.s0 holder, lm3.e item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.id.gbk);
        java.util.Set D0 = kz5.z.D0(new java.lang.Integer[]{java.lang.Integer.valueOf(com.tencent.mm.R.id.ndq), java.lang.Integer.valueOf(com.tencent.mm.R.id.bzk), valueOf, java.lang.Integer.valueOf(com.tencent.mm.R.id.gcd)});
        androidx.appcompat.app.AppCompatActivity activity = this.f319470e;
        kotlin.jvm.internal.o.g(activity, "activity");
        boolean z17 = ((com.tencent.mm.plugin.mv.ui.uic.n0) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.n0.class)).f151318t;
        com.tencent.mm.plugin.mv.ui.uic.m8 m8Var = this.f319471f;
        if (z17) {
            m8Var.a(holder.itemView);
            m8Var.b(D0);
            m8Var.f151303b.clear();
        } else {
            kz5.q1.h(D0, valueOf);
            m8Var.a(holder.itemView);
            m8Var.c(D0);
            m8Var.f151303b.clear();
        }
    }

    public final void s(in5.s0 s0Var, lm3.e eVar) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.itemView.findViewById(com.tencent.mm.R.id.h6i);
        if (eVar.f319482d.f264134n) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_like);
            weImageView.setIconColor(s0Var.itemView.getResources().getColor(com.tencent.mm.R.color.f478532ac));
        } else {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_like);
            weImageView.setIconColor(s0Var.itemView.getResources().getColor(com.tencent.mm.R.color.f478553an));
        }
        android.widget.TextView textView = (android.widget.TextView) s0Var.itemView.findViewById(com.tencent.mm.R.id.i1g);
        fm3.u uVar = eVar.f319482d;
        int i17 = uVar.f264131k;
        if (i17 > 0) {
            textView.setText(o(i17));
        } else {
            textView.setText(s0Var.itemView.getResources().getString(com.tencent.mm.R.string.h3y));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvItemConvert", "updateLikeStatus isLike:" + uVar.f264134n + " likeCount:" + uVar.f264131k);
    }
}
