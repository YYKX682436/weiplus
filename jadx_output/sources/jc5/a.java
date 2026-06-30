package jc5;

/* loaded from: classes9.dex */
public final class a extends hc5.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yb5.d mChattingContext) {
        super(mChattingContext);
        kotlin.jvm.internal.o.g(mChattingContext, "mChattingContext");
    }

    @Override // hc5.a
    public int a(java.util.List msgInfos) {
        kotlin.jvm.internal.o.g(msgInfos, "msgInfos");
        return 5;
    }

    @Override // hc5.a
    public int b() {
        return 3;
    }

    @Override // hc5.a
    public java.lang.String c() {
        return "revokesys_";
    }

    @Override // hc5.a
    public java.lang.Class e(rd5.d msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        return ye5.e.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb A[LOOP:1: B:39:0x00c5->B:41:0x00cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0232  */
    @Override // hc5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(java.util.List r20) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jc5.a.g(java.util.List):void");
    }

    @Override // hc5.a
    public java.lang.String h(rd5.d msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        if (j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigRevokeMsgUseNewXmlAndFold()) == 0 || !msgInfo.f394254d.f445300b.W2()) {
            return null;
        }
        jc5.b bVar = jc5.b.f299016a;
        com.tencent.mm.storage.f9 msg = msgInfo.f394254d.f445300b;
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String b17 = bVar.b(msg);
        boolean z17 = false;
        boolean z18 = true;
        if (!(b17.length() == 0)) {
            java.util.List list = (java.util.List) ((java.util.LinkedHashMap) jc5.b.f299017b).get(msg.Q0());
            if (list != null && list.contains(b17)) {
                z17 = true;
            }
            z18 = z17;
        }
        if (z18) {
            return null;
        }
        java.lang.String b18 = bVar.b(msgInfo.f394254d.f445300b);
        if (r26.n0.N(b18)) {
            return null;
        }
        return b18;
    }
}
