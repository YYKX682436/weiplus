package zf4;

/* loaded from: classes13.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f472703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f472704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zf4.a0 f472705f;

    public x(zf4.a0 a0Var, com.tencent.mm.modelbase.m1 m1Var, int i17, int i18) {
        this.f472705f = a0Var;
        this.f472703d = m1Var;
        this.f472704e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.lang.String str;
        zf4.a0.f472635q++;
        com.tencent.mm.modelbase.m1 m1Var = this.f472703d;
        int type = m1Var.getType();
        zf4.a0 a0Var = this.f472705f;
        if (type == 128) {
            a0Var.f472639g = false;
            w21.k kVar = (w21.k) m1Var;
            i17 = kVar.f442407i;
            str = kVar.f442404f;
        } else {
            if (m1Var.getType() != 329) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoiceRemindService", "onSceneEnd Error SceneType:" + m1Var.getType());
                zf4.a0.f472635q = zf4.a0.f472635q + (-1);
                return;
            }
            a0Var.f472640h = false;
            zf4.g gVar = (zf4.g) m1Var;
            i17 = gVar.f472660h;
            str = gVar.f472658f;
        }
        if (str != null && ((java.util.HashMap) a0Var.f472638f).get(str) != null) {
            java.util.Map map = a0Var.f472638f;
            ((fp.j) ((java.util.HashMap) map).get(str)).a();
            ((java.util.HashMap) map).remove(str);
        }
        m1Var.getType();
        int i18 = this.f472704e;
        if (i18 == 3 && i17 != 0) {
            a0Var.f472642m--;
        } else if (i18 != 0) {
            a0Var.f472642m = 0;
        }
        int i19 = a0Var.f472642m;
        boolean z17 = a0Var.f472639g;
        boolean z18 = a0Var.f472640h;
        if (i19 > 0) {
            zf4.a0.a(a0Var);
        } else if (!z18 && !z17) {
            a0Var.b();
        }
        zf4.a0.f472635q--;
    }
}
