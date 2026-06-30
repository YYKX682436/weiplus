package tl4;

/* loaded from: classes11.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl4.h f420306d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(tl4.h hVar) {
        super(0);
        this.f420306d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = this.f420306d.f420308a.getSystemService("notification");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (android.app.NotificationManager) systemService;
    }
}
