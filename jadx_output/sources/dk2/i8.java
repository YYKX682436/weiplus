package dk2;

/* loaded from: classes.dex */
public final class i8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f233616e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(android.content.Context context, yz5.p pVar) {
        super(0);
        this.f233615d = context;
        this.f233616e = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f233615d;
        db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.dax), 0).show();
        com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", java.lang.String.valueOf(context.getResources().getString(com.tencent.mm.R.string.dax)));
        this.f233616e.invoke(java.lang.Boolean.FALSE, "calling");
        return jz5.f0.f302826a;
    }
}
