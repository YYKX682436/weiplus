package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class x2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.t2 f203149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f203150e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f203151f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(com.tencent.mm.ui.chatting.view.t2 t2Var, java.util.List list, int i17) {
        super(2);
        this.f203149d = t2Var;
        this.f203150e = list;
        this.f203151f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        android.graphics.Matrix matrix = (android.graphics.Matrix) obj2;
        kotlin.jvm.internal.o.g(matrix, "matrix");
        com.tencent.mm.ui.chatting.view.t2 t2Var = this.f203149d;
        jz5.l lVar = t2Var.f203096c;
        int intValue = ((java.lang.Number) lVar.f302833d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f302834e).intValue();
        jz5.l lVar2 = t2Var.f203098e;
        float intValue3 = ((((java.lang.Number) lVar2.f302833d).intValue() - intValue) * floatValue) + intValue;
        float intValue4 = ((((java.lang.Number) lVar2.f302834e).intValue() - intValue2) * floatValue) + intValue2;
        float f17 = t2Var.f203101h;
        float f18 = t2Var.f203100g;
        ((com.tencent.mm.ui.chatting.view.v2) this.f203150e.get(this.f203151f)).a(matrix, (int) intValue3, (int) intValue4, ((f17 - f18) * floatValue) + f18);
        return jz5.f0.f302826a;
    }
}
