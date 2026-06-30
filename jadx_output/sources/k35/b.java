package k35;

/* loaded from: classes11.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k35.c f303897e;

    public b(k35.c cVar, java.lang.String str) {
        this.f303897e = cVar;
        this.f303896d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        k35.c cVar = this.f303897e;
        java.lang.String str = this.f303896d;
        cVar.getClass();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || ((int) n17.E2) <= 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactBlackListHelper", "onContactStorageNotifyChange isBLackListContact: %s, isSnsBlack: %s,", java.lang.Boolean.valueOf(n17.o2()), java.lang.Boolean.valueOf(n17.x2()));
        java.util.Set set = k35.c.f303899f;
        synchronized (set) {
            if (n17.o2()) {
                ((java.util.HashSet) set).add(str);
            } else {
                ((java.util.HashSet) set).remove(str);
            }
        }
        java.util.Set set2 = k35.c.f303900g;
        synchronized (set2) {
            if (n17.x2()) {
                ((java.util.HashSet) set2).add(str);
            } else {
                ((java.util.HashSet) set2).remove(str);
            }
        }
    }
}
