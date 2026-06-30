package jq4;

/* loaded from: classes5.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jq4.y f301188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f301189e;

    public r(jq4.y yVar, java.lang.String str) {
        this.f301188d = yVar;
        this.f301189e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$showFinishCard$3$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jq4.y yVar = this.f301188d;
        int i17 = yVar.f301239h;
        long j17 = yVar.f301238g;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "voip_banner_after_reject");
        hashMap.put("voip_roomid", java.lang.Integer.valueOf(i17));
        hashMap.put("voip_roomKey", java.lang.Long.valueOf(j17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 26804);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("roomId", yVar.f301239h);
        intent.putExtra("roomKey", yVar.f301238g);
        yn.g.a(intent, jq4.a0.class);
        intent.putExtra("chat_from_scene", 9);
        ((sy.z) ((ty.j0) i95.n0.c(ty.j0.class))).Ai(this.f301189e, intent);
        wu5.c cVar = yVar.f301222w;
        if (cVar != null) {
            cVar.cancel(false);
        }
        jq4.y yVar2 = this.f301188d;
        yVar2.f301222w = null;
        jq4.z0.c(yVar2, true, false, false, 6, null);
        yj0.a.h(this, "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$showFinishCard$3$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
