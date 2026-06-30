package tx0;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f422510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlinx.coroutines.q qVar) {
        super(1);
        this.f422510d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((kotlinx.coroutines.r) this.f422510d).resumeWith(((kotlin.Result) obj).getValue());
        return jz5.f0.f302826a;
    }
}
