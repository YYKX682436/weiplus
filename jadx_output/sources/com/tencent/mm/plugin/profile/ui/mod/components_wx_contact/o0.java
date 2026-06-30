package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes11.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.w0 f154110d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.w0 w0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f154110d = w0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.o0(this.f154110d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.w0 w0Var = this.f154110d;
        com.tencent.mm.contact.o U6 = w0Var.U6();
        if (U6 == null) {
            return null;
        }
        com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = (com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView) w0Var.f311480h;
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
            java.lang.String a17 = com.tencent.mm.contact.a.a(arrayList);
            kotlin.jvm.internal.o.f(a17, "getContactPhoneNumListStr(...)");
            yq3.v vVar = (yq3.v) U6;
            vVar.f464551v.b(vVar, yq3.v.f464529z[3], a17);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doSaveLocalAfterRequest: ");
            java.lang.String[] b17 = com.tencent.mm.contact.a.b(vVar.f464535f);
            kotlin.jvm.internal.o.f(b17, "getSepPhone(...)");
            sb6.append(kz5.z.I(b17));
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModPhoneUIC", sb6.toString());
        }
        return jz5.f0.f302826a;
    }
}
