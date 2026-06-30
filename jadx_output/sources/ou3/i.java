package ou3;

/* loaded from: classes5.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ou3.i f348957d = new ou3.i();

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = ou3.j.f348959b;
        if (com.tencent.mm.vfs.w6.j(str)) {
            return;
        }
        ou3.j jVar = ou3.j.f348958a;
        android.content.res.AssetManager assets = com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets();
        kotlin.jvm.internal.o.f(assets, "getAssets(...)");
        jVar.a(assets, "filters", str);
    }
}
