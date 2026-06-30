package com.tencent.mm.plugin.setting.ui.setting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsDelAuthUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "com/tencent/mm/plugin/setting/ui/setting/fa", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class SettingsDelAuthUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.fa f160381d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ov6 f160382e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f160383f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f160384g = jz5.h.b(new com.tencent.mm.plugin.setting.ui.setting.ka(this));

    public final g14.b T6() {
        return (g14.b) ((jz5.n) this.f160384g).getValue();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.clb;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        java.lang.String str2 = "";
        setMMTitle("");
        hideActionbarLine();
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.ga(this));
        androidx.recyclerview.widget.RecyclerView settingsAuthItemAuthRecyclerview = T6().f267585g;
        kotlin.jvm.internal.o.f(settingsAuthItemAuthRecyclerview, "settingsAuthItemAuthRecyclerview");
        this.f160381d = new com.tencent.mm.plugin.setting.ui.setting.fa(this, settingsAuthItemAuthRecyclerview);
        androidx.recyclerview.widget.RecyclerView recyclerView = T6().f267585g;
        recyclerView.setAdapter(this.f160381d);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        androidx.recyclerview.widget.i0 i0Var = new androidx.recyclerview.widget.i0(recyclerView.getContext(), 1);
        i0Var.d(recyclerView.getResources().getDrawable(com.tencent.mm.R.drawable.afv));
        recyclerView.N(i0Var);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.plugin.setting.ui.setting.d7) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.setting.ui.setting.d7.class)).f160935d = new com.tencent.mm.plugin.setting.ui.setting.ia(this);
        T6().f267583e.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.ja(this));
        com.tencent.mm.ui.bk.r0(T6().f267584f.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(T6().f267583e.getPaint(), 0.8f);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_user_auth_app");
        if (byteArrayExtra != null) {
            r45.ov6 ov6Var = new r45.ov6();
            ov6Var.parseFrom(byteArrayExtra);
            this.f160382e = ov6Var;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initUserAuthAppInfo appId: ");
        r45.ov6 ov6Var2 = this.f160382e;
        sb6.append(ov6Var2 != null ? ov6Var2.f382560d : null);
        sb6.append(", appName: ");
        r45.ov6 ov6Var3 = this.f160382e;
        sb6.append(ov6Var3 != null ? ov6Var3.f382561e : null);
        sb6.append(", appType: ");
        r45.ov6 ov6Var4 = this.f160382e;
        sb6.append(ov6Var4 != null ? java.lang.Integer.valueOf(ov6Var4.f382562f) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsDelAuthUI", sb6.toString());
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = T6().f267581c;
        r45.ov6 ov6Var5 = this.f160382e;
        java.lang.String str3 = ov6Var5 != null ? ov6Var5.f382561e : null;
        if (str3 == null) {
            str3 = "";
        }
        mMNeat7extView.b(str3);
        android.widget.TextView textView = T6().f267582d;
        r45.ov6 ov6Var6 = this.f160382e;
        if (ov6Var6 != null && (str = ov6Var6.f382565i) != null) {
            str2 = str;
        }
        textView.setText(str2);
        int B = (((i65.a.B(getContext()) - (getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7) * 2)) - getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz)) - getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv)) - getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl);
        int i17 = B / 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsDelAuthUI", "computeViewWidth appName: %s, appType: %s, content: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(B));
        com.tencent.mm.ui.widget.MMNeat7extView settingsAuthAppName = T6().f267581c;
        kotlin.jvm.internal.o.f(settingsAuthAppName, "settingsAuthAppName");
        android.widget.TextView settingsAuthAppType = T6().f267582d;
        kotlin.jvm.internal.o.f(settingsAuthAppType, "settingsAuthAppType");
        k14.k0.a(settingsAuthAppName, settingsAuthAppType, B, i17, i17, false);
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = T6().f267580b;
        r45.ov6 ov6Var7 = this.f160382e;
        if (((ov6Var7 != null ? ov6Var7.f382562f : 0) & 1) != 0) {
            mMRoundCornerImageView.setRadius(mMRoundCornerImageView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.j_));
        } else {
            mMRoundCornerImageView.setRadius(mMRoundCornerImageView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9));
        }
        l01.b bVar = l01.d0.f314761a;
        r45.ov6 ov6Var8 = this.f160382e;
        bVar.a(mMRoundCornerImageView, ov6Var8 != null ? ov6Var8.f382568o : null, com.tencent.mm.R.color.f478542ad, null);
        r45.ov6 ov6Var9 = this.f160382e;
        java.lang.String str4 = ov6Var9 != null ? ov6Var9.f382569p : null;
        if (str4 == null || str4.length() == 0) {
            T6().f267584f.setText(getResources().getString(com.tencent.mm.R.string.ipi));
        } else {
            android.widget.TextView textView2 = T6().f267584f;
            r45.ov6 ov6Var10 = this.f160382e;
            textView2.setText(ov6Var10 != null ? ov6Var10.f382569p : null);
        }
        r45.ov6 ov6Var11 = this.f160382e;
        java.util.List list = ov6Var11 != null ? ov6Var11.f382563g : null;
        if (list == null) {
            list = new java.util.ArrayList();
        }
        com.tencent.mm.plugin.setting.ui.setting.fa faVar = this.f160381d;
        if (faVar != null) {
            java.util.List a17 = k14.j0.a(list);
            java.util.ArrayList arrayList = (java.util.ArrayList) faVar.f161030f;
            arrayList.clear();
            arrayList.addAll(a17);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsDelAuthUI", "setAuthScopeList final size: " + arrayList.size() + ", originSize: " + list.size());
            faVar.f161029e.setVisibility(arrayList.isEmpty() ^ true ? 0 : 8);
            faVar.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.plugin.setting.ui.setting.d7) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.setting.ui.setting.d7.class)).f160935d = null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(com.tencent.mm.plugin.setting.ui.setting.d7.class);
    }
}
