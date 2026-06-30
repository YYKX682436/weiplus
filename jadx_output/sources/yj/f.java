package yj;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lyj/f;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/advertise/cgi/MagicAdIPCCgiData;", "Lcom/tencent/mm/advertise/cgi/MagicAdIPCCgiCallbackData;", "<init>", "()V", "yj/a", "ad-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class f implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.advertise.cgi.MagicAdIPCCgiData, com.tencent.mm.advertise.cgi.MagicAdIPCCgiCallbackData> {
    public final yj.a a(com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData magicAdIPCCgiReportData, r45.e5 e5Var) {
        jz5.f0 f0Var;
        yj.a aVar = new yj.a(null, 0, 0, 0, 0, 31, null);
        int ordinal = magicAdIPCCgiReportData.f53155d.ordinal();
        if (ordinal == 0) {
            com.tencent.mm.protobuf.g byteString = e5Var.getByteString(3);
            if (byteString == null) {
                byteString = yj.g.f462635a;
                kotlin.jvm.internal.o.f(byteString, "<get-EMPTY_BYTE_STRING>(...)");
            }
            aVar.f462625a = byteString;
            aVar.f462628d = 0;
        } else if (ordinal == 1) {
            com.tencent.mm.protobuf.g byteString2 = e5Var.getByteString(3);
            if (byteString2 == null) {
                byteString2 = yj.g.f462635a;
                kotlin.jvm.internal.o.f(byteString2, "<get-EMPTY_BYTE_STRING>(...)");
            }
            aVar.f462625a = byteString2;
            aVar.f462628d = 1;
            aVar.f462629e = (int) magicAdIPCCgiReportData.f53159h;
        } else if (ordinal == 2) {
            com.tencent.mm.protobuf.g byteString3 = e5Var.getByteString(2);
            if (byteString3 == null) {
                byteString3 = yj.g.f462635a;
                kotlin.jvm.internal.o.f(byteString3, "<get-EMPTY_BYTE_STRING>(...)");
            }
            aVar.f462625a = byteString3;
            aVar.f462627c = 138;
        }
        if (magicAdIPCCgiReportData.f53155d == wj.p0.f446469m) {
            java.lang.Integer num = magicAdIPCCgiReportData.f53158g;
            if (num != null) {
                aVar.f462626b = num.intValue();
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("MagicAdCommonFeatureService", "processReportData fail, reject reason not found");
                return null;
            }
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0114  */
    @Override // com.tencent.mm.ipcinvoker.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invoke(java.lang.Object r18, com.tencent.mm.ipcinvoker.r r19) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yj.f.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.r):void");
    }
}
