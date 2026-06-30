package dk2;

/* loaded from: classes.dex */
public final class a9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f233193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233194e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(kotlin.jvm.internal.f0 f0Var, android.content.Context context) {
        super(0);
        this.f233193d = f0Var;
        this.f233194e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f233194e;
        ym5.a1.f(new dk2.z8(context));
        this.f233193d.f310116d = 3;
        com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", java.lang.String.valueOf(context.getResources().getString(com.tencent.mm.R.string.dax)));
        return jz5.f0.f302826a;
    }
}
