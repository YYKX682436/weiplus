package hr4;

/* loaded from: classes11.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final hr4.p f284263a = new hr4.p();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f284264b = jz5.h.b(hr4.m.f284261d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f284265c = jz5.h.b(hr4.l.f284260d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f284266d = jz5.h.b(hr4.k.f284259d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f284267e = jz5.h.b(hr4.o.f284262d);

    public final void a(java.lang.String str, hr4.q getContactCallback) {
        kotlin.jvm.internal.o.g(getContactCallback, "getContactCallback");
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            hr4.q.c(getContactCallback, false, null, 2, null);
            return;
        }
        kr4.e b17 = b(str);
        if (b17 != null) {
            getContactCallback.a(true, b17);
            return;
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            hr4.q.c(getContactCallback, false, null, 2, null);
            return;
        }
        c().putIfAbsent(str, getContactCallback);
        if (((hr4.s) ((jz5.n) f284264b).getValue()).a(str, java.lang.Boolean.TRUE)) {
            return;
        }
        c().remove(str);
        hr4.q.c(getContactCallback, false, null, 2, null);
    }

    public final kr4.e b(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        jz5.g gVar = f284266d;
        if (((java.util.concurrent.ConcurrentHashMap) ((jz5.n) gVar).getValue()).get(str) != null) {
            return (kr4.e) ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) gVar).getValue()).get(str);
        }
        kr4.e y07 = ((fr4.g0) i95.n0.c(fr4.g0.class)).Ai().y0(str);
        if (y07 == null) {
            return null;
        }
        f284263a.d(y07);
        return y07;
    }

    public final java.util.concurrent.ConcurrentHashMap c() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) f284265c).getValue();
    }

    public final void d(kr4.e eVar) {
        java.lang.String str = eVar.field_username;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) ((jz5.n) f284266d).getValue();
        kotlin.jvm.internal.o.d(str);
        concurrentHashMap.put(str, eVar);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k0(str);
    }
}
