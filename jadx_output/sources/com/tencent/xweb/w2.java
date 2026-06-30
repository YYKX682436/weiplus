package com.tencent.xweb;

/* loaded from: classes12.dex */
public class w2 extends android.content.res.Resources {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f220617a;

    public w2(android.content.res.Resources resources, android.content.Context context) {
        super(resources.getAssets(), context.getResources().getDisplayMetrics(), resources.getConfiguration());
        this.f220617a = new java.lang.ref.WeakReference(context);
    }

    @Override // android.content.res.Resources
    public android.util.DisplayMetrics getDisplayMetrics() {
        android.content.Context context = (android.content.Context) this.f220617a.get();
        return context != null ? context.getResources().getDisplayMetrics() : super.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics) {
        by5.c4.f("XWebResource", "updateConfiguration, locale:" + configuration.locale);
        super.updateConfiguration(configuration, displayMetrics);
    }
}
