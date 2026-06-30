package v22;

/* loaded from: classes10.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.z f432866d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(v22.z zVar) {
        super(0);
        this.f432866d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        v22.z zVar = this.f432866d;
        boolean z17 = zVar.f432879j > 0;
        v22.f fVar = zVar.f432881l;
        if (fVar != null) {
            fVar.f432810b.post(new v22.e(fVar, new v22.r(zVar, z17)));
        }
        d32.j jVar = zVar.f432878i;
        if (jVar != null) {
            jVar.f226158k.post(new d32.i(new d32.e(jVar)));
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("mixPixelBuffer");
        throw null;
    }
}
