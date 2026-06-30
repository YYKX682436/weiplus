package il;

/* loaded from: classes12.dex */
public class d implements jl.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ il.e f291981a;

    public d(il.e eVar) {
        this.f291981a = eVar;
    }

    @Override // jl.e
    public void a() {
        il.e eVar = this.f291981a;
        synchronized (eVar) {
            try {
                eVar.f291983a.clear();
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new com.tencent.mm.vfs.z6(eVar.b()));
                while (true) {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (!android.text.TextUtils.isEmpty(readLine)) {
                        eVar.f291983a.add(readLine);
                    }
                }
                java.lang.Object[] objArr = {java.lang.Integer.valueOf(eVar.f291983a.size())};
                int i17 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioCachePathMgr", "line count:%s", objArr);
                bufferedReader.close();
            } catch (java.io.IOException e17) {
                int i18 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioCachePathMgr", e17, "asyncRead", new java.lang.Object[0]);
            }
        }
    }

    @Override // jl.e
    public void end() {
    }
}
