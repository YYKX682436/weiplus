package g20;

/* loaded from: classes8.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g20.g f267765d;

    public b(g20.g gVar) {
        this.f267765d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g20.g gVar = this.f267765d;
        if (gVar.f267776g != null) {
            boolean Vi = gVar.Vi();
            if (kotlin.jvm.internal.o.b(java.lang.Boolean.valueOf(Vi), gVar.f267776g)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsOrderService", "notifyInitCmdCardHolderUpdate nativeDataManagerSwitchOn " + Vi);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsOrderService", "notifyInitCmdCardHolderUpdate modify nativeDataManagerSwitchOn from " + gVar.f267776g + " to " + Vi);
            gVar.f267776g = java.lang.Boolean.valueOf(Vi);
            x02.h Bi = gVar.Bi();
            if (Bi != null) {
                urgen.ur_7522.UR_3A2B.UR_B604(((x02.i) Bi).getCppPointer(), Vi);
            }
        }
    }
}
