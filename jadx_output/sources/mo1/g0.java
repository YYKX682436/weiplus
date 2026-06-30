package mo1;

/* loaded from: classes10.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f330286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLitePackageListUI f330287e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLitePackageListUI roamLitePackageListUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f330287e = roamLitePackageListUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mo1.g0(this.f330287e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mo1.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f330286d;
        com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLitePackageListUI roamLitePackageListUI = this.f330287e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
                this.f330286d = 1;
                obj = r0Var.f(true, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            ((kotlinx.coroutines.flow.h3) roamLitePackageListUI.f92710d).k(new mo1.q((java.util.ArrayList) obj));
        } catch (com.tencent.mm.plugin.backup.roambackup.x1 e17) {
            kotlinx.coroutines.flow.j2 j2Var = roamLitePackageListUI.f92710d;
            java.lang.String message = e17.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            ((kotlinx.coroutines.flow.h3) j2Var).k(new mo1.o(message));
        }
        return jz5.f0.f302826a;
    }
}
