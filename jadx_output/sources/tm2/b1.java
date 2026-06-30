package tm2;

/* loaded from: classes3.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.b f420489d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(fm2.b bVar) {
        super(0);
        this.f420489d = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.b bVar = this.f420489d;
        android.view.View findViewById = bVar.findViewById(com.tencent.mm.R.id.f_t);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = bVar.findViewById(com.tencent.mm.R.id.f484804fl0);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        return new zi2.w((android.view.ViewGroup) findViewById, bVar, (com.tencent.mm.plugin.finder.live.view.FinderLiveShadeView) findViewById2, (android.view.ViewGroup) bVar.findViewById(com.tencent.mm.R.id.f_x));
    }
}
