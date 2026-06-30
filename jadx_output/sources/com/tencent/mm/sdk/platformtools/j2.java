package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class j2 {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f192754b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Class f192755c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Field f192756d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Throwable f192757e;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f192753a = new java.lang.ref.WeakReference(new java.lang.Object());

    /* renamed from: f, reason: collision with root package name */
    public int f192758f = 0;

    public j2(android.app.Activity activity, java.lang.reflect.Field field, java.lang.Throwable th6) {
        this.f192754b = new java.lang.ref.WeakReference(activity);
        this.f192755c = activity.getClass();
        this.f192756d = field;
        this.f192757e = th6;
    }

    public java.lang.String a() {
        java.lang.Object obj = this.f192754b.get();
        java.lang.reflect.Field field = this.f192756d;
        java.lang.Class cls = this.f192755c;
        if (obj == null) {
            if (field == null) {
                return "ui of class [" + cls.getName() + "] which is subclass of\n listener or callback and held by other 'Manager' class is recycled";
            }
            return "ui of class [" + cls.getName() + "] held by\n [" + b() + "] is recycled";
        }
        if (field == null) {
            return "ui of class [" + cls.getName() + "] which is subclass of\n listener or callback and held by other 'Manager' class is leaked.\n Perhaps you should remove any instance of this class from any 'Manager'";
        }
        return "ui of class [" + cls.getName() + "] held by\n [" + b() + "] is leaked.\n Perhaps you should remove the holder from any 'Manager' class when the leaked ui was destroyed.";
    }

    public final java.lang.String b() {
        java.lang.reflect.Field field = this.f192756d;
        if (field == null) {
            return "#null#";
        }
        java.lang.Class<?> declaringClass = field.getDeclaringClass();
        if (!declaringClass.isAnonymousClass()) {
            return "field " + field.getName() + " defined in " + declaringClass.getName();
        }
        java.lang.Object genericSuperclass = declaringClass.getGenericSuperclass();
        java.lang.Object obj = declaringClass;
        if (java.lang.Object.class.equals(genericSuperclass)) {
            obj = declaringClass.getGenericInterfaces()[0];
        } else if (genericSuperclass != null) {
            obj = genericSuperclass;
        }
        return "field " + field.getName() + " define in anonymous class of " + obj.toString().replace('<', '#').replace('>', '#');
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.tencent.mm.sdk.platformtools.j2)) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.j2 j2Var = (com.tencent.mm.sdk.platformtools.j2) obj;
        java.lang.Object obj2 = this.f192754b.get();
        java.lang.Object obj3 = j2Var.f192754b.get();
        if (!((obj2 == null && obj3 == null) ? true : (obj2 == null || obj3 == null) ? false : obj2.equals(obj3))) {
            return false;
        }
        java.lang.reflect.Field field = this.f192756d;
        java.lang.reflect.Field field2 = j2Var.f192756d;
        if (!((field == null && field2 == null) ? true : (field == null || field2 == null) ? false : field.equals(field2))) {
            return false;
        }
        java.lang.Throwable th6 = this.f192757e;
        java.lang.Throwable th7 = j2Var.f192757e;
        if (th6 == null && th7 == null) {
            return true;
        }
        if (th6 == null || th7 == null) {
            return false;
        }
        return th6.equals(th7);
    }

    public int hashCode() {
        java.lang.Object obj = this.f192754b.get();
        int hashCode = obj != null ? obj.hashCode() : 0;
        java.lang.reflect.Field field = this.f192756d;
        int hashCode2 = field != null ? field.hashCode() : 0;
        java.lang.Throwable th6 = this.f192757e;
        return hashCode + hashCode2 + (th6 != null ? th6.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.io.PrintWriter printWriter;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(b());
        sb6.append("@");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            printWriter = new java.io.PrintWriter(stringWriter);
            try {
                this.f192757e.printStackTrace(printWriter);
                com.tencent.mm.sdk.platformtools.t8.v1(printWriter);
                sb6.append(stringWriter.toString().replace('\n', '|'));
                return sb6.toString();
            } catch (java.lang.Throwable th6) {
                th = th6;
                com.tencent.mm.sdk.platformtools.t8.v1(printWriter);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            printWriter = null;
        }
    }
}
