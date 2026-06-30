package ix3;

/* loaded from: classes.dex */
public final class z2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.b3 f295621d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(ix3.b3 b3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f295621d = b3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ix3.z2(this.f295621d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ix3.z2 z2Var = (ix3.z2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        j75.f stateCenter;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.dp5 dp5Var = new r45.dp5();
        ix3.b3 b3Var = this.f295621d;
        byte[] byteArrayExtra = b3Var.getIntent().getByteArrayExtra("key_config_item");
        if (byteArrayExtra != null) {
            dp5Var.parseFrom(byteArrayExtra);
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = b3Var.P6();
        if (P6 != null && (stateCenter = P6.getStateCenter()) != null) {
            stateCenter.B3(new hx3.a(dp5Var));
        }
        return jz5.f0.f302826a;
    }
}
