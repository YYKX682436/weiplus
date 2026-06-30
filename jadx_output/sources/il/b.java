package il;

/* loaded from: classes13.dex */
public class b implements jl.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ il.e f291979b;

    public b(il.e eVar, java.lang.String str) {
        this.f291979b = eVar;
        this.f291978a = str;
    }

    @Override // jl.e
    public void a() {
        java.lang.String c17 = rl.a.c(this.f291978a, "audio_cache_path_file.txt");
        il.e eVar = this.f291979b;
        eVar.f291985c = c17;
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioCachePathMgr", "readData", null);
        jl.d dVar = new jl.d(new il.d(eVar), "readData", 5);
        ll.m.a();
        ll.m.b(dVar);
    }

    @Override // jl.e
    public void end() {
    }
}
