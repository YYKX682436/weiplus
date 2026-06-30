package uw;

/* loaded from: classes.dex */
public final class s implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw.y f431507d;

    public s(uw.y yVar) {
        this.f431507d = yVar;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        pm0.v.X(new uw.q(this));
        if (z17) {
            uw.y yVar = this.f431507d;
            kotlinx.coroutines.l.d(yVar.f431525d, null, null, new uw.r(yVar, f18, f17, null), 3, null);
            return true;
        }
        uw.y yVar2 = this.f431507d;
        synchronized (this) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            yVar2.f431523b = kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("Location failed"))));
            yz5.l lVar = yVar2.f431524c;
            if (lVar != null) {
                kotlin.Result result = yVar2.f431523b;
                kotlin.jvm.internal.o.d(result);
                lVar.invoke(result);
            }
            yVar2.f431524c = null;
        }
        return false;
    }
}
