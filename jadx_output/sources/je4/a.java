package je4;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final je4.a f299315a = new je4.a();

    public final void a(android.app.Activity activity, int i17, byte[] finderObjectBytes, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.plugin.sns.util.SetSnsBgFromFinderUtils");
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(finderObjectBytes, "finderObjectBytes");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("SELECT_OBJECT", finderObjectBytes);
        intent.putExtra("SELECT_TAB_TYPE", i18);
        intent.putExtra("KEY_ENTER_SOURCE", i19);
        intent.setClass(activity, com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/util/SetSnsBgFromFinderUtils", "enterSnsCoverFinderPreviewUI", "(Landroid/app/Activity;I[BII)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.plugin.sns.util.SetSnsBgFromFinderUtils");
    }
}
