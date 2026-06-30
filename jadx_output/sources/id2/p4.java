package id2;

/* loaded from: classes.dex */
public final class p4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f290741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f290742e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(android.app.Activity activity, yz5.l lVar) {
        super(1);
        this.f290741d = activity;
        this.f290742e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yz5.l lVar = this.f290742e;
        if (booleanValue) {
            android.app.Activity activity = this.f290741d;
            db5.t7.h(activity, activity.getResources().getString(com.tencent.mm.R.string.mao));
            lVar.invoke(java.lang.Boolean.TRUE);
        } else {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f302826a;
    }
}
