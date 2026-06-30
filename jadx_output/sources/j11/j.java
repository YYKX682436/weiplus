package j11;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f297125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f297126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j11.h f297127f;

    public j(j11.h hVar, java.lang.String str, boolean z17) {
        this.f297127f = hVar;
        this.f297125d = str;
        this.f297126e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        if (((java.util.HashMap) this.f297127f.f297114c).containsKey(this.f297125d)) {
            synchronized (this) {
                linkedList = (java.util.LinkedList) ((java.util.HashMap) this.f297127f.f297114c).get(this.f297125d);
                ((java.util.HashMap) this.f297127f.f297114c).remove(this.f297125d);
            }
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((c01.o8) it.next()).a(this.f297125d, this.f297126e);
                }
            }
        }
    }
}
