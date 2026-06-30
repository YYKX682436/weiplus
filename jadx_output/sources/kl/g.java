package kl;

/* loaded from: classes13.dex */
public class g extends ll.n {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kl.h f308727g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kl.h hVar, java.lang.String str, int i17) {
        super(str, i17);
        this.f308727g = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        kl.h hVar = this.f308727g;
        hVar.getClass();
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioScanConvertCacheController", "clean mix convert file", null);
        hVar.a(rl.a.d().u());
        ll.m.c(this);
    }
}
