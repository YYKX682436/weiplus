package sn2;

/* loaded from: classes11.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sn2.b f410117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sn2.b bVar) {
        super(0);
        this.f410117d = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = this.f410117d.f410118a.getSystemService("notification");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (android.app.NotificationManager) systemService;
    }
}
