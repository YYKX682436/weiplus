package org.chromium.base;

/* loaded from: classes13.dex */
public class ResettersForTesting {
    private static final java.util.LinkedHashSet<java.lang.Runnable> sClassResetters;
    private static boolean sMethodMode;
    private static final java.util.LinkedHashSet<java.lang.Runnable> sMethodResetters;

    static {
        sClassResetters = org.chromium.build.BuildConfig.IS_FOR_TEST ? new java.util.LinkedHashSet<>() : null;
        sMethodResetters = org.chromium.build.BuildConfig.IS_FOR_TEST ? new java.util.LinkedHashSet<>() : null;
    }

    private static void flushResetters(java.util.LinkedHashSet linkedHashSet) {
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashSet);
        linkedHashSet.clear();
        java.util.Collections.reverse(arrayList);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }

    public static void onAfterClass() {
        flushResetters(sClassResetters);
        sMethodMode = false;
    }

    public static void onAfterMethod() {
        flushResetters(sMethodResetters);
    }

    public static void register(java.lang.Runnable runnable) {
        if (org.chromium.build.BuildConfig.IS_FOR_TEST) {
            if (sMethodMode) {
                sMethodResetters.add(runnable);
            } else {
                sClassResetters.add(runnable);
            }
        }
    }

    public static void setMethodMode() {
        sMethodMode = true;
    }
}
