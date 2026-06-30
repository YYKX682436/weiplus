package z63;

/* loaded from: classes5.dex */
public class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z63.f1 f470449d;

    public x0(z63.f1 f1Var) {
        this.f470449d = f1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.util.Pair pair;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/groupsolitaire/ui/SuggestSolitatireTips$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.SuggestSolitatireTips", "click Tips");
        z63.f1 f1Var = this.f470449d;
        if (f1Var.f470391l == null && !x63.g.B(f1Var.f470381b, f1Var.f470401v)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.SuggestSolitatireTips", "why here???");
            yj0.a.h(this, "com/tencent/mm/plugin/groupsolitaire/ui/SuggestSolitatireTips$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        y63.a aVar = f1Var.f470391l;
        if (aVar == null) {
            f1Var.f470391l = new y63.a();
            f1Var.f470391l.H = f1Var.f470392m + "\n";
            y63.a aVar2 = f1Var.f470391l;
            aVar2.field_key = x63.g.o(aVar2);
            y63.a aVar3 = f1Var.f470391l;
            aVar3.K = ".";
            aVar3.Q = 1;
            intent.putExtra("key_group_solitatire_create", true);
            intent.putExtra("key_group_solitatire_scene", 4);
        } else {
            aVar.field_key = x63.g.o(aVar);
            java.lang.String str = f1Var.f470390k;
            java.lang.String str2 = f1Var.f470391l.field_key;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                pair = new android.util.Pair(java.lang.Boolean.FALSE, null);
            } else {
                y63.a f17 = ((t63.e) i95.n0.c(t63.e.class)).wi().f(str, str2);
                pair = f17 == null ? new android.util.Pair(java.lang.Boolean.FALSE, null) : new android.util.Pair(java.lang.Boolean.TRUE, f17);
            }
            if (!((java.lang.Boolean) pair.first).booleanValue()) {
                if (!x63.g.D(f1Var.f470381b, f1Var.f470401v)) {
                    f1Var.f470391l.H = f1Var.f470381b.getString(com.tencent.mm.R.string.fsk) + "\n" + f1Var.f470391l.H;
                    y63.a aVar4 = f1Var.f470391l;
                    aVar4.field_key = x63.g.o(aVar4);
                }
                intent.putExtra("key_group_solitatire_create", true);
            } else if (f1Var.f470404y) {
                intent.putExtra("key_group_solitatire_create", true);
                if (!x63.g.D(f1Var.f470381b, f1Var.f470401v)) {
                    f1Var.f470391l.H = f1Var.f470381b.getString(com.tencent.mm.R.string.fsk) + "\n" + f1Var.f470391l.H;
                    y63.a aVar5 = f1Var.f470391l;
                    aVar5.field_key = x63.g.o(aVar5);
                }
            } else {
                intent.putExtra("key_group_solitatire_create", false);
                f1Var.f470391l = x63.g.J(f1Var.f470391l, f1Var.f470397r, (y63.a) pair.second);
            }
            intent.putExtra("key_group_solitatire_scene", 3);
        }
        intent.putExtra("key_group_solitatire_key", f1Var.f470391l.field_key);
        intent.putExtra("key_group_solitatire_chatroom_username", f1Var.f470390k);
        x63.g.e(f1Var.f470390k, f1Var.f470391l);
        ((t63.e) i95.n0.c(t63.e.class)).wi().k(f1Var.f470390k, f1Var.f470391l);
        j45.l.r(f1Var.f470382c, "groupsolitaire", ".ui.GroupSolitatireEditUI", intent, 3001, new z63.w0(this));
        f1Var.a();
        yj0.a.h(this, "com/tencent/mm/plugin/groupsolitaire/ui/SuggestSolitatireTips$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
