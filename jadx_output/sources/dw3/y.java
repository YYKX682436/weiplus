package dw3;

/* loaded from: classes10.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ct0.b f244293d;

    public y(ct0.b bVar) {
        this.f244293d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (java.lang.String str : this.f244293d.f222215l) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileUtil", "delete file:" + str);
            dw3.c0.f244182a.j(str);
        }
    }
}
