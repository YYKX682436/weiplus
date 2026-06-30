package pm;

/* loaded from: classes9.dex */
public class b implements java.io.Serializable, java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f356750d;

    public synchronized boolean d(int i17) {
        if (i17 == -1) {
            return false;
        }
        if (this.f356750d == null) {
            g();
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = this.f356750d.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            pm.a aVar = (pm.a) it.next();
            if (aVar.f356744d != i17) {
                linkedList.add(aVar);
            } else {
                z17 = true;
            }
        }
        if (!z17) {
            return false;
        }
        this.f356750d = linkedList;
        h();
        return true;
    }

    public void e() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.network.x2.j();
        o4Var.getClass();
        o4Var.putString("com.tencent.preference.notification.key.queue", "").apply();
        java.util.LinkedList linkedList = this.f356750d;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(linkedList == null ? 0 : linkedList.size());
        objArr[1] = toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.NotificationAppMsgQueue", "reset size:%d, %s", objArr);
    }

    /* JADX WARN: Finally extract failed */
    public synchronized void g() {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        try {
            try {
                linkedList2 = (java.util.LinkedList) pm.h.a(((com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.network.x2.j()).getString("com.tencent.preference.notification.key.queue", ""));
                this.f356750d = linkedList2;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NotificationAppMsgQueue", e17, "", new java.lang.Object[0]);
                if (this.f356750d == null) {
                    linkedList = new java.util.LinkedList();
                }
            }
            if (linkedList2 == null) {
                linkedList = new java.util.LinkedList();
                this.f356750d = linkedList;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NotificationAppMsgQueue", "restore size:%d, %s", java.lang.Integer.valueOf(this.f356750d.size()), toString());
        } catch (java.lang.Throwable th6) {
            if (this.f356750d == null) {
                this.f356750d = new java.util.LinkedList();
            }
            throw th6;
        }
    }

    public synchronized void h() {
        java.util.LinkedList linkedList = this.f356750d;
        if (linkedList == null) {
            return;
        }
        linkedList.size();
        if (this.f356750d.isEmpty()) {
            e();
            return;
        }
        try {
            java.util.LinkedList linkedList2 = new java.util.LinkedList(this.f356750d);
            com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.network.x2.j();
            o4Var.getClass();
            o4Var.putString("com.tencent.preference.notification.key.queue", pm.h.b(linkedList2)).apply();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NotificationAppMsgQueue", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NotificationAppMsgQueue", "save size:%d, %s", java.lang.Integer.valueOf(this.f356750d.size()), toString());
    }

    @Override // java.lang.Iterable
    public synchronized java.util.Iterator iterator() {
        if (this.f356750d == null) {
            g();
        }
        return this.f356750d.iterator();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.util.LinkedList linkedList = this.f356750d;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb6.append(((pm.a) it.next()).toString());
                sb6.append(";  ");
            }
        }
        return sb6.toString();
    }
}
