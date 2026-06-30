package jg0;

/* loaded from: classes12.dex */
public final class j extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jg0.x f299577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f299578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qi3.f0 f299579f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(jg0.x xVar, yz5.l lVar, qi3.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f299577d = xVar;
        this.f299578e = lVar;
        this.f299579f = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new jg0.j(this.f299577d, this.f299578e, this.f299579f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((jg0.j) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean Ui;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        oi3.i iVar = new oi3.i();
        jg0.x xVar = this.f299577d;
        xVar.f299638i.f41051d = iVar;
        int i17 = iVar.f345617d;
        iVar.set(i17 + 7, 1);
        cg0.d dVar = xVar.f299638i;
        int i18 = i17 + 3;
        iVar.set(i18, dVar.f41048a);
        iVar.set(i17 + 2, java.lang.Long.valueOf(c01.w9.o(dVar.f41048a)));
        iVar.set(i17 + 4, 34);
        iVar.set(i17 + 9, 1);
        pt0.e0 e0Var = pt0.f0.f358209b1;
        if (!e0Var.j()) {
            iVar.k(dVar.f41049b);
        }
        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
        java.lang.String str = dVar.f41048a;
        ((qv.o) u2Var).getClass();
        if (r01.z.g(str)) {
            ((qv.c) ((rv.l2) i95.n0.c(rv.l2.class))).getClass();
            java.lang.String i19 = s01.r.i();
            kotlin.jvm.internal.o.f(i19, "getMsgSource(...)");
            iVar.set(i17 + 12, i19);
        } else {
            java.lang.String f17 = c01.ia.f(null);
            kotlin.jvm.internal.o.f(f17, "getAndResetMsgSrcIn(...)");
            iVar.set(i17 + 12, f17);
        }
        z15.b bVar = new z15.b();
        bVar.u(dVar.f41055h);
        bVar.t(false);
        bVar.q(dVar.f41056i);
        bVar.r(c01.z1.r());
        dVar.f41052e = bVar;
        iVar.set(i17 + 13, bVar.toXml());
        int i27 = i17 + 0;
        iVar.set(i27, java.lang.Long.valueOf(e0Var.r(iVar)));
        this.f299578e.invoke(new com.tencent.mm.plugin.msg.MsgIdTalker(iVar.getLong(i27), iVar.getString(i18)));
        cv.h1 h1Var = (cv.h1) i95.n0.c(cv.h1.class);
        java.lang.String str2 = dVar.f41049b;
        ((bv.p0) h1Var).getClass();
        w21.w0 j17 = w21.x0.j(str2);
        long j18 = iVar.getLong(i27);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qi3.f0 f0Var2 = this.f299579f;
        if (j18 > 0) {
            java.util.Map map = f0Var2.f363701b;
            oi3.g gVar = dVar.f41051d;
            map.put("send_msg_local_id", new java.lang.Long(gVar != null ? gVar.getLong(gVar.f345617d + 0) : 0L));
            java.util.Map map2 = f0Var2.f363701b;
            oi3.g gVar2 = dVar.f41051d;
            map2.put("send_msg_create_time", new java.lang.Long(gVar2 != null ? gVar2.getLong(gVar2.f345617d + 2) : 0L));
            z15.b bVar2 = dVar.f41052e;
            map2.put("send_msg_file_size", bVar2 != null ? new java.lang.Integer(bVar2.getLength()) : new java.lang.Long(0L));
            if (j17 == null) {
                java.lang.String str3 = "newSendVoice_" + dVar.f41049b;
                w21.w0 w0Var = new w21.w0();
                w0Var.f442485b = dVar.f41049b;
                w0Var.f442486c = dVar.f41048a;
                long j19 = 1000;
                w0Var.f442493j = java.lang.System.currentTimeMillis() / j19;
                w0Var.f442487d = str3;
                w0Var.f442494k = java.lang.System.currentTimeMillis() / j19;
                w0Var.f442492i = 3;
                int e17 = w21.v0.e(iVar, dVar.f41049b);
                w0Var.f442491h = e17;
                if (e17 <= 0) {
                    f0Var2.f363700a = -520009;
                    return f0Var;
                }
                w0Var.f442495l = dVar.f41055h;
                w0Var.f442497n = c01.z1.r();
                w0Var.f442484a = -1;
                i27 = i27;
                w0Var.f442496m = iVar.getLong(i27);
                w0Var.f442507x = dVar.f41048a;
                ((bv.p0) ((cv.i1) i95.n0.c(cv.i1.class))).getClass();
                Ui = w21.p0.Di().L0(w0Var);
            } else {
                int i28 = j17.f442492i;
                if (i28 != 97 && i28 != 98) {
                    j17.f442492i = 3;
                }
                int e18 = w21.v0.e(iVar, dVar.f41049b);
                j17.f442491h = e18;
                if (e18 <= 0) {
                    f0Var2.f363700a = -520009;
                    return f0Var;
                }
                j17.f442494k = java.lang.System.currentTimeMillis() / 1000;
                j17.f442495l = dVar.f41055h;
                j17.f442484a = 4197728;
                j17.f442496m = iVar.getLong(i27);
                j17.f442507x = dVar.f41048a;
                Ui = ((bv.p0) ((cv.i1) i95.n0.c(cv.i1.class))).Ui(dVar.f41049b, j17);
            }
            if (!Ui) {
                f0Var2.f363700a = -520014;
                e0Var.b(iVar.getString(i18), iVar.getLong(i27));
                return f0Var;
            }
            oi3.g gVar3 = dVar.f41058k;
            if (gVar3 != null) {
                ui3.b bVar3 = new ui3.b();
                bVar3.field_msgId = iVar.getLong(i27);
                int i29 = gVar3.f345617d;
                int i37 = i29 + 0;
                bVar3.field_quotedMsgId = gVar3.getLong(i37);
                bVar3.field_quotedMsgSvrId = gVar3.getLong(i29 + 1);
                bVar3.field_quotedMsgTalker = gVar3.getString(i29 + 3);
                com.tencent.mars.xlog.Log.i("MicroMsg.VoiceMsg.VoiceMsgSendTask", "insert voice msg result:%s msgQuoteId:%s", java.lang.Boolean.valueOf(((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Di().insert(bVar3)), new java.lang.Long(gVar3.getLong(i37)));
            }
            jg0.x.f299637r.remove(dVar.f41049b);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceMsg.VoiceMsgSendTask", xVar.i() + " prepare msgInsertResult:" + iVar.getLong(i27));
            f0Var2.f363700a = -520001;
        }
        return f0Var;
    }
}
