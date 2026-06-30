package or1;

/* loaded from: classes12.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer f347545d;

    public o(com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer bizSearchResultItemContainer) {
        this.f347545d = bizSearchResultItemContainer;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer bizSearchResultItemContainer = this.f347545d;
        bizSearchResultItemContainer.f93983f.setVisibility(bizSearchResultItemContainer.f93982e.isEmpty() ? 0 : 8);
    }
}
