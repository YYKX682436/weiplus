package ri;

/* loaded from: classes12.dex */
public abstract class c0 extends ri.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f395855a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.SharedPreferences.Editor f395856b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f395857c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f395858d;

    public c0(android.content.Context context, long j17, java.lang.String str, ri.e0 e0Var) {
        super(e0Var);
        long j18;
        long j19;
        this.f395858d = context;
        this.f395855a = j17;
        java.lang.String str2 = "Matrix_" + str + oj.m.b(context);
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(str2, 0);
        this.f395857c = new java.util.HashMap();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f395856b = sharedPreferences.edit();
        java.util.HashSet hashSet = sharedPreferences.getAll() != null ? new java.util.HashSet(sharedPreferences.getAll().keySet()) : null;
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                try {
                    j18 = sharedPreferences.getLong(str3, 0L);
                    j19 = currentTimeMillis - j18;
                } catch (java.lang.ClassCastException e17) {
                    oj.j.d("Matrix.FilePublisher", e17, "might be polluted - sp: %s, key: %s, value : %s", str2, str3, sharedPreferences.getAll().get(str3));
                }
                if (j18 > 0 && j19 <= this.f395855a) {
                    this.f395857c.put(str3, java.lang.Long.valueOf(j18));
                }
                this.f395856b.remove(str3);
            }
        }
        android.content.SharedPreferences.Editor editor = this.f395856b;
        if (editor != null) {
            editor.apply();
        }
    }

    public boolean a(java.lang.String str) {
        java.util.HashMap hashMap = this.f395857c;
        if (!hashMap.containsKey(str)) {
            return false;
        }
        long longValue = ((java.lang.Long) hashMap.get(str)).longValue();
        if (longValue > 0 && java.lang.System.currentTimeMillis() - longValue <= this.f395855a) {
            return true;
        }
        android.content.SharedPreferences.Editor remove = this.f395856b.remove(str);
        if (remove != null) {
            remove.apply();
        }
        hashMap.remove(str);
        return false;
    }

    public void b(java.lang.String str, boolean z17) {
        android.content.SharedPreferences.Editor putLong;
        if (str == null) {
            return;
        }
        java.util.HashMap hashMap = this.f395857c;
        if (hashMap.containsKey(str)) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        hashMap.put(str, java.lang.Long.valueOf(currentTimeMillis));
        if (!z17 || (putLong = this.f395856b.putLong(str, currentTimeMillis)) == null) {
            return;
        }
        putLong.apply();
    }
}
