package t61;

/* loaded from: classes9.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t61.e f415985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t61.d f415986e;

    public c(t61.d dVar, t61.e eVar) {
        this.f415986e = dVar;
        this.f415985d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/friend/widget/RecoverFriendSortView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.autogen.mmdata.rpt.import_old_account_contactsStruct import_old_account_contactsstruct = new com.tencent.mm.autogen.mmdata.rpt.import_old_account_contactsStruct();
        import_old_account_contactsstruct.f63116d = 4;
        import_old_account_contactsstruct.f63118f = import_old_account_contactsstruct.b("newaccountusername", c01.z1.b(), true);
        t61.d dVar = this.f415986e;
        import_old_account_contactsstruct.f63117e = import_old_account_contactsstruct.b("oldaccountusername", dVar.f415987a.f73174s, true);
        t61.e eVar = this.f415985d;
        import_old_account_contactsstruct.f63119g = import_old_account_contactsstruct.b("friendusername", eVar.f415994g.f393000a.field_encryptUsername, true);
        import_old_account_contactsstruct.k();
        ns.k kVar = (ns.k) i95.n0.c(ns.k.class);
        android.content.Context context = dVar.f415987a.getContext();
        t61.a aVar = new t61.a(this);
        ((ms.a) kVar).getClass();
        r35.a aVar2 = new r35.a(context, aVar);
        aVar2.m(eVar.f415994g.f393000a.field_ticket);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(17);
        aVar2.f369007e = new t61.b(this);
        aVar2.b(eVar.f415994g.f393000a.field_encryptUsername, linkedList, false, "");
        yj0.a.h(this, "com/tencent/mm/plugin/account/friend/widget/RecoverFriendSortView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
