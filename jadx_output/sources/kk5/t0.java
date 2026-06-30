package kk5;

/* loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.v0 f308688d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(kk5.v0 v0Var) {
        super(1);
        this.f308688d = v0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        kk5.v0 v0Var = this.f308688d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            ((em.l2) ((jz5.n) v0Var.f308693d).getValue()).e().setOnClickListener(new kk5.s0(v0Var, state));
        }
        if (((wi5.c) state.a(wi5.c.class)) != null) {
            java.util.LinkedList linkedList = state.f446319o;
            java.util.Iterator it = linkedList.iterator();
            int i17 = 0;
            int i18 = 0;
            while (it.hasNext()) {
                java.lang.Integer num = (java.lang.Integer) v0Var.f308694e.get((java.lang.String) it.next());
                if (num != null && num.intValue() == 1) {
                    i17++;
                } else if (num != null && num.intValue() == 3) {
                    i18++;
                }
            }
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(linkedList, ";");
            android.content.Intent intent = new android.content.Intent(v0Var.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.masssend.ui.MassSendMsgUI.class);
            intent.putExtra("mass_send_contact_list", c17);
            intent.putExtra("mass_send_contact_chatroom", i17);
            intent.putExtra("mass_send_contact_label", i18);
            androidx.appcompat.app.AppCompatActivity activity = v0Var.getActivity();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/uic/SelectMassSendContactUIC$onCreate$2", "invoke", "(Lcom/tencent/mm/ui/mvvm/state/SelectContactState;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/ui/uic/SelectMassSendContactUIC$onCreate$2", "invoke", "(Lcom/tencent/mm/ui/mvvm/state/SelectContactState;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return jz5.f0.f302826a;
    }
}
