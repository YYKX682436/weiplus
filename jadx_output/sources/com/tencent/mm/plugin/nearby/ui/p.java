package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes8.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.q f152195d;

    public p(com.tencent.mm.plugin.nearby.ui.q qVar) {
        this.f152195d = qVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        gm0.j1.u().c().w(4103, java.lang.Boolean.TRUE);
        gm0.j1.u().c().w(4104, java.lang.Boolean.FALSE);
        c01.fb b17 = c01.fb.b();
        com.tencent.mm.plugin.nearby.ui.q qVar = this.f152195d;
        if (b17 == null) {
            com.tencent.mm.plugin.nearby.ui.NearbyFriendsIntroUI nearbyFriendsIntroUI = qVar.f152198d;
            android.content.Intent intent = new android.content.Intent(qVar.f152198d, (java.lang.Class<?>) com.tencent.mm.plugin.nearby.ui.NearbyPersonalInfoUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(nearbyFriendsIntroUI, arrayList.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            nearbyFriendsIntroUI.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(nearbyFriendsIntroUI, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            java.lang.String d17 = b17.d();
            if (d17 == null) {
                d17 = "";
            }
            b17.c();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            int j17 = com.tencent.mm.sdk.platformtools.t8.j1(java.lang.Integer.valueOf(b17.f37188b), 0);
            if (d17.equals("") || j17 == 0) {
                com.tencent.mm.plugin.nearby.ui.NearbyFriendsIntroUI nearbyFriendsIntroUI2 = qVar.f152198d;
                android.content.Intent intent2 = new android.content.Intent(qVar.f152198d, (java.lang.Class<?>) com.tencent.mm.plugin.nearby.ui.NearbyPersonalInfoUI.class);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(nearbyFriendsIntroUI2, arrayList2.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                nearbyFriendsIntroUI2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(nearbyFriendsIntroUI2, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                com.tencent.mm.plugin.nearby.ui.NearbyFriendsIntroUI nearbyFriendsIntroUI3 = qVar.f152198d;
                android.content.Intent intent3 = new android.content.Intent(qVar.f152198d, (java.lang.Class<?>) com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.class);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent3);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(nearbyFriendsIntroUI3, arrayList3.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                nearbyFriendsIntroUI3.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(nearbyFriendsIntroUI3, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).Ni(14L);
        qVar.f152198d.finish();
    }
}
