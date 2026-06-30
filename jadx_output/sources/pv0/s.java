package pv0;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv0.y f358550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f358551e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(pv0.y yVar, java.lang.String str) {
        super(1);
        this.f358550d = yVar;
        this.f358551e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.material.MJMaterialInfo mJMaterialInfo;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        pv0.y yVar = this.f358550d;
        dw0.c k76 = yVar.k7();
        boolean z17 = true;
        if (!kotlin.jvm.internal.o.b(this.f358551e, (k76 == null || (mJMaterialInfo = k76.f244086a) == null) ? null : dw0.f.a(mJMaterialInfo))) {
            boolean q76 = yVar.q7(pv0.p.f358542d);
            if (!yVar.m7()) {
                z17 = q76;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
