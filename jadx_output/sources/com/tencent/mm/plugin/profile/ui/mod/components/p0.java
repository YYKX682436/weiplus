package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes11.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.x0 f153969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.plugin.profile.ui.mod.components.x0 x0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f153969d = x0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.ui.mod.components.p0(this.f153969d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.profile.ui.mod.components.p0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = com.tencent.mm.plugin.profile.ui.mod.components.x0.f154004s;
        com.tencent.mm.plugin.profile.ui.mod.components.x0 x0Var = this.f153969d;
        com.tencent.mm.storage.z3 W6 = x0Var.W6();
        if (W6 == null) {
            return null;
        }
        com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = (com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView) x0Var.f311393h;
        java.util.ArrayList<java.lang.String> phoneNumberList = profileEditPhoneNumberView != null ? profileEditPhoneNumberView.getPhoneNumberList() : null;
        if (phoneNumberList != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<java.lang.String> it = phoneNumberList.iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                if (aq1.e.d(next)) {
                    arrayList.add(next);
                }
            }
            W6.a3(com.tencent.mm.contact.a.a(arrayList));
            com.tencent.mm.contact.a.d(W6);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(W6.d1(), W6);
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModPhoneUIC", "doSaveLocalAfterRequest: " + W6.E1);
        }
        return jz5.f0.f302826a;
    }
}
