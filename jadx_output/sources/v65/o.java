package v65;

/* loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f433583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.coroutines.SequenceLifecycleScope f433584e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.lifecycle.y yVar, com.tencent.mm.sdk.coroutines.SequenceLifecycleScope sequenceLifecycleScope) {
        super(0);
        this.f433583d = yVar;
        this.f433584e = sequenceLifecycleScope;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.y yVar = this.f433583d;
        androidx.lifecycle.n b17 = yVar.mo133getLifecycle().b();
        androidx.lifecycle.n nVar = androidx.lifecycle.n.DESTROYED;
        com.tencent.mm.sdk.coroutines.SequenceLifecycleScope sequenceLifecycleScope = this.f433584e;
        if (b17 != nVar) {
            yVar.mo133getLifecycle().a(sequenceLifecycleScope);
        } else {
            sequenceLifecycleScope.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.SequenceLifecycleScope", sequenceLifecycleScope.hashCode() + " run empty block and trigger destroy");
        }
        return jz5.f0.f302826a;
    }
}
