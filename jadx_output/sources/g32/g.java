package g32;

/* loaded from: classes12.dex */
public class g implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g32.c0 f268157d;

    public g(g32.h hVar, g32.c0 c0Var) {
        this.f268157d = c0Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        boolean z18;
        if (m1Var.getType() != 1926) {
            return 0;
        }
        if (i17 == 0 && i18 == 0) {
            r45.ds3 ds3Var = (r45.ds3) oVar.f70711b.f70700a;
            z18 = true;
            z17 = ds3Var != null && ds3Var.f372711d;
        } else {
            z17 = false;
            z18 = false;
        }
        g32.c0 c0Var = this.f268157d;
        if (c0Var != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.qa) c0Var).a(z18, z17);
        }
        return 0;
    }
}
