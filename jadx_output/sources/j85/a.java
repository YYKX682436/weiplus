package j85;

/* loaded from: classes15.dex */
public final class a implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public static final j85.a f298240d = new j85.a();

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = j85.g.f298253c;
        if (copyOnWriteArrayList.size() > 100) {
            java.util.ArrayList arrayList = j85.g.f298255e;
            arrayList.add(java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis()));
            if (arrayList.size() == 5) {
                if (((java.lang.Number) kz5.n0.i0(arrayList)).longValue() - ((java.lang.Number) kz5.n0.X(arrayList)).longValue() < j85.g.f298256f) {
                    com.tencent.mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct systemServiceHookStatusStruct = new com.tencent.mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct();
                    systemServiceHookStatusStruct.f61028d = 0;
                    systemServiceHookStatusStruct.f61035k = systemServiceHookStatusStruct.b("ProcessName", bm5.f1.a(), true);
                    systemServiceHookStatusStruct.f61036l = systemServiceHookStatusStruct.b("ErrStack", "too freq!; report 5 times in 2 seconds", true);
                    systemServiceHookStatusStruct.f61031g = systemServiceHookStatusStruct.b("CurrentActivity", com.tencent.mm.app.w.INSTANCE.h(), true);
                    systemServiceHookStatusStruct.k();
                    com.tencent.mars.xlog.Log.i(j85.g.f298252b, "reportTooFrequency");
                }
                arrayList.clear();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.addAll(copyOnWriteArrayList);
            copyOnWriteArrayList.clear();
            java.util.Iterator it = arrayList2.iterator();
            kotlin.jvm.internal.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.internal.o.f(next, "next(...)");
                com.tencent.mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct systemServiceHookStatusStruct2 = (com.tencent.mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct) next;
                int i17 = systemServiceHookStatusStruct2.f61028d;
                java.lang.String a17 = i17 == 0 ? com.tencent.mm.sdk.platformtools.w2.a(systemServiceHookStatusStruct2.f61036l) : i17 == 1 ? com.tencent.mm.sdk.platformtools.w2.a(systemServiceHookStatusStruct2.f61032h) : null;
                if (a17 != null) {
                    java.util.HashMap hashMap = j85.g.f298254d;
                    com.tencent.mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct systemServiceHookStatusStruct3 = (com.tencent.mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct) hashMap.get(a17);
                    if (systemServiceHookStatusStruct3 == null) {
                        hashMap.put(a17, systemServiceHookStatusStruct2);
                    } else {
                        systemServiceHookStatusStruct3.f61034j = systemServiceHookStatusStruct3.b("MethodOffsetTime", systemServiceHookStatusStruct3.f61034j + ';' + systemServiceHookStatusStruct2.f61034j, true);
                        it.remove();
                    }
                }
            }
            j85.g.f298254d.clear();
            com.tencent.mars.xlog.Log.i(j85.g.f298252b, "report，size = " + arrayList2.size());
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                ((com.tencent.mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct) it6.next()).k();
            }
            arrayList2.clear();
        }
        return false;
    }
}
