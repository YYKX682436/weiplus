package tm2;

/* loaded from: classes3.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.b f420617d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(fm2.b bVar) {
        super(0);
        this.f420617d = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.b bVar = this.f420617d;
        android.view.View findViewById = bVar.findViewById(com.tencent.mm.R.id.fff);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.r30((android.view.ViewGroup) findViewById, bVar);
    }
}
