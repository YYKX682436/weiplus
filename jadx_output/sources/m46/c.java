package m46;

/* loaded from: classes13.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f323467a = {-3, 55, 122, 88, 90, 0};

    /* renamed from: b, reason: collision with root package name */
    public static volatile m46.b f323468b;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(".txz", ".tar");
        hashMap.put(".xz", "");
        hashMap.put("-xz", "");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.Collections.unmodifiableMap(hashMap);
        int i17 = Integer.MIN_VALUE;
        int i18 = Integer.MAX_VALUE;
        int i19 = Integer.MAX_VALUE;
        int i27 = Integer.MIN_VALUE;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            int length = ((java.lang.String) entry.getKey()).length();
            if (length > i17) {
                i17 = length;
            }
            if (length < i18) {
                i18 = length;
            }
            java.lang.String str = (java.lang.String) entry.getValue();
            int length2 = str.length();
            if (length2 > 0) {
                if (!hashMap2.containsKey(str)) {
                    hashMap2.put(str, entry.getKey());
                }
                if (length2 > i27) {
                    i27 = length2;
                }
                if (length2 < i19) {
                    i19 = length2;
                }
            }
        }
        m46.b bVar = m46.b.DONT_CACHE;
        f323468b = bVar;
        boolean z17 = true;
        if (!(!r46.i.f392507a)) {
            f323468b = bVar;
        } else if (f323468b == bVar) {
            try {
                m46.a.b(null, 0);
            } catch (java.lang.NoClassDefFoundError unused) {
                z17 = false;
            }
            f323468b = z17 ? m46.b.CACHED_AVAILABLE : m46.b.CACHED_UNAVAILABLE;
        }
    }
}
