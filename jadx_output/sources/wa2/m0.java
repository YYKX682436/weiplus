package wa2;

/* loaded from: classes3.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f444149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wa2.n0 f444150e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.content.Context context, wa2.n0 n0Var) {
        super(0);
        this.f444149d = context;
        this.f444150e = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new android.view.GestureDetector(this.f444149d, this.f444150e);
    }
}
