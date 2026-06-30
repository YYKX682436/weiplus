package dz4;

/* loaded from: classes12.dex */
public final class j2 extends dz4.d2 {
    @Override // dz4.z1
    public void b(dz4.g2 context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.app.Activity activity = context.f245254a;
        android.app.Dialog e17 = e(activity);
        dz4.i iVar = context.f245256c;
        dz4.f fVar = iVar instanceof dz4.f ? (dz4.f) iVar : null;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeNoteFlutterForwardChatHelper", "handleForwardResultFromC2CNote: reqData null");
            return;
        }
        java.lang.String str = context.f245257d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeNoteFlutterForwardChatHelper", "handleForwardResultFromC2CNote want to send record msg, but toUser is null");
            return;
        }
        long j17 = -1;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            j17 = java.lang.Long.parseLong(fVar.f245232m);
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(fVar.f245233n, j17);
        if (k17 == null || k17.getMsgId() != j17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeNoteFlutterForwardChatHelper", "want to send record msg, but message info is null");
            return;
        }
        com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent = new com.tencent.mm.autogen.events.RecordOperationEvent();
        am.eq eqVar = recordOperationEvent.f54663g;
        eqVar.f6583a = 4;
        eqVar.f6594l = k17;
        eqVar.f6588f = str;
        eqVar.f6589g = context.f245258e;
        recordOperationEvent.e();
        e17.dismiss();
        j(activity);
    }

    @Override // dz4.z1
    public boolean c(dz4.g2 context) {
        kotlin.jvm.internal.o.g(context, "context");
        return context.f245256c.f245290a == 1;
    }

    @Override // dz4.d2
    public dc5.a d(java.lang.String msgXml, dz4.a2 forwardData, dz4.g2 context) {
        kotlin.jvm.internal.o.g(msgXml, "msgXml");
        kotlin.jvm.internal.o.g(forwardData, "forwardData");
        kotlin.jvm.internal.o.g(context, "context");
        dc5.a d17 = super.d(msgXml, forwardData, context);
        int i17 = d17.f43702d;
        dz4.i iVar = context.f245256c;
        dz4.f fVar = iVar instanceof dz4.f ? (dz4.f) iVar : null;
        if (fVar != null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                d17.set(i17 + 0, java.lang.Long.valueOf(java.lang.Long.parseLong(fVar.f245232m)));
                kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            d17.set(i17 + 1, fVar.f245233n);
        }
        return d17;
    }

    @Override // dz4.d2
    public boolean g() {
        return false;
    }
}
