package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class wb implements w24.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMNeat7extView f161694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMNeat7extView f161695b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMNeat7extView f161696c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f161697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f161698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f161699f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI f161700g;

    public wb(com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI settingsFontUI, com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView, com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2, com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView3, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.widget.ImageView imageView3) {
        this.f161700g = settingsFontUI;
        this.f161694a = mMNeat7extView;
        this.f161695b = mMNeat7extView2;
        this.f161696c = mMNeat7extView3;
        this.f161697d = imageView;
        this.f161698e = imageView2;
        this.f161699f = imageView3;
    }

    public void a(int i17) {
        float y17;
        float g17;
        k14.o oVar;
        float w17;
        float g18;
        float f17;
        com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI settingsFontUI = this.f161700g;
        settingsFontUI.f160391m = i17;
        androidx.appcompat.app.AppCompatActivity context = settingsFontUI.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FontSizeService", "onChangeFontSize get null");
            oVar = new k14.o();
        } else {
            if (i17 != 0) {
                switch (i17) {
                    case 2:
                        w17 = i65.a.w(context);
                        g17 = j65.f.g() / 360.0f;
                        y17 = w17;
                        break;
                    case 3:
                        w17 = i65.a.z(context);
                        g17 = (j65.f.g() / 360.0f) * 1.12f;
                        y17 = w17;
                        break;
                    case 4:
                        y17 = i65.a.s(context);
                        g18 = j65.f.g() / 340.0f;
                        f17 = 1.125f;
                        g17 = g18 * f17;
                        break;
                    case 5:
                        y17 = i65.a.t(context);
                        g18 = j65.f.g() / 340.0f;
                        f17 = 1.4f;
                        g17 = g18 * f17;
                        break;
                    case 6:
                        y17 = i65.a.u(context);
                        g18 = j65.f.g() / 340.0f;
                        f17 = 1.55f;
                        g17 = g18 * f17;
                        break;
                    case 7:
                        y17 = i65.a.v(context);
                        g18 = j65.f.g() / 340.0f;
                        f17 = 1.65f;
                        g17 = g18 * f17;
                        break;
                    default:
                        i65.a.x(context);
                        g17 = j65.f.g() / 400.0f;
                        y17 = 1.0f;
                        break;
                }
            } else {
                y17 = i65.a.y(context);
                g17 = j65.f.g() / 440.0f;
            }
            if (!i65.a.l(context)) {
                g17 = y17;
            }
            k14.o oVar2 = new k14.o();
            oVar2.f303366a = y17;
            oVar2.f303367b = g17;
            oVar = oVar2;
        }
        settingsFontUI.f160389h = oVar.f303366a;
        settingsFontUI.f160390i = oVar.f303367b;
        this.f161694a.l(0, com.tencent.mm.ui.zk.e(settingsFontUI.getContext(), com.tencent.mm.R.dimen.f479897ia) * settingsFontUI.f160390i);
        this.f161695b.l(0, com.tencent.mm.ui.zk.e(settingsFontUI.getContext(), com.tencent.mm.R.dimen.f479897ia) * settingsFontUI.f160390i);
        this.f161696c.l(0, com.tencent.mm.ui.zk.e(settingsFontUI.getContext(), com.tencent.mm.R.dimen.f479897ia) * settingsFontUI.f160390i);
        settingsFontUI.setMMTitleSize(i65.a.f(context, com.tencent.mm.R.dimen.f479559b) * i65.a.m(context));
        if (i65.a.l(settingsFontUI.getContext())) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI.U6(settingsFontUI, this.f161697d, i17);
            com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI.U6(settingsFontUI, this.f161698e, i17);
            com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI.U6(settingsFontUI, this.f161699f, i17);
        }
    }
}
