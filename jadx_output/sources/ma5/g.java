package ma5;

/* loaded from: classes15.dex */
public class g extends n3.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ma5.k f325243a;

    public g(ma5.k kVar) {
        this.f325243a = kVar;
    }

    @Override // n3.c2
    public void b(android.view.View view) {
        android.view.View view2;
        ma5.k kVar = this.f325243a;
        if (kVar.f325267o && (view2 = kVar.f325259g) != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            view2.setTranslationY(0.0f);
            kVar.f325256d.setTranslationY(0.0f);
        }
        kVar.f325256d.setVisibility(8);
        kVar.f325256d.setTransitioning(false);
        kVar.f325272t = null;
        n.a aVar = kVar.f325263k;
        if (aVar != null) {
            aVar.d(kVar.f325262j);
            kVar.f325262j = null;
            kVar.f325263k = null;
        }
    }
}
