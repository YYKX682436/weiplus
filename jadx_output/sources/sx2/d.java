package sx2;

/* loaded from: classes15.dex */
public final class d extends androidx.recyclerview.widget.u2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.manager.ad.AdStackLayoutManager f413527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f413528b;

    public d(com.tencent.mm.plugin.finder.view.manager.ad.AdStackLayoutManager adStackLayoutManager, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f413527a = adStackLayoutManager;
        this.f413528b = recyclerView;
    }

    @Override // androidx.recyclerview.widget.u2
    public boolean a(int i17, int i18) {
        sx2.a aVar;
        sx2.a aVar2;
        com.tencent.mm.plugin.finder.view.manager.ad.AdStackLayoutManager adStackLayoutManager = this.f413527a;
        if (adStackLayoutManager.f132649n) {
            int ordinal = adStackLayoutManager.f132642d.ordinal();
            boolean z17 = false;
            if (ordinal == 0 || ordinal == 1) {
                adStackLayoutManager.getClass();
                if (i17 > 0) {
                    aVar = sx2.a.f413521f;
                } else {
                    adStackLayoutManager.getClass();
                    aVar = i17 < 0 ? sx2.a.f413520e : sx2.a.f413519d;
                }
                adStackLayoutManager.f132652q = aVar;
                int width = adStackLayoutManager.getWidth() * (adStackLayoutManager.getItemCount() - 1);
                int i19 = adStackLayoutManager.f132644f;
                if (1 <= i19 && i19 < width) {
                    z17 = true;
                }
                if (z17) {
                    adStackLayoutManager.f132650o = true;
                }
            } else {
                adStackLayoutManager.getClass();
                if (i18 > 0) {
                    aVar2 = sx2.a.f413523h;
                } else {
                    adStackLayoutManager.getClass();
                    aVar2 = i18 < 0 ? sx2.a.f413522g : sx2.a.f413519d;
                }
                adStackLayoutManager.f132652q = aVar2;
                int width2 = adStackLayoutManager.getWidth() * (adStackLayoutManager.getItemCount() - 1);
                int i27 = adStackLayoutManager.f132644f;
                if (1 <= i27 && i27 < width2) {
                    z17 = true;
                }
                if (z17) {
                    adStackLayoutManager.f132650o = true;
                }
            }
            com.tencent.mm.plugin.finder.view.manager.ad.AdStackLayoutManager.m(adStackLayoutManager, this.f413528b);
        }
        return adStackLayoutManager.f132649n;
    }
}
