package hq5;

/* loaded from: classes5.dex */
public class m extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f283244d;

    /* renamed from: e, reason: collision with root package name */
    public final int f283245e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f283246f;

    /* renamed from: g, reason: collision with root package name */
    public int f283247g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f283248h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f283244d = "MicroMsg.WeDrop.WeDropNotificationPushUIC";
        this.f283245e = 539361808;
        this.f283248h = jz5.h.b(new hq5.k(this));
    }

    public final android.app.NotificationManager T6(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("notification");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (android.app.NotificationManager) systemService;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new hq5.l(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        this.f283246f = getIntent().getBooleanExtra("isSender", false);
        ((com.tencent.mm.app.s2) ((jz5.n) this.f283248h).getValue()).alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((com.tencent.mm.app.s2) ((jz5.n) this.f283248h).getValue()).dead();
    }
}
