package ed2;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed2.i f251261d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ed2.i iVar) {
        super(0);
        this.f251261d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ed2.i iVar = this.f251261d;
        java.util.Iterator it = iVar.f251268d.entrySet().iterator();
        while (it.hasNext()) {
            ((ed2.c) ((ed2.d) ((java.util.Map.Entry) it.next()).getValue())).f251258b.dismiss();
        }
        iVar.f251268d.clear();
        return jz5.f0.f302826a;
    }
}
