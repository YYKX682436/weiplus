package cw4;

/* loaded from: classes4.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw4.m0 f224234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f224235e;

    public l0(cw4.m0 m0Var, java.lang.String[] strArr) {
        this.f224234d = m0Var;
        this.f224235e = strArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.nio.charset.Charset charset;
        java.lang.String str;
        boolean z17;
        cw4.m0 m0Var = this.f224234d;
        hy4.g0 g0Var = m0Var.f224252u;
        kotlin.jvm.internal.o.f(com.tencent.mm.sdk.platformtools.m2.c(com.tencent.mm.sdk.platformtools.x2.f193071a), "getActualTranslateLanguageIso(...)");
        cw4.k0 k0Var = new cw4.k0(m0Var);
        g0Var.getClass();
        java.lang.String[] sampleArray = this.f224235e;
        kotlin.jvm.internal.o.g(sampleArray, "sampleArray");
        if (sampleArray.length == 0) {
            return;
        }
        java.util.List z07 = kz5.z.z0(sampleArray);
        if (z07.size() > 1000) {
            z07 = z07.subList(0, 1000);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = z07.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            charset = g0Var.f286103a;
            if (!hasNext) {
                break;
            }
            java.lang.String input = (java.lang.String) it.next();
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[0-9]");
            kotlin.jvm.internal.o.f(compile, "compile(...)");
            kotlin.jvm.internal.o.g(input, "input");
            java.lang.String replaceAll = compile.matcher(input).replaceAll("");
            kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
            java.lang.String[] strArr = {"@", "＠", "¥", "©", "{{", "<%", "http"};
            int i18 = 0;
            while (true) {
                if (i18 >= 7) {
                    z17 = false;
                    break;
                } else {
                    if (r26.n0.B(replaceAll, strArr[i18], true)) {
                        z17 = true;
                        break;
                    }
                    i18++;
                }
            }
            if (!z17) {
                arrayList.add(replaceAll);
            }
            byte[] bytes = replaceAll.getBytes(charset);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            i17 += bytes.length;
        }
        if (i17 < 0) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        loop2: while (true) {
            str = "";
            while (it6.hasNext()) {
                java.lang.String str2 = (java.lang.String) it6.next();
                byte[] bytes2 = str2.getBytes(charset);
                kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
                if (bytes2.length > 100) {
                    arrayList2.add(str2);
                } else {
                    str = str + ' ' + str2;
                    byte[] bytes3 = str.getBytes(charset);
                    kotlin.jvm.internal.o.f(bytes3, "getBytes(...)");
                    if (bytes3.length > 100) {
                        break;
                    }
                }
            }
            arrayList2.add(str);
        }
        if (str.length() > 0) {
            arrayList2.add(str);
        }
        if (arrayList2.size() > 1) {
            kz5.g0.t(arrayList2, new hy4.f0());
        }
        int size = arrayList2.size();
        java.util.Collection collection = arrayList2;
        if (size > 10) {
            collection = arrayList2.subList(0, 10);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it7 = collection.iterator();
        while (it7.hasNext()) {
            linkedList.add((java.lang.String) it7.next());
        }
        com.tencent.mm.plugin.webview.model.z0 z0Var = new com.tencent.mm.plugin.webview.model.z0();
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.m2.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i19 = 2;
        try {
            int[] iArr = {2};
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new r45.n20();
            lVar.f70665b = new r45.o20();
            lVar.f70666c = "/cgi-bin/micromsg-bin/checktextlanguage";
            lVar.f70667d = 528;
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            r45.n20 n20Var = (r45.n20) lVar.a().f70710a.f70684a;
            n20Var.f381013d = linkedList;
            n20Var.f381014e = c17;
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            new android.os.Bundle();
            ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new com.tencent.mm.plugin.webview.model.y0(z0Var, iArr, countDownLatch));
            try {
                countDownLatch.await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneCheckTextLanguage", e17.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneCheckTextLanguage", e17, "", new java.lang.Object[0]);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckTextLanguage", "CheckTextLanguage end");
            i19 = iArr[0];
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneCheckTextLanguage", "CheckTextLanguage failed");
        }
        g0Var.f286105c = i19;
        g0Var.f286104b = i19 == 0 ? 1.0d : 0.0d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLanguageCheckTask", "check ratio = " + g0Var.f286104b);
        k0Var.invoke();
    }
}
