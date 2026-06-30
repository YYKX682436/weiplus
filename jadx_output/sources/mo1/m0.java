package mo1;

/* loaded from: classes5.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f330303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI f330304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f330305f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f330306g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI roamLiteTaskDetailUI, qo1.f0 f0Var, float f17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f330304e = roamLiteTaskDetailUI;
        this.f330305f = f0Var;
        this.f330306g = f17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mo1.m0(this.f330304e, this.f330305f, this.f330306g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mo1.m0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f330303d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f330303d = 1;
            java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI.f92712o;
            if (this.f330304e.a7(this.f330305f, this.f330306g, this) == aVar) {
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
