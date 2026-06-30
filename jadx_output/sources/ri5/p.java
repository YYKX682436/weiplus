package ri5;

/* loaded from: classes.dex */
public final class p extends in5.r {
    public p() {
        jz5.h.b(ri5.o.f396131d);
        jz5.h.b(ri5.n.f396130d);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489332el3;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        jz5.f0 f0Var;
        ri5.j item = (ri5.j) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View view = holder.itemView;
        em.m2 m2Var = new em.m2(view);
        boolean z18 = !r26.n0.N(item.E);
        java.lang.String str = item.f396111f;
        if (z18) {
            gk0.k kVar = new gk0.k(m2Var.a().getMeasuredWidth(), m2Var.a().getMeasuredHeight());
            kVar.f272433d = 0.1f;
            kVar.f272434e = com.tencent.mm.R.drawable.bhm;
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            android.widget.ImageView a17 = m2Var.a();
            kotlin.jvm.internal.o.f(a17, "getAvatarIv(...)");
            ((h83.g) n0Var).wi(a17, item.E, kVar);
        } else {
            java.lang.String str2 = r26.n0.N(str) ^ true ? str : null;
            if (str2 != null) {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(m2Var.a(), str2, 0.1f);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                android.widget.ImageView a18 = m2Var.a();
                i95.m c17 = i95.n0.c(kv.b0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                a18.setImageBitmap(kv.b0.Mg((kv.b0) c17, 0.0f, 1, null));
            }
        }
        m2Var.a().setVisibility(item.D ? 8 : 0);
        if (item.f396118o) {
            m2Var.e().setVisibility(0);
            m2Var.d().setText(item.f396119p);
            if (item.f396121r) {
                com.tencent.mm.ui.bk.s0(m2Var.d().getPaint());
            }
        } else {
            m2Var.e().setVisibility(8);
        }
        if (item.f396120q != 0) {
            m2Var.e().setBackgroundColor(item.f396120q);
            m2Var.d().setBackgroundColor(item.f396120q);
        }
        if (item.f396127x) {
            if (item.f396125v) {
                m2Var.h().setChecked(true);
                m2Var.h().setEnabled(false);
                m2Var.h().setBackgroundResource(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.checkbox_selected_grey_dark : com.tencent.mm.R.raw.checkbox_selected_grey);
            } else {
                m2Var.h().setChecked(item.f396126w);
                m2Var.h().setEnabled(true);
                m2Var.h().setBackgroundResource(com.tencent.mm.R.drawable.aoe);
            }
            m2Var.h().setVisibility(0);
        } else {
            m2Var.h().setVisibility(8);
        }
        if (item.f396129z && m2Var.h().getVisibility() == 0) {
            m2Var.h().setVisibility(4);
        }
        if (m2Var.f254601c == null) {
            m2Var.f254601c = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.m38);
        }
        m2Var.f254601c.setVisibility(item.A ? 0 : 8);
        if (m2Var.f254611m == null) {
            m2Var.f254611m = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.r_u);
        }
        m2Var.f254611m.setVisibility(item.C ? 0 : 8);
        if (item.f396122s) {
            if (com.tencent.mm.ui.bk.C()) {
                m2Var.c().setBackgroundResource(com.tencent.mm.R.color.f479314vu);
            } else {
                m2Var.c().setBackgroundResource(com.tencent.mm.R.color.f479313vt);
            }
            android.view.View c18 = m2Var.c();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c18, arrayList.toArray(), "com/tencent/mm/ui/mvvm/item/SelectConversationItem2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/mvvm/item/SelectContactListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c18, "com/tencent/mm/ui/mvvm/item/SelectConversationItem2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/mvvm/item/SelectContactListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View c19 = m2Var.c();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c19, arrayList2.toArray(), "com/tencent/mm/ui/mvvm/item/SelectConversationItem2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/mvvm/item/SelectContactListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c19, "com/tencent/mm/ui/mvvm/item/SelectConversationItem2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/mvvm/item/SelectContactListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (item.f396123t) {
            if (m2Var.f254614p == null) {
                m2Var.f254614p = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.n0e);
            }
            m2Var.f254614p.setVisibility(0);
        } else {
            if (m2Var.f254614p == null) {
                m2Var.f254614p = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.n0e);
            }
            m2Var.f254614p.setVisibility(8);
        }
        if (item.f396124u) {
            if (m2Var.f254605g == null) {
                m2Var.f254605g = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.v2a);
            }
            m2Var.f254605g.setVisibility(0);
        } else {
            if (m2Var.f254605g == null) {
                m2Var.f254605g = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.v2a);
            }
            m2Var.f254605g.setVisibility(8);
        }
        com.tencent.mm.plugin.fts.ui.n3.a(item.f396112g, m2Var.f());
        m2Var.f().setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        if (item.B) {
            if (m2Var.f254609k == null) {
                m2Var.f254609k = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ulk);
            }
            m2Var.f254609k.setVisibility(0);
        } else {
            if (m2Var.f254609k == null) {
                m2Var.f254609k = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ulk);
            }
            m2Var.f254609k.setVisibility(8);
            m2Var.f().setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).wi(m2Var.f(), str, i65.a.h(holder.f293121e, com.tencent.mm.R.dimen.f479691cq));
        }
        if (item.F > 0) {
            m2Var.g().setVisibility(0);
            m2Var.g().setText(m2Var.g().getResources().getString(com.tencent.mm.R.string.n79, java.lang.Integer.valueOf(item.F)));
        } else if (item.G != -1) {
            m2Var.g().setVisibility(0);
            m2Var.g().setText(m2Var.g().getResources().getString(com.tencent.mm.R.string.n76, java.lang.Integer.valueOf(item.G)));
        } else {
            m2Var.g().setVisibility(8);
        }
        if (((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(str)) {
            if (m2Var.f254603e == null) {
                m2Var.f254603e = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.spk);
            }
            m2Var.f254603e.setVisibility(0);
        } else {
            if (m2Var.f254603e == null) {
                m2Var.f254603e = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.spk);
            }
            m2Var.f254603e.setVisibility(8);
        }
        java.lang.CharSequence charSequence = item.f396116m;
        if (m2Var.f254602d == null) {
            m2Var.f254602d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kjp);
        }
        com.tencent.mm.plugin.fts.ui.n3.a(charSequence, m2Var.f254602d);
        com.tencent.mm.plugin.fts.ui.n3.a(item.f396117n, m2Var.b());
        int i19 = item.H;
        if (i19 == -1) {
            m2Var.b().setTextColor(m2Var.b().getTextColors().getDefaultColor());
        } else if (i19 == 0) {
            m2Var.b().setTextColor(android.graphics.Color.parseColor("#8E8E93"));
        } else {
            m2Var.b().setTextColor(android.graphics.Color.parseColor("#07C160"));
        }
    }
}
