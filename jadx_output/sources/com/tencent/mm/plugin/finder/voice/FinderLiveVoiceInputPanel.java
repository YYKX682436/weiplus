package com.tencent.mm.plugin.finder.voice;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\t\u000fB\u001b\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB#\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setCloseBtnListener", "Lcom/tencent/mm/ui/widget/MMEditText;", "view", "setTextArea", "Liy2/r;", "callback", "setCallback", "", "value", "setPortHeightPX", "Liy2/t;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Liy2/t;", "getMPhoneStateListener", "()Liy2/t;", "setMPhoneStateListener", "(Liy2/t;)V", "mPhoneStateListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class FinderLiveVoiceInputPanel extends android.widget.LinearLayout {
    public int A;
    public final java.util.ArrayList B;
    public final java.util.ArrayList C;
    public final iy2.d D;

    /* renamed from: E, reason: from kotlin metadata */
    public iy2.t mPhoneStateListener;
    public final iy2.e F;
    public int G;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f136763d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout f136764e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f136765f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f136766g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f136767h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f136768i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f136769m;

    /* renamed from: n, reason: collision with root package name */
    public iy2.r f136770n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f136771o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f136772p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Context f136773q;

    /* renamed from: r, reason: collision with root package name */
    public long f136774r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f136775s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f136776t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f136777u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f136778v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f136779w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.Toast f136780x;

    /* renamed from: y, reason: collision with root package name */
    public iy2.c f136781y;

    /* renamed from: z, reason: collision with root package name */
    public android.telephony.TelephonyManager f136782z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveVoiceInputPanel(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static final void a(com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel finderLiveVoiceInputPanel) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = finderLiveVoiceInputPanel.f136771o;
        if (mMEditText == null || mMEditText.getText() == null) {
            return;
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = finderLiveVoiceInputPanel.f136771o;
        java.lang.String valueOf = java.lang.String.valueOf(mMEditText2 != null ? mMEditText2.getText() : null);
        if (valueOf.length() > 0) {
            com.tencent.mm.ui.widget.MMEditText mMEditText3 = finderLiveVoiceInputPanel.f136771o;
            if ((mMEditText3 != null ? mMEditText3.getSelectionStart() : 0) >= valueOf.length()) {
                java.lang.String substring = valueOf.substring(valueOf.length() - 1, valueOf.length());
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                finderLiveVoiceInputPanel.f136779w = substring;
                com.tencent.mars.xlog.Log.i(finderLiveVoiceInputPanel.f136763d, "delPunctuation msg = %s ,msg.length() = %s, punctuation = %s", com.tencent.mm.sdk.platformtools.t8.G1(valueOf), java.lang.Integer.valueOf(valueOf.length()), finderLiveVoiceInputPanel.f136779w);
                if (r26.i0.p(finderLiveVoiceInputPanel.f136779w, "。", true) || r26.i0.p(finderLiveVoiceInputPanel.f136779w, ".", true)) {
                    java.lang.String substring2 = valueOf.substring(0, valueOf.length() - 1);
                    kotlin.jvm.internal.o.f(substring2, "substring(...)");
                    com.tencent.mm.ui.widget.MMEditText mMEditText4 = finderLiveVoiceInputPanel.f136771o;
                    if (mMEditText4 != null) {
                        mMEditText4.setText(substring2);
                    }
                }
            }
        }
    }

    public static final void b(com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel finderLiveVoiceInputPanel, int i17) {
        android.content.res.Resources resources;
        android.widget.Toast toast = finderLiveVoiceInputPanel.f136780x;
        if (toast != null) {
            toast.cancel();
        }
        android.content.Context context = finderLiveVoiceInputPanel.f136773q;
        android.widget.Toast makeText = dp.a.makeText(context, (context == null || (resources = context.getResources()) == null) ? null : resources.getString(i17), 0);
        finderLiveVoiceInputPanel.f136780x = makeText;
        if (makeText != null) {
            makeText.setGravity(17, 0, 0);
        }
        android.widget.Toast toast2 = finderLiveVoiceInputPanel.f136780x;
        if (toast2 != null) {
            toast2.show();
        }
    }

    public final void c() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f136774r = android.os.SystemClock.elapsedRealtime();
        if (this.f136764e == null) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.p5x);
            kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout");
            com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout finderLiveVoiceInputLayout = (com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout) findViewById;
            this.f136764e = finderLiveVoiceInputLayout;
            finderLiveVoiceInputLayout.setVoiceDetectListener(this.F);
            com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout finderLiveVoiceInputLayout2 = this.f136764e;
            if (finderLiveVoiceInputLayout2 != null) {
                finderLiveVoiceInputLayout2.setLongClickLisnter(this.D);
            }
        }
        android.content.SharedPreferences d17 = com.tencent.mm.sdk.platformtools.x2.d();
        if (d17 != null) {
            java.lang.String str = this.f136775s;
            java.lang.String string = d17.getString(str, "");
            if (!r26.i0.p(string, "", true)) {
                iy2.c cVar = this.f136781y;
                if (cVar != null) {
                    cVar.a(this.f136771o);
                }
                iy2.c cVar2 = this.f136781y;
                if (cVar2 != null) {
                    cVar2.c(this.f136771o, string != null ? string : "", false);
                }
                iy2.c cVar3 = this.f136781y;
                if (cVar3 != null) {
                    cVar3.b(this.f136771o);
                }
                iy2.c cVar4 = this.f136781y;
                if (cVar4 != null) {
                    cVar4.a(this.f136771o);
                }
                e();
                d17.edit().remove(str).apply();
            }
        }
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("phone");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        this.f136782z = (android.telephony.TelephonyManager) systemService;
        if (this.mPhoneStateListener == null) {
            this.mPhoneStateListener = new iy2.t(this.f136764e);
        }
        ((com.tencent.mm.sdk.platformtools.l5) i95.n0.c(com.tencent.mm.sdk.platformtools.l5.class)).wi(this.mPhoneStateListener);
    }

    public final void d() {
        java.lang.String str = this.f136763d;
        com.tencent.mars.xlog.Log.i(str, "VoiceInputPanel reset");
        com.tencent.mars.xlog.Log.i(str, "pause");
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout finderLiveVoiceInputLayout = this.f136764e;
        if (finderLiveVoiceInputLayout != null) {
            finderLiveVoiceInputLayout.a();
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f136771o;
        if (mMEditText != null) {
            iy2.c cVar = this.f136781y;
            if (cVar != null) {
                cVar.a(mMEditText);
            }
            iy2.c cVar2 = this.f136781y;
            if (cVar2 != null) {
                cVar2.c(this.f136771o, "", false);
            }
            iy2.c cVar3 = this.f136781y;
            if (cVar3 != null) {
                cVar3.b(this.f136771o);
            }
            iy2.c cVar4 = this.f136781y;
            if (cVar4 != null) {
                cVar4.a(this.f136771o);
            }
            e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r13 = this;
            com.tencent.mm.ui.widget.MMEditText r0 = r13.f136771o
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L76
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L76
            com.tencent.mm.ui.widget.MMEditText r0 = r13.f136771o
            if (r0 == 0) goto L15
            android.text.Editable r0 = r0.getText()
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L21
            int r0 = r0.length()
            if (r0 != 0) goto L1f
            goto L21
        L1f:
            r0 = r2
            goto L22
        L21:
            r0 = r1
        L22:
            if (r0 == 0) goto L76
            android.widget.TextView r0 = r13.f136767h
            r3 = 8
            if (r0 != 0) goto L2b
            goto L2e
        L2b:
            r0.setVisibility(r3)
        L2e:
            android.view.View r0 = r13.f136766g
            if (r0 != 0) goto L34
            goto Lc4
        L34:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.ThreadLocal r4 = zj0.c.f473285a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.add(r3)
            java.util.Collections.reverse(r12)
            java.lang.Object[] r5 = r12.toArray()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel"
            java.lang.String r7 = "setTextHintAndColor"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r0
            yj0.a.d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r2 = r12.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel"
            java.lang.String r6 = "setTextHintAndColor"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            yj0.a.f(r4, r5, r6, r7, r8, r9, r10)
            goto Lc4
        L76:
            android.widget.TextView r0 = r13.f136767h
            if (r0 != 0) goto L7b
            goto L7e
        L7b:
            r0.setVisibility(r2)
        L7e:
            android.view.View r0 = r13.f136766g
            if (r0 != 0) goto L83
            goto Lc4
        L83:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f473285a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r11.add(r3)
            java.util.Collections.reverse(r11)
            java.lang.Object[] r4 = r11.toArray()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel"
            java.lang.String r6 = "setTextHintAndColor"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            yj0.a.d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r2 = r11.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel"
            java.lang.String r5 = "setTextHintAndColor"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            yj0.a.f(r3, r4, r5, r6, r7, r8, r9)
        Lc4:
            boolean r0 = r13.f136777u
            if (r0 != 0) goto Lcd
            r13.f136777u = r1
            java.lang.System.currentTimeMillis()
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel.e():void");
    }

    public final iy2.t getMPhoneStateListener() {
        return this.mPhoneStateListener;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    public final void setCallback(iy2.r rVar) {
        this.f136770n = rVar;
    }

    public final void setCloseBtnListener(android.view.View.OnClickListener listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        android.view.View view = this.f136765f;
        if (view != null) {
            view.setOnClickListener(listener);
        }
    }

    public final void setMPhoneStateListener(iy2.t tVar) {
        this.mPhoneStateListener = tVar;
    }

    public final void setPortHeightPX(int i17) {
        if (this.G != i17) {
            this.G = i17;
        }
    }

    public final void setTextArea(com.tencent.mm.ui.widget.MMEditText view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f136771o = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveVoiceInputPanel(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.widget.TextView textView;
        kotlin.jvm.internal.o.g(context, "context");
        this.f136763d = "MicroMsg.FinderLiveVoiceInputPanel";
        this.f136775s = "voiceinput_downdistance_content";
        this.f136779w = "";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.B = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.C = arrayList2;
        this.D = new iy2.a0(this);
        this.F = new iy2.z(this);
        this.G = i65.a.b(getContext(), zd.d.CTRL_INDEX);
        this.f136773q = context;
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f489018er5, this);
        this.f136765f = findViewById(com.tencent.mm.R.id.p5p);
        this.f136766g = findViewById(com.tencent.mm.R.id.p5o);
        this.f136768i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.p5s);
        this.f136769m = findViewById(com.tencent.mm.R.id.vog);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.p5u);
        this.f136767h = textView2;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.view.View view = this.f136766g;
        if (view != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView3 = this.f136767h;
        if (textView3 != null) {
            textView3.setOnClickListener(new iy2.u(this));
        }
        android.view.View view2 = this.f136766g;
        if (view2 != null) {
            view2.setOnClickListener(new iy2.v(this));
        }
        android.widget.TextView textView4 = this.f136768i;
        if (textView4 != null) {
            textView4.setOnClickListener(new iy2.y(this));
        }
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        this.f136781y = new iy2.c(context2);
        java.lang.System.nanoTime();
        c();
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("VoiceInputLanguageSupportType", 1);
        if (com.tencent.mm.sdk.platformtools.m2.j()) {
            arrayList.add(getContext().getString(com.tencent.mm.R.string.f491880nw4));
            arrayList2.add(1);
            if ((b17 & 2) != 0) {
                arrayList.add(getContext().getString(com.tencent.mm.R.string.f491879nw3));
                arrayList2.add(2);
            }
            if ((b17 & 4) != 0) {
                arrayList.add(getContext().getString(com.tencent.mm.R.string.f491881nw5));
                arrayList2.add(4);
            }
            if ((b17 & 8) != 0) {
                arrayList.add(getContext().getString(com.tencent.mm.R.string.nw6));
                arrayList2.add(8);
            }
        } else if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.m2.d(), "en")) {
            arrayList.add(getContext().getString(com.tencent.mm.R.string.f491881nw5));
            arrayList2.add(4);
            arrayList.add(getContext().getString(com.tencent.mm.R.string.f491880nw4));
            arrayList2.add(1);
            if ((b17 & 2) != 0) {
                arrayList.add(getContext().getString(com.tencent.mm.R.string.f491879nw3));
                arrayList2.add(2);
            }
        }
        this.A = 0;
        android.widget.TextView textView5 = this.f136768i;
        if (textView5 != null) {
            java.lang.String str = (java.lang.String) kz5.n0.a0(arrayList, 0);
            textView5.setText(str != null ? str : "");
        }
        java.lang.Integer num = (java.lang.Integer) kz5.n0.a0(arrayList2, this.A);
        if (num != null) {
            int intValue = num.intValue();
            com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout finderLiveVoiceInputLayout = this.f136764e;
            if (finderLiveVoiceInputLayout != null) {
                finderLiveVoiceInputLayout.setLangType(intValue);
            }
        }
        if (arrayList2.size() >= 2 || (textView = this.f136768i) == null) {
            return;
        }
        textView.setVisibility(8);
    }
}
