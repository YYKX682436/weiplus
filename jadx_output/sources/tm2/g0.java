package tm2;

/* loaded from: classes3.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.b f420511d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(fm2.b bVar) {
        super(0);
        this.f420511d = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.b bVar = this.f420511d;
        android.view.View findViewById = bVar.findViewById(com.tencent.mm.R.id.ffg);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        return new com.tencent.mm.plugin.finder.live.plugin.ua((android.view.ViewGroup) findViewById, bVar);
    }
}
