package ws2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f449006a;

    /* renamed from: b, reason: collision with root package name */
    public final zs2.d f449007b;

    /* renamed from: c, reason: collision with root package name */
    public final ws2.a f449008c;

    public b(gk2.e eVar, int i17, boolean z17, zs2.d dVar, ws2.a aVar) {
        this.f449006a = eVar;
        this.f449007b = dVar;
        this.f449008c = aVar;
        ct2.d dVar2 = (ct2.d) a(ct2.d.class);
        if (dVar2 != null) {
            dVar2.f222252s = i17;
            dVar2.f222248o = z17;
            com.tencent.mars.xlog.Log.i("LiveMsgOffsetSlice", "init scene:" + i17 + ", enableBulletMsg:" + z17);
        }
    }

    public final androidx.lifecycle.c1 a(java.lang.Class bu6) {
        kotlin.jvm.internal.o.g(bu6, "bu");
        gk2.e eVar = this.f449006a;
        if (eVar != null) {
            return eVar.a(bu6);
        }
        return null;
    }
}
