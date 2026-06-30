package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes9.dex */
public final class l5 extends android.widget.BaseAdapter {

    /* renamed from: h, reason: collision with root package name */
    public static final o11.g f187381h;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f187382d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f187383e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.widget.z5 f187384f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f187385g;

    static {
        o11.f fVar = new o11.f();
        fVar.f342093q = com.tencent.mm.R.color.f478816i1;
        fVar.f342078b = true;
        fVar.f342086j = 120;
        fVar.f342087k = 120;
        fVar.A = new r35.n0(0);
        fVar.B = new r35.w(0);
        fVar.f342096t = true;
        fVar.f342097u = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 3);
        f187381h = fVar.a();
    }

    public l5(android.content.Context context, java.util.LinkedList list, com.tencent.mm.plugin.webview.ui.tools.widget.z5 controller, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(list, "list");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f187382d = context;
        this.f187383e = list;
        this.f187384f = controller;
        this.f187385g = new java.util.ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.tencent.mm.plugin.webview.ui.tools.widget.c5 r12, r45.ck r13, r45.q60 r14, boolean r15) {
        /*
            r11 = this;
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.String r0 = "info"
            kotlin.jvm.internal.o.g(r13, r0)
            r0 = 0
            if (r15 == 0) goto L14
            if (r14 == 0) goto L12
            int r1 = r14.f383708n
            goto L16
        L12:
            r1 = r0
            goto L1a
        L14:
            int r1 = r13.f371607n
        L16:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L1a:
            if (r15 == 0) goto L23
            if (r14 == 0) goto L21
            int r2 = r14.f383706i
            goto L25
        L21:
            r2 = r0
            goto L29
        L23:
            int r2 = r13.f371608o
        L25:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L29:
            if (r15 == 0) goto L32
            if (r14 == 0) goto L30
            int r3 = r14.f383707m
            goto L34
        L30:
            r3 = r0
            goto L38
        L32:
            int r3 = r13.f371609p
        L34:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L38:
            android.widget.ImageView r4 = r12.f187131f
            r4.setOnClickListener(r0)
            r0 = 0
            r5 = 8
            android.widget.TextView r6 = r12.f187133h
            android.widget.TextView r7 = r12.f187127b
            if (r1 != 0) goto L47
            goto L57
        L47:
            int r1 = r1.intValue()
            if (r1 != 0) goto L57
            r6.setVisibility(r0)
            r4.setVisibility(r5)
            r7.setVisibility(r5)
            goto L98
        L57:
            r6.setVisibility(r5)
            r4.setVisibility(r0)
            r7.setVisibility(r5)
            if (r2 == 0) goto L74
            int r1 = r2.intValue()
            if (r1 <= 0) goto L69
            goto L6a
        L69:
            r0 = r5
        L6a:
            r7.setVisibility(r0)
            java.lang.String r0 = r2.toString()
            r7.setText(r0)
        L74:
            if (r3 != 0) goto L77
            goto L84
        L77:
            int r0 = r3.intValue()
            if (r0 != 0) goto L84
            r0 = 2131689665(0x7f0f00c1, float:1.9008352E38)
            r4.setImageResource(r0)
            goto L8a
        L84:
            r0 = 2131689666(0x7f0f00c2, float:1.9008354E38)
            r4.setImageResource(r0)
        L8a:
            com.tencent.mm.plugin.webview.ui.tools.widget.f5 r0 = new com.tencent.mm.plugin.webview.ui.tools.widget.f5
            r5 = r0
            r6 = r11
            r7 = r15
            r8 = r14
            r9 = r13
            r10 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r4.setOnClickListener(r0)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.widget.l5.a(com.tencent.mm.plugin.webview.ui.tools.widget.c5, r45.ck, r45.q60, boolean):void");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f187383e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r45.ck) kz5.n0.a0(this.f187383e, i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.webview.ui.tools.widget.e5 e5Var;
        android.view.View view2;
        java.util.ArrayList arrayList;
        android.widget.LinearLayout linearLayout;
        java.util.LinkedList linkedList;
        android.view.View inflate;
        kotlin.jvm.internal.o.g(viewGroup, "viewGroup");
        int i18 = 0;
        if (view == null) {
            view2 = android.view.LayoutInflater.from(this.f187382d).inflate(com.tencent.mm.R.layout.c2j, (android.view.ViewGroup) null, false);
            e5Var = new com.tencent.mm.plugin.webview.ui.tools.widget.e5(this, view2);
            view2.setTag(e5Var);
        } else {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.widget.MPWriteCommentLayout.MPMyCommentItemAdapter.BizCommentViewHolder");
            e5Var = (com.tencent.mm.plugin.webview.ui.tools.widget.e5) tag;
            view2 = view;
        }
        r45.ck ckVar = (r45.ck) kz5.n0.a0(this.f187383e, i17);
        if (ckVar != null) {
            n11.a.b().h(ckVar.f371604h, e5Var.f187193a, f187381h);
            com.tencent.mm.plugin.webview.ui.tools.widget.l5 l5Var = e5Var.f187199g;
            l5Var.getClass();
            com.tencent.mm.plugin.webview.ui.tools.widget.c5 itemView = e5Var.f187196d;
            kotlin.jvm.internal.o.g(itemView, "itemView");
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = ckVar.f371603g;
            android.widget.TextView textView = itemView.f187126a;
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            android.content.Context context = l5Var.f187382d;
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = ckVar.f371605i;
            com.tencent.neattextview.textview.view.NeatTextView neatTextView = itemView.f187128c;
            float textSize2 = neatTextView.getTextSize();
            ((ke0.e) xVar2).getClass();
            neatTextView.b(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str2, textSize2));
            int color = context.getResources().getColor(com.tencent.mm.R.color.f478524a5);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = itemView.f187129d;
            weImageView.setIconColor(color);
            weImageView.setVisibility(0);
            itemView.f187130e.setVisibility(0);
            weImageView.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.h5(l5Var, ckVar));
            l5Var.a(itemView, ckVar, null, false);
            itemView.f187134i.setVisibility(8);
            itemView.f187135j.setVisibility(4);
            android.widget.TextView textView2 = e5Var.f187197e;
            textView2.setVisibility(8);
            int i19 = com.tencent.mm.plugin.webview.ui.tools.widget.z5.f187623x1;
            com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var = l5Var.f187384f;
            if (!z5Var.f187625l1) {
                z5Var.f187627p1 = true;
                z5Var.f187625l1 = true;
            }
            if (z5Var.f187627p1) {
                textView2.setVisibility(0);
                textView2.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.d5(l5Var, ckVar));
                java.util.ArrayList arrayList2 = e5Var.f187198f;
                java.util.Iterator it = arrayList2.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    arrayList = l5Var.f187385g;
                    linearLayout = e5Var.f187194b;
                    if (!hasNext) {
                        break;
                    }
                    android.view.View view3 = (android.view.View) it.next();
                    if (view3 != null) {
                        linearLayout.removeView(view3);
                        arrayList.add(view3);
                    }
                }
                arrayList2.clear();
                r45.r60 r60Var = ckVar.f371610q;
                if (r60Var != null && (linkedList = r60Var.f384569d) != null && linkedList.size() > 0) {
                    java.util.LinkedList linkedList2 = ckVar.f371610q.f384569d;
                    kotlin.jvm.internal.o.d(linkedList2);
                    java.util.Iterator it6 = linkedList2.iterator();
                    int i27 = 0;
                    while (it6.hasNext()) {
                        java.lang.Object next = it6.next();
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.q60 q60Var = (r45.q60) next;
                        if (arrayList.size() > 0) {
                            java.lang.Object remove = arrayList.remove(i18);
                            kotlin.jvm.internal.o.f(remove, "removeAt(...)");
                            inflate = (android.view.View) remove;
                        } else {
                            inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.c2i, null);
                            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
                        }
                        arrayList2.add(inflate);
                        linearLayout.addView(inflate);
                        kotlin.jvm.internal.o.d(q60Var);
                        com.tencent.mm.plugin.webview.ui.tools.widget.c5 c5Var = new com.tencent.mm.plugin.webview.ui.tools.widget.c5(l5Var, inflate);
                        com.tencent.mm.plugin.webview.ui.tools.widget.k5 k5Var = new com.tencent.mm.plugin.webview.ui.tools.widget.k5(c5Var, l5Var, ckVar);
                        android.widget.LinearLayout linearLayout2 = linearLayout;
                        java.util.ArrayList arrayList3 = arrayList2;
                        boolean b17 = kotlin.jvm.internal.o.b(ckVar.f371602f, q60Var.f383702e);
                        android.widget.ImageView imageView = c5Var.f187130e;
                        java.util.ArrayList arrayList4 = arrayList;
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = c5Var.f187129d;
                        java.util.Iterator it7 = it6;
                        com.tencent.neattextview.textview.view.NeatTextView neatTextView2 = c5Var.f187128c;
                        android.view.View view4 = view2;
                        android.widget.TextView textView3 = c5Var.f187126a;
                        if (b17) {
                            if (!((java.lang.Boolean) k5Var.invoke(java.lang.Integer.valueOf(q60Var.f383709o))).booleanValue()) {
                                le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                                java.lang.String str3 = ckVar.f371603g;
                                float textSize3 = textView3.getTextSize();
                                ((ke0.e) xVar3).getClass();
                                textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str3, textSize3));
                                le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
                                java.lang.String str4 = q60Var.f383701d;
                                float textSize4 = neatTextView2.getTextSize();
                                ((ke0.e) xVar4).getClass();
                                neatTextView2.b(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str4, textSize4));
                                weImageView2.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478524a5));
                                weImageView2.setVisibility(0);
                                imageView.setVisibility(0);
                                l5Var.a(c5Var, ckVar, q60Var, true);
                                weImageView2.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.j5(l5Var, ckVar, q60Var));
                            }
                        } else if (!((java.lang.Boolean) k5Var.invoke(java.lang.Integer.valueOf(q60Var.f383709o))).booleanValue()) {
                            le0.x xVar5 = (le0.x) i95.n0.c(le0.x.class);
                            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f492563gz3);
                            float textSize5 = textView3.getTextSize();
                            ((ke0.e) xVar5).getClass();
                            textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, string, textSize5));
                            le0.x xVar6 = (le0.x) i95.n0.c(le0.x.class);
                            java.lang.String str5 = q60Var.f383701d;
                            float textSize6 = neatTextView2.getTextSize();
                            ((ke0.e) xVar6).getClass();
                            neatTextView2.b(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str5, textSize6));
                            weImageView2.setVisibility(8);
                            imageView.setVisibility(8);
                            l5Var.a(c5Var, ckVar, q60Var, true);
                        }
                        c5Var.f187134i.setVisibility(0);
                        android.widget.ImageView imageView2 = c5Var.f187135j;
                        imageView2.setVisibility(4);
                        if (i28 < ckVar.f371610q.f384569d.size()) {
                            imageView2.setVisibility(kotlin.jvm.internal.o.b(q60Var.f383702e, ((r45.q60) ckVar.f371610q.f384569d.get(i28)).f383702e) ? 0 : 4);
                        }
                        i27 = i28;
                        linearLayout = linearLayout2;
                        arrayList2 = arrayList3;
                        arrayList = arrayList4;
                        it6 = it7;
                        view2 = view4;
                        i18 = 0;
                    }
                }
            }
        }
        android.view.View view5 = view2;
        int count = getCount() - 1;
        android.widget.LinearLayout linearLayout3 = e5Var.f187195c;
        if (i17 == count) {
            linearLayout3.setVisibility(0);
            this.f187384f.getAppMsgCommentList();
        } else {
            linearLayout3.setVisibility(8);
        }
        return view5;
    }
}
