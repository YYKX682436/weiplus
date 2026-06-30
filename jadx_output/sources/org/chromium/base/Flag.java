package org.chromium.base;

/* loaded from: classes.dex */
public abstract class Flag {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static java.util.HashMap<java.lang.String, org.chromium.base.Flag> sFlagsCreated = new java.util.HashMap<>();
    protected final java.lang.String mFeatureName;
    protected java.lang.Boolean mValue;

    public Flag(java.lang.String str) {
        this.mFeatureName = str;
        sFlagsCreated.put(str, this);
    }

    public static void resetAllInMemoryCachedValuesForTesting() {
        java.util.Iterator<org.chromium.base.Flag> it = sFlagsCreated.values().iterator();
        while (it.hasNext()) {
            it.next().clearInMemoryCachedValueForTesting();
        }
    }

    public static void resetFlagsForTesting() {
        resetAllInMemoryCachedValuesForTesting();
        sFlagsCreated.clear();
    }

    public abstract void clearInMemoryCachedValueForTesting();

    public java.lang.String getFeatureName() {
        return this.mFeatureName;
    }

    public abstract boolean isEnabled();
}
