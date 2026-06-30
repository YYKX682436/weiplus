package ku3;

/* loaded from: classes3.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.z1 f312441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bs0.f f312442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f312443f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(ku3.z1 z1Var, bs0.f fVar, float f17) {
        super(1);
        this.f312441d = z1Var;
        this.f312442e = fVar;
        this.f312443f = f17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordFrameShaderPlugin", "requestEffect effectBitmap:" + bitmap);
        ku3.z1 z1Var = this.f312441d;
        z1Var.c().setImageBitmap(bitmap);
        z1Var.c().setVisibility(0);
        zt3.a aVar = z1Var.f312494e;
        java.lang.Object obj2 = aVar.f475577e;
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type android.view.View");
        android.view.View view = (android.view.View) obj2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordFrameShaderPlugin$showFrameShader$1$1$1", "invoke", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordFrameShaderPlugin$showFrameShader$1$1$1", "invoke", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean O6 = aVar.O6(6);
        bs0.j jVar = aVar.f475577e;
        if (O6 || aVar.O6(5)) {
            java.lang.Object value = ((jz5.n) z1Var.f312496g).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            android.view.View view2 = (android.view.View) value;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordFrameShaderPlugin$showFrameShader$1$1$1", "invoke", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordFrameShaderPlugin$showFrameShader$1$1$1", "invoke", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            kotlin.jvm.internal.o.e(jVar, "null cannot be cast to non-null type com.tencent.mm.media.camera.view.ICameraAdvancedUsage");
            ((bs0.h) jVar).d();
        }
        bs0.f fVar = this.f312442e;
        jVar.setCameraViewRatio(fVar);
        kotlin.jvm.internal.o.e(jVar, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) jVar).requestLayout();
        ku3.z1.a(z1Var, fVar, this.f312443f);
        return jz5.f0.f302826a;
    }
}
