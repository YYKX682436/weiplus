package xh0;

/* loaded from: classes4.dex */
public class a extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f454467f = {l75.n0.getCreateSQLs(dm.ja.f237884s, "SignedAgreementInfo")};

    /* renamed from: g, reason: collision with root package name */
    public static volatile xh0.a f454468g = null;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f454469d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f454470e;

    public a(l75.k0 k0Var) {
        super(k0Var, dm.ja.f237884s, "SignedAgreementInfo", f454467f);
        this.f454470e = new java.util.HashMap(8);
        this.f454469d = k0Var;
    }

    public static xh0.a z0() {
        if (f454468g == null) {
            synchronized (xh0.a.class) {
                if (f454468g == null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put(248253436, new xh0.a$$a());
                    gm0.b0 u17 = gm0.j1.u();
                    u17.b(u17.f273153f, hashMap, false);
                    f454468g = new xh0.a(u17.f273153f);
                }
            }
        }
        return f454468g;
    }

    public java.util.List D0(java.lang.String str) {
        synchronized (this.f454470e) {
            java.util.List list = (java.util.List) ((java.util.HashMap) this.f454470e).get(str);
            if (list != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SignedAgreementInfoStorage", "[+] get signed yuanbao agreement infos from cache, self_username: %s, value: %s", str, list);
                return list;
            }
            p75.i0 i17 = dm.ja.f237876h.i();
            i17.f352657d = dm.ja.f237877i.j(str);
            java.util.ArrayList arrayList = (java.util.ArrayList) i17.a().k(this.f454469d, dm.ja.class);
            if (arrayList.isEmpty()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SignedAgreementInfoStorage", "[-] query db gets no yuanbao agreement infos. self_username: %s", str);
                return java.util.Collections.emptyList();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dm.ja jaVar = (dm.ja) it.next();
                r45.q6 q6Var = new r45.q6();
                q6Var.f383699d = jaVar.field_id;
                q6Var.f383700e = jaVar.field_signedVersion;
                arrayList2.add(q6Var);
            }
            ((java.util.HashMap) this.f454470e).put(str, arrayList2);
            com.tencent.mars.xlog.Log.i("MicroMsg.SignedAgreementInfoStorage", "[+] get signed yuanbao agreement infos from db, self_username: %s, value: %s", str, arrayList2);
            return arrayList2;
        }
    }

    public void J0(java.lang.String str, java.util.List list) {
        boolean insert;
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SignedAgreementInfoStorage", "[+] try to store null or empty infos, skip rest logic. self_username: %s", str);
            return;
        }
        synchronized (this.f454470e) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            java.util.List<r45.q6> list2 = (java.util.List) ((java.util.HashMap) this.f454470e).get(str);
            if (list2 != null) {
                for (r45.q6 q6Var : list2) {
                    treeMap.put(java.lang.Integer.valueOf(q6Var.f383699d), q6Var);
                }
            }
            long j17 = -4;
            try {
                j17 = this.f454469d.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                for (int i17 = 0; i17 < list.size(); i17++) {
                    r45.q6 q6Var2 = (r45.q6) list.get(i17);
                    dm.ja jaVar = new dm.ja();
                    jaVar.field_key = str + "_" + q6Var2.f383699d;
                    jaVar.field_selfUsername = str;
                    jaVar.field_id = q6Var2.f383699d;
                    if (super.get(jaVar, "key")) {
                        int i18 = q6Var2.f383700e;
                        int i19 = jaVar.field_signedVersion;
                        if (i18 >= i19) {
                            jaVar.field_signedVersion = i18;
                            insert = super.update(jaVar, new java.lang.String[0]);
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.SignedAgreementInfoStorage", "[!] cannot update signed version to lower one. old_ver: %s, new_ver: %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(q6Var2.f383700e));
                            insert = false;
                        }
                    } else {
                        jaVar.field_signedVersion = q6Var2.f383700e;
                        insert = super.insert(jaVar);
                    }
                    if (insert) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SignedAgreementInfoStorage", "[+] store agreement %s successfully, update cache now. self_username: %s", java.lang.Integer.valueOf(q6Var2.f383699d), str);
                        treeMap.put(java.lang.Integer.valueOf(q6Var2.f383699d), q6Var2);
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SignedAgreementInfoStorage", "[-] store agreement %s failed. self_username: %s", java.lang.Integer.valueOf(q6Var2.f383699d), str);
                    }
                }
                this.f454469d.w(java.lang.Long.valueOf(j17));
                ((java.util.HashMap) this.f454470e).put(str, new java.util.ArrayList(treeMap.values()));
            } catch (java.lang.Throwable th6) {
                this.f454469d.w(java.lang.Long.valueOf(j17));
                throw th6;
            }
        }
    }

    public void y0(java.lang.String str) {
        dm.ja jaVar = new dm.ja();
        jaVar.field_selfUsername = str;
        if (!super.delete(jaVar, "selfUsername")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SignedAgreementInfoStorage", "[-] fail to clear signed agreement infos. self_username: %s", str);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SignedAgreementInfoStorage", "[+] clear signed agreement infos successfully. self_username: %s", str);
            ((java.util.HashMap) this.f454470e).remove(str);
        }
    }
}
