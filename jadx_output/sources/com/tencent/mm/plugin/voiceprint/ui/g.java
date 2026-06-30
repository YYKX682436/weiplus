package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes15.dex */
public class g implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public long f176248d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f176249e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI f176250f;

    public g(com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI baseVoicePrintUI) {
        this.f176250f = baseVoicePrintUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        long elapsedRealtime;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        if (action == 0) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            androidx.appcompat.app.AppCompatActivity context = this.f176250f.getContext();
            java.lang.String string = this.f176250f.getString(com.tencent.mm.R.string.j0y);
            ((sb0.f) jVar).getClass();
            boolean a17 = j35.u.a(context, "android.permission.RECORD_AUDIO", 80, "", string);
            this.f176249e = a17;
            if (!a17) {
                yj0.a.i(true, this, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
            com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI baseVoicePrintUI = this.f176250f;
            baseVoicePrintUI.f176170m = false;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(baseVoicePrintUI.f176172o)) {
                this.f176248d = java.lang.System.currentTimeMillis();
                this.f176250f.f176164d.setPressed(true);
                this.f176250f.U6();
                this.f176250f.f176179v.sendEmptyMessageDelayed(1, 300L);
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseVoicePrintUI", "mic press down");
            }
        } else if (action == 1 || action == 3) {
            if (!this.f176249e) {
                yj0.a.i(true, this, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
            this.f176250f.f176164d.setPressed(false);
            this.f176250f.f176179v.removeMessages(1);
            if (java.lang.System.currentTimeMillis() - this.f176248d < 300) {
                this.f176250f.f176170m = false;
            } else {
                this.f176250f.f176170m = true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseVoicePrintUI", "mic press up %d, hasTouchDown:%b", java.lang.Integer.valueOf(motionEvent.getAction()), java.lang.Boolean.valueOf(this.f176250f.f176170m));
            com.tencent.mm.plugin.voiceprint.ui.VoicePrintVolumeMeter voicePrintVolumeMeter = this.f176250f.f176167g;
            voicePrintVolumeMeter.f176222p = false;
            voicePrintVolumeMeter.f176221o = -1.0f;
            voicePrintVolumeMeter.f176223q = false;
            voicePrintVolumeMeter.f176220n = 0.0f;
            voicePrintVolumeMeter.postInvalidate();
            voicePrintVolumeMeter.f176223q = false;
            voicePrintVolumeMeter.f176217h.d();
            voicePrintVolumeMeter.postInvalidate();
            this.f176250f.f176177t.d();
            fq4.d0 d0Var = this.f176250f.f176169i;
            d0Var.f265585f.C(false);
            d0Var.f265584e = false;
            synchronized (d0Var) {
                w21.k0 k0Var = d0Var.f265580a;
                if (k0Var != null) {
                    k0Var.stopRecord();
                }
            }
            if (d0Var.f265583d != 2) {
                d0Var.f265581b = null;
                d0Var.f265584e = false;
            } else {
                long j17 = d0Var.f265582c;
                if (j17 <= 0) {
                    elapsedRealtime = 0;
                } else {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
                }
                if (((int) elapsedRealtime) < 1000) {
                    d0Var.f265581b = "";
                    d0Var.f265584e = false;
                } else {
                    d0Var.f265584e = true;
                }
                d0Var.f265581b = "";
            }
            d0Var.f265583d = -1;
            com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI baseVoicePrintUI2 = this.f176250f;
            if (baseVoicePrintUI2.f176170m) {
                if (!baseVoicePrintUI2.f176169i.f265584e) {
                    baseVoicePrintUI2.f176178u.d();
                    baseVoicePrintUI2.f176168h.setErr(com.tencent.mm.R.string.k9t);
                    baseVoicePrintUI2.f176168h.c();
                    baseVoicePrintUI2.f176171n = null;
                    if (baseVoicePrintUI2.f176175r) {
                        java.lang.String str = fq4.e0.f265591a;
                        if (str == null) {
                            str = v61.d.a(1);
                        }
                        java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry("login_sessionid", str), new java.util.AbstractMap.SimpleEntry("voicelock_verify_result", 2)};
                        java.util.HashMap hashMap = new java.util.HashMap(2);
                        for (int i17 = 0; i17 < 2; i17++) {
                            java.util.Map.Entry entry = entryArr[i17];
                            java.lang.Object key = entry.getKey();
                            java.util.Objects.requireNonNull(key);
                            java.lang.Object value = entry.getValue();
                            java.util.Objects.requireNonNull(value);
                            if (hashMap.put(key, value) != null) {
                                throw new java.lang.IllegalArgumentException("duplicate key: " + key);
                            }
                        }
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voicelock_login_request_end", java.util.Collections.unmodifiableMap(hashMap), 34575);
                    } else {
                        java.lang.String str2 = fq4.e0.f265591a;
                        if (str2 == null) {
                            str2 = v61.d.a(1);
                        }
                        java.util.Map.Entry[] entryArr2 = {new java.util.AbstractMap.SimpleEntry("voicelock_sessionid", str2), new java.util.AbstractMap.SimpleEntry("voicelock_create_event_type", 1)};
                        java.util.HashMap hashMap2 = new java.util.HashMap(2);
                        for (int i18 = 0; i18 < 2; i18++) {
                            java.util.Map.Entry entry2 = entryArr2[i18];
                            java.lang.Object key2 = entry2.getKey();
                            java.util.Objects.requireNonNull(key2);
                            java.lang.Object value2 = entry2.getValue();
                            java.util.Objects.requireNonNull(value2);
                            if (hashMap2.put(key2, value2) != null) {
                                throw new java.lang.IllegalArgumentException("duplicate key: " + key2);
                            }
                        }
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voicelock_create_process_end", java.util.Collections.unmodifiableMap(hashMap2), 34575);
                    }
                }
                android.view.View view2 = baseVoicePrintUI2.f176166f;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "releaseMic", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "releaseMic", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                baseVoicePrintUI2.f176168h.d();
                baseVoicePrintUI2.f176168h.setTipText(baseVoicePrintUI2.f176172o);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f176250f.f176171n)) {
                    this.f176250f.W6();
                }
                this.f176248d = 0L;
                this.f176250f.f176170m = false;
            } else {
                baseVoicePrintUI2.f176168h.setErr(com.tencent.mm.R.string.k9t);
                this.f176250f.f176168h.c();
                if (this.f176250f.f176175r) {
                    java.lang.String str3 = fq4.e0.f265591a;
                    if (str3 == null) {
                        str3 = v61.d.a(1);
                    }
                    java.util.Map.Entry[] entryArr3 = {new java.util.AbstractMap.SimpleEntry("login_sessionid", str3), new java.util.AbstractMap.SimpleEntry("voicelock_verify_result", 2)};
                    java.util.HashMap hashMap3 = new java.util.HashMap(2);
                    for (int i19 = 0; i19 < 2; i19++) {
                        java.util.Map.Entry entry3 = entryArr3[i19];
                        java.lang.Object key3 = entry3.getKey();
                        java.util.Objects.requireNonNull(key3);
                        java.lang.Object value3 = entry3.getValue();
                        java.util.Objects.requireNonNull(value3);
                        if (hashMap3.put(key3, value3) != null) {
                            throw new java.lang.IllegalArgumentException("duplicate key: " + key3);
                        }
                    }
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voicelock_login_request_end", java.util.Collections.unmodifiableMap(hashMap3), 34575);
                } else {
                    java.lang.String str4 = fq4.e0.f265591a;
                    if (str4 == null) {
                        str4 = v61.d.a(1);
                    }
                    java.util.Map.Entry[] entryArr4 = {new java.util.AbstractMap.SimpleEntry("voicelock_sessionid", str4), new java.util.AbstractMap.SimpleEntry("voicelock_create_event_type", 1)};
                    java.util.HashMap hashMap4 = new java.util.HashMap(2);
                    for (int i27 = 0; i27 < 2; i27++) {
                        java.util.Map.Entry entry4 = entryArr4[i27];
                        java.lang.Object key4 = entry4.getKey();
                        java.util.Objects.requireNonNull(key4);
                        java.lang.Object value4 = entry4.getValue();
                        java.util.Objects.requireNonNull(value4);
                        if (hashMap4.put(key4, value4) != null) {
                            throw new java.lang.IllegalArgumentException("duplicate key: " + key4);
                        }
                    }
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voicelock_create_process_end", java.util.Collections.unmodifiableMap(hashMap4), 34575);
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
