package pg2;

/* loaded from: classes3.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final pg2.b0 f354088d = new pg2.b0();

    public b0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ug5.g it = (ug5.g) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("realEnterPlaying removeCallback player: ");
        java.util.HashMap hashMap = it.f427595i;
        sb6.append(hashMap.get("key_player"));
        com.tencent.mars.xlog.Log.i("FinderLiveSurfaceViewService", sb6.toString());
        java.lang.Object obj2 = hashMap.get("key_player");
        nn0.c cVar = obj2 instanceof nn0.c ? (nn0.c) obj2 : null;
        if (cVar != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveSurfaceViewService", "remove callback stop play");
            mn0.b0.C(cVar, true, false, false, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
