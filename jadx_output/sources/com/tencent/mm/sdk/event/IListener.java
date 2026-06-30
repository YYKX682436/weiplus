package com.tencent.mm.sdk.event;

/* loaded from: classes12.dex */
public abstract class IListener<T extends com.tencent.mm.sdk.event.IEvent> implements androidx.lifecycle.x {
    protected int __eventId;
    private final androidx.lifecycle.y lifecycleOwner;
    private fm5.b mCallbackProperty;
    private final int priority;

    public IListener(androidx.lifecycle.y yVar) {
        this(yVar, 0);
    }

    public static /* synthetic */ void a(com.tencent.mm.sdk.event.IListener iListener) {
        if (iListener.lifecycleOwner.mo133getLifecycle().b() != androidx.lifecycle.n.DESTROYED) {
            iListener.lifecycleOwner.mo133getLifecycle().a(iListener);
        } else {
            iListener.onLifecycleDestroy();
        }
    }

    public int __getEventID() {
        if (this.__eventId == 0) {
            java.lang.System.currentTimeMillis();
            java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
            if (!(genericSuperclass instanceof java.lang.reflect.ParameterizedType)) {
                genericSuperclass = getClass().getSuperclass().getGenericSuperclass();
            }
            this.__eventId = ((java.lang.Class) ((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments()[0]).getName().hashCode();
            java.lang.System.currentTimeMillis();
        }
        return this.__eventId;
    }

    public synchronized void alive() {
        if (this.mCallbackProperty == null) {
            com.tencent.mm.sdk.platformtools.k2.b(this);
            this.mCallbackProperty = com.tencent.mm.sdk.event.d.f192370d.a(this);
        }
        if (!(this.lifecycleOwner.mo133getLifecycle() instanceof i75.a)) {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.sdk.event.IListener$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.sdk.event.IListener.a(com.tencent.mm.sdk.event.IListener.this);
                }
            });
        } else if (this.lifecycleOwner.mo133getLifecycle().b() != androidx.lifecycle.n.DESTROYED) {
            this.lifecycleOwner.mo133getLifecycle().a(this);
        } else {
            onLifecycleDestroy();
        }
    }

    public abstract boolean callback(T t17);

    public synchronized void dead() {
        fm5.b bVar = this.mCallbackProperty;
        if (bVar != null) {
            com.tencent.mm.sdk.platformtools.k2.c((com.tencent.mm.sdk.event.IListener) bVar.f264184e);
            this.mCallbackProperty.dead();
            this.mCallbackProperty = null;
        }
        if (this.lifecycleOwner.mo133getLifecycle() instanceof i75.a) {
            this.lifecycleOwner.mo133getLifecycle().c(this);
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.sdk.event.IListener$$b
                @Override // java.lang.Runnable
                public final void run() {
                    r0.lifecycleOwner.mo133getLifecycle().c(com.tencent.mm.sdk.event.IListener.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getPriority() {
        return this.priority;
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public void onLifecycleDestroy() {
        fm5.b bVar = this.mCallbackProperty;
        if (bVar != null) {
            com.tencent.mm.sdk.platformtools.k2.c((com.tencent.mm.sdk.event.IListener) bVar.f264184e);
            this.mCallbackProperty.dead();
            this.mCallbackProperty = null;
        }
    }

    public IListener(androidx.lifecycle.y yVar, int i17) {
        this.__eventId = 0;
        this.lifecycleOwner = yVar;
        this.priority = i17;
    }
}
