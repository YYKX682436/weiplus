package sm2;

/* loaded from: classes3.dex */
public final class z6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409816d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(fm2.a aVar) {
        super(0);
        this.f409816d = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.a aVar = this.f409816d;
        android.view.View findViewById = aVar.findViewById(com.tencent.mm.R.id.f_t);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = aVar.findViewById(com.tencent.mm.R.id.f484804fl0);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        return new zi2.w((android.view.ViewGroup) findViewById, aVar, (com.tencent.mm.plugin.finder.live.view.FinderLiveShadeView) findViewById2, (android.view.ViewGroup) aVar.findViewById(com.tencent.mm.R.id.f_x));
    }
}
