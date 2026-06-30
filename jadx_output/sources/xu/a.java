package xu;

/* loaded from: classes3.dex */
public final class a implements com.tencent.mm.modelbase.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f457172d;

    public a(kotlinx.coroutines.q qVar) {
        this.f457172d = qVar;
    }

    @Override // com.tencent.mm.modelbase.v0
    public void S(long j17, long j18, com.tencent.mm.modelbase.m1 m1Var) {
        if (j17 == j18) {
            kotlinx.coroutines.q qVar = this.f457172d;
            if (((kotlinx.coroutines.r) qVar).o()) {
                return;
            }
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        }
    }
}
