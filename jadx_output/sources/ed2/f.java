package ed2;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed2.i f251262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ed2.a f251263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ed2.d f251264f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ed2.i iVar, ed2.a aVar, ed2.d dVar) {
        super(0);
        this.f251262d = iVar;
        this.f251263e = aVar;
        this.f251264f = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ed2.i iVar = this.f251262d;
        java.util.HashMap hashMap = iVar.f251268d;
        ed2.a aVar = this.f251263e;
        ed2.d dVar = (ed2.d) hashMap.remove(aVar);
        if (dVar != null) {
            ((ed2.c) dVar).f251258b.dismiss();
        }
        java.util.HashMap hashMap2 = iVar.f251268d;
        ed2.d dVar2 = this.f251264f;
        hashMap2.put(aVar, dVar2);
        dVar2.getClass();
        return jz5.f0.f302826a;
    }
}
