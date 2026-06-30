package jl;

/* loaded from: classes13.dex */
public class b implements jl.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f300190a;

    public b(java.lang.String str) {
        this.f300190a = str;
    }

    @Override // jl.e
    public void a() {
        java.util.ArrayList arrayList;
        java.lang.Object[] objArr = {this.f300190a};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioPcmDataTrackRecycleCacheTask", "runTask, appId:%s", objArr);
        il.j a17 = il.j.a();
        synchronized (a17.f292005c) {
            java.util.Iterator it = a17.f292003a.iterator();
            while (it.hasNext()) {
                hl.d dVar = (hl.d) a17.f292004b.get((java.lang.String) it.next());
                if (dVar != null) {
                    dVar.g();
                }
            }
            a17.f292003a.clear();
            a17.f292004b.clear();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioPcmDataTrackRecycleCacheTask", "delete all pcm cache File", null);
        il.j a18 = il.j.a();
        synchronized (a18.f292005c) {
            arrayList = new java.util.ArrayList();
            arrayList.addAll(a18.f292003a);
        }
        if (arrayList.size() > 0) {
            java.lang.String str = this.f300190a;
            if (arrayList.size() > 0) {
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    java.lang.String f17 = rl.a.f(str, (java.lang.String) it6.next());
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(f17);
                    if (r6Var.m()) {
                        r6Var.l();
                        int i18 = rl.b.f397143a;
                        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.FileUtil", "delete pcm cache file, file:%s", f17);
                    }
                }
            }
        }
    }

    @Override // jl.e
    public void end() {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioPcmDataTrackRecycleCacheTask", "end task", null);
    }
}
