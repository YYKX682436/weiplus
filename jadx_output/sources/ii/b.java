package ii;

/* loaded from: classes12.dex */
public final class b extends qi.b {

    /* renamed from: h, reason: collision with root package name */
    public final ii.a f291607h;

    public b(ii.a memoryCanaryConfig) {
        kotlin.jvm.internal.o.g(memoryCanaryConfig, "memoryCanaryConfig");
        this.f291607h = memoryCanaryConfig;
    }

    @Override // qi.b
    public java.lang.String b() {
        return "Matrix.MemoryCanaryPlugin";
    }

    @Override // qi.b
    public void e() {
        boolean z17;
        boolean z18;
        if (this.f363455g == 2) {
            oj.j.b("Matrix.MemoryCanaryPlugin", "already started", new java.lang.Object[0]);
            return;
        }
        super.e();
        try {
            z17 = com.tencent.matrix.lifecycle.supervisor.d0.f52834k.d();
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.MemoryCanaryPlugin", th6, "", new java.lang.Object[0]);
            z17 = false;
        }
        ii.a aVar = this.f291607h;
        if (z17) {
            oj.j.a("Matrix.MemoryCanaryPlugin", "supervisor is " + oj.m.b(this.f363453e), new java.lang.Object[0]);
            ji.h[] configs = aVar.f291604a;
            kotlin.jvm.internal.o.g(configs, "configs");
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (ji.h hVar : configs) {
                java.lang.Long valueOf = java.lang.Long.valueOf(hVar.f299885e);
                java.lang.Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new java.util.ArrayList();
                    linkedHashMap.put(valueOf, obj);
                }
                ((java.util.List) obj).add(hVar);
            }
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                for (java.lang.Object obj2 : iterable) {
                    com.tencent.matrix.lifecycle.IBackgroundStatefulOwner iBackgroundStatefulOwner = ((ji.h) obj2).f299884d;
                    java.lang.Object obj3 = linkedHashMap2.get(iBackgroundStatefulOwner);
                    if (obj3 == null) {
                        obj3 = new java.util.ArrayList();
                        linkedHashMap2.put(iBackgroundStatefulOwner, obj3);
                    }
                    ((java.util.List) obj3).add(obj2);
                }
                for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    long longValue = ((java.lang.Number) entry.getKey()).longValue();
                    com.tencent.matrix.lifecycle.IBackgroundStatefulOwner iBackgroundStatefulOwner2 = (com.tencent.matrix.lifecycle.IBackgroundStatefulOwner) entry2.getKey();
                    java.lang.Object[] array = ((java.util.Collection) entry2.getValue()).toArray(new ji.h[0]);
                    if (array == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    ji.e eVar = new ji.e(longValue, iBackgroundStatefulOwner2, (ji.h[]) array);
                    ji.h[] hVarArr = eVar.f299878e;
                    java.lang.String arrays = java.util.Arrays.toString(hVarArr);
                    kotlin.jvm.internal.o.f(arrays, "java.util.Arrays.toString(this)");
                    oj.j.c("Matrix.monitor.AppBgSumPssMonitor", arrays, new java.lang.Object[0]);
                    int length = hVarArr.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length) {
                            z18 = true;
                            break;
                        } else {
                            if (hVarArr[i17].f299883c) {
                                z18 = false;
                                break;
                            }
                            i17++;
                        }
                    }
                    if (z18) {
                        oj.j.c("Matrix.monitor.AppBgSumPssMonitor", "none enabled", new java.lang.Object[0]);
                    } else {
                        eVar.f299877d.addLifecycleCallback(new ji.d(eVar));
                    }
                }
            }
        }
        for (ji.p pVar : aVar.f291605b) {
            ji.o oVar = new ji.o(pVar);
            ji.p pVar2 = oVar.f299896c;
            oj.j.c("Matrix.monitor.BackgroundMemoryMonitor", java.lang.String.valueOf(pVar2), new java.lang.Object[0]);
            if (pVar2.f299901e) {
                pVar2.f299902f.observeForever(new ji.n(oVar));
            }
        }
        java.util.ArrayList arrayList = ki.i.f308099a;
        ki.b config = aVar.f291606c;
        kotlin.jvm.internal.o.g(config, "config");
        if (config.f308084a) {
            if (config.f308085b.isEmpty()) {
                throw new java.lang.IllegalArgumentException("config.delayMillis is empty");
            }
            if (!ih.d.c()) {
                oj.j.b("Matrix.TrimMemoryNotifier", "Matrix NOT installed yet", new java.lang.Object[0]);
                return;
            }
            ih.d d17 = ih.d.d();
            kotlin.jvm.internal.o.f(d17, "Matrix.with()");
            d17.f291471b.registerComponentCallbacks(new ki.h());
            com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner processStagedBackgroundOwner = com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner.INSTANCE;
            java.util.ArrayList arrayList2 = ki.i.f308099a;
            ki.d dVar = new ki.d("ProcessStagedBg", processStagedBackgroundOwner, arrayList2, config, false);
            dVar.f308090g.addLifecycleCallback(new ki.c(dVar));
            ki.d dVar2 = new ki.d("ProcessDeepBg", com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner.INSTANCE, arrayList2, config, true);
            dVar2.f308090g.addLifecycleCallback(new ki.c(dVar2));
            com.tencent.matrix.lifecycle.supervisor.AppStagedBackgroundOwner appStagedBackgroundOwner = com.tencent.matrix.lifecycle.supervisor.AppStagedBackgroundOwner.INSTANCE;
            java.util.ArrayList arrayList3 = ki.i.f308100b;
            ki.d dVar3 = new ki.d("AppStagedBg", appStagedBackgroundOwner, arrayList3, config, false);
            dVar3.f308090g.addLifecycleCallback(new ki.c(dVar3));
            ki.d dVar4 = new ki.d("AppDeepBg", com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE, arrayList3, config, true);
            dVar4.f308090g.addLifecycleCallback(new ki.c(dVar4));
        }
    }
}
