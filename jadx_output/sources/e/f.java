package e;

/* loaded from: classes13.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f245486d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Bundle f245487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.os.ResultReceiver f245488f;

    public f(android.support.v4.os.ResultReceiver resultReceiver, int i17, android.os.Bundle bundle) {
        this.f245488f = resultReceiver;
        this.f245486d = i17;
        this.f245487e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f245488f.a(this.f245486d, this.f245487e);
    }
}
