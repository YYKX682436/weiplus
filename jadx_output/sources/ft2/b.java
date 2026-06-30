package ft2;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a */
    public static final ft2.b f266519a = new ft2.b();

    public static /* synthetic */ void d(ft2.b bVar, ft2.d dVar, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            i17 = 0;
        }
        if ((i19 & 8) != 0) {
            i18 = 0;
        }
        bVar.a(dVar, finderItem, i17, i18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bc, code lost:
    
        if (r9.put("target", r8) == null) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(ft2.d r15, com.tencent.mm.plugin.finder.storage.FinderItem r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ft2.b.a(ft2.d, com.tencent.mm.plugin.finder.storage.FinderItem, int, int):void");
    }

    public final void b(java.lang.String str, ft2.d dVar) {
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject;
        if (com.tencent.mm.plugin.finder.report.p2.f125238b == null) {
            com.tencent.mm.plugin.finder.report.p2.f125238b = new com.tencent.mm.protocal.protobuf.FinderFeedReportObject();
        }
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
        java.lang.String flowId = finderFeedReportObject2 != null ? finderFeedReportObject2.getFlowId() : null;
        if ((flowId == null || flowId.length() == 0) && (finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b) != null) {
            finderFeedReportObject.setFlowId(c01.id.c() + '_' + g92.b.f269769e.U());
        }
        c(str, dVar, "", "", 0, 0, 0);
    }

    public final void c(java.lang.String str, ft2.d dVar, java.lang.String mediaInfoJson, java.lang.String customInfoJson, int i17, int i18, int i19) {
        java.lang.String str2;
        kotlin.jvm.internal.o.g(mediaInfoJson, "mediaInfoJson");
        kotlin.jvm.internal.o.g(customInfoJson, "customInfoJson");
        try {
            com.tencent.mm.autogen.mmdata.rpt.FinderPostFlowStruct finderPostFlowStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPostFlowStruct();
            finderPostFlowStruct.f57524d = 2;
            if (dVar == null || (str2 = dVar.f266539a) == null) {
                str2 = "";
            }
            finderPostFlowStruct.f57527g = finderPostFlowStruct.b("StageName", str2, true);
            finderPostFlowStruct.f57526f = dVar != null ? dVar.f266540b : 0;
            finderPostFlowStruct.f57528h = 1;
            if (str == null) {
                str = "";
            }
            finderPostFlowStruct.f57525e = finderPostFlowStruct.b("FlowId", str, true);
            finderPostFlowStruct.f57529i = dVar != null ? dVar.f266541c : 0;
            finderPostFlowStruct.f57530j = finderPostFlowStruct.b("MediaInfoJson", mediaInfoJson, true);
            finderPostFlowStruct.f57531k = finderPostFlowStruct.b("CustomInfoJson", customInfoJson, true);
            finderPostFlowStruct.f57532l = i17;
            finderPostFlowStruct.f57533m = i18;
            finderPostFlowStruct.f57534n = i19;
            finderPostFlowStruct.k();
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderPostFlowStruct);
        } catch (java.lang.Throwable unused) {
        }
    }
}
