package oa;

/* loaded from: classes15.dex */
public class e extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.tabs.TabLayout f343761a;

    public e(com.google.android.material.tabs.TabLayout tabLayout) {
        this.f343761a = tabLayout;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.f343761a.m();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f343761a.m();
    }
}
