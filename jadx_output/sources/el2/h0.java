package el2;

/* loaded from: classes3.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f253804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253805e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.content.Context context, el2.i0 i0Var) {
        super(0);
        this.f253804d = context;
        this.f253805e = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.view.ka kaVar = new com.tencent.mm.plugin.finder.live.view.ka(this.f253804d);
        kaVar.W = new el2.g0(this.f253805e);
        return kaVar;
    }
}
