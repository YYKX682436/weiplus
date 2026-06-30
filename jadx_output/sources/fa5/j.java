package fa5;

@j95.b
/* loaded from: classes7.dex */
public final class j extends i95.w implements com.tencent.mm.udr.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f260817d = jz5.h.b(fa5.i.f260816d);

    public final com.tencent.mm.vfs.r6 Ai(com.tencent.wechat.aff.udr.x xVar) {
        com.tencent.mm.vfs.r6 r6Var;
        java.lang.String c17 = xVar.c();
        if (c17 == null) {
            r6Var = new com.tencent.mm.vfs.r6(xVar.getPath());
        } else {
            if (com.tencent.mm.vfs.w6.j(c17)) {
                return new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(c17));
            }
            r6Var = new com.tencent.mm.vfs.r6(xVar.getPath());
        }
        return r6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Bi(java.lang.String r10, java.lang.String r11, boolean r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fa5.j.Bi(java.lang.String, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void Di(java.lang.String projectName, java.lang.String name, boolean z17, yz5.l callback) {
        kotlin.jvm.internal.o.g(projectName, "projectName");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(callback, "callback");
        v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f260817d).getValue(), null, new fa5.f(callback, this, projectName, name, z17, null), 1, null);
    }

    public java.lang.Object wi(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        ea5.l wi6 = ((com.tencent.mm.udr.e1) ((com.tencent.mm.udr.c0) i95.n0.c(com.tencent.mm.udr.c0.class))).wi(str);
        if (wi6 == null) {
            return java.lang.Boolean.FALSE;
        }
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
        qVar.c(str);
        java.util.LinkedList linkedList = qVar.f217548e;
        if (linkedList != null) {
            linkedList.add(str2);
        }
        java.util.LinkedList linkedList2 = qVar.f217549f;
        if (linkedList2 != null) {
            java.util.RandomAccess parameter = wi6.getParameter();
            if (parameter == null) {
                parameter = kz5.p0.f313996d;
            }
            linkedList2.addAll(parameter);
        }
        com.tencent.mm.udr.e0 e0Var = (com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.UdrBasisService", "check! CheckParameterModel = " + qVar + ' ');
        ((com.tencent.mm.udr.a1) e0Var).Di(qVar, new fa5.e(nVar));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }
}
