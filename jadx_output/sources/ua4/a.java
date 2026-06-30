package ua4;

/* loaded from: classes4.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final void a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetailPageDescSpanBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        kotlin.jvm.internal.o.g(view, "view");
        r45.ek6 ek6Var = new r45.ek6();
        ek6Var.f373585e = 3;
        ek6Var.f373586f = snsInfo.getUserName() + '#' + ca4.z0.t0(snsInfo.field_snsId);
        ek6Var.f373587g = (long) snsInfo.field_createTime;
        ek6Var.f373588h = 3;
        ek6Var.f373589i = snsInfo.field_type;
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        o04.n Bi = ((md0.e) eVar).Bi(context, 1);
        if (Bi != null) {
            ((o04.g) Bi).b(java.lang.String.valueOf(view.hashCode()), ek6Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetailPageDescSpanBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
    }

    public final void b(android.view.View view, r45.e86 comment) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemCommentSpanBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(comment, "comment");
        if (view instanceof com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout) {
            nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
            com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout snsCommentCollapseLayout = (com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout) view;
            android.content.Context context = snsCommentCollapseLayout.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            o04.n Bi = ((md0.e) eVar).Bi(context, 1);
            if (Bi != null) {
                ((o04.g) Bi).a("Comment_" + comment.hashCode(), java.lang.String.valueOf(snsCommentCollapseLayout.getNormalCommentTv().hashCode()));
            }
            nd0.e eVar2 = (nd0.e) i95.n0.c(nd0.e.class);
            android.content.Context context2 = snsCommentCollapseLayout.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            o04.n Bi2 = ((md0.e) eVar2).Bi(context2, 1);
            if (Bi2 != null) {
                ((o04.g) Bi2).a("Comment_" + comment.hashCode(), java.lang.String.valueOf(snsCommentCollapseLayout.get2LineCommentTv().hashCode()));
            }
        } else if (view instanceof android.widget.TextView) {
            nd0.e eVar3 = (nd0.e) i95.n0.c(nd0.e.class);
            android.content.Context context3 = ((android.widget.TextView) view).getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            o04.n Bi3 = ((md0.e) eVar3).Bi(context3, 1);
            if (Bi3 != null) {
                ((o04.g) Bi3).a("Comment_" + comment.hashCode(), java.lang.String.valueOf(view.hashCode()));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsTagSearchSpanClickReportFlow", "onItemCommentSpanBindView Comment_" + comment.hashCode() + ' ' + view.hashCode());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemCommentSpanBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
    }

    public final void c(android.view.View view, int i17, com.tencent.mm.plugin.sns.ui.ns struct) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemDescSpanBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(struct, "struct");
        android.view.View findViewById = view.findViewById(i17);
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        o04.n Bi = ((md0.e) eVar).Bi(context, 1);
        if (Bi != null) {
            ((o04.g) Bi).a("Item_" + struct.f170025a.localid, java.lang.String.valueOf(findViewById.hashCode()));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemDescSpanBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
    }
}
