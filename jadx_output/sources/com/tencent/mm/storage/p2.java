package com.tencent.mm.storage;

/* loaded from: classes9.dex */
public final class p2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.s1 f195210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f195211e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f195212f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f195213g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.tencent.mm.storage.s1 s1Var, java.util.Map map, int i17, android.content.Context context) {
        super(0);
        this.f195210d = s1Var;
        this.f195211e = map;
        this.f195212f = i17;
        this.f195213g = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f195210d.field_talker;
        java.lang.String str2 = (java.lang.String) this.f195211e.get(".msg.appmsg.mmreader." + com.tencent.mm.storage.s2.g(this.f195212f) + ".publisher_username");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str = str2;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("Contact_Scene", 268);
        j45.l.j(this.f195213g, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "jump to profile");
        return jz5.f0.f302826a;
    }
}
