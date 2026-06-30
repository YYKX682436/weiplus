package ey2;

/* loaded from: classes2.dex */
public final class b0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public boolean f257324d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_OPEN_FINDER_ENTRANCE", false);
        this.f257324d = getIntent().getBooleanExtra("KEY_OPEN_FINDER_ENTRANCE_FROM_PROFILE_GUIDE", false);
        getIntent().removeExtra("KEY_OPEN_FINDER_ENTRANCE");
        getIntent().removeExtra("KEY_OPEN_FINDER_ENTRANCE_FROM_PROFILE_GUIDE");
        if (booleanExtra) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ea.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((com.tencent.mm.plugin.finder.viewmodel.component.ea) a17).O6(new com.tencent.mm.plugin.finder.viewmodel.component.ba(0, "EntranceDialog", new ey2.x(this)));
        }
    }
}
