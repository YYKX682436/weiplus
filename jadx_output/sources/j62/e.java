package j62;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    public static j62.e f297896d;

    /* renamed from: e, reason: collision with root package name */
    public static final kk.j f297897e = new kk.l(50);

    /* renamed from: a, reason: collision with root package name */
    public final kk.j f297898a = new kk.l(50);

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f297899b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f297900c = -1;

    public static j62.e g() {
        if (f297896d == null) {
            f297896d = new j62.e();
        }
        return f297896d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x002a, code lost:
    
        if (r1.y0() == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r15, java.lang.String r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j62.e.a(java.lang.String, java.lang.String, boolean, boolean):java.lang.String");
    }

    public boolean b(java.lang.String str, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pointers.PInt pInt2) {
        j62.c e17;
        if (pInt == null || pInt2 == null) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.o4 h17 = h();
        int i17 = h17 != null ? h17.getInt(str, -1) : -1;
        if (i17 <= 0 || (e17 = e(i17)) == null) {
            return false;
        }
        pInt.value = e17.field_exptId;
        pInt2.value = e17.field_groupId;
        return true;
    }

    public int c(q55.e eVar) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        bm5.o1 o1Var = bm5.o1.f22719a;
        return o1Var.m(eVar) == 0 ? i(eVar.k(), o1Var.h(eVar), true, false) : o1Var.h(eVar);
    }

    public int d(q55.e eVar, boolean z17, boolean z18) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        bm5.o1 o1Var = bm5.o1.f22719a;
        return o1Var.m(eVar) == 0 ? i(eVar.k(), o1Var.h(eVar), z17, z18) : o1Var.h(eVar);
    }

    public final j62.c e(int i17) {
        com.tencent.mm.sdk.platformtools.o4 h17;
        if (i17 <= 0 || (h17 = h()) == null) {
            return null;
        }
        java.lang.String string = h17.getString(i17 + "", "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            return null;
        }
        java.lang.Object obj = this.f297898a;
        j62.c cVar = (j62.c) ((com.tencent.mm.sdk.platformtools.r2) obj).get(java.lang.Integer.valueOf(i17));
        if (cVar != null) {
            if (com.tencent.mm.sdk.platformtools.t8.D0(string, cVar.field_exptContent)) {
                return cVar;
            }
            ((com.tencent.mm.sdk.platformtools.r2) obj).remove(java.lang.Integer.valueOf(i17));
        }
        j62.c cVar2 = new j62.c();
        if (!cVar2.t0(string)) {
            return null;
        }
        ((com.tencent.mm.sdk.platformtools.r2) obj).put(java.lang.Integer.valueOf(i17), cVar2);
        return cVar2;
    }

    public java.lang.String f(q55.e eVar) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        bm5.o1 o1Var = bm5.o1.f22719a;
        return o1Var.m(eVar) == 0 ? a(eVar.k(), o1Var.l(eVar), true, false) : o1Var.l(eVar);
    }

    public com.tencent.mm.sdk.platformtools.o4 h() {
        int n17 = n();
        if (n17 == 0) {
            return null;
        }
        java.lang.String str = n17 + "_WxExptmmkv";
        if (!com.tencent.mm.sdk.platformtools.t8.D0(this.f297899b, str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExptManager", "%s get mmkv change uin old[%s] new[%s]", hashCode() + "", this.f297899b, str);
            this.f297899b = str;
        }
        return com.tencent.mm.sdk.platformtools.o4.M(this.f297899b);
    }

    public int i(java.lang.String str, int i17, boolean z17, boolean z18) {
        java.lang.String a17 = a(str, "", z17, z18);
        return com.tencent.mm.sdk.platformtools.t8.K0(a17) ? i17 : com.tencent.mm.sdk.platformtools.t8.P(a17, i17);
    }

    public java.lang.String j(java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        return a(str, str2, z17, z18);
    }

    public boolean k(java.lang.String str, boolean z17) {
        return l(str, z17, true, true);
    }

    public boolean l(java.lang.String str, boolean z17, boolean z18, boolean z19) {
        java.lang.String a17 = a(str, "", z18, z19);
        return com.tencent.mm.sdk.platformtools.t8.K0(a17) ? z17 : com.tencent.mm.sdk.platformtools.t8.P(a17, z17 ? 1 : 0) != 0;
    }

    public int m() {
        if (this.f297900c == -1) {
            this.f297900c = com.tencent.mm.sdk.platformtools.o4.L().getInt("expt_debug_hit_exptid", 0);
        }
        return this.f297900c;
    }

    public int n() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("WxExptConfig");
        int i17 = M != null ? M.getInt("expt_uin", 0) : 0;
        return i17 != 0 ? i17 : java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 4).getInt("default_uin", 0)).intValue();
    }

    public void o(long j17, long j18, java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a() && m() > 0 && j17 == m()) {
            ((ku5.t0) ku5.t0.f312615d).B(new j62.d(this, j18, str, str2));
        }
    }
}
