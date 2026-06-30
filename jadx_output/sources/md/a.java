package md;

/* loaded from: classes14.dex */
public class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f325674d;

    public a(md.f fVar, java.lang.ref.WeakReference weakReference) {
        this.f325674d = weakReference;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        md.e eVar;
        md.f fVar = (md.f) this.f325674d.get();
        if (fVar != null) {
            fVar.f325682g = true;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.c(fVar)) {
                boolean z17 = true;
                boolean z18 = false;
                boolean z19 = false;
                for (int i17 = 0; i17 < fVar.getChildCount(); i17++) {
                    android.view.View childAt = fVar.getChildAt(i17);
                    if (childAt != null && childAt != fVar.f325680e && (eVar = (md.e) fVar.f325685m.get(childAt)) != null) {
                        if (!z18 && eVar.f325678b != 0 && childAt.getVisibility() == 0) {
                            fVar.f325679d = childAt;
                            fVar.post(fVar.f325686n);
                            z18 = true;
                        }
                        z19 |= eVar.f325678b == 0;
                        z17 &= childAt.getVisibility() != 0;
                        eVar.f325678b = childAt.getVisibility();
                    }
                }
                if (z18 || (z19 && z17)) {
                    fVar.post(fVar.f325687o);
                }
            }
            if (fVar.f325684i != null) {
                android.view.View view = fVar.f325679d;
                ((md.h) fVar.f325684i).d(fVar, true, 0, 0, 0, (view == null || !view.isShown()) ? 0 : fVar.f325679d.getMeasuredHeight());
            }
            fVar.f325682g = false;
        }
    }
}
