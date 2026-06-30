package pa5;

/* loaded from: classes13.dex */
public final class i implements u3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pa5.p f353107a;

    public i(pa5.p pVar) {
        this.f353107a = pVar;
    }

    @Override // u3.p
    public final void a(u3.s sVar, boolean z17, float f17, float f18) {
        pa5.p pVar = this.f353107a;
        if (pVar != null) {
            ua5.d dVar = (ua5.d) pVar;
            java.util.List list = dVar.f425982a.f425988c;
            kotlin.jvm.internal.m0.a(list).remove(dVar.f425983b.f310123d);
        }
    }
}
