package v73;

/* loaded from: classes.dex */
public class k0 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    public k0(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.id.h3u).view(com.tencent.mm.R.id.h3o).desc(com.tencent.mm.R.string.fww).type(com.tencent.mm.accessibility.type.ViewType.Button);
        root(com.tencent.mm.R.id.h3u).view(com.tencent.mm.R.id.h3v).talkOn(new v73.i0(this));
        root(com.tencent.mm.R.id.h3u).view(com.tencent.mm.R.id.f487682pf5).disable();
        ku5.u0 u0Var = ku5.t0.f312615d;
        v73.j0 j0Var = new v73.j0(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(j0Var, 300L, false);
    }
}
