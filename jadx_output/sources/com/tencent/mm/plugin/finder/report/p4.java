package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class p4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.p4 f125250a = new com.tencent.mm.plugin.finder.report.p4();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f125251b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static final android.util.LruCache f125252c = new android.util.LruCache(10);

    /* renamed from: d, reason: collision with root package name */
    public static volatile org.json.JSONObject f125253d;

    public final void a(java.lang.String str, org.json.JSONObject jSONObject) {
        java.util.Objects.toString(f125253d);
        f125253d = null;
        java.util.LinkedList linkedList = f125251b;
        boolean contains = linkedList.contains(str);
        android.util.LruCache lruCache = f125252c;
        if (!contains) {
            linkedList.push(str);
            lruCache.put(str, jSONObject);
            java.util.Objects.toString(linkedList);
            java.util.Objects.toString(lruCache);
            return;
        }
        lruCache.put(str, jSONObject);
        while (!kotlin.jvm.internal.o.b(linkedList.peek(), str)) {
            java.lang.Object peek = linkedList.peek();
            kotlin.jvm.internal.o.f(peek, "peek(...)");
            java.lang.String str2 = (java.lang.String) peek;
            synchronized (this) {
                java.util.Objects.toString(f125253d);
                f125253d = null;
                java.util.LinkedList linkedList2 = f125251b;
                linkedList2.remove(str2);
                android.util.LruCache lruCache2 = f125252c;
                lruCache2.remove(str2);
                java.util.Objects.toString(linkedList2);
                java.util.Objects.toString(lruCache2);
            }
        }
        java.util.Objects.toString(linkedList);
        java.util.Objects.toString(lruCache);
    }

    public final void b(androidx.appcompat.app.AppCompatActivity activity, org.json.JSONObject obj) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(obj, "obj");
        synchronized (this) {
            final java.lang.String simpleName = activity.getClass().getSimpleName();
            f125250a.a(simpleName, obj);
            activity.mo133getLifecycle().a(new androidx.lifecycle.v() { // from class: com.tencent.mm.plugin.finder.report.FinderStackObjectReporter$initActivity$1$1
                @Override // androidx.lifecycle.v
                public final void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m event) {
                    kotlin.jvm.internal.o.g(yVar, "<anonymous parameter 0>");
                    kotlin.jvm.internal.o.g(event, "event");
                    if (event == androidx.lifecycle.m.ON_DESTROY) {
                        com.tencent.mm.plugin.finder.report.p4 p4Var = com.tencent.mm.plugin.finder.report.p4.f125250a;
                        java.lang.String name = simpleName;
                        kotlin.jvm.internal.o.f(name, "$name");
                        synchronized (p4Var) {
                            java.util.Objects.toString(com.tencent.mm.plugin.finder.report.p4.f125253d);
                            com.tencent.mm.plugin.finder.report.p4.f125253d = null;
                            java.util.LinkedList linkedList = com.tencent.mm.plugin.finder.report.p4.f125251b;
                            linkedList.remove(name);
                            android.util.LruCache lruCache = com.tencent.mm.plugin.finder.report.p4.f125252c;
                            lruCache.remove(name);
                            java.util.Objects.toString(linkedList);
                            java.util.Objects.toString(lruCache);
                        }
                    }
                }
            });
        }
    }
}
