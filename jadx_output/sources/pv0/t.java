package pv0;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv0.y f358552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f358553e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(pv0.y yVar, java.lang.String str) {
        super(1);
        this.f358552d = yVar;
        this.f358553e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.material.MJMaterialInfo mJMaterialInfo;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        pv0.y yVar = this.f358552d;
        dw0.c k76 = yVar.k7();
        if (!kotlin.jvm.internal.o.b(this.f358553e, (k76 == null || (mJMaterialInfo = k76.f244086a) == null) ? null : dw0.f.a(mJMaterialInfo))) {
            pv0.m mVar = (pv0.m) yVar.f69240i;
            if (mVar != null && mVar.N) {
                yVar.q7(pv0.q.f358543d);
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
