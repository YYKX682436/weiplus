package fi2;

/* loaded from: classes10.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi2.w f262899d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(fi2.w wVar) {
        super(0);
        this.f262899d = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fi2.w wVar = this.f262899d;
        android.content.Context context = wVar.f262915a.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        zi2.w wVar2 = wVar.f262915a;
        return new mh2.n0(context, wVar2, wVar2);
    }
}
