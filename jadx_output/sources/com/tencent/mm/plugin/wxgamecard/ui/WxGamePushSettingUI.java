package com.tencent.mm.plugin.wxgamecard.ui;

/* loaded from: classes4.dex */
public class WxGamePushSettingUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f188556i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f188557d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ki6 f188558e = new r45.ki6();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f188559f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f188560g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f188561h;

    public final void V6(r45.oi6 oi6Var, h05.i iVar) {
        if (com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mm.sdk.platformtools.u3.h(new h05.g(this, oi6Var, iVar));
            return;
        }
        db5.t7.makeText(this, getString(com.tencent.mm.R.string.f490500wu), 1).show();
        if (iVar != null) {
            iVar.a(false);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.layout.dib;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new h05.a(this));
        com.tencent.mm.ui.LayoutListenerView layoutListenerView = (com.tencent.mm.ui.LayoutListenerView) findViewById(com.tencent.mm.R.id.jlt);
        android.widget.TextView textView = new android.widget.TextView(this);
        this.f188561h = textView;
        textView.setText(com.tencent.mm.R.string.lrr);
        this.f188561h.setGravity(17);
        layoutListenerView.addView(this.f188561h);
        this.f188557d = getPreferenceScreen();
        setMMTitle(com.tencent.mm.R.string.lsf);
        r45.uq3 uq3Var = new r45.uq3();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = uq3Var;
        lVar.f70667d = 1017;
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamepluginappsvr/getuserswitch";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70665b = new r45.vq3();
        com.tencent.mm.modelbase.z2.d(lVar.a(), new h05.e(this), false);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        java.util.LinkedList linkedList = this.f188559f;
        if (linkedList == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxGamePushSettingUI", "onPreferenceTreeClick, SwitchBlockList is null");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxGamePushSettingUI", "onPreferenceTreeClick, key is null");
            return false;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.oi6 oi6Var = (r45.oi6) it.next();
            java.lang.String str2 = oi6Var.f382289d;
            if (str2 == null) {
                str2 = "";
            }
            if (str.equals(str2)) {
                new r45.ji6();
                if (((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N()) {
                    oi6Var.f382290e = true;
                    V6(oi6Var, new h05.b(this, preference));
                } else {
                    oi6Var.f382290e = false;
                    V6(oi6Var, new h05.c(this, preference));
                }
            }
        }
        return false;
    }
}
