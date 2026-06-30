package dk2;

/* loaded from: classes.dex */
public final class m9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233767d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(android.content.Context context) {
        super(0);
        this.f233767d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f233767d;
        db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.dax), 0).show();
        com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", java.lang.String.valueOf(context.getResources().getString(com.tencent.mm.R.string.dax)));
        return jz5.f0.f302826a;
    }
}
