package com.tencent.mm.plugin.voiceprint.ui;

@ul5.d(0)
/* loaded from: classes15.dex */
public class VoiceCreateUI extends com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI implements fq4.s {
    public static final /* synthetic */ int F = 0;
    public com.tencent.mm.plugin.voiceprint.ui.NoiseDetectMaskView A;

    /* renamed from: x, reason: collision with root package name */
    public fq4.t f176193x;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f176195z;

    /* renamed from: y, reason: collision with root package name */
    public fq4.y f176194y = null;
    public android.widget.Button B = null;
    public int C = 1;
    public int D = 0;
    public final com.tencent.mm.sdk.event.IListener E = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoicePrintNoiseDetectResultEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI.1
        {
            this.__eventId = 438744715;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.VoicePrintNoiseDetectResultEvent voicePrintNoiseDetectResultEvent) {
            boolean z17 = voicePrintNoiseDetectResultEvent.f54937g.f7685a;
            com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI voiceCreateUI = com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI.this;
            if (z17) {
                int i17 = com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI.F;
                voiceCreateUI.getClass();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11390, 4);
                java.lang.String str = fq4.e0.f265591a;
                if (str == null) {
                    str = v61.d.a(1);
                }
                java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry("voicelock_sessionid", str), new java.util.AbstractMap.SimpleEntry("voicelock_create_event_type", 4)};
                java.util.HashMap hashMap = new java.util.HashMap(2);
                for (int i18 = 0; i18 < 2; i18++) {
                    java.util.Map.Entry entry = entryArr[i18];
                    java.lang.Object key = entry.getKey();
                    java.util.Objects.requireNonNull(key);
                    java.lang.Object value = entry.getValue();
                    java.util.Objects.requireNonNull(value);
                    if (hashMap.put(key, value) != null) {
                        throw new java.lang.IllegalArgumentException("duplicate key: " + key);
                    }
                }
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voicelock_create_process_end", java.util.Collections.unmodifiableMap(hashMap), 34575);
                com.tencent.mm.plugin.voiceprint.ui.NoiseDetectMaskView noiseDetectMaskView = voiceCreateUI.A;
                android.widget.ProgressBar progressBar = noiseDetectMaskView.f176182d;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                noiseDetectMaskView.f176183e.setText(com.tencent.mm.R.string.k_1);
                noiseDetectMaskView.f176184f.setVisibility(0);
            } else {
                android.view.View view = voiceCreateUI.f176195z;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "resumeToCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "resumeToCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = voiceCreateUI.f176166f;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "resumeToCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "resumeToCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.plugin.voiceprint.ui.NoiseDetectMaskView noiseDetectMaskView2 = voiceCreateUI.A;
                com.tencent.mm.plugin.voiceprint.ui.s sVar = new com.tencent.mm.plugin.voiceprint.ui.s(voiceCreateUI);
                android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, -1.0f, 1, 0.0f, 1, 0.0f);
                translateAnimation.setDuration(200L);
                translateAnimation.setFillAfter(true);
                translateAnimation.setRepeatCount(0);
                translateAnimation.setAnimationListener(new com.tencent.mm.plugin.voiceprint.ui.e1(sVar));
                noiseDetectMaskView2.startAnimation(translateAnimation);
            }
            return false;
        }
    };

    @Override // com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI
    public void V6() {
        this.f176193x = new fq4.t(this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m3m);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f176168h.setTitleText(com.tencent.mm.R.string.k_3);
        this.f176168h.f176226f.setVisibility(8);
        this.f176165e.setEnabled(false);
        this.f176194y = new fq4.y();
        this.f176195z = findViewById(com.tencent.mm.R.id.p5_);
        this.A = (com.tencent.mm.plugin.voiceprint.ui.NoiseDetectMaskView) findViewById(com.tencent.mm.R.id.jbx);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.m3m);
        this.B = button;
        button.setVisibility(8);
        this.B.setOnClickListener(new com.tencent.mm.plugin.voiceprint.ui.q(this));
        this.A.setOnClickRetryCallback(new com.tencent.mm.plugin.voiceprint.ui.r(this));
        setBackBtn(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI$$a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                int i17 = com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI.F;
                com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI voiceCreateUI = com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI.this;
                voiceCreateUI.a7();
                fq4.y yVar = voiceCreateUI.f176194y;
                yVar.f265653a.stopRecord();
                yVar.f265654b.d();
                voiceCreateUI.finish();
                return true;
            }
        }, com.tencent.mm.R.raw.actionbar_icon_dark_close);
        this.E.alive();
        b7();
    }

    @Override // com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI
    public void W6() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f176171n)) {
            return;
        }
        this.f176165e.setEnabled(false);
        X6();
        int i17 = this.C;
        if (i17 == 1) {
            fq4.t tVar = this.f176193x;
            fq4.i iVar = new fq4.i(this.f176171n, 71, tVar.f265644f, 0);
            iVar.f265606h = true;
            c01.d9.e().g(iVar);
            tVar.f265642d = 71;
            return;
        }
        if (i17 == 2) {
            fq4.t tVar2 = this.f176193x;
            fq4.i iVar2 = new fq4.i(this.f176171n, 72, tVar2.f265644f, tVar2.f265645g);
            iVar2.f265606h = true;
            c01.d9.e().g(iVar2);
            tVar2.f265642d = 72;
        }
    }

    public void Z6(boolean z17, int i17) {
        int i18 = 0;
        if (z17) {
            if (i17 == 71) {
                this.f176165e.setEnabled(false);
                this.C = 2;
                U6();
                com.tencent.mm.plugin.voiceprint.ui.g1.b(this.f176168h, this, new com.tencent.mm.plugin.voiceprint.ui.t(this));
                return;
            }
            if (i17 != 72) {
                return;
            }
            this.D = 0;
            java.lang.String str = fq4.e0.f265591a;
            if (str == null) {
                str = v61.d.a(1);
            }
            java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry("voicelock_sessionid", str), new java.util.AbstractMap.SimpleEntry("voicelock_create_event_type", 0)};
            java.util.HashMap hashMap = new java.util.HashMap(2);
            for (int i19 = 0; i19 < 2; i19++) {
                java.util.Map.Entry entry = entryArr[i19];
                java.lang.Object key = entry.getKey();
                java.util.Objects.requireNonNull(key);
                java.lang.Object value = entry.getValue();
                java.util.Objects.requireNonNull(value);
                if (hashMap.put(key, value) != null) {
                    throw new java.lang.IllegalArgumentException("duplicate key: " + key);
                }
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voicelock_create_process_end", java.util.Collections.unmodifiableMap(hashMap), 34575);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KIsCreateSuccess", true);
            setResult(-1, intent);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClass(this, com.tencent.mm.plugin.voiceprint.ui.VoicePrintCreateFinishUI.class);
            intent2.putExtra("kscene_type", 72);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "finishCreateSecondStep", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "finishCreateSecondStep", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            return;
        }
        if (i17 != 72) {
            return;
        }
        a7();
        int i27 = this.D + 1;
        this.D = i27;
        if (i27 < 2) {
            this.f176165e.setEnabled(true);
            T6();
            this.f176168h.setErr(com.tencent.mm.R.string.k_5);
            this.f176168h.c();
            java.lang.String str2 = fq4.e0.f265591a;
            if (str2 == null) {
                str2 = v61.d.a(1);
            }
            java.util.Map.Entry[] entryArr2 = {new java.util.AbstractMap.SimpleEntry("voicelock_sessionid", str2), new java.util.AbstractMap.SimpleEntry("voicelock_create_event_type", 2)};
            java.util.HashMap hashMap2 = new java.util.HashMap(2);
            while (i18 < 2) {
                java.util.Map.Entry entry2 = entryArr2[i18];
                java.lang.Object key2 = entry2.getKey();
                java.util.Objects.requireNonNull(key2);
                java.lang.Object value2 = entry2.getValue();
                java.util.Objects.requireNonNull(value2);
                if (hashMap2.put(key2, value2) != null) {
                    throw new java.lang.IllegalArgumentException("duplicate key: " + key2);
                }
                i18++;
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voicelock_create_process_end", java.util.Collections.unmodifiableMap(hashMap2), 34575);
            return;
        }
        this.D = 0;
        android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.voiceprint.ui.VoicePrintCreateFinishUI.class);
        intent3.putExtra("kscene_type", 75);
        startActivityForResult(intent3, 1);
        overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
        java.lang.String str3 = fq4.e0.f265591a;
        if (str3 == null) {
            str3 = v61.d.a(1);
        }
        java.util.Map.Entry[] entryArr3 = {new java.util.AbstractMap.SimpleEntry("voicelock_sessionid", str3), new java.util.AbstractMap.SimpleEntry("voicelock_create_event_type", 3)};
        java.util.HashMap hashMap3 = new java.util.HashMap(2);
        while (i18 < 2) {
            java.util.Map.Entry entry3 = entryArr3[i18];
            java.lang.Object key3 = entry3.getKey();
            java.util.Objects.requireNonNull(key3);
            java.lang.Object value3 = entry3.getValue();
            java.util.Objects.requireNonNull(value3);
            if (hashMap3.put(key3, value3) != null) {
                throw new java.lang.IllegalArgumentException("duplicate key: " + key3);
            }
            i18++;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voicelock_create_process_end", java.util.Collections.unmodifiableMap(hashMap3), 34575);
        finish();
    }

    public final void a7() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KIsCreateSuccess", false);
        setResult(-1, intent);
    }

    public final void b7() {
        fq4.y yVar = this.f176194y;
        yVar.f265653a.stopRecord();
        yVar.f265654b.d();
        yVar.f265655c = 0;
        yVar.f265656d = 0;
        com.tencent.mm.plugin.voiceprint.ui.NoiseDetectMaskView noiseDetectMaskView = this.A;
        android.widget.ProgressBar progressBar = noiseDetectMaskView.f176182d;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        noiseDetectMaskView.f176183e.setText(com.tencent.mm.R.string.k9x);
        noiseDetectMaskView.f176184f.setVisibility(8);
        android.view.View view = this.f176195z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "startNoiseDetect", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "startNoiseDetect", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f176166f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "startNoiseDetect", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "startNoiseDetect", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.A.setVisibility(0);
        fq4.y yVar2 = this.f176194y;
        yVar2.f265653a.stopRecord();
        yVar2.f265654b.d();
        yVar2.f265655c = 0;
        yVar2.f265656d = 0;
        java.lang.String a17 = fq4.u.a("voice_pt_voice_print_noise_detect.rec", true);
        w21.k0 k0Var = yVar2.f265653a;
        if (!k0Var.startRecord(a17)) {
            k0Var.stopRecord();
            k0Var.stopRecord();
            yVar2.f265654b.d();
            yVar2.f265655c = 0;
            yVar2.f265656d = 0;
        }
        yVar2.f265654b.c(100L, 100L);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        a7();
    }

    @Override // com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        fq4.t tVar = this.f176193x;
        tVar.getClass();
        c01.d9.e().q(611, tVar);
        c01.d9.e().q(612, tVar);
        tVar.f265646h = null;
        this.E.dead();
    }
}
