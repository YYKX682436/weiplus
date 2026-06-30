package ev0;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f256847d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kotlinx.coroutines.q qVar) {
        super(2);
        this.f256847d = qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Boolean) obj).booleanValue();
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        ((kotlinx.coroutines.r) this.f256847d).resumeWith(kotlin.Result.m521constructorimpl(com.tencent.mm.vfs.w6.i((java.lang.String) obj2, false)));
        return jz5.f0.f302826a;
    }
}
