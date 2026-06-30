package t21;

@j95.b
/* loaded from: classes4.dex */
public class i2 extends i95.w implements wf0.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f414794d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f414795e = new java.util.HashMap();

    public static t21.i2 wi() {
        return (t21.i2) i95.n0.c(t21.i2.class);
    }

    public int Ai(wf0.l1 l1Var) {
        boolean z17;
        t21.h2 h2Var;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(l1Var.f445518a)) {
            if (l1Var.f445519b != bm5.f0.f22561f) {
                z17 = true;
                if (z17 || (h2Var = (t21.h2) this.f414794d.get(l1Var)) == null) {
                    return 0;
                }
                return h2Var.f414786h;
            }
        }
        z17 = false;
        if (z17) {
            return 0;
        }
        return h2Var.f414786h;
    }

    public void Bi(int i17, dn.h hVar, int i18) {
        if (hVar == null) {
            return;
        }
        java.lang.String str = hVar.field_fileUrl;
        java.lang.String str2 = i17 + "";
        java.util.HashMap hashMap = this.f414795e;
        t21.h2 h2Var = (t21.h2) hashMap.get(str2);
        if (h2Var == null) {
            h2Var = new t21.h2(this);
        }
        h2Var.f414782d = "";
        h2Var.f414781c = "";
        h2Var.f414779a = "";
        h2Var.f414786h = i18;
        h2Var.f414785g = 1;
        h2Var.f414784f = hVar;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        h2Var.f414787i = java.lang.System.currentTimeMillis();
        hashMap.put(str2, h2Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreMediaRpt", "note sns video sendScene %d snsKey[%s] url[%s]", java.lang.Integer.valueOf(i18), str2, str);
    }

    public void Di(java.lang.String str, java.lang.String str2, wf0.l1 l1Var, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, int i18) {
        java.util.HashMap hashMap = this.f414794d;
        t21.h2 h2Var = (t21.h2) hashMap.get(l1Var);
        if (h2Var == null) {
            h2Var = new t21.h2(this);
        }
        h2Var.f414779a = str;
        h2Var.f414780b = str2;
        h2Var.f414781c = str3;
        h2Var.f414782d = str4;
        h2Var.f414783e = str5;
        int i19 = h2Var.f414786h;
        if (i19 == 0) {
            i19 = i17;
        }
        h2Var.f414786h = i19;
        h2Var.f414785g = i18;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        h2Var.f414787i = java.lang.System.currentTimeMillis();
        hashMap.put(l1Var, h2Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreMediaRpt", "note video upload path[%s, %s] toUser %s msgSource %s snsInfoId %s sendScene %d cpStatus %d", str, l1Var, str3, str4, str5, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public void Ni(int i17, java.lang.String str, java.lang.String str2, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        t21.h2 h2Var = (t21.h2) this.f414794d.get(i17 + "");
        if (h2Var != null) {
            h2Var.f414783e = j17 + "";
            h2Var.f414780b = str2;
            gm0.j1.e().j(new t21.f2(this, h2Var, h2Var.f414784f, j17, ""));
        }
    }

    public void Ri(dn.h hVar, wf0.l1 l1Var, java.lang.String str, long j17) {
        boolean z17;
        t21.h2 h2Var;
        if (hVar != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(l1Var.f445518a)) {
                if (l1Var.f445519b != bm5.f0.f22561f) {
                    z17 = true;
                    if (z17 || (h2Var = (t21.h2) this.f414794d.remove(l1Var)) == null) {
                        return;
                    }
                    gm0.j1.e().j(new t21.f2(this, h2Var, hVar, j17, str));
                }
            }
            z17 = false;
            if (z17) {
                return;
            }
            gm0.j1.e().j(new t21.f2(this, h2Var, hVar, j17, str));
        }
    }
}
