package com.tencent.mm.sdk.event;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.d f192370d = new com.tencent.mm.sdk.event.d();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.g f192371a = new com.tencent.mm.sdk.event.g();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f192372b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f192373c = new java.util.HashMap();

    public fm5.b a(com.tencent.mm.sdk.event.IListener iListener) {
        fm5.b bVar;
        synchronized (this) {
            iz5.a.d("EventPoolImpl.add", iListener);
            iListener.__getEventID();
            com.tencent.mm.sdk.event.i iVar = (com.tencent.mm.sdk.event.i) this.f192373c.get(java.lang.Integer.valueOf(iListener.__getEventID()));
            if (iVar == null) {
                java.util.HashMap hashMap = this.f192373c;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(iListener.__getEventID());
                com.tencent.mm.sdk.event.i iVar2 = new com.tencent.mm.sdk.event.i(this);
                hashMap.put(valueOf, iVar2);
                iVar = iVar2;
            }
            bVar = new fm5.b(iListener, iVar);
            synchronized (iVar) {
                iVar.f264181d.add(bVar);
            }
        }
        return bVar;
    }

    public synchronized boolean b(com.tencent.mm.sdk.event.IListener iListener) {
        int size;
        boolean contains;
        iz5.a.d("EventPoolImpl.hadListened", iListener);
        java.util.List list = (java.util.List) this.f192372b.get(java.lang.Integer.valueOf(iListener.__getEventID()));
        if (list != null && !list.isEmpty() && list.contains(iListener)) {
            return true;
        }
        com.tencent.mm.sdk.event.i iVar = (com.tencent.mm.sdk.event.i) this.f192373c.get(java.lang.Integer.valueOf(iListener.__getEventID()));
        if (iVar != null) {
            synchronized (iVar) {
                size = iVar.f264181d.size();
            }
            if (size > 0) {
                synchronized (iVar) {
                    contains = iVar.f264181d.contains(new fm5.b(iListener, iVar));
                }
                if (contains) {
                    return true;
                }
            }
        }
        return false;
    }

    public synchronized boolean c(java.lang.Class cls) {
        int size;
        iz5.a.d("EventPoolImpl.hasListener", cls);
        java.util.List list = (java.util.List) this.f192372b.get(java.lang.Integer.valueOf(cls.getName().hashCode()));
        if (list != null && list.size() > 0) {
            return true;
        }
        com.tencent.mm.sdk.event.i iVar = (com.tencent.mm.sdk.event.i) this.f192373c.get(java.lang.Integer.valueOf(cls.getName().hashCode()));
        if (iVar != null) {
            synchronized (iVar) {
                size = iVar.f264181d.size();
            }
            if (size > 0) {
                return true;
            }
        }
        java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(com.tencent.mm.sdk.event.n.class)).all()).iterator();
        while (it.hasNext()) {
            if (((fs.q) it.next()).hasKey(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean d(com.tencent.mm.sdk.event.IEvent iEvent, boolean z17) {
        com.tencent.mm.sdk.event.i iVar;
        int i17;
        boolean z18;
        java.lang.Runnable runnable;
        java.util.LinkedList linkedList;
        iz5.a.d("EventPoolImpl.publish", iEvent);
        iEvent.a();
        java.lang.Class<?> cls = iEvent.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(32);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(com.tencent.mm.sdk.event.n.class)).all()).iterator();
        while (true) {
            fs.f fVar = (fs.f) it;
            if (!fVar.hasNext()) {
                break;
            }
            fs.q qVar = (fs.q) fVar.next();
            if (fs.g.e(context, qVar) && qVar.hasKey(cls)) {
                arrayList.add((com.tencent.mm.sdk.event.n) qVar.get());
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EventCenter", "publishing " + iEvent + " to " + arrayList.size() + "listeners:");
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EventCenter", " - " + ((com.tencent.mm.sdk.event.n) it6.next()));
            }
        }
        boolean z19 = !arrayList.isEmpty();
        synchronized (this) {
            int a17 = iEvent.a();
            java.util.List list = (java.util.List) this.f192372b.get(java.lang.Integer.valueOf(a17));
            if (list != null) {
                new java.util.ArrayList(list);
                z19 = true;
            }
            iVar = (com.tencent.mm.sdk.event.i) this.f192373c.get(java.lang.Integer.valueOf(a17));
            if (iVar != null) {
                z19 = true;
            }
            i17 = 0;
            if (!z19) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EventCenter", "No listener for this event %s(%d), Stack: %s.", iEvent, java.lang.Integer.valueOf(a17), "");
            }
        }
        if (!arrayList.isEmpty()) {
            java.util.Collections.sort(arrayList, new com.tencent.mm.sdk.event.e(this));
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                com.tencent.mm.sdk.event.n nVar = (com.tencent.mm.sdk.event.n) it7.next();
                bm5.u1.a(com.tencent.mm.sdk.platformtools.x2.f193071a, nVar.getClass().getName());
                if (nVar.callback(iEvent) && iEvent.f192365e) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EventCenter", "event '%s' was consumed by listener '%s' so it will not be passed to other listeners.", iEvent, arrayList);
                    z18 = true;
                    break;
                }
            }
        }
        z18 = false;
        if (iVar != null) {
            nm5.b c17 = nm5.j.c(iEvent, java.lang.Boolean.valueOf(z18));
            synchronized (iVar) {
                linkedList = new java.util.LinkedList(iVar.f264181d);
            }
            com.tencent.mm.sdk.event.IEvent iEvent2 = (com.tencent.mm.sdk.event.IEvent) c17.a(0);
            if (iEvent2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EventCenter", "event is null! fatal!");
            } else {
                if (!((java.lang.Boolean) c17.a(1)).booleanValue()) {
                    if (iEvent2.f192365e) {
                        java.util.Collections.sort(linkedList, new com.tencent.mm.sdk.event.h(iVar));
                    }
                    int size = linkedList.size();
                    fm5.b[] bVarArr = new fm5.b[size];
                    linkedList.toArray(bVarArr);
                    while (true) {
                        if (i17 >= size) {
                            break;
                        }
                        fm5.b bVar = bVarArr[i17];
                        com.tencent.mm.sdk.event.IListener iListener = (com.tencent.mm.sdk.event.IListener) bVar.f264184e;
                        bm5.u1.a(com.tencent.mm.sdk.platformtools.x2.f193071a, iListener.getClass().getName());
                        if (iListener.callback(iEvent2) && iEvent2.f192365e) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.EventCenter", "event '%s' was consumed by listener '%s' so it will not be passed to other listeners.", iEvent2, bVar.f264184e);
                            break;
                        }
                        i17++;
                    }
                }
                java.lang.Runnable runnable2 = iEvent2.f192364d;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        } else if (!arrayList.isEmpty() && (runnable = iEvent.f192364d) != null) {
            runnable.run();
        }
        return z19;
    }
}
