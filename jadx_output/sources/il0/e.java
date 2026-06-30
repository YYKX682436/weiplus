package il0;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: f, reason: collision with root package name */
    public static final il0.e f292009f = new il0.e();

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f292010a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f292011b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f292012c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f292013d = false;

    /* renamed from: e, reason: collision with root package name */
    public dm0.e f292014e = null;

    public e() {
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.addLifecycleCallback(new il0.a(this));
        ki.i.f308101c.b(new il0.c(this));
    }

    public static java.lang.String c() {
        com.tencent.mm.udr.e0 e0Var = (com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class);
        new il0.d();
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) e0Var).Ui("ilinkres_6d2cb220", "details_json");
        if (Ui == null) {
            com.tencent.mars.xlog.Log.e("Kara.DiscoveryReddotEnv", "get details_json failed");
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            java.io.FileReader fileReader = new java.io.FileReader(Ui.getPath());
            try {
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb6.append(readLine);
                        sb6.append("\n");
                    } finally {
                    }
                }
                bufferedReader.close();
                fileReader.close();
            } finally {
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Kara.DiscoveryReddotEnv", e17, "read file error", new java.lang.Object[0]);
        }
        return sb6.toString();
    }

    public final boolean a() {
        com.tencent.mm.udr.e0 e0Var = (com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class);
        new il0.d();
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) e0Var).Ui("ilinkres_6d2cb220", "discovery_reddot_model_tflite");
        if (Ui != null) {
            return android.text.TextUtils.equals(Ui.getMd5(), this.f292012c);
        }
        com.tencent.mars.xlog.Log.e("Kara.DiscoveryReddotEnv", "discovery_reddot_model_tfliteFile is null");
        return false;
    }

    public synchronized void b() {
        if (this.f292013d) {
            this.f292013d = false;
            java.util.List list = this.f292010a;
            if (list != null) {
                list.clear();
                this.f292010a = null;
            }
            java.util.List list2 = this.f292011b;
            if (list2 != null) {
                list2.clear();
                this.f292011b = null;
            }
            dm0.e eVar = this.f292014e;
            if (eVar != null) {
                synchronized (eVar) {
                    org.tensorflow.lite.d dVar = eVar.f241629a;
                    if (dVar != null) {
                        dVar.close();
                        eVar.f241629a = null;
                    }
                }
                this.f292014e = null;
            }
        }
    }

    public java.util.List d() {
        if (this.f292010a == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String c17 = c();
            if (android.text.TextUtils.isEmpty(c17)) {
                com.tencent.mars.xlog.Log.e("Kara.DiscoveryReddotEnv", "get details_json failed");
            } else {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONObject(c17).getJSONArray("feature_names");
                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                        arrayList.add(jSONArray.getString(i17));
                    }
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("Kara.DiscoveryReddotEnv", e17, "json parse error", new java.lang.Object[0]);
                }
            }
            this.f292010a = arrayList;
        }
        return this.f292010a;
    }

    public java.util.List e() {
        if (this.f292011b == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String c17 = c();
            if (android.text.TextUtils.isEmpty(c17)) {
                com.tencent.mars.xlog.Log.e("Kara.DiscoveryReddotEnv", "get details_json failed");
            } else {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONObject(c17).getJSONArray("label_names");
                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                        arrayList.add(jSONArray.getString(i17));
                    }
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("Kara.DiscoveryReddotEnv", e17, "json parse error", new java.lang.Object[0]);
                }
            }
            this.f292011b = arrayList;
        }
        return this.f292011b;
    }

    public synchronized boolean f() {
        this.f292013d = false;
        if (!am0.c.a()) {
            com.tencent.mars.xlog.Log.e("Kara.DiscoveryReddotEnv", "PredictEnv.init failed");
            return false;
        }
        if (!g()) {
            com.tencent.mars.xlog.Log.e("Kara.DiscoveryReddotEnv", "model init failed");
            return false;
        }
        java.lang.String c17 = c();
        java.lang.String str = null;
        if (!android.text.TextUtils.isEmpty(c17)) {
            try {
                str = new org.json.JSONObject(c17).getString("tflite_md5");
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Kara.DiscoveryReddotEnv", e17, "checkMd5 json parse error", new java.lang.Object[0]);
            }
        }
        this.f292012c = str;
        if (!a()) {
            com.tencent.mars.xlog.Log.e("Kara.DiscoveryReddotEnv", "check md5 failed");
            return false;
        }
        if (!h()) {
            com.tencent.mars.xlog.Log.e("Kara.DiscoveryReddotEnv", "initPredictor failed");
            return false;
        }
        com.tencent.mars.xlog.Log.i("Kara.DiscoveryReddotEnv", "env init success");
        this.f292013d = true;
        return true;
    }

    public final boolean g() {
        new il0.d();
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_6d2cb220", "details_json");
        com.tencent.wechat.aff.udr.x Ui2 = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_6d2cb220", "discovery_reddot_model_tflite");
        if (Ui != null && Ui2 != null) {
            this.f292010a = d();
            this.f292011b = e();
            if (this.f292010a.size() != 0 && this.f292011b.size() != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        com.tencent.mm.udr.e0 e0Var = (com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class);
        new il0.d();
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) e0Var).Ui("ilinkres_6d2cb220", "discovery_reddot_model_tflite");
        boolean z17 = false;
        if (Ui == null) {
            com.tencent.mars.xlog.Log.e("Kara.DiscoveryReddotEnv", "discovery_reddot_model_tfliteFile is null");
            return false;
        }
        java.lang.String path = Ui.getPath();
        dm0.e eVar = new dm0.e(path);
        try {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(path);
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(a17.toString(), "rw");
                java.nio.MappedByteBuffer map = randomAccessFile.getChannel().map(java.nio.channels.FileChannel.MapMode.READ_ONLY, randomAccessFile.getFilePointer(), randomAccessFile.getFilePointer() + randomAccessFile.length());
                com.tencent.mars.xlog.Log.i("Kara.TfLiteMultiClassifyPredict", "get mappedByteBuffer succ");
                eVar.f241629a = new org.tensorflow.lite.d(map.asReadOnlyBuffer());
                com.tencent.mars.xlog.Log.i("Kara.TfLiteMultiClassifyPredict", "get Interpreter succ");
                z17 = true;
            } else {
                com.tencent.mars.xlog.Log.e("Kara.TfLiteMultiClassifyPredict", "model file not exists:".concat(path));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Kara.TfLiteMultiClassifyPredict", "load model error!");
            com.tencent.mars.xlog.Log.printErrStackTrace("Kara.TfLiteMultiClassifyPredict", e17, "", new java.lang.Object[0]);
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("Kara.DiscoveryReddotEnv", "Predictor init success");
            this.f292014e = eVar;
        } else {
            com.tencent.mars.xlog.Log.e("Kara.DiscoveryReddotEnv", "Predictor init fail");
        }
        return z17;
    }
}
