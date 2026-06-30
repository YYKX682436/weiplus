package v73;

/* loaded from: classes9.dex */
public class s0 implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.a f433742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI f433743b;

    public s0(com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI honeyPayMainUI, r73.a aVar) {
        this.f433743b = honeyPayMainUI;
        this.f433742a = aVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r73.a aVar = this.f433742a;
        r45.y00 y00Var = aVar.f393163r;
        r45.bv3 bv3Var = y00Var.f390668f;
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI honeyPayMainUI = this.f433743b;
        if (bv3Var != null) {
            com.tencent.mars.xlog.Log.i(honeyPayMainUI.f142260d, "do realname guide");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".ui.HoneyPayMainUI");
            u73.h.i(honeyPayMainUI, bundle, aVar.f393163r.f390668f, true);
            return;
        }
        java.util.LinkedList linkedList = y00Var.f390669g;
        int i19 = com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI.f142334u;
        honeyPayMainUI.getClass();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        if (linkedList != null && !linkedList.isEmpty()) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.tencent.mm.plugin.honey_pay.model.HoneyPayCardType((r45.av3) it.next()));
            }
        }
        android.content.Intent intent = new android.content.Intent(honeyPayMainUI, (java.lang.Class<?>) com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI.class);
        intent.putParcelableArrayListExtra("key_card_type_list", arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(honeyPayMainUI, arrayList2.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayMainUI", "gotoSelectCardTypeUI", "(Ljava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        honeyPayMainUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(honeyPayMainUI, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayMainUI", "gotoSelectCardTypeUI", "(Ljava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
