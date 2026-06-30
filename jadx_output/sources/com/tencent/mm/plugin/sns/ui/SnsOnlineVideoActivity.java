package com.tencent.mm.plugin.sns.ui;

@db5.a(4099)
@ul5.d(0)
/* loaded from: classes4.dex */
public class SnsOnlineVideoActivity extends com.tencent.mm.ui.MMActivity implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {
    public static final /* synthetic */ int C1 = 0;
    public android.view.VelocityTracker A1;
    public boolean D;
    public android.widget.Button E;
    public boolean F;
    public java.lang.String Q;
    public android.widget.LinearLayout R;
    public java.lang.String S;
    public xd4.f U;
    public android.view.accessibility.AccessibilityManager V;
    public x25.b W;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f167312e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f167313f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f167314g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f167316i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f167318m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f167319n;

    /* renamed from: o, reason: collision with root package name */
    public r45.jj4 f167320o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f167321p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f167324q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.OnlineVideoView f167325r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.FrameLayout f167326s;

    /* renamed from: t, reason: collision with root package name */
    public android.os.Bundle f167327t;

    /* renamed from: u, reason: collision with root package name */
    public wd4.l1 f167328u;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s4 f167331x;

    /* renamed from: z1, reason: collision with root package name */
    public android.view.GestureDetector f167338z1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f167311d = true;

    /* renamed from: h, reason: collision with root package name */
    public int f167315h = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f167329v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f167330w = false;

    /* renamed from: y, reason: collision with root package name */
    public int f167334y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f167337z = 0;
    public int A = 0;
    public int B = 0;
    public int C = 0;
    public boolean G = false;
    public boolean H = true;
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f167310J = false;
    public java.lang.String K = "";
    public java.lang.String L = "";
    public long M = 0;
    public int N = 2;
    public boolean P = false;
    public boolean T = false;
    public int X = 0;
    public java.lang.String Y = "";
    public final com.tencent.mm.sdk.event.IListener Z = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipCallingStatusEvent>(this) { // from class: com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.1
        {
            this.__eventId = 1965200980;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.VoipCallingStatusEvent voipCallingStatusEvent) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$1");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$1");
            if (voipCallingStatusEvent.f54942g.f8161d == 11) {
                int i17 = com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.C1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity = com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.this;
                boolean z17 = snsOnlineVideoActivity.f167318m;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                if (!z17) {
                    com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.T6(snsOnlineVideoActivity).I();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$1");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$1");
            return false;
        }
    };

    /* renamed from: p0, reason: collision with root package name */
    public boolean f167322p0 = false;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f167332x0 = false;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f167335y0 = false;

    /* renamed from: l1, reason: collision with root package name */
    public float f167317l1 = 1.0f;

    /* renamed from: p1, reason: collision with root package name */
    public int f167323p1 = 0;

    /* renamed from: x1, reason: collision with root package name */
    public int f167333x1 = 0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f167336y1 = false;
    public final db5.t4 B1 = new com.tencent.mm.plugin.sns.ui.rn(this);

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.OnlineVideoView T6(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = snsOnlineVideoActivity.f167325r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return onlineVideoView;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo U6(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = snsOnlineVideoActivity.f167319n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return snsInfo;
    }

    public static /* synthetic */ wd4.l1 V6(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        wd4.l1 l1Var = snsOnlineVideoActivity.f167328u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return l1Var;
    }

    public static /* synthetic */ android.widget.RelativeLayout W6(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        android.widget.RelativeLayout relativeLayout = snsOnlineVideoActivity.f167321p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return relativeLayout;
    }

    public static /* synthetic */ java.lang.String X6(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        java.lang.String str = snsOnlineVideoActivity.f167312e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return str;
    }

    public static /* synthetic */ boolean Y6(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        boolean z17 = snsOnlineVideoActivity.f167322p0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return z17;
    }

    public static /* synthetic */ android.widget.FrameLayout Z6(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        android.widget.FrameLayout frameLayout = snsOnlineVideoActivity.f167326s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return frameLayout;
    }

    public static /* synthetic */ boolean a7(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        snsOnlineVideoActivity.f167335y0 = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return z17;
    }

    public static /* synthetic */ android.view.VelocityTracker b7(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        android.view.VelocityTracker velocityTracker = snsOnlineVideoActivity.A1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return velocityTracker;
    }

    public final void c7() {
        android.widget.Button button;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addNavBarMargin", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        boolean k17 = com.tencent.mm.ui.bk.k(this);
        int j17 = com.tencent.mm.ui.bk.j(this);
        if (this.D && k17 && (button = this.E) != null && button.getVisibility() == 0) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.E.getLayoutParams();
            marginLayoutParams.bottomMargin += j17;
            this.E.setLayoutParams(marginLayoutParams);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addNavBarMargin", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    public final void d7(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeJumperVisibility", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        if (this.T && !pc4.d.f353410a.w()) {
            this.R.setVisibility(i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeJumperVisibility", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            l7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return dispatchKeyEvent;
    }

    public final void e7(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeVisibleWhenDrag", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        this.U.c(i17);
        d7(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeVisibleWhenDrag", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    public final void f7(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealCutSameJumpView", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        android.widget.LinearLayout linearLayout = this.R;
        if (linearLayout == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsOnlineVideoActivity", "mThirdJumper is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealCutSameJumpView", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.onp);
        if (textView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsOnlineVideoActivity", "tvWording is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealCutSameJumpView", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            return;
        }
        this.T = true;
        if (pc4.d.f353410a.w()) {
            xd4.z zVar = (xd4.z) this.U;
            boolean z17 = this.T;
            zVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsThirdJumperShow", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView = zVar.f453721b;
            if (expandableHeroSeekBarView != null) {
                expandableHeroSeekBarView.setShowJumper(z17);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsThirdJumperShow", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        } else {
            xd4.a0 a0Var = (xd4.a0) this.U;
            boolean z18 = this.T;
            a0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowCutSameView", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
            n34.v3 v3Var = a0Var.f453625a;
            v3Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowCutSameView", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
            v3Var.f334752d = z18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowCutSameView", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowCutSameView", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
        }
        d7(0);
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.e(this.S, 1);
            java.lang.String a17 = dw3.j0.f244218a.a();
            if (android.text.TextUtils.isEmpty(a17)) {
                a17 = i65.a.r(getContext(), com.tencent.mm.R.string.je7);
            }
            if (a17.contains("X")) {
                android.text.SpannableString spannableString = new android.text.SpannableString(a17);
                android.graphics.drawable.Drawable i17 = i65.a.i(getContext(), com.tencent.mm.R.drawable.f482081cf0);
                int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479672c9);
                i17.setBounds(0, 0, (i17.getIntrinsicWidth() * h17) / i17.getIntrinsicHeight(), h17);
                android.text.style.ImageSpan imageSpan = new android.text.style.ImageSpan(i17, 2);
                int indexOf = a17.indexOf("X");
                spannableString.setSpan(imageSpan, indexOf, indexOf + 1, 33);
                textView.setText(spannableString);
            } else {
                textView.setText(a17);
            }
        } else {
            textView.setText(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealCutSameJumpView", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    public java.lang.String g7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        if (this.f167320o == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsOnlineVideoActivity", "getCurrentMaterialPath, media is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            return null;
        }
        java.lang.String str = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), this.f167320o.f377855d) + ca4.z0.R(this.f167320o);
        if (!android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            return str;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsOnlineVideoActivity", "getCurrentMaterialPath, mediaPath is empty");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return null;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return com.tencent.mm.R.layout.cux;
    }

    public final java.util.List h7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initMenu", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.tencent.mm.sdk.platformtools.t8.D1(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SIGHTCannotTransmitForFav"), 0) == 0) {
            arrayList.add(1003);
        }
        j45.l.g("favorite");
        arrayList.add(1006);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initMenu", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return arrayList;
    }

    public final java.util.List i7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSecondMenu", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(1013);
        boolean z17 = false;
        if (com.tencent.mm.sdk.platformtools.t8.D1(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SIGHTCannotTransmitForFav"), 0) == 0) {
            java.lang.String o17 = com.tencent.mm.plugin.sns.model.y6.o(this.f167312e, this.f167320o);
            if (!com.tencent.mm.vfs.w6.j(o17)) {
                o17 = com.tencent.mm.plugin.sns.model.y6.m(this.f167312e);
                com.tencent.mars.xlog.Log.w("MicroMsg.SnsOnlineVideoActivity", "initSecondMenu get relocated video path: %s", o17);
            }
            boolean j17 = com.tencent.mm.vfs.w6.j(this.f167313f);
            if (!android.text.TextUtils.isEmpty(o17) && com.tencent.mm.vfs.w6.j(o17)) {
                z17 = true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsOnlineVideoActivity", "config can forward sight, thumb existed %B, video existed %B", java.lang.Boolean.valueOf(j17), java.lang.Boolean.valueOf(z17));
            if (j17 && z17) {
                com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
                exDeviceHaveBindNetworkDeviceEvent.f54141g.f6221c = this.f167312e;
                exDeviceHaveBindNetworkDeviceEvent.e();
                if (exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
                    arrayList.add(1008);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSecondMenu", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return arrayList;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("importUIComponents", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        if (pc4.d.f353410a.w()) {
            com.tencent.mm.plugin.sns.ui.sn snVar = new com.tencent.mm.plugin.sns.ui.sn(this, super.importUIComponents());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("importUIComponents", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            return snVar;
        }
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("importUIComponents", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return importUIComponents;
    }

    public final void j7(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishExitStatus", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        if (this.f167319n == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishExitStatus", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            return;
        }
        com.tencent.mm.autogen.events.GalleryPhotoInfoEvent galleryPhotoInfoEvent = new com.tencent.mm.autogen.events.GalleryPhotoInfoEvent();
        int i18 = this.C;
        am.ie ieVar = galleryPhotoInfoEvent.f54355g;
        ieVar.f6945a = i18;
        ieVar.f6949e = i17;
        ieVar.f6948d = this.f167319n.getLocalid();
        galleryPhotoInfoEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishExitStatus", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    public final void k7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerMenu", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        if (this.f167316i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsOnlineVideoActivity", "it is preview mode, don't register menu.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerMenu", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        } else {
            this.f167326s.setOnLongClickListener(new com.tencent.mm.plugin.sns.ui.in(this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerMenu", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        }
    }

    public void l7() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        android.widget.Button button = this.E;
        if (button != null && button.getVisibility() == 0) {
            this.E.setVisibility(8);
        }
        d7(8);
        this.U.c(4);
        int width = this.f167321p.getWidth();
        int height = this.f167321p.getHeight();
        if (this.f167317l1 == 1.0f) {
            this.f167331x.f210711r = -(this.U.a() * 2);
        }
        int i18 = this.A;
        if (i18 != 0 && (i17 = this.B) != 0) {
            height = (int) ((width / i18) * i17);
        }
        com.tencent.mm.ui.tools.s4 s4Var = this.f167331x;
        if (s4Var != null) {
            s4Var.f210699f = width;
            s4Var.f210700g = height;
            s4Var.e(this.f167337z, this.f167334y, i18, this.B);
            if (this.f167317l1 != 1.0d) {
                int a17 = this.U.a();
                this.f167331x.f210707n = 1.0f / this.f167317l1;
                if (this.f167323p1 != 0 || this.f167333x1 != 0) {
                    int width2 = ((int) ((this.f167321p.getWidth() / 2) * (1.0f - this.f167317l1))) + this.f167323p1;
                    int height2 = (int) (((this.f167321p.getHeight() / 2) + this.f167333x1) - (((height / 2) + a17) * this.f167317l1));
                    com.tencent.mm.ui.tools.s4 s4Var2 = this.f167331x;
                    s4Var2.f210708o = width2;
                    s4Var2.f210709p = height2;
                }
            }
            this.f167331x.d(this.f167326s, this.f167324q, false, new com.tencent.mm.plugin.sns.ui.qn(this), null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.storage.SnsInfo k17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        java.lang.String str2 = "MicroMsg.SnsOnlineVideoActivity";
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsOnlineVideoActivity", "on activity result reqCode %d resultCode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (4097 == i17) {
            if (-1 == i18) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
                if (android.text.TextUtils.isEmpty(stringExtra)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                    return;
                }
                java.util.Iterator it = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")).iterator();
                while (it.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it.next();
                    if (this.f167315h == 0 && (k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f167312e)) != null) {
                        if (com.tencent.mm.storage.z3.R4(str3)) {
                            com.tencent.mm.autogen.events.SnsForwardFeedToChatRoomForDataReportEvent snsForwardFeedToChatRoomForDataReportEvent = new com.tencent.mm.autogen.events.SnsForwardFeedToChatRoomForDataReportEvent();
                            java.lang.String T = ca4.z0.T(k17);
                            am.tv tvVar = snsForwardFeedToChatRoomForDataReportEvent.f54811g;
                            tvVar.f8037a = T;
                            k17.getLocalid();
                            tvVar.getClass();
                            snsForwardFeedToChatRoomForDataReportEvent.e();
                        } else {
                            com.tencent.mm.autogen.events.SnsForwardFeedToSingleChatForDataReportEvent snsForwardFeedToSingleChatForDataReportEvent = new com.tencent.mm.autogen.events.SnsForwardFeedToSingleChatForDataReportEvent();
                            java.lang.String T2 = ca4.z0.T(k17);
                            am.uv uvVar = snsForwardFeedToSingleChatForDataReportEvent.f54812g;
                            uvVar.f8139a = T2;
                            k17.getLocalid();
                            uvVar.getClass();
                            snsForwardFeedToSingleChatForDataReportEvent.e();
                        }
                    }
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = this.f167319n.getTimeLine();
                    java.lang.String o17 = com.tencent.mm.plugin.sns.model.y6.o(this.f167312e, this.f167320o);
                    int S = ca4.z0.S(o17);
                    java.lang.String q17 = com.tencent.mm.sdk.platformtools.t8.K0(this.f167313f) ? com.tencent.mm.plugin.sns.model.y6.q(this.f167320o) : this.f167313f;
                    this.f167313f = q17;
                    r45.jj4 jj4Var = this.f167320o;
                    com.tencent.mars.xlog.Log.i(str2, "send sight to %s, videopath %s, thumbpath %s url: %s time: %d, duration: %s", str3, o17, q17, jj4Var.f377875x, java.lang.Integer.valueOf(jj4Var.A), java.lang.Integer.valueOf(S));
                    if (com.tencent.mm.vfs.w6.j(o17)) {
                        str = o17;
                    } else {
                        java.lang.String m17 = com.tencent.mm.plugin.sns.model.y6.m(this.f167312e);
                        com.tencent.mars.xlog.Log.w(str2, "shareSendVideo get relocated video path: %s", m17);
                        str = m17;
                    }
                    if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(this.f167313f) || !com.tencent.mm.vfs.w6.j(str) || !com.tencent.mm.vfs.w6.j(this.f167313f)) {
                        com.tencent.mars.xlog.Log.e(str2, "send video error");
                        if (com.tencent.mm.plugin.sns.model.j4.e()) {
                            com.tencent.mm.ui.widget.snackbar.j.c(getString(com.tencent.mm.R.string.ihu), null, this, null, null);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                        return;
                    }
                    java.lang.String str4 = stringExtra2;
                    java.lang.String str5 = str2;
                    ((dk5.s5) tg3.t1.a()).nj(this, str3, str, this.f167313f, 43, S, false, false, timeLine.statExtStr, null);
                    ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).Ai(this.f167319n.getLocalid());
                    if (str4 != null) {
                        ((dk5.s5) tg3.t1.a()).Ui(str4, str3);
                    }
                    com.tencent.mm.ui.widget.snackbar.j.c(getString(com.tencent.mm.R.string.fw6), null, this, null, null);
                    stringExtra2 = str4;
                    str2 = str5;
                }
            }
        } else if (4098 == i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsOnlineVideoActivity", "REQUEST_CODE_CUT_SAME callback ");
            if (intent != null) {
                java.lang.String stringExtra3 = intent.getStringExtra("key_export_video_path");
                java.lang.String stringExtra4 = intent.getStringExtra("key_export_video_cover_path");
                if (android.text.TextUtils.isEmpty(stringExtra3)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsOnlineVideoActivity", "template video path is null");
                    finish();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                    return;
                }
                try {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("KSightPath", stringExtra3);
                    intent2.putExtra("KSightThumbPath", dw3.c0.f244182a.e(stringExtra4, stringExtra3, ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Di() ? 288 : -1));
                    intent2.putExtra("Ksnsupload_type", 14);
                    intent2.putExtra("KSnsVideoTempalteInfo", intent.getByteArrayExtra("key_video_template_info"));
                    intent2.putExtra("key_extra_data", intent.getBundleExtra("key_extra_data"));
                    intent2.putExtra("KSnsFrom", 20);
                    j45.l.j(getContext(), "sns", ".ui.SnsUploadUI", intent2, null);
                    finish();
                } catch (java.lang.Exception unused) {
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsOnlineVideoActivity", "REQUEST_CODE_TEMPLATE_VIDEO path:%s, mjCoverPath:%s", stringExtra3, stringExtra4);
            }
            super.onActivityResult(i17, i18, intent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        }
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        this.P = true;
        super.onBackPressed();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        super.onConfigurationChanged(configuration);
        this.U.onConfigurationChanged(configuration);
        int i17 = configuration.orientation;
        if (i17 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleVerticalUI", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            c7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleVerticalUI", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            return;
        }
        if (i17 != 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleHorizontalUI", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        android.widget.Button button = this.E;
        if (button != null && button.getVisibility() == 0) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.E.getLayoutParams();
            if (marginLayoutParams.bottomMargin != getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aaa)) {
                marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aaa);
                this.E.setLayoutParams(marginLayoutParams);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleHorizontalUI", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0865  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 2174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsOnlineVideoActivity", "onDestroy fromPlayingVideo %s", java.lang.Boolean.valueOf(this.f167310J));
        this.Z.dead();
        this.U.destroy();
        this.f167325r.H();
        if (this.f167310J) {
            xd4.o0.d().h(this);
            this.f167325r.B();
            com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = this.f167325r;
            onlineVideoView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("disableSnsEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            onlineVideoView.S1 = null;
            onlineVideoView.T1 = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("disableSnsEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            android.widget.FrameLayout frameLayout = this.f167326s;
            if (frameLayout != null) {
                frameLayout.removeView(this.f167325r);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsOnlineVideoActivity", "onDestroy remove videoView = " + this.f167325r.toString());
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsOnlineVideoActivity", "onDestroy videoViewContainer = null, undo remove videoView");
            }
            if (!this.P) {
                xd4.o0.d().i();
            }
        } else {
            this.f167325r.B();
        }
        try {
            getWindow().clearFlags(128);
        } catch (java.lang.Exception unused) {
        }
        super.onDestroy();
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f167319n;
        if (snsInfo != null && snsInfo.getTimeLine().ContentObj.f369840h.size() > 0) {
            ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.sns.ui.kn(this, ((r45.jj4) this.f167319n.getTimeLine().ContentObj.f369840h.get(0)).f377858g, this.f167319n.getTimeLine().sightFolded, this.f167325r.getPlayVideoDuration()));
        }
        dx1.g.f244489a.j("SnsPublishProcess", "mediaPreviewPageStaytime_", java.lang.Long.valueOf(getActivityBrowseTimeMs()), bx1.u.f36310e);
        if (!this.f167316i && com.tencent.mm.plugin.sns.model.j4.d()) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f167319n;
            java.lang.String t07 = snsInfo2 != null ? ca4.z0.t0(snsInfo2.field_snsId) : "";
            int i17 = this.f167315h;
            if (i17 == 0) {
                ta4.f1.f416743a.b(3, 2, t07, 0);
            } else if (i17 == 1) {
                ta4.f1.f416743a.b(4, 2, t07, 0);
            }
        }
        this.V.removeTouchExplorationStateChangeListener(this);
        xd4.f fVar = this.U;
        if (fVar != null) {
            fVar.d(null);
        }
        final x25.b bVar = this.W;
        if (bVar != null) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            java.util.Objects.requireNonNull(bVar);
            ((ku5.t0) u0Var).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$a
                @Override // java.lang.Runnable
                public final void run() {
                    xd4.l0 l0Var = (xd4.l0) x25.b.this;
                    l0Var.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
                    l0Var.a();
                    l0Var.f453679n = true;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportImpl", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
                    java.util.Map b17 = l0Var.b();
                    b17.toString();
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("sns_player_panel_operation", b17, 36244);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportImpl", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
                }
            });
            this.W = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        getWindow().setFlags(2048, 2048);
        if (this.f167310J) {
            ((com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) this.f167325r).j0();
        } else {
            com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = this.f167325r;
            onlineVideoView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            onlineVideoView.hashCode();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            onlineVideoView.t();
            com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = onlineVideoView.B;
            if (f4Var != null) {
                f4Var.stop();
            }
            onlineVideoView.f166460x1 = false;
            onlineVideoView.S = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        }
        if (!this.f167329v) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closePopup", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            if (this.F) {
                new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.sns.ui.ln(this), 500L);
            } else {
                new com.tencent.mm.sdk.platformtools.n3().post(new com.tencent.mm.plugin.sns.ui.mn(this));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closePopup", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        }
        super.onPause();
        if (this.f167336y1) {
            this.f167336y1 = false;
            j7(2);
        }
        qp1.h0.b();
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().r0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        getWindow().clearFlags(2048);
        if (this.f167310J) {
            this.f167325r.K();
        } else if (!this.f167311d) {
            this.f167325r.C();
        }
        this.f167311d = false;
        if (this.f167329v) {
            this.f167329v = false;
        }
        super.onResume();
        qp1.h0.a(true, true, true);
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().k0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        android.os.Bundle bundle = this.f167327t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        if (this.f167330w) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        } else {
            this.f167330w = true;
            this.f167334y = getIntent().getIntExtra("img_gallery_top", 0);
            this.f167337z = getIntent().getIntExtra("img_gallery_left", 0);
            this.A = getIntent().getIntExtra("img_gallery_width", 0);
            int intExtra = getIntent().getIntExtra("img_gallery_height", 0);
            this.B = intExtra;
            com.tencent.mm.ui.tools.s4 s4Var = this.f167331x;
            if (s4Var != null) {
                s4Var.e(this.f167337z, this.f167334y, this.A, intExtra);
            }
            if (bundle == null) {
                this.f167326s.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.sns.ui.on(this));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        }
        super.onStart();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchExplorationStateChanged", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        this.U.onTouchExplorationStateChanged(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchExplorationStateChanged", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }
}
