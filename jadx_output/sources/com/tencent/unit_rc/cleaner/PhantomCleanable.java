package com.tencent.unit_rc.cleaner;

/* loaded from: classes16.dex */
public abstract class PhantomCleanable<T> extends java.lang.ref.PhantomReference<T> implements com.tencent.unit_rc.cleaner.Cleaner.Cleanable {
    private final com.tencent.unit_rc.cleaner.PhantomCleanable<?> list;
    com.tencent.unit_rc.cleaner.PhantomCleanable<?> next;
    com.tencent.unit_rc.cleaner.PhantomCleanable<?> prev;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PhantomCleanable(T t17, com.tencent.unit_rc.cleaner.Cleaner cleaner) {
        super(t17, com.tencent.unit_rc.cleaner.CleanerImpl.getCleanerImpl(cleaner).queue);
        java.util.Objects.requireNonNull(t17);
        this.prev = this;
        this.next = this;
        this.list = com.tencent.unit_rc.cleaner.CleanerImpl.getCleanerImpl(cleaner).phantomCleanableList;
        insert();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void insert() {
        synchronized (this.list) {
            com.tencent.unit_rc.cleaner.PhantomCleanable<?> phantomCleanable = this.list;
            this.prev = phantomCleanable;
            com.tencent.unit_rc.cleaner.PhantomCleanable<?> phantomCleanable2 = phantomCleanable.next;
            this.next = phantomCleanable2;
            phantomCleanable2.prev = this;
            phantomCleanable.next = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean remove() {
        synchronized (this.list) {
            com.tencent.unit_rc.cleaner.PhantomCleanable<?> phantomCleanable = this.next;
            if (phantomCleanable == this) {
                return false;
            }
            phantomCleanable.prev = this.prev;
            this.prev.next = phantomCleanable;
            this.prev = this;
            this.next = this;
            return true;
        }
    }

    @Override // com.tencent.unit_rc.cleaner.Cleaner.Cleanable
    public final void clean() {
        if (remove()) {
            super.clear();
            performCleanup();
        }
    }

    @Override // java.lang.ref.Reference
    public void clear() {
        if (remove()) {
            super.clear();
        }
    }

    @Override // java.lang.ref.Reference
    public final boolean enqueue() {
        throw new java.lang.UnsupportedOperationException("enqueue");
    }

    @Override // java.lang.ref.Reference
    public final boolean isEnqueued() {
        throw new java.lang.UnsupportedOperationException("isEnqueued");
    }

    public boolean isListEmpty() {
        boolean z17;
        synchronized (this.list) {
            com.tencent.unit_rc.cleaner.PhantomCleanable<?> phantomCleanable = this.list;
            z17 = phantomCleanable == phantomCleanable.next;
        }
        return z17;
    }

    public abstract void performCleanup();

    /* JADX WARN: Multi-variable type inference failed */
    public PhantomCleanable() {
        super(null, null);
        this.prev = this;
        this.next = this;
        this.list = this;
    }
}
