package ss1;

/* loaded from: classes8.dex */
public final class c implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss1.d f411884d;

    public c(ss1.d dVar) {
        this.f411884d = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.ViewGroup viewGroup;
        android.content.res.Resources resources;
        android.view.ViewTreeObserver viewTreeObserver;
        ss1.d dVar = this.f411884d;
        android.view.ViewGroup viewGroup2 = dVar.f411897s;
        if (viewGroup2 != null && (viewTreeObserver = viewGroup2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        android.content.Context context = dVar.f411885d;
        int dimension = (context == null || (resources = context.getResources()) == null) ? 0 : (int) resources.getDimension(com.tencent.mm.R.dimen.f479703an3);
        if (dVar.f411888g == dVar.c() || (viewGroup = dVar.f411897s) == null) {
            return true;
        }
        kotlin.jvm.internal.o.d(viewGroup);
        if (viewGroup.getHeight() >= dimension) {
            return true;
        }
        android.view.ViewGroup viewGroup3 = dVar.f411897s;
        kotlin.jvm.internal.o.d(viewGroup3);
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup3.getLayoutParams();
        layoutParams.height = dimension;
        android.view.ViewGroup viewGroup4 = dVar.f411897s;
        kotlin.jvm.internal.o.d(viewGroup4);
        viewGroup4.setLayoutParams(layoutParams);
        return true;
    }
}
