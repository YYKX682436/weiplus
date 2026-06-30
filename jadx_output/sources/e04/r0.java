package e04;

/* loaded from: classes9.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.PayAuthNativeEvent f246077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e04.p f246078e;

    public r0(e04.p pVar, com.tencent.mm.autogen.events.PayAuthNativeEvent payAuthNativeEvent) {
        this.f246078e = pVar;
        this.f246077d = payAuthNativeEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        e04.p pVar = this.f246078e;
        if (pVar.f246059w != null) {
            am.co coVar = this.f246077d.f54609h;
            if (coVar == null || coVar.f6367a != 1) {
                pVar.t(false, null);
            }
        }
    }
}
