package jz1;

/* loaded from: classes13.dex */
public class k implements com.google.android.material.appbar.e {

    /* renamed from: a, reason: collision with root package name */
    public int f302697a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.appbar.AppBarLayout f302698b;

    public k(jz1.e eVar, com.google.android.material.appbar.AppBarLayout appBarLayout) {
        this.f302698b = appBarLayout;
    }

    @Override // com.google.android.material.appbar.e
    public void a(com.google.android.material.appbar.AppBarLayout appBarLayout, int i17) {
        this.f302697a += i17;
        jz1.e.wi(jz1.e.Di(), this.f302698b, 0, this.f302697a);
    }
}
