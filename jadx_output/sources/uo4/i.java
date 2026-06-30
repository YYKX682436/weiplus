package uo4;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct f429709a = new com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct();

    /* renamed from: b, reason: collision with root package name */
    public uo4.h f429710b = new uo4.h();

    public final void a() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        android.os.Debug.MemoryInfo[] processMemoryInfo = ((android.app.ActivityManager) systemService).getProcessMemoryInfo(new int[]{android.os.Process.myPid()});
        if ((processMemoryInfo != null ? processMemoryInfo.length : 0) >= 1) {
            this.f429710b.f429707c.f429681a = processMemoryInfo[0].getTotalPss();
        }
        java.util.Map snapshot = rm5.h.f397490i.snapshot();
        this.f429710b.f429707c.f429682b = snapshot.size();
        uo4.d dVar = this.f429710b.f429707c;
        java.util.Iterator it = snapshot.values().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((android.graphics.Bitmap) it.next()).getAllocationByteCount();
        }
        dVar.f429683c = i17;
        java.lang.String jSONObject = this.f429710b.b().toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject, ",", ";", false);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct = this.f429709a;
        multiMediaEditResultStruct.f59324e = multiMediaEditResultStruct.b("JsonInfo", t17, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiMediaEditReport", "report: " + this.f429709a.n());
        this.f429709a.k();
        this.f429709a = new com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct();
        this.f429710b = new uo4.h();
    }

    public final void b(com.tencent.mm.plugin.vlog.model.h1 composition) {
        kotlin.jvm.internal.o.g(composition, "composition");
        this.f429710b.f429705a.clear();
        java.util.Iterator it = composition.f175597c.iterator();
        long j17 = 0;
        long j18 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            uo4.f a17 = xo4.d.f455770a.a((com.tencent.mm.plugin.vlog.model.i1) it.next());
            uo4.g gVar = a17 instanceof uo4.g ? (uo4.g) a17 : null;
            if (gVar != null) {
                gVar.f429701r = composition.e().f397586n != null;
            }
            if (a17 != null) {
                if (a17 instanceof uo4.e) {
                    j18++;
                } else {
                    j17++;
                }
                this.f429710b.f429705a.add(a17);
            }
        }
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct = this.f429709a;
        multiMediaEditResultStruct.f59337r = 1;
        multiMediaEditResultStruct.f59325f = j17;
        multiMediaEditResultStruct.f59326g = j18;
        multiMediaEditResultStruct.f59332m = composition.f175603i ? 1L : 0L;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiMediaEditReport", "setComposition, isEnableVideoEnhancement:" + composition.f175603i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [uo4.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [uo4.c] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, uo4.b] */
    /* JADX WARN: Type inference failed for: r2v4, types: [uo4.c] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.String] */
    public final void c(java.util.List itemList) {
        ?? bVar;
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(itemList, "itemList");
        this.f429710b.f429706b.clear();
        java.util.Iterator it = itemList.iterator();
        while (it.hasNext()) {
            zu3.a aVar = (zu3.a) it.next();
            zu3.e eVar = aVar.f475758a;
            java.lang.String str3 = "";
            if (eVar == zu3.e.f475796e) {
                bVar = new uo4.c();
                zu3.a0 a0Var = aVar instanceof zu3.a0 ? (zu3.a0) aVar : null;
                if (a0Var != null && (str2 = a0Var.f475768k) != null) {
                    str3 = str2;
                }
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str3);
                ?? r76 = a17.f213279f;
                if (r76 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(r76, false, false);
                    if (!r76.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                java.lang.String str4 = a17.f213279f;
                int lastIndexOf = str4.lastIndexOf("/");
                if (lastIndexOf >= 0) {
                    str4 = str4.substring(lastIndexOf + 1);
                }
                kotlin.jvm.internal.o.f(str4, "getName(...)");
                bVar.f429680c = str4;
            } else if (eVar == zu3.e.f475801m) {
                bVar = new uo4.c();
                zu3.d dVar = aVar instanceof zu3.d ? (zu3.d) aVar : null;
                if (dVar != null && (str = dVar.f475795j) != null) {
                    str3 = str;
                }
                com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str3);
                ?? r77 = a18.f213279f;
                if (r77 != null) {
                    java.lang.String l18 = com.tencent.mm.vfs.e8.l(r77, false, false);
                    if (!r77.equals(l18)) {
                        a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                    }
                }
                java.lang.String str5 = a18.f213279f;
                int lastIndexOf2 = str5.lastIndexOf("/");
                if (lastIndexOf2 >= 0) {
                    str5 = str5.substring(lastIndexOf2 + 1);
                }
                kotlin.jvm.internal.o.f(str5, "getName(...)");
                bVar.f429680c = str5;
            } else {
                bVar = new uo4.b();
            }
            bVar.f429678a = aVar.f475758a.f475805d;
            java.util.ArrayList arrayList = bVar.f429679b;
            bv3.d dVar2 = aVar.f475760c;
            arrayList.add(java.lang.Long.valueOf(dVar2.c()));
            arrayList.add(java.lang.Long.valueOf(dVar2.b()));
            this.f429710b.f429706b.add(bVar);
        }
        this.f429709a.f59327h = itemList.size();
    }
}
