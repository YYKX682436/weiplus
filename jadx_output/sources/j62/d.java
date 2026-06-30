package j62;

/* loaded from: classes.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f297895d;

    public d(j62.e eVar, long j17, java.lang.String str, java.lang.String str2) {
        this.f297895d = "Hit expt : " + j17 + "," + str + ":" + str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f297895d, 1).show();
    }
}
