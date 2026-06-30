package hi1;

/* loaded from: classes7.dex */
public class a implements hi1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.appwidget.AppWidgetManager f281484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f281485b;

    public a(hi1.b bVar, android.appwidget.AppWidgetManager appWidgetManager, android.content.Context context) {
        this.f281484a = appWidgetManager;
        this.f281485b = context;
    }

    @Override // hi1.l
    public void a() {
        android.content.ComponentName componentName = new android.content.ComponentName(this.f281485b, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget.class);
        android.appwidget.AppWidgetManager appWidgetManager = this.f281484a;
        appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetManager.getAppWidgetIds(componentName), com.tencent.mm.R.id.pmb);
    }
}
