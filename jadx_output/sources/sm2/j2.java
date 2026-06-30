package sm2;

/* loaded from: classes3.dex */
public final class j2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(fm2.a aVar) {
        super(0);
        this.f409516d = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.a aVar = this.f409516d;
        android.view.View findViewById = aVar.findViewById(com.tencent.mm.R.id.f484857fq5);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        return new com.tencent.mm.plugin.finder.live.plugin.f10((android.view.ViewGroup) findViewById, aVar);
    }
}
