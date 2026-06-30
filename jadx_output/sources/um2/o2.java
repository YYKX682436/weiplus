package um2;

/* loaded from: classes3.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428906d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(fm2.c cVar) {
        super(0);
        this.f428906d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.c cVar = this.f428906d;
        android.view.View findViewById = cVar.findViewById(com.tencent.mm.R.id.ffg);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        return new com.tencent.mm.plugin.finder.live.plugin.ua((android.view.ViewGroup) findViewById, cVar);
    }
}
