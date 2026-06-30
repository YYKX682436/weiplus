package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class ib implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f206810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.jb f206811e;

    public ib(com.tencent.mm.ui.contact.jb jbVar, com.tencent.mm.storage.z3 z3Var) {
        this.f206811e = jbVar;
        this.f206810d = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SnsGroupCardAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.contact.jb jbVar = this.f206811e;
        jbVar.getClass();
        com.tencent.mm.storage.z3 z3Var = this.f206810d;
        java.lang.String d17 = z3Var.d1();
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(d17);
        int wi6 = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(d17);
        android.content.Intent intent = new android.content.Intent(jbVar.f206660d, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI.class);
        intent.putExtra("RoomInfo_Id", d17);
        intent.putExtra("room_member_count", wi6);
        intent.putExtra("Add_address_titile", e17);
        intent.putExtra("room_name", z3Var.d1());
        intent.putExtra("filter_open_im", true);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", jbVar.f206975h);
        android.content.Context context = jbVar.f206660d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/ui/contact/SnsGroupCardAdapter", "goToRoomMember", "(Lcom/tencent/mm/storage/Contact;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/contact/SnsGroupCardAdapter", "goToRoomMember", "(Lcom/tencent/mm/storage/Contact;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/ui/contact/SnsGroupCardAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
