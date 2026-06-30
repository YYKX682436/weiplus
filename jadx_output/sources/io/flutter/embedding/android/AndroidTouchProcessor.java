package io.flutter.embedding.android;

/* loaded from: classes14.dex */
public class AndroidTouchProcessor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int BYTES_PER_FIELD = 8;
    static final int DEFAULT_HORIZONTAL_SCROLL_FACTOR = 48;
    static final int DEFAULT_VERTICAL_SCROLL_FACTOR = 48;
    private static final android.graphics.Matrix IDENTITY_TRANSFORM = new android.graphics.Matrix();
    private static final int IMPLICIT_VIEW_ID = 0;
    static final int POINTER_DATA_FIELD_COUNT = 36;
    private static final int POINTER_DATA_FLAG_BATCHED = 1;
    private static final java.lang.String TAG = "AndroidTouchProcessor";
    private static final int TOOL_TYPE_BITS = 3;
    private static final int TOOL_TYPE_MASK = 7;
    private int cachedVerticalScrollFactor;
    private final io.flutter.embedding.engine.renderer.FlutterRenderer renderer;
    private final boolean trackMotionEvents;
    private final java.util.Map<java.lang.Integer, float[]> ongoingPans = new java.util.HashMap();
    private final io.flutter.embedding.android.MotionEventTracker motionEventTracker = io.flutter.embedding.android.MotionEventTracker.getInstance();

    /* loaded from: classes14.dex */
    public @interface PointerChange {
        public static final int ADD = 1;
        public static final int CANCEL = 0;
        public static final int DOWN = 4;
        public static final int HOVER = 3;
        public static final int MOVE = 5;
        public static final int PAN_ZOOM_END = 9;
        public static final int PAN_ZOOM_START = 7;
        public static final int PAN_ZOOM_UPDATE = 8;
        public static final int REMOVE = 2;
        public static final int UP = 6;
    }

    /* loaded from: classes11.dex */
    public @interface PointerDeviceKind {
        public static final int INVERTED_STYLUS = 3;
        public static final int MOUSE = 1;
        public static final int STYLUS = 2;
        public static final int TOUCH = 0;
        public static final int TRACKPAD = 4;
        public static final int UNKNOWN = 5;
    }

    /* loaded from: classes11.dex */
    public @interface PointerSignalKind {
        public static final int NONE = 0;
        public static final int SCALE = 3;
        public static final int SCROLL = 1;
        public static final int SCROLL_INERTIA_CANCEL = 2;
        public static final int UNKNOWN = 4;
    }

    public AndroidTouchProcessor(io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer, boolean z17) {
        this.renderer = flutterRenderer;
        this.trackMotionEvents = z17;
    }

    private void addPointerForIndex(android.view.MotionEvent motionEvent, int i17, int i18, int i19, android.graphics.Matrix matrix, java.nio.ByteBuffer byteBuffer) {
        addPointerForIndex(motionEvent, i17, i18, i19, matrix, byteBuffer, null);
    }

    private float getHorizontalScrollFactor(android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 26 ? android.view.ViewConfiguration.get(context).getScaledHorizontalScrollFactor() : getVerticalScrollFactorPre26(context);
    }

    private int getPointerChangeForAction(int i17) {
        if (i17 == 0) {
            return 4;
        }
        if (i17 == 1) {
            return 6;
        }
        if (i17 == 5) {
            return 4;
        }
        if (i17 == 6) {
            return 6;
        }
        if (i17 == 2) {
            return 5;
        }
        if (i17 == 7) {
            return 3;
        }
        if (i17 == 3) {
            return 0;
        }
        return i17 == 8 ? 3 : -1;
    }

    private int getPointerChangeForPanZoom(int i17) {
        if (i17 == 4) {
            return 7;
        }
        if (i17 == 5) {
            return 8;
        }
        return (i17 == 6 || i17 == 0) ? 9 : -1;
    }

    private int getPointerDeviceTypeForToolType(int i17) {
        if (i17 == 1) {
            return 0;
        }
        if (i17 == 2) {
            return 2;
        }
        if (i17 != 3) {
            return i17 != 4 ? 5 : 3;
        }
        return 1;
    }

    private float getVerticalScrollFactor(android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 26 ? getVerticalScrollFactorAbove26(context) : getVerticalScrollFactorPre26(context);
    }

    private float getVerticalScrollFactorAbove26(android.content.Context context) {
        return android.view.ViewConfiguration.get(context).getScaledVerticalScrollFactor();
    }

    private int getVerticalScrollFactorPre26(android.content.Context context) {
        if (this.cachedVerticalScrollFactor == 0) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (!context.getTheme().resolveAttribute(android.R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.cachedVerticalScrollFactor = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.cachedVerticalScrollFactor;
    }

    private int uniquePointerIdByType(android.view.MotionEvent motionEvent, int i17) {
        return (motionEvent.getToolType(i17) & 7) | (motionEvent.getPointerId(i17) << 3);
    }

    public boolean onGenericMotionEvent(android.view.MotionEvent motionEvent, android.content.Context context) {
        boolean isFromSource = motionEvent.isFromSource(2);
        boolean z17 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!isFromSource || !z17) {
            return false;
        }
        int pointerChangeForAction = getPointerChangeForAction(motionEvent.getActionMasked());
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 36 * 8);
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, IDENTITY_TRANSFORM, allocateDirect, context);
        if (allocateDirect.position() % 288 != 0) {
            throw new java.lang.AssertionError("Packet position is not on field boundary.");
        }
        this.renderer.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
        return true;
    }

    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return onTouchEvent(motionEvent, IDENTITY_TRANSFORM);
    }

    private void addPointerForIndex(android.view.MotionEvent motionEvent, int i17, int i18, int i19, android.graphics.Matrix matrix, java.nio.ByteBuffer byteBuffer, android.content.Context context) {
        long j17;
        int i27;
        double d17;
        double d18;
        double d19;
        double d27;
        double d28;
        double d29;
        android.view.InputDevice.MotionRange motionRange;
        int i28 = -1;
        if (i18 == -1) {
            return;
        }
        int uniquePointerIdByType = uniquePointerIdByType(motionEvent, i17);
        int pointerDeviceTypeForToolType = getPointerDeviceTypeForToolType(motionEvent.getToolType(i17));
        float[] fArr = {motionEvent.getX(i17), motionEvent.getY(i17)};
        matrix.mapPoints(fArr);
        if (pointerDeviceTypeForToolType == 1) {
            j17 = motionEvent.getButtonState() & 31;
            if (j17 == 0 && motionEvent.getSource() == 8194 && i18 == 4) {
                this.ongoingPans.put(java.lang.Integer.valueOf(uniquePointerIdByType), fArr);
            }
        } else {
            j17 = pointerDeviceTypeForToolType == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = this.ongoingPans.containsKey(java.lang.Integer.valueOf(uniquePointerIdByType));
        if (containsKey) {
            int pointerChangeForPanZoom = getPointerChangeForPanZoom(i18);
            if (pointerChangeForPanZoom == -1) {
                return;
            } else {
                i28 = pointerChangeForPanZoom;
            }
        }
        long id6 = this.trackMotionEvents ? this.motionEventTracker.track(motionEvent).getId() : 0L;
        int i29 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        int i37 = i28;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(id6);
        byteBuffer.putLong(eventTime);
        if (containsKey) {
            i27 = i37;
            byteBuffer.putLong(i27);
            byteBuffer.putLong(4L);
        } else {
            i27 = i37;
            byteBuffer.putLong(i18);
            byteBuffer.putLong(pointerDeviceTypeForToolType);
        }
        byteBuffer.putLong(i29);
        byteBuffer.putLong(uniquePointerIdByType);
        byteBuffer.putLong(0L);
        if (containsKey) {
            float[] fArr2 = this.ongoingPans.get(java.lang.Integer.valueOf(uniquePointerIdByType));
            byteBuffer.putDouble(fArr2[0]);
            byteBuffer.putDouble(fArr2[1]);
        } else {
            byteBuffer.putDouble(fArr[0]);
            byteBuffer.putDouble(fArr[1]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j17);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i17));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            d17 = 1.0d;
            d18 = 0.0d;
        } else {
            d18 = motionRange.getMin();
            d17 = motionRange.getMax();
        }
        byteBuffer.putDouble(d18);
        byteBuffer.putDouble(d17);
        if (pointerDeviceTypeForToolType == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i17));
            d19 = 0.0d;
            byteBuffer.putDouble(0.0d);
        } else {
            d19 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i17));
        byteBuffer.putDouble(motionEvent.getToolMajor(i17));
        byteBuffer.putDouble(motionEvent.getToolMinor(i17));
        byteBuffer.putDouble(d19);
        byteBuffer.putDouble(d19);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i17));
        if (pointerDeviceTypeForToolType == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i17));
        } else {
            byteBuffer.putDouble(d19);
        }
        byteBuffer.putLong(i19);
        if (i29 == 1) {
            if (context != null) {
                d28 = getHorizontalScrollFactor(context);
                d29 = getVerticalScrollFactor(context);
            } else {
                d28 = 48.0d;
                d29 = 48.0d;
            }
            byteBuffer.putDouble(d28 * (-motionEvent.getAxisValue(10, i17)));
            byteBuffer.putDouble(d29 * (-motionEvent.getAxisValue(9, i17)));
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (containsKey) {
            float[] fArr3 = this.ongoingPans.get(java.lang.Integer.valueOf(uniquePointerIdByType));
            byteBuffer.putDouble(fArr[0] - fArr3[0]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d27 = 0.0d;
        } else {
            d27 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d27);
        byteBuffer.putDouble(d27);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d27);
        byteBuffer.putLong(0L);
        if (containsKey && i27 == 9) {
            this.ongoingPans.remove(java.lang.Integer.valueOf(uniquePointerIdByType));
        }
    }

    public boolean onTouchEvent(android.view.MotionEvent motionEvent, android.graphics.Matrix matrix) {
        int actionMasked = motionEvent.getActionMasked();
        int pointerChangeForAction = getPointerChangeForAction(motionEvent.getActionMasked());
        boolean z17 = actionMasked == 0 || actionMasked == 5;
        boolean z18 = !z17 && (actionMasked == 1 || actionMasked == 6);
        int i17 = (z18 && getPointerDeviceTypeForToolType(motionEvent.getToolType(motionEvent.getActionIndex())) == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect((pointerCount + i17) * 36 * 8);
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        if (z17) {
            addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, matrix, allocateDirect);
        } else if (z18) {
            for (int i18 = 0; i18 < pointerCount; i18++) {
                if (i18 != motionEvent.getActionIndex() && motionEvent.getToolType(i18) == 1) {
                    addPointerForIndex(motionEvent, i18, 5, 1, matrix, allocateDirect);
                }
            }
            addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, matrix, allocateDirect);
            if (i17 != 0) {
                addPointerForIndex(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, allocateDirect);
            }
        } else {
            for (int i19 = 0; i19 < pointerCount; i19++) {
                addPointerForIndex(motionEvent, i19, pointerChangeForAction, 0, matrix, allocateDirect);
            }
        }
        if (allocateDirect.position() % 288 == 0) {
            this.renderer.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new java.lang.AssertionError("Packet position is not on field boundary");
    }
}
