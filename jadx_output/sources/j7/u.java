package j7;

/* loaded from: classes13.dex */
public final class u implements j7.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f298028d = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    @Override // j7.k
    public void onDestroy() {
        java.util.Iterator it = ((java.util.ArrayList) q7.p.d(this.f298028d)).iterator();
        while (it.hasNext()) {
            ((n7.h) it.next()).onDestroy();
        }
    }

    @Override // j7.k
    public void onStart() {
        java.util.Iterator it = ((java.util.ArrayList) q7.p.d(this.f298028d)).iterator();
        while (it.hasNext()) {
            ((n7.h) it.next()).onStart();
        }
    }

    @Override // j7.k
    public void onStop() {
        java.util.Iterator it = ((java.util.ArrayList) q7.p.d(this.f298028d)).iterator();
        while (it.hasNext()) {
            ((n7.h) it.next()).onStop();
        }
    }
}
