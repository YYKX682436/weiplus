package vr3;

/* loaded from: classes11.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f439646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher f439647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f439648f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f439649g;

    public s(java.util.ArrayList arrayList, com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher bizProfileDataFetcher, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3) {
        this.f439646d = arrayList;
        this.f439647e = bizProfileDataFetcher;
        this.f439648f = arrayList2;
        this.f439649g = arrayList3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = this.f439646d;
        boolean z17 = !arrayList.isEmpty();
        com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher bizProfileDataFetcher = this.f439647e;
        if (z17) {
            bizProfileDataFetcher.f154290u.setValue(arrayList);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileDataFetcher", "onProfileUpdateMessages: Updated bizProfileUpdateData with " + arrayList.size() + " items");
        }
        java.util.ArrayList arrayList2 = this.f439648f;
        if (!arrayList2.isEmpty()) {
            bizProfileDataFetcher.f154291v.setValue(arrayList2);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileDataFetcher", "onProfileUpdateMessages: Updated bizProfileArticleUpdateData with " + arrayList2.size() + " items");
        }
        java.util.ArrayList arrayList3 = this.f439649g;
        if (!arrayList3.isEmpty()) {
            bizProfileDataFetcher.f154292w.setValue(arrayList3);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileDataFetcher", "onProfileUpdateMessages: Updated bizProfilePicUpdateData with " + arrayList3.size() + " items");
        }
    }
}
