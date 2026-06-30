package i11;

/* loaded from: classes13.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i11.c f287139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i11.h f287140e;

    public p(i11.h hVar, i11.c cVar) {
        this.f287140e = hVar;
        this.f287139d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        i11.c cVar;
        i11.u uVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        i11.h hVar = this.f287140e;
        hVar.f287097f.lock();
        java.util.List list = hVar.f287095d;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            cVar = this.f287139d;
            if (!hasNext) {
                break;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference == null || weakReference.get() == null || ((i11.c) weakReference.get()).equals(cVar)) {
                arrayList.add(weakReference);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            ((java.util.concurrent.CopyOnWriteArrayList) list).remove((java.lang.ref.WeakReference) it6.next());
        }
        java.util.List list2 = hVar.f287096e;
        java.util.Iterator it7 = ((java.util.concurrent.CopyOnWriteArrayList) list2).iterator();
        while (true) {
            if (!it7.hasNext()) {
                break;
            }
            i11.c cVar2 = (i11.c) it7.next();
            if (cVar2 != null && cVar2.equals(cVar)) {
                ((java.util.concurrent.CopyOnWriteArrayList) list2).remove(cVar);
                break;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationGeo", "stop listeners size %d, persistListeners size:%d", java.lang.Integer.valueOf(((java.util.concurrent.CopyOnWriteArrayList) list).size()), java.lang.Integer.valueOf(((java.util.concurrent.CopyOnWriteArrayList) list2).size()));
        if (((java.util.concurrent.CopyOnWriteArrayList) list).size() == 0 && (uVar = hVar.f287093b) != null) {
            uVar.f287152a.post(new i11.w(uVar));
        }
        hVar.f287097f.unlock();
    }
}
