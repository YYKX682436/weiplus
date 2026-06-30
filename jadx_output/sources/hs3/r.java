package hs3;

/* loaded from: classes4.dex */
public class r implements java.lang.Runnable {
    public r(hs3.s sVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        if (gm0.j1.a()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ks3.o0 o0Var = new ks3.p0().f311734a;
            if (o0Var.f311727d.size() > 0) {
                int i17 = 0;
                while (true) {
                    linkedList = o0Var.f311727d;
                    if (i17 >= linkedList.size()) {
                        break;
                    }
                    java.lang.String str = ((ks3.n0) linkedList.get(i17)).f311724d;
                    com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                    f9Var.u1("qqmail");
                    f9Var.e1(c01.w9.o("qqmail"));
                    f9Var.j1(0);
                    f9Var.d1(java.lang.String.format(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ihz), str));
                    f9Var.setType(1);
                    f9Var.r1(3);
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
                    i17++;
                }
                linkedList.clear();
                try {
                    gm0.j1.u().c().w(282625, android.util.Base64.encodeToString(o0Var.toByteArray(), 0));
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShareMailInfoMgr", e17, "", new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.w("MicroMsg.ShareMailInfoMgr", "save to config fail");
                }
            }
            com.tencent.mars.xlog.Log.i("SubCoreQQMail", "summeranrt onAccountPostReset notifyAllFail take[%d]ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }
}
