package y70;

/* loaded from: classes12.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y70.c f459668d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y70.c cVar) {
        super(1);
        this.f459668d = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g75.z state = (g75.z) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof y70.e)) {
            y70.e eVar = (y70.e) dVar;
            byte[] bArr = eVar.f459670c;
            m70.h hVar = eVar.f459671d;
            y70.c cVar = this.f459668d;
            android.graphics.Bitmap j17 = cVar.j(state, eVar.f459669b, bArr, hVar);
            if (j17 != null) {
                cVar.a(new m70.f(eVar.f459669b, j17));
            }
        }
        return jz5.f0.f302826a;
    }
}
