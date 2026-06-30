package io.flutter.plugins.webviewflutter;

/* loaded from: classes13.dex */
public class InstanceManager {
    private static final long CLEAR_FINALIZED_WEAK_REFERENCES_INTERVAL = 3000;
    private static final long MIN_HOST_CREATED_IDENTIFIER = 65536;
    private static final java.lang.String TAG = "InstanceManager";
    private final io.flutter.plugins.webviewflutter.InstanceManager.FinalizationListener finalizationListener;
    private final android.os.Handler handler;
    private boolean hasFinalizationListenerStopped;
    private long nextIdentifier;
    private final java.util.WeakHashMap<java.lang.Object, java.lang.Long> identifiers = new java.util.WeakHashMap<>();
    private final java.util.HashMap<java.lang.Long, java.lang.ref.WeakReference<java.lang.Object>> weakInstances = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.Long, java.lang.Object> strongInstances = new java.util.HashMap<>();
    private final java.lang.ref.ReferenceQueue<java.lang.Object> referenceQueue = new java.lang.ref.ReferenceQueue<>();
    private final java.util.HashMap<java.lang.ref.WeakReference<java.lang.Object>, java.lang.Long> weakReferencesToIdentifiers = new java.util.HashMap<>();

    /* loaded from: classes13.dex */
    public interface FinalizationListener {
        void onFinalize(long j17);
    }

    private InstanceManager(io.flutter.plugins.webviewflutter.InstanceManager.FinalizationListener finalizationListener) {
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.handler = handler;
        this.nextIdentifier = 65536L;
        this.hasFinalizationListenerStopped = false;
        this.finalizationListener = finalizationListener;
        handler.postDelayed(new io.flutter.plugins.webviewflutter.InstanceManager$$a(this), CLEAR_FINALIZED_WEAK_REFERENCES_INTERVAL);
    }

    private void addInstance(java.lang.Object obj, long j17) {
        if (j17 < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Identifier must be >= 0: %d", java.lang.Long.valueOf(j17)));
        }
        if (this.weakInstances.containsKey(java.lang.Long.valueOf(j17))) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Identifier has already been added: %d", java.lang.Long.valueOf(j17)));
        }
        java.lang.ref.WeakReference<java.lang.Object> weakReference = new java.lang.ref.WeakReference<>(obj, this.referenceQueue);
        this.identifiers.put(obj, java.lang.Long.valueOf(j17));
        this.weakInstances.put(java.lang.Long.valueOf(j17), weakReference);
        this.weakReferencesToIdentifiers.put(weakReference, java.lang.Long.valueOf(j17));
        this.strongInstances.put(java.lang.Long.valueOf(j17), obj);
    }

    public static io.flutter.plugins.webviewflutter.InstanceManager create(io.flutter.plugins.webviewflutter.InstanceManager.FinalizationListener finalizationListener) {
        return new io.flutter.plugins.webviewflutter.InstanceManager(finalizationListener);
    }

    private void logWarningIfFinalizationListenerHasStopped() {
        hasFinalizationListenerStopped();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseAllFinalizedInstances() {
        if (hasFinalizationListenerStopped()) {
            return;
        }
        while (true) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.referenceQueue.poll();
            if (weakReference == null) {
                this.handler.postDelayed(new io.flutter.plugins.webviewflutter.InstanceManager$$a(this), CLEAR_FINALIZED_WEAK_REFERENCES_INTERVAL);
                return;
            }
            java.lang.Long remove = this.weakReferencesToIdentifiers.remove(weakReference);
            if (remove != null) {
                this.weakInstances.remove(remove);
                this.strongInstances.remove(remove);
                this.finalizationListener.onFinalize(remove.longValue());
            }
        }
    }

    public void addDartCreatedInstance(java.lang.Object obj, long j17) {
        logWarningIfFinalizationListenerHasStopped();
        addInstance(obj, j17);
    }

    public long addHostCreatedInstance(java.lang.Object obj) {
        logWarningIfFinalizationListenerHasStopped();
        if (containsInstance(obj)) {
            throw new java.lang.IllegalArgumentException("Instance of " + obj.getClass() + " has already been added.");
        }
        long j17 = this.nextIdentifier;
        this.nextIdentifier = 1 + j17;
        addInstance(obj, j17);
        return j17;
    }

    public void clear() {
        this.identifiers.clear();
        this.weakInstances.clear();
        this.strongInstances.clear();
        this.weakReferencesToIdentifiers.clear();
    }

    public boolean containsInstance(java.lang.Object obj) {
        logWarningIfFinalizationListenerHasStopped();
        return this.identifiers.containsKey(obj);
    }

    public java.lang.Long getIdentifierForStrongReference(java.lang.Object obj) {
        logWarningIfFinalizationListenerHasStopped();
        java.lang.Long l17 = this.identifiers.get(obj);
        if (l17 != null) {
            this.strongInstances.put(l17, obj);
        }
        return l17;
    }

    public <T> T getInstance(long j17) {
        logWarningIfFinalizationListenerHasStopped();
        java.lang.ref.WeakReference<java.lang.Object> weakReference = this.weakInstances.get(java.lang.Long.valueOf(j17));
        if (weakReference != null) {
            return (T) weakReference.get();
        }
        return null;
    }

    public boolean hasFinalizationListenerStopped() {
        return this.hasFinalizationListenerStopped;
    }

    public <T> T remove(long j17) {
        logWarningIfFinalizationListenerHasStopped();
        return (T) this.strongInstances.remove(java.lang.Long.valueOf(j17));
    }

    public void stopFinalizationListener() {
        this.handler.removeCallbacks(new io.flutter.plugins.webviewflutter.InstanceManager$$a(this));
        this.hasFinalizationListenerStopped = true;
    }
}
