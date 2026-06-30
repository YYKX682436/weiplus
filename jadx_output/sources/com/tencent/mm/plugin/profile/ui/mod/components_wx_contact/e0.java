package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes10.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f154045d;

    /* renamed from: e, reason: collision with root package name */
    public int f154046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154047f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154048g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 f154049h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f154050i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var, com.tencent.mm.ui.widget.dialog.f4 f4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f154047f = str;
        this.f154048g = str2;
        this.f154049h = i0Var;
        this.f154050i = f4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.e0(this.f154047f, this.f154048g, this.f154049h, this.f154050i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List arrayList;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f154046e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            arrayList = new java.util.ArrayList();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.c0 c0Var = new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.c0(this.f154047f, this.f154048g, arrayList, null);
            this.f154045d = arrayList;
            this.f154046e = 1;
            if (kotlinx.coroutines.l.g(p0Var, c0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            arrayList = (java.util.List) this.f154045d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.d0 d0Var = new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.d0(this.f154049h, arrayList, this.f154050i, null);
        this.f154045d = null;
        this.f154046e = 2;
        if (kotlinx.coroutines.l.g(g3Var, d0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
