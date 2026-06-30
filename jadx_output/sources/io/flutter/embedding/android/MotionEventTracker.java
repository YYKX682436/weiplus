package io.flutter.embedding.android;

/* loaded from: classes14.dex */
public final class MotionEventTracker {
    private static io.flutter.embedding.android.MotionEventTracker INSTANCE = null;
    private static final java.lang.String TAG = "MotionEventTracker";
    private final android.util.LongSparseArray<android.view.MotionEvent> eventById = new android.util.LongSparseArray<>();
    private final java.util.PriorityQueue<java.lang.Long> unusedEvents = new java.util.PriorityQueue<>();

    /* loaded from: classes14.dex */
    public static class MotionEventId {
        private static final java.util.concurrent.atomic.AtomicLong ID_COUNTER = new java.util.concurrent.atomic.AtomicLong(0);

        /* renamed from: id, reason: collision with root package name */
        private final long f293195id;

        private MotionEventId(long j17) {
            this.f293195id = j17;
        }

        public static io.flutter.embedding.android.MotionEventTracker.MotionEventId createUnique() {
            return from(ID_COUNTER.incrementAndGet());
        }

        public static io.flutter.embedding.android.MotionEventTracker.MotionEventId from(long j17) {
            return new io.flutter.embedding.android.MotionEventTracker.MotionEventId(j17);
        }

        public long getId() {
            return this.f293195id;
        }
    }

    private MotionEventTracker() {
    }

    public static io.flutter.embedding.android.MotionEventTracker getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new io.flutter.embedding.android.MotionEventTracker();
        }
        return INSTANCE;
    }

    public android.view.MotionEvent pop(io.flutter.embedding.android.MotionEventTracker.MotionEventId motionEventId) {
        while (!this.unusedEvents.isEmpty() && this.unusedEvents.peek().longValue() < motionEventId.f293195id) {
            this.eventById.remove(this.unusedEvents.poll().longValue());
        }
        if (!this.unusedEvents.isEmpty() && this.unusedEvents.peek().longValue() == motionEventId.f293195id) {
            this.unusedEvents.poll();
        }
        android.view.MotionEvent motionEvent = this.eventById.get(motionEventId.f293195id);
        this.eventById.remove(motionEventId.f293195id);
        return motionEvent;
    }

    public io.flutter.embedding.android.MotionEventTracker.MotionEventId track(android.view.MotionEvent motionEvent) {
        io.flutter.embedding.android.MotionEventTracker.MotionEventId createUnique = io.flutter.embedding.android.MotionEventTracker.MotionEventId.createUnique();
        this.eventById.put(createUnique.f293195id, android.view.MotionEvent.obtain(motionEvent));
        this.unusedEvents.add(java.lang.Long.valueOf(createUnique.f293195id));
        return createUnique;
    }
}
