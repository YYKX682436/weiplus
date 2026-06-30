package nc5;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc5.o f336195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(nc5.o oVar) {
        super(1);
        this.f336195d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList it = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it6 = it.iterator();
        while (it6.hasNext()) {
            sb6.append((java.lang.String) ((android.util.Pair) it6.next()).first);
            sb6.append("#");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryQueryHeaderUI", "report sugText: " + ((java.lang.Object) sb6));
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        this.f336195d.c(sb7);
        return jz5.f0.f302826a;
    }
}
