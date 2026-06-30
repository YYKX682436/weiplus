package oj4;

/* loaded from: classes11.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final oj4.j f345815a = new oj4.j();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f345816b = new oj4.h(android.os.Looper.getMainLooper());

    public final java.lang.String a(pj4.g2 g2Var) {
        kotlin.jvm.internal.o.g(g2Var, "<this>");
        return "[" + g2Var.hashCode() + "], rowId:" + g2Var.f355069n + " cdnSuccess:" + g2Var.f355070o + " cdnRetryNum:" + g2Var.f355067i + " cgiRetryNum:" + g2Var.f355068m + " id:" + g2Var.f355073r + " createTime:" + g2Var.f355062d.f354982q;
    }

    public final pj4.g2 b(int i17) {
        byte[] j17;
        pj4.f2 f2Var = new pj4.f2();
        com.tencent.mm.sdk.platformtools.o4 c17 = c();
        java.lang.Object obj = null;
        if (c17 == null || (j17 = c17.j("upload_cache_array")) == null) {
            return null;
        }
        f2Var.parseFrom(j17);
        java.util.LinkedList infoArray = f2Var.f355044d;
        kotlin.jvm.internal.o.f(infoArray, "infoArray");
        java.util.Iterator it = infoArray.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((pj4.g2) next).f355062d.f354982q == i17) {
                obj = next;
                break;
            }
        }
        return (pj4.g2) obj;
    }

    public final com.tencent.mm.sdk.platformtools.o4 c() {
        return com.tencent.mm.sdk.platformtools.o4.M("text_status_upload" + gm0.m.i());
    }

    public final void d(mj4.h hVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click to reCommit, ");
        sb6.append(hVar != null ? ((mj4.k) hVar).l() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadManager", sb6.toString());
        if (hVar == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new oj4.f(hVar));
    }

    public final void e(int i17) {
        byte[] j17;
        pj4.f2 f2Var = new pj4.f2();
        com.tencent.mm.sdk.platformtools.o4 c17 = c();
        if (c17 == null || (j17 = c17.j("upload_cache_array")) == null) {
            return;
        }
        f2Var.parseFrom(j17);
        java.util.LinkedList infoArray = f2Var.f355044d;
        kotlin.jvm.internal.o.f(infoArray, "infoArray");
        pm0.v.d0(infoArray, new oj4.g(i17));
        com.tencent.mm.sdk.platformtools.o4 c18 = c();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadManager", "removeUploadTask result:" + (c18 != null ? java.lang.Boolean.valueOf(c18.H("upload_cache_array", f2Var.toByteArray())) : null) + " createTime:" + i17);
    }

    public final void f(pj4.g2 g2Var) {
        android.os.Message message = new android.os.Message();
        message.obj = g2Var;
        f345816b.sendMessage(message);
    }

    public final void g(pj4.g2 postInfo) {
        kotlin.jvm.internal.o.g(postInfo, "postInfo");
        pj4.f2 f2Var = new pj4.f2();
        com.tencent.mm.sdk.platformtools.o4 c17 = c();
        byte[] j17 = c17 != null ? c17.j("upload_cache_array") : null;
        if (j17 != null) {
            f2Var.parseFrom(j17);
        }
        java.util.LinkedList infoArray = f2Var.f355044d;
        kotlin.jvm.internal.o.f(infoArray, "infoArray");
        pm0.v.d0(infoArray, new oj4.i(postInfo));
        infoArray.add(postInfo);
        com.tencent.mm.sdk.platformtools.o4 c18 = c();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadManager", "saveUploadTask size=" + infoArray.size() + ", result:" + (c18 != null ? java.lang.Boolean.valueOf(c18.H("upload_cache_array", f2Var.toByteArray())) : null) + " info:" + a(postInfo));
    }
}
