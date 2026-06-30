package h41;

/* loaded from: classes11.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.y0 f278881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f278882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f278883f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(h41.y0 y0Var, java.lang.String str, java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278881d = y0Var;
        this.f278882e = str;
        this.f278883f = arrayList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h41.w0(this.f278881d, this.f278882e, this.f278883f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((h41.w0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        h41.y0 y0Var = this.f278881d;
        boolean z17 = y0Var.f278901j;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCSelectContactUI", "show: skip after released");
            return f0Var;
        }
        int i17 = h41.y0.f278891e + 1;
        h41.y0.f278891e = i17;
        y0Var.f278897d = i17;
        h41.y0.f278892f.put(new java.lang.Integer(i17), y0Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show: ");
        sb6.append(y0Var.f278897d);
        sb6.append(" scene=");
        java.lang.String str = this.f278882e;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCSelectContactUI", sb6.toString());
        int i18 = com.tencent.mm.open_voice_control.card.SelectContactCard.f72234p;
        int i19 = y0Var.f278897d;
        java.lang.String[] usernames = (java.lang.String[]) this.f278883f.toArray(new java.lang.String[0]);
        f41.n a17 = h41.y0.a(y0Var, str);
        kotlin.jvm.internal.o.g(usernames, "usernames");
        com.tencent.mars.xlog.Log.i("MicroMsg.OVC.SelectContactCard", "show uiId=" + i19 + ", usernames=" + kz5.z.d0(usernames, ",", null, null, 0, null, null, 62, null) + ", scene=" + a17);
        android.app.Activity a18 = com.tencent.mm.open_voice_control.card.A2ACardActivity.B.a();
        if (a18 instanceof com.tencent.mm.open_voice_control.card.A2ACardActivity) {
            com.tencent.mars.xlog.Log.i("MicroMsg.A2AActivity", "openSelectContact: reuse existing A2ACardActivity");
            ((com.tencent.mm.open_voice_control.card.A2ACardActivity) a18).U6(i19, usernames, a17);
        } else {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (context == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.A2AActivity", "openSelectContact: no available context, cannot show card");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.A2AActivity", "openSelectContact: start new A2ACardActivity");
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.open_voice_control.card.A2ACardActivity.class);
                intent.putExtra("ui_id", i19);
                intent.putExtra("usernames", usernames);
                f41.c cVar = f41.c.f259470d;
                intent.putExtra("card_type", 0);
                intent.putExtra("select_contact_scene", a17.ordinal());
                intent.addFlags(268435456);
                android.os.Bundle bundle = android.app.ActivityOptions.makeCustomAnimation(context, com.tencent.mm.R.anim.f477721i, 0).toBundle();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(bundle);
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/open_voice_control/card/A2ACardActivity$Companion", "openSelectContact", "(I[Ljava/lang/String;Lcom/tencent/mm/open_voice_control/card/SelectContactCard$Scene;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
                context.startActivity((android.content.Intent) arrayList.get(0), (android.os.Bundle) arrayList.get(1));
                yj0.a.f(context, "com/tencent/mm/open_voice_control/card/A2ACardActivity$Companion", "openSelectContact", "(I[Ljava/lang/String;Lcom/tencent/mm/open_voice_control/card/SelectContactCard$Scene;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            }
        }
        return f0Var;
    }
}
