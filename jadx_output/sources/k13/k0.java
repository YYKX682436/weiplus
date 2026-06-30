package k13;

/* loaded from: classes5.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI f303230d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI forceNotifyShowUI) {
        super(0);
        this.f303230d = forceNotifyShowUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = this.f303230d.getContext().getSystemService("vibrator");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        return (android.os.Vibrator) systemService;
    }
}
