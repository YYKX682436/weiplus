package l4;

/* loaded from: classes13.dex */
public class k extends android.os.RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.room.MultiInstanceInvalidationService f315728a;

    public k(androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f315728a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public void onCallbackDied(android.os.IInterface iInterface, java.lang.Object obj) {
        this.f315728a.f12319e.remove(java.lang.Integer.valueOf(((java.lang.Integer) obj).intValue()));
    }
}
