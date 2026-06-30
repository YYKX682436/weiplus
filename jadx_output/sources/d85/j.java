package d85;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f227207d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.Object obj) {
        super(0);
        this.f227207d = obj;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        db5.t7.makeText(context, context.getString(com.tencent.mm.R.string.iw_, this.f227207d), 0).show();
        return jz5.f0.f302826a;
    }
}
