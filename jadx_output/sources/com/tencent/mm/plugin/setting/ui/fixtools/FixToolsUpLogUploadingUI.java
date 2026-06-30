package com.tencent.mm.plugin.setting.ui.fixtools;

@db5.a(3)
/* loaded from: classes12.dex */
public class FixToolsUpLogUploadingUI extends com.tencent.mm.ui.MMWizardActivity {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f160066q = 0;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f160068f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f160069g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f160070h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f160071i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f160072m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ProgressBar f160073n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f160074o;

    /* renamed from: e, reason: collision with root package name */
    public boolean f160067e = false;

    /* renamed from: p, reason: collision with root package name */
    public final k14.m f160075p = new o14.t(this);

    public final java.lang.String Z6(long j17) {
        return j17 < 0 ? "-" : j17 < 1024 ? java.lang.String.format("%s B", java.lang.Long.valueOf(j17)) : j17 < 1048576 ? java.lang.String.format("%.1f KB", java.lang.Float.valueOf(((float) j17) / 1024.0f)) : j17 < 1073741824 ? java.lang.String.format("%.1f MB", java.lang.Float.valueOf(((float) j17) / 1048576.0f)) : java.lang.String.format("%.1f GB", java.lang.Float.valueOf(((float) j17) / 1.0737418E9f));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ban;
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras() == null || !getIntent().getExtras().getBoolean("MMWizardActivity.WIZARD_ROOT_KILLSELF", false)) {
            setMMTitle(com.tencent.mm.R.string.fa9);
            this.f160070h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.g7e);
            this.f160071i = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.g7_);
            this.f160068f = (android.widget.Button) findViewById(com.tencent.mm.R.id.g79);
            this.f160069g = (android.widget.Button) findViewById(com.tencent.mm.R.id.f485003g75);
            this.f160073n = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.g7a);
            this.f160074o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.g7c);
            this.f160072m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.g7b);
            this.f160071i.setImageResource(com.tencent.mm.R.raw.fix_tools_uplog);
            this.f160070h.setText(com.tencent.mm.R.string.fai);
            this.f160068f.setOnClickListener(new o14.o(this));
            this.f160069g.setOnClickListener(new o14.r(this));
            setBackBtn(new o14.s(this));
            this.f160073n.setVisibility(0);
            this.f160074o.setVisibility(0);
            this.f160068f.setVisibility(8);
            this.f160069g.setVisibility(0);
            k14.n.a().c(this.f160075p, getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_DATE), getIntent().getStringExtra("begin_hour"), getIntent().getStringExtra("end_hour"), com.tencent.mm.sdk.platformtools.t8.u1(getIntent().getStringExtra("KEY_CCNUM"), ""), com.tencent.mm.sdk.platformtools.t8.u1(getIntent().getStringExtra("KEY_PHONENUM"), ""));
            k14.n a17 = k14.n.a();
            java.lang.String[] strArr = {a17.f303362b, a17.f303363c, a17.f303364d};
            if (strArr[0] == null || strArr[1] == null || strArr[2] == null) {
                return;
            }
            this.f160072m.setVisibility(0);
            java.lang.String str = strArr[0];
            int length = str.length();
            if (length >= 8) {
                int i17 = length - 4;
                java.lang.String substring = strArr[0].substring(length - 8, i17);
                int i18 = length - 2;
                str = java.lang.String.format("%s.%s.%s", substring, strArr[0].substring(i17, i18), strArr[0].substring(i18));
            }
            this.f160072m.setText(java.lang.String.format("%s %s~%s", str, strArr[1], strArr[2]));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        W6(1);
        return true;
    }
}
