package mo1;

/* loaded from: classes5.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f330308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI f330309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f330310f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.n0 f330311g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qo1.i0 f330312h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI roamLiteTaskDetailUI, qo1.j0 j0Var, com.tencent.wechat.aff.affroam.n0 n0Var, qo1.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f330309e = roamLiteTaskDetailUI;
        this.f330310f = j0Var;
        this.f330311g = n0Var;
        this.f330312h = i0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mo1.n0(this.f330309e, this.f330310f, this.f330311g, this.f330312h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mo1.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f330308d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f330308d = 1;
            if (com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI.U6(this.f330309e, this.f330310f, this.f330311g, this.f330312h, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
