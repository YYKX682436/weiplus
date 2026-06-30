package p61;

/* loaded from: classes8.dex */
public class m3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p61.n3 f352315d;

    public m3(p61.n3 n3Var, p61.o3 o3Var) {
        this.f352315d = n3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        r61.s0 s0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/GoogleFriendAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p61.n3 n3Var = this.f352315d;
        p61.l3 l3Var = n3Var.f352328h.f352336q;
        if (l3Var != null) {
            int i17 = n3Var.f352321a;
            com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI googleFriendUI = (com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI) l3Var;
            p61.o3 o3Var = googleFriendUI.f73070f;
            if (o3Var != null && (s0Var = (r61.s0) o3Var.getItem(i17)) != null) {
                int i18 = s0Var.field_status;
                if (i18 == 0) {
                    ns.k kVar = (ns.k) i95.n0.c(ns.k.class);
                    p61.r3 r3Var = new p61.r3(googleFriendUI);
                    ((ms.a) kVar).getClass();
                    r35.a aVar = new r35.a(googleFriendUI, r3Var);
                    java.lang.String str = s0Var.field_googleitemid;
                    aVar.f369021v = true;
                    aVar.f369024y = str;
                    aVar.f369022w = false;
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    linkedList.add(58);
                    aVar.b(s0Var.field_username, linkedList, true, "");
                    s0Var.field_googlecgistatus = 0;
                    ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                    m61.k.Di().J0(s0Var);
                    googleFriendUI.f73070f.q();
                } else if (i18 == 1) {
                    java.lang.String str2 = s0Var.field_googleid;
                    ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                    android.database.Cursor D0 = m61.k.Di().D0(str2);
                    if (D0 == null || D0.getCount() <= 1) {
                        googleFriendUI.U6(s0Var, null);
                    } else {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        D0.moveToFirst();
                        int count = D0.getCount();
                        for (int i19 = 0; i19 < count; i19++) {
                            r61.s0 s0Var2 = new r61.s0();
                            s0Var2.convertFrom(D0);
                            arrayList2.add(s0Var2.field_googlegmail);
                            arrayList3.add(java.lang.Integer.valueOf(i19));
                            arrayList4.add(s0Var2);
                            D0.moveToNext();
                        }
                        arrayList3.add(-1);
                        db5.e1.c(googleFriendUI.getContext(), googleFriendUI.getResources().getString(com.tencent.mm.R.string.fqx), arrayList2, arrayList3, null, googleFriendUI.getResources().getString(com.tencent.mm.R.string.f490347sg), true, new p61.s3(googleFriendUI, arrayList4, s0Var), null);
                    }
                    if (D0 != null) {
                        D0.close();
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/GoogleFriendAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
