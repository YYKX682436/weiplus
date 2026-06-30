package yw3;

/* loaded from: classes11.dex */
public final class p6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw3.q6 f466851d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(yw3.q6 q6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466851d = q6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yw3.p6(this.f466851d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yw3.p6 p6Var = (yw3.p6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        p6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.LongSparseArray longSparseArray = m95.k.f325106c;
        kotlin.jvm.internal.o.f(longSparseArray, "getSVGResArray(...)");
        int size = longSparseArray.size();
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            longSparseArray.keyAt(i18);
            android.graphics.drawable.Drawable.ConstantState constantState = (android.graphics.drawable.Drawable.ConstantState) longSparseArray.valueAt(i18);
            if (constantState instanceof m95.i) {
                i17++;
                int i19 = ((m95.i) constantState).f325099a;
                java.lang.String resourceName = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getResourceName(i19);
                kotlin.jvm.internal.o.f(resourceName, "getResourceName(...)");
                java.lang.String substring = resourceName.substring(19);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                arrayList.add(new yw3.s6(java.lang.String.valueOf(i17), i17, i19, substring));
            }
        }
        kz5.g0.t(arrayList, yw3.o6.f466841d);
        j75.f Q6 = this.f466851d.Q6();
        if (Q6 != null) {
            Q6.B3(new yw3.r6(arrayList));
        }
        return jz5.f0.f302826a;
    }
}
