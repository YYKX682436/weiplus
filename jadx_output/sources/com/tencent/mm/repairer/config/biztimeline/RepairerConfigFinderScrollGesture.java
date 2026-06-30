package com.tencent.mm.repairer.config.biztimeline;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/biztimeline/RepairerConfigFinderScrollGesture;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigFinderScrollGesture extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_FinderScrollGesture";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "视频号横滑卡片手势角度";
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
        return "clicfg_biz_timeline_finder_scroll_gesture";
    }

    @Override // q55.i, q55.d
    public java.util.List n() {
        return kz5.c0.i("默认开启:纵向滑动15°以内才响应纵向列表", "屏蔽15°逻辑，保持原生的滑动响应");
    }

    @Override // q55.i, q55.d
    public java.util.List o() {
        return kz5.c0.i("0", "1");
    }
}
