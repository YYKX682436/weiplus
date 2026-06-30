package gs;

/* loaded from: classes13.dex */
public class b extends android.app.Fragment {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f274961d = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f274962e = new java.lang.Object();

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        synchronized (this.f274962e) {
            for (gs.c cVar : this.f274961d) {
                if (cVar != null) {
                    cVar.onResume();
                }
            }
        }
    }
}
