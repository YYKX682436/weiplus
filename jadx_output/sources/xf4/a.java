package xf4;

/* loaded from: classes4.dex */
public class a implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xf4.b f454327d;

    public a(xf4.b bVar) {
        this.f454327d = bVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        r45.xw6 xw6Var;
        r45.cu5 cu5Var;
        r45.cu5 cu5Var2;
        xf4.b bVar = this.f454327d;
        int i17 = bVar.f454330f;
        if (i17 < 0) {
            return false;
        }
        r45.zq3 zq3Var = (r45.zq3) bVar.f454329e.f70711b.f70700a;
        try {
            xw6Var = (r45.xw6) zq3Var.f392305f.get(i17);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetVUserInfo", "get item :" + bVar.f454330f + " not Found");
            xw6Var = null;
        }
        if (xw6Var != null && (cu5Var = xw6Var.f390566g) != null && cu5Var.f371841f != null && (cu5Var2 = xw6Var.f390565f) != null && cu5Var2.f371841f != null) {
            int i18 = zq3Var.f392303d;
            int i19 = bVar.f454330f;
            java.lang.Integer.toHexString(xw6Var.f390563d);
            int i27 = xw6Var.f390565f.f371839d;
            r45.cu5 cu5Var3 = xw6Var.f390566g;
            int i28 = cu5Var3.f371839d;
            xf4.b.H(bVar, xw6Var.f390563d, true, cu5Var3.f371841f.g());
            xf4.b.H(bVar, xw6Var.f390563d, false, xw6Var.f390565f.f371841f.g());
        }
        bVar.f454330f--;
        return true;
    }
}
