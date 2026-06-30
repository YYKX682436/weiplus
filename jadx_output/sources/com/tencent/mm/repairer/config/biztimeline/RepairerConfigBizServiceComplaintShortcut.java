package com.tencent.mm.repairer.config.biztimeline;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/biztimeline/RepairerConfigBizServiceComplaintShortcut;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigBizServiceComplaintShortcut extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_BizTemplateComplaintShortCut";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "下掉『服务号投诉自动截图』功能";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupBizTimeline.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 0;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_biz_template_complaint_shortcut_block";
    }

    @Override // q55.i, q55.d
    public java.util.List n() {
        return kz5.c0.i("启用此功能", "下掉此功能");
    }

    @Override // q55.i, q55.d
    public java.util.List o() {
        return kz5.c0.i("0", "1");
    }
}
