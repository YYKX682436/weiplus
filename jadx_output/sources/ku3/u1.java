package ku3;

/* loaded from: classes3.dex */
public final class u1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.z1 f312422d;

    public u1(ku3.z1 z1Var) {
        this.f312422d = z1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        int i17 = ((zt3.b) obj).f475585a;
        ku3.z1 z1Var = this.f312422d;
        if (i17 == 1) {
            z1Var.f312494e.S6(7, new ku3.t1(z1Var));
            return;
        }
        if (i17 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordFrameShaderPlugin", "EVENT_CAMERA_FIRST_FRAME");
            z1Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordFrameShaderPlugin", "goto hide shader");
            if (z1Var.c().getVisibility() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordFrameShaderPlugin", "go to hide shade");
                z1Var.c().setVisibility(4);
                java.lang.Object value = ((jz5.n) z1Var.f312497h).getValue();
                kotlin.jvm.internal.o.f(value, "getValue(...)");
                android.view.View view = (android.view.View) value;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordFrameShaderPlugin", "hideShader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordFrameShaderPlugin", "hideShader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
