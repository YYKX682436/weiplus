package dk2;

/* loaded from: classes.dex */
public final class d8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f233324e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(android.content.Context context, yz5.p pVar) {
        super(0);
        this.f233323d = context;
        this.f233324e = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f233323d;
        db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.elf), 0).show();
        com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", "checkFloatVideo:" + context.getResources().getString(com.tencent.mm.R.string.elf));
        this.f233324e.invoke(java.lang.Boolean.FALSE, "float_video");
        return jz5.f0.f302826a;
    }
}
