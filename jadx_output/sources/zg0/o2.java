package zg0;

/* loaded from: classes.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f472767d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(android.content.Intent intent) {
        super(0);
        this.f472767d = intent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f472767d.getBooleanExtra(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ZOOM, true));
    }
}
