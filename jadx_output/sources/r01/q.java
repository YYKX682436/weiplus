package r01;

/* loaded from: classes11.dex */
public class q extends l75.n0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f368185f = {l75.n0.getCreateSQLs(r01.m.U, "BizEnterprise")};

    /* renamed from: g, reason: collision with root package name */
    public static r45.ud f368186g;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f368187d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.v0 f368188e;

    public q(l75.k0 k0Var) {
        super(k0Var, r01.m.U, "BizEnterprise", null);
        this.f368188e = new r01.n(this);
        this.f368187d = k0Var;
        k0Var.A("BizEnterprise", "CREATE INDEX IF NOT EXISTS BizEnterpriseUserNameIndex ON BizEnterprise ( userName )");
        gm0.j1.n().f273288b.a(1343, this);
        gm0.j1.n().f273288b.a(1228, this);
    }

    public int D0() {
        if (f368186g == null) {
            f368186g = new r45.ud();
        }
        try {
            return java.lang.Integer.parseInt(f368186g.f387254m);
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    public r01.m J0(java.lang.String str) {
        r01.m y07 = y0(str);
        if (y07 != null) {
            return y07;
        }
        r01.m mVar = new r01.m();
        mVar.field_userName = str;
        mVar.field_qyUin = 0;
        mVar.field_userUin = 0;
        mVar.field_userFlag = 0;
        mVar.field_wwExposeTimes = 0;
        mVar.field_wwMaxExposeTimes = 0;
        mVar.field_wwUserVid = 0L;
        mVar.field_wwCorpId = 0L;
        mVar.field_chatOpen = false;
        mVar.field_wwUnreadCnt = 0;
        return mVar;
    }

    public boolean L0(r45.hk hkVar) {
        int i17;
        r01.m J0 = J0(hkVar.f376221d);
        J0.field_userName = hkVar.f376221d;
        J0.field_qyUin = hkVar.f376222e;
        J0.field_userUin = hkVar.f376223f;
        J0.field_wwMaxExposeTimes = hkVar.f376225h;
        J0.field_wwUserVid = hkVar.f376226i;
        J0.field_wwCorpId = hkVar.f376227m;
        J0.field_userType = hkVar.f376228n;
        J0.field_chatOpen = hkVar.f376229o;
        J0.field_wwUnreadCnt = hkVar.f376230p;
        J0.field_show_confirm = hkVar.f376231q;
        J0.field_use_preset_banner_tips = hkVar.f376233s;
        r45.ry ryVar = hkVar.f376234t;
        if (ryVar != null) {
            J0.field_hide_create_chat = ryVar.f385280d;
            J0.field_hide_mod_chat_member = ryVar.f385281e;
        }
        J0.field_hide_colleage_invite = hkVar.f376236v;
        try {
            r45.ik ikVar = new r45.ik();
            ikVar.f377102d = hkVar.f376235u;
            ikVar.f377103e = hkVar.f376237w;
            ikVar.f377104f = hkVar.f376238x;
            ikVar.f377105g = hkVar.f376239y;
            J0.field_raw_attrs = ikVar.toByteArray();
        } catch (java.lang.Throwable unused) {
        }
        f368186g = hkVar.f376232r;
        if (hkVar.f376226i == 0 && hkVar.f376227m == 0 && (i17 = hkVar.f376222e) != 0) {
            J0.field_wwUserVid = hkVar.f376223f;
            J0.field_wwCorpId = i17;
        }
        int i18 = hkVar.f376224g & (-9);
        hkVar.f376224g = i18;
        J0.field_userFlag = (J0.field_userFlag & 8) | i18;
        return P0(J0);
    }

    public boolean P0(r01.m mVar) {
        if (mVar == null) {
            return false;
        }
        boolean insert = super.insert(mVar);
        if (!insert) {
            insert = super.replace(mVar);
        }
        if (insert) {
            r01.o oVar = new r01.o();
            oVar.f368168a = mVar.field_userName;
            l75.v0 v0Var = this.f368188e;
            v0Var.d(oVar);
            v0Var.c();
        }
        return insert;
    }

    public boolean W0(java.lang.String str) {
        r01.m y07 = y0(str);
        if (y07 != null) {
            int i17 = y07.field_userFlag;
            if ((i17 & 1) != 0 && (i17 & 16) != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean b1(java.lang.String str, com.tencent.mm.modelbase.u0 u0Var) {
        int i17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        if (r01.z.j(str)) {
            i17 = 1;
        } else {
            if (!r01.z.h(str)) {
                return false;
            }
            i17 = 2;
        }
        return gm0.j1.n().f273288b.h(new r01.i3(str, i17, u0Var), 0);
    }

    public boolean d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        r01.m mVar = new r01.m();
        mVar.field_userName = str;
        boolean delete = super.delete(mVar, "userName");
        if (delete) {
            r01.o oVar = new r01.o();
            oVar.f368168a = str;
            l75.v0 v0Var = this.f368188e;
            v0Var.d(oVar);
            v0Var.c();
        }
        return delete;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.gi5 gi5Var;
        r45.hk hkVar;
        com.tencent.mm.protobuf.f fVar;
        r45.gi5 gi5Var2;
        r45.hk hkVar2;
        com.tencent.mm.protobuf.f fVar2;
        if (i17 == 0 && i18 == 0) {
            r45.q16 q16Var = null;
            if (m1Var instanceof r01.i3) {
                r01.i3 i3Var = (r01.i3) m1Var;
                com.tencent.mm.modelbase.o oVar = i3Var.f368117e;
                r45.gb3 gb3Var = (oVar == null || (fVar2 = oVar.f70711b.f70700a) == null) ? null : (r45.gb3) fVar2;
                if (gb3Var == null || (gi5Var2 = gb3Var.f375070d) == null || gi5Var2.f375288d != 0 || (hkVar2 = gb3Var.f375071e) == null) {
                    return;
                }
                if (!L0(hkVar2)) {
                    i18 = -1;
                }
                com.tencent.mm.modelbase.u0 u0Var = (com.tencent.mm.modelbase.u0) i3Var.f368118f;
                if (u0Var != null) {
                    u0Var.onSceneEnd(i17, i18, str, m1Var);
                }
            }
            if (m1Var instanceof r01.o3) {
                r01.o3 o3Var = (r01.o3) m1Var;
                com.tencent.mm.modelbase.o oVar2 = o3Var.f368173e;
                if (oVar2 != null && (fVar = oVar2.f70711b.f70700a) != null) {
                    q16Var = (r45.q16) fVar;
                }
                if (q16Var == null || (gi5Var = q16Var.f383571d) == null || gi5Var.f375288d != 0 || (hkVar = q16Var.f383572e) == null) {
                    return;
                }
                int i19 = L0(hkVar) ? i18 : -1;
                com.tencent.mm.modelbase.u0 u0Var2 = (com.tencent.mm.modelbase.u0) o3Var.f368174f;
                if (u0Var2 != null) {
                    u0Var2.onSceneEnd(i17, i19, str, m1Var);
                }
            }
        }
    }

    public r01.m y0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        r01.m mVar = new r01.m();
        mVar.field_userName = str;
        if (super.get(mVar, new java.lang.String[0])) {
            return mVar;
        }
        b1(str, null);
        return null;
    }

    public java.lang.String z0(int i17) {
        if (f368186g == null) {
            f368186g = new r45.ud();
        }
        if (i17 == 0) {
            return f368186g.f387248d;
        }
        if (i17 == 1) {
            return f368186g.f387249e;
        }
        if (i17 != 2) {
            return null;
        }
        return f368186g.f387250f;
    }
}
