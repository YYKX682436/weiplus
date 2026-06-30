package ro5;

/* loaded from: classes14.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f398139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f398140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zo5.e f398141f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f398142g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f398143h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(ro5.m1 m1Var, int i17, zo5.e eVar, int i18, int i19) {
        super(2);
        this.f398139d = m1Var;
        this.f398140e = i17;
        this.f398141f = eVar;
        this.f398142g = i18;
        this.f398143h = i19;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool;
        so5.y yVar;
        so5.t[] tVarArr;
        boolean z17;
        java.lang.Object m521constructorimpl;
        int intValue = ((java.lang.Number) obj).intValue();
        ((java.lang.Number) obj2).longValue();
        ro5.m1 m1Var = this.f398139d;
        if (m1Var.f398249k) {
            return java.lang.Boolean.TRUE;
        }
        xo5.n nVar = m1Var.f398242d;
        dp5.d dVar = nVar.f455794e.f464365n;
        if (dVar != null) {
            zo5.e eVar = this.f398141f;
            int i17 = this.f398140e;
            bool = java.lang.Boolean.valueOf(ro5.m1.a(m1Var, i17, dVar, new ro5.z0(m1Var, intValue, eVar, i17)));
        } else {
            bool = null;
        }
        m1Var.f398247i.a("local_render", bool != null ? bool.booleanValue() : false);
        int i18 = 0;
        while (true) {
            yVar = m1Var.f398260v;
            int i19 = yVar.f410929p;
            tVarArr = yVar.f410930q;
            if (i18 >= i19) {
                break;
            }
            java.nio.ByteBuffer byteBuffer = yVar.f410934u;
            byteBuffer.clear();
            int b17 = yVar.f410924h.b(yVar.f410933t, byteBuffer, i18);
            if (b17 < 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ILinkVoIP.EncoderManager", "doQoSCheck: get params error " + b17);
                break;
            }
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                uo5.u a17 = uo5.u.f429740l.a(byteBuffer);
                if ((a17.f429753j & 128) != 0) {
                    byte b18 = a17.f429749f;
                    if (b18 == 4) {
                        yVar.f(true, i18, a17);
                    } else if (b18 == 8) {
                        yVar.f(false, i18, a17);
                    } else {
                        yVar.j(i18, a17);
                    }
                } else {
                    so5.t tVar = tVarArr[i18];
                    so5.q qVar = so5.q.f410906b;
                    if (!kotlin.jvm.internal.o.b(tVar, qVar)) {
                        yVar.i(i18);
                        tVarArr[i18] = qVar;
                    }
                }
                m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ILinkVoIP.EncoderManager", m524exceptionOrNullimpl, "handle result", new java.lang.Object[0]);
            }
            i18++;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(tVarArr.length);
        int length = tVarArr.length;
        int i27 = 0;
        int i28 = 0;
        while (i27 < length) {
            int i29 = i28 + 1;
            arrayList.add(java.lang.Integer.valueOf((tVarArr[i27].f410908a && yVar.f410931r[i28].f410888c) ? (i28 << 16) | com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : -1));
            i27++;
            i28 = i29;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((java.lang.Number) next).intValue() >= 0) {
                arrayList2.add(next);
            }
        }
        dp5.d dVar2 = nVar.f455794e.f464365n;
        if (dVar2 != null) {
            int i37 = this.f398142g;
            int i38 = this.f398143h;
            if (arrayList2.isEmpty()) {
                z17 = true;
            } else {
                java.util.ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                boolean z18 = true;
                while (listIterator.hasPrevious()) {
                    int intValue2 = ((java.lang.Number) listIterator.previous()).intValue();
                    z18 = ro5.m1.a(m1Var, intValue2, dVar2, new ro5.y0(m1Var, intValue, i37, i38, intValue2)) && z18;
                }
                z17 = z18;
            }
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
