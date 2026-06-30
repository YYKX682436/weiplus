package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes10.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154034e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f154035f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.lang.String str, java.lang.String str2, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f154033d = str;
        this.f154034e = str2;
        this.f154035f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.c0(this.f154033d, this.f154034e, this.f154035f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.c0 c0Var = (com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        mr3.l a17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        fc0.e eVar = (fc0.e) i95.n0.c(fc0.e.class);
        java.lang.String str = this.f154034e;
        java.lang.String str2 = this.f154033d;
        java.lang.String Ai = ((br3.f) eVar).Ai(str2, str);
        if (Ai != null && (a17 = mr3.l.f330874n.a(str2, Ai, 3)) != null) {
            this.f154035f.add(a17);
        }
        return jz5.f0.f302826a;
    }
}
