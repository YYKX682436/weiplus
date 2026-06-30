package k24;

/* loaded from: classes8.dex */
public final class j implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyNewMsg f303761d;

    public j(com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyNewMsg settingSwitchNotifyNewMsg) {
        this.f303761d = settingSwitchNotifyNewMsg;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 menu) {
        kotlin.jvm.internal.o.g(menu, "menu");
        if (menu.z()) {
            db5.h4 h4Var = (db5.h4) menu.a(1, com.tencent.mm.R.string.f493056m50);
            int color = this.f303761d.getContext().getResources().getColor(com.tencent.mm.R.color.f478622ch);
            h4Var.f228376t = com.tencent.mm.R.string.f493056m50;
            h4Var.f228370n = color;
        }
    }
}
