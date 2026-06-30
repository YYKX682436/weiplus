package df2;

/* loaded from: classes10.dex */
public final class ls extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f230694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f230695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.h f230696f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls(df2.lt ltVar, android.view.ViewGroup viewGroup, dk2.h hVar) {
        super(0);
        this.f230694d = ltVar;
        this.f230695e = viewGroup;
        this.f230696f = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f230695e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        df2.lt.Z6(this.f230694d, context, this.f230696f);
        return jz5.f0.f302826a;
    }
}
