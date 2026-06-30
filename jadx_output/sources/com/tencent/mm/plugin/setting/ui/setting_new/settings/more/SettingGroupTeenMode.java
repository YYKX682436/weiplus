package com.tencent.mm.plugin.setting.ui.setting_new.settings.more;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/more/SettingGroupTeenMode;", "Ls24/f;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingGroupTeenMode extends s24.f {

    /* renamed from: p, reason: collision with root package name */
    public boolean f161948p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Integer f161949q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingGroupTeenMode(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161948p = true;
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).Xd()) {
            this.f161948p = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "need hide teen-mode entrance");
            if (isTeenMode) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BaseSettingItem", "already enable TeenMode, need to close it manually");
                ((uh4.c0) i95.n0.c(uh4.c0.class)).C5();
            }
        } else {
            this.f161948p = true;
        }
        if (isTeenMode) {
            this.f161949q = java.lang.Integer.valueOf(com.tencent.mm.R.string.ikb);
        } else {
            this.f161949q = null;
        }
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_More_MinorMode";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMore.class, null);
    }

    @Override // s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.pb6;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMore.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 2;
    }

    @Override // a24.i
    /* renamed from: p7, reason: from getter */
    public java.lang.Integer getF161949q() {
        return this.f161949q;
    }

    @Override // a24.i
    /* renamed from: q7, reason: from getter */
    public boolean getF161948p() {
        return this.f161948p;
    }

    @Override // a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        uh4.c0 c0Var = (uh4.c0) i95.n0.c(uh4.c0.class);
        if (c0Var != null) {
            c0Var.i3(context);
        }
    }
}
