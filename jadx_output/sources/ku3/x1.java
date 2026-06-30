package ku3;

/* loaded from: classes3.dex */
public final class x1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.z1 f312454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bs0.f f312455e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f312456f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(ku3.z1 z1Var, bs0.f fVar, float f17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312454d = z1Var;
        this.f312455e = fVar;
        this.f312456f = f17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ku3.x1(this.f312454d, this.f312455e, this.f312456f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ku3.x1 x1Var = (ku3.x1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ku3.z1 z1Var = this.f312454d;
        z1Var.c().setVisibility(0);
        zt3.a aVar2 = z1Var.f312494e;
        java.lang.Object obj2 = aVar2.f475577e;
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type android.view.View");
        android.view.View view = (android.view.View) obj2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordFrameShaderPlugin$showFrameShader$1$2$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordFrameShaderPlugin$showFrameShader$1$2$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (aVar2.O6(6) || aVar2.O6(5)) {
            java.lang.Object value = ((jz5.n) z1Var.f312496g).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            android.view.View view2 = (android.view.View) value;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordFrameShaderPlugin$showFrameShader$1$2$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordFrameShaderPlugin$showFrameShader$1$2$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            bs0.j jVar = aVar2.f475577e;
            kotlin.jvm.internal.o.e(jVar, "null cannot be cast to non-null type com.tencent.mm.media.camera.view.ICameraAdvancedUsage");
            ((bs0.h) jVar).d();
        }
        bs0.j jVar2 = aVar2.f475577e;
        bs0.f fVar = this.f312455e;
        jVar2.setCameraViewRatio(fVar);
        java.lang.Object obj3 = aVar2.f475577e;
        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) obj3).requestLayout();
        ku3.z1.a(z1Var, fVar, this.f312456f);
        return jz5.f0.f302826a;
    }
}
