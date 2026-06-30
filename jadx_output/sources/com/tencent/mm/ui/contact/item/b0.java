package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class b0 implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.c0 f206827a;

    public b0(com.tencent.mm.ui.contact.item.c0 c0Var) {
        this.f206827a = c0Var;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = i65.a.D(context) ? android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck7, viewGroup, false) : android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck6, viewGroup, false);
        com.tencent.mm.ui.contact.item.a0 a0Var = this.f206827a.F;
        a0Var.f206820a = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        a0Var.f206821b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
        a0Var.f206822c = textView;
        textView.setVisibility(8);
        a0Var.f206823d = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.mie);
        a0Var.f206824e = (android.widget.RelativeLayout) inflate.findViewById(com.tencent.mm.R.id.d1g);
        a0Var.f206825f = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.mjc);
        a0Var.f206826g = inflate.findViewById(com.tencent.mm.R.id.m38);
        a0Var.f206820a.setImportantForAccessibility(2);
        inflate.setTag(a0Var);
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View view, com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar, com.tencent.mm.ui.contact.item.d dVar, boolean z17, boolean z18) {
        com.tencent.mm.ui.contact.item.c0 c0Var = (com.tencent.mm.ui.contact.item.c0) dVar;
        com.tencent.mm.ui.contact.item.a0 a0Var = (com.tencent.mm.ui.contact.item.a0) bVar;
        a0Var.f206821b.setCompoundDrawables(null, null, null, null);
        com.tencent.mm.ui.contact.item.c0 c0Var2 = this.f206827a;
        int i17 = c0Var2.D;
        if (i17 != 0 && c0Var2.C != null) {
            a0Var.f206820a.setImageResource(i17);
            a0Var.f206821b.setText(c0Var2.C);
            return;
        }
        com.tencent.mm.plugin.fts.ui.n3.a(c0Var.f206818y, a0Var.f206821b);
        if (com.tencent.mm.storage.z3.m4(c0Var.f206819z) || com.tencent.mm.storage.z3.p4(c0Var.f206819z)) {
            gm0.j1.i();
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(c0Var.f206819z, true);
            ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).ij(context, a0Var.f206821b, c0Var.f206818y, n17.Q0(), n17.G0(), (int) a0Var.f206821b.getTextSize());
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(a0Var.f206820a, c0Var.f206819z, null);
        if (c01.e2.R(c0Var.f206819z)) {
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.R.raw.open_im_main_logo);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            a0Var.f206821b.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
        } else {
            a0Var.f206821b.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).wi(a0Var.f206821b, c0Var.f206819z, i65.a.h(context, com.tencent.mm.R.dimen.f479693cs));
        if (a0Var.f206826g != null) {
            if (com.tencent.mm.storage.z3.N3(c0Var.f206819z) || com.tencent.mm.storage.z3.o4(c0Var.f206819z)) {
                android.view.View view = a0Var.f206826g;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/item/ConversationDataItem$ConversationViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/contact/item/ConversationDataItem$ConversationViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = a0Var.f206826g;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/contact/item/ConversationDataItem$ConversationViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/contact/item/ConversationDataItem$ConversationViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (android.text.TextUtils.isEmpty(c0Var.f206837f)) {
            a0Var.f206822c.setVisibility(8);
        } else {
            a0Var.f206822c.setVisibility(0);
            a0Var.f206822c.setText(c0Var.f206837f);
        }
        if (!c0Var2.f206836e) {
            a0Var.f206823d.setVisibility(8);
        } else if (com.tencent.mm.storage.z3.N3(c0Var.f206819z) || com.tencent.mm.storage.z3.o4(c0Var.f206819z)) {
            a0Var.f206823d.setVisibility(4);
        } else {
            if (z17) {
                a0Var.f206823d.setChecked(true);
                a0Var.f206823d.setEnabled(false);
                a0Var.f206823d.setBackgroundResource(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.checkbox_selected_grey_dark : com.tencent.mm.R.raw.checkbox_selected_grey);
            } else {
                a0Var.f206823d.setChecked(z18);
                a0Var.f206823d.setEnabled(true);
            }
            a0Var.f206823d.setVisibility(0);
        }
        if (c0Var2.f206843l) {
            a0Var.f206824e.setBackground(null);
        }
        if (c0Var2.f206844m) {
            a0Var.f206825f.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.BW_97));
        } else {
            a0Var.f206825f.setBackground(null);
        }
    }
}
