package com.tencent.mm.sdk.platformtools;

/* loaded from: classes10.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f192490a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f192491b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f192492c = new java.util.concurrent.ConcurrentLinkedDeque();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.locks.ReadWriteLock f192493d = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* renamed from: e, reason: collision with root package name */
    public volatile int f192494e;

    public c0(int i17) {
        if (!(i17 > 0)) {
            throw new java.lang.IllegalArgumentException("sizeLimit <= 0".toString());
        }
        this.f192490a = i17;
    }

    public final void a() {
        ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f192493d).writeLock().lock();
        try {
            this.f192491b.clear();
            this.f192492c.clear();
            this.f192494e = 0;
        } finally {
            ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f192493d).writeLock().unlock();
        }
    }

    public final java.lang.Object b(java.lang.Object obj) {
        return this.f192491b.get(obj);
    }

    public final java.lang.Object c(java.lang.Object obj, yz5.l generator) {
        kotlin.jvm.internal.o.g(generator, "generator");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f192491b;
        java.lang.Object obj2 = concurrentHashMap.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        java.util.concurrent.locks.ReadWriteLock readWriteLock = this.f192493d;
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).writeLock().lock();
        try {
            java.lang.Object obj3 = concurrentHashMap.get(obj);
            if (obj3 != null) {
                return obj3;
            }
            java.lang.Object invoke = generator.invoke(obj);
            d(obj, invoke);
            return invoke;
        } finally {
            ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).writeLock().unlock();
        }
    }

    public java.lang.Object d(java.lang.Object obj, java.lang.Object obj2) {
        ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f192493d).writeLock().lock();
        try {
            java.lang.Object obj3 = this.f192491b.get(obj);
            while (this.f192494e >= this.f192490a && (!this.f192492c.isEmpty())) {
                java.lang.Object poll = this.f192492c.poll();
                if (poll != null) {
                    this.f192491b.remove(poll);
                    this.f192494e = this.f192491b.size();
                }
            }
            int i17 = this.f192494e;
            int i18 = this.f192490a;
            this.f192492c.offer(obj);
            this.f192491b.put(obj, obj2);
            this.f192494e = this.f192491b.size();
            return obj3;
        } finally {
            ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f192493d).writeLock().unlock();
        }
    }

    public final boolean e(java.lang.Object obj) {
        ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f192493d).writeLock().lock();
        try {
            boolean z17 = kotlin.jvm.internal.m0.c(this.f192491b).remove(obj) != null;
            this.f192492c.remove(obj);
            this.f192494e = this.f192491b.size();
            return z17;
        } finally {
            ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f192493d).writeLock().unlock();
        }
    }
}
