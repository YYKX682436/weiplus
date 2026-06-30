package ph5;

/* loaded from: classes12.dex */
public class b implements com.tencent.mm.ipcinvoker.j {
    public static void a(int i17, java.util.List list) {
        if (i17 == android.os.Process.myPid()) {
            b(list);
            c("Dump Thread, pid = " + i17 + ", tid = " + list.toString(), 1);
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) sh.c.n(com.tencent.mm.sdk.platformtools.x2.f193071a)).iterator();
        while (it.hasNext()) {
            m3.d dVar = (m3.d) it.next();
            if (((java.lang.Integer) dVar.f323092a).intValue() == i17) {
                java.lang.String str = (java.lang.String) dVar.f323093b;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                for (java.lang.Object obj : list) {
                    if (sb6.length() != 0) {
                        obj = "," + obj;
                    }
                    sb6.append(obj);
                }
                java.lang.String sb7 = sb6.toString();
                com.tencent.mars.xlog.Log.i("MicroMsg.TopThreadDumpTask", "Dump remote process, name = " + str + ", pid = " + i17 + ", tids = " + sb7);
                com.tencent.mm.ipcinvoker.d0.d(str, new com.tencent.mm.ipcinvoker.type.IPCString(sb7), ph5.b.class, new ph5.b$$b());
                return;
            }
        }
    }

    public static void b(java.util.List list) {
        com.tencent.matrix.batterycanary.stats.k kVar;
        ph.u e17 = gi.d.e();
        wh.s cVar = e17 != null ? e17.f354296h.f363335d.A : new gi.c();
        int myPid = android.os.Process.myPid();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            arrayList.add(new m3.d(num, wh.u1.e(myPid, num.intValue())));
        }
        qh.u uVar = new qh.u();
        uVar.i();
        uVar.a("| TOP_THREAD_DUMP\n");
        uVar.b("Proc");
        uVar.h("pid", java.lang.String.valueOf(myPid));
        uVar.b("Stacks");
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            m3.d dVar = (m3.d) it6.next();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(((wh.t1) dVar.f323093b).f445873a);
            sb6.append("(");
            java.lang.Object obj = dVar.f323092a;
            sb6.append(obj);
            sb6.append(")");
            uVar.c(sb6.toString());
            java.lang.String a17 = cVar.a(((java.lang.Integer) obj).intValue());
            linkedHashMap.put("stack_" + ((wh.t1) dVar.f323093b).f445873a + "(" + obj + ")", a17);
            int i17 = 0;
            for (java.lang.String str : a17.split("\n")) {
                uVar.f363387a.append((java.lang.Object) (i17 == 0 ? "|   -> " : "|      "));
                uVar.f363387a.append((java.lang.Object) str);
                uVar.a("\n");
                i17++;
            }
        }
        uVar.f();
        uVar.d();
        if (e17 == null || (kVar = (com.tencent.matrix.batterycanary.stats.k) e17.f354296h.i(com.tencent.matrix.batterycanary.stats.k.class)) == null) {
            return;
        }
        kVar.k("MATRIX_TOP_DUMP", myPid, linkedHashMap);
    }

    public static void c(final java.lang.String str, final int i17) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: ph5.b$$a
            @Override // java.lang.Runnable
            public final void run() {
                db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, str, i17).show();
            }
        });
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : java.lang.String.valueOf(((com.tencent.mm.ipcinvoker.type.IPCString) obj).f68406d).split(",")) {
            java.lang.String trim = str.trim();
            if (android.text.TextUtils.isDigitsOnly(trim)) {
                try {
                    arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(trim)));
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.TopThreadDumpTask", "parse tid failed: " + th6.getMessage());
                }
            }
        }
        b(arrayList);
        rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
    }
}
