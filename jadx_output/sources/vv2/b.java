package vv2;

/* loaded from: classes10.dex */
public final class b implements pv2.j {
    @Override // pv2.j
    public void a(java.lang.String taskId, pv2.g from, pv2.g to6) {
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject3;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject4;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject5;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject6;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject7;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject8;
        kotlin.jvm.internal.o.g(taskId, "taskId");
        kotlin.jvm.internal.o.g(from, "from");
        kotlin.jvm.internal.o.g(to6, "to");
        int i17 = 0;
        boolean z17 = ((to6 instanceof pv2.d) || (to6 instanceof pv2.n)) ? false : true;
        boolean z18 = from instanceof tv2.f;
        ft2.b bVar = ft2.b.f266519a;
        if (z18) {
            ft2.d dVar = ft2.c.f266520a;
            ft2.d dVar2 = z17 ? ft2.c.f266532m : ft2.c.f266531l;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = ((tv2.f) from).f422300h;
            bVar.a(dVar2, finderItem, 0, (z17 || (finderFeedReportObject8 = finderItem.field_reportObject) == null) ? 0 : finderFeedReportObject8.getMpError());
        } else if (from instanceof wv2.c) {
            ft2.d dVar3 = ft2.c.f266520a;
            ft2.d dVar4 = z17 ? ft2.c.f266532m : ft2.c.f266531l;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = ((wv2.c) from).f450000h;
            bVar.a(dVar4, finderItem2, 0, (z17 || (finderFeedReportObject7 = finderItem2.field_reportObject) == null) ? 0 : finderFeedReportObject7.getMpError());
        } else if (from instanceof tv2.v) {
            ft2.d dVar5 = ft2.c.f266520a;
            ft2.d dVar6 = z17 ? ft2.c.f266535p : ft2.c.f266534o;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = ((tv2.v) from).f422331h;
            bVar.a(dVar6, finderItem3, 0, (z17 || (finderFeedReportObject6 = finderItem3.field_reportObject) == null) ? 0 : finderFeedReportObject6.getUploadLogicError());
        } else if (from instanceof wv2.m) {
            ft2.d dVar7 = ft2.c.f266520a;
            ft2.d dVar8 = z17 ? ft2.c.f266535p : ft2.c.f266534o;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem4 = ((wv2.m) from).f450018h;
            bVar.a(dVar8, finderItem4, 0, (z17 || (finderFeedReportObject5 = finderItem4.field_reportObject) == null) ? 0 : finderFeedReportObject5.getUploadLogicError());
        } else if (from instanceof tv2.m) {
            ft2.d dVar9 = ft2.c.f266520a;
            ft2.d dVar10 = z17 ? ft2.c.f266538s : ft2.c.f266537r;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem5 = ((tv2.m) from).f422315h;
            int cgiErrorType = (z17 || (finderFeedReportObject3 = finderItem5.field_reportObject) == null) ? 0 : finderFeedReportObject3.getCgiErrorType();
            if (!z17 && (finderFeedReportObject4 = finderItem5.field_reportObject) != null) {
                i17 = finderFeedReportObject4.getCgiErrorCode();
            }
            bVar.a(dVar10, finderItem5, cgiErrorType, i17);
        } else if (from instanceof wv2.f) {
            ft2.d dVar11 = ft2.c.f266520a;
            ft2.d dVar12 = z17 ? ft2.c.f266538s : ft2.c.f266537r;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem6 = ((wv2.f) from).f450005h;
            int cgiErrorType2 = (z17 || (finderFeedReportObject = finderItem6.field_reportObject) == null) ? 0 : finderFeedReportObject.getCgiErrorType();
            if (!z17 && (finderFeedReportObject2 = finderItem6.field_reportObject) != null) {
                i17 = finderFeedReportObject2.getCgiErrorCode();
            }
            bVar.a(dVar12, finderItem6, cgiErrorType2, i17);
        }
        if (to6 instanceof tv2.f) {
            ft2.d dVar13 = ft2.c.f266520a;
            ft2.b.d(bVar, ft2.c.f266530k, ((tv2.f) to6).f422300h, 0, 0, 12, null);
            return;
        }
        if (to6 instanceof wv2.c) {
            ft2.d dVar14 = ft2.c.f266520a;
            ft2.b.d(bVar, ft2.c.f266530k, ((wv2.c) to6).f450000h, 0, 0, 12, null);
            return;
        }
        if (to6 instanceof tv2.v) {
            ft2.d dVar15 = ft2.c.f266520a;
            ft2.b.d(bVar, ft2.c.f266533n, ((tv2.v) to6).f422331h, 0, 0, 12, null);
            return;
        }
        if (to6 instanceof wv2.m) {
            ft2.d dVar16 = ft2.c.f266520a;
            ft2.b.d(bVar, ft2.c.f266533n, ((wv2.m) to6).f450018h, 0, 0, 12, null);
        } else if (to6 instanceof tv2.m) {
            ft2.d dVar17 = ft2.c.f266520a;
            ft2.b.d(bVar, ft2.c.f266536q, ((tv2.m) to6).f422315h, 0, 0, 12, null);
        } else if (to6 instanceof wv2.f) {
            ft2.d dVar18 = ft2.c.f266520a;
            ft2.b.d(bVar, ft2.c.f266536q, ((wv2.f) to6).f450005h, 0, 0, 12, null);
        }
    }

    @Override // pv2.j
    public void b(java.lang.String taskId, pv2.g endStage) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        kotlin.jvm.internal.o.g(endStage, "endStage");
    }

    @Override // pv2.j
    public void c(java.lang.String taskId, pv2.g beginStage) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        kotlin.jvm.internal.o.g(beginStage, "beginStage");
        boolean z17 = beginStage instanceof tv2.p;
        ft2.b bVar = ft2.b.f266519a;
        if (z17) {
            ft2.d dVar = ft2.c.f266520a;
            ft2.b.d(bVar, ft2.c.f266528i, ((tv2.p) beginStage).f422325h, 0, 0, 12, null);
        } else if (beginStage instanceof wv2.g) {
            ft2.d dVar2 = ft2.c.f266520a;
            ft2.b.d(bVar, ft2.c.f266528i, ((wv2.g) beginStage).f450012h, 0, 0, 12, null);
        }
    }
}
