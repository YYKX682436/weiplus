package s;

/* loaded from: classes16.dex */
public final class h extends qz5.l implements yz5.p {
    public final /* synthetic */ s.i L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(s.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.L = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new s.h(this.L, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((s.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        s.i iVar = this.L;
        boolean z17 = iVar.f401838h;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCLoadingUI", "show: skip after released");
            return f0Var;
        }
        int i17 = s.i.f401829j + 1;
        s.i.f401829j = i17;
        iVar.f401836f = i17;
        s.i.f401830k.put(new java.lang.Integer(i17), iVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCLoadingUI", "show: " + iVar.f401836f);
        int i18 = com.tencent.mm.open_voice_control.card.LoadingCard.Y1;
        int i19 = iVar.f401836f;
        com.tencent.mars.xlog.Log.i("MicroMsg.OVC.LoadingCard", "show uiId=" + i19);
        android.app.Activity a17 = com.tencent.mm.open_voice_control.card.A2ACardActivity.B.a();
        if (a17 instanceof com.tencent.mm.open_voice_control.card.A2ACardActivity) {
            com.tencent.mars.xlog.Log.i("MicroMsg.A2AActivity", "openLoading: reuse existing A2ACardActivity");
            com.tencent.mm.open_voice_control.card.A2ACardActivity a2ACardActivity = (com.tencent.mm.open_voice_control.card.A2ACardActivity) a17;
            a2ACardActivity.getClass();
            com.tencent.mm.open_voice_control.card.LoadingCard loadingCard = new com.tencent.mm.open_voice_control.card.LoadingCard();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("ui_id", i19);
            loadingCard.setArguments(bundle);
            a2ACardActivity.T6(loadingCard);
        } else {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (context == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.A2AActivity", "openLoading: no available context, cannot show card");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.A2AActivity", "openLoading: start new A2ACardActivity");
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.open_voice_control.card.A2ACardActivity.class);
                intent.putExtra("ui_id", i19);
                f41.c cVar = f41.c.f259470d;
                intent.putExtra("card_type", 3);
                intent.addFlags(268435456);
                android.os.Bundle bundle2 = android.app.ActivityOptions.makeCustomAnimation(context, com.tencent.mm.R.anim.f477721i, 0).toBundle();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(bundle2);
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/open_voice_control/card/A2ACardActivity$Companion", "openLoading", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
                context.startActivity((android.content.Intent) arrayList.get(0), (android.os.Bundle) arrayList.get(1));
                yj0.a.f(context, "com/tencent/mm/open_voice_control/card/A2ACardActivity$Companion", "openLoading", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            }
        }
        return f0Var;
    }
}
