package wo4;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.l f448267d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(wo4.l lVar) {
        super(2);
        this.f448267d = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        ((java.lang.Number) obj2).longValue();
        yz5.p pVar = this.f448267d.f448273b;
        if (pVar != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(longValue);
            wo4.l lVar = this.f448267d;
            int i17 = lVar.f448276e;
            lVar.f448276e = i17 + 1;
            pVar.invoke(valueOf, java.lang.Integer.valueOf(i17));
        }
        wo4.l lVar2 = this.f448267d;
        vo4.i.a(lVar2.f448275d, (android.graphics.Bitmap) ((wo4.j) lVar2.f448281j).invoke(java.lang.Long.valueOf(longValue)), this.f448267d.f448280i, null, 4, null);
        return jz5.f0.f302826a;
    }
}
