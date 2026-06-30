package fi2;

/* loaded from: classes10.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi2.w f262840d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(zi2.w wVar) {
        super(0);
        this.f262840d = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zi2.w wVar = this.f262840d;
        android.content.Context context = wVar.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new gj2.e(context, wVar, wVar);
    }
}
