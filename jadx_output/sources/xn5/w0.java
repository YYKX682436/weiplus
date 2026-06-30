package xn5;

/* loaded from: classes13.dex */
public final class w0 extends com.tencent.mm.ui.component.UIComponent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        super.onCreateBefore(bundle);
        if (xn5.q0.f455702a.b().a() != null) {
            try {
                if (xn5.q1.f455715c == null) {
                    java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mContext");
                    xn5.q1.f455715c = declaredField;
                    if (declaredField != null) {
                        declaredField.setAccessible(true);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.X2C.X2CViewCreator", e17, "prepareReflect", new java.lang.Object[0]);
            }
            if (xn5.q1.f455715c != null) {
                ((ku5.t0) ku5.t0.f312615d).d(xn5.n1.f455697d, 0L, 300000L);
            }
        }
    }
}
