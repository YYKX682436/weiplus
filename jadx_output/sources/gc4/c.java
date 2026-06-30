package gc4;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final gc4.c f270447a = new gc4.c();

    public static int a(gc4.c cVar, android.content.Context context, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateInputViewMaxHeight$default", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
        if ((i38 & 2) != 0) {
            i17 = com.tencent.mm.sdk.platformtools.d2.a(context);
        }
        if ((i38 & 4) != 0) {
            i18 = com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f479623ay);
        }
        if ((i38 & 8) != 0) {
            i19 = com.tencent.mm.ui.bl.h(context);
        }
        if ((i38 & 16) != 0) {
            i27 = com.tencent.mm.ui.bl.c(context);
        }
        if ((i38 & 32) != 0) {
            i28 = com.tencent.mm.ui.bl.b(context).y;
        }
        if ((i38 & 64) != 0) {
            i29 = i65.a.h(context, com.tencent.mm.R.dimen.f479738dv);
        }
        if ((i38 & 128) != 0) {
            i37 = i65.a.h(context, com.tencent.mm.R.dimen.f479738dv);
        }
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateInputViewMaxHeight", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter.HeightProvider", "calculateInputViewMaxHeight context:" + context + ", screenHeight:" + i28 + ", keyboardHeight:" + i17 + ", actionBarHeight:" + i18 + ", statusBarHeight:" + i19 + ", bottomHeight:" + i27 + ", paddingTop:" + i29 + ", paddingBottom:" + i37);
        int i39 = (((((i28 - i19) - i18) - i27) - i17) / 2) - (i29 + i37);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateInputViewMaxHeight", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateInputViewMaxHeight$default", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
        return i39;
    }
}
