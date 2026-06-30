package iu;

/* loaded from: classes12.dex */
public final class v extends iu.h {
    @Override // iu.h, gu.f
    public java.lang.Object a(gu.j params, kotlin.coroutines.Continuation continuation) {
        kotlin.jvm.internal.o.g(params, "params");
        oi3.e eVar = params.f275610d;
        if (eVar != null) {
            java.lang.String l17 = l(eVar);
            i95.m c17 = i95.n0.c(tg3.u0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            iu.h.g(this, tg3.u0.k3((tg3.u0) c17, eVar, l17, false, 4, null), params.f275609c, params.f275608b, 0, 8, null);
        } else {
            oi3.g gVar = params.f275611e;
            if (gVar != null) {
                int i17 = mc0.k.R0;
                int i18 = gVar.f345617d;
                long j17 = gVar.getLong(i18 + 0);
                long j18 = gVar.getLong(i18 + 1);
                java.lang.String msgTalker = gVar.getString(i18 + 3);
                s15.h dataItem = params.f275609c;
                kotlin.jvm.internal.o.g(dataItem, "dataItem");
                kotlin.jvm.internal.o.g(msgTalker, "msgTalker");
                ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).getClass();
                java.lang.String G = bt3.g2.G(dataItem.getString(dataItem.f303422d + 3), msgTalker, j17, j18, 1);
                kotlin.jvm.internal.o.f(G, "getThumbPath(...)");
                f(G, dataItem, params.f275608b, 1);
            }
        }
        return super.a(params, continuation);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0219 A[PHI: r2
  0x0219: PHI (r2v40 java.lang.Object) = (r2v32 java.lang.Object), (r2v1 java.lang.Object) binds: [B:19:0x0216, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0218 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // iu.h, gu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(gu.j r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.v.b(gu.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // iu.h
    public java.lang.String m() {
        return "MicroMsg.AppMsg.ThumbOnlyRecordSendApi";
    }
}
