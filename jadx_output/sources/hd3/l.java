package hd3;

/* loaded from: classes.dex */
public final class l extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "takeHeapSnapshot";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        boolean a17 = z65.c.a();
        lc3.z zVar = lc3.x.f317936c;
        if (!a17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiTakeHeapSnapshot", "no debug environment! please check");
            s().invoke(i(zVar));
            return;
        }
        lc3.h0 h0Var = (lc3.h0) this.f317890a;
        if (h0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiTakeHeapSnapshot", "context not server type. not valid");
            s().invoke(i(zVar));
            return;
        }
        java.lang.String optString = data.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        kotlin.jvm.internal.o.d(optString);
        boolean z17 = true;
        boolean z18 = optString.length() == 0;
        lc3.z zVar2 = lc3.x.f317937d;
        if (z18 || !r26.i0.y(optString, "wxfile://", false)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiTakeHeapSnapshot", "invalid path=" + optString + ", must start with wxfile://");
            s().invoke(i(zVar2));
            return;
        }
        com.tencent.mm.plugin.appbrand.appstorage.u1 wi6 = ((com.tencent.mm.plugin.magicbrush.y5) ((com.tencent.mm.plugin.magicbrush.q4) i95.n0.c(com.tencent.mm.plugin.magicbrush.q4.class))).wi(e().f344331a);
        if (wi6 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiTakeHeapSnapshot", "MagicBrushFS not found, instanceName=" + e().f344331a);
            s().invoke(i(zVar));
            return;
        }
        com.tencent.mm.vfs.r6 resolvePath = ((com.tencent.mm.plugin.magicbrush.fs.l) wi6).resolvePath(optString);
        java.lang.String o17 = resolvePath != null ? resolvePath.o() : null;
        if (o17 != null && o17.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiTakeHeapSnapshot", "resolve physical path failed, wxPath=" + optString + ". hint: use wxfile://usr/xxx for persistent file");
            s().invoke(i(zVar2));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MBJsApiTakeHeapSnapshot", "take heap snapshot, wxPath=" + optString + ", physicalPath=" + o17);
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(o17);
            if (!r6Var.m()) {
                com.tencent.mm.vfs.r6 s17 = r6Var.s();
                if (s17 != null && !s17.m()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MBJsApiTakeHeapSnapshot", "create parent dir for snapshot, path=" + s17.o() + ", ok=" + s17.J());
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MBJsApiTakeHeapSnapshot", "create snapshot file, path=" + o17 + ", ok=" + r6Var.k());
            }
            h0Var.E0("(function() {var profiler = NativeGlobal.Profiler;var snapshot = profiler.takeHeapSnapshot();return snapshot.serialize('" + o17 + "');})()", new hd3.k(o17, this, optString));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiTakeHeapSnapshot", "ensure snapshot file failed, path=" + o17 + ", err=" + th6.getMessage());
            s().invoke(i(zVar));
        }
    }
}
