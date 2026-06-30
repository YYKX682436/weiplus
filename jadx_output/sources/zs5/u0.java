package zs5;

/* loaded from: classes15.dex */
public class u0 {

    /* renamed from: h, reason: collision with root package name */
    public static final zs5.u0 f475485h = new zs5.u0();

    /* renamed from: i, reason: collision with root package name */
    public static f04.j f475486i = null;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f475487a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f475488b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f475489c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f475490d = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f475491e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f475492f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.Executor f475493g = qo.q.f365321a.a("MicroMsg.WxFileDecodeQueue", null);

    public u0() {
        com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE.addLifecycleCallback(new zs5.r0(this));
    }

    public static android.graphics.Bitmap c(java.lang.String str, kd0.b3 b3Var) {
        int i17;
        try {
            if (f475486i == null) {
                f475486i = new f04.e();
            }
            f04.c cVar = new f04.c(str);
            cVar.f258420c = b3Var != null && b3Var.f306608e;
            f04.i a17 = f04.f.a(cVar, f475486i);
            android.graphics.Point point = a17.f258426b;
            if (point != null && b3Var != null && ((i17 = b3Var.f306609f) == 2 || i17 == 4)) {
                zs5.j0 j0Var = zs5.j0.Q;
                int i18 = point.x;
                int i19 = point.y;
                j0Var.getClass();
                j0Var.f475424h = new android.graphics.Point(i18, i19);
            }
            return a17.f258425a;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxFileDecodeQueue", e17, "[scanDecode-file] decode file to bitmap error!", new java.lang.Object[0]);
            return null;
        }
    }

    public void a(android.content.Context context, long j17, java.lang.String str, kd0.a3 a3Var) {
        kd0.b3 b3Var = new kd0.b3();
        b3Var.f306604a = j17;
        b3Var.f306605b = str;
        b3Var.f306607d = new int[]{0};
        b(b3Var, a3Var);
    }

    public void b(kd0.b3 b3Var, kd0.a3 a3Var) {
        synchronized (this.f475490d) {
            long j17 = b3Var.f306604a;
            int size = ((java.util.HashMap) this.f475487a).size();
            if (size < 9) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxFileDecodeQueue", "[scanDecode-file] addDecodeTask submit decode task %d, fileMap: %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(size));
                java.lang.String str = b3Var.f306605b;
                ((java.util.HashMap) this.f475487a).put(java.lang.Long.valueOf(j17), str);
                if (a3Var != null) {
                    ((java.util.HashMap) this.f475488b).put(java.lang.Long.valueOf(j17), a3Var);
                }
                if (!((java.util.HashMap) this.f475489c).containsKey(str)) {
                    ((java.util.HashMap) this.f475489c).put(str, new java.util.ArrayList());
                    com.tencent.qbar.QbarNative$QbarAiModelParam Ai = ((jd0.l2) ((kd0.w2) i95.n0.c(kd0.w2.class))).Ai(1, false);
                    this.f475492f = Ai != null ? Ai.detectModelVersion : "";
                    this.f475493g.execute(new zs5.t0(this, Ai, b3Var));
                }
                ((java.util.List) ((java.util.HashMap) this.f475489c).get(str)).add(java.lang.Long.valueOf(j17));
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.WxFileDecodeQueue", "[scanDecode-file] too many files are waiting and ignore: %d", java.lang.Long.valueOf(j17));
                a3Var.a(j17, null);
            }
        }
    }

    public java.util.List d(android.content.Context context, java.util.List list) {
        java.util.ArrayList arrayList;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxFileDecodeQueue", "[scanDecode-file] directScanCodeForFile imagePathList is empty");
            return null;
        }
        synchronized (this.f475491e) {
            e04.f2.a(null);
            zs5.q0 q0Var = zs5.q0.f475461a;
            ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).getClass();
            if (e04.v3.f246138a == null) {
                e04.v3.h();
            }
            q0Var.b(e04.v3.f246138a.booleanValue());
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                kd0.c3 c3Var = new kd0.c3();
                kd0.b3 b3Var = new kd0.b3();
                android.graphics.Bitmap c17 = c(str2, b3Var);
                if (c17 != null) {
                    int[] iArr = {0};
                    ry3.s sVar = new ry3.s(1);
                    com.tencent.qbar.QbarNative$QbarAiModelParam Ai = ((jd0.l2) ((kd0.w2) i95.n0.c(kd0.w2.class))).Ai(1, false);
                    sVar.f401556b = Ai;
                    sVar.f401559e = iArr;
                    this.f475492f = Ai != null ? Ai.detectModelVersion : "";
                    zs5.q0 q0Var2 = zs5.q0.f475461a;
                    if (!q0Var2.d()) {
                        q0Var2.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 1, sVar);
                    }
                    if (q0Var2.d()) {
                        q0Var2.a(iArr);
                    }
                    int[] iArr2 = new int[c17.getWidth() * c17.getHeight()];
                    c17.getPixels(iArr2, 0, c17.getWidth(), 0, 0, c17.getWidth(), c17.getHeight());
                    c3Var.f306622b = new java.util.ArrayList();
                    c3Var.f306623c = new java.util.ArrayList();
                    android.graphics.Point point = new android.graphics.Point(c17.getWidth(), c17.getHeight());
                    c3Var.f306624d = point;
                    zs5.b0 e17 = q0Var2.e(iArr2, point, null, c3Var.f306622b, c3Var.f306623c);
                    java.util.List list2 = e17 != null ? e17.f475324a : null;
                    c3Var.f306621a = list2;
                    c3Var.f306625e = b3Var.f306609f;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = java.lang.Integer.valueOf(list2 == null ? 0 : list2.size());
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxFileDecodeQueue", "[scanDecode-file] directScanCodeForFile get %d decode results", objArr);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxFileDecodeQueue", "[scanDecode-file] directScanCodeForFile bitmap == null, imagePath:%s", str2);
                }
                arrayList.add(c3Var);
            }
            zs5.q0 q0Var3 = zs5.q0.f475461a;
            if (q0Var3.d()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxFileDecodeQueue", "[scanDecode-file] directScanCodeForFile release QBar");
                q0Var3.release();
            }
        }
        return arrayList;
    }

    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxFileDecodeQueue", "releaseWxFileQRCodeDecoder");
        this.f475493g.execute(new zs5.s0(this));
    }
}
