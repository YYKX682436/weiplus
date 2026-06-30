package e04;

/* loaded from: classes9.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f246072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.PayAuthNativeEvent f246073e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e04.p f246074f;

    public q0(e04.p pVar, android.content.Context context, com.tencent.mm.autogen.events.PayAuthNativeEvent payAuthNativeEvent) {
        this.f246074f = pVar;
        this.f246072d = context;
        this.f246073e = payAuthNativeEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.co coVar;
        if (this.f246072d == null || (coVar = this.f246073e.f54609h) == null) {
            return;
        }
        int i17 = coVar.f6367a;
        e04.p pVar = this.f246074f;
        if (i17 == 1) {
            pVar.D(true);
        } else if (i17 == 2) {
            pVar.D(false);
        }
    }
}
