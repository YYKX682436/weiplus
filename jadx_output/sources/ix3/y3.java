package ix3;

/* loaded from: classes.dex */
public final class y3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.c4 f295616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(ix3.c4 c4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f295616d = c4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ix3.y3(this.f295616d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ix3.y3 y3Var = (ix3.y3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        j75.f stateCenter;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.dp5 dp5Var = new r45.dp5();
        ix3.c4 c4Var = this.f295616d;
        byte[] byteArrayExtra = c4Var.getIntent().getByteArrayExtra("key_config_item_list");
        if (byteArrayExtra != null) {
            dp5Var.parseFrom(byteArrayExtra);
        }
        c4Var.T6(dp5Var);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = c4Var.P6();
        if (P6 != null && (stateCenter = P6.getStateCenter()) != null) {
            stateCenter.B3(new hx3.d(c4Var.f295380e));
        }
        return jz5.f0.f302826a;
    }
}
