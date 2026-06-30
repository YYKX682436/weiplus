package v73;

/* loaded from: classes.dex */
public class s1 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    public s1(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.id.h5d).view(com.tencent.mm.R.id.h5a).desc(new v73.q1(this)).type(com.tencent.mm.accessibility.type.ViewType.Button);
        focusFirst(com.tencent.mm.R.id.h59);
        ku5.u0 u0Var = ku5.t0.f312615d;
        v73.r1 r1Var = new v73.r1(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(r1Var, 300L, false);
    }
}
