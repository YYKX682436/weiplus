package pm;

/* loaded from: classes11.dex */
public class g implements java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public int f356753d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final pm.d f356754e;

    /* renamed from: f, reason: collision with root package name */
    public final pm.b f356755f;

    public g(pm.e eVar) {
        pm.d dVar = new pm.d();
        this.f356754e = dVar;
        pm.b bVar = new pm.b();
        this.f356755f = bVar;
        dVar.a();
        bVar.g();
    }

    public void d(z2.n1 n1Var, int i17) {
        if (n1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Notification.Queue", "manager is null???");
        } else {
            n1Var.f469505b.cancel(null, i17);
            k(i17);
        }
    }

    public int e() {
        pm.d dVar = this.f356754e;
        if (dVar.f356751a == null) {
            dVar.a();
        }
        java.util.Iterator<com.tencent.mm.booter.notification.NotificationItem> it = dVar.f356751a.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += it.next().f63467p;
        }
        return i17;
    }

    public int g(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return -1;
        }
        java.util.Iterator it = this.f356755f.iterator();
        while (it.hasNext()) {
            pm.a aVar = (pm.a) it.next();
            if (aVar.f356746f.equals(str)) {
                return aVar.f356744d;
            }
        }
        return -1;
    }

    public int h(java.lang.String str, boolean z17) {
        java.lang.System.currentTimeMillis();
        java.util.Iterator it = this.f356755f.iterator();
        java.lang.String str2 = "";
        while (it.hasNext()) {
            str2 = str2 + ((pm.a) it.next()).f356744d + ",";
        }
        int i17 = z17 ? 4097 : 4102;
        while (true) {
            if (!str2.contains(i17 + "")) {
                break;
            }
            i17++;
        }
        int i18 = (i17 < 4102 || !z17) ? i17 : 4097;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && z17) {
            i18 = str.hashCode();
        }
        java.lang.System.currentTimeMillis();
        return i18;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        pm.d dVar = this.f356754e;
        if (dVar.f356751a == null) {
            dVar.a();
        }
        return dVar.f356751a.iterator();
    }

    public com.tencent.mm.booter.notification.NotificationItem j(com.tencent.mm.booter.notification.NotificationItem notificationItem) {
        com.tencent.mm.booter.notification.NotificationItem notificationItem2 = null;
        if (notificationItem == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Notification.Queue", "notification item null when put");
            return null;
        }
        int i17 = notificationItem.f63458d;
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Notification.Queue", "notification id = -1(NotificationItem.INVALID_ID) when put");
            return null;
        }
        int i18 = this.f356753d;
        if (i18 > 0) {
            if (i18 == i17) {
                k(i18);
            }
            this.f356753d = -1;
        }
        k(notificationItem.f63458d);
        pm.d dVar = this.f356754e;
        if (dVar.f356751a == null) {
            dVar.a();
        }
        if (dVar.f356751a.size() >= 5) {
            int i19 = 0;
            while (true) {
                pm.d dVar2 = this.f356754e;
                if (dVar2.f356751a == null) {
                    dVar2.a();
                }
                if (i19 >= dVar2.f356751a.size()) {
                    break;
                }
                pm.d dVar3 = this.f356754e;
                if (dVar3.f356751a == null) {
                    dVar3.a();
                }
                com.tencent.mm.booter.notification.NotificationItem notificationItem3 = dVar3.f356751a.get(i19);
                if (notificationItem3.f63465n) {
                    pm.b bVar = this.f356755f;
                    bVar.getClass();
                    if (bVar.d(notificationItem3.f63458d)) {
                        notificationItem3.toString();
                    }
                    pm.d dVar4 = this.f356754e;
                    synchronized (dVar4) {
                        if (dVar4.f356751a == null) {
                            dVar4.a();
                        }
                        if (dVar4.f356751a.remove(notificationItem3)) {
                            dVar4.b();
                        }
                    }
                    notificationItem2 = notificationItem3;
                } else {
                    i19++;
                }
            }
        }
        pm.d dVar5 = this.f356754e;
        synchronized (dVar5) {
            if (dVar5.f356751a == null) {
                dVar5.a();
            }
            if (dVar5.f356751a.add(notificationItem)) {
                dVar5.b();
            }
        }
        pm.b bVar2 = this.f356755f;
        synchronized (bVar2) {
            if (bVar2.f356750d == null) {
                bVar2.g();
            }
            bVar2.d(notificationItem.f63458d);
            if (!notificationItem.f63465n || com.tencent.mm.sdk.platformtools.t8.K0(notificationItem.f63462h)) {
                bVar2.f356750d.add(new pm.a(notificationItem.f63458d, notificationItem.f63465n));
                notificationItem.toString();
            } else {
                java.util.Iterator it = bVar2.f356750d.iterator();
                boolean z17 = true;
                while (it.hasNext()) {
                    pm.a aVar = (pm.a) it.next();
                    if (aVar.f356746f.equals(notificationItem.f63462h)) {
                        int i27 = notificationItem.f63458d;
                        long j17 = notificationItem.f63463i;
                        java.lang.String str = notificationItem.f63462h;
                        int i28 = notificationItem.f63464m;
                        boolean z18 = notificationItem.f63465n;
                        int i29 = notificationItem.f63466o;
                        aVar.f356744d = i27;
                        aVar.f356745e = j17;
                        aVar.f356746f = str;
                        aVar.f356747g = i28;
                        aVar.f356748h = z18;
                        aVar.f356749i = i29;
                        z17 = false;
                    }
                }
                if (z17) {
                    bVar2.f356750d.add(new pm.a(notificationItem.f63458d, notificationItem.f63463i, notificationItem.f63462h, notificationItem.f63464m, notificationItem.f63465n, notificationItem.f63466o));
                    notificationItem.toString();
                }
            }
            bVar2.h();
        }
        java.lang.String notificationItem4 = notificationItem.toString();
        pm.d dVar6 = this.f356754e;
        if (dVar6.f356751a == null) {
            dVar6.a();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Queue", "put item: %s, queuesize: %d", notificationItem4, java.lang.Integer.valueOf(dVar6.f356751a.size()));
        return notificationItem2;
    }

    public void k(int i17) {
        com.tencent.mm.booter.notification.NotificationItem notificationItem;
        this.f356755f.d(i17);
        pm.d dVar = this.f356754e;
        synchronized (dVar) {
            if (dVar.f356751a == null) {
                dVar.a();
            }
            java.util.Iterator<com.tencent.mm.booter.notification.NotificationItem> it = dVar.f356751a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    notificationItem = null;
                    break;
                } else {
                    notificationItem = it.next();
                    if (notificationItem.f63458d == i17) {
                        break;
                    }
                }
            }
            if (notificationItem != null && dVar.f356751a.remove(notificationItem)) {
                dVar.b();
            }
        }
        if (notificationItem != null) {
            synchronized (notificationItem) {
                android.graphics.Bitmap bitmap = notificationItem.f63459e;
                if (bitmap != null && !bitmap.isRecycled()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NotificationItem", "recycle bitmap:%s", notificationItem.f63459e.toString());
                    notificationItem.f63459e.recycle();
                }
                notificationItem.f63460f = null;
                notificationItem.f63459e = null;
                notificationItem.f63461g = null;
            }
        }
    }
}
