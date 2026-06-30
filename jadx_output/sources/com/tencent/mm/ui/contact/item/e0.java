package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class e0 implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.f0 f206863a;

    public e0(com.tencent.mm.ui.contact.item.f0 f0Var) {
        this.f206863a = f0Var;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = i65.a.D(context) ? android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck7, viewGroup, false) : android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck6, viewGroup, false);
        com.tencent.mm.ui.contact.item.d0 d0Var = this.f206863a.D;
        d0Var.f206856a = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        d0Var.f206857b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
        d0Var.f206858c = textView;
        textView.setVisibility(8);
        d0Var.f206859d = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.mie);
        d0Var.f206860e = (android.widget.RelativeLayout) inflate.findViewById(com.tencent.mm.R.id.d1g);
        d0Var.f206861f = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.mjc);
        d0Var.f206862g = inflate.findViewById(com.tencent.mm.R.id.m38);
        d0Var.f206856a.setImportantForAccessibility(2);
        inflate.setTag(d0Var);
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View view, com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar, com.tencent.mm.ui.contact.item.d dVar, boolean z17, boolean z18) {
        com.tencent.mm.ui.contact.item.f0 f0Var = (com.tencent.mm.ui.contact.item.f0) dVar;
        com.tencent.mm.ui.contact.item.d0 d0Var = (com.tencent.mm.ui.contact.item.d0) bVar;
        d0Var.f206857b.setCompoundDrawables(null, null, null, null);
        com.tencent.mm.ui.contact.item.f0 f0Var2 = this.f206863a;
        f0Var2.getClass();
        com.tencent.mm.plugin.fts.ui.n3.a(f0Var.f206818y, d0Var.f206857b);
        if (com.tencent.mm.storage.z3.m4(f0Var.f206819z)) {
            gm0.j1.i();
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(f0Var.f206819z, true);
            ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).ij(context, d0Var.f206857b, f0Var.f206818y, n17.Q0(), n17.G0(), (int) d0Var.f206857b.getTextSize());
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(d0Var.f206856a, f0Var.f206819z, null);
        if (c01.e2.R(f0Var.f206819z)) {
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.R.raw.open_im_main_logo);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            d0Var.f206857b.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
        } else {
            d0Var.f206857b.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        if (android.text.TextUtils.isEmpty(f0Var.f206837f)) {
            d0Var.f206858c.setVisibility(8);
        } else {
            d0Var.f206858c.setVisibility(0);
            d0Var.f206858c.setText(f0Var.f206837f);
        }
        if (com.tencent.mm.storage.z3.R4(f0Var.f206819z) || com.tencent.mm.storage.z3.N3(f0Var.f206819z)) {
            d0Var.f206859d.setVisibility(4);
            android.view.View view = d0Var.f206862g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/item/ConversationMemberDataItem$ConversationMemberViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/contact/item/ConversationMemberDataItem$ConversationMemberViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = d0Var.f206862g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/contact/item/ConversationMemberDataItem$ConversationMemberViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/contact/item/ConversationMemberDataItem$ConversationMemberViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (z17) {
                d0Var.f206859d.setChecked(true);
                d0Var.f206859d.setEnabled(false);
                d0Var.f206859d.setBackgroundResource(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.checkbox_selected_grey_dark : com.tencent.mm.R.raw.checkbox_selected_grey);
            } else {
                d0Var.f206859d.setChecked(z18);
                d0Var.f206859d.setEnabled(true);
            }
            d0Var.f206859d.setVisibility(0);
        }
        if (f0Var2.f206843l) {
            d0Var.f206860e.setBackground(null);
        }
        if (f0Var2.f206844m) {
            d0Var.f206861f.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.BW_97));
        } else {
            d0Var.f206861f.setBackground(null);
        }
    }
}
