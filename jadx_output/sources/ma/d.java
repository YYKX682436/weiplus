package ma;

/* loaded from: classes14.dex */
public class d implements o3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ma.e f325123a;

    public d(ma.e eVar) {
        this.f325123a = eVar;
    }

    @Override // o3.d
    public void onTouchExplorationStateChanged(boolean z17) {
        this.f325123a.setClickableOrFocusableBasedOnAccessibility(z17);
    }
}
