package gq2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f274547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gq2.d f274548e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i17, gq2.d dVar) {
        super(0);
        this.f274547d = i17;
        this.f274548e = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        oa.i k17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStreamTabChange position: ");
        int i17 = this.f274547d;
        sb6.append(i17);
        sb6.append(" tabLayout: ");
        gq2.d dVar = this.f274548e;
        sb6.append(dVar.f274553d);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("Finder.LiveTabListConvert", sb6.toString());
        com.google.android.material.tabs.TabLayout tabLayout = dVar.f274553d;
        if (tabLayout != null && (k17 = tabLayout.k(i17)) != null && !k17.a()) {
            k17.b();
        }
        return jz5.f0.f302826a;
    }
}
