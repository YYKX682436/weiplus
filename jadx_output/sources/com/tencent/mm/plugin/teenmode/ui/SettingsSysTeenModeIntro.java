package com.tencent.mm.plugin.teenmode.ui;

@db5.a(1)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-teenmode_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingsSysTeenModeIntro extends com.tencent.mm.ui.MMActivity {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f172832s = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f172833d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f172834e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f172835f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f172836g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f172837h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f172838i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f172839m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f172840n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f172841o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f172842p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f172843q = true;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f172844r = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.j3(this));

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, com.tencent.mm.R.anim.f477848d6);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.enu;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return super.importUIComponents();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String str = "";
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.actionbar_up_indicator);
        this.f172836g = findViewById;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c01.e2.a0();
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.vct);
        kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f172841o = textView;
        com.tencent.mm.ui.fk.b(textView);
        if (this.f172838i) {
            android.widget.TextView textView2 = this.f172841o;
            if (textView2 != null) {
                textView2.setText(getString(com.tencent.mm.R.string.olb));
            }
        } else if (this.f172839m) {
            android.widget.TextView textView3 = this.f172841o;
            if (textView3 != null) {
                textView3.setText(getString(com.tencent.mm.R.string.f493333ol5));
            }
        } else if (this.f172843q) {
            android.widget.TextView textView4 = this.f172841o;
            if (textView4 != null) {
                textView4.setText(getString(com.tencent.mm.R.string.okz));
            }
        } else {
            android.widget.TextView textView5 = this.f172841o;
            if (textView5 != null) {
                textView5.setText(getString(com.tencent.mm.R.string.oll));
            }
        }
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.nzu);
        kotlin.jvm.internal.o.e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        this.f172833d = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.vcr);
        kotlin.jvm.internal.o.e(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        this.f172834e = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.vcn);
        kotlin.jvm.internal.o.e(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
        this.f172835f = (android.widget.TextView) findViewById5;
        android.widget.TextView textView6 = this.f172834e;
        if (textView6 != null) {
            int P3 = ((uh4.c0) i95.n0.c(uh4.c0.class)).P3(getContext());
            if (P3 == 1) {
                str = "0~2 岁";
            } else if (P3 == 2) {
                str = "3~7 岁";
            } else if (P3 == 3) {
                str = "8~11 岁";
            } else if (P3 == 4) {
                str = "12~15 岁";
            } else if (P3 == 5) {
                str = "16~17 岁";
            }
            textView6.setText(getString(com.tencent.mm.R.string.old, str));
        }
        if (this.f172838i) {
            android.widget.TextView textView7 = this.f172835f;
            if (textView7 != null) {
                textView7.setVisibility(0);
            }
            if (this.f172840n) {
                android.widget.TextView textView8 = this.f172834e;
                if (textView8 != null) {
                    textView8.setVisibility(0);
                }
                android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.vco);
                if (findViewById6 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById6, arrayList2.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById6, "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.vcp);
                if (findViewById7 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById7, arrayList3.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById7.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById7, "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                android.widget.TextView textView9 = this.f172833d;
                if (textView9 != null) {
                    textView9.setGravity(17);
                }
                android.widget.TextView textView10 = this.f172834e;
                if (textView10 != null) {
                    textView10.setVisibility(8);
                }
                android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.vco);
                if (findViewById8 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(findViewById8, arrayList4.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById8.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(findViewById8, "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.vcp);
                if (findViewById9 != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(findViewById9, arrayList5.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById9.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(findViewById9, "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else {
            android.widget.TextView textView11 = this.f172835f;
            if (textView11 != null) {
                textView11.setVisibility(4);
            }
        }
        if (this.f172838i) {
            java.lang.String string = getString(com.tencent.mm.R.string.oli);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = getString(com.tencent.mm.R.string.oli);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            int P = r26.n0.P(string, string2, 0, false, 6, null);
            if (P < 0) {
                return;
            }
            int length = string2.length() + P;
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string);
            spannableStringBuilder.setSpan(new com.tencent.mm.plugin.teenmode.ui.g3(this), P, length, 18);
            android.widget.TextView textView12 = this.f172835f;
            if (textView12 != null) {
                textView12.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this));
            }
            android.widget.TextView textView13 = this.f172835f;
            if (textView13 != null) {
                textView13.setClickable(true);
            }
            android.widget.TextView textView14 = this.f172835f;
            if (textView14 != null) {
                textView14.setText(spannableStringBuilder);
            }
        } else {
            if (this.f172839m) {
                android.widget.TextView textView15 = this.f172833d;
                if (textView15 != null) {
                    textView15.setText(getString(com.tencent.mm.R.string.olh));
                }
                android.widget.TextView textView16 = this.f172833d;
                if (textView16 != null) {
                    textView16.setGravity(17);
                }
            } else {
                android.widget.TextView textView17 = this.f172833d;
                if (textView17 != null) {
                    textView17.setVisibility(8);
                }
            }
            android.widget.TextView textView18 = this.f172834e;
            if (textView18 != null) {
                textView18.setVisibility(8);
            }
            android.widget.TextView textView19 = this.f172835f;
            if (textView19 != null) {
                textView19.setVisibility(4);
            }
        }
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.vcy);
        kotlin.jvm.internal.o.e(findViewById10, "null cannot be cast to non-null type android.widget.Button");
        android.widget.Button button = (android.widget.Button) findViewById10;
        this.f172842p = button;
        button.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.h3(this));
        if (this.f172838i || !this.f172839m) {
            android.widget.Button button2 = this.f172842p;
            if (button2 != null) {
                button2.setVisibility(8);
            }
        } else {
            android.widget.Button button3 = this.f172842p;
            if (button3 != null) {
                button3.setVisibility(0);
            }
        }
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.nzr);
        kotlin.jvm.internal.o.e(findViewById11, "null cannot be cast to non-null type android.widget.Button");
        android.widget.Button button4 = (android.widget.Button) findViewById11;
        this.f172837h = button4;
        if (this.f172839m) {
            button4.setText(getString(com.tencent.mm.R.string.ol6));
        } else if (this.f172838i) {
            button4.setText(getString(com.tencent.mm.R.string.olf));
        } else {
            button4.setText(getString(com.tencent.mm.R.string.olf));
            ((uh4.c0) i95.n0.c(uh4.c0.class)).C5();
            uh4.c0.getService().T(36);
        }
        android.widget.Button button5 = this.f172837h;
        if (button5 != null) {
            com.tencent.mm.ui.fk.a(button5);
        }
        android.widget.Button button6 = this.f172837h;
        if (button6 != null) {
            button6.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.i3(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if ((i17 == 100 && i18 == -1) || (i17 == 101 && i18 == -1)) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).C5();
            uh4.c0.getService().T(36);
            android.content.Intent intent2 = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.SettingsSysTeenModeIntro.class);
            com.tencent.mm.plugin.teenmode.ui.a6 a6Var = new com.tencent.mm.plugin.teenmode.ui.a6();
            a6Var.o(false);
            intent2.putExtra("IntentKey_TeenModeIntroData", a6Var.toXml());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        overridePendingTransition(com.tencent.mm.R.anim.f477843d1, com.tencent.mm.R.anim.f477848d6);
        super.onCreate(bundle);
        java.lang.String str = "";
        setMMTitle("");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_NEED_NOTICE_STATE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        jz5.g gVar = this.f172844r;
        this.f172838i = ((com.tencent.mm.plugin.teenmode.ui.a6) ((jz5.n) gVar).getValue()).n();
        this.f172839m = uh4.c0.getService().isTeenMode() && !uh4.c0.getService().Yd();
        this.f172843q = ((com.tencent.mm.plugin.teenmode.ui.a6) ((jz5.n) gVar).getValue()).j();
        this.f172840n = ((com.tencent.mm.plugin.teenmode.ui.a6) ((jz5.n) gVar).getValue()).l();
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenMode.SettingsSysTeenModeIntro", "[" + hashCode() + "]isSysTeenModeOpen: " + this.f172838i + ", isTeenModeManualOpen: " + this.f172839m + ", isCloseWithSys: " + this.f172843q + ", isSysAgeChanged: " + this.f172840n);
        if (!((com.tencent.mm.plugin.teenmode.ui.a6) ((jz5.n) gVar).getValue()).k()) {
            initView();
            if (this.f172838i) {
                ((uh4.c0) i95.n0.c(uh4.c0.class)).K4();
                return;
            }
            return;
        }
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.actionbar_up_indicator);
        this.f172836g = findViewById;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initAgeChangeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initAgeChangeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c01.e2.a0();
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.vct);
        kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f172841o = textView;
        com.tencent.mm.ui.fk.b(textView);
        android.widget.TextView textView2 = this.f172841o;
        if (textView2 != null) {
            int P3 = ((uh4.c0) i95.n0.c(uh4.c0.class)).P3(getContext());
            if (P3 == 1) {
                str = "0~2 岁";
            } else if (P3 == 2) {
                str = "3~7 岁";
            } else if (P3 == 3) {
                str = "8~11 岁";
            } else if (P3 == 4) {
                str = "12~15 岁";
            } else if (P3 == 5) {
                str = "16~17 岁";
            }
            textView2.setText(getString(com.tencent.mm.R.string.ole, str));
        }
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.nzr);
        kotlin.jvm.internal.o.e(findViewById3, "null cannot be cast to non-null type android.widget.Button");
        android.widget.Button button = (android.widget.Button) findViewById3;
        this.f172837h = button;
        button.setText(getString(com.tencent.mm.R.string.olf));
        android.widget.Button button2 = this.f172837h;
        if (button2 != null) {
            button2.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.f3(this));
        }
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.nzu);
        kotlin.jvm.internal.o.e(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById4;
        this.f172833d = textView3;
        textView3.setVisibility(8);
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.vcr);
        kotlin.jvm.internal.o.e(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView4 = (android.widget.TextView) findViewById5;
        this.f172834e = textView4;
        textView4.setVisibility(8);
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.vcp);
        if (findViewById6 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById6, arrayList2.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initAgeChangeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initAgeChangeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.vcy);
        kotlin.jvm.internal.o.e(findViewById7, "null cannot be cast to non-null type android.widget.Button");
        android.widget.Button button3 = (android.widget.Button) findViewById7;
        this.f172842p = button3;
        button3.setVisibility(8);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenMode.SettingsSysTeenModeIntro", "onDestroy: triggerSync");
        ((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().h(7);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z17) {
    }
}
