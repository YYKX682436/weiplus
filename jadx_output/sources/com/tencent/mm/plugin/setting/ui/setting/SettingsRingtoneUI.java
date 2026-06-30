package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class SettingsRingtoneUI extends com.tencent.mm.ui.MMActivity implements java.lang.Runnable, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.media.RingtoneManager f160626d;

    /* renamed from: e, reason: collision with root package name */
    public android.database.Cursor f160627e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.LayoutInflater f160628f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f160629g;

    /* renamed from: h, reason: collision with root package name */
    public int f160630h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f160631i = -1;

    /* renamed from: m, reason: collision with root package name */
    public android.media.Ringtone f160632m;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.clx;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f160629g = new com.tencent.mm.sdk.platformtools.n3();
        this.f160628f = android.view.LayoutInflater.from(this);
        android.media.RingtoneManager ringtoneManager = new android.media.RingtoneManager((android.app.Activity) this);
        this.f160626d = ringtoneManager;
        ringtoneManager.setType(2);
        setVolumeControlStream(5);
        this.f160632m = android.media.RingtoneManager.getRingtone(this, android.media.RingtoneManager.getDefaultUri(2));
        setMMTitle(com.tencent.mm.R.string.iuj);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.gl(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.irq), new com.tencent.mm.plugin.setting.ui.setting.hl(this), null, com.tencent.mm.ui.fb.GREEN);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.mq7);
        android.view.View view = new android.view.View(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
        view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, dimensionPixelSize));
        android.view.View view2 = new android.view.View(this);
        view2.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, dimensionPixelSize));
        view.setClickable(false);
        view2.setClickable(false);
        listView.addHeaderView(view);
        listView.addFooterView(view2);
        this.f160627e = this.f160626d.getCursor();
        listView.setAdapter((android.widget.ListAdapter) new com.tencent.mm.plugin.setting.ui.setting.il(this, this.f160627e));
        listView.setItemsCanFocus(false);
        listView.setOnItemClickListener(this);
        java.lang.String str = (java.lang.String) ip.l.i().second;
        if (str != null) {
            int ringtonePosition = this.f160626d.getRingtonePosition(android.net.Uri.parse(str));
            int i17 = ringtonePosition > -1 ? ringtonePosition + 2 : 1;
            this.f160630h = i17;
            if (i17 == 1) {
                getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).edit().putString("settings.ringtone.name", getString(com.tencent.mm.R.string.iui)).commit();
            }
            this.f160631i = this.f160630h - 1;
        } else {
            this.f160630h = 1;
        }
        listView.setItemChecked(this.f160630h, true);
        listView.setSelection(this.f160630h);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f160629g.removeCallbacks(this);
        android.database.Cursor cursor = this.f160627e;
        if (cursor != null && !cursor.isClosed()) {
            this.f160627e.close();
            this.f160627e = null;
        }
        android.media.RingtoneManager ringtoneManager = this.f160626d;
        if (ringtoneManager != null) {
            try {
                java.lang.reflect.Field declaredField = ringtoneManager.getClass().getDeclaredField("mActivity");
                tx1.a.a(declaredField);
                declaredField.setAccessible(true);
                declaredField.set(ringtoneManager, null);
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException unused) {
            }
        }
        super.onDestroy();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsRingtoneUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f160629g.removeCallbacks(this);
        this.f160631i = i17 - 1;
        this.f160629g.postDelayed(this, 300);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsRingtoneUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return (i17 == 24 || i17 == 25) ? super.onKeyUp(i17, keyEvent) : super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        this.f160626d.stopPreviousRingtone();
        super.onStop();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (isFinishing()) {
            return;
        }
        int i17 = this.f160631i;
        android.media.Ringtone ringtone = i17 == 0 ? this.f160632m : this.f160626d.getRingtone(i17 - 1);
        if (ringtone != null) {
            try {
                ringtone.play();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("RingtonePickerActivity", e17, "play ringtone error", new java.lang.Object[0]);
            }
        }
    }
}
