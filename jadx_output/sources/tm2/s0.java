package tm2;

/* loaded from: classes3.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.b f420578d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(fm2.b bVar) {
        super(0);
        this.f420578d = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.b bVar = this.f420578d;
        android.view.View findViewById = bVar.findViewById(com.tencent.mm.R.id.ely);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.h8((android.view.ViewGroup) findViewById, bVar);
    }
}
