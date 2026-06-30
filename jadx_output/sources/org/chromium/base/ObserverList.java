package org.chromium.base;

/* loaded from: classes13.dex */
public class ObserverList<E> implements java.lang.Iterable<E> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int mCount;
    private int mIterationDepth;
    private boolean mNeedsCompact;
    public final java.util.List<E> mObservers = new java.util.ArrayList();
    private boolean mEnableThreadAsserts = true;
    private final org.chromium.base.ThreadUtils.ThreadChecker mThreadChecker = new org.chromium.base.ThreadUtils.ThreadChecker();

    /* loaded from: classes13.dex */
    public class ObserverListIterator implements org.chromium.base.ObserverList.RewindableIterator<E> {
        private int mIndex;
        private boolean mIsExhausted;
        private int mListEndMarker;

        private void compactListIfNeeded() {
            if (this.mIsExhausted) {
                return;
            }
            this.mIsExhausted = true;
            org.chromium.base.ObserverList.this.decrementIterationDepthAndCompactIfNeeded();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (org.chromium.base.ObserverList.this.mEnableThreadAsserts) {
                org.chromium.base.ObserverList.this.mThreadChecker.assertOnValidThread();
            }
            int i17 = this.mIndex;
            while (i17 < this.mListEndMarker && org.chromium.base.ObserverList.this.getObserverAt(i17) == null) {
                i17++;
            }
            if (i17 < this.mListEndMarker) {
                return true;
            }
            compactListIfNeeded();
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            if (org.chromium.base.ObserverList.this.mEnableThreadAsserts) {
                org.chromium.base.ObserverList.this.mThreadChecker.assertOnValidThread();
            }
            while (true) {
                int i17 = this.mIndex;
                if (i17 >= this.mListEndMarker || org.chromium.base.ObserverList.this.getObserverAt(i17) != null) {
                    break;
                }
                this.mIndex++;
            }
            int i18 = this.mIndex;
            if (i18 >= this.mListEndMarker) {
                compactListIfNeeded();
                throw new java.util.NoSuchElementException();
            }
            org.chromium.base.ObserverList observerList = org.chromium.base.ObserverList.this;
            this.mIndex = i18 + 1;
            return (E) observerList.getObserverAt(i18);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // org.chromium.base.ObserverList.RewindableIterator
        public void rewind() {
            if (org.chromium.base.ObserverList.this.mEnableThreadAsserts) {
                org.chromium.base.ObserverList.this.mThreadChecker.assertOnValidThread();
            }
            compactListIfNeeded();
            org.chromium.base.ObserverList.this.incrementIterationDepth();
            this.mListEndMarker = org.chromium.base.ObserverList.this.capacity();
            this.mIsExhausted = false;
            this.mIndex = 0;
        }

        private ObserverListIterator() {
            org.chromium.base.ObserverList.this.incrementIterationDepth();
            this.mListEndMarker = org.chromium.base.ObserverList.this.capacity();
        }
    }

    /* loaded from: classes6.dex */
    public interface RewindableIterator<E> extends java.util.Iterator<E> {
        void rewind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int capacity() {
        return this.mObservers.size();
    }

    private void compact() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            if (this.mObservers.get(size) == null) {
                this.mObservers.remove(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementIterationDepthAndCompactIfNeeded() {
        int i17 = this.mIterationDepth - 1;
        this.mIterationDepth = i17;
        if (i17 <= 0 && this.mNeedsCompact) {
            this.mNeedsCompact = false;
            compact();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public E getObserverAt(int i17) {
        return this.mObservers.get(i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void incrementIterationDepth() {
        this.mIterationDepth++;
    }

    public boolean addObserver(E e17) {
        if (this.mEnableThreadAsserts) {
            this.mThreadChecker.assertOnValidThread();
        }
        if (e17 == null || this.mObservers.contains(e17)) {
            return false;
        }
        this.mObservers.add(e17);
        this.mCount++;
        return true;
    }

    public void clear() {
        if (this.mEnableThreadAsserts) {
            this.mThreadChecker.assertOnValidThread();
        }
        this.mCount = 0;
        if (this.mIterationDepth == 0) {
            this.mObservers.clear();
            return;
        }
        int size = this.mObservers.size();
        this.mNeedsCompact |= size != 0;
        for (int i17 = 0; i17 < size; i17++) {
            this.mObservers.set(i17, null);
        }
    }

    public void disableThreadAsserts() {
        this.mEnableThreadAsserts = false;
    }

    public boolean hasObserver(E e17) {
        if (this.mEnableThreadAsserts) {
            this.mThreadChecker.assertOnValidThread();
        }
        return this.mObservers.contains(e17);
    }

    public boolean isEmpty() {
        if (this.mEnableThreadAsserts) {
            this.mThreadChecker.assertOnValidThread();
        }
        return this.mCount == 0;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        if (this.mEnableThreadAsserts) {
            this.mThreadChecker.assertOnValidThread();
        }
        return new org.chromium.base.ObserverList.ObserverListIterator();
    }

    public boolean removeObserver(E e17) {
        int indexOf;
        if (this.mEnableThreadAsserts) {
            this.mThreadChecker.assertOnValidThread();
        }
        if (e17 == null || (indexOf = this.mObservers.indexOf(e17)) == -1) {
            return false;
        }
        if (this.mIterationDepth == 0) {
            this.mObservers.remove(indexOf);
        } else {
            this.mNeedsCompact = true;
            this.mObservers.set(indexOf, null);
        }
        this.mCount--;
        return true;
    }

    public org.chromium.base.ObserverList.RewindableIterator<E> rewindableIterator() {
        if (this.mEnableThreadAsserts) {
            this.mThreadChecker.assertOnValidThread();
        }
        return new org.chromium.base.ObserverList.ObserverListIterator();
    }

    public int size() {
        if (this.mEnableThreadAsserts) {
            this.mThreadChecker.assertOnValidThread();
        }
        return this.mCount;
    }
}
