package wq4;

/* loaded from: classes14.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f448616c;

    /* renamed from: d, reason: collision with root package name */
    public static android.content.Context f448617d;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f448618a;

    /* renamed from: b, reason: collision with root package name */
    public final android.media.ToneGenerator f448619b;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f448616c = hashMap;
        hashMap.put("1", 1);
        hashMap.put("2", 2);
        hashMap.put("3", 3);
        hashMap.put("4", 4);
        hashMap.put("5", 5);
        hashMap.put("6", 6);
        hashMap.put("7", 7);
        hashMap.put("8", 8);
        hashMap.put("9", 9);
        hashMap.put("0", 0);
        hashMap.put("#", 11);
        hashMap.put("*", 10);
    }

    public c(android.content.Context context) {
        java.lang.Object obj = new java.lang.Object();
        this.f448618a = obj;
        f448617d = context;
        if (context != null) {
            try {
                synchronized (obj) {
                    boolean z17 = true;
                    if (android.provider.Settings.System.getInt(f448617d.getContentResolver(), "dtmf_tone", 1) != 1) {
                        z17 = false;
                    }
                    if (z17 && this.f448619b == null) {
                        this.f448619b = new android.media.ToneGenerator(3, 66);
                    }
                }
            } catch (java.lang.Exception e17) {
                e17.getMessage();
                this.f448619b = null;
            }
        }
    }
}
