package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f139865a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f139866b;

    static {
        new java.util.HashMap();
        f139866b = new java.util.LinkedList();
    }

    public static void a(java.lang.String str, com.tencent.mm.plugin.game.luggage.m1 m1Var) {
        if (h()) {
            if (m1Var != null) {
                m1Var.a(c(str) != null, d(str));
            }
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("action_id", 3);
            bundle.putString("preload_url", str);
            com.tencent.mm.plugin.game.luggage.p.a(bundle, com.tencent.mm.plugin.game.luggage.o1.class, new com.tencent.mm.plugin.game.luggage.l1(m1Var));
        }
    }

    public static void b() {
        if (!h()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("action_id", 2);
            com.tencent.mm.plugin.game.luggage.p.a(bundle, com.tencent.mm.plugin.game.luggage.o1.class, null);
            return;
        }
        java.util.HashMap hashMap = f139865a;
        for (sd.o0 o0Var : hashMap.values()) {
            o0Var.k();
            pf.b bVar = o0Var.f406633i;
            if (bVar != null) {
                bVar.destroy();
            }
        }
        hashMap.clear();
    }

    public static sd.o0 c(java.lang.String str) {
        return (sd.o0) f139865a.get(str);
    }

    public static boolean d(java.lang.String str) {
        sd.o0 o0Var = (sd.o0) f139865a.get(str);
        if (o0Var != null && o0Var.h() != null) {
            com.tencent.mm.plugin.game.luggage.page.b0 b0Var = (com.tencent.mm.plugin.game.luggage.page.b0) o0Var.h();
            if (b0Var.V && !b0Var.f139873p1) {
                return true;
            }
        }
        return false;
    }

    public static void e(java.lang.Class cls, java.lang.String str, k60.e eVar) {
        if (!h()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("action_id", 1);
            bundle.putString("preload_url", str);
            bundle.putSerializable("webcore_impl_class", cls);
            com.tencent.mm.plugin.game.luggage.p.a(bundle, com.tencent.mm.plugin.game.luggage.o1.class, new com.tencent.mm.plugin.game.luggage.j1(eVar));
            return;
        }
        if (f139865a.containsKey(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PreloadGameWebCoreHelp", "preload page[%s] exists, return", str);
            eVar.a();
            return;
        }
        java.util.LinkedList linkedList = f139866b;
        if (linkedList.contains(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PreloadGameWebCoreHelp", "preload ing, return");
            eVar.a();
        } else {
            linkedList.add(str);
            com.tencent.mm.ipcinvoker.w0.c(true, new com.tencent.mm.plugin.game.luggage.k1(cls, str, eVar));
        }
    }

    public static void f(java.lang.String str) {
        if (!h()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("action_id", 2);
            bundle.putString("preload_url", str);
            com.tencent.mm.plugin.game.luggage.p.a(bundle, com.tencent.mm.plugin.game.luggage.o1.class, null);
            return;
        }
        sd.o0 o0Var = (sd.o0) f139865a.remove(str);
        if (o0Var != null) {
            o0Var.k();
            pf.b bVar = o0Var.f406633i;
            if (bVar != null) {
                bVar.destroy();
            }
        }
    }

    public static sd.o0 g(android.content.Context context, java.lang.String str) {
        sd.o0 o0Var = (sd.o0) f139865a.remove(str);
        if (o0Var != null) {
            o0Var.l(context);
            o0Var.k();
        }
        return o0Var;
    }

    public static boolean h() {
        return com.tencent.mm.pluginsdk.model.g4.a() || com.tencent.mm.sdk.platformtools.x2.s();
    }
}
