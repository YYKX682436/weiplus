package org.chromium.base;

/* loaded from: classes5.dex */
public final class CollectionUtil {
    private CollectionUtil() {
    }

    public static boolean[] booleanListToBooleanArray(java.util.List<java.lang.Boolean> list) {
        boolean[] zArr = new boolean[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            zArr[i17] = list.get(i17).booleanValue();
        }
        return zArr;
    }

    public static int[] integerCollectionToIntArray(java.util.Collection<java.lang.Integer> collection) {
        int[] iArr = new int[collection.size()];
        java.util.Iterator<java.lang.Integer> it = collection.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            iArr[i17] = it.next().intValue();
            i17++;
        }
        return iArr;
    }

    public static long[] longListToLongArray(java.util.List<java.lang.Long> list) {
        long[] jArr = new long[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            jArr[i17] = list.get(i17).longValue();
        }
        return jArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.SafeVarargs
    public static <K, V> java.util.HashMap<K, V> newHashMap(android.util.Pair<? extends K, ? extends V>... pairArr) {
        com.tencent.liteav.videobase.videobase.e.AnonymousClass2 anonymousClass2 = (java.util.HashMap<K, V>) new java.util.HashMap();
        for (android.util.Pair<? extends K, ? extends V> pair : pairArr) {
            anonymousClass2.put(pair.first, pair.second);
        }
        return anonymousClass2;
    }

    @java.lang.SafeVarargs
    public static <E> java.util.HashSet<E> newHashSet(E... eArr) {
        java.util.HashSet<E> hashSet = new java.util.HashSet<>(eArr.length);
        java.util.Collections.addAll(hashSet, eArr);
        return hashSet;
    }

    public static <T> java.util.List<T> strengthen(java.util.Collection<java.lang.ref.WeakReference<T>> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
        java.util.Iterator<java.lang.ref.WeakReference<T>> it = collection.iterator();
        while (it.hasNext()) {
            T t17 = it.next().get();
            if (t17 == null) {
                it.remove();
            } else {
                arrayList.add(t17);
            }
        }
        return arrayList;
    }
}
