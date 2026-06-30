package hr3;

/* loaded from: classes4.dex */
public final class tb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.OpenIMKefuProfileSettingUI f284025d;

    public tb(com.tencent.mm.plugin.profile.ui.OpenIMKefuProfileSettingUI openIMKefuProfileSettingUI) {
        this.f284025d = openIMKefuProfileSettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f284025d.finish();
        return false;
    }
}
