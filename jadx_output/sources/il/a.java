package il;

/* loaded from: classes13.dex */
public class a implements jl.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291976b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ il.e f291977c;

    public a(il.e eVar, java.lang.String str, java.lang.String str2) {
        this.f291977c = eVar;
        this.f291975a = str;
        this.f291976b = str2;
    }

    @Override // jl.e
    public void a() {
        java.lang.String c17 = rl.a.c(this.f291975a, "audio_cache_path_file.txt");
        il.e eVar = this.f291977c;
        eVar.f291985c = c17;
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioCachePathMgr", "saveData", null);
        jl.d dVar = new jl.d(new il.c(eVar), "saveData", 5);
        ll.m.a();
        ll.m.b(dVar);
        eVar.f291985c = rl.a.c(this.f291976b, "audio_cache_path_file.txt");
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioCachePathMgr", "readData", null);
        jl.d dVar2 = new jl.d(new il.d(eVar), "readData", 5);
        ll.m.a();
        ll.m.b(dVar2);
    }

    @Override // jl.e
    public void end() {
    }
}
