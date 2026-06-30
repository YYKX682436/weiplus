package vr3;

/* loaded from: classes11.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher f439643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f439644e;

    public q(com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher bizProfileDataFetcher, java.util.List list) {
        this.f439643d = bizProfileDataFetcher;
        this.f439644e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f439643d.f154288s.setValue(new vr3.g(this.f439644e));
    }
}
