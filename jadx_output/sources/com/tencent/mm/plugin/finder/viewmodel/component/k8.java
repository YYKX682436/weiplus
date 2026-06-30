package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class k8 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f134932d;

    public k8(boolean z17) {
        this.f134932d = z17;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.g(1, "feed信息", com.tencent.mm.R.raw.finder_icons_link);
        g4Var.g(3, "强化流检查", com.tencent.mm.R.raw.bottomsheet_icon_refresh);
        g4Var.g(8, "指定档位", com.tencent.mm.R.raw.bottomsheet_icon_refresh);
        g4Var.g(12, "投诉query", com.tencent.mm.R.raw.icons_outlined_report_problem);
        g4Var.g(9, "播放信息", com.tencent.mm.R.raw.bottomsheet_icon_refresh);
        if (this.f134932d) {
            g4Var.g(4, "VIDEO信息", com.tencent.mm.R.raw.bottomsheet_icon_brower);
            g4Var.g(5, "转发视频文件", com.tencent.mm.R.raw.bottomsheet_icon_transmit);
        }
        g4Var.g(2, "拷贝feed全量信息", com.tencent.mm.R.raw.bottomsheet_icon_star);
        g4Var.g(6, "拷贝feed点赞信息", com.tencent.mm.R.raw.bottomsheet_icon_star);
        g4Var.g(10, "组件优先级", com.tencent.mm.R.raw.bottomsheet_icon_star);
        g4Var.g(11, "H5半屏debug", com.tencent.mm.R.raw.bottomsheet_icon_brower);
    }
}
