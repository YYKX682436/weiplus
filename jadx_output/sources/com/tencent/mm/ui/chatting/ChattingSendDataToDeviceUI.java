package com.tencent.mm.ui.chatting;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "com/tencent/mm/ui/chatting/r7", "com/tencent/mm/ui/chatting/u7", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public class ChattingSendDataToDeviceUI extends com.tencent.mm.ui.MMActivity {
    public android.widget.Button A;
    public com.tencent.mm.feature.exdevice.NetworkDeviceInfo A1;
    public android.widget.Button B;
    public com.tencent.mm.plugin.exdevice.api.IExdeviceSendPoiMessageExportApi$ExDeviceInfo B1;
    public android.widget.TextView C;
    public int C1;
    public android.widget.ProgressBar D;
    public int D1;
    public androidx.recyclerview.widget.RecyclerView E;
    public boolean E1;
    public androidx.recyclerview.widget.RecyclerView F;
    public boolean F1;
    public androidx.recyclerview.widget.RecyclerView G;
    public final java.lang.String G1;
    public com.tencent.mm.ui.widget.dialog.u1 H;
    public final java.lang.String H1;
    public com.tencent.mm.ui.widget.dialog.u1 I;
    public final java.lang.String I1;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f198222J;
    public final java.lang.String J1;
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter K;
    public final java.lang.String K1;
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter L;
    public final java.lang.String L1;
    public boolean M;
    public final java.lang.String M1;
    public boolean N;
    public final int N1;
    public final int O1;
    public java.lang.String P;
    public int P1;
    public final java.lang.String Q1;
    public final com.tencent.mm.sdk.event.IListener R1;
    public final com.tencent.mm.sdk.event.IListener S1;
    public long T;
    public final android.view.View.OnClickListener T1;
    public int U;
    public final android.view.View.OnClickListener U1;
    public com.tencent.mm.storage.f9 V;
    public ot0.q W;
    public int X;
    public boolean Y;
    public long Z;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f198224e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f198225f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f198226g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f198227h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f198228i;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f198229l1;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f198230m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f198231n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f198232o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f198233p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f198234p0;

    /* renamed from: p1, reason: collision with root package name */
    public r45.fu5 f198235p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f198236q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f198237r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f198238s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f198239t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewGroup f198240u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewGroup f198241v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f198242w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f198243x;

    /* renamed from: x0, reason: collision with root package name */
    public r45.xf4 f198244x0;

    /* renamed from: x1, reason: collision with root package name */
    public final o11.g f198245x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f198246y;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f198247y0;

    /* renamed from: y1, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.u7 f198248y1;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f198249z;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f198250z1;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f198223d = "MicroMsg.chatting.ChattingSendDataToDeviceUI";
    public final java.util.ArrayList Q = new java.util.ArrayList();
    public final java.util.ArrayList R = new java.util.ArrayList();
    public final java.util.ArrayList S = new java.util.ArrayList();

    public ChattingSendDataToDeviceUI() {
        o11.f fVar = new o11.f();
        fVar.f342091o = com.tencent.mm.R.drawable.c1n;
        this.f198245x1 = fVar.a();
        this.C1 = 2;
        this.D1 = -1;
        this.G1 = "send_data_idle";
        this.H1 = "send_data_click";
        this.I1 = "send_data_sucess";
        this.J1 = "send_data_failed";
        this.K1 = "send_data_sending";
        this.L1 = "send_data_outdate";
        this.M1 = "send_data_too_large";
        this.N1 = 1;
        this.O1 = 2;
        this.P1 = -1;
        this.Q1 = "ohter_entrance";
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.R1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExDeviceScanNetworkDeviceResultEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$exDeviceScanNetworkDeviceResultListener$1
            {
                this.__eventId = 1609109263;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExDeviceScanNetworkDeviceResultEvent exDeviceScanNetworkDeviceResultEvent) {
                com.tencent.mm.autogen.events.ExDeviceScanNetworkDeviceResultEvent event = exDeviceScanNetworkDeviceResultEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI.this;
                if (chattingSendDataToDeviceUI.f198248y1 == null) {
                    chattingSendDataToDeviceUI.f198248y1 = new com.tencent.mm.ui.chatting.u7(chattingSendDataToDeviceUI);
                }
                com.tencent.mm.ui.chatting.u7 u7Var = chattingSendDataToDeviceUI.f198248y1;
                if (u7Var == null) {
                    return false;
                }
                u7Var.a(event);
                return true;
            }
        };
        this.S1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$exDeviceSendDataToNetworkDeviceStateListener$1
            {
                this.__eventId = 882974087;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent exDeviceSendDataToNetworkDeviceStateEvent) {
                com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent event = exDeviceSendDataToNetworkDeviceStateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI.this;
                if (chattingSendDataToDeviceUI.f198248y1 == null) {
                    chattingSendDataToDeviceUI.f198248y1 = new com.tencent.mm.ui.chatting.u7(chattingSendDataToDeviceUI);
                }
                com.tencent.mm.ui.chatting.u7 u7Var = chattingSendDataToDeviceUI.f198248y1;
                kotlin.jvm.internal.o.d(u7Var);
                u7Var.a(event);
                return true;
            }
        };
        this.T1 = new com.tencent.mm.ui.chatting.v7(this);
        this.U1 = new com.tencent.mm.ui.chatting.x7(this);
    }

    public static void b7(com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI, java.lang.String newSendState, r45.xf4 xf4Var, r45.yf4 yf4Var, java.lang.String str, int i17, java.lang.Object obj) {
        java.lang.String str2;
        com.tencent.mm.ui.widget.dialog.j0 j0Var;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSendState");
        }
        java.lang.String msgHint = (i17 & 8) != 0 ? "" : str;
        chattingSendDataToDeviceUI.getClass();
        kotlin.jvm.internal.o.g(newSendState, "newSendState");
        kotlin.jvm.internal.o.g(msgHint, "msgHint");
        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = chattingSendDataToDeviceUI.A1;
        if (networkDeviceInfo == null) {
            return;
        }
        boolean b17 = kotlin.jvm.internal.o.b(networkDeviceInfo.f66592m, newSendState);
        java.lang.String str3 = chattingSendDataToDeviceUI.f198223d;
        if (b17) {
            com.tencent.mars.xlog.Log.w(str3, "duplicate state ".concat(newSendState));
            return;
        }
        com.tencent.mars.xlog.Log.w(str3, "new state ".concat(newSendState));
        networkDeviceInfo.f66592m = newSendState;
        chattingSendDataToDeviceUI.f198244x0 = xf4Var;
        if (kotlin.jvm.internal.o.b(newSendState, chattingSendDataToDeviceUI.H1)) {
            android.view.ViewGroup viewGroup = chattingSendDataToDeviceUI.f198231n;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("otherDeviceLayout");
                throw null;
            }
            c7(chattingSendDataToDeviceUI, viewGroup, 8, 0L, 2, null);
            android.view.ViewGroup viewGroup2 = chattingSendDataToDeviceUI.f198224e;
            if (viewGroup2 == null) {
                kotlin.jvm.internal.o.o("deviceMainLayout");
                throw null;
            }
            c7(chattingSendDataToDeviceUI, viewGroup2, 8, 0L, 2, null);
            android.view.ViewGroup viewGroup3 = chattingSendDataToDeviceUI.f198232o;
            if (viewGroup3 == null) {
                kotlin.jvm.internal.o.o("sendingDeviceLayout");
                throw null;
            }
            c7(chattingSendDataToDeviceUI, viewGroup3, 0, 0L, 2, null);
            android.widget.ImageView imageView = chattingSendDataToDeviceUI.f198233p;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("sendingBackIv");
                throw null;
            }
            imageView.setVisibility(0);
            android.view.ViewGroup viewGroup4 = chattingSendDataToDeviceUI.f198238s;
            if (viewGroup4 == null) {
                kotlin.jvm.internal.o.o("sendingCurLayout");
                throw null;
            }
            viewGroup4.setVisibility(0);
            if (networkDeviceInfo.f66594o) {
                android.widget.ImageView imageView2 = chattingSendDataToDeviceUI.f198237r;
                if (imageView2 == null) {
                    kotlin.jvm.internal.o.o("sendingCurIv");
                    throw null;
                }
                imageView2.setColorFilter(chattingSendDataToDeviceUI.P1, android.graphics.PorterDuff.Mode.SRC_IN);
            } else {
                android.widget.ImageView imageView3 = chattingSendDataToDeviceUI.f198237r;
                if (imageView3 == null) {
                    kotlin.jvm.internal.o.o("sendingCurIv");
                    throw null;
                }
                imageView3.setColorFilter((android.graphics.ColorFilter) null);
            }
            n11.a b18 = n11.a.b();
            java.lang.String str4 = networkDeviceInfo.f66589g;
            android.widget.ImageView imageView4 = chattingSendDataToDeviceUI.f198237r;
            if (imageView4 == null) {
                kotlin.jvm.internal.o.o("sendingCurIv");
                throw null;
            }
            b18.h(str4, imageView4, chattingSendDataToDeviceUI.f198245x1);
            android.widget.Button button = chattingSendDataToDeviceUI.A;
            if (button == null) {
                kotlin.jvm.internal.o.o("sendingConfirmBtn");
                throw null;
            }
            button.setVisibility(0);
            android.widget.Button button2 = chattingSendDataToDeviceUI.A;
            if (button2 == null) {
                kotlin.jvm.internal.o.o("sendingConfirmBtn");
                throw null;
            }
            button2.setText(com.tencent.mm.R.string.ihp);
            android.view.ViewGroup viewGroup5 = chattingSendDataToDeviceUI.f198240u;
            if (viewGroup5 == null) {
                kotlin.jvm.internal.o.o("sendingStatusTvContainer");
                throw null;
            }
            viewGroup5.setVisibility(0);
            android.widget.TextView textView = chattingSendDataToDeviceUI.f198246y;
            if (textView == null) {
                kotlin.jvm.internal.o.o("sendingStatusTv");
                throw null;
            }
            textView.setVisibility(0);
            android.widget.TextView textView2 = chattingSendDataToDeviceUI.f198246y;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("sendingStatusTv");
                throw null;
            }
            java.lang.String string = chattingSendDataToDeviceUI.getContext().getString(com.tencent.mm.R.string.c4u);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = chattingSendDataToDeviceUI.T6();
            java.lang.String str5 = networkDeviceInfo.f66588f;
            objArr[1] = str5 == null || str5.length() == 0 ? chattingSendDataToDeviceUI.getContext().getString(com.tencent.mm.R.string.c3_) : networkDeviceInfo.f66588f;
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(objArr, 2));
            kotlin.jvm.internal.o.f(format, "format(...)");
            textView2.setText(format);
            android.view.ViewGroup viewGroup6 = chattingSendDataToDeviceUI.f198239t;
            if (viewGroup6 == null) {
                kotlin.jvm.internal.o.o("sendingIvLayout");
                throw null;
            }
            viewGroup6.setVisibility(8);
            android.widget.ImageView imageView5 = chattingSendDataToDeviceUI.f198236q;
            if (imageView5 == null) {
                kotlin.jvm.internal.o.o("sendingStatusIv");
                throw null;
            }
            imageView5.setVisibility(8);
            android.widget.Button button3 = chattingSendDataToDeviceUI.B;
            if (button3 == null) {
                kotlin.jvm.internal.o.o("sendingFinishBtn");
                throw null;
            }
            button3.setVisibility(8);
            android.widget.TextView textView3 = chattingSendDataToDeviceUI.C;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("sendingSettingTv");
                throw null;
            }
            textView3.setVisibility(8);
            android.widget.TextView textView4 = chattingSendDataToDeviceUI.f198249z;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("sendingHintTv");
                throw null;
            }
            textView4.setVisibility(8);
            android.widget.ProgressBar progressBar = chattingSendDataToDeviceUI.D;
            if (progressBar != null) {
                progressBar.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("sendingProgress");
                throw null;
            }
        }
        boolean b19 = kotlin.jvm.internal.o.b(newSendState, chattingSendDataToDeviceUI.J1) ? true : kotlin.jvm.internal.o.b(newSendState, chattingSendDataToDeviceUI.L1);
        java.lang.String str6 = chattingSendDataToDeviceUI.M1;
        if (b19 ? true : kotlin.jvm.internal.o.b(newSendState, str6)) {
            android.view.ViewGroup viewGroup7 = chattingSendDataToDeviceUI.f198231n;
            if (viewGroup7 == null) {
                kotlin.jvm.internal.o.o("otherDeviceLayout");
                throw null;
            }
            c7(chattingSendDataToDeviceUI, viewGroup7, 8, 0L, 2, null);
            android.view.ViewGroup viewGroup8 = chattingSendDataToDeviceUI.f198224e;
            if (viewGroup8 == null) {
                kotlin.jvm.internal.o.o("deviceMainLayout");
                throw null;
            }
            c7(chattingSendDataToDeviceUI, viewGroup8, 8, 0L, 2, null);
            android.view.ViewGroup viewGroup9 = chattingSendDataToDeviceUI.f198232o;
            if (viewGroup9 == null) {
                kotlin.jvm.internal.o.o("sendingDeviceLayout");
                throw null;
            }
            c7(chattingSendDataToDeviceUI, viewGroup9, 0, 0L, 2, null);
            android.view.ViewGroup viewGroup10 = chattingSendDataToDeviceUI.f198239t;
            if (viewGroup10 == null) {
                kotlin.jvm.internal.o.o("sendingIvLayout");
                throw null;
            }
            viewGroup10.setVisibility(0);
            android.widget.ImageView imageView6 = chattingSendDataToDeviceUI.f198236q;
            if (imageView6 == null) {
                kotlin.jvm.internal.o.o("sendingStatusIv");
                throw null;
            }
            imageView6.setImageResource(com.tencent.mm.R.raw.exdevice_send_failed);
            android.widget.ImageView imageView7 = chattingSendDataToDeviceUI.f198236q;
            if (imageView7 == null) {
                kotlin.jvm.internal.o.o("sendingStatusIv");
                throw null;
            }
            imageView7.setVisibility(0);
            android.widget.Button button4 = chattingSendDataToDeviceUI.B;
            if (button4 == null) {
                kotlin.jvm.internal.o.o("sendingFinishBtn");
                throw null;
            }
            button4.setVisibility(0);
            if (yf4Var != null) {
                com.tencent.mars.xlog.Log.i(str3, yf4Var.f391039d);
                android.widget.TextView textView5 = chattingSendDataToDeviceUI.f198246y;
                if (textView5 == null) {
                    kotlin.jvm.internal.o.o("sendingStatusTv");
                    throw null;
                }
                textView5.setText(yf4Var.f391039d);
                java.lang.String subtitle_wording = yf4Var.f391040e;
                kotlin.jvm.internal.o.f(subtitle_wording, "subtitle_wording");
                if (!r26.n0.N(subtitle_wording)) {
                    android.widget.TextView textView6 = chattingSendDataToDeviceUI.f198249z;
                    if (textView6 == null) {
                        kotlin.jvm.internal.o.o("sendingHintTv");
                        throw null;
                    }
                    textView6.setText(yf4Var.f391040e);
                    android.widget.TextView textView7 = chattingSendDataToDeviceUI.f198249z;
                    if (textView7 == null) {
                        kotlin.jvm.internal.o.o("sendingHintTv");
                        throw null;
                    }
                    textView7.setVisibility(0);
                }
            } else if (kotlin.jvm.internal.o.b(networkDeviceInfo.f66592m, str6)) {
                android.widget.TextView textView8 = chattingSendDataToDeviceUI.f198246y;
                if (textView8 == null) {
                    kotlin.jvm.internal.o.o("sendingStatusTv");
                    throw null;
                }
                textView8.setText(com.tencent.mm.R.string.b7i);
            } else {
                android.widget.TextView textView9 = chattingSendDataToDeviceUI.f198246y;
                if (textView9 == null) {
                    kotlin.jvm.internal.o.o("sendingStatusTv");
                    throw null;
                }
                textView9.setText(com.tencent.mm.R.string.c4v);
            }
            android.view.ViewGroup viewGroup11 = chattingSendDataToDeviceUI.f198238s;
            if (viewGroup11 == null) {
                kotlin.jvm.internal.o.o("sendingCurLayout");
                throw null;
            }
            viewGroup11.setVisibility(8);
            android.widget.Button button5 = chattingSendDataToDeviceUI.A;
            if (button5 == null) {
                kotlin.jvm.internal.o.o("sendingConfirmBtn");
                throw null;
            }
            button5.setVisibility(8);
            android.widget.ImageView imageView8 = chattingSendDataToDeviceUI.f198233p;
            if (imageView8 == null) {
                kotlin.jvm.internal.o.o("sendingBackIv");
                throw null;
            }
            imageView8.setVisibility(8);
            android.widget.ProgressBar progressBar2 = chattingSendDataToDeviceUI.D;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("sendingProgress");
                throw null;
            }
        }
        if (kotlin.jvm.internal.o.b(newSendState, chattingSendDataToDeviceUI.K1)) {
            android.view.ViewGroup viewGroup12 = chattingSendDataToDeviceUI.f198231n;
            if (viewGroup12 == null) {
                kotlin.jvm.internal.o.o("otherDeviceLayout");
                throw null;
            }
            c7(chattingSendDataToDeviceUI, viewGroup12, 8, 0L, 2, null);
            android.view.ViewGroup viewGroup13 = chattingSendDataToDeviceUI.f198224e;
            if (viewGroup13 == null) {
                kotlin.jvm.internal.o.o("deviceMainLayout");
                throw null;
            }
            c7(chattingSendDataToDeviceUI, viewGroup13, 8, 0L, 2, null);
            android.view.ViewGroup viewGroup14 = chattingSendDataToDeviceUI.f198232o;
            if (viewGroup14 == null) {
                kotlin.jvm.internal.o.o("sendingDeviceLayout");
                throw null;
            }
            c7(chattingSendDataToDeviceUI, viewGroup14, 0, 0L, 2, null);
            android.widget.TextView textView10 = chattingSendDataToDeviceUI.f198246y;
            if (textView10 == null) {
                kotlin.jvm.internal.o.o("sendingStatusTv");
                throw null;
            }
            textView10.setText(com.tencent.mm.R.string.iij);
            android.view.ViewGroup viewGroup15 = chattingSendDataToDeviceUI.f198240u;
            if (viewGroup15 == null) {
                kotlin.jvm.internal.o.o("sendingStatusTvContainer");
                throw null;
            }
            viewGroup15.setVisibility(0);
            android.widget.TextView textView11 = chattingSendDataToDeviceUI.f198246y;
            if (textView11 == null) {
                kotlin.jvm.internal.o.o("sendingStatusTv");
                throw null;
            }
            textView11.setVisibility(0);
            android.widget.ProgressBar progressBar3 = chattingSendDataToDeviceUI.D;
            if (progressBar3 == null) {
                kotlin.jvm.internal.o.o("sendingProgress");
                throw null;
            }
            progressBar3.setVisibility(0);
            android.widget.ImageView imageView9 = chattingSendDataToDeviceUI.f198233p;
            if (imageView9 == null) {
                kotlin.jvm.internal.o.o("sendingBackIv");
                throw null;
            }
            imageView9.setVisibility(0);
            android.view.ViewGroup viewGroup16 = chattingSendDataToDeviceUI.f198238s;
            if (viewGroup16 == null) {
                kotlin.jvm.internal.o.o("sendingCurLayout");
                throw null;
            }
            viewGroup16.setVisibility(8);
            android.widget.TextView textView12 = chattingSendDataToDeviceUI.C;
            if (textView12 == null) {
                kotlin.jvm.internal.o.o("sendingSettingTv");
                throw null;
            }
            textView12.setVisibility(8);
            android.widget.Button button6 = chattingSendDataToDeviceUI.A;
            if (button6 == null) {
                kotlin.jvm.internal.o.o("sendingConfirmBtn");
                throw null;
            }
            button6.setVisibility(8);
            android.widget.Button button7 = chattingSendDataToDeviceUI.B;
            if (button7 == null) {
                kotlin.jvm.internal.o.o("sendingFinishBtn");
                throw null;
            }
            button7.setVisibility(8);
            android.widget.TextView textView13 = chattingSendDataToDeviceUI.f198249z;
            if (textView13 == null) {
                kotlin.jvm.internal.o.o("sendingHintTv");
                throw null;
            }
            textView13.setVisibility(8);
            android.view.ViewGroup viewGroup17 = chattingSendDataToDeviceUI.f198239t;
            if (viewGroup17 == null) {
                kotlin.jvm.internal.o.o("sendingIvLayout");
                throw null;
            }
            viewGroup17.setVisibility(8);
            android.widget.ImageView imageView10 = chattingSendDataToDeviceUI.f198236q;
            if (imageView10 != null) {
                imageView10.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("sendingStatusIv");
                throw null;
            }
        }
        if (kotlin.jvm.internal.o.b(newSendState, chattingSendDataToDeviceUI.I1)) {
            android.view.ViewGroup viewGroup18 = chattingSendDataToDeviceUI.f198231n;
            if (viewGroup18 == null) {
                kotlin.jvm.internal.o.o("otherDeviceLayout");
                throw null;
            }
            c7(chattingSendDataToDeviceUI, viewGroup18, 8, 0L, 2, null);
            android.view.ViewGroup viewGroup19 = chattingSendDataToDeviceUI.f198224e;
            if (viewGroup19 == null) {
                kotlin.jvm.internal.o.o("deviceMainLayout");
                throw null;
            }
            c7(chattingSendDataToDeviceUI, viewGroup19, 8, 0L, 2, null);
            android.view.ViewGroup viewGroup20 = chattingSendDataToDeviceUI.f198232o;
            if (viewGroup20 == null) {
                kotlin.jvm.internal.o.o("sendingDeviceLayout");
                throw null;
            }
            c7(chattingSendDataToDeviceUI, viewGroup20, 0, 0L, 2, null);
            android.view.ViewGroup viewGroup21 = chattingSendDataToDeviceUI.f198239t;
            if (viewGroup21 == null) {
                kotlin.jvm.internal.o.o("sendingIvLayout");
                throw null;
            }
            viewGroup21.setVisibility(0);
            android.widget.ImageView imageView11 = chattingSendDataToDeviceUI.f198236q;
            if (imageView11 == null) {
                kotlin.jvm.internal.o.o("sendingStatusIv");
                throw null;
            }
            imageView11.setVisibility(0);
            android.widget.Button button8 = chattingSendDataToDeviceUI.A;
            if (button8 == null) {
                kotlin.jvm.internal.o.o("sendingConfirmBtn");
                throw null;
            }
            button8.setVisibility(0);
            android.view.ViewGroup viewGroup22 = chattingSendDataToDeviceUI.f198240u;
            if (viewGroup22 == null) {
                kotlin.jvm.internal.o.o("sendingStatusTvContainer");
                throw null;
            }
            viewGroup22.setVisibility(0);
            android.widget.TextView textView14 = chattingSendDataToDeviceUI.f198246y;
            if (textView14 == null) {
                kotlin.jvm.internal.o.o("sendingStatusTv");
                throw null;
            }
            textView14.setVisibility(0);
            android.widget.Button button9 = chattingSendDataToDeviceUI.B;
            if (button9 == null) {
                kotlin.jvm.internal.o.o("sendingFinishBtn");
                throw null;
            }
            button9.setVisibility(0);
            if (chattingSendDataToDeviceUI.f198244x0 != null || yf4Var == null) {
                android.widget.TextView textView15 = chattingSendDataToDeviceUI.f198246y;
                if (textView15 == null) {
                    kotlin.jvm.internal.o.o("sendingStatusTv");
                    throw null;
                }
                textView15.setText(com.tencent.mm.R.string.f490890b64);
            } else {
                android.widget.TextView textView16 = chattingSendDataToDeviceUI.f198246y;
                if (textView16 == null) {
                    kotlin.jvm.internal.o.o("sendingStatusTv");
                    throw null;
                }
                textView16.setText(yf4Var.f391039d);
                java.lang.String subtitle_wording2 = yf4Var.f391040e;
                kotlin.jvm.internal.o.f(subtitle_wording2, "subtitle_wording");
                if (!r26.n0.N(subtitle_wording2)) {
                    android.widget.TextView textView17 = chattingSendDataToDeviceUI.f198249z;
                    if (textView17 == null) {
                        kotlin.jvm.internal.o.o("sendingHintTv");
                        throw null;
                    }
                    textView17.setText(yf4Var.f391040e);
                    android.widget.TextView textView18 = chattingSendDataToDeviceUI.f198249z;
                    if (textView18 == null) {
                        kotlin.jvm.internal.o.o("sendingHintTv");
                        throw null;
                    }
                    textView18.setVisibility(0);
                }
            }
            if (chattingSendDataToDeviceUI.f198235p1 != null) {
                android.view.ViewGroup viewGroup23 = chattingSendDataToDeviceUI.f198241v;
                if (viewGroup23 == null) {
                    kotlin.jvm.internal.o.o("sendingSsvContainer");
                    throw null;
                }
                viewGroup23.setVisibility(0);
                android.widget.TextView textView19 = chattingSendDataToDeviceUI.f198243x;
                if (textView19 == null) {
                    kotlin.jvm.internal.o.o("sendingSsvTv");
                    throw null;
                }
                r45.fu5 fu5Var = chattingSendDataToDeviceUI.f198235p1;
                textView19.setText(fu5Var != null ? fu5Var.f374600d : null);
                n11.a b27 = n11.a.b();
                r45.fu5 fu5Var2 = chattingSendDataToDeviceUI.f198235p1;
                java.lang.String str7 = fu5Var2 != null ? fu5Var2.f374604h : null;
                android.widget.ImageView imageView12 = chattingSendDataToDeviceUI.f198242w;
                if (imageView12 == null) {
                    kotlin.jvm.internal.o.o("sendingSsvIv");
                    throw null;
                }
                b27.h(str7, imageView12, new o11.f().a());
                android.widget.Button button10 = chattingSendDataToDeviceUI.B;
                if (button10 == null) {
                    kotlin.jvm.internal.o.o("sendingFinishBtn");
                    throw null;
                }
                button10.setText(com.tencent.mm.R.string.f490454vi);
                str2 = "format(...)";
            } else if (chattingSendDataToDeviceUI.f198244x0 != null) {
                android.widget.Button button11 = chattingSendDataToDeviceUI.B;
                if (button11 == null) {
                    kotlin.jvm.internal.o.o("sendingFinishBtn");
                    throw null;
                }
                button11.setText(com.tencent.mm.R.string.fs9);
                android.widget.TextView textView20 = chattingSendDataToDeviceUI.f198249z;
                if (textView20 == null) {
                    kotlin.jvm.internal.o.o("sendingHintTv");
                    throw null;
                }
                textView20.setVisibility(0);
                android.widget.TextView textView21 = chattingSendDataToDeviceUI.f198249z;
                if (textView21 == null) {
                    kotlin.jvm.internal.o.o("sendingHintTv");
                    throw null;
                }
                java.lang.String string2 = chattingSendDataToDeviceUI.getContext().getString(com.tencent.mm.R.string.c4x);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                java.lang.String str8 = networkDeviceInfo.f66588f;
                objArr2[0] = str8 == null || str8.length() == 0 ? chattingSendDataToDeviceUI.getContext().getString(com.tencent.mm.R.string.c3_) : networkDeviceInfo.f66588f;
                java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(objArr2, 1));
                str2 = "format(...)";
                kotlin.jvm.internal.o.f(format2, str2);
                textView21.setText(format2);
            } else {
                str2 = "format(...)";
                android.widget.Button button12 = chattingSendDataToDeviceUI.B;
                if (button12 == null) {
                    kotlin.jvm.internal.o.o("sendingFinishBtn");
                    throw null;
                }
                button12.setText(com.tencent.mm.R.string.f490454vi);
            }
            android.widget.Button button13 = chattingSendDataToDeviceUI.A;
            if (button13 == null) {
                kotlin.jvm.internal.o.o("sendingConfirmBtn");
                throw null;
            }
            button13.setVisibility(8);
            android.widget.TextView textView22 = chattingSendDataToDeviceUI.C;
            if (textView22 == null) {
                kotlin.jvm.internal.o.o("sendingSettingTv");
                throw null;
            }
            textView22.setVisibility(8);
            android.view.ViewGroup viewGroup24 = chattingSendDataToDeviceUI.f198238s;
            if (viewGroup24 == null) {
                kotlin.jvm.internal.o.o("sendingCurLayout");
                throw null;
            }
            viewGroup24.setVisibility(8);
            android.widget.ProgressBar progressBar4 = chattingSendDataToDeviceUI.D;
            if (progressBar4 == null) {
                kotlin.jvm.internal.o.o("sendingProgress");
                throw null;
            }
            progressBar4.setVisibility(8);
            android.widget.ImageView imageView13 = chattingSendDataToDeviceUI.f198233p;
            if (imageView13 == null) {
                kotlin.jvm.internal.o.o("sendingBackIv");
                throw null;
            }
            imageView13.setVisibility(8);
            android.widget.ImageView imageView14 = chattingSendDataToDeviceUI.f198236q;
            if (imageView14 == null) {
                kotlin.jvm.internal.o.o("sendingStatusIv");
                throw null;
            }
            imageView14.setImageResource(com.tencent.mm.R.raw.exdevice_send_success);
            com.tencent.mm.ui.widget.dialog.u1 u1Var = chattingSendDataToDeviceUI.H;
            if (u1Var == null || (j0Var = u1Var.f211998c) == null) {
                return;
            }
            java.lang.String string3 = j0Var.getContext().getString(com.tencent.mm.R.string.c4w);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            java.lang.String format3 = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{chattingSendDataToDeviceUI.T6()}, 1));
            kotlin.jvm.internal.o.f(format3, str2);
            j0Var.t(format3);
            j0Var.k(-2, false);
            j0Var.A(chattingSendDataToDeviceUI.getString(com.tencent.mm.R.string.f490507x1), true, new com.tencent.mm.ui.chatting.g8(chattingSendDataToDeviceUI));
        }
    }

    public static void c7(com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI, android.view.View view, int i17, long j17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideVisibility");
        }
        if ((i18 & 2) != 0) {
            j17 = 300;
        }
        chattingSendDataToDeviceUI.getClass();
        kotlin.jvm.internal.o.g(view, "<this>");
        if (i17 == view.getVisibility()) {
            return;
        }
        if (i17 == 8) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI", "slideVisibility", "(Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI", "slideVisibility", "(Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        androidx.transition.Slide slide = new androidx.transition.Slide(80);
        slide.f12383f = j17;
        slide.c(view);
        android.view.ViewParent parent = view.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        u4.g1.a((android.view.ViewGroup) parent, slide);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI", "slideVisibility", "(Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI", "slideVisibility", "(Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final java.lang.String T6() {
        com.tencent.mars.xlog.Log.i(this.f198223d, "hwDeviceMsgType: " + this.D1);
        switch (this.D1) {
            case 1:
                java.lang.String string = getContext().getString(com.tencent.mm.R.string.f490409u6);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                return string;
            case 2:
                java.lang.String string2 = getContext().getString(com.tencent.mm.R.string.ggf);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                return string2;
            case 3:
                java.lang.String string3 = getContext().getString(com.tencent.mm.R.string.lax);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                return string3;
            case 4:
                java.lang.String string4 = getContext().getString(com.tencent.mm.R.string.f490400tx);
                kotlin.jvm.internal.o.f(string4, "getString(...)");
                return string4;
            case 5:
                java.lang.String string5 = getContext().getString(com.tencent.mm.R.string.c5j);
                kotlin.jvm.internal.o.f(string5, "getString(...)");
                return string5;
            case 6:
                java.lang.String string6 = getContext().getString(com.tencent.mm.R.string.f490424ul);
                kotlin.jvm.internal.o.f(string6, "getString(...)");
                return string6;
            default:
                java.lang.String string7 = getContext().getString(com.tencent.mm.R.string.f490400tx);
                kotlin.jvm.internal.o.f(string7, "getString(...)");
                return string7;
        }
    }

    public final boolean U6(com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo) {
        java.util.LinkedList linkedList;
        java.lang.String str = this.f198234p0;
        long j17 = this.T;
        java.lang.String str2 = this.f198223d;
        boolean z17 = false;
        if (j17 == -1 && str == null) {
            com.tencent.mars.xlog.Log.e(str2, "isNeedToShowNormal null");
            return false;
        }
        com.tencent.mm.storage.f9 f9Var = this.V;
        if (f9Var == null) {
            f9Var = null;
        }
        java.lang.String str3 = networkDeviceInfo.f66590h;
        boolean z18 = networkDeviceInfo.f66594o;
        if ((!z18 && str3 == null) || (z18 && ((linkedList = networkDeviceInfo.f66596q) == null || linkedList.isEmpty()))) {
            com.tencent.mars.xlog.Log.e(str2, "isNeedToShowNormal " + networkDeviceInfo);
            return false;
        }
        if (f9Var != null && f9Var.getMsgId() != 0) {
            z17 = f9Var.k2();
            this.U = f9Var.getType();
            str = f9Var.j();
        } else if (this.f198234p0 == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(str2, "isNeedToShowNormal: " + com.tencent.mm.sdk.platformtools.t8.G1(str) + ' ' + z17);
        return com.tencent.mm.ui.chatting.qc.f202624a.b(this.U, f9Var, str, networkDeviceInfo);
    }

    public final boolean V6(com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo, java.lang.String str) {
        if (str == null) {
            return false;
        }
        com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent getSnsTimeLineObjectEvent = new com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent();
        getSnsTimeLineObjectEvent.f54414g.f7619a = str;
        getSnsTimeLineObjectEvent.e();
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = getSnsTimeLineObjectEvent.f54415h.f7711a;
        int i17 = timeLineObject.ContentObj.f369837e;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17)};
        java.lang.String str2 = this.f198223d;
        com.tencent.mars.xlog.Log.i(str2, "isNeedToShowSnsInfo contentStyle %d", objArr);
        java.lang.String str3 = networkDeviceInfo.f66590h;
        if (str3 == null) {
            com.tencent.mars.xlog.Log.e(str2, "ability is null");
            return false;
        }
        if (i17 != 1) {
            if (i17 != 15) {
                if (i17 != 42) {
                    if (i17 != 54) {
                        com.tencent.mm.ui.chatting.qc qcVar = com.tencent.mm.ui.chatting.qc.f202624a;
                        if (i17 == 3) {
                            java.lang.String Url = timeLineObject.ContentObj.f369839g;
                            kotlin.jvm.internal.o.f(Url, "Url");
                            return qcVar.a(Url, networkDeviceInfo);
                        }
                        if (i17 != 4) {
                            if (i17 != 5) {
                                return false;
                            }
                            java.lang.String Url2 = timeLineObject.ContentObj.f369839g;
                            kotlin.jvm.internal.o.f(Url2, "Url");
                            return qcVar.a(Url2, networkDeviceInfo);
                        }
                    }
                }
                if (!r26.n0.B(str3, "wxmsg_music", false)) {
                    return false;
                }
            } else if (!r26.n0.B(str3, "wxmsg_video", false)) {
                return false;
            }
            return true;
        }
        if (!r26.n0.B(str3, "wxmsg_image", false)) {
            return false;
        }
        return true;
    }

    public final void W6(com.tencent.mm.feature.exdevice.NetworkDeviceInfo item) {
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDeviceClick ");
        sb6.append(this.A1 != null);
        com.tencent.mars.xlog.Log.i(this.f198223d, sb6.toString());
        this.f198250z1 = true;
        if (this.A1 != null) {
            return;
        }
        this.A1 = item;
        b7(this, this.H1, null, null, null, 8, null);
    }

    public final void X6() {
        android.view.ViewGroup viewGroup = this.f198224e;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("deviceMainLayout");
            throw null;
        }
        c7(this, viewGroup, 8, 0L, 2, null);
        android.view.ViewGroup viewGroup2 = this.f198231n;
        if (viewGroup2 != null) {
            c7(this, viewGroup2, 0, 0L, 2, null);
        } else {
            kotlin.jvm.internal.o.o("otherDeviceLayout");
            throw null;
        }
    }

    public final void Y6(int i17) {
        ot0.q v17;
        java.lang.String str = "";
        if (this.M) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13197, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.D1), "", 2, java.lang.Integer.valueOf(this.C1));
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(this.D1);
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(this.f198247y0, this.T);
        if (n17.getMsgId() != 0) {
            java.lang.String j17 = n17.j();
            if (n17.getType() == 49 && (v17 = ot0.q.v(j17)) != null) {
                if (((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Bi(java.lang.Integer.valueOf(v17.f348666i))) {
                    str = v17.f348690o;
                }
            }
        }
        objArr[2] = str;
        objArr[3] = 1;
        objArr[4] = java.lang.Integer.valueOf(this.C1);
        g0Var.d(13197, objArr);
    }

    public final void Z6() {
        android.view.View view = this.f198227h;
        if (view == null) {
            kotlin.jvm.internal.o.o("nearbyBtn");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        if (this.R.isEmpty() && this.Q.isEmpty()) {
            layoutParams2.topMargin = ym5.x.a(this, 40.0f);
            layoutParams2.bottomMargin = ym5.x.a(this, 59.0f);
        } else {
            layoutParams2.topMargin = ym5.x.a(this, 24.0f);
            layoutParams2.bottomMargin = ym5.x.a(this, 30.0f);
        }
        android.view.View view2 = this.f198227h;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams2);
        } else {
            kotlin.jvm.internal.o.o("nearbyBtn");
            throw null;
        }
    }

    public void a7() {
        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = this.A1;
        if (networkDeviceInfo != null) {
            networkDeviceInfo.f66592m = this.G1;
        }
        this.A1 = null;
        android.view.ViewGroup viewGroup = this.f198231n;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("otherDeviceLayout");
            throw null;
        }
        c7(this, viewGroup, 8, 0L, 2, null);
        android.view.ViewGroup viewGroup2 = this.f198232o;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.o.o("sendingDeviceLayout");
            throw null;
        }
        c7(this, viewGroup2, 8, 0L, 2, null);
        if (this.N) {
            return;
        }
        android.view.ViewGroup viewGroup3 = this.f198224e;
        if (viewGroup3 != null) {
            c7(this, viewGroup3, 0, 0L, 2, null);
        } else {
            kotlin.jvm.internal.o.o("deviceMainLayout");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477722j);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488593y3;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (isFinishing()) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f198232o;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("sendingDeviceLayout");
            throw null;
        }
        if (viewGroup.getVisibility() == 0) {
            com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = this.A1;
            if (networkDeviceInfo == null || kotlin.jvm.internal.o.b(networkDeviceInfo.f66592m, this.H1) || kotlin.jvm.internal.o.b(networkDeviceInfo.f66592m, this.J1)) {
                a7();
            } else if (kotlin.jvm.internal.o.b(networkDeviceInfo.f66592m, this.K1)) {
                com.tencent.mm.autogen.events.ExDeviceCheckNetworkDeviceUploadCdnEvent exDeviceCheckNetworkDeviceUploadCdnEvent = new com.tencent.mm.autogen.events.ExDeviceCheckNetworkDeviceUploadCdnEvent();
                am.h5 h5Var = exDeviceCheckNetworkDeviceUploadCdnEvent.f54121g;
                h5Var.getClass();
                h5Var.f6823b = networkDeviceInfo.f66594o;
                h5Var.f6822a = this.T;
                exDeviceCheckNetworkDeviceUploadCdnEvent.e();
                boolean z17 = exDeviceCheckNetworkDeviceUploadCdnEvent.f54122h.f6913a;
                java.lang.String str = this.f198223d;
                if (z17) {
                    com.tencent.mars.xlog.Log.i(str, "upload dialog");
                    if (this.H == null && this.I == null) {
                        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
                        this.H = u1Var;
                        u1Var.g(getString(com.tencent.mm.R.string.f490886b60));
                        u1Var.j(getString(com.tencent.mm.R.string.f490887b61));
                        u1Var.n(getString(com.tencent.mm.R.string.f490888b62));
                        u1Var.a(false);
                        u1Var.b(new com.tencent.mm.ui.chatting.h8(this));
                        u1Var.q(false);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i(str, "quit dialog");
                    if (this.H == null && this.I == null) {
                        com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(this);
                        this.I = u1Var2;
                        u1Var2.g(getString(com.tencent.mm.R.string.c2n));
                        u1Var2.j(getString(com.tencent.mm.R.string.c3y));
                        u1Var2.n(getString(com.tencent.mm.R.string.b9a));
                        u1Var2.a(false);
                        u1Var2.b(new com.tencent.mm.ui.chatting.f8(this));
                        u1Var2.q(false);
                    }
                }
            } else {
                finish();
            }
        } else {
            android.view.ViewGroup viewGroup2 = this.f198231n;
            if (viewGroup2 == null) {
                kotlin.jvm.internal.o.o("otherDeviceLayout");
                throw null;
            }
            if (viewGroup2.getVisibility() == 0) {
                a7();
            }
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mars.xlog.Log.i(this.f198223d, "config change");
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0934, code lost:
    
        if (r1 != 4) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x09a6, code lost:
    
        if (r7 == 43) goto L293;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x09b0  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 2682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        java.lang.String str = this.f198223d;
        com.tencent.mars.xlog.Log.i(str, "onDestroy");
        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = this.A1;
        java.lang.String str2 = networkDeviceInfo != null ? networkDeviceInfo.f66586d : null;
        if (str2 != null) {
            com.tencent.mm.autogen.events.ExDeviceCancelNetworkDeviceTaskEvent exDeviceCancelNetworkDeviceTaskEvent = new com.tencent.mm.autogen.events.ExDeviceCancelNetworkDeviceTaskEvent();
            exDeviceCancelNetworkDeviceTaskEvent.f54114g.f6127a = str2;
            exDeviceCancelNetworkDeviceTaskEvent.e();
        }
        if (this.E1) {
            if (!this.f198250z1) {
                Y6(2);
            }
            this.R1.dead();
            this.S1.dead();
            com.tencent.mm.autogen.events.ExDeviceStopScanNetworkDeviceEvent exDeviceStopScanNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceStopScanNetworkDeviceEvent();
            exDeviceStopScanNetworkDeviceEvent.e();
            if (exDeviceStopScanNetworkDeviceEvent.f54182g.f7695a) {
                com.tencent.mars.xlog.Log.i(str, "Stop scan Network success!");
            }
        }
    }
}
