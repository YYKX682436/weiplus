package ml;

/* loaded from: classes13.dex */
public class d extends ll.n {

    /* renamed from: g, reason: collision with root package name */
    public final ml.h f327176g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f327177h;

    /* renamed from: i, reason: collision with root package name */
    public ql.c f327178i;

    public d(ml.h hVar, java.lang.String str, int i17) {
        super(str, i17);
        this.f327177h = false;
        this.f327176g = hVar;
    }

    @Override // ll.n
    public void h() {
        this.f327177h = false;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = {this.f319117d};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDownloadTask", "run task %s", objArr);
        if (this.f327177h) {
            ((ml.c) this.f327176g).a(this);
            return;
        }
        android.os.Process.setThreadPriority(10);
        ml.h hVar = this.f327176g;
        ql.c cVar = this.f327178i;
        ml.c cVar2 = (ml.c) hVar;
        cVar2.f327173b = false;
        if (cVar == null) {
            ml.f fVar = cVar2.f327174c;
            if (fVar != null) {
                ((ml.a) fVar).a(null);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioDownloadProcess", "process source is null", null);
            cVar2.f327173b = true;
        } else {
            cVar2.f327172a = false;
            n01.b b17 = cVar.b();
            if (b17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDownloadProcess", "audio:%s, url:%s", b17.f333836a, b17.f333837b);
            }
            cVar2.f327175d = b17;
            cVar.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDownloadProcess", "source connect, stop:%b", java.lang.Boolean.valueOf(cVar2.f327173b));
            long j17 = -1;
            java.lang.String str = "";
            int i18 = 0;
            while (true) {
                if (i18 >= 3 || cVar2.f327173b) {
                    break;
                }
                i18++;
                if (j17 <= 0) {
                    j17 = cVar.getSize();
                }
                long j18 = j17;
                if (android.text.TextUtils.isEmpty(str)) {
                    str = cVar.c();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDownloadProcess", "fileSize:%d, mimetype:%s, tryCount:%d", java.lang.Long.valueOf(j18), str, java.lang.Integer.valueOf(i18));
                if (j18 <= 0 || android.text.TextUtils.isEmpty(str)) {
                    j17 = j18;
                } else if (android.text.TextUtils.isEmpty(str) || !str.contains("text/")) {
                    byte[] bArr = new byte[8192];
                    int i19 = 0;
                    while (true) {
                        long j19 = i19;
                        if (j19 >= j18 || cVar2.f327173b) {
                            break;
                        }
                        int readAt = cVar.readAt(j19, bArr, 0, 8192);
                        if (readAt < 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioDownloadProcess", "readSize:%d, terminal process or read end", java.lang.Integer.valueOf(readAt));
                            break;
                        }
                        i19 += readAt;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDownloadProcess", "offSize:%d", java.lang.Integer.valueOf(i19));
                    cVar2.f327172a = true;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioDownloadProcess", "mimetype not support", null);
                }
            }
            cVar.disconnect();
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDownloadProcess", "source disconnect", null);
        }
        ((ml.c) this.f327176g).a(this);
        this.f327177h = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDownloadTask", "run task %s end", this.f319117d);
    }
}
