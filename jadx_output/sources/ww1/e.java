package ww1;

/* loaded from: classes5.dex */
public final class e implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.f f450172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y63.a f450173b;

    public e(ww1.f fVar, y63.a aVar) {
        this.f450172a = fVar;
        this.f450173b = aVar;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public final void onClick(android.view.View view) {
        ww1.a aVar = this.f450172a.f450179f;
        if (aVar != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_group_solitatire_create", false);
            y63.a aVar2 = this.f450173b;
            intent.putExtra("key_group_solitatire_key", aVar2.field_key);
            intent.putExtra("key_group_solitatire_chatroom_username", aVar2.field_username);
            intent.putExtra("KEY_GROUP_SOLITATIRE_READ_ONLY", true);
            z60.k kVar = (z60.k) i95.n0.c(z60.k.class);
            com.tencent.mm.plugin.aa.ui.n5 n5Var = ((com.tencent.mm.plugin.aa.ui.m5) aVar).f72737a;
            java.lang.String str = n5Var.f72748d.f72507m;
            ((z60.i) kVar).getClass();
            ((t63.e) i95.n0.c(t63.e.class)).wi().k(str, aVar2);
            j45.l.j(n5Var.f72748d.getContext(), "groupsolitaire", ".ui.GroupSolitatireEditUI", intent, null);
        }
    }
}
