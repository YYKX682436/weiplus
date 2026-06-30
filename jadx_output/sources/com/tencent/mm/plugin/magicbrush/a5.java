package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes7.dex */
public final class a5 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f147837b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f147838c = false;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f147839d = "";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f147843h;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.magicbrush.a5 f147836a = new com.tencent.mm.plugin.magicbrush.a5();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f147840e = new java.util.LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f147841f = "";

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f147842g = new java.util.LinkedHashSet();

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f147844i = "";

    public final java.lang.String a(java.util.Set set) {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(set, 10));
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.String instanceName = (java.lang.String) it.next();
            kotlin.jvm.internal.o.g(instanceName, "instanceName");
            java.lang.String lowerCase = r26.n0.s0(instanceName, "-", instanceName).toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        return kz5.n0.Q(arrayList).toString();
    }

    public final java.lang.String b() {
        java.lang.String str = f147839d;
        return str.length() == 0 ? f147841f : str;
    }
}
