package com.tencent.mm.plugin.game.ui;

/* loaded from: classes15.dex */
public class z5 extends android.widget.BaseAdapter {

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f141904m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f141905n;

    /* renamed from: o, reason: collision with root package name */
    public final int f141906o;

    /* renamed from: s, reason: collision with root package name */
    public java.util.ArrayList f141910s;

    /* renamed from: d, reason: collision with root package name */
    public boolean f141898d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f141899e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f141900f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f141901g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f141902h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f141903i = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f141907p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f141908q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f141909r = false;

    public z5(android.content.Context context, java.util.ArrayList arrayList) {
        this.f141904m = context;
        this.f141905n = arrayList;
        this.f141906o = context.getResources().getColor(com.tencent.mm.R.color.f479202sq);
    }

    public final void a(android.widget.TextView textView, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView.setVisibility(8);
            return;
        }
        java.util.ArrayList arrayList = this.f141910s;
        if (arrayList == null) {
            this.f141910s = new java.util.ArrayList();
        } else {
            arrayList.clear();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        com.tencent.mm.plugin.game.ui.y5 y5Var = new com.tencent.mm.plugin.game.ui.y5(this, null);
        for (int indexOf = sb6.indexOf("<em>"); indexOf >= 0; indexOf = sb6.indexOf("<em>")) {
            y5Var.f141887a = indexOf;
            sb6.delete(indexOf, indexOf + 4);
            int indexOf2 = sb6.indexOf("</em>");
            if (indexOf2 < 0) {
                break;
            }
            y5Var.f141888b = indexOf2;
            sb6.delete(indexOf2, indexOf2 + 5);
            this.f141910s.add(y5Var);
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(sb6.toString());
        java.util.Iterator it = this.f141910s.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.game.ui.y5 y5Var2 = (com.tencent.mm.plugin.game.ui.y5) it.next();
            if (y5Var2.f141887a < y5Var2.f141888b) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(this.f141906o), y5Var2.f141887a, y5Var2.f141888b, 33);
            }
        }
        textView.setText(spannableString);
        textView.setVisibility(0);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayList = this.f141905n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f141905n.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return ((com.tencent.mm.plugin.game.ui.w5) getItem(i17)).f141832k;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.game.ui.v5 v5Var;
        android.view.View view2;
        int i18;
        android.widget.TextView textView;
        com.tencent.mm.plugin.game.ui.w5 w5Var = (com.tencent.mm.plugin.game.ui.w5) getItem(i17);
        android.content.Context context = this.f141904m;
        if (view == null) {
            v5Var = new com.tencent.mm.plugin.game.ui.v5(null);
            int i19 = w5Var.f141832k;
            view2 = android.view.View.inflate(context, i19 != 0 ? i19 != 1 ? i19 != 2 ? i19 != 3 ? i19 != 5 ? i19 != 6 ? 0 : com.tencent.mm.R.layout.bho : com.tencent.mm.R.layout.bhn : com.tencent.mm.R.layout.bhq : com.tencent.mm.R.layout.bhs : com.tencent.mm.R.layout.bhl : com.tencent.mm.R.layout.bhr, null);
            v5Var.f141801a = view2.findViewById(com.tencent.mm.R.id.gmf);
            v5Var.f141802b = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.gmi);
            v5Var.f141803c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.gmk);
            v5Var.f141804d = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.gmd);
            v5Var.f141805e = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.gmg);
            v5Var.f141806f = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.gml);
            v5Var.f141807g = view2.findViewById(com.tencent.mm.R.id.gmh);
            v5Var.f141808h = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ne_);
            v5Var.f141809i = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.cmd);
            view2.setTag(v5Var);
            android.widget.TextView textView2 = v5Var.f141803c;
            if (textView2 != null && (textView = v5Var.f141805e) != null) {
                textView2.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.game.ui.u5(this, textView2, textView));
            }
        } else {
            v5Var = (com.tencent.mm.plugin.game.ui.v5) view.getTag();
            view2 = view;
        }
        int i27 = w5Var.f141832k;
        if (i27 == 0) {
            v5Var.f141805e.setText(w5Var.f141823b);
        } else if (i27 == 1) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(w5Var.f141825d)) {
                r53.v vVar = new r53.v();
                vVar.f392703a = false;
                vVar.f392704b = false;
                r53.y.a().e(v5Var.f141802b, w5Var.f141825d, vVar.a(), null);
            }
            a(v5Var.f141803c, w5Var.f141823b);
            a(v5Var.f141804d, w5Var.f141826e);
            a(v5Var.f141805e, w5Var.f141824c);
        } else if (i27 == 2) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(w5Var.f141825d)) {
                v5Var.f141802b.setVisibility(8);
            } else {
                r53.v vVar2 = new r53.v();
                vVar2.f392703a = false;
                vVar2.f392704b = false;
                vVar2.f392706d = true;
                r53.y.a().e(v5Var.f141802b, w5Var.f141825d, vVar2.a(), null);
                v5Var.f141802b.setVisibility(0);
            }
            a(v5Var.f141803c, w5Var.f141823b);
            a(v5Var.f141805e, w5Var.f141824c);
            if (com.tencent.mm.sdk.platformtools.t8.K0(w5Var.f141827f)) {
                v5Var.f141808h.setVisibility(8);
            } else {
                android.widget.TextView textView3 = v5Var.f141808h;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str = w5Var.f141827f;
                ((ke0.e) xVar).getClass();
                textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
                v5Var.f141808h.setVisibility(0);
            }
            long j17 = w5Var.f141828g;
            if (j17 > 0) {
                v5Var.f141809i.setText(r53.e.a(context, j17 * 1000));
                v5Var.f141809i.setVisibility(0);
            } else {
                v5Var.f141809i.setVisibility(8);
            }
        } else if (i27 == 3) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(w5Var.f141825d)) {
                r53.v vVar3 = new r53.v();
                vVar3.f392703a = false;
                vVar3.f392704b = false;
                r53.y.a().e(v5Var.f141802b, w5Var.f141825d, vVar3.a(), null);
            }
            a(v5Var.f141803c, w5Var.f141823b);
            a(v5Var.f141804d, w5Var.f141826e);
            a(v5Var.f141805e, w5Var.f141824c);
            android.widget.TextView textView4 = v5Var.f141806f;
            java.util.LinkedList linkedList = w5Var.f141829h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                textView4.setVisibility(8);
            } else {
                int size = linkedList.size();
                int i28 = 0;
                while (true) {
                    i18 = size - 1;
                    if (i28 >= i18) {
                        break;
                    }
                    sb6.append(((java.lang.String) linkedList.get(i28)) + "\n");
                    i28++;
                }
                sb6.append((java.lang.String) linkedList.get(i18));
                textView4.setVisibility(0);
                textView4.setText(sb6.toString());
            }
        } else if (i27 == 5) {
            v5Var.f141802b.setImageResource(com.tencent.mm.R.raw.search_more_button_icon);
            v5Var.f141803c.setText(w5Var.f141823b);
        } else if (i27 == 6) {
            v5Var.f141803c.setText(w5Var.f141823b);
        }
        int i29 = w5Var.f141832k;
        if (i29 != 0) {
            if (i29 == 1 || i29 == 2 || i29 == 3 || i29 == 5) {
                v5Var.f141801a.setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479912iq);
                v5Var.f141801a.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            }
        } else if (w5Var.f141833l) {
            android.view.View view3 = v5Var.f141807g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameSearchAdapter", "bindItemData", "(Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Item;Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Holder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/game/ui/GameSearchAdapter", "bindItemData", "(Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Item;Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Holder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = v5Var.f141807g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameSearchAdapter", "bindItemData", "(Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Item;Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Holder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/game/ui/GameSearchAdapter", "bindItemData", "(Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Item;Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Holder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 7;
    }
}
