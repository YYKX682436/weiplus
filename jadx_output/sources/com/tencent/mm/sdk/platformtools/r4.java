package com.tencent.mm.sdk.platformtools;

/* loaded from: classes8.dex */
public final class r4 implements android.content.SharedPreferences.Editor {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f192955d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f192956e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences f192957f;

    public r4(com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences multiProcessSharedPreferences) {
        this.f192957f = multiProcessSharedPreferences;
    }

    public final boolean a(java.lang.String str) {
        boolean z17;
        com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences multiProcessSharedPreferences = this.f192957f;
        if (multiProcessSharedPreferences.f192419g) {
            return false;
        }
        synchronized (multiProcessSharedPreferences) {
            com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences multiProcessSharedPreferences2 = this.f192957f;
            multiProcessSharedPreferences2.a(multiProcessSharedPreferences2.f192416d);
            java.lang.String[] strArr = {java.lang.String.valueOf(this.f192957f.f192418f), java.lang.String.valueOf(this.f192956e)};
            synchronized (this) {
                z17 = this.f192957f.f192416d.getContentResolver().update(android.net.Uri.withAppendedPath(android.net.Uri.withAppendedPath(com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.f192415p, this.f192957f.f192417e), str), com.tencent.mm.sdk.platformtools.s4.a((java.util.HashMap) this.f192955d), null, strArr) > 0;
            }
        }
        return z17;
    }

    @Override // android.content.SharedPreferences.Editor
    public void apply() {
        a("apply");
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor clear() {
        synchronized (this) {
            this.f192956e = true;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public boolean commit() {
        return a("commit");
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putBoolean(java.lang.String str, boolean z17) {
        synchronized (this) {
            ((java.util.HashMap) this.f192955d).put(str, java.lang.Boolean.valueOf(z17));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putFloat(java.lang.String str, float f17) {
        synchronized (this) {
            ((java.util.HashMap) this.f192955d).put(str, java.lang.Float.valueOf(f17));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putInt(java.lang.String str, int i17) {
        synchronized (this) {
            ((java.util.HashMap) this.f192955d).put(str, java.lang.Integer.valueOf(i17));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putLong(java.lang.String str, long j17) {
        synchronized (this) {
            ((java.util.HashMap) this.f192955d).put(str, java.lang.Long.valueOf(j17));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putString(java.lang.String str, java.lang.String str2) {
        synchronized (this) {
            ((java.util.HashMap) this.f192955d).put(str, str2);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putStringSet(java.lang.String str, java.util.Set set) {
        synchronized (this) {
            ((java.util.HashMap) this.f192955d).put(str, set == null ? null : new java.util.HashSet(set));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor remove(java.lang.String str) {
        synchronized (this) {
            ((java.util.HashMap) this.f192955d).put(str, null);
        }
        return this;
    }
}
