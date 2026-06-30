package ms;

/* loaded from: classes4.dex */
public final class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms.i f330922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330923b;

    public h(ms.i iVar, java.lang.String str) {
        this.f330922a = iVar;
        this.f330923b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        ms.i iVar = this.f330922a;
        com.tencent.mm.ui.widget.dialog.f4 f4Var = iVar.f330924d;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        if (fVar == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GetInfrequentContactUIC", "getInfrequentContact() called " + fVar.f70615a + ' ' + fVar.f70616b);
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            androidx.appcompat.app.AppCompatActivity activity = iVar.getActivity();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
            e4Var.f211776c = iVar.getString(com.tencent.mm.R.string.ggb);
            e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var.c();
            return fVar;
        }
        r45.hh3 hh3Var = (r45.hh3) fVar.f70618d;
        if (hh3Var == null) {
            return fVar;
        }
        java.util.LinkedList infrequent_contact_list = hh3Var.f376147d;
        kotlin.jvm.internal.o.f(infrequent_contact_list, "infrequent_contact_list");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(infrequent_contact_list, 10));
        java.util.Iterator it = infrequent_contact_list.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.qz3) it.next()).f384361d);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        kz5.n0.O0(arrayList, arrayList2);
        com.tencent.mars.xlog.Log.i("MicroMsg.GetInfrequentContactUIC", "getInfrequentContact()usernameList:" + arrayList2.size() + "  ");
        java.lang.String string = iVar.getContext().getString(com.tencent.mm.R.string.oct);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("INTENT_KEY_TIPS_WORDING", string);
        intent.putExtra("INTENT_KEY_USERNAME_LIST", arrayList2);
        intent.putExtra("INTENT_KEY_REPORT_SESSION_ID", this.f330923b);
        intent.putExtra("INTENT_KEY_LAST_CGI_CONTEXT", hh3Var.f376148e);
        j45.l.j(iVar.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.RecommendDeleteContactUI", intent, null);
        return fVar;
    }
}
