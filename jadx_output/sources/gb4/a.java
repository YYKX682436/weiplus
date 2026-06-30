package gb4;

/* loaded from: classes4.dex */
public class a extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f270047d;

    public a(gb4.b bVar, android.view.View view) {
        super(view);
        this.f270047d = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.cgi);
    }

    public static /* synthetic */ android.widget.LinearLayout i(gb4.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter$ContentView");
        android.widget.LinearLayout linearLayout = aVar.f270047d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter$ContentView");
        return linearLayout;
    }
}
