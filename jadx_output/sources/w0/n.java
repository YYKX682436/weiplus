package w0;

/* loaded from: classes14.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0.p f441848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f441849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w0.l f441850f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w0.p pVar, java.lang.Object obj, w0.l lVar) {
        super(1);
        this.f441848d = pVar;
        this.f441849e = obj;
        this.f441850f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        w0.p pVar = this.f441848d;
        java.util.Map map = pVar.f441857b;
        java.lang.Object obj2 = this.f441849e;
        if (!(!map.containsKey(obj2))) {
            throw new java.lang.IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
        }
        pVar.f441856a.remove(obj2);
        java.util.Map map2 = pVar.f441857b;
        w0.l lVar = this.f441850f;
        map2.put(obj2, lVar);
        return new w0.m(lVar, pVar, obj2);
    }
}
