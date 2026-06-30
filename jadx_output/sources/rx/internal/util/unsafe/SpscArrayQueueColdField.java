package rx.internal.util.unsafe;

/* loaded from: classes16.dex */
abstract class SpscArrayQueueColdField<E> extends rx.internal.util.unsafe.ConcurrentCircularArrayQueue<E> {
    private static final java.lang.Integer MAX_LOOK_AHEAD_STEP = java.lang.Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    protected final int lookAheadStep;

    public SpscArrayQueueColdField(int i17) {
        super(i17);
        this.lookAheadStep = java.lang.Math.min(i17 / 4, MAX_LOOK_AHEAD_STEP.intValue());
    }
}
