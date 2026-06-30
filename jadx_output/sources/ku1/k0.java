package ku1;

/* loaded from: classes15.dex */
public class k0 implements tt1.k {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f312124a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.BaseAdapter f312125b;

    /* renamed from: c, reason: collision with root package name */
    public final int f312126c;

    /* renamed from: d, reason: collision with root package name */
    public final int f312127d;

    /* renamed from: e, reason: collision with root package name */
    public final int f312128e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f312129f = new java.util.LinkedList();

    public k0(android.content.Context context, android.widget.BaseAdapter baseAdapter) {
        this.f312124a = context;
        this.f312125b = baseAdapter;
        this.f312126c = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.j_);
        this.f312127d = this.f312124a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479884hx);
        this.f312128e = this.f312124a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480177qj);
        this.f312124a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480178qk);
    }

    @Override // tt1.k
    public android.view.View a(int i17, android.view.View view, android.view.ViewGroup viewGroup, tt1.j jVar) {
        ku1.j0 j0Var;
        android.view.View view2;
        android.widget.RelativeLayout relativeLayout;
        java.lang.String str;
        boolean z17;
        java.util.LinkedList linkedList;
        android.widget.TextView textView;
        if (view == null) {
            int itemViewType = this.f312125b.getItemViewType(i17);
            if (itemViewType != 0) {
                view2 = itemViewType != 1 ? itemViewType != 2 ? android.view.View.inflate(this.f312124a, com.tencent.mm.R.layout.f488333qf, null) : android.view.View.inflate(this.f312124a, com.tencent.mm.R.layout.f488338qk, null) : android.view.View.inflate(this.f312124a, com.tencent.mm.R.layout.f488333qf, null);
            } else {
                view2 = android.view.View.inflate(this.f312124a, com.tencent.mm.R.layout.f488335qh, null);
                if (jVar.g().equals("PRIVATE_TICKET_TITLE")) {
                    android.widget.TextView textView2 = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.bag);
                    if (textView2 != null) {
                        textView2.setText(this.f312124a.getString(com.tencent.mm.R.string.f490809aw1));
                    }
                } else if (jVar.g().equals("PRIVATE_INVOICE_TITLE") && (textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.bag)) != null) {
                    textView.setText(this.f312124a.getString(com.tencent.mm.R.string.ate));
                }
            }
            j0Var = new ku1.j0(this);
            if (jVar.g().equals("PRIVATE_TICKET_TITLE") || jVar.g().equals("PRIVATE_INVOICE_TITLE")) {
                j0Var.f312113h = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.bag);
            } else if (jVar.m0()) {
                j0Var.f312118m = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ban);
                j0Var.f312119n = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.baj);
                j0Var.f312120o = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.bal);
                j0Var.f312121p = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.bam);
            } else {
                j0Var.f312106a = (android.widget.RelativeLayout) view2.findViewById(com.tencent.mm.R.id.b99);
                j0Var.f312107b = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.b_w);
                j0Var.f312108c = view2.findViewById(com.tencent.mm.R.id.bcn);
                j0Var.f312109d = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.bcm);
                j0Var.f312110e = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.b8b);
                j0Var.f312111f = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f483577bb0);
                j0Var.f312112g = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f483578bb1);
                j0Var.f312115j = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.f483562b85);
                j0Var.f312116k = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.b87);
                j0Var.f312117l = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.b86);
                j0Var.f312114i = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.bbr);
            }
            view2.setTag(j0Var);
        } else {
            j0Var = (ku1.j0) view.getTag();
            if (j0Var.f312113h != null) {
                if (jVar.g().equals("PRIVATE_TICKET_TITLE")) {
                    j0Var.f312113h.setText(this.f312124a.getString(com.tencent.mm.R.string.f490809aw1));
                } else {
                    j0Var.f312113h.setText(this.f312124a.getString(com.tencent.mm.R.string.ate));
                }
            }
            view2 = view;
        }
        if (j0Var.f312111f != null) {
            j0Var.f312111f.setTextSize(0, this.f312124a.getResources().getDimension(com.tencent.mm.R.dimen.f479574q));
        }
        boolean c17 = jVar.c();
        int i18 = this.f312128e;
        if (c17) {
            if (jVar.g().equals("PRIVATE_TICKET_TITLE")) {
                j0Var.f312113h.setText(this.f312124a.getString(com.tencent.mm.R.string.f490809aw1));
            } else if (jVar.g().equals("PRIVATE_INVOICE_TITLE")) {
                j0Var.f312113h.setText(this.f312124a.getString(com.tencent.mm.R.string.ate));
            } else if (jVar.m0()) {
                java.util.LinkedList linkedList2 = jVar.s0().f388560s;
                j0Var.f312118m.setText(((r45.w50) linkedList2.get(0)).f388879e);
                j0Var.f312120o.setText(((r45.w50) linkedList2.get(1)).f388879e);
                java.util.LinkedList linkedList3 = jVar.i0().f385191q;
                j0Var.f312121p.setText(java.lang.String.format(this.f312124a.getString(com.tencent.mm.R.string.atm), ((r45.w50) linkedList3.get(0)).f388879e));
                if (linkedList3.size() >= 2) {
                    j0Var.f312119n.setText(((r45.w50) linkedList3.get(1)).f388879e);
                }
            } else {
                if (this.f312125b.getItem(i17) instanceof com.tencent.mm.plugin.card.model.CardInfo) {
                    com.tencent.mm.plugin.card.model.CardInfo cardInfo = (com.tencent.mm.plugin.card.model.CardInfo) this.f312125b.getItem(i17);
                    if (!cardInfo.field_card_id.equals("PRIVATE_TICKET_TITLE") && !cardInfo.field_card_id.equals("PRIVATE_INVOICE_TITLE")) {
                        int i19 = cardInfo.field_stickyIndex;
                        if (i19 % 10 != 0) {
                            if (i19 > 0) {
                                str = lu1.w.a(this.f312124a, i19, cardInfo);
                                z17 = true;
                            }
                            str = "";
                            z17 = false;
                        } else {
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(cardInfo.field_label_wording)) {
                                str = cardInfo.field_label_wording;
                                z17 = true;
                            }
                            str = "";
                            z17 = false;
                        }
                        if (z17) {
                            int i27 = 0;
                            while (true) {
                                int childCount = j0Var.f312114i.getChildCount();
                                linkedList = this.f312129f;
                                if (i27 >= childCount) {
                                    break;
                                }
                                linkedList.add((com.tencent.mm.plugin.card.widget.CardTagTextView) j0Var.f312114i.getChildAt(i27));
                                i27++;
                            }
                            j0Var.f312114i.removeAllViews();
                            j0Var.f312114i.setVisibility(0);
                            com.tencent.mm.plugin.card.widget.CardTagTextView cardTagTextView = linkedList.size() == 0 ? new com.tencent.mm.plugin.card.widget.CardTagTextView(this.f312124a) : (com.tencent.mm.plugin.card.widget.CardTagTextView) linkedList.removeFirst();
                            int i28 = this.f312127d;
                            int i29 = this.f312126c;
                            cardTagTextView.setPadding(i28, i29, i28, i29);
                            cardTagTextView.setGravity(17);
                            cardTagTextView.setMinWidth(this.f312124a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480183qp));
                            cardTagTextView.setMinHeight(this.f312124a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480182qo));
                            if (cardInfo.o()) {
                                cardTagTextView.setTextColor(i65.a.d(this.f312124a, com.tencent.mm.R.color.f479549ab0));
                                cardTagTextView.setFillColor(i65.a.d(this.f312124a, com.tencent.mm.R.color.f478792hc));
                            } else {
                                cardTagTextView.setTextColor(i65.a.d(this.f312124a, com.tencent.mm.R.color.f479308vo));
                                cardTagTextView.setFillColor(0);
                            }
                            cardTagTextView.setText(str);
                            cardTagTextView.setTextSize(1, 10.0f);
                            j0Var.f312114i.addView(cardTagTextView);
                        } else {
                            j0Var.f312114i.setVisibility(8);
                        }
                    }
                }
                j0Var.f312106a.setVisibility(0);
                j0Var.f312107b.setVisibility(0);
                j0Var.f312111f.setVisibility(0);
                j0Var.f312112g.setVisibility(8);
                j0Var.f312110e.setVisibility(0);
                j0Var.f312110e.setText(jVar.s0().f388552m);
                j0Var.f312111f.setText(jVar.s0().f388553n);
                if (jVar.X()) {
                    android.view.View view3 = j0Var.f312108c;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardTicketViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/ui/view/CardTicketViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/view/CardTicketViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/ui/view/CardTicketViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    j0Var.f312107b.setVisibility(4);
                    android.widget.ImageView imageView = j0Var.f312109d;
                    if (android.text.TextUtils.isEmpty(jVar.s0().C)) {
                        lu1.g0.d(this.f312124a, imageView, com.tencent.mm.R.drawable.bz6, lu1.a0.d(jVar.s0().f388555p));
                    } else {
                        lu1.g0.c(this.f312124a, imageView, jVar.s0().C, this.f312124a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480185qr), com.tencent.mm.R.drawable.bz6, false, lu1.a0.d(jVar.s0().f388555p));
                    }
                } else {
                    android.view.View view4 = j0Var.f312108c;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardTicketViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/ui/view/CardTicketViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/card/ui/view/CardTicketViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/ui/view/CardTicketViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    j0Var.f312107b.setVisibility(0);
                    lu1.g0.b(j0Var.f312107b, jVar.s0().f388546e, this.f312124a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480185qr), com.tencent.mm.R.drawable.cbt, true);
                }
                if (jVar.o()) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(jVar.i0().A)) {
                        j0Var.f312106a.setBackgroundDrawable(lu1.a0.n(this.f312124a, lu1.a0.d(jVar.s0().f388555p), i18));
                        j0Var.f312115j.setVisibility(8);
                        j0Var.f312116k.setVisibility(8);
                        j0Var.f312117l.setVisibility(0);
                    } else {
                        j0Var.f312106a.setBackgroundDrawable(this.f312124a.getResources().getDrawable(com.tencent.mm.R.drawable.f481110l0));
                        j0Var.f312115j.setVisibility(0);
                        j0Var.f312116k.setVisibility(0);
                        android.widget.ImageView imageView2 = j0Var.f312115j;
                        java.lang.String str2 = jVar.i0().A;
                        o11.f fVar = new o11.f();
                        fVar.f342083g = lp0.b.D();
                        fVar.f342082f = xt1.q.m(str2);
                        fVar.f342078b = true;
                        fVar.f342098v = true;
                        fVar.f342077a = true;
                        fVar.f342091o = com.tencent.mm.R.drawable.f481110l0;
                        fVar.f342087k = i65.a.h(this.f312124a, com.tencent.mm.R.dimen.f480178qk);
                        fVar.f342086j = i65.a.B(this.f312124a);
                        n11.a.b().h(str2, imageView2, fVar.a());
                        imageView2.setImageMatrix(new android.graphics.Matrix());
                        j0Var.f312117l.setVisibility(8);
                    }
                    j0Var.f312110e.setTextColor(this.f312124a.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
                    j0Var.f312111f.setTextColor(this.f312124a.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
                } else {
                    j0Var.f312117l.setVisibility(8);
                    j0Var.f312115j.setVisibility(8);
                    j0Var.f312116k.setVisibility(8);
                    j0Var.f312106a.setBackgroundDrawable(this.f312124a.getResources().getDrawable(com.tencent.mm.R.drawable.f481110l0));
                    j0Var.f312111f.setTextColor(this.f312124a.getResources().getColor(com.tencent.mm.R.color.f478781h1));
                    j0Var.f312110e.setTextColor(this.f312124a.getResources().getColor(com.tencent.mm.R.color.f478781h1));
                }
            }
        } else if (!jVar.g().equals("PRIVATE_TICKET_TITLE") && !jVar.g().equals("PRIVATE_INVOICE_TITLE") && !jVar.m0()) {
            j0Var.f312107b.setVisibility(8);
            j0Var.f312111f.setVisibility(8);
            j0Var.f312110e.setVisibility(8);
            j0Var.f312114i.setVisibility(8);
            j0Var.f312112g.setVisibility(0);
            android.content.Context context = this.f312124a;
            j0Var.f312106a.setBackgroundDrawable(lu1.a0.n(context, context.getResources().getColor(com.tencent.mm.R.color.f478791hb), i18));
            j0Var.f312112g.setText(this.f312124a.getResources().getString(com.tencent.mm.R.string.auh));
        }
        if (!jVar.g().equals("PRIVATE_TICKET_TITLE") && !jVar.g().equals("PRIVATE_INVOICE_TITLE") && !jVar.m0()) {
            int i37 = jVar.s0().f388550i;
            if (i17 != this.f312125b.getCount() - 1 || (relativeLayout = j0Var.f312106a) == null) {
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) j0Var.f312106a.getLayoutParams();
                if (layoutParams.bottomMargin != 0) {
                    layoutParams.bottomMargin = 0;
                    j0Var.f312106a.setLayoutParams(layoutParams);
                }
            } else {
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
                if (layoutParams2.bottomMargin != this.f312124a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479877hq)) {
                    layoutParams2.bottomMargin = this.f312124a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479877hq);
                    j0Var.f312106a.setLayoutParams(layoutParams2);
                }
            }
        }
        return view2;
    }

    @Override // tt1.k
    public void release() {
        this.f312124a = null;
        this.f312125b = null;
        java.util.LinkedList linkedList = this.f312129f;
        if (linkedList != null) {
            linkedList.clear();
        }
    }
}
