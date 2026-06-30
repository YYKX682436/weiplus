package e;

/* loaded from: classes13.dex */
public class e extends e.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.os.ResultReceiver f245485e;

    public e(android.support.v4.os.ResultReceiver resultReceiver) {
        this.f245485e = resultReceiver;
    }

    @Override // e.c
    public void V5(int i17, android.os.Bundle bundle) {
        android.support.v4.os.ResultReceiver resultReceiver = this.f245485e;
        android.os.Handler handler = resultReceiver.f9010e;
        if (handler != null) {
            handler.post(new e.f(resultReceiver, i17, bundle));
        } else {
            resultReceiver.a(i17, bundle);
        }
    }
}
