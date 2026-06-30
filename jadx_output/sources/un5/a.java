package un5;

/* loaded from: classes15.dex */
public final class a implements com.google.android.material.appbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qn5.b f429491a;

    public a(qn5.b bVar) {
        this.f429491a = bVar;
    }

    @Override // com.google.android.material.appbar.e
    public final void a(com.google.android.material.appbar.AppBarLayout appBarLayout, int i17) {
        boolean z17 = i17 >= 0;
        boolean z18 = appBarLayout.getTotalScrollRange() + i17 <= 0;
        un5.b bVar = (un5.b) this.f429491a;
        bVar.f429495g = z17;
        bVar.f429496h = z18;
    }
}
