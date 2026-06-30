package com.tencent.mm.plugin.gallery.ui;

@db5.a(19)
/* loaded from: classes10.dex */
public class SmartGalleryUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f138621w = 0;

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f138622d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f138623e;

    /* renamed from: f, reason: collision with root package name */
    public e33.y5 f138624f;

    /* renamed from: g, reason: collision with root package name */
    public e33.g6 f138625g;

    /* renamed from: h, reason: collision with root package name */
    public e33.b6 f138626h;

    /* renamed from: i, reason: collision with root package name */
    public e33.i6 f138627i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f138628m;

    /* renamed from: n, reason: collision with root package name */
    public int f138629n;

    /* renamed from: o, reason: collision with root package name */
    public int f138630o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f138631p;

    /* renamed from: r, reason: collision with root package name */
    public android.app.ProgressDialog f138633r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.recyclerview.widget.i0 f138634s;

    /* renamed from: q, reason: collision with root package name */
    public boolean f138632q = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f138635t = true;

    /* renamed from: u, reason: collision with root package name */
    public final e33.z5 f138636u = new e33.s5(this);

    /* renamed from: v, reason: collision with root package name */
    public boolean f138637v = false;

    public static void T6(com.tencent.mm.plugin.gallery.ui.SmartGalleryUI smartGalleryUI, java.lang.String str, boolean z17) {
        smartGalleryUI.f138632q = true;
        if (z17) {
            smartGalleryUI.hideVKB();
            smartGalleryUI.f138623e.clearFocus();
        }
        smartGalleryUI.f138622d.S0(smartGalleryUI.f138634s);
        smartGalleryUI.f138626h.f247163d = str;
        t23.y0 n17 = t23.p0.n();
        e33.b6 b6Var = smartGalleryUI.f138626h;
        java.util.concurrent.ExecutorService executorService = n17.f415305f;
        if (executorService != null) {
            ((ku5.f) executorService).execute(b6Var);
        }
    }

    public final void U6() {
        android.net.Uri uri = t23.o2.f415216e;
        int size = ((java.util.ArrayList) t23.n2.f415209a.f415220d).size();
        if (size > 0) {
            this.f138628m.setEnabled(true);
        } else {
            this.f138628m.setEnabled(false);
        }
        this.f138628m.setText(j33.d0.i(this, this.f138629n, size, this.f138630o, this.f138631p, false, null, true, false));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489477co4;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryUI", "requestCode: %d, resultCode: %d.", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("send_raw_img", false);
            this.f138637v = booleanExtra;
            intent.putExtra("send_raw_img", booleanExtra);
            android.os.Bundle extras = intent.getExtras();
            if (extras != null) {
                for (java.lang.String str : extras.keySet()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryUI", "key: %s, value: %s.", str, extras.get(str));
                }
            }
        }
        if (1 == i17) {
            if (-2 == i18 || i18 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryUI", "just back from AlbumPreviewUI.");
                U6();
            } else {
                setResult(i18, intent);
                finish();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f138629n = getIntent().getIntExtra("query_source_type", 3);
        this.f138630o = getIntent().getIntExtra("max_select_count", 9);
        this.f138631p = getIntent().getStringExtra("album_business_tag");
        this.f138637v = getIntent().getBooleanExtra("send_raw_img", false);
        com.tencent.mm.ui.widget.dialog.u3 c17 = com.tencent.mm.ui.widget.dialog.u3.c(this, getString(com.tencent.mm.R.string.f490604zq), true, 0, null);
        this.f138633r = c17;
        c17.show();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f479163rn));
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f479163rn));
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.f487906b8, (android.view.ViewGroup) new android.widget.LinearLayout(this), false);
        inflate.findViewById(com.tencent.mm.R.id.n0m).setOnClickListener(new e33.m5(this));
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.n0o);
        this.f138623e = editText;
        editText.setOnTouchListener(new e33.n5(this));
        this.f138623e.setOnEditorActionListener(new e33.o5(this));
        this.f138623e.addTextChangedListener(new e33.p5(this));
        this.f138628m = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.n0p);
        U6();
        this.f138628m.setOnClickListener(new e33.q5(this));
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.I(new android.graphics.drawable.ColorDrawable(getContext().getResources().getColor(android.R.color.transparent)));
            supportActionBar.F(false);
            supportActionBar.B(false);
            supportActionBar.E(false);
            supportActionBar.D(true);
            supportActionBar.y(inflate);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SmartGalleryUI", "actionbar is null.");
        }
        androidx.recyclerview.widget.i0 i0Var = new androidx.recyclerview.widget.i0(this, 1);
        this.f138634s = i0Var;
        i0Var.d(getResources().getDrawable(com.tencent.mm.R.drawable.b0n));
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.n0n);
        this.f138622d = recyclerView;
        recyclerView.i(new e33.r5(this));
        this.f138622d.N(this.f138634s);
        e33.y5 y5Var = new e33.y5(this);
        this.f138624f = y5Var;
        e33.z5 z5Var = this.f138636u;
        y5Var.f247557f = z5Var;
        e33.g6 g6Var = new e33.g6(this);
        this.f138625g = g6Var;
        g6Var.f247239f = z5Var;
        this.f138622d.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        this.f138622d.setAdapter(this.f138624f);
        e33.i6 i6Var = new e33.i6(this.f138622d, this.f138625g);
        this.f138627i = i6Var;
        this.f138626h = new e33.b6(i6Var);
        t23.y0 n17 = t23.p0.n();
        e33.a6 a6Var = new e33.a6(this.f138624f, this.f138633r, this.f138623e);
        java.util.concurrent.ExecutorService executorService = n17.f415305f;
        if (executorService != null) {
            ((ku5.f) executorService).execute(a6Var);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.net.Uri uri = t23.o2.f415216e;
        t23.o2 o2Var = t23.n2.f415209a;
        o2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryQueryUtil", "clearSelectedMediaPath");
        ((java.util.ArrayList) o2Var.f415220d).clear();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (4 != i17 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.J0(this.f138623e.getText())) {
            this.f138623e.setText("");
            return true;
        }
        setResult(-2, getIntent().putExtra("send_raw_img", this.f138637v));
        finish();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f138623e.clearFocus();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        U6();
    }
}
