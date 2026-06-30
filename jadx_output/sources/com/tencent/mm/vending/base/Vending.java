package com.tencent.mm.vending.base;

/* loaded from: classes16.dex */
public abstract class Vending<_Struct, _Index, _Change> implements im5.a {
    private static final int MESSAGE_DO_DESTROY = 2;
    private static final int MESSAGE_NOTIFY_DATA_LOADED = 1;
    private static final int MESSAGE_PREPARE_VENDING_DATA = 1;
    private static final int SYNC_MESSAGE_APPLY_CHANGE = 1;
    private static final int SYNC_MESSAGE_CLEAR_RESOLVED_ONLY = 3;
    private static final int SYNC_MESSAGE_PREPARE_DATA_DEGRADE = 2;
    private static final java.lang.String TAG = "Vending";
    private com.tencent.mm.vending.base.s mArray;
    private byte[] mArrayDataLock;
    private java.util.concurrent.atomic.AtomicBoolean mCallDestroyed;
    private volatile fm5.d mDataChangedCallback;
    private volatile fm5.d mDataResolvedCallback;
    private com.tencent.mm.vending.base.l mDeadlock;
    private boolean mFreezeDataChange;
    private boolean mHasPendingDataChange;
    private com.tencent.mm.vending.base.r mLoader;
    private byte[] mPendingDataChangeLock;
    private boolean mResolveFromVending;
    private android.os.Handler mSubscriberHandler;
    private android.os.Looper mSubscriberLooper;
    java.util.HashSet<com.tencent.mm.vending.base.t> mVendingDeferring;
    private android.os.Handler mVendingHandler;
    private android.os.Looper mVendingLooper;
    private com.tencent.mm.vending.base.y mVendingSync;

    public Vending() {
        this(android.os.Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callPrepareVendingData() {
        if (this.mCallDestroyed.get()) {
            return;
        }
        jm5.b.b(TAG, "Vending.callPrepareVendingData()", new java.lang.Object[0]);
        this.mVendingSync.a(1, prepareVendingDataAsynchronous());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deadlock() {
        if (this.mDeadlock.f212650a.f212649a != null) {
            jm5.b.a(TAG, "Catch deadlock! Tell Carl! .. " + this.mDeadlock.f212650a.f212649a, new java.lang.Object[0]);
            com.tencent.mm.vending.base.u uVar = this.mDeadlock.f212651b;
            if (uVar != null) {
                synchronized (uVar.f212665c) {
                    this.mDeadlock.f212651b.f212665c.notify();
                }
                com.tencent.mm.vending.base.l lVar = this.mDeadlock;
                lVar.f212650a.f212649a = null;
                lVar.f212651b = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deferResolved(com.tencent.mm.vending.base.t tVar, _Index _index, _Struct _struct) {
        if (this.mVendingDeferring.contains(tVar)) {
            com.tencent.mm.vending.base.u lock = getLock(_index);
            synchronized (lock.f212665c) {
                lock.f212669g = false;
                lockResolved(lock, _index, _struct);
            }
            notifyDataLoadedIfNeed(lock);
        }
    }

    private com.tencent.mm.vending.base.u forSubscriberSync(com.tencent.mm.vending.base.u uVar, _Index _index) {
        if (!mm5.b.f329698b.f329699a.isAlive()) {
            jm5.b.a(TAG, "Vending thread is not running!", new java.lang.Object[0]);
            return uVar;
        }
        synchronized (uVar.f212665c) {
            boolean requestIndex = requestIndex(uVar, _index);
            if (!uVar.f212668f || uVar.f212666d) {
                if (!requestIndex) {
                    return uVar;
                }
                this.mDeadlock.f212650a.f212649a = _index;
                this.mDeadlock.f212651b = uVar;
                jm5.b.b(TAG, "%s waiting %s", this, _index);
                long nanoTime = java.lang.System.nanoTime();
                try {
                    uVar.f212665c.wait();
                } catch (java.lang.InterruptedException unused) {
                }
                jm5.b.b(TAG, "%s waiting duration %s", this, java.lang.Long.valueOf(java.lang.System.nanoTime() - nanoTime));
                com.tencent.mm.vending.base.l lVar = this.mDeadlock;
                lVar.f212650a.f212649a = null;
                lVar.f212651b = null;
            }
            return uVar;
        }
    }

    private _Struct getAsync(_Index _index) {
        if (invalidIndex(_index)) {
            return null;
        }
        com.tencent.mm.vending.base.u lock = getLock(_index);
        if (requestIndex(lock, _index) && !lock.f212666d) {
            return (_Struct) lock.f212664b;
        }
        return null;
    }

    private _Struct getSync(_Index _index) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != this.mSubscriberLooper && myLooper != this.mVendingLooper) {
            throw new java.lang.IllegalAccessError("Call from wrong looper");
        }
        if (this.mCallDestroyed.get()) {
            return null;
        }
        com.tencent.mm.vending.base.u lock = getLock(_index);
        if (invalidIndex(_index)) {
            return (_Struct) lock.f212664b;
        }
        if (myLooper == this.mSubscriberLooper) {
            return (_Struct) forSubscriberSync(lock, _index).f212664b;
        }
        loadFromVending(lock, _index);
        return (_Struct) lock.f212664b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean loadFromVending(com.tencent.mm.vending.base.u uVar, _Index _index) {
        synchronized (uVar.f212665c) {
            if (uVar.f212668f && !uVar.f212666d && !uVar.f212667e) {
                return true;
            }
            this.mResolveFromVending = true;
            _Struct resolveAsynchronous = resolveAsynchronous(_index);
            this.mResolveFromVending = false;
            if (uVar.f212669g) {
                return false;
            }
            lockResolved(uVar, _index, resolveAsynchronous);
            return false;
        }
    }

    private void lockResolved(com.tencent.mm.vending.base.u uVar, _Index _index, _Struct _struct) {
        uVar.f212664b = _struct;
        uVar.f212663a = _index;
        uVar.f212666d = false;
        uVar.f212667e = false;
        uVar.f212668f = true;
        if (this.mDeadlock.f212651b == uVar) {
            uVar.f212670h = true;
        }
        uVar.f212665c.notify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDataLoadedIfNeed(com.tencent.mm.vending.base.u uVar) {
        if (uVar.f212670h) {
            uVar.f212670h = false;
        } else {
            android.os.Handler handler = this.mSubscriberHandler;
            handler.sendMessage(handler.obtainMessage(1, uVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDataResolved(_Index _index, _Struct _struct) {
        if (this.mCallDestroyed.get() || this.mDataResolvedCallback == null) {
            return;
        }
        fm5.d dVar = this.mDataResolvedCallback;
        nm5.a b17 = nm5.j.b(_index);
        synchronized (dVar) {
            dVar.v(b17);
        }
    }

    private void refillImpl(_Index _index, boolean z17) {
        looperCheckBoth();
        if (this.mCallDestroyed.get()) {
            return;
        }
        com.tencent.mm.vending.base.u lock = getLock(_index);
        synchronized (lock.f212665c) {
            if (lock.f212668f) {
                if (z17) {
                    lock.f212666d = true;
                } else {
                    lock.f212667e = true;
                }
            }
        }
        getAsync(_index);
    }

    private boolean requestIndex(com.tencent.mm.vending.base.u uVar, _Index _index) {
        if (invalidIndex(_index)) {
            return false;
        }
        if (this.mCallDestroyed.get()) {
            jm5.b.a(TAG, "Vending.destroyed() has called.", new java.lang.Object[0]);
            return false;
        }
        com.tencent.mm.vending.base.r rVar = this.mLoader;
        if (!rVar.f212658c.get()) {
            synchronized (rVar.f212659d) {
                rVar.f212656a.put(_index, com.tencent.mm.vending.base.q.PENDING);
            }
            android.os.Handler handler = rVar.f212660e;
            handler.sendMessageAtFrontOfQueue(handler.obtainMessage(0, _index));
        }
        requestIndexImpl(uVar, _index);
        return true;
    }

    public fm5.b addVendingDataChangedCallback(com.tencent.mm.vending.base.m mVar) {
        fm5.d dVar = this.mDataChangedCallback;
        dVar.getClass();
        fm5.b bVar = new fm5.b(mVar, dVar);
        synchronized (dVar) {
            dVar.f264181d.add(bVar);
        }
        return bVar;
    }

    public fm5.b addVendingDataResolvedCallback(com.tencent.mm.vending.base.n nVar) {
        fm5.d dVar = this.mDataResolvedCallback;
        dVar.getClass();
        fm5.b bVar = new fm5.b(nVar, dVar);
        synchronized (dVar) {
            dVar.f264181d.add(bVar);
        }
        return bVar;
    }

    public abstract void applyChangeSynchronized(_Change _change);

    @Override // im5.a
    public final void dead() {
        looperCheckBoth();
        jm5.b.b(TAG, "Vending.destroy()", new java.lang.Object[0]);
        this.mCallDestroyed.set(true);
        this.mVendingHandler.removeCallbacksAndMessages(null);
        this.mSubscriberHandler.removeCallbacksAndMessages(null);
        this.mLoader.f212658c.set(true);
        this.mLoader.a();
        android.os.Handler handler = this.mVendingHandler;
        handler.sendMessage(handler.obtainMessage(2));
    }

    public com.tencent.mm.vending.base.t defer(_Index _index) {
        looperCheckForVending();
        if (!this.mResolveFromVending) {
            jm5.b.c(TAG, "Please call defer in resolveAsynchronous()", new java.lang.Object[0]);
            return null;
        }
        getLock(_index).f212669g = true;
        com.tencent.mm.vending.base.t tVar = new com.tencent.mm.vending.base.t(this, _index);
        this.mVendingDeferring.add(tVar);
        return tVar;
    }

    public abstract void destroyAsynchronous();

    public void freezeDataChange() {
        if (this.mCallDestroyed.get()) {
            return;
        }
        synchronized (this.mPendingDataChangeLock) {
            this.mFreezeDataChange = true;
        }
    }

    public <T> T get(_Index _index) {
        return getSync(_index);
    }

    public com.tencent.mm.vending.base.r getLoader() {
        return this.mLoader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.tencent.mm.vending.base.u getLock(_Index _index) {
        com.tencent.mm.vending.base.u uVar;
        synchronized (this.mArrayDataLock) {
            uVar = (com.tencent.mm.vending.base.u) this.mArray.get(_index);
            if (uVar == null) {
                uVar = new com.tencent.mm.vending.base.u();
                this.mArray.put(_index, uVar);
            }
        }
        return uVar;
    }

    public android.os.Looper getLooper() {
        return this.mVendingLooper;
    }

    public boolean invalidIndex(_Index _index) {
        return false;
    }

    public void loaderClear() {
    }

    public void looperCheckBoth() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != this.mSubscriberLooper && myLooper != this.mVendingLooper) {
            throw new java.lang.IllegalAccessError("Call from wrong looper");
        }
    }

    public void looperCheckForSubscriber() {
        if (android.os.Looper.myLooper() != this.mSubscriberLooper) {
            throw new java.lang.IllegalAccessError("Call from wrong looper");
        }
    }

    public void looperCheckForVending() {
        if (android.os.Looper.myLooper() != this.mVendingLooper) {
            throw new java.lang.IllegalAccessError("Call from wrong looper");
        }
    }

    public void notifyVendingDataChange() {
        notifyVendingDataChange(false);
    }

    public void notifyVendingDataChangeSynchronize() {
        notifyVendingDataChange(true);
    }

    public <T> T peek(_Index _index) {
        com.tencent.mm.vending.base.u peekLock;
        if (this.mCallDestroyed.get() || invalidIndex(_index) || (peekLock = peekLock(_index)) == null || peekLock.f212666d) {
            return null;
        }
        return (T) peekLock.f212664b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.tencent.mm.vending.base.u peekLock(_Index _index) {
        com.tencent.mm.vending.base.u uVar;
        synchronized (this.mArrayDataLock) {
            uVar = (com.tencent.mm.vending.base.u) this.mArray.get(_index);
        }
        return uVar;
    }

    public abstract _Change prepareVendingDataAsynchronous();

    public void removeVendingDataChangedCallback(com.tencent.mm.vending.base.m mVar) {
        fm5.d dVar = this.mDataChangedCallback;
        dVar.getClass();
        fm5.b bVar = new fm5.b(mVar, dVar);
        synchronized (dVar) {
            dVar.f264181d.remove(bVar);
        }
    }

    public void removeVendingDataResolvedCallback(com.tencent.mm.vending.base.n nVar) {
        fm5.d dVar = this.mDataResolvedCallback;
        dVar.getClass();
        fm5.b bVar = new fm5.b(nVar, dVar);
        synchronized (dVar) {
            dVar.f264181d.remove(bVar);
        }
    }

    public void request(_Index _index) {
        refillImpl(_index, false);
    }

    public void requestConsistent(_Index _index) {
        refillImpl(_index, true);
    }

    public void requestIndexImpl(com.tencent.mm.vending.base.u uVar, _Index _index) {
    }

    public abstract _Struct resolveAsynchronous(_Index _index);

    public void resolvedClear() {
        looperCheckBoth();
        if (this.mCallDestroyed.get()) {
            return;
        }
        this.mVendingSync.a(3, null);
    }

    public void synchronizing(int i17, java.lang.Object obj) {
    }

    public void unfreezeDataChange() {
        if (this.mCallDestroyed.get()) {
            return;
        }
        synchronized (this.mPendingDataChangeLock) {
            this.mFreezeDataChange = false;
            if (this.mHasPendingDataChange) {
                notifyVendingDataChange();
                this.mHasPendingDataChange = false;
            }
        }
    }

    public Vending(android.os.Looper looper) {
        this.mCallDestroyed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.mArrayDataLock = new byte[0];
        this.mPendingDataChangeLock = new byte[0];
        this.mHasPendingDataChange = false;
        this.mFreezeDataChange = false;
        this.mDeadlock = new com.tencent.mm.vending.base.l(null);
        lm5.j jVar = lm5.d.f319600a;
        this.mDataChangedCallback = new com.tencent.mm.vending.base.b(this, jVar);
        this.mDataResolvedCallback = new com.tencent.mm.vending.base.c(this, jVar);
        this.mArray = new com.tencent.mm.vending.base.s();
        this.mVendingDeferring = new java.util.HashSet<>();
        this.mResolveFromVending = false;
        this.mSubscriberLooper = looper;
        android.os.Looper looper2 = mm5.b.f329698b.f329699a.getLooper();
        this.mVendingLooper = looper2;
        this.mArray.f212661d = new com.tencent.mm.vending.base.d(this);
        com.tencent.mm.vending.base.y yVar = new com.tencent.mm.vending.base.y(this.mSubscriberLooper, looper2);
        this.mVendingSync = yVar;
        yVar.f212678f = new com.tencent.mm.vending.base.e(this);
        this.mSubscriberHandler = new com.tencent.mm.vending.base.f(this, this.mSubscriberLooper);
        this.mVendingHandler = new com.tencent.mm.vending.base.g(this, this.mVendingLooper);
        this.mLoader = new com.tencent.mm.vending.base.r(this.mVendingLooper, new com.tencent.mm.vending.base.h(this));
    }

    private void notifyVendingDataChange(boolean z17) {
        if (this.mCallDestroyed.get()) {
            return;
        }
        if (android.os.Looper.myLooper() != this.mSubscriberLooper && android.os.Looper.myLooper() != this.mVendingLooper) {
            throw new java.lang.IllegalAccessError("Call from wrong thread");
        }
        if (z17) {
            this.mVendingSync.a(2, null);
            return;
        }
        synchronized (this.mPendingDataChangeLock) {
            if (this.mFreezeDataChange) {
                this.mHasPendingDataChange = true;
                return;
            }
            if (android.os.Looper.myLooper() == this.mVendingLooper) {
                callPrepareVendingData();
                return;
            }
            this.mVendingHandler.removeMessages(1);
            android.os.Handler handler = this.mVendingHandler;
            handler.sendMessage(handler.obtainMessage(1));
            this.mVendingHandler.post(new com.tencent.mm.vending.base.i(this));
        }
    }
}
