package ku3;

/* loaded from: classes3.dex */
public final class t1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.z1 f312415d;

    public t1(ku3.z1 z1Var) {
        this.f312415d = z1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        zt3.c cVar = (zt3.c) obj;
        ku3.z1 z1Var = this.f312415d;
        if (z1Var.f312499m == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RecordFrameShaderPlugin", "location type is null to return");
            return;
        }
        android.os.Bundle bundle = cVar.f475589c;
        if (bundle != null) {
            int i17 = bundle.getInt("PARAM_1_INT");
            android.os.Bundle bundle2 = cVar.f475589c;
            if (bundle2 != null) {
                bundle2.getInt("PARAM_2_INT");
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordFrameShaderPlugin", "MENU_RATIO >> " + i17);
                kotlinx.coroutines.y0 y0Var = z1Var.f312498i;
                if (i17 == 1) {
                    kotlinx.coroutines.l.d(y0Var, null, null, new ku3.y1(z1Var, bs0.f.f23785f, ku3.z1.b(z1Var, i17), null), 3, null);
                } else if (i17 == 2) {
                    kotlinx.coroutines.l.d(y0Var, null, null, new ku3.y1(z1Var, bs0.f.f23784e, ku3.z1.b(z1Var, i17), null), 3, null);
                } else {
                    if (i17 != 3) {
                        return;
                    }
                    kotlinx.coroutines.l.d(y0Var, null, null, new ku3.y1(z1Var, bs0.f.f23783d, ku3.z1.b(z1Var, i17), null), 3, null);
                }
            }
        }
    }
}
