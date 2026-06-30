package gu1;

/* loaded from: classes15.dex */
public class u implements tt1.k {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f275929a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.BaseAdapter f275930b;

    /* renamed from: c, reason: collision with root package name */
    public long f275931c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f275932d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f275933e;

    /* renamed from: f, reason: collision with root package name */
    public final int f275934f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f275935g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f275936h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f275937i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.LinkedList f275938j;

    public u(android.content.Context context, android.widget.BaseAdapter baseAdapter) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f275935g = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f275936h = arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        this.f275937i = arrayList3;
        this.f275938j = new java.util.LinkedList();
        this.f275929a = context;
        this.f275930b = baseAdapter;
        this.f275933e = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479898ib);
        this.f275934f = this.f275929a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479884hx);
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
    }

    @Override // tt1.k
    public android.view.View a(int i17, android.view.View view, android.view.ViewGroup viewGroup, tt1.j jVar) {
        gu1.t tVar;
        android.view.View view2;
        android.widget.RelativeLayout relativeLayout;
        java.util.LinkedList linkedList;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (view == null) {
            view2 = android.view.View.inflate(this.f275929a, com.tencent.mm.R.layout.f488357r3, null);
            tVar = new gu1.t(this);
            tVar.f275917a = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.bc9);
            tVar.f275918b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f483575ba4);
            tVar.f275919c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ba_);
            tVar.f275920d = (android.widget.RelativeLayout) view2.findViewById(com.tencent.mm.R.id.b99);
            tVar.f275921e = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.b_w);
            tVar.f275922f = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.b8b);
            tVar.f275923g = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f483577bb0);
            tVar.f275927k = view2.findViewById(com.tencent.mm.R.id.bad);
            tVar.f275924h = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.nrk);
            tVar.f275925i = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.b7s);
            tVar.f275926j = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f483578bb1);
            tVar.f275928l = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.b9c);
            tVar.f275924h.setEllipsize(android.text.TextUtils.TruncateAt.MIDDLE);
            view2.setTag(tVar);
        } else {
            tVar = (gu1.t) view.getTag();
            view2 = view;
        }
        tt1.j jVar2 = (tt1.j) this.f275930b.getItem(i17);
        int J2 = jVar2.J();
        if (eu1.f.a(jVar2.J()) && (i17 != 0 ? J2 != ((tt1.j) this.f275930b.getItem(i17 + (-1))).J() : !android.text.TextUtils.isEmpty(jVar2.C(J2)))) {
            tVar.f275918b.setVisibility(0);
            tVar.f275918b.setText(jVar2.C(J2));
            if (android.text.TextUtils.isEmpty(jVar2.x(J2))) {
                tVar.f275919c.setVisibility(8);
            } else {
                tVar.f275919c.setVisibility(0);
                tVar.f275919c.setText(jVar2.x(J2));
            }
        } else {
            tVar.f275918b.setVisibility(8);
            tVar.f275919c.setVisibility(8);
            tVar.f275918b.setText("");
        }
        if (jVar.c()) {
            tVar.f275921e.setVisibility(0);
            tVar.f275922f.setVisibility(0);
            tVar.f275917a.setVisibility(0);
            tVar.f275923g.setVisibility(0);
            tVar.f275928l.setVisibility(0);
            android.view.View view3 = tVar.f275927k;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            tVar.f275924h.setVisibility(0);
            tVar.f275925i.setVisibility(0);
            tVar.f275926j.setVisibility(8);
            tVar.f275922f.setText(jVar.s0().f388552m);
            if (!jVar.X()) {
                tVar.f275923g.setText(jVar.s0().f388553n);
            } else if (jVar.s0().f388560s != null && jVar.s0().f388560s.size() == 1) {
                tVar.f275923g.setText(((r45.w50) jVar.s0().f388560s.get(0)).f388878d);
            } else if (jVar.s0().f388560s != null && jVar.s0().f388560s.size() == 2) {
                tVar.f275923g.setText(((r45.w50) jVar.s0().f388560s.get(0)).f388878d + "-" + ((r45.w50) jVar.s0().f388560s.get(1)).f388878d);
            }
            lu1.g0.b(tVar.f275921e, jVar.s0().f388546e, this.f275929a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480185qr), com.tencent.mm.R.drawable.cbt, true);
            tVar.f275922f.setTextColor(this.f275929a.getResources().getColor(com.tencent.mm.R.color.f478781h1));
            java.lang.String f17 = jVar.f();
            java.util.Map map = (java.util.Map) xt1.t0.Di().a("key_share_card_annoucement_map");
            java.lang.String str = map == null ? "" : (java.lang.String) map.get(f17);
            if (android.text.TextUtils.isEmpty(str)) {
                tVar.f275925i.setText("");
            } else {
                tVar.f275925i.setText(str);
            }
            java.lang.String f18 = jVar.f();
            java.util.Map map2 = (java.util.Map) xt1.t0.Di().a("key_share_card_username_map");
            java.lang.String str2 = map2 == null ? "" : (java.lang.String) map2.get(f18);
            boolean a17 = eu1.f.a(jVar.J());
            if (!android.text.TextUtils.isEmpty(str2) && a17) {
                android.widget.TextView textView = tVar.f275924h;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = this.f275929a;
                textView.setText(((ke0.e) xVar).bj(context, str2, context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479929j9)));
            } else if (android.text.TextUtils.isEmpty(jVar.a())) {
                tVar.f275924h.setText("");
            } else {
                java.lang.String p17 = lu1.a0.p(jVar.a());
                if (android.text.TextUtils.isEmpty(p17)) {
                    tVar.f275924h.setText("");
                } else {
                    java.lang.String string = this.f275929a.getResources().getString(com.tencent.mm.R.string.f490806av4, p17);
                    android.widget.TextView textView2 = tVar.f275924h;
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    android.content.Context context2 = this.f275929a;
                    textView2.setText(((ke0.e) xVar2).bj(context2, string, context2.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479929j9)));
                }
            }
            int d17 = eu1.f.d(jVar.f());
            if (d17 <= 1 || !a17) {
                tVar.f275928l.setVisibility(8);
            } else {
                tVar.f275928l.setText("X" + d17);
                tVar.f275928l.setVisibility(0);
            }
            if ((jVar.s0().N == null || com.tencent.mm.sdk.platformtools.t8.L0(jVar.s0().N.f378139e)) && !eu1.f.m(jVar.f())) {
                tVar.f275917a.setVisibility(8);
            } else {
                tVar.f275917a.setVisibility(0);
                int i18 = 0;
                while (true) {
                    int childCount = tVar.f275917a.getChildCount();
                    linkedList = this.f275938j;
                    if (i18 >= childCount) {
                        break;
                    }
                    linkedList.add((com.tencent.mm.plugin.card.widget.CardTagTextView) tVar.f275917a.getChildAt(i18));
                    i18++;
                }
                tVar.f275917a.removeAllViews();
                boolean m17 = eu1.f.m(jVar.f());
                int i19 = this.f275933e;
                int i27 = this.f275934f;
                if (m17) {
                    com.tencent.mm.plugin.card.widget.CardTagTextView cardTagTextView = linkedList.size() == 0 ? new com.tencent.mm.plugin.card.widget.CardTagTextView(this.f275929a) : (com.tencent.mm.plugin.card.widget.CardTagTextView) linkedList.removeFirst();
                    cardTagTextView.setPadding(i27, i19, i27, i19);
                    cardTagTextView.setTextColor(this.f275929a.getResources().getColor(com.tencent.mm.R.color.a2y));
                    cardTagTextView.setText(this.f275929a.getString(com.tencent.mm.R.string.ave));
                    cardTagTextView.setTextSize(12.0f);
                    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                    layoutParams.rightMargin = this.f275929a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479877hq);
                    tVar.f275917a.addView(cardTagTextView, layoutParams);
                }
                if (jVar.s0().N != null && !com.tencent.mm.sdk.platformtools.t8.L0(jVar.s0().N.f378139e)) {
                    java.util.Iterator it = jVar.s0().N.f378139e.iterator();
                    while (it.hasNext()) {
                        r45.bk6 bk6Var = (r45.bk6) it.next();
                        com.tencent.mm.plugin.card.widget.CardTagTextView cardTagTextView2 = linkedList.size() == 0 ? new com.tencent.mm.plugin.card.widget.CardTagTextView(this.f275929a) : (com.tencent.mm.plugin.card.widget.CardTagTextView) linkedList.removeFirst();
                        cardTagTextView2.setPadding(i27, i19, i27, i19);
                        cardTagTextView2.setTextColor(lu1.a0.d(bk6Var.f370828e));
                        cardTagTextView2.setText(bk6Var.f370827d);
                        cardTagTextView2.setTextSize(12.0f);
                        tVar.f275917a.addView(cardTagTextView2);
                    }
                }
            }
        } else {
            tVar.f275921e.setVisibility(8);
            tVar.f275922f.setVisibility(8);
            tVar.f275917a.setVisibility(8);
            tVar.f275923g.setVisibility(8);
            tVar.f275928l.setVisibility(8);
            android.view.View view4 = tVar.f275927k;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            tVar.f275924h.setVisibility(8);
            tVar.f275925i.setVisibility(8);
            tVar.f275926j.setVisibility(0);
            tVar.f275926j.setText(this.f275929a.getResources().getString(com.tencent.mm.R.string.auh));
        }
        if (i17 != this.f275930b.getCount() - 1 || (relativeLayout = tVar.f275920d) == null) {
            android.widget.RelativeLayout relativeLayout2 = tVar.f275920d;
            if (relativeLayout2 != null) {
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) relativeLayout2.getLayoutParams();
                if (layoutParams2.bottomMargin != 0) {
                    layoutParams2.bottomMargin = 0;
                    tVar.f275920d.setLayoutParams(layoutParams2);
                }
            }
        } else {
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
            if (layoutParams3.bottomMargin != this.f275929a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479877hq)) {
                layoutParams3.bottomMargin = this.f275929a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479877hq);
                tVar.f275920d.setLayoutParams(layoutParams3);
            }
        }
        this.f275931c += java.lang.System.currentTimeMillis() - currentTimeMillis;
        this.f275932d++;
        java.util.ArrayList arrayList3 = this.f275936h;
        if (!arrayList3.contains(jVar.g())) {
            arrayList3.add(jVar.g());
            this.f275937i.add(jVar.f());
            this.f275935g.add(java.lang.Integer.valueOf(i17));
        }
        return view2;
    }

    @Override // tt1.k
    public void release() {
        this.f275929a = null;
        this.f275930b = null;
        if (this.f275932d > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
            iDKey.SetID(281);
            iDKey.SetKey(5);
            iDKey.SetValue(1L);
            com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
            iDKey2.SetID(281);
            iDKey2.SetKey(6);
            iDKey2.SetValue((int) (this.f275931c / this.f275932d));
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, true, false);
        }
        java.util.ArrayList arrayList2 = this.f275935g;
        int size = arrayList2.size();
        java.util.ArrayList arrayList3 = this.f275936h;
        int size2 = arrayList3.size();
        java.util.ArrayList arrayList4 = this.f275937i;
        if (size == size2 && arrayList3.size() == arrayList4.size() && arrayList2.size() > 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13220, arrayList4.get(i17), arrayList3.get(i17), arrayList2.get(i17), java.lang.Long.valueOf(currentTimeMillis));
            }
        }
        arrayList2.clear();
        arrayList3.clear();
        arrayList4.clear();
        java.util.LinkedList linkedList = this.f275938j;
        if (linkedList != null) {
            linkedList.clear();
        }
    }
}
