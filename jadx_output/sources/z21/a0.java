package z21;

/* loaded from: classes12.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f469550a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f469551b;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.locks.ReadWriteLock f469553d = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.StringBuilder f469554e = new java.lang.StringBuilder();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f469555f = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedHashMap f469552c = new java.util.LinkedHashMap();

    public a0(java.lang.String str) {
        this.f469550a = str;
    }

    public java.lang.String a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShortSentenceContainer", "createNewShortSentence");
        java.util.concurrent.locks.ReadWriteLock readWriteLock = this.f469553d;
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).writeLock().lock();
        z21.z zVar = new z21.z(this);
        this.f469552c.put(zVar.f469702a, zVar);
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).writeLock().unlock();
        return zVar.f469702a;
    }

    public java.lang.String b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShortSentenceContainer", "createNewShortSentenceWithVoiceId voiceId:%s", str);
        java.util.concurrent.locks.ReadWriteLock readWriteLock = this.f469553d;
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).writeLock().lock();
        try {
            z21.z zVar = new z21.z(this);
            zVar.f469702a = str;
            this.f469552c.put(str, zVar);
            return zVar.f469702a;
        } finally {
            ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).writeLock().unlock();
        }
    }

    public void c(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShortSentenceContainer", "cutShortSentence markEnd:%s", java.lang.Integer.valueOf(i17));
        if (i17 < 0) {
            throw new java.lang.IllegalStateException("splitShortSentence file mark less than zero. mark: " + i17);
        }
        ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f469553d).readLock().lock();
        if (this.f469552c.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShortSentenceContainer", "splitShortSentence there is no last one");
            ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f469553d).readLock().unlock();
            return;
        }
        r1 = null;
        for (z21.z zVar : this.f469552c.values()) {
        }
        if (zVar == null) {
            throw new java.lang.IllegalStateException("splitShortSentence last info is null");
        }
        zVar.f469705d = i17;
        ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f469553d).readLock().unlock();
    }

    public java.util.LinkedList d() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.concurrent.locks.ReadWriteLock readWriteLock = this.f469553d;
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).readLock().lock();
        for (z21.z zVar : this.f469552c.values()) {
            if (zVar.f469703b) {
                r45.du5 du5Var = new r45.du5();
                du5Var.f372756d = zVar.f469702a;
                du5Var.f372757e = true;
                linkedList.add(du5Var);
            }
        }
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).readLock().unlock();
        return linkedList;
    }

    public java.util.List e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.locks.ReadWriteLock readWriteLock = this.f469553d;
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).readLock().lock();
        for (z21.z zVar : this.f469552c.values()) {
            if (zVar.f469703b) {
                arrayList.add(zVar.f469702a);
            }
        }
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).readLock().unlock();
        return arrayList;
    }

    public java.util.LinkedList f() {
        java.util.LinkedList linkedList = this.f469555f;
        linkedList.clear();
        java.util.concurrent.locks.ReadWriteLock readWriteLock = this.f469553d;
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).readLock().lock();
        java.util.Iterator it = this.f469552c.values().iterator();
        while (it.hasNext()) {
            java.util.LinkedList linkedList2 = ((z21.z) it.next()).f469710i;
            if (linkedList2 != null) {
                java.util.Iterator it6 = linkedList2.iterator();
                while (it6.hasNext()) {
                    r45.t44 t44Var = (r45.t44) it6.next();
                    linkedList.add(new z21.c(t44Var.f386140e, t44Var.f386139d));
                }
            }
        }
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).readLock().unlock();
        return linkedList;
    }

    public boolean g() {
        java.util.concurrent.locks.ReadWriteLock readWriteLock = this.f469553d;
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).readLock().lock();
        java.util.LinkedHashMap linkedHashMap = this.f469552c;
        boolean z17 = true;
        if (linkedHashMap.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShortSentenceContainer", "isAllRespEnd innerContainer.size() == 0");
            ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).readLock().unlock();
            return true;
        }
        java.util.Iterator it = linkedHashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            z21.z zVar = (z21.z) it.next();
            java.lang.String str = zVar.f469702a;
            if (!zVar.f469709h) {
                z17 = false;
                break;
            }
        }
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).readLock().unlock();
        return z17;
    }

    public z21.z h(int i17) {
        ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f469553d).readLock().lock();
        z21.z zVar = null;
        if (this.f469552c.size() == 0) {
            ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f469553d).readLock().unlock();
            return null;
        }
        java.util.Iterator it = this.f469552c.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            z21.z zVar2 = (z21.z) it.next();
            int i18 = zVar2.f469705d;
            if (!zVar2.f469704c && i17 <= zVar2.f469705d) {
                zVar = zVar2;
                break;
            }
        }
        ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f469553d).readLock().unlock();
        return zVar;
    }
}
