package dm0;

/* loaded from: classes13.dex */
public abstract class a extends bm0.c {

    /* renamed from: b, reason: collision with root package name */
    public org.tensorflow.lite.d f241625b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f241626c;

    public a(zl0.a aVar) {
        this.f21740a = aVar;
    }

    @Override // bm0.c
    public boolean a() {
        boolean z17 = false;
        if (!am0.c.a()) {
            com.tencent.mars.xlog.Log.e("Kara.BasePredict", "PredictEnv not init");
            return false;
        }
        if (!((com.tencent.mm.sdk.platformtools.z.f193115k || kl0.a.a()) && com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().j("clicfg_plugin_kara_predict_open", "1", false, true), 1) != 0)) {
            com.tencent.mars.xlog.Log.e("Kara.BasePredict", "init error");
            return false;
        }
        try {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(this.f21740a.c());
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
                java.nio.MappedByteBuffer map = randomAccessFile.getChannel().map(java.nio.channels.FileChannel.MapMode.READ_ONLY, randomAccessFile.getFilePointer(), randomAccessFile.length() + randomAccessFile.getFilePointer());
                com.tencent.mars.xlog.Log.i("Kara.BasePredict", "get mappedByteBuffer succ");
                this.f241625b = new org.tensorflow.lite.d(map.asReadOnlyBuffer());
                com.tencent.mars.xlog.Log.i("Kara.BasePredict", "get Interpreter succ");
                z17 = true;
            } else {
                com.tencent.mars.xlog.Log.e("Kara.BasePredict", "model file not exists:" + this.f21740a.c());
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Kara.BasePredict", "load model error!");
            com.tencent.mars.xlog.Log.printErrStackTrace("Kara.BasePredict", e17, "", new java.lang.Object[0]);
        }
        this.f241626c = z17;
        return z17;
    }

    @Override // bm0.c
    public boolean b() {
        return this.f241626c;
    }

    @Override // bm0.c
    public void d() {
        synchronized (this) {
            org.tensorflow.lite.d dVar = this.f241625b;
            if (dVar != null) {
                dVar.close();
                this.f241625b = null;
            }
        }
    }
}
