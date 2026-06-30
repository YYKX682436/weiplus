package com.tencent.mm.ui;

/* loaded from: classes13.dex */
public class ak {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f197139a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f197140b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f197141c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.reflect.Field f197142d;

    public ak(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("obj cannot be null");
        }
        this.f197139a = obj;
        this.f197140b = str;
    }

    public java.lang.Object a() {
        b();
        java.lang.reflect.Field field = this.f197142d;
        if (field == null) {
            throw new java.lang.NoSuchFieldException();
        }
        try {
            return field.get(this.f197139a);
        } catch (java.lang.ClassCastException unused) {
            throw new java.lang.IllegalArgumentException("unable to cast object");
        }
    }

    public final void b() {
        if (this.f197141c) {
            return;
        }
        this.f197141c = true;
        java.lang.Class<?> cls = this.f197139a.getClass();
        while (cls != null) {
            try {
                java.lang.reflect.Field declaredField = cls.getDeclaredField(this.f197140b);
                declaredField.setAccessible(true);
                this.f197142d = declaredField;
                return;
            } catch (java.lang.Exception unused) {
            } finally {
                cls.getSuperclass();
            }
        }
    }
}
