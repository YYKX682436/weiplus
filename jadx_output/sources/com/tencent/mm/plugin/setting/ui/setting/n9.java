package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class n9 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.o9 f161353a;

    public n9(com.tencent.mm.plugin.setting.ui.setting.o9 o9Var) {
        this.f161353a = o9Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            l14.a.b(true);
            l14.a.a("care_mode_btn", true);
            if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_LARGE_FONT_BOOLEAN, true)) {
                l14.a.a("large_font_btn", true);
            }
            if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_LISTEN_BOOLEAN, true)) {
                l14.a.a("listen_text_msg_btn", true);
            }
            if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_MUTE_BOOLEAN, true)) {
                l14.a.a("silent_mode_btn", true);
            }
            com.tencent.mm.plugin.setting.ui.setting.o9 o9Var = this.f161353a;
            float n17 = i65.a.n(o9Var.f161384d.getContext());
            o9Var.f161384d.getContext();
            int f17 = j65.c.f(n17);
            com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putFloat("before_care_mode_text_size_scale_key", n17);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            com.tencent.mars.xlog.Log.i("MicroMsg.FontUtil", "TEXT_SIZE_BEFOR_CARE_MODE_KEY put result:%s, currentFont:%s ", bool, java.lang.Float.valueOf(n17));
            com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putInt("before_care_mode_text_size_index_key", f17);
            com.tencent.mars.xlog.Log.i("MicroMsg.FontUtil", "set TEXT_INDEX_BEFOR_CARE_MODE_KEY result:%s, sliderIndex:%s", bool, java.lang.Integer.valueOf(f17));
            androidx.appcompat.app.AppCompatActivity activity = o9Var.f161384d.getContext();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.setting.ui.setting.p8) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.setting.ui.setting.p8.class)).f161429f = true;
            androidx.appcompat.app.AppCompatActivity activity2 = o9Var.f161384d.getContext();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((com.tencent.mm.plugin.setting.ui.setting.p8) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.setting.ui.setting.p8.class)).T6();
        }
    }
}
