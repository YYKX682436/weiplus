package tm2;

/* loaded from: classes3.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.b f420483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(fm2.b bVar) {
        super(0);
        this.f420483d = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.b bVar = this.f420483d;
        android.view.View findViewById = bVar.findViewById(com.tencent.mm.R.id.ej7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.d1((android.view.ViewGroup) findViewById, bVar);
    }
}
