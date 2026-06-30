package oj4;

/* loaded from: classes11.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj4.h f345812d;

    public f(mj4.h hVar) {
        this.f345812d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        oj4.j jVar = oj4.j.f345815a;
        mj4.h hVar = this.f345812d;
        pj4.g2 b17 = jVar.b(((mj4.k) hVar).f327067b.field_CreateTime);
        if (b17 != null) {
            if (hVar != null) {
                mj4.a aVar = ((mj4.k) hVar).f327067b;
                if (aVar.field_CreateTime > b17.f355062d.f354982q) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.UploadManager", "reCommit, last item is new.(cur:" + aVar.field_CreateTime + ", new:" + b17.f355062d.f354982q + ')');
                    java.lang.String str = b17.f355072q;
                    if (str != null) {
                        ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Bi(8, "StatusTextPost_".concat(str), pj4.h2.class, new qj4.o(str, 6L, "", ""));
                        f0Var = jz5.f0.f302826a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.tsReport", "postReport: cliPostID is null");
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadManager", "clearUploadTask: ");
                    return;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadManager", "reCommit last post");
            if (!b17.f355070o) {
                b17.f355067i = 0;
            }
            b17.f355068m = 0;
            b17.f355071p = "";
            jVar.e(b17.f355062d.f354982q);
            pj4.b0 b0Var = b17.f355062d;
            int i17 = b0Var.f354982q;
            b0Var.f354982q = c01.id.e();
            si4.a G = ai4.m0.f5173a.G();
            mj4.h i18 = G.i(bk4.k1.a(), i17);
            if (i18 != null) {
                mj4.j jVar2 = new mj4.j((mj4.k) i18);
                jVar2.f(3);
                jVar2.f327066b.put("field_CreateTime", java.lang.Integer.valueOf(b17.f355062d.f354982q));
                mj4.h a17 = jVar2.a();
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadManager", "reCommitByUser: update item STATE_SENDING, CreateTime Old=" + i17 + ", New=" + ((mj4.k) a17).f327067b.field_CreateTime);
                G.s(a17);
            }
            jVar.g(b17);
            jVar.f(b17);
        }
    }
}
