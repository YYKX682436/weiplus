package il;

/* loaded from: classes12.dex */
public class c implements jl.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ il.e f291980a;

    public c(il.e eVar) {
        this.f291980a = eVar;
    }

    @Override // jl.e
    public void a() {
        il.e eVar = this.f291980a;
        synchronized (eVar) {
            if (eVar.f291983a.isEmpty()) {
                int i17 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioCachePathMgr", "data is empty", null);
                return;
            }
            try {
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(eVar.f291985c);
                java.lang.String str = a17.f213279f;
                if (str != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                    if (!a17.f213279f.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (m17.a()) {
                    m17.f213266a.d(m17.f213267b);
                }
                java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new com.tencent.mm.vfs.a7(eVar.b()));
                java.util.Iterator it = eVar.f291983a.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    bufferedWriter.newLine();
                    bufferedWriter.write(str2);
                }
                java.lang.Object[] objArr = {java.lang.Integer.valueOf(eVar.f291983a.size())};
                int i18 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioCachePathMgr", "line count:%s", objArr);
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (java.io.IOException e17) {
                int i19 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioCachePathMgr", e17, "asyncRead", new java.lang.Object[0]);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioCachePathMgr", "save end", null);
        }
    }

    @Override // jl.e
    public void end() {
    }
}
