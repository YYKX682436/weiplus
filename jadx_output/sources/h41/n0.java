package h41;

/* loaded from: classes11.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.o0 f278831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f278832e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(h41.o0 o0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278831d = o0Var;
        this.f278832e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h41.n0(this.f278831d, this.f278832e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((h41.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        h41.o0 o0Var = this.f278831d;
        boolean z17 = o0Var.f278845k;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCMsgUI", "showAsync: skip after released");
            return f0Var;
        }
        int i17 = h41.o0.f278834f + 1;
        h41.o0.f278834f = i17;
        o0Var.f278841e = i17;
        h41.o0.f278835g.put(new java.lang.Integer(i17), o0Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showAsync: ");
        sb6.append(o0Var.f278841e);
        sb6.append(" username=");
        java.lang.String username = this.f278832e;
        sb6.append(username);
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCMsgUI", sb6.toString());
        int i18 = com.tencent.mm.open_voice_control.card.SendMsgCard.f72243v;
        int i19 = o0Var.f278841e;
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mars.xlog.Log.i("MicroMsg.OVC.SendMsgCard", "show uiId=" + i19 + ", username=" + username);
        android.app.Activity a17 = com.tencent.mm.open_voice_control.card.A2ACardActivity.B.a();
        if (a17 instanceof com.tencent.mm.open_voice_control.card.A2ACardActivity) {
            com.tencent.mars.xlog.Log.i("MicroMsg.A2AActivity", "openSendMsg: reuse existing A2ACardActivity");
            ((com.tencent.mm.open_voice_control.card.A2ACardActivity) a17).V6(i19, username);
        } else {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (context == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.A2AActivity", "openSendMsg: no available context, cannot show card");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.A2AActivity", "openSendMsg: start new A2ACardActivity");
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.open_voice_control.card.A2ACardActivity.class);
                intent.putExtra("ui_id", i19);
                intent.putExtra(dm.i4.COL_USERNAME, username);
                f41.c cVar = f41.c.f259470d;
                intent.putExtra("card_type", 1);
                intent.addFlags(268435456);
                android.os.Bundle bundle = android.app.ActivityOptions.makeCustomAnimation(context, com.tencent.mm.R.anim.f477721i, com.tencent.mm.R.anim.f477722j).toBundle();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(bundle);
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/open_voice_control/card/A2ACardActivity$Companion", "openSendMsg", "(ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
                context.startActivity((android.content.Intent) arrayList.get(0), (android.os.Bundle) arrayList.get(1));
                yj0.a.f(context, "com/tencent/mm/open_voice_control/card/A2ACardActivity$Companion", "openSendMsg", "(ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            }
        }
        return f0Var;
    }
}
