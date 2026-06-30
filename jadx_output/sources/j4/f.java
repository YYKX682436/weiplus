package j4;

/* loaded from: classes13.dex */
public class f implements j4.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.profileinstaller.ProfileInstallReceiver f297573a;

    public f(androidx.profileinstaller.ProfileInstallReceiver profileInstallReceiver) {
        this.f297573a = profileInstallReceiver;
    }

    @Override // j4.h
    public void a(int i17, java.lang.Object obj) {
        if (i17 == 6 || i17 == 7 || i17 == 8) {
        }
        this.f297573a.setResultCode(i17);
    }
}
