package gs;

/* loaded from: classes13.dex */
public class a implements android.os.Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    public static final gs.a f274958f = new gs.a();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f274960e = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f274959d = new android.os.Handler(android.os.Looper.getMainLooper(), this);

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what != 1) {
            return false;
        }
        android.app.FragmentManager fragmentManager = (android.app.FragmentManager) message.obj;
        boolean isDestroyed = fragmentManager.isDestroyed();
        java.util.Map map = this.f274960e;
        if (!isDestroyed) {
            ((java.util.HashMap) map).get(fragmentManager);
        }
        ((java.util.HashMap) map).remove(fragmentManager);
        return true;
    }
}
