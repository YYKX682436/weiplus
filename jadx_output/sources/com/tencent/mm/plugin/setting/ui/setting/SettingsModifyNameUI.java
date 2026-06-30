package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class SettingsModifyNameUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f160546d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f160547e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f160548f = false;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f160549g = "";

    @Override // ck5.e
    public void R5(java.lang.String str) {
        db5.e1.i(this, com.tencent.mm.R.string.it9, com.tencent.mm.R.string.itb);
    }

    @Override // ck5.e
    public void c1(java.lang.String text) {
        com.tencent.mars.xlog.Log.i("MiroMsg.SettingsModifyNameUI", "Set New NickName : " + text);
        this.f160547e = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.bcr), false, false, null);
        if (this.f160548f) {
            com.tencent.mars.xlog.Log.i("MiroMsg.SettingsModifyNameUI", "updateChatBotRemarkName " + text);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f160549g, true).n1(text);
            r45.r26 r26Var = new r45.r26();
            r26Var.set(0, this.f160549g);
            r26Var.set(1, text);
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).d(new xg3.a(24, 3, r26Var), new com.tencent.mm.plugin.setting.ui.setting.ni(this), null);
            return;
        }
        v14.v vVar = (v14.v) pf5.z.f353948a.a(this).a(v14.v.class);
        com.tencent.mm.ui.widget.dialog.u3 dialog = this.f160547e;
        vVar.getClass();
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(dialog, "dialog");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = vVar.f432587d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        vVar.f432587d = dialog;
        vVar.f432588e = text;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).e(new e21.s(text, 1));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cls;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        boolean z17 = this.f160548f;
        int i17 = !z17 ? 1 : 0;
        if (z17) {
            setMMTitle(com.tencent.mm.R.string.phr);
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.f486872mq2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            setMMTitle(com.tencent.mm.R.string.it8);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById(com.tencent.mm.R.id.f486871mq1);
        this.f160546d = mMEditText;
        if (this.f160548f) {
            this.f160546d.setText(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f160549g, true).g2());
        } else {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(4, null);
            float textSize = this.f160546d.getTextSize();
            ((ke0.e) xVar).getClass();
            mMEditText.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str, textSize));
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f160546d;
        mMEditText2.setSelection(mMEditText2.getText().length());
        this.f160546d.addTextChangedListener(new com.tencent.mm.plugin.setting.ui.setting.ki(this));
        ck5.f b17 = ck5.f.b(this.f160546d);
        b17.f42561f = i17;
        b17.f42560e = 32;
        b17.f42556a = false;
        b17.d(null);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490547y6), new com.tencent.mm.plugin.setting.ui.setting.li(this, i17), null, com.tencent.mm.ui.fb.GREEN);
        enableOptionMenu(false);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.mi(this));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f160548f = getIntent().getBooleanExtra("FROM_CHATBOT", false);
        java.lang.String stringExtra = getIntent().getStringExtra("CHATBOT_USERNAME");
        this.f160549g = stringExtra;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f160549g = stringExtra;
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(v14.v.class);
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        db5.e1.i(this, com.tencent.mm.R.string.it_, com.tencent.mm.R.string.itb);
    }
}
