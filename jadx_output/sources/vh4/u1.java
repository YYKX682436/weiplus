package vh4;

/* loaded from: classes.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f437150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437151e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437152f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437153g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f437154h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f437155i;

    public u1(vh4.t1 t1Var, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17) {
        this.f437150d = context;
        this.f437151e = str;
        this.f437152f = str2;
        this.f437153g = str3;
        this.f437154h = j17;
        this.f437155i = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent(this.f437150d, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI.class);
        intent.putExtra("intent_extra_bind_guardian_username", this.f437151e);
        intent.putExtra("intent_extra_bind_ward_username", this.f437152f);
        intent.putExtra("intent_extra_bind_ticket", this.f437153g);
        intent.putExtra("intent_extra_request_time", this.f437154h);
        intent.putExtra("intent_extra_msg_type", this.f437155i);
        intent.putExtra("intent_extra_adult_user", false);
        android.content.Context context = this.f437150d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService$10", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/teenmode/model/TeenModeService$10", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
