package lk5;

/* loaded from: classes13.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a() {
        boolean z17 = j62.e.g().i("clicfg_vas_intent_wrapper_flag", 1, false, false) == 1;
        if (lk5.d.f319025c != z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IntentWrapper", "clicfg_vas_intent_wrapper_flag changed from " + lk5.d.f319025c + " to " + z17);
            lk5.d.f319025c = z17;
        }
        if (z17) {
            return true;
        }
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        return (i17 == 788529167 || i17 == 788529166) || z65.c.a();
    }

    public final int b(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return ((java.lang.String) obj).length();
        }
        if (obj instanceof byte[]) {
            return ((byte[]) obj).length;
        }
        int i17 = 0;
        if (obj instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) obj;
            java.util.Set<java.lang.String> keySet = bundle.keySet();
            kotlin.jvm.internal.o.f(keySet, "keySet(...)");
            java.util.Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                i17 += lk5.d.f319023a.b(bundle.get((java.lang.String) it.next()));
            }
        }
        return i17;
    }

    public final boolean c(android.content.Intent intent) {
        boolean z17;
        android.content.ComponentName component = intent.getComponent();
        java.lang.String className = component != null ? component.getClassName() : null;
        java.util.Iterator it = lk5.d.f319024b.iterator();
        do {
            z17 = false;
            if (!it.hasNext()) {
                return false;
            }
            java.lang.String str = (java.lang.String) it.next();
            if (className != null && r26.n0.B(className, str, false)) {
                z17 = true;
            }
        } while (!z17);
        return true;
    }

    public final java.lang.String d(android.content.Intent intent, java.lang.String str, long j17, java.lang.Object value, java.lang.String str2) {
        java.lang.String key = str + '_' + j17;
        d75.d dVar = d75.e.f226890a;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        d75.e.f226891b.put(key, value);
        intent.removeExtra(str);
        return str + ',' + j17 + ',' + str2;
    }

    public final void e(android.content.Intent intent, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = str + '_' + str2;
        int hashCode = str3.hashCode();
        if (hashCode == -1377881982) {
            if (str3.equals("bundle")) {
                intent.putExtra(str, (android.os.Bundle) d75.e.f226890a.a(str4));
            }
        } else if (hashCode == -1374008726) {
            if (str3.equals("byte[]")) {
                intent.putExtra(str, (byte[]) d75.e.f226890a.a(str4));
            }
        } else if (hashCode == -891985903 && str3.equals("string")) {
            intent.putExtra(str, (java.lang.String) d75.e.f226890a.a(str4));
        }
    }

    public final void f(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        if (a() && c(intent)) {
            try {
                android.os.Bundle extras = intent.getExtras();
                if (extras != null) {
                    extras.setClassLoader(lk5.d.class.getClassLoader());
                }
                android.os.Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    lk5.c cVar = lk5.d.f319023a;
                    java.util.ArrayList<java.lang.String> stringArrayList = extras2.getStringArrayList("__transfer__");
                    if (stringArrayList != null) {
                        for (java.lang.String str : stringArrayList) {
                            kotlin.jvm.internal.o.d(str);
                            java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null);
                            if (f07.size() != 3) {
                                return;
                            }
                            lk5.d.f319023a.e(intent, (java.lang.String) f07.get(0), (java.lang.String) f07.get(1), (java.lang.String) f07.get(2));
                            intent.removeExtra("__transfer__");
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IntentWrapper", th6, "unWrap err", new java.lang.Object[0]);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x011f A[Catch: all -> 0x0136, TRY_LEAVE, TryCatch #1 {all -> 0x0136, blocks: (B:51:0x00ef, B:53:0x00f5, B:54:0x00fc, B:56:0x0107, B:60:0x011f, B:72:0x010e, B:75:0x0115), top: B:50:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.content.Intent r18) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lk5.c.g(android.content.Intent):void");
    }
}
