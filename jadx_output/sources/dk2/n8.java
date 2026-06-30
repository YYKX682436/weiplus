package dk2;

/* loaded from: classes.dex */
public final class n8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(android.content.Context context) {
        super(0);
        this.f233803d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f233803d;
        db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.elf), 0).show();
        com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", "checkFloatVideo:" + context.getResources().getString(com.tencent.mm.R.string.elf));
        return jz5.f0.f302826a;
    }
}
