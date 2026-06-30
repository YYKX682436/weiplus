package uf5;

/* loaded from: classes10.dex */
public class d2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI f427213d;

    public d2(com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI) {
        this.f427213d = topStorySettingVisibilityDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f427213d.finish();
        return true;
    }
}
