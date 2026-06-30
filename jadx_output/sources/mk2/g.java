package mk2;

/* loaded from: classes3.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f327132d;

    @Override // java.lang.Runnable
    public void run() {
        mk2.a aVar;
        java.lang.ref.WeakReference weakReference = mk2.h.f327140h;
        if (weakReference == null || (aVar = (mk2.a) weakReference.get()) == null) {
            return;
        }
        aVar.onApplyMicNewPkTimeout(this.f327132d);
    }
}
