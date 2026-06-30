package or1;

/* loaded from: classes.dex */
public class u implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI f347577d;

    public u(com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI brandServiceIndexUI) {
        this.f347577d = brandServiceIndexUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI brandServiceIndexUI = this.f347577d;
        if (brandServiceIndexUI.f94001n) {
            android.content.Intent intent = new android.content.Intent(brandServiceIndexUI, (java.lang.Class<?>) com.tencent.mm.plugin.brandservice.ui.BrandServiceLocalSearchUI.class);
            intent.putExtra("is_return_result", brandServiceIndexUI.f94001n);
            intent.putExtra("intent_service_type", brandServiceIndexUI.f93996f);
            intent.addFlags(67108864);
            brandServiceIndexUI.startActivityForResult(intent, 1);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("intent_service_type", brandServiceIndexUI.f93996f);
            intent2.putExtra("detail_type", -7);
            int i17 = brandServiceIndexUI.f93996f;
            if (i17 == 251658241 || i17 == 0) {
                intent2.putExtra("Search_Scene", 7);
                intent2.putExtra("key_search_bar_title_suffix", brandServiceIndexUI.getString(com.tencent.mm.R.string.ogd));
            } else if (i17 == 1) {
                intent2.putExtra("Search_Scene", 6);
                intent2.putExtra("key_search_bar_title_suffix", brandServiceIndexUI.getString(com.tencent.mm.R.string.oge));
            }
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
            o13.n.q(brandServiceIndexUI, ".ui.FTSBizDetailUI", intent2);
            ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
            su4.r2.o();
        }
        return true;
    }
}
