package tc4;

/* loaded from: classes4.dex */
public abstract class x0 extends tc4.d2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object H(tc4.x0 r18, in5.s0 r19, zc4.b r20, int r21, boolean r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.x0.H(tc4.x0, in5.s0, zc4.b, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.String G(int i17, int i18, boolean z17) {
        java.lang.String string;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createPhotoContentDescription", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemAccessibility");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createPhotoContentDescription", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveItemAccessibilityHelper");
        if (i17 < 0 || i18 <= 0 || i17 >= i18) {
            if (z17) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.k_m);
                kotlin.jvm.internal.o.d(string);
            } else {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490411u8);
                kotlin.jvm.internal.o.d(string);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createPhotoContentDescription", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveItemAccessibilityHelper");
        } else {
            if (z17) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.k_o, java.lang.String.valueOf(i17 + 1), java.lang.String.valueOf(i18));
                kotlin.jvm.internal.o.d(string);
            } else {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493203ja0, java.lang.String.valueOf(i17 + 1), java.lang.String.valueOf(i18));
                kotlin.jvm.internal.o.d(string);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createPhotoContentDescription", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveItemAccessibilityHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createPhotoContentDescription", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemAccessibility");
        return string;
    }

    public final java.lang.String getContentAccessibilityDesc() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemAccessibility");
        java.lang.CharSequence content = getContentText().getContent();
        if (android.text.TextUtils.isEmpty(content)) {
            content = "";
        }
        java.lang.String obj = content != null ? content.toString() : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemAccessibility");
        return obj;
    }
}
