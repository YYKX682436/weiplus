package cw4;

/* loaded from: classes4.dex */
public final class v implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw4.x f224283a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cw4.a0 f224284b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f224285c;

    public v(cw4.x xVar, cw4.a0 a0Var, int i17) {
        this.f224283a = xVar;
        this.f224284b = a0Var;
        this.f224285c = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        cw4.x xVar = this.f224283a;
        java.util.LinkedList linkedList = xVar.f224294h;
        cw4.a0 a0Var = this.f224284b;
        linkedList.remove(a0Var);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebTransCgiLogic", "translate: onSceneEnd errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return;
        }
        java.util.HashSet hashSet = xVar.f224292f;
        int i19 = this.f224285c;
        if (!hashSet.contains(java.lang.Integer.valueOf(i19))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebTransCgiLogic", "translate: hashCode has been erased, lifecycle is end!");
            xVar.f224292f.remove(java.lang.Integer.valueOf(i19));
            return;
        }
        kotlin.jvm.internal.o.d(oVar);
        xVar.getClass();
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetTransTextResponse");
        r45.kp3 kp3Var = (r45.kp3) fVar;
        java.util.Iterator it = a0Var.f224193a.iterator();
        int i27 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i28 = i27 + 1;
            java.lang.String str2 = null;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            cw4.z zVar = (cw4.z) next;
            r45.dq6 dq6Var = (r45.dq6) kp3Var.f378891e.get(i27);
            zVar.f224308c = dq6Var != null ? dq6Var.f372669e : null;
            r45.dq6 dq6Var2 = (r45.dq6) kp3Var.f378891e.get(i27);
            if (dq6Var2 != null) {
                str2 = dq6Var2.f372671g;
            }
            zVar.f224309d = str2;
            i27 = i28;
        }
        xVar.a();
        pm0.v.X(new cw4.w(xVar, a0Var));
    }
}
