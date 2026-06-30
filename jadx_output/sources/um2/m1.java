package um2;

/* loaded from: classes3.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428876d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(fm2.c cVar) {
        super(0);
        this.f428876d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.c cVar = this.f428876d;
        android.view.View findViewById = cVar.findViewById(com.tencent.mm.R.id.ihj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.ej0((android.view.ViewGroup) findViewById, cVar);
    }
}
