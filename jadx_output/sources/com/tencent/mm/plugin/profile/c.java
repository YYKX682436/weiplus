package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f153399d;

    /* renamed from: e, reason: collision with root package name */
    public int f153400e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f153401f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.o f153402g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z17, com.tencent.mm.plugin.profile.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f153401f = z17;
        this.f153402g = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.c(this.f153401f, this.f153402g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.profile.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f153400e;
        com.tencent.mm.plugin.profile.o oVar = this.f153402g;
        int i18 = 0;
        kotlin.jvm.internal.i iVar = null;
        int i19 = 1;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "biz", null, false, null, 28, null);
            jz5.l[] lVarArr = new jz5.l[2];
            lVarArr[0] = new jz5.l("isPhotoAccount", java.lang.Boolean.valueOf(this.f153401f));
            com.tencent.mm.storage.z3 z3Var = oVar.f153542b;
            java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
            if (d17 == null) {
                d17 = "";
            }
            lVarArr[1] = new jz5.l(dm.i4.COL_USERNAME, d17);
            java.util.Map l17 = kz5.c1.l(lVarArr);
            this.f153399d = l1Var;
            this.f153400e = 1;
            if (l1Var.o("interaction", l17, this) == aVar) {
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
            l1Var = (pi0.l1) this.f153399d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        l1Var.a(kz5.c0.i(new com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin(), new lx.y5(), new lx.i2(), new lx.w5(), new lx.w(i18, i19, iVar), new lx.v2()));
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = oVar.f153541a;
        this.f153399d = null;
        this.f153400e = 2;
        s17 = l1Var.s(contactInfoUI, flutterPageStyle, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, this);
        if (s17 == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
