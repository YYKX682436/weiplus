package k24;

/* loaded from: classes8.dex */
public final class c implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyInvite f303754d;

    public c(com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyInvite settingSwitchNotifyInvite) {
        this.f303754d = settingSwitchNotifyInvite;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 menu) {
        kotlin.jvm.internal.o.g(menu, "menu");
        if (menu.z()) {
            db5.h4 h4Var = (db5.h4) menu.a(1, com.tencent.mm.R.string.f493062m53);
            int color = this.f303754d.getContext().getResources().getColor(com.tencent.mm.R.color.f478622ch);
            h4Var.f228376t = com.tencent.mm.R.string.f493062m53;
            h4Var.f228370n = color;
        }
    }
}
