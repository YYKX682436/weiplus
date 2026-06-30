package df2;

/* loaded from: classes3.dex */
public final class jm implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lm f230488d;

    public jm(df2.lm lmVar) {
        this.f230488d = lmVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.nh1 nh1Var = (r45.nh1) obj;
        boolean z17 = false;
        if (nh1Var != null && nh1Var.getInteger(0) == 2) {
            z17 = true;
        }
        if (z17) {
            df2.lm lmVar = this.f230488d;
            lmVar.f230674n = true;
            lmVar.c(1);
        }
        return jz5.f0.f302826a;
    }
}
