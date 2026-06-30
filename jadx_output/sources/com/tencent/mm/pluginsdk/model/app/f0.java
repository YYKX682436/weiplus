package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public final class f0 implements lt.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f188887a = new java.util.concurrent.ConcurrentHashMap();

    public f0(com.tencent.mm.pluginsdk.model.app.e0 e0Var) {
    }

    public ot0.t a(long j17) {
        java.util.Iterator it = this.f188887a.keySet().iterator();
        while (it.hasNext()) {
            com.tencent.mm.pluginsdk.model.app.f0 f0Var = (com.tencent.mm.pluginsdk.model.app.f0) ((lt.j0) it.next());
            if (f0Var.d(j17)) {
                return f0Var.a(j17);
            }
        }
        for (fs.q qVar : ((fs.c) fs.g.f(lt.k0.class)).all()) {
            if (((c63.j) ((lt.k0) qVar.get())).b(j17)) {
                ((c63.j) ((lt.k0) qVar.get())).getClass();
                c63.i iVar = new c63.i();
                iVar.field_msgId = j17;
                if (!((t53.m0) i95.n0.c(t53.m0.class)).Ni().get(iVar, new java.lang.String[0])) {
                    com.tencent.mars.xlog.Log.i("GameLife.AppMessageInterceptor", "[get] msg:" + j17 + " not found!");
                    return null;
                }
                com.tencent.mars.xlog.Log.i("GameLife.AppMessageInterceptor", "[get] appId:" + iVar.field_appId + " title:" + iVar.field_title + " desc:" + iVar.field_description + " type:" + iVar.field_type + " msgId:" + iVar.field_msgId);
                ot0.t tVar = new ot0.t();
                tVar.field_appId = iVar.field_appId;
                tVar.field_description = iVar.field_description;
                tVar.field_msgId = iVar.field_msgId;
                tVar.field_source = iVar.field_source;
                tVar.field_title = iVar.field_title;
                tVar.field_type = iVar.field_type;
                tVar.field_xml = iVar.field_xml;
                return tVar;
            }
        }
        return null;
    }

    public boolean b(ot0.t tVar, boolean z17) {
        java.util.Iterator it = this.f188887a.keySet().iterator();
        while (it.hasNext()) {
            com.tencent.mm.pluginsdk.model.app.f0 f0Var = (com.tencent.mm.pluginsdk.model.app.f0) ((lt.j0) it.next());
            if (f0Var.d(tVar.field_msgId)) {
                return f0Var.b(tVar, z17);
            }
        }
        for (fs.q qVar : ((fs.c) fs.g.f(lt.k0.class)).all()) {
            if (((c63.j) ((lt.k0) qVar.get())).b(tVar.field_msgId)) {
                c63.j jVar = (c63.j) ((lt.k0) qVar.get());
                jVar.getClass();
                boolean insertNotify = ((t53.m0) i95.n0.c(t53.m0.class)).Ni().insertNotify(jVar.c(tVar), z17);
                com.tencent.mars.xlog.Log.i("GameLife.AppMessageInterceptor", "[insert ret:" + insertNotify + "] appid:" + tVar.field_appId + " title:" + tVar.field_title + " desc:" + tVar.field_description + " type:" + tVar.field_type + " msgId:" + tVar.field_msgId);
                return insertNotify;
            }
        }
        return false;
    }

    public boolean c(ot0.t tVar, boolean z17) {
        java.util.Iterator it = this.f188887a.keySet().iterator();
        while (it.hasNext()) {
            com.tencent.mm.pluginsdk.model.app.f0 f0Var = (com.tencent.mm.pluginsdk.model.app.f0) ((lt.j0) it.next());
            if (f0Var.d(tVar.field_msgId)) {
                return f0Var.c(tVar, z17);
            }
        }
        for (fs.q qVar : ((fs.c) fs.g.f(lt.k0.class)).all()) {
            if (((c63.j) ((lt.k0) qVar.get())).b(tVar.field_msgId)) {
                c63.j jVar = (c63.j) ((lt.k0) qVar.get());
                jVar.getClass();
                boolean replace = ((t53.m0) i95.n0.c(t53.m0.class)).Ni().replace(jVar.c(tVar), z17);
                com.tencent.mars.xlog.Log.i("GameLife.AppMessageInterceptor", "[replace ret:" + replace + "] appid:" + tVar.field_appId + " title:" + tVar.field_title + " desc:" + tVar.field_description + " type:" + tVar.field_type + " msgId:" + tVar.field_msgId);
                return replace;
            }
        }
        return false;
    }

    public boolean d(long j17) {
        java.util.Iterator it = this.f188887a.keySet().iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.pluginsdk.model.app.f0) ((lt.j0) it.next())).d(j17)) {
                return true;
            }
        }
        java.util.Iterator it6 = ((fs.c) fs.g.f(lt.k0.class)).all().iterator();
        while (it6.hasNext()) {
            if (((c63.j) ((lt.k0) ((fs.q) it6.next()).get())).b(j17)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(ot0.t tVar, boolean z17, java.lang.String... keys) {
        java.util.Iterator it = this.f188887a.keySet().iterator();
        while (it.hasNext()) {
            com.tencent.mm.pluginsdk.model.app.f0 f0Var = (com.tencent.mm.pluginsdk.model.app.f0) ((lt.j0) it.next());
            if (f0Var.d(tVar.field_msgId)) {
                return f0Var.e(tVar, z17, keys);
            }
        }
        for (fs.q qVar : ((fs.c) fs.g.f(lt.k0.class)).all()) {
            if (((c63.j) ((lt.k0) qVar.get())).b(tVar.field_msgId)) {
                c63.j jVar = (c63.j) ((lt.k0) qVar.get());
                jVar.getClass();
                kotlin.jvm.internal.o.g(keys, "keys");
                boolean updateNotify = ((t53.m0) i95.n0.c(t53.m0.class)).Ni().updateNotify(jVar.c(tVar), z17, (java.lang.String[]) java.util.Arrays.copyOf(keys, keys.length));
                com.tencent.mars.xlog.Log.i("GameLife.AppMessageInterceptor", "[update ret:" + updateNotify + "] appid:" + tVar.field_appId + " title:" + tVar.field_title + " desc:" + tVar.field_description + " type:" + tVar.field_type + " msgId:" + tVar.field_msgId);
                return updateNotify;
            }
        }
        return false;
    }
}
