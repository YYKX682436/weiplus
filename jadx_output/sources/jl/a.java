package jl;

/* loaded from: classes13.dex */
public class a implements jl.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f300188a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f300189b;

    public a(java.lang.String str, java.lang.String str2) {
        this.f300188a = str;
        this.f300189b = str2;
    }

    @Override // jl.e
    public void a() {
        java.util.ArrayList arrayList;
        java.lang.String str = this.f300188a;
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioPcmDataTrackCacheToFileTask", "runTask, appId:%s", str);
        java.lang.String str2 = this.f300189b;
        if (!android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioPcmDataTrackCacheToFileTask", "cache to file path :%s, size:%d", str2, java.lang.Integer.valueOf(il.j.a().c(str2)));
            hl.d b17 = il.j.a().b(str2);
            if (!b17.f282019b || b17.f282026i) {
                return;
            }
            b17.j(str);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioPcmDataTrackCacheToFileTask", "cache to file task", null);
        il.j a17 = il.j.a();
        synchronized (a17.f292005c) {
            arrayList = new java.util.ArrayList();
            arrayList.addAll(a17.f292003a);
        }
        if (arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            java.lang.String str3 = "";
            int i18 = 0;
            while (it.hasNext()) {
                java.lang.String str4 = (java.lang.String) it.next();
                hl.d b18 = il.j.a().b(str4);
                if (!b18.f282019b || !b18.f282026i) {
                    int c17 = il.j.a().c(str4);
                    if (c17 >= i18) {
                        str3 = str4;
                        i18 = c17;
                    }
                }
            }
            hl.d b19 = il.j.a().b(str3);
            if (b19.f282019b && !b19.f282026i) {
                b19.j(str);
            }
            java.lang.Object[] objArr = {str3, java.lang.Integer.valueOf(i18)};
            int i19 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioPcmDataTrackCacheToFileTask", "cache to file path :%s, size:%d", objArr);
        }
    }

    @Override // jl.e
    public void end() {
    }
}
