package com.tencent.mm.plugin.textstatus.ui;

@db5.a(4128)
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u000b\u0010\fR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lal5/e0;", "Landroid/view/View;", "e", "Landroid/view/View;", "getLayoutContent", "()Landroid/view/View;", "setLayoutContent", "(Landroid/view/View;)V", "layoutContent", "<init>", "()V", "com/tencent/mm/plugin/textstatus/ui/t5", "com/tencent/mm/plugin/textstatus/ui/u5", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TextStatusDoWhatActivity extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements al5.e0 {
    public static final com.tencent.mm.plugin.textstatus.ui.t5 C = new com.tencent.mm.plugin.textstatus.ui.t5(null);
    public android.view.View A;
    public android.widget.TextView B;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f173513d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.view.View layoutContent;

    /* renamed from: f, reason: collision with root package name */
    public boolean f173515f;

    /* renamed from: h, reason: collision with root package name */
    public lj4.d f173517h;

    /* renamed from: i, reason: collision with root package name */
    public bi4.d1 f173518i;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity$configUpdateListener$1 f173522p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity$statusExptSwitchChangeEventListener$1 f173523q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f173524r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.HashMap f173525s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f173526t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.ui.c6 f173527u;

    /* renamed from: v, reason: collision with root package name */
    public final int f173528v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f173529w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.EditText f173530x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f173531y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.ui.u5 f173532z;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f173516g = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f173519m = true;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f173520n = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.v5(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f173521o = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.w5(this));

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity$configUpdateListener$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity$statusExptSwitchChangeEventListener$1] */
    public TextStatusDoWhatActivity() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f173522p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.StatusIconConfigUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity$configUpdateListener$1
            {
                this.__eventId = -1315263948;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.StatusIconConfigUpdateEvent statusIconConfigUpdateEvent) {
                com.tencent.mm.autogen.events.StatusIconConfigUpdateEvent event = statusIconConfigUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity textStatusDoWhatActivity = com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity.this;
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.textstatus.ui.x5(event, textStatusDoWhatActivity));
                return false;
            }
        };
        this.f173523q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.StatusExptSwitchChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity$statusExptSwitchChangeEventListener$1
            {
                this.__eventId = -926402883;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.StatusExptSwitchChangeEvent statusExptSwitchChangeEvent) {
                com.tencent.mm.autogen.events.StatusExptSwitchChangeEvent event = statusExptSwitchChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.String str = event.f54866g.f8327a;
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivity", "statusExptSwitchChangeEventListener callback: %s", str);
                if (!str.equals("ACTION_NEED_HANDLE_LAST_RESP")) {
                    return false;
                }
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity.this.f173526t = true;
                return false;
            }
        };
        this.f173524r = new java.util.ArrayList();
        this.f173527u = new com.tencent.mm.plugin.textstatus.ui.c6(this);
        this.f173528v = 10;
        this.f173532z = new com.tencent.mm.plugin.textstatus.ui.u5(this);
    }

    public static final void U6(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity textStatusDoWhatActivity, java.lang.String str) {
        if (!textStatusDoWhatActivity.f173515f) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("STATUS_TYPE_CUSTOM_TITLE", textStatusDoWhatActivity.f173516g);
            intent.putExtra("STATUS_TYPE_IMG", str);
            bi4.d1 d1Var = textStatusDoWhatActivity.f173518i;
            intent.putExtra("ClkCustomIconCount", d1Var != null ? d1Var.f354946p : 0);
            bi4.d1 d1Var2 = textStatusDoWhatActivity.f173518i;
            intent.putExtra("CustomTitleTooLongCount", d1Var2 != null ? d1Var2.f354947q : 0);
            intent.putExtra("ACTION_NEED_HANDLE_LAST_RESP", textStatusDoWhatActivity.f173526t);
            textStatusDoWhatActivity.setResult(-1, intent);
            textStatusDoWhatActivity.f173519m = false;
            textStatusDoWhatActivity.finish();
            textStatusDoWhatActivity.getContext().overridePendingTransition(0, com.tencent.mm.R.anim.f477855dd);
            return;
        }
        bi4.d1 d1Var3 = textStatusDoWhatActivity.f173518i;
        if (d1Var3 != null) {
            d1Var3.f354937d.f354975g.f355214e = str;
        } else {
            d1Var3 = new bi4.d1();
            d1Var3.f354937d.f354975g.f355214e = str;
            d1Var3.f354943m = 0L;
            d1Var3.f354941h = "";
            d1Var3.f354942i = 0L;
            d1Var3.f354944n = 0;
            d1Var3.f354945o = 0;
        }
        bi4.d1 d1Var4 = d1Var3;
        if (kotlin.jvm.internal.o.b(str, "userdefine")) {
            d1Var4.f354937d.f354975g.f355218i = textStatusDoWhatActivity.f173516g;
        }
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173566u2.a(textStatusDoWhatActivity, d1Var4, true, textStatusDoWhatActivity.f173526t, (android.os.ResultReceiver) textStatusDoWhatActivity.getIntent().getParcelableExtra("CALLBACK"));
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.textstatus.ui.y5 y5Var = new com.tencent.mm.plugin.textstatus.ui.y5(textStatusDoWhatActivity);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(y5Var, 50L, false);
    }

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        if (z17) {
            android.view.View view = this.f173529w;
            java.lang.Object layoutParams = view != null ? view.getLayoutParams() : null;
            marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i17;
                android.view.View view2 = this.f173529w;
                if (view2 == null) {
                    return;
                }
                view2.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        android.view.View view3 = this.f173529w;
        java.lang.Object layoutParams2 = view3 != null ? view3.getLayoutParams() : null;
        marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = 0;
            android.view.View view4 = this.f173529w;
            if (view4 == null) {
                return;
            }
            view4.setLayoutParams(marginLayoutParams);
        }
    }

    public final void V6() {
        android.text.Editable text;
        java.lang.CharSequence u07;
        android.view.View view = this.f173529w;
        android.widget.Button button = view != null ? (android.widget.Button) view.findViewById(com.tencent.mm.R.id.b0z) : null;
        if (button == null) {
            return;
        }
        android.widget.EditText editText = this.f173530x;
        button.setEnabled(((editText == null || (text = editText.getText()) == null || (u07 = r26.n0.u0(text)) == null) ? 0 : u07.length()) > 0);
    }

    public final android.view.View W6() {
        java.lang.Object value = ((jz5.n) this.f173520n).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void X6() {
        android.view.View view = this.f173529w;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "hideCustomDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "hideCustomDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.A;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "hideCustomDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "hideCustomDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.EditText editText = this.f173530x;
        if (editText != null) {
            editText.setText("");
        }
        hideVKB();
    }

    public final java.util.HashMap Y6(java.util.ArrayList arrayList) {
        lj4.d dVar;
        java.lang.String str;
        java.lang.String str2;
        if (arrayList.isEmpty()) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            in5.c cVar = (in5.c) it.next();
            if ((cVar instanceof lj4.d) && (str = (dVar = (lj4.d) cVar).f318981d) != null && (str2 = dVar.f318982e) != null) {
                hashMap.put(str, str2);
            }
        }
        return hashMap;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        if (this.f173519m) {
            if (this.f173515f) {
                qj4.s.f363958a.k(this.f173518i, 3L);
                android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) ((jz5.n) this.f173521o).getValue();
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
            }
            android.content.Intent intent = new android.content.Intent();
            bi4.d1 d1Var = this.f173518i;
            intent.putExtra("ClkCustomIconCount", d1Var != null ? d1Var.f354946p : 0);
            bi4.d1 d1Var2 = this.f173518i;
            intent.putExtra("CustomTitleTooLongCount", d1Var2 != null ? d1Var2.f354947q : 0);
            setResult(0, intent);
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public int getCustomBounceId() {
        return com.tencent.mm.R.id.m8v;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489561cz3;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        android.view.View view = this.f173529w;
        boolean z17 = false;
        if (view != null && view.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            X6();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        pj4.b0 b0Var;
        o25.n1.f(this);
        super.onCreate(bundle);
        setActionbarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        vj5.o.e(getWindow());
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        setMMTitle("");
        hideActionbarLine();
        hideActionBarOperationArea();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        this.f173513d = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.m8v);
        this.layoutContent = findViewById(com.tencent.mm.R.id.hw8);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("SET_TEXT_PARAMS");
        if (byteArrayExtra != null) {
            bi4.d1 d1Var = new bi4.d1();
            d1Var.parseFrom(byteArrayExtra);
            this.f173518i = d1Var;
        }
        if (this.f173518i == null) {
            this.f173518i = new bi4.d1();
        }
        bi4.d1 d1Var2 = this.f173518i;
        if (d1Var2 != null && (b0Var = d1Var2.f354937d) != null) {
            b0Var.f354986u = bk4.e1.f21460a.f(b0Var.f354986u);
        }
        bi4.d1 d1Var3 = this.f173518i;
        if (d1Var3 == null) {
            finish();
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_CUSTOM_TITLE");
        this.f173516g = stringExtra != null ? stringExtra : "";
        d1Var3.f354943m = c01.id.c();
        pj4.b0 b0Var2 = d1Var3.f354937d;
        bk4.e1 e1Var = bk4.e1.f21460a;
        b0Var2.f354989x = e1Var.a(getIntent().getIntExtra("KEY_DEFAULT_BACKGROUND_ID", e1Var.c()));
        this.f173515f = getIntent().getBooleanExtra("KEY_IS_ENTER", false);
        android.graphics.Bitmap c07 = com.tencent.mm.sdk.platformtools.x.c0(e1Var.b(d1Var3.f354937d.f354989x));
        android.view.View view = this.layoutContent;
        if (view != null) {
            view.setBackground(new android.graphics.drawable.BitmapDrawable(getResources(), c07));
        }
        java.util.ArrayList arrayList = this.f173524r;
        arrayList.addAll(bk4.i.a().g());
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f173513d;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity$buildItemConverts$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return type != -1 ? type != 1 ? new com.tencent.mm.plugin.textstatus.convert.dowhat.m(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity.this.f173527u) : new com.tencent.mm.plugin.textstatus.convert.dowhat.j() : new com.tencent.mm.plugin.textstatus.convert.dowhat.k();
                }
            }, arrayList, false));
        }
        this.f173525s = Y6(arrayList);
        int min = java.lang.Math.min(getWindowManager().getDefaultDisplay().getWidth(), getWindowManager().getDefaultDisplay().getHeight());
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f173513d;
        int paddingLeft = min - (wxRecyclerView2 != null ? wxRecyclerView2.getPaddingLeft() : 0);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f173513d;
        int paddingRight = paddingLeft - (wxRecyclerView3 != null ? wxRecyclerView3.getPaddingRight() : 0);
        float dimension = getResources().getDimension(com.tencent.mm.R.dimen.abd);
        kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
        float dimension2 = getResources().getDimension(com.tencent.mm.R.dimen.abc);
        e0Var.f310115d = dimension2;
        float f17 = (paddingRight + dimension2) / (dimension + dimension2);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(this, (int) f17);
        h0Var.f310123d = gridLayoutManager;
        gridLayoutManager.B = new com.tencent.mm.plugin.textstatus.ui.z5(this, h0Var);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView4 = this.f173513d;
        if (wxRecyclerView4 != null) {
            wxRecyclerView4.setLayoutManager((androidx.recyclerview.widget.RecyclerView.LayoutManager) h0Var.f310123d);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView5 = this.f173513d;
        if (wxRecyclerView5 != null) {
            wxRecyclerView5.N(new com.tencent.mm.plugin.textstatus.ui.a6(e0Var));
        }
        android.view.ViewGroup.LayoutParams layoutParams = W6().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((android.widget.RelativeLayout.LayoutParams) layoutParams).topMargin = com.tencent.mm.ui.bl.h(getContext()) + com.tencent.mm.ui.zk.a(getContext(), 6);
        W6().setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.b6(this));
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_EDUCATION_FLAG_INT;
        boolean z17 = c17.r(u3Var, 1) == 1;
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_NEW_TIPS_SHOW_BOOLEAN;
        boolean o17 = c18.o(u3Var2, false);
        if (z17 && !o17) {
            bi4.d1 d1Var4 = this.f173518i;
            if (d1Var4 != null) {
                d1Var4.f354944n = 1;
            }
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.d9q);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "showEducationLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "showEducationLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView6 = this.f173513d;
            if (wxRecyclerView6 != null) {
                wxRecyclerView6.setVisibility(8);
            }
            android.view.View W6 = W6();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(W6, arrayList3.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "showEducationLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            W6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(W6, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "showEducationLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            gm0.j1.u().c().x(u3Var2, java.lang.Boolean.TRUE);
            gm0.j1.u().c().x(u3Var, 0);
            findViewById(com.tencent.mm.R.id.d9o).setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.g6(this));
        }
        alive();
        alive();
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.TextStatusDoWhatActivity)).Rj(this, iy1.a.TextState);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f173526t && this.f173519m) {
            bk4.i.a().v();
        }
        dead();
        dead();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    public final void setLayoutContent(android.view.View view) {
        this.layoutContent = view;
    }
}
