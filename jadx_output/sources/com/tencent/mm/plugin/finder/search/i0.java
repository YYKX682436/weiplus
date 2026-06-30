package com.tencent.mm.plugin.finder.search;

/* loaded from: classes8.dex */
public final class i0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFansSearchUI f125718d;

    public i0(com.tencent.mm.plugin.finder.search.FinderFansSearchUI finderFansSearchUI) {
        this.f125718d = finderFansSearchUI;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f125718d.f125540x.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        java.lang.String str;
        java.lang.String str2;
        int i18;
        android.widget.ImageView imageView;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (holder instanceof com.tencent.mm.plugin.finder.search.f0) {
            com.tencent.mm.plugin.finder.search.FinderFansSearchUI finderFansSearchUI = this.f125718d;
            java.lang.Object obj = finderFansSearchUI.f125540x.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            r45.q21 q21Var = (r45.q21) obj;
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) q21Var.getCustom(0);
            android.text.Spanned spanned = "";
            if (finderContact == null || (str = finderContact.getHeadUrl()) == null) {
                str = "";
            }
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            int integer = q21Var.getInteger(4);
            mn2.g1 g1Var = mn2.g1.f329975a;
            if (integer == 0) {
                g1Var.l().c(new mn2.n(str, null, 2, null), ((com.tencent.mm.plugin.finder.search.f0) holder).f125682d, g1Var.h(mn2.f1.f329961o));
            } else {
                g1Var.a().c(new mn2.n(str, null, 2, null), ((com.tencent.mm.plugin.finder.search.f0) holder).f125682d, g1Var.h(mn2.f1.f329957h));
            }
            com.tencent.mm.plugin.finder.search.f0 f0Var = (com.tencent.mm.plugin.finder.search.f0) holder;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) q21Var.getCustom(0);
            if (finderContact2 == null || (str2 = finderContact2.getNickname()) == null) {
                str2 = "";
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                spanned = android.text.Html.fromHtml("<font color=\"#06AD56\">" + str2 + "</font>");
            }
            android.widget.TextView textView = f0Var.f125683e;
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.n(context, spanned, textSize));
            java.util.ArrayList arrayList = finderFansSearchUI.f125540x;
            java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i18 = -1;
                    break;
                } else {
                    if (((r45.q21) listIterator.previous()).getInteger(1) == 1) {
                        i18 = listIterator.nextIndex();
                        break;
                    }
                }
            }
            android.widget.TextView textView2 = f0Var.f125684f;
            if (i18 != i17 || i17 == getItemCount() - 1) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
            boolean z18 = q21Var.getBoolean(3);
            android.widget.RelativeLayout relativeLayout = f0Var.f125685g;
            if (z18) {
                relativeLayout.setOnClickListener(null);
            } else {
                relativeLayout.setOnClickListener(new com.tencent.mm.plugin.finder.search.h0(finderFansSearchUI, q21Var));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[show_finder_identity] ");
            com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) q21Var.getCustom(0);
            sb6.append(finderContact3 != null ? finderContact3.getNickname() : null);
            sb6.append(' ');
            r45.ub1 ub1Var = (r45.ub1) q21Var.getCustom(7);
            sb6.append(ub1Var != null ? java.lang.Integer.valueOf(ub1Var.getInteger(0)) : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderFansSearchUI", sb6.toString());
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Boolean) t70Var.L1().r()).booleanValue()) {
                android.view.View view = f0Var.f125686h;
                if (view != null && (imageView = f0Var.f125687i) != null) {
                    com.tencent.mm.plugin.finder.assist.c3 c3Var = com.tencent.mm.plugin.finder.assist.c3.f102052a;
                    r45.ub1 ub1Var2 = (r45.ub1) q21Var.getCustom(7);
                    boolean z19 = ub1Var2 != null && ub1Var2.getInteger(0) == 1;
                    r45.ub1 ub1Var3 = (r45.ub1) q21Var.getCustom(7);
                    com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = ub1Var3 != null ? (com.tencent.mm.protocal.protobuf.FinderAuthInfo) ub1Var3.getCustom(1) : null;
                    android.content.Context context2 = relativeLayout.getContext();
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    c3Var.a(view, imageView, z19, finderAuthInfo, false, context2);
                    if (((java.lang.Number) t70Var.u0().r()).intValue() != 1) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$FansSearchAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$FansSearchAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            } else {
                if (((java.lang.Number) t70Var.u0().r()).intValue() == 1) {
                    r45.ub1 ub1Var4 = (r45.ub1) q21Var.getCustom(7);
                    if (ub1Var4 != null && ub1Var4.getInteger(0) == 1) {
                        android.view.View view2 = f0Var.f125686h;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$FansSearchAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$FansSearchAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                android.view.View view3 = f0Var.f125686h;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$FansSearchAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$FansSearchAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.finder.view.UserRelationshipTagTextView userRelationshipTagTextView = f0Var.f125688m;
            if (userRelationshipTagTextView == null) {
                return;
            }
            userRelationshipTagTextView.setVisibility(0);
            if (q21Var.getInteger(9) == 1) {
                userRelationshipTagTextView.b(com.tencent.mm.plugin.finder.view.ss.f133075d, null);
                return;
            }
            if (q21Var.getInteger(10) > 0) {
                userRelationshipTagTextView.g(q21Var.getInteger(10));
            } else if (q21Var.getInteger(11) >= 5) {
                userRelationshipTagTextView.e(q21Var.getInteger(11));
            } else {
                userRelationshipTagTextView.setVisibility(8);
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.plugin.finder.search.FinderFansSearchUI finderFansSearchUI = this.f125718d;
        androidx.appcompat.app.AppCompatActivity context = finderFansSearchUI.getContext();
        kotlin.jvm.internal.o.d(context);
        android.view.View inflate = context.getLayoutInflater().inflate(com.tencent.mm.R.layout.agt, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.plugin.finder.search.f0(finderFansSearchUI, inflate);
    }
}
