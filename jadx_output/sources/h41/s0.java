package h41;

/* loaded from: classes11.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.t0 f278854d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(h41.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278854d = t0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h41.s0(this.f278854d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((h41.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        h41.t0 t0Var = this.f278854d;
        boolean z17 = t0Var.f278868j;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCPermissionRequestUI", "show: skip after released");
            return f0Var;
        }
        int i17 = h41.t0.f278858e + 1;
        h41.t0.f278858e = i17;
        t0Var.f278864d = i17;
        h41.t0.f278859f.put(new java.lang.Integer(i17), t0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCPermissionRequestUI", "show: " + t0Var.f278864d);
        int i18 = com.tencent.mm.open_voice_control.card.PermissionRequestCard.f72226o;
        int i19 = t0Var.f278864d;
        com.tencent.mars.xlog.Log.i("MicroMsg.OVC.PermissionRequestCard", "show uiId=" + i19);
        android.app.Activity a17 = com.tencent.mm.open_voice_control.card.A2ACardActivity.B.a();
        if (a17 instanceof com.tencent.mm.open_voice_control.card.A2ACardActivity) {
            com.tencent.mars.xlog.Log.i("MicroMsg.A2AActivity", "openPermissionRequest: reuse existing A2ACardActivity");
            com.tencent.mm.open_voice_control.card.A2ACardActivity a2ACardActivity = (com.tencent.mm.open_voice_control.card.A2ACardActivity) a17;
            a2ACardActivity.getClass();
            com.tencent.mm.open_voice_control.card.PermissionRequestCard permissionRequestCard = new com.tencent.mm.open_voice_control.card.PermissionRequestCard();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("ui_id", i19);
            permissionRequestCard.setArguments(bundle);
            a2ACardActivity.T6(permissionRequestCard);
        } else {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (context == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.A2AActivity", "openPermissionRequest: no available context, cannot show card");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.A2AActivity", "openPermissionRequest: start new A2ACardActivity");
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.open_voice_control.card.A2ACardActivity.class);
                intent.putExtra("ui_id", i19);
                f41.c cVar = f41.c.f259470d;
                intent.putExtra("card_type", 2);
                intent.addFlags(268435456);
                android.os.Bundle bundle2 = android.app.ActivityOptions.makeCustomAnimation(context, com.tencent.mm.R.anim.f477721i, 0).toBundle();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(bundle2);
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/open_voice_control/card/A2ACardActivity$Companion", "openPermissionRequest", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
                context.startActivity((android.content.Intent) arrayList.get(0), (android.os.Bundle) arrayList.get(1));
                yj0.a.f(context, "com/tencent/mm/open_voice_control/card/A2ACardActivity$Companion", "openPermissionRequest", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            }
        }
        return f0Var;
    }
}
