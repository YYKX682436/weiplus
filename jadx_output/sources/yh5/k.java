package yh5;

/* loaded from: classes3.dex */
public final class k extends lf3.c0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // lf3.c0, kg3.f
    public void onPageSelected(int i17) {
        super.onPageSelected(i17);
        com.tencent.mars.xlog.Log.i("MediaGallery.PreviewComponent", "CleanPreviewComponent.onPageSelected position=" + i17);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        yh5.e eVar = (yh5.e) pf5.z.f353948a.a(activity).a(yh5.e.class);
        if (eVar != null) {
            eVar.Y6(i17);
        }
    }

    @Override // lf3.c0, lf3.o, com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        yh5.g gVar = (yh5.g) pf5.z.f353948a.a(activity).a(yh5.g.class);
        int i17 = gVar != null ? gVar.f462435g : 0;
        com.tencent.mars.xlog.Log.i("MediaGallery.PreviewComponent", "CleanPreviewComponent.onViewCreated position=" + i17);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        yh5.e eVar = (yh5.e) pf5.z.f353948a.a(activity2).a(yh5.e.class);
        if (eVar != null) {
            eVar.Y6(i17);
        }
    }
}
