package d55;

/* loaded from: classes12.dex */
public class w implements d55.x {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f226620a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f226621b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f226622c = new android.os.Bundle();

    /* renamed from: d, reason: collision with root package name */
    public android.content.SharedPreferences f226623d;

    public w(android.content.Context context, java.lang.String str) {
        this.f226620a = context;
        this.f226621b = str;
    }

    @Override // d55.x
    public /* bridge */ /* synthetic */ d55.x a() {
        e();
        return this;
    }

    public final void b() {
        if (this.f226623d == null) {
            throw new java.lang.IllegalStateException("Persis#load() has not yet been called");
        }
    }

    @Override // d55.x
    public /* bridge */ /* synthetic */ d55.x c() {
        h();
        return this;
    }

    @Override // d55.x
    public d55.x d() {
        b();
        f().apply();
        return this;
    }

    public d55.w e() {
        this.f226623d = this.f226620a.getSharedPreferences(this.f226621b, 4);
        return this;
    }

    public final android.content.SharedPreferences.Editor f() {
        android.content.SharedPreferences.Editor edit = this.f226623d.edit();
        android.os.Bundle bundle = this.f226622c;
        for (java.lang.String str : bundle.keySet()) {
            java.lang.Object obj = bundle.get(str);
            if (obj != null) {
                java.lang.String obj2 = obj.toString();
                if (d55.n0.b(obj2)) {
                    try {
                        edit.putLong(str, java.lang.Long.parseLong(obj2));
                    } catch (java.lang.Throwable unused) {
                    }
                } else if (obj2.equalsIgnoreCase("true") || obj2.equalsIgnoreCase("false")) {
                    edit.putBoolean(str, java.lang.Boolean.parseBoolean(obj2));
                } else {
                    edit.putString(str, obj2);
                }
            }
        }
        return edit;
    }

    public d55.w g(java.lang.String str, long j17) {
        b();
        this.f226622c.putLong(str, j17);
        return this;
    }

    @Override // d55.x
    public boolean getBoolean(java.lang.String str, boolean z17) {
        b();
        android.os.Bundle bundle = this.f226622c;
        return bundle.containsKey(str) ? bundle.getBoolean(str) : this.f226623d.getBoolean(str, z17);
    }

    @Override // d55.x
    public int getInt(java.lang.String str, int i17) {
        return d55.n0.d(getLong(str, i17), i17);
    }

    @Override // d55.x
    public long getLong(java.lang.String str, long j17) {
        b();
        android.os.Bundle bundle = this.f226622c;
        if (bundle.containsKey(str)) {
            return bundle.getLong(str);
        }
        android.content.SharedPreferences sharedPreferences = this.f226623d;
        if (!sharedPreferences.contains(str)) {
            return j17;
        }
        try {
            return sharedPreferences.getLong(str, j17);
        } catch (java.lang.Throwable unused) {
            try {
                return sharedPreferences.getInt(str, 0);
            } catch (java.lang.Throwable unused2) {
                return j17;
            }
        }
    }

    @Override // d55.x
    public java.lang.String getString(java.lang.String str, java.lang.String str2) {
        b();
        android.os.Bundle bundle = this.f226622c;
        return bundle.containsKey(str) ? bundle.getString(str) : this.f226623d.getString(str, str2);
    }

    public d55.w h() {
        b();
        f().commit();
        return this;
    }

    @Override // d55.x
    public d55.x putBoolean(java.lang.String str, boolean z17) {
        b();
        this.f226622c.putBoolean(str, z17);
        return this;
    }

    @Override // d55.x
    public d55.x putInt(java.lang.String str, int i17) {
        g(str, i17);
        return this;
    }

    @Override // d55.x
    public /* bridge */ /* synthetic */ d55.x putLong(java.lang.String str, long j17) {
        g(str, j17);
        return this;
    }

    @Override // d55.x
    public d55.x putString(java.lang.String str, java.lang.String str2) {
        b();
        this.f226622c.putString(str, str2);
        return this;
    }
}
