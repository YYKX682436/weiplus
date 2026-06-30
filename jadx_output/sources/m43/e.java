package m43;

/* loaded from: classes8.dex */
public class e extends java.util.concurrent.CopyOnWriteArrayList {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f323457d = new java.lang.Object();

    public int d(java.lang.Object obj) {
        int i17 = 0;
        for (int i18 = 0; i18 < size(); i18++) {
            if (java.lang.Integer.valueOf(((com.tencent.mm.plugin.downloader_app.model.r0) ((m43.d) get(i18))).f97314c).equals(obj)) {
                i17++;
            }
        }
        return i17;
    }

    public int e(m43.d dVar) {
        int i17;
        synchronized (this.f323457d) {
            boolean z17 = false;
            i17 = 0;
            while (true) {
                if (i17 >= size()) {
                    i17 = 0;
                    break;
                }
                if (java.lang.Integer.compare(((com.tencent.mm.plugin.downloader_app.model.r0) dVar).f97314c, java.lang.Integer.valueOf(((com.tencent.mm.plugin.downloader_app.model.r0) ((m43.d) get(i17))).f97314c).intValue()) < 0) {
                    z17 = true;
                    break;
                }
                i17++;
            }
            if (!z17) {
                i17 = size();
            }
            add(i17, dVar);
        }
        return i17;
    }
}
