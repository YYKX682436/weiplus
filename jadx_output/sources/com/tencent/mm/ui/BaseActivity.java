package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f196587y = 0;
    private android.view.View actionbarView;

    /* renamed from: d, reason: collision with root package name */
    public androidx.appcompat.app.b f196588d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f196589e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f196590f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f196591g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f196592h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f196593i;

    /* renamed from: m, reason: collision with root package name */
    public android.content.Context f196594m;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f196596o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f196597p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f196598q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.MenuItem f196599r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.MenuItem f196600s;

    /* renamed from: t, reason: collision with root package name */
    public int f196601t;

    /* renamed from: u, reason: collision with root package name */
    public int f196602u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.r1 f196603v;

    /* renamed from: n, reason: collision with root package name */
    public int f196595n = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f196604w = false;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f196605x = new java.util.LinkedList();

    private void S6() {
        android.widget.TextView textView = this.f196589e;
        if (textView == null) {
            return;
        }
        if (this.f196604w) {
            textView.setTextColor(this.f196594m.getResources().getColor(com.tencent.mm.R.color.by));
        } else {
            textView.setTextColor(this.f196594m.getResources().getColor(com.tencent.mm.R.color.f478599bx));
        }
    }

    public void O6(int i17, int i18, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener, com.tencent.mm.ui.r1 r1Var) {
        java.util.LinkedList linkedList;
        com.tencent.mm.ui.q1 q1Var = new com.tencent.mm.ui.q1();
        q1Var.f209527a = i17;
        q1Var.f209528b = i18;
        q1Var.f209529c = str;
        q1Var.f209534h = onMenuItemClickListener;
        q1Var.f209535i = onLongClickListener;
        q1Var.f209533g = r1Var;
        if (i18 == com.tencent.mm.R.drawable.bu_ && (str == null || str.length() <= 0)) {
            q1Var.f209529c = getString(com.tencent.mm.R.string.f489812cf);
        }
        int i19 = q1Var.f209527a;
        int i27 = 0;
        while (true) {
            linkedList = this.f196605x;
            if (i27 >= linkedList.size()) {
                break;
            }
            if (((com.tencent.mm.ui.q1) linkedList.get(i27)).f209527a == i19) {
                com.tencent.mm.ui.yk.a("BaseActivity", "match menu, id ：" + i19 + ", remove it", new java.lang.Object[0]);
                linkedList.remove(i27);
                break;
            }
            i27++;
        }
        linkedList.add(q1Var);
        new android.os.Handler().postDelayed(new com.tencent.mm.ui.o1(this), 200L);
    }

    public void P6(int i17) {
        if (this.f196588d == null) {
            return;
        }
        this.f196595n = i17;
        this.f196604w = com.tencent.mm.ui.uk.g(i17);
        this.f196588d.w(new android.graphics.drawable.ColorDrawable(this.f196595n));
        getWindow().setStatusBarColor(this.f196595n);
        android.view.View decorView = getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(this.f196604w ? systemUiVisibility & (-8193) : systemUiVisibility | 8192);
        if (this.f196604w) {
            this.f196593i.setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        } else {
            this.f196593i.setColorFilter(-16777216, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
        R6();
        S6();
        android.widget.TextView textView = this.f196590f;
        if (textView != null) {
            if (this.f196604w) {
                textView.setTextColor(this.f196594m.getResources().getColor(com.tencent.mm.R.color.f478596bu));
            } else {
                textView.setTextColor(this.f196594m.getResources().getColor(com.tencent.mm.R.color.f478595bt));
            }
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f196597p;
        if (weImageView == null) {
            return;
        }
        if (this.f196604w) {
            weImageView.setImageResource(com.tencent.mm.R.drawable.bue);
        } else {
            weImageView.setImageResource(com.tencent.mm.R.drawable.bua);
        }
    }

    public void Q6(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i17, com.tencent.mm.ui.p1 p1Var) {
        androidx.appcompat.app.b bVar = this.f196588d;
        if (bVar == null) {
            return;
        }
        if (onMenuItemClickListener == null) {
            bVar.B(false);
        } else {
            bVar.B(false);
            android.view.View view = this.f196592h;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/BaseActivity", "setBackBtn", "(Landroid/view/MenuItem$OnMenuItemClickListener;ILcom/tencent/mm/ui/BaseActivity$LeftIconStyle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/BaseActivity", "setBackBtn", "(Landroid/view/MenuItem$OnMenuItemClickListener;ILcom/tencent/mm/ui/BaseActivity$LeftIconStyle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f196592h.setOnClickListener(new com.tencent.mm.ui.k1(this, onMenuItemClickListener));
            }
        }
        if (i17 != 0) {
            this.f196601t = i17;
        }
        if (p1Var == com.tencent.mm.ui.p1.NONE) {
            this.f196601t = 0;
        }
        if (p1Var == com.tencent.mm.ui.p1.BACK) {
            this.f196601t = com.tencent.mm.R.drawable.bu7;
        } else if (p1Var == com.tencent.mm.ui.p1.CLOSE) {
            this.f196601t = com.tencent.mm.R.drawable.bu9;
        }
        android.widget.ImageView imageView = this.f196593i;
        if (imageView != null && this.f196601t != 0) {
            imageView.setVisibility(0);
            this.f196593i.setImageResource(this.f196601t);
        }
        if (this.f196604w) {
            this.f196593i.setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        } else {
            this.f196593i.setColorFilter(-16777216, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
    }

    public final void R6() {
        int i17;
        com.tencent.mm.ui.r1 r1Var = this.f196603v;
        if (r1Var == com.tencent.mm.ui.r1.TEXT) {
            android.widget.TextView textView = this.f196598q;
            if (textView == null) {
                return;
            }
            if (this.f196604w) {
                textView.setTextColor(this.f196594m.getResources().getColorStateList(com.tencent.mm.R.color.f479552ab3));
                return;
            } else {
                textView.setTextColor(this.f196594m.getResources().getColorStateList(com.tencent.mm.R.color.f478722fd));
                return;
            }
        }
        if (r1Var == com.tencent.mm.ui.r1.ADD) {
            this.f196602u = com.tencent.mm.R.drawable.bu6;
        } else if (r1Var == com.tencent.mm.ui.r1.MORE) {
            this.f196602u = com.tencent.mm.R.drawable.bu_;
        } else if (r1Var == com.tencent.mm.ui.r1.SEARCH) {
            this.f196602u = com.tencent.mm.R.drawable.bua;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f196596o;
        if (weImageView == null || (i17 = this.f196602u) == 0) {
            return;
        }
        weImageView.setImageResource(i17);
        if (this.f196604w) {
            this.f196596o.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        } else {
            this.f196596o.getDrawable().setColorFilter(-16777216, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
    }

    public abstract int getLayoutId();

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setTheme(getApplicationContext().getSharedPreferences("SETTING_COLOR", 0).getInt("APP_THEME_COLOR", -16777216));
        setContentView(getLayoutId());
        this.f196594m = this;
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        this.f196588d = supportActionBar;
        if (supportActionBar != null) {
            supportActionBar.I(new android.graphics.drawable.ColorDrawable(getResources().getColor(android.R.color.transparent)));
            this.f196588d.F(false);
            this.f196588d.B(false);
            this.f196588d.E(false);
            this.f196588d.D(true);
            this.f196588d.y(android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.f487917bj, (android.view.ViewGroup) null));
            if (this.f196595n == 0) {
                this.f196595n = com.tencent.mm.ui.zk.c(this.f196594m, com.tencent.mm.R.attr.f478095aj);
            }
            this.f196604w = com.tencent.mm.ui.uk.g(this.f196595n);
            this.f196588d.w(new android.graphics.drawable.ColorDrawable(this.f196595n));
            this.f196589e = (android.widget.TextView) findViewById(android.R.id.text1);
            this.f196590f = (android.widget.TextView) findViewById(android.R.id.text2);
            this.f196591g = findViewById(com.tencent.mm.R.id.oct);
            this.f196592h = findViewById(com.tencent.mm.R.id.actionbar_up_indicator);
            this.f196593i = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.actionbar_up_indicator_btn);
            Q6(new com.tencent.mm.ui.j1(this), 0, com.tencent.mm.ui.p1.BACK);
        }
        com.tencent.mm.ui.zk.e(this.f196594m, com.tencent.mm.R.dimen.f479623ay);
        com.tencent.mm.ui.zk.e(this.f196594m, com.tencent.mm.R.dimen.f479915iu);
        if (this.f196595n == 0) {
            this.f196595n = com.tencent.mm.ui.zk.c(this.f196594m, com.tencent.mm.R.attr.f478095aj);
        }
        android.view.Window window = getWindow();
        window.clearFlags(201326592);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(this.f196595n);
        android.view.View decorView = getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(this.f196604w ? systemUiVisibility & (-8193) : systemUiVisibility | 8192);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        java.util.LinkedList linkedList = this.f196605x;
        com.tencent.mm.ui.yk.a("BaseActivity", "on create option menu, menuCache size:%d", java.lang.Integer.valueOf(linkedList.size()));
        boolean z17 = false;
        if (this.f196588d == null || linkedList.size() == 0) {
            com.tencent.mm.ui.yk.f("BaseActivity", "error, mActionBar is null or cache size:%d", java.lang.Integer.valueOf(linkedList.size()));
        } else {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.ui.q1 q1Var = (com.tencent.mm.ui.q1) it.next();
                int i17 = q1Var.f209527a;
                if (i17 != 16908332) {
                    if (q1Var.f209533g == com.tencent.mm.ui.r1.SEARCH) {
                        this.f196599r = menu.add(0, i17, 0, q1Var.f209529c);
                        com.tencent.mm.ui.l1 l1Var = new com.tencent.mm.ui.l1(this, q1Var);
                        if (q1Var.f209532f == null) {
                            q1Var.f209532f = android.view.View.inflate(this.f196594m, com.tencent.mm.R.layout.f487907b9, null);
                        }
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) q1Var.f209532f.findViewById(com.tencent.mm.R.id.f482482fq);
                        this.f196597p = weImageView;
                        weImageView.setVisibility(0);
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f196597p;
                        if (weImageView2 != null) {
                            if (this.f196604w) {
                                weImageView2.setImageResource(com.tencent.mm.R.drawable.bue);
                            } else {
                                weImageView2.setImageResource(com.tencent.mm.R.drawable.bua);
                            }
                        }
                        this.f196597p.setOnClickListener(l1Var);
                        this.f196597p.setEnabled(true);
                        this.f196599r.setActionView(q1Var.f209532f);
                        this.f196599r.setEnabled(true);
                        this.f196599r.setVisible(true);
                    } else {
                        this.f196600s = menu.add(0, i17, 0, q1Var.f209529c);
                        com.tencent.mm.ui.m1 m1Var = new com.tencent.mm.ui.m1(this, q1Var);
                        com.tencent.mm.ui.n1 n1Var = new com.tencent.mm.ui.n1(this, q1Var);
                        com.tencent.mm.ui.r1 r1Var = q1Var.f209533g;
                        this.f196603v = r1Var;
                        com.tencent.mm.ui.r1 r1Var2 = com.tencent.mm.ui.r1.GREEN_TEXT;
                        if (r1Var == r1Var2 || r1Var == com.tencent.mm.ui.r1.TEXT) {
                            if (q1Var.f209530d == null) {
                                q1Var.f209530d = android.view.View.inflate(this.f196594m, com.tencent.mm.R.layout.f487907b9, null);
                            }
                            android.widget.TextView textView = (android.widget.TextView) q1Var.f209530d.findViewById(com.tencent.mm.R.id.f482486fu);
                            this.f196598q = textView;
                            textView.setVisibility(0);
                            this.f196598q.setText(q1Var.f209529c);
                            if (q1Var.f209533g == r1Var2) {
                                this.f196598q.setTextColor(this.f196594m.getResources().getColorStateList(com.tencent.mm.R.color.f478737fs));
                            } else {
                                R6();
                            }
                            this.f196598q.setOnClickListener(m1Var);
                            this.f196598q.setOnLongClickListener(n1Var);
                            this.f196598q.setEnabled(true);
                            this.f196600s.setActionView(q1Var.f209530d);
                        } else {
                            int i18 = q1Var.f209528b;
                            if (i18 != 0) {
                                this.f196602u = i18;
                            }
                            if (r1Var == com.tencent.mm.ui.r1.NONE) {
                                this.f196602u = 0;
                            }
                            if (q1Var.f209531e == null) {
                                q1Var.f209531e = android.view.View.inflate(this.f196594m, com.tencent.mm.R.layout.f487907b9, null);
                            }
                            this.f196596o = (com.tencent.mm.ui.widget.imageview.WeImageView) q1Var.f209531e.findViewById(com.tencent.mm.R.id.f482482fq);
                            R6();
                            if (this.f196602u != 0) {
                                this.f196596o.setVisibility(0);
                                this.f196596o.setOnClickListener(m1Var);
                                this.f196596o.setOnLongClickListener(n1Var);
                                this.f196596o.setEnabled(true);
                                this.f196600s.setActionView(q1Var.f209531e);
                            }
                        }
                        this.f196600s.setEnabled(true);
                        this.f196600s.setVisible(true);
                        android.view.MenuItem menuItem = this.f196600s;
                        if (menuItem != null) {
                            menuItem.setShowAsAction(2);
                        }
                    }
                }
            }
            android.view.MenuItem menuItem2 = this.f196599r;
            if (menuItem2 != null) {
                menuItem2.setShowAsAction(2);
            }
            z17 = true;
        }
        if (z17) {
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public void setTitle(java.lang.CharSequence charSequence) {
        android.widget.TextView textView;
        if (this.f196588d == null || (textView = this.f196589e) == null) {
            return;
        }
        textView.setText(charSequence.toString());
        S6();
    }
}
