package gx0;

/* loaded from: classes5.dex */
public final class w7 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f277109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f277110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int[] f277111f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(gx0.w8 w8Var, int i17, int[] iArr, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f277109d = w8Var;
        this.f277110e = i17;
        this.f277111f = iArr;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new gx0.w7(this.f277109d, this.f277110e, this.f277111f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        gx0.w7 w7Var = (gx0.w7) create((kotlin.coroutines.Continuation) obj);
        jz5.f0 f0Var = jz5.f0.f302826a;
        w7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.app.Activity context = this.f277109d.getContext();
        int[] iArr = this.f277111f;
        by0.t.a(context, this.f277110e, java.util.Arrays.copyOf(iArr, iArr.length));
        return jz5.f0.f302826a;
    }
}
