package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class e extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f129081d;

    /* renamed from: e, reason: collision with root package name */
    public final android.app.Activity f129082e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f129083f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.p f129084g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f129085h;

    public e(android.app.Activity context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f129081d = "Finder.FansListAdapter";
        this.f129082e = context;
        this.f129083f = new java.util.ArrayList();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r45.q21 getItem(int i17) {
        java.lang.Object obj = this.f129083f.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return (r45.q21) obj;
    }

    public final void c(java.util.List contacts) {
        kotlin.jvm.internal.o.g(contacts, "contacts");
        java.util.ArrayList arrayList = this.f129083f;
        arrayList.clear();
        arrayList.addAll(contacts);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f129083f.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        java.lang.String str;
        int i18;
        android.app.Activity activity = this.f129082e;
        if (view == null) {
            view2 = android.view.View.inflate(activity, com.tencent.mm.R.layout.agt, null);
            view2.setTag(new com.tencent.mm.plugin.finder.ui.a());
        } else {
            view2 = view;
        }
        java.lang.Object tag = view2.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FansListAdapter.ContactViewHolder");
        com.tencent.mm.plugin.finder.ui.a aVar = (com.tencent.mm.plugin.finder.ui.a) tag;
        android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.a_4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        aVar.f128833a = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view2.findViewById(com.tencent.mm.R.id.kbq);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        aVar.f128834b = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view2.findViewById(com.tencent.mm.R.id.ag6);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        aVar.f128835c = (android.widget.TextView) findViewById3;
        aVar.f128836d = view2.findViewById(com.tencent.mm.R.id.frp);
        r45.q21 item = getItem(i17);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) item.getCustom(0);
        if (finderContact == null || (str = finderContact.getHeadUrl()) == null) {
            str = "";
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        int integer = item.getInteger(4);
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (integer == 0) {
            vo0.d l17 = g1Var.l();
            mn2.n nVar = new mn2.n(str, null, 2, null);
            android.widget.ImageView imageView = aVar.f128833a;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("avatarIv");
                throw null;
            }
            l17.c(nVar, imageView, g1Var.h(mn2.f1.f329961o));
        } else {
            vo0.d a17 = g1Var.a();
            mn2.n nVar2 = new mn2.n(str, null, 2, null);
            android.widget.ImageView imageView2 = aVar.f128833a;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("avatarIv");
                throw null;
            }
            a17.c(nVar2, imageView2, g1Var.h(mn2.f1.f329957h));
        }
        android.widget.TextView textView = aVar.f128834b;
        if (textView == null) {
            kotlin.jvm.internal.o.o("nicknameTv");
            throw null;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) item.getCustom(0);
        java.lang.String username = finderContact2 != null ? finderContact2.getUsername() : null;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) item.getCustom(0);
        java.lang.String md6 = c61.yb.md(ybVar, username, finderContact3 != null ? finderContact3.getNickname() : null, false, 4, null);
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(activity, md6));
        java.util.ArrayList arrayList = this.f129083f;
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i18 = -1;
                break;
            }
            if (((r45.q21) listIterator.previous()).getInteger(1) == 1) {
                i18 = listIterator.nextIndex();
                break;
            }
        }
        if (i18 != i17 || i17 == getCount() - 1) {
            android.widget.TextView textView2 = aVar.f128835c;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("beforeTip");
                throw null;
            }
            textView2.setVisibility(8);
        } else {
            android.widget.TextView textView3 = aVar.f128835c;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("beforeTip");
                throw null;
            }
            textView3.setVisibility(0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[show_finder_identity] ");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) item.getCustom(0);
        sb6.append(finderContact4 != null ? finderContact4.getNickname() : null);
        sb6.append(' ');
        r45.ub1 ub1Var = (r45.ub1) item.getCustom(7);
        sb6.append(ub1Var != null ? java.lang.Integer.valueOf(ub1Var.getInteger(0)) : null);
        com.tencent.mars.xlog.Log.i(this.f129081d, sb6.toString());
        android.view.View view3 = aVar.f128836d;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) t70Var.L1().r()).booleanValue()) {
            android.widget.ImageView imageView3 = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.tbk);
            if (view3 != null && imageView3 != null) {
                com.tencent.mm.plugin.finder.assist.c3 c3Var = com.tencent.mm.plugin.finder.assist.c3.f102052a;
                r45.ub1 ub1Var2 = (r45.ub1) item.getCustom(7);
                boolean z18 = ub1Var2 != null && ub1Var2.getInteger(0) == 1;
                r45.ub1 ub1Var3 = (r45.ub1) item.getCustom(7);
                c3Var.a(view3, imageView3, z18, ub1Var3 != null ? (com.tencent.mm.protocal.protobuf.FinderAuthInfo) ub1Var3.getCustom(1) : null, false, this.f129082e);
                if (((java.lang.Number) t70Var.u0().r()).intValue() != 1) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FansListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/FansListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else {
            if (((java.lang.Number) t70Var.u0().r()).intValue() == 1) {
                r45.ub1 ub1Var4 = (r45.ub1) item.getCustom(7);
                if (ub1Var4 != null && ub1Var4.getInteger(0) == 1) {
                    android.view.View view4 = aVar.f128836d;
                    if (view4 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/FansListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/finder/ui/FansListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            android.view.View view5 = aVar.f128836d;
            if (view5 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/ui/FansListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/finder/ui/FansListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.view.View findViewById4 = view2.findViewById(com.tencent.mm.R.id.f484307ds5);
        if (getItem(i17).getBoolean(3)) {
            findViewById4.setOnLongClickListener(null);
            findViewById4.setOnClickListener(new com.tencent.mm.plugin.finder.ui.b(this, findViewById4, i17));
        } else {
            findViewById4.setOnLongClickListener(new com.tencent.mm.plugin.finder.ui.c(this, findViewById4, i17));
            findViewById4.setOnClickListener(new com.tencent.mm.plugin.finder.ui.d(this, findViewById4, i17));
        }
        return view2;
    }
}
