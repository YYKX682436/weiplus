package md0;

/* loaded from: classes4.dex */
public final class g extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.component.UIComponent f325710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        ((md0.e) eVar).getClass();
        kotlin.jvm.internal.o.g(activity2, "activity");
        this.f325710d = new t04.a(activity2);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        this.f325710d.onCreateBefore(bundle);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onNewIntent(android.content.Intent intent) {
        this.f325710d.onNewIntent(intent);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onStartActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        this.f325710d.onStartActivityForResult(intent, i17, bundle);
    }
}
