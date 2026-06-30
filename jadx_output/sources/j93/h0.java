package j93;

/* loaded from: classes.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.r0 f298399d;

    public h0(j93.r0 r0Var) {
        this.f298399d = r0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/uic/PlusMenuLabelUIC$onCreate$1$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j93.r0 r0Var = this.f298399d;
        r0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.PlusMenuLabelUIC", "onImportContactFromChatRoomClick() called");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", r0Var.getActivity().getString(com.tencent.mm.R.string.f489925fo));
        intent.putExtra("list_attr", 64);
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(c01.z1.r());
        com.tencent.mm.view.recyclerview.WxRecyclerView k17 = ((em.l2) ((jz5.n) r0Var.f298488d).getValue()).k();
        kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
        if (a17 != null && (arrayList = a17.f152065o) != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (((ri5.j) next).f396126w) {
                    arrayList3.add(next);
                }
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
            java.util.Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                arrayList4.add(((ri5.j) it6.next()).f396111f);
            }
            hashSet.addAll(arrayList4);
        }
        java.lang.String stringExtra = r0Var.getActivity().getIntent().getStringExtra("block_contact");
        if (stringExtra != null) {
            hashSet.addAll(r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PlusMenuLabelUIC", "getBlockUserNameList: size:" + hashSet.size());
        java.util.ArrayList arrayList5 = new java.util.ArrayList(hashSet);
        if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList5)) {
            intent.putExtra("block_contact", com.tencent.mm.sdk.platformtools.t8.c1(arrayList5, ","));
        }
        intent.putExtra("showLabelWhenSearch", false);
        intent.putExtra("showContactScrollbar", false);
        intent.putExtra("Intent_KEY_SHOW_IV_MORE", true);
        pf5.j0.a(intent, j93.j1.class);
        pf5.j0.a(intent, ij5.d0.class);
        pf5.j0.a(intent, g93.j.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, ij5.c.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        bh5.c cVar = new bh5.c();
        cVar.f20922a.f20924a = r0Var.getContext();
        cVar.d(intent);
        cVar.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
        cVar.i(new j93.o0(r0Var));
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/uic/PlusMenuLabelUIC$onCreate$1$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
