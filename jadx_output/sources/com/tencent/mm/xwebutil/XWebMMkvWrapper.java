package com.tencent.mm.xwebutil;

/* loaded from: classes7.dex */
public class XWebMMkvWrapper implements android.content.SharedPreferences, android.content.SharedPreferences.Editor {
    private com.tencent.mm.sdk.platformtools.o4 mSp;

    public XWebMMkvWrapper(com.tencent.mm.sdk.platformtools.o4 o4Var) {
        this.mSp = o4Var;
    }

    public static android.content.SharedPreferences getMMKV(android.content.Context context, java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.sdk.platformtools.o4 N;
        if (z17) {
            N = com.tencent.mm.sdk.platformtools.o4.Q(str);
        } else {
            N = com.tencent.mm.sdk.platformtools.o4.N(str, i17 == 4 ? 2 : 1, null);
        }
        if (N == null) {
            return null;
        }
        return new com.tencent.mm.xwebutil.XWebMMkvWrapper(N);
    }

    @Override // android.content.SharedPreferences.Editor
    public void apply() {
        this.mSp.getClass();
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor clear() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.mSp;
        o4Var.clear();
        return o4Var;
    }

    @Override // android.content.SharedPreferences.Editor
    public boolean commit() {
        this.mSp.getClass();
        return true;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(java.lang.String str) {
        return this.mSp.contains(str);
    }

    @Override // android.content.SharedPreferences
    public android.content.SharedPreferences.Editor edit() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.mSp;
        o4Var.getClass();
        return o4Var;
    }

    @Override // android.content.SharedPreferences
    public java.util.Map<java.lang.String, ?> getAll() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String[] b17 = this.mSp.b();
        if (b17 == null) {
            return hashMap;
        }
        for (java.lang.String str : b17) {
            hashMap.put(str, "");
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(java.lang.String str, boolean z17) {
        return this.mSp.getBoolean(str, z17);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(java.lang.String str, float f17) {
        return this.mSp.getFloat(str, f17);
    }

    @Override // android.content.SharedPreferences
    public int getInt(java.lang.String str, int i17) {
        return this.mSp.getInt(str, i17);
    }

    @Override // android.content.SharedPreferences
    public long getLong(java.lang.String str, long j17) {
        return this.mSp.getLong(str, j17);
    }

    @Override // android.content.SharedPreferences
    public java.lang.String getString(java.lang.String str, java.lang.String str2) {
        return this.mSp.getString(str, str2);
    }

    @Override // android.content.SharedPreferences
    public java.util.Set<java.lang.String> getStringSet(java.lang.String str, java.util.Set<java.lang.String> set) {
        return this.mSp.getStringSet(str, set);
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putBoolean(java.lang.String str, boolean z17) {
        return this.mSp.putBoolean(str, z17);
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putFloat(java.lang.String str, float f17) {
        return this.mSp.putFloat(str, f17);
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putInt(java.lang.String str, int i17) {
        return this.mSp.putInt(str, i17);
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putLong(java.lang.String str, long j17) {
        return this.mSp.putLong(str, j17);
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putString(java.lang.String str, java.lang.String str2) {
        return this.mSp.putString(str, str2);
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putStringSet(java.lang.String str, java.util.Set<java.lang.String> set) {
        return this.mSp.putStringSet(str, set);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mSp.getClass();
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor remove(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.mSp;
        o4Var.remove(str);
        return o4Var;
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mSp.getClass();
    }
}
