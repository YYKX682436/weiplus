package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class o5 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Comparator f213109g = new com.tencent.mm.vfs.n5();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f213110a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f213111b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f213112c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.SortedMap f213113d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f213114e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.vfs.t5 f213115f;

    public o5() {
        this.f213110a = new java.util.LinkedHashMap();
        this.f213111b = new java.util.LinkedHashMap();
        this.f213112c = new java.util.LinkedHashMap();
        this.f213113d = new java.util.TreeMap(f213109g);
        this.f213114e = new java.util.LinkedHashMap();
        this.f213115f = null;
    }

    public static com.tencent.mm.vfs.o5 b(android.os.Bundle bundle) {
        com.tencent.mm.vfs.o5 o5Var = new com.tencent.mm.vfs.o5();
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("sl");
        android.os.Bundle bundle2 = bundle.getBundle("sm");
        if (parcelableArrayList != null && bundle2 != null) {
            for (java.lang.String str : bundle2.keySet()) {
                int i17 = bundle2.getInt(str);
                if (i17 >= 0 && i17 < parcelableArrayList.size()) {
                    o5Var.f213110a.put(str, new com.tencent.mm.vfs.t5((com.tencent.mm.vfs.SchemeResolver) parcelableArrayList.get(i17)));
                }
            }
        }
        android.os.Bundle bundle3 = bundle.getBundle("fs");
        if (bundle3 != null) {
            bundle3.setClassLoader(bundle.getClassLoader());
            for (java.lang.String str2 : bundle3.keySet()) {
                o5Var.f213111b.put(str2, new com.tencent.mm.vfs.t5((com.tencent.mm.vfs.FileSystem) bundle3.getParcelable(str2)));
            }
        }
        android.os.Bundle bundle4 = bundle.getBundle("mfs");
        if (bundle4 != null) {
            bundle4.setClassLoader(bundle.getClassLoader());
            for (java.lang.String str3 : bundle4.keySet()) {
                o5Var.f213112c.put(str3, new com.tencent.mm.vfs.t5((com.tencent.mm.vfs.FileSystem) bundle4.getParcelable(str3)));
            }
        }
        android.os.Bundle bundle5 = bundle.getBundle("mp");
        if (bundle5 != null) {
            bundle5.setClassLoader(bundle.getClassLoader());
            for (java.lang.String str4 : bundle5.keySet()) {
                ((java.util.TreeMap) o5Var.f213113d).put(new com.tencent.mm.vfs.f1(str4), bundle5.getString(str4));
            }
        }
        android.os.Bundle bundle6 = bundle.getBundle("env");
        java.util.Map map = o5Var.f213114e;
        if (bundle6 != null) {
            for (java.lang.String str5 : bundle6.keySet()) {
                java.lang.String[] stringArray = bundle6.getStringArray(str5);
                if (stringArray != null && stringArray.length != 0) {
                    if (stringArray.length == 1) {
                        map.put(str5, stringArray[0]);
                    } else {
                        map.put(str5, stringArray);
                    }
                }
            }
        }
        com.tencent.mm.vfs.FileSystem fileSystem = (com.tencent.mm.vfs.FileSystem) bundle.getParcelable("root");
        o5Var.f213115f = fileSystem == null ? null : new com.tencent.mm.vfs.t5(fileSystem);
        return o5Var;
    }

    public static void c(java.util.Map map, java.util.Map map2) {
        for (java.util.Map.Entry entry : map2.entrySet()) {
            if (entry.getValue() == null) {
                map.remove(entry.getKey());
            } else {
                map.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public static void e(android.util.Printer printer, java.util.Map map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
        for (java.util.Map.Entry entry : map.entrySet()) {
            sb6.setLength(0);
            sb6.append("  ");
            sb6.append(entry.getKey());
            sb6.append(" => ");
            java.lang.Object value = entry.getValue();
            if (value == null) {
                sb6.append("(deleted)\n");
            } else if (value.getClass().isArray()) {
                sb6.append(java.util.Arrays.toString((java.lang.Object[]) value));
            } else {
                sb6.append(entry.getValue());
            }
            printer.println(sb6.toString());
        }
    }

    public static void g(java.util.Map map) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            entry.setValue(new com.tencent.mm.vfs.t5((com.tencent.mm.vfs.t5) entry.getValue()));
        }
    }

    public com.tencent.mm.vfs.o5 a(com.tencent.mm.vfs.o5 o5Var) {
        c(this.f213110a, o5Var.f213110a);
        c(this.f213111b, o5Var.f213111b);
        c(this.f213112c, o5Var.f213112c);
        c(this.f213113d, o5Var.f213113d);
        c(this.f213114e, o5Var.f213114e);
        com.tencent.mm.vfs.t5 t5Var = o5Var.f213115f;
        if (t5Var != null) {
            this.f213115f = t5Var;
        }
        return this;
    }

    public void d(android.util.Printer printer) {
        java.util.Map map = this.f213110a;
        if (!map.isEmpty()) {
            printer.println("[Scheme]");
            e(printer, map);
        }
        java.util.Map map2 = this.f213111b;
        if (!map2.isEmpty()) {
            printer.println("[FileSystems]");
            e(printer, map2);
        }
        java.util.Map map3 = this.f213112c;
        if (!map3.isEmpty()) {
            printer.println("[Maintenance-only]");
            e(printer, map3);
        }
        java.util.SortedMap sortedMap = this.f213113d;
        if (!sortedMap.isEmpty()) {
            printer.println("[Mount points]");
            e(printer, sortedMap);
        }
        java.util.Map map4 = this.f213114e;
        if (!map4.isEmpty()) {
            printer.println("[Environment]");
            e(printer, map4);
        }
        if (this.f213115f != null) {
            printer.println("[Root] " + this.f213115f);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.vfs.o5)) {
            return false;
        }
        com.tencent.mm.vfs.o5 o5Var = (com.tencent.mm.vfs.o5) obj;
        return this.f213110a.equals(o5Var.f213110a) && this.f213111b.equals(o5Var.f213111b) && this.f213112c.equals(o5Var.f213112c) && this.f213113d.equals(o5Var.f213113d) && this.f213114e.equals(o5Var.f213114e) && com.tencent.mm.vfs.e8.f(this.f213115f, o5Var.f213115f);
    }

    public com.tencent.mm.vfs.o5 f() {
        com.tencent.mm.vfs.o5 o5Var = new com.tencent.mm.vfs.o5(this);
        g(o5Var.f213110a);
        g(o5Var.f213111b);
        g(o5Var.f213112c);
        return o5Var;
    }

    public android.os.Bundle h() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map map = this.f213110a;
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(map.size());
        android.os.Bundle bundle2 = new android.os.Bundle();
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
            com.tencent.mm.vfs.SchemeResolver schemeResolver = (com.tencent.mm.vfs.SchemeResolver) ((com.tencent.mm.vfs.t5) entry.getValue()).f213187a;
            java.lang.Integer num = (java.lang.Integer) hashMap.get(schemeResolver);
            if (num == null) {
                num = java.lang.Integer.valueOf(arrayList.size());
                arrayList.add(schemeResolver);
                hashMap.put(schemeResolver, num);
            }
            bundle2.putInt((java.lang.String) entry.getKey(), num.intValue());
        }
        bundle.putParcelableArrayList("sl", arrayList);
        bundle.putBundle("sm", bundle2);
        android.os.Bundle bundle3 = new android.os.Bundle();
        for (java.util.Map.Entry entry2 : ((java.util.LinkedHashMap) this.f213111b).entrySet()) {
            bundle3.putParcelable((java.lang.String) entry2.getKey(), (android.os.Parcelable) ((com.tencent.mm.vfs.t5) entry2.getValue()).f213187a);
        }
        bundle.putBundle("fs", bundle3);
        android.os.Bundle bundle4 = new android.os.Bundle();
        for (java.util.Map.Entry entry3 : ((java.util.LinkedHashMap) this.f213112c).entrySet()) {
            bundle4.putParcelable((java.lang.String) entry3.getKey(), (android.os.Parcelable) ((com.tencent.mm.vfs.t5) entry3.getValue()).f213187a);
        }
        bundle.putBundle("mfs", bundle4);
        android.os.Bundle bundle5 = new android.os.Bundle();
        for (java.util.Map.Entry entry4 : ((java.util.TreeMap) this.f213113d).entrySet()) {
            bundle5.putString(((com.tencent.mm.vfs.f1) entry4.getKey()).f212921a, (java.lang.String) entry4.getValue());
        }
        bundle.putBundle("mp", bundle5);
        android.os.Bundle bundle6 = new android.os.Bundle();
        for (java.util.Map.Entry entry5 : ((java.util.LinkedHashMap) this.f213114e).entrySet()) {
            java.lang.Object value = entry5.getValue();
            if (value instanceof java.lang.String) {
                bundle6.putStringArray((java.lang.String) entry5.getKey(), new java.lang.String[]{(java.lang.String) value});
            } else if (value instanceof java.lang.String[]) {
                bundle6.putStringArray((java.lang.String) entry5.getKey(), (java.lang.String[]) value);
            }
        }
        bundle.putBundle("env", bundle6);
        com.tencent.mm.vfs.t5 t5Var = this.f213115f;
        bundle.putParcelable("root", t5Var == null ? null : (android.os.Parcelable) t5Var.f213187a);
        return bundle;
    }

    public int hashCode() {
        java.lang.Object[] objArr = {this.f213110a, this.f213111b, this.f213112c, this.f213113d, this.f213114e, this.f213115f};
        java.util.regex.Pattern pattern = com.tencent.mm.vfs.e8.f212917a;
        return java.util.Arrays.deepHashCode(objArr);
    }

    public o5(com.tencent.mm.vfs.o5 o5Var) {
        this.f213110a = new java.util.LinkedHashMap(o5Var.f213110a);
        this.f213111b = new java.util.LinkedHashMap(o5Var.f213111b);
        this.f213112c = new java.util.LinkedHashMap(o5Var.f213112c);
        this.f213113d = new java.util.TreeMap(o5Var.f213113d);
        this.f213114e = new java.util.LinkedHashMap(o5Var.f213114e);
        this.f213115f = o5Var.f213115f;
    }
}
