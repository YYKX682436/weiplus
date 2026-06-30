package kz3;

/* loaded from: classes15.dex */
public final class g implements uy3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kz3.l f313877a;

    public g(kz3.l lVar) {
        this.f313877a = lVar;
    }

    @Override // uy3.p
    public void onClick(android.view.View view) {
        kz3.l lVar = this.f313877a;
        kz3.p pVar = lVar.f313893k;
        if (pVar == null) {
            return;
        }
        if ((lVar.f313886d instanceof db5.f0) || lVar.f313888f != null) {
            kz3.w wVar = lVar.f313894l;
            kotlin.jvm.internal.o.d(pVar);
            wVar.c(pVar.k() / 2.0f, 0.0f);
        }
    }
}
