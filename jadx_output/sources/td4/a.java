package td4;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final td4.a f417629a = new td4.a();

    public final void a(android.content.Context context, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showReachLimitAlert", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerAlert");
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String str = null;
        if (i17 == 11) {
            android.content.res.Resources resources = context.getResources();
            if (resources != null) {
                str = resources.getString(com.tencent.mm.R.string.j99, java.lang.String.valueOf(i18));
            }
        } else {
            android.content.res.Resources resources2 = context.getResources();
            if (resources2 != null) {
                str = resources2.getQuantityString(com.tencent.mm.R.plurals.f489692a2, i18, java.lang.Integer.valueOf(i18));
            }
        }
        db5.e1.T(context, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showReachLimitAlert", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerAlert");
    }
}
