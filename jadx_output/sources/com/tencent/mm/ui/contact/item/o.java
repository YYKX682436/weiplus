package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class o implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.p f206908a;

    public o(com.tencent.mm.ui.contact.item.p pVar) {
        this.f206908a = pVar;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = i65.a.D(context) ? android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck7, viewGroup, false) : android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck6, viewGroup, false);
        com.tencent.mm.ui.contact.item.p pVar = this.f206908a;
        com.tencent.mm.ui.contact.item.n nVar = pVar.G;
        nVar.f206897b = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        nVar.f206898c = textView;
        textView.setMaxWidth(i65.a.b(context, 200));
        nVar.f206900e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
        nVar.f206899d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o_q);
        nVar.f206896a = inflate.findViewById(com.tencent.mm.R.id.mjc);
        nVar.f206901f = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.mie);
        nVar.f206902g = inflate.findViewById(com.tencent.mm.R.id.m38);
        if (pVar.f206840i) {
            nVar.f206896a.setBackgroundResource(com.tencent.mm.R.drawable.f481310q6);
        }
        inflate.setTag(nVar);
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View view, com.tencent.mm.ui.contact.item.d dVar) {
        com.tencent.mm.ui.contact.item.p pVar = this.f206908a;
        if (pVar.C == null) {
            return false;
        }
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).xj(pVar.f206848q, pVar.C, 1);
        return false;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar, com.tencent.mm.ui.contact.item.d dVar, boolean z17, boolean z18) {
        com.tencent.mm.ui.contact.item.n nVar = (com.tencent.mm.ui.contact.item.n) bVar;
        com.tencent.mm.ui.contact.item.p pVar = (com.tencent.mm.ui.contact.item.p) dVar;
        java.lang.String str = pVar.f206819z;
        if (str == null || str.length() <= 0) {
            nVar.f206897b.setImageResource(com.tencent.mm.R.drawable.bhm);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(nVar.f206897b, pVar.f206819z, 0.1f);
        }
        com.tencent.mm.plugin.fts.ui.n3.a(pVar.f206818y, nVar.f206898c);
        if (c01.e2.R(pVar.f206819z)) {
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.R.raw.open_im_main_logo);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            nVar.f206898c.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
        } else {
            nVar.f206898c.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        com.tencent.mm.plugin.fts.ui.n3.a(pVar.E, nVar.f206900e);
        com.tencent.mm.plugin.fts.ui.n3.a(pVar.D, nVar.f206899d);
        nVar.f206901f.setVisibility(4);
        android.view.View view = nVar.f206902g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/item/ChatroomMemberDetailDataItem$ChatroomViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/contact/item/ChatroomMemberDetailDataItem$ChatroomViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
