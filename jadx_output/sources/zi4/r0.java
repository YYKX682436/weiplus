package zi4;

/* loaded from: classes9.dex */
public final class r0 extends zi4.h0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f473252h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        super(cmdId, weakReference, host, zi4.q0.f473250d);
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        kotlin.jvm.internal.o.g(host, "host");
        this.f473252h = "MicroMsg.FLTStatusGetContactInfoByHashHandler";
    }

    @Override // zi4.h0
    public void b(com.tencent.mm.protobuf.f fVar, zi4.r1 asyncResult) {
        java.util.LinkedList<java.lang.String> linkedList;
        bw5.eb ebVar = (bw5.eb) fVar;
        kotlin.jvm.internal.o.g(asyncResult, "asyncResult");
        com.tencent.mars.xlog.Log.i(this.f473252h, "handleAsyncRequest: " + java.lang.Thread.currentThread().getName());
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        n73.e eVar = (n73.e) i95.n0.c(n73.e.class);
        if (ebVar != null && (linkedList = ebVar.f26810d) != null) {
            for (java.lang.String str : linkedList) {
                com.tencent.mm.storage.z3 wi6 = eVar != null ? ((m73.q) eVar).wi(str, 1) : null;
                if (wi6 != null) {
                    bw5.vn0 vn0Var = new bw5.vn0();
                    vn0Var.f34415g = str;
                    boolean[] zArr = vn0Var.f34416h;
                    zArr[4] = true;
                    vn0Var.f34413e = wi6.P0();
                    zArr[2] = true;
                    vn0Var.f34412d = wi6.d1();
                    zArr[1] = true;
                    vn0Var.f34414f = wi6.g2();
                    zArr[3] = true;
                    linkedList2.add(vn0Var);
                }
            }
        }
        bw5.fb fbVar = new bw5.fb();
        fbVar.f27205d.addAll(linkedList2);
        asyncResult.a(fbVar, 0L, "");
    }
}
