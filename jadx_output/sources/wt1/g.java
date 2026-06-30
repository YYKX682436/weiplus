package wt1;

/* loaded from: classes15.dex */
public class g implements com.tencent.mm.modelbase.u0 {

    /* renamed from: g, reason: collision with root package name */
    public int f449272g;

    /* renamed from: h, reason: collision with root package name */
    public int f449273h;

    /* renamed from: i, reason: collision with root package name */
    public int f449274i;

    /* renamed from: m, reason: collision with root package name */
    public int f449275m;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f449269d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f449270e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f449271f = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final int f449276n = 60;

    /* renamed from: o, reason: collision with root package name */
    public boolean f449277o = false;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f449278p = new com.tencent.mm.sdk.platformtools.b4(new wt1.d(this), false);

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f449279q = new com.tencent.mm.sdk.platformtools.b4(new wt1.e(this), false);

    public void a(java.lang.String str) {
        if (this.f449277o) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardCodeMgr", "doGetCardCodes(), is doing get codes");
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardCodeMgr", "doGetCardCodes(), mCardId is empty!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeMgr", "doGetCardCodes() do get codes, card id " + str);
        this.f449277o = true;
        this.f449270e = str;
        gm0.j1.n().f273288b.g(new xt1.j0(str));
    }

    public java.lang.String b() {
        java.util.LinkedList linkedList = this.f449271f;
        if (linkedList == null || linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardCodeMgr", "getCode, codes is empty");
            return "";
        }
        if (this.f449272g >= linkedList.size()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardCodeMgr", "getCode, all codes has show! ");
            a(this.f449270e);
            return "";
        }
        if (this.f449274i >= linkedList.size() - this.f449272g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeMgr", "do request code, because the request_count >= than (codes.size() - show_count)");
            a(this.f449270e);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeMgr", "getCode, show_count:" + this.f449272g + " request_count:" + this.f449274i + " codes size:" + linkedList.size());
        int i17 = this.f449272g;
        this.f449272g = i17 + 1;
        return (java.lang.String) linkedList.get(i17);
    }

    public boolean c() {
        java.util.LinkedList linkedList = this.f449271f;
        if (linkedList == null || linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardCodeMgr", "getCode, codes is empty");
            return true;
        }
        if (this.f449272g < linkedList.size()) {
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.CardCodeMgr", "getCode, all codes has show! ");
        return true;
    }

    public void d() {
        f();
        com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeMgr", "startRefreshCodeTimer() refresh_interval:" + this.f449275m);
        int i17 = this.f449275m;
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f449279q;
        if (i17 > 0) {
            long j17 = i17 * 1000;
            b4Var.c(j17, j17);
            com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeMgr", "start refresh code timer!");
        } else {
            long j18 = this.f449276n * 1000;
            b4Var.c(j18, j18);
            com.tencent.mars.xlog.Log.e("MicroMsg.CardCodeMgr", "not to start refresh code timer!");
        }
    }

    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeMgr", "stopRequestCodeTimer!");
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f449278p;
        if (!b4Var.e()) {
            b4Var.d();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeMgr", "startRequestCodeTimer() request_time:" + this.f449273h);
        if (this.f449273h <= 0 || android.text.TextUtils.isEmpty(this.f449270e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardCodeMgr", "not to start request code timer!");
            return;
        }
        long j17 = this.f449273h * 1000;
        b4Var.c(j17, j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeMgr", "start request code timer!");
    }

    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeMgr", "stopRefreshCodeTimer()!");
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f449279q;
        if (b4Var.e()) {
            return;
        }
        b4Var.d();
    }

    public void g(wt1.f fVar) {
        wt1.f fVar2;
        if (this.f449269d == null || fVar == null) {
            return;
        }
        for (int i17 = 0; i17 < this.f449269d.size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f449269d.get(i17);
            if (weakReference != null && (fVar2 = (wt1.f) weakReference.get()) != null && fVar2.equals(fVar)) {
                this.f449269d.remove(weakReference);
                return;
            }
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        wt1.f fVar;
        wt1.f fVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeMgr", "onSceneEnd, errType = " + i17 + " errCode = " + i18);
        int i19 = 0;
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof xt1.j0) {
                this.f449277o = false;
                com.tencent.mars.xlog.Log.e("MicroMsg.CardCodeMgr", "get codes failed  for card id " + this.f449270e);
                com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeMgr", "onFail()");
                if (this.f449269d == null) {
                    return;
                }
                while (i19 < ((java.util.ArrayList) this.f449269d).size()) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f449269d).get(i19);
                    if (weakReference != null && (fVar = (wt1.f) weakReference.get()) != null) {
                        fVar.onFail(i18, str);
                    }
                    i19++;
                }
                return;
            }
            return;
        }
        if (m1Var instanceof xt1.j0) {
            this.f449277o = false;
            com.tencent.mars.xlog.Log.e("MicroMsg.CardCodeMgr", "get codes success for card id " + this.f449270e);
            xt1.j0 j0Var = (xt1.j0) m1Var;
            this.f449273h = j0Var.f456504g;
            this.f449274i = j0Var.f456505h;
            this.f449275m = j0Var.f456506i;
            if (j0Var.f456503f != null) {
                java.util.LinkedList linkedList = this.f449271f;
                linkedList.clear();
                linkedList.addAll(j0Var.f456503f);
                this.f449272g = 0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeMgr", "onSuccess()");
            if (this.f449269d != null) {
                while (i19 < ((java.util.ArrayList) this.f449269d).size()) {
                    java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f449269d).get(i19);
                    if (weakReference2 != null && (fVar2 = (wt1.f) weakReference2.get()) != null) {
                        fVar2.onSuccess();
                    }
                    i19++;
                }
            }
            e();
            if (this.f449275m != 0) {
                d();
            }
        }
    }
}
