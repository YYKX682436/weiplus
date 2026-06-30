package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class p5 extends com.tencent.mm.plugin.finder.report.r0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(com.tencent.mm.ui.MMActivity activity, r45.qt2 contextObj) {
        super(activity, contextObj);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
    }

    public final jx3.a S0(jx3.a aVar, com.tencent.mm.plugin.finder.storage.o90 o90Var) {
        if (aVar instanceof com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardExposeReportStruct) {
            com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardExposeReportStruct finderLbsCardExposeReportStruct = (com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardExposeReportStruct) aVar;
            finderLbsCardExposeReportStruct.f57007i = finderLbsCardExposeReportStruct.b("cardid", o90Var.b(), true);
            finderLbsCardExposeReportStruct.f57009k = o90Var.c().getInteger(8);
            finderLbsCardExposeReportStruct.f57010l = finderLbsCardExposeReportStruct.b("cardTag", o90Var.d(), true);
            java.lang.String string = o90Var.c().getString(5);
            if (string == null) {
                string = "";
            }
            finderLbsCardExposeReportStruct.f57011m = finderLbsCardExposeReportStruct.b("cardStatus", string, true);
        } else if (aVar instanceof com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardActionReportStruct) {
            com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardActionReportStruct finderLbsCardActionReportStruct = (com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardActionReportStruct) aVar;
            finderLbsCardActionReportStruct.f56996j = finderLbsCardActionReportStruct.b("cardid", o90Var.b(), true);
            finderLbsCardActionReportStruct.f56997k = o90Var.c().getInteger(8);
            finderLbsCardActionReportStruct.f56998l = finderLbsCardActionReportStruct.b("cardTag", o90Var.d(), true);
        }
        return aVar;
    }

    public final jx3.a T0(jx3.a aVar) {
        if (aVar instanceof com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardExposeReportStruct) {
            com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardExposeReportStruct finderLbsCardExposeReportStruct = (com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardExposeReportStruct) aVar;
            finderLbsCardExposeReportStruct.f57002d = finderLbsCardExposeReportStruct.b("sessionid", this.f125284h.getString(0), true);
            finderLbsCardExposeReportStruct.f57003e = finderLbsCardExposeReportStruct.b("contextid", this.f125284h.getString(1), true);
            finderLbsCardExposeReportStruct.f57004f = finderLbsCardExposeReportStruct.b("clickTabContextId", this.f125284h.getString(2), true);
        } else if (aVar instanceof com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardActionReportStruct) {
            com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardActionReportStruct finderLbsCardActionReportStruct = (com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardActionReportStruct) aVar;
            finderLbsCardActionReportStruct.f56990d = finderLbsCardActionReportStruct.b("Sessionid", this.f125284h.getString(0), true);
            finderLbsCardActionReportStruct.f56991e = finderLbsCardActionReportStruct.b("contextid", this.f125284h.getString(1), true);
            finderLbsCardActionReportStruct.f56992f = finderLbsCardActionReportStruct.b("clickTabContextId", this.f125284h.getString(2), true);
        }
        return aVar;
    }

    public final jx3.a U0(jx3.a aVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        if (aVar instanceof com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardExposeReportStruct) {
            com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardExposeReportStruct finderLbsCardExposeReportStruct = (com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardExposeReportStruct) aVar;
            finderLbsCardExposeReportStruct.f57015q = finderLbsCardExposeReportStruct.b("feedid", pm0.v.u(baseFinderFeed.getItemId()), true);
            finderLbsCardExposeReportStruct.f57020v = finderLbsCardExposeReportStruct.b("SessionBuffer", baseFinderFeed.g0(), true);
            finderLbsCardExposeReportStruct.f57022x = finderLbsCardExposeReportStruct.b("lng", java.lang.String.valueOf(baseFinderFeed.getFeedObject().getLocation().getFloat(0)), true);
            finderLbsCardExposeReportStruct.f57021w = finderLbsCardExposeReportStruct.b("lat", java.lang.String.valueOf(baseFinderFeed.getFeedObject().getLocation().getFloat(1)), true);
        } else if (aVar instanceof com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardActionReportStruct) {
            com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardActionReportStruct finderLbsCardActionReportStruct = (com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardActionReportStruct) aVar;
            finderLbsCardActionReportStruct.f56999m = finderLbsCardActionReportStruct.b("feedid", pm0.v.u(baseFinderFeed.getItemId()), true);
            finderLbsCardActionReportStruct.f57001o = finderLbsCardActionReportStruct.b("SessionBuffer", baseFinderFeed.g0(), true);
        }
        return aVar;
    }
}
