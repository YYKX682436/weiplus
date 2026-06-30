package dk2;

/* loaded from: classes.dex */
public final class i9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f233617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233618e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(kotlin.jvm.internal.f0 f0Var, android.content.Context context) {
        super(0);
        this.f233617d = f0Var;
        this.f233618e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f233618e;
        ym5.a1.f(new dk2.h9(context));
        this.f233617d.f310116d = 3;
        com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", "checkAppBrand:" + context.getResources().getString(com.tencent.mm.R.string.f491508db0));
        return jz5.f0.f302826a;
    }
}
