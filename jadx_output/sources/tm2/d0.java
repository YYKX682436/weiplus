package tm2;

/* loaded from: classes3.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.b f420498d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(fm2.b bVar) {
        super(0);
        this.f420498d = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.b bVar = this.f420498d;
        android.view.View findViewById = bVar.findViewById(com.tencent.mm.R.id.f8v);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.ww((android.view.ViewGroup) findViewById, bVar);
    }
}
