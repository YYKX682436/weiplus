package pk2;

/* loaded from: classes3.dex */
public final class y2 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.b3 f356392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f356393e;

    public y2(pk2.b3 b3Var, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f356392d = b3Var;
        this.f356393e = e3Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        this.f356392d.w(this.f356393e, (r45.ze2) obj);
        return jz5.f0.f302826a;
    }
}
