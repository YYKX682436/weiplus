package dk2;

/* loaded from: classes.dex */
public final class u8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f234201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(android.content.Context context) {
        super(0);
        this.f234201d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f234201d;
        db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.f491508db0), 0).show();
        com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", "checkVoip:" + context.getResources().getString(com.tencent.mm.R.string.f491508db0));
        return jz5.f0.f302826a;
    }
}
