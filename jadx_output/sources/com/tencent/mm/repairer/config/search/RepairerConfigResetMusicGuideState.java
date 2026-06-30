package com.tencent.mm.repairer.config.search;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/search/RepairerConfigResetMusicGuideState;", "Lq55/a;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigResetMusicGuideState extends q55.a {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_ResetMusicGuideState";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "重置听一听引导词状态";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupSearch.class;
    }

    @Override // q55.a
    public void h(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("taskbar_config");
        M.putInt("music_guide_show_count", 0);
        M.putLong("music_guide_first_show_time", 0L);
        M.putBoolean("music_guide_initialized", false);
        M.putBoolean("music_guide_clicked", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.RepairerConfigResetMusicGuideState", "resetMusicGuideState: all music guide state cleared");
        dp.a.makeText(context, "已重置听一听引导词状态", 0).show();
    }
}
