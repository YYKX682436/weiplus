package dk2;

/* loaded from: classes.dex */
public final class k8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f233693e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(android.content.Context context, yz5.p pVar) {
        super(0);
        this.f233692d = context;
        this.f233693e = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f233692d;
        db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.f491508db0), 0).show();
        this.f233693e.invoke(java.lang.Boolean.FALSE, "voip");
        return jz5.f0.f302826a;
    }
}
