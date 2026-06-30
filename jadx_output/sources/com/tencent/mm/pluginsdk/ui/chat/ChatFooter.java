package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class ChatFooter extends android.widget.FrameLayout implements com.tencent.mm.pluginsdk.ui.chat.i8, com.tencent.mm.ui.tools.c5, hv4.a {

    /* renamed from: x6, reason: collision with root package name */
    public static hv4.l f189950x6;
    public android.widget.ImageView A;
    public boolean A1;
    public boolean A2;
    public android.view.View A3;
    public com.tencent.mm.ui.widget.imageview.WeImageView A4;
    public int A5;
    public com.tencent.mm.pluginsdk.ui.chat.d0 B;
    public boolean B1;
    public int B2;
    public android.view.View B3;
    public android.widget.TextView B4;
    public int B5;
    public com.tencent.mm.ui.widget.imageview.WeImageButton C;
    public java.lang.String C1;
    public boolean C2;
    public com.tencent.mm.ui.widget.imageview.WeImageView C3;
    public android.view.View C4;
    public int C5;
    public com.tencent.mm.view.MaxHeightScrollView D;
    public android.widget.ImageView D1;
    public com.tencent.mm.pluginsdk.ui.chat.c8 D2;
    public android.widget.TextView D3;
    public android.view.View D4;
    public int D5;
    public com.tencent.mm.ui.widget.dialog.j0 E;
    public android.widget.ImageView E1;
    public com.tencent.mm.pluginsdk.ui.chat.u9 E2;
    public android.view.View E3;
    public android.widget.TextView E4;
    public int E5;
    public int F;
    public android.view.ViewGroup F1;
    public java.lang.String F2;
    public com.tencent.mm.ui.widget.imageview.WeImageView F3;
    public android.view.ViewGroup F4;
    public boolean F5;
    public android.widget.RelativeLayout G;
    public android.view.ViewGroup G1;
    public java.lang.String G2;
    public android.widget.TextView G3;
    public android.widget.FrameLayout.LayoutParams G4;
    public final int G5;
    public android.widget.RelativeLayout H;
    public boolean H1;
    public ct.j3 H2;
    public android.view.View H3;
    public android.widget.RelativeLayout.LayoutParams H4;
    public final int H5;
    public android.widget.LinearLayout I;
    public boolean I1;
    public final com.tencent.mm.sdk.event.IListener I2;
    public com.tencent.mm.ui.blur.BlurView I3;
    public android.view.View I4;
    public final int I5;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.FrameLayout f189953J;
    public final java.util.List J1;
    public com.tencent.mm.ui.chatting.component.ed J2;
    public com.tencent.mm.plugin.transvoice.ui.v0 J3;
    public android.view.View J4;
    public final int J5;
    public com.tencent.mm.ui.widget.imageview.WeImageView K;
    public final aa0.e K1;
    public final com.tencent.mm.ui.chatting.component.cd K2;
    public com.tencent.mm.plugin.transvoice.model.a K3;
    public com.tencent.mm.transvoice.ui.RingView K4;
    public final com.tencent.mm.sdk.platformtools.n3 K5;
    public android.widget.LinearLayout L;
    public db5.d5 L1;
    public sb5.v L2;
    public z21.a0 L3;
    public com.tencent.mm.transvoice.ui.RingView L4;
    public boolean L5;
    public android.view.View M;
    public android.view.ViewGroup M1;
    public com.tencent.mm.ui.chatting.component.mn M2;
    public db5.d5 M3;
    public com.tencent.mm.transvoice.ui.RingView M4;
    public int M5;
    public android.view.View N;
    public android.view.View N1;
    public final sb5.n2 N2;
    public final com.tencent.mm.plugin.transvoice.model.e N3;
    public com.tencent.mm.ui.widget.textview.CircleTextView N4;
    public boolean N5;
    public android.widget.ImageView O1;
    public final z63.d1 O2;
    public long O3;
    public com.tencent.mm.ui.widget.textview.CircleTextView O4;
    public boolean O5;
    public android.widget.TextView P;
    public android.widget.TextView P1;
    public final com.tencent.mm.autogen.mmdata.rpt.AndroidChatInputStruct P2;
    public com.tencent.mm.pluginsdk.ui.chat.h5 P3;
    public com.tencent.mm.ui.widget.textview.CircleTextView P4;
    public int P5;
    public android.widget.ImageView Q;
    public android.view.View Q1;
    public com.tencent.mm.pluginsdk.ui.chat.z4 Q2;
    public com.tencent.mm.pluginsdk.ui.chat.i5 Q3;
    public com.tencent.mm.ui.widget.textview.CircleTextView Q4;
    public int Q5;
    public android.widget.ImageView R;
    public android.view.View R1;
    public com.tencent.mm.pluginsdk.ui.chat.a5 R2;
    public boolean R3;
    public android.view.View R4;
    public int R5;
    public android.widget.FrameLayout S;
    public android.view.View S1;
    public final com.tencent.mm.pluginsdk.ui.chat.e8 S2;
    public boolean S3;
    public android.view.View S4;
    public final int S5;
    public android.widget.FrameLayout T;
    public android.view.View T1;
    public final com.tencent.mm.sdk.platformtools.n3 T2;
    public boolean T3;
    public android.view.View T4;
    public final int T5;
    public android.view.View U;
    public android.view.inputmethod.InputMethodManager U1;
    public java.lang.String U2;
    public boolean U3;
    public android.widget.TextView U4;
    public final java.lang.Runnable U5;
    public com.tencent.mm.pluginsdk.ui.chat.n9 V;
    public int V1;
    public final xg3.h0 V2;
    public boolean V3;
    public android.view.View V4;
    public final int V5;
    public com.tencent.mm.pluginsdk.ui.chat.g8 W;
    public boolean W1;
    public boolean W2;
    public float W3;
    public int W4;
    public final int W5;
    public boolean X1;
    public boolean X2;
    public db5.d5 X3;
    public boolean X4;
    public final android.animation.ValueAnimator X5;
    public boolean Y1;
    public com.tencent.mm.ui.MMFragment Y2;
    public android.view.View Y3;
    public boolean Y4;
    public final float Y5;
    public boolean Z1;
    public android.app.Activity Z2;
    public android.view.View Z3;
    public boolean Z4;
    public final float Z5;

    /* renamed from: a2, reason: collision with root package name */
    public boolean f189954a2;

    /* renamed from: a3, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.y4 f189955a3;

    /* renamed from: a4, reason: collision with root package name */
    public android.view.ViewGroup f189956a4;

    /* renamed from: a5, reason: collision with root package name */
    public boolean f189957a5;

    /* renamed from: a6, reason: collision with root package name */
    public final float f189958a6;

    /* renamed from: b2, reason: collision with root package name */
    public boolean f189959b2;

    /* renamed from: b3, reason: collision with root package name */
    public boolean f189960b3;

    /* renamed from: b4, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f189961b4;

    /* renamed from: b5, reason: collision with root package name */
    public android.text.style.CharacterStyle f189962b5;

    /* renamed from: b6, reason: collision with root package name */
    public final float f189963b6;

    /* renamed from: c2, reason: collision with root package name */
    public boolean f189964c2;

    /* renamed from: c3, reason: collision with root package name */
    public android.app.Activity f189965c3;

    /* renamed from: c4, reason: collision with root package name */
    public com.tencent.mm.transvoice.ui.SoundWaveView f189966c4;

    /* renamed from: c5, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.j6 f189967c5;

    /* renamed from: c6, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.b5 f189968c6;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f189969d;

    /* renamed from: d2, reason: collision with root package name */
    public int f189970d2;

    /* renamed from: d3, reason: collision with root package name */
    public java.util.concurrent.Future f189971d3;

    /* renamed from: d4, reason: collision with root package name */
    public android.widget.LinearLayout f189972d4;

    /* renamed from: d5, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.k0 f189973d5;

    /* renamed from: d6, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.b5 f189974d6;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f189975e;

    /* renamed from: e2, reason: collision with root package name */
    public int f189976e2;

    /* renamed from: e3, reason: collision with root package name */
    public java.util.concurrent.Future f189977e3;

    /* renamed from: e4, reason: collision with root package name */
    public android.widget.ImageView f189978e4;

    /* renamed from: e5, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.v f189979e5;

    /* renamed from: e6, reason: collision with root package name */
    public final java.util.Map f189980e6;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel f189981f;

    /* renamed from: f2, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout f189982f2;

    /* renamed from: f3, reason: collision with root package name */
    public final android.view.animation.Animation[] f189983f3;

    /* renamed from: f4, reason: collision with root package name */
    public android.widget.TextView f189984f4;

    /* renamed from: f5, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.y4 f189985f5;

    /* renamed from: f6, reason: collision with root package name */
    public final java.util.Map f189986f6;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.ib f189987g;

    /* renamed from: g2, reason: collision with root package name */
    public boolean f189988g2;

    /* renamed from: g3, reason: collision with root package name */
    public final android.view.animation.Animation[] f189989g3;

    /* renamed from: g4, reason: collision with root package name */
    public android.widget.TextView f189990g4;

    /* renamed from: g5, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f189991g5;

    /* renamed from: g6, reason: collision with root package name */
    public java.lang.String f189992g6;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.AppPanel f189993h;

    /* renamed from: h2, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f189994h2;

    /* renamed from: h3, reason: collision with root package name */
    public boolean f189995h3;

    /* renamed from: h4, reason: collision with root package name */
    public android.view.View f189996h4;

    /* renamed from: h5, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.g5 f189997h5;

    /* renamed from: h6, reason: collision with root package name */
    public boolean f189998h6;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.h1 f189999i;

    /* renamed from: i2, reason: collision with root package name */
    public int f190000i2;

    /* renamed from: i3, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.c5 f190001i3;

    /* renamed from: i4, reason: collision with root package name */
    public android.view.View f190002i4;

    /* renamed from: i5, reason: collision with root package name */
    public int f190003i5;

    /* renamed from: i6, reason: collision with root package name */
    public java.lang.String f190004i6;

    /* renamed from: j2, reason: collision with root package name */
    public int f190005j2;

    /* renamed from: j3, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.c5 f190006j3;

    /* renamed from: j4, reason: collision with root package name */
    public android.view.View f190007j4;

    /* renamed from: j5, reason: collision with root package name */
    public int f190008j5;

    /* renamed from: j6, reason: collision with root package name */
    public java.lang.String f190009j6;

    /* renamed from: k2, reason: collision with root package name */
    public boolean f190010k2;

    /* renamed from: k3, reason: collision with root package name */
    public java.lang.String f190011k3;

    /* renamed from: k4, reason: collision with root package name */
    public android.view.View f190012k4;

    /* renamed from: k5, reason: collision with root package name */
    public final android.text.TextWatcher f190013k5;

    /* renamed from: k6, reason: collision with root package name */
    public java.lang.String f190014k6;

    /* renamed from: l1, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.d5 f190015l1;

    /* renamed from: l2, reason: collision with root package name */
    public boolean f190016l2;

    /* renamed from: l3, reason: collision with root package name */
    public java.lang.String f190017l3;

    /* renamed from: l4, reason: collision with root package name */
    public android.widget.TextView f190018l4;

    /* renamed from: l5, reason: collision with root package name */
    public final android.animation.ValueAnimator f190019l5;

    /* renamed from: l6, reason: collision with root package name */
    public java.lang.String f190020l6;

    /* renamed from: m, reason: collision with root package name */
    public fl5.i f190021m;

    /* renamed from: m2, reason: collision with root package name */
    public boolean f190022m2;

    /* renamed from: m3, reason: collision with root package name */
    public boolean f190023m3;

    /* renamed from: m4, reason: collision with root package name */
    public android.widget.TextView f190024m4;

    /* renamed from: m5, reason: collision with root package name */
    public final android.animation.ValueAnimator f190025m5;

    /* renamed from: m6, reason: collision with root package name */
    public boolean f190026m6;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f190027n;

    /* renamed from: n2, reason: collision with root package name */
    public boolean f190028n2;

    /* renamed from: n3, reason: collision with root package name */
    public boolean f190029n3;

    /* renamed from: n4, reason: collision with root package name */
    public android.view.View f190030n4;

    /* renamed from: n5, reason: collision with root package name */
    public final android.animation.ValueAnimator f190031n5;

    /* renamed from: n6, reason: collision with root package name */
    public java.lang.String f190032n6;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f190033o;

    /* renamed from: o2, reason: collision with root package name */
    public boolean f190034o2;

    /* renamed from: o3, reason: collision with root package name */
    public final java.lang.Runnable f190035o3;

    /* renamed from: o4, reason: collision with root package name */
    public android.widget.TextView f190036o4;

    /* renamed from: o5, reason: collision with root package name */
    public final android.animation.ValueAnimator f190037o5;

    /* renamed from: o6, reason: collision with root package name */
    public com.tencent.mm.plugin.transvoice.model.c f190038o6;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f190039p;

    /* renamed from: p0, reason: collision with root package name */
    public z63.f1 f190040p0;

    /* renamed from: p1, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.x4 f190041p1;

    /* renamed from: p2, reason: collision with root package name */
    public boolean f190042p2;

    /* renamed from: p3, reason: collision with root package name */
    public final boolean f190043p3;

    /* renamed from: p4, reason: collision with root package name */
    public android.view.ViewGroup f190044p4;

    /* renamed from: p5, reason: collision with root package name */
    public final android.animation.ValueAnimator f190045p5;

    /* renamed from: p6, reason: collision with root package name */
    public e70.a0 f190046p6;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f190047q;

    /* renamed from: q2, reason: collision with root package name */
    public boolean f190048q2;

    /* renamed from: q3, reason: collision with root package name */
    public android.view.ViewGroup f190049q3;

    /* renamed from: q4, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel f190050q4;

    /* renamed from: q5, reason: collision with root package name */
    public final int[] f190051q5;

    /* renamed from: q6, reason: collision with root package name */
    public final b31.d f190052q6;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewGroup f190053r;

    /* renamed from: r2, reason: collision with root package name */
    public boolean f190054r2;

    /* renamed from: r3, reason: collision with root package name */
    public android.view.View f190055r3;

    /* renamed from: r4, reason: collision with root package name */
    public android.view.ViewGroup f190056r4;

    /* renamed from: r5, reason: collision with root package name */
    public final int f190057r5;

    /* renamed from: r6, reason: collision with root package name */
    public final java.util.List f190058r6;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f190059s;

    /* renamed from: s2, reason: collision with root package name */
    public boolean f190060s2;

    /* renamed from: s3, reason: collision with root package name */
    public com.tencent.mm.ui.blur.BlurView f190061s3;

    /* renamed from: s4, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f190062s4;

    /* renamed from: s5, reason: collision with root package name */
    public final int f190063s5;

    /* renamed from: s6, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f190064s6;

    /* renamed from: t, reason: collision with root package name */
    public boolean f190065t;

    /* renamed from: t2, reason: collision with root package name */
    public int f190066t2;

    /* renamed from: t3, reason: collision with root package name */
    public android.view.View f190067t3;

    /* renamed from: t4, reason: collision with root package name */
    public boolean f190068t4;

    /* renamed from: t5, reason: collision with root package name */
    public final int f190069t5;

    /* renamed from: t6, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f190070t6;

    /* renamed from: u, reason: collision with root package name */
    public boolean f190071u;

    /* renamed from: u2, reason: collision with root package name */
    public boolean f190072u2;

    /* renamed from: u3, reason: collision with root package name */
    public android.view.View f190073u3;

    /* renamed from: u4, reason: collision with root package name */
    public boolean f190074u4;

    /* renamed from: u5, reason: collision with root package name */
    public final int f190075u5;

    /* renamed from: u6, reason: collision with root package name */
    public boolean f190076u6;

    /* renamed from: v, reason: collision with root package name */
    public boolean f190077v;

    /* renamed from: v2, reason: collision with root package name */
    public int f190078v2;

    /* renamed from: v3, reason: collision with root package name */
    public android.widget.ImageView f190079v3;

    /* renamed from: v4, reason: collision with root package name */
    public boolean f190080v4;

    /* renamed from: v5, reason: collision with root package name */
    public final int f190081v5;

    /* renamed from: v6, reason: collision with root package name */
    public int f190082v6;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f190083w;

    /* renamed from: w2, reason: collision with root package name */
    public int f190084w2;

    /* renamed from: w3, reason: collision with root package name */
    public android.widget.ImageView f190085w3;

    /* renamed from: w4, reason: collision with root package name */
    public android.view.ViewGroup f190086w4;

    /* renamed from: w5, reason: collision with root package name */
    public final float f190087w5;

    /* renamed from: w6, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f190088w6;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.ChatFooterBottom f190089x;

    /* renamed from: x0, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.k5 f190090x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f190091x1;

    /* renamed from: x2, reason: collision with root package name */
    public int f190092x2;

    /* renamed from: x3, reason: collision with root package name */
    public android.view.View f190093x3;

    /* renamed from: x4, reason: collision with root package name */
    public android.view.ViewGroup f190094x4;

    /* renamed from: x5, reason: collision with root package name */
    public int f190095x5;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f190096y;

    /* renamed from: y0, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.e5 f190097y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f190098y1;

    /* renamed from: y2, reason: collision with root package name */
    public int f190099y2;

    /* renamed from: y3, reason: collision with root package name */
    public android.widget.TextView f190100y3;

    /* renamed from: y4, reason: collision with root package name */
    public android.view.View f190101y4;

    /* renamed from: y5, reason: collision with root package name */
    public int f190102y5;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageButton f190103z;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f190104z1;

    /* renamed from: z2, reason: collision with root package name */
    public int f190105z2;

    /* renamed from: z3, reason: collision with root package name */
    public android.widget.ImageView f190106z3;

    /* renamed from: z4, reason: collision with root package name */
    public android.view.View f190107z4;

    /* renamed from: z5, reason: collision with root package name */
    public int f190108z5;

    /* renamed from: y6, reason: collision with root package name */
    public static final int[] f189951y6 = {0, 15, 30, 45, 60, 75, 90, 95, 100};

    /* renamed from: z6, reason: collision with root package name */
    public static final int[] f189952z6 = {com.tencent.mm.R.raw.amp1, com.tencent.mm.R.raw.amp2, com.tencent.mm.R.raw.amp3, com.tencent.mm.R.raw.amp4, com.tencent.mm.R.raw.amp5, com.tencent.mm.R.raw.amp6, com.tencent.mm.R.raw.amp7, com.tencent.mm.R.raw.amp8};
    public static final java.lang.String A6 = com.tencent.mm.sdk.platformtools.x2.f193072b + "chat_footer_sp";

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$122, reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass122 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NotifyChatRoomStatusChangeEvent> {
        public AnonymousClass122(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = -692279828;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.NotifyChatRoomStatusChangeEvent notifyChatRoomStatusChangeEvent) {
            com.tencent.mm.autogen.events.NotifyChatRoomStatusChangeEvent notifyChatRoomStatusChangeEvent2 = notifyChatRoomStatusChangeEvent;
            if (!(notifyChatRoomStatusChangeEvent2 instanceof com.tencent.mm.autogen.events.NotifyChatRoomStatusChangeEvent) || !com.tencent.mm.sdk.platformtools.t8.D0(notifyChatRoomStatusChangeEvent2.f54538g.f7048a, com.tencent.mm.pluginsdk.ui.chat.ChatFooter.this.f189955a3.c())) {
                return false;
            }
            com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
            am.jl jlVar = notifyChatRoomStatusChangeEvent2.f54538g;
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) q17).n(jlVar.f7048a, true);
            if (n17 == null || ((int) n17.E2) == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "Get contact from db return null.(username : %s)", jlVar.f7048a);
                return false;
            }
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.pluginsdk.ui.chat.e1(this, notifyChatRoomStatusChangeEvent2, n17));
            return false;
        }
    }

    public ChatFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void c(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        com.tencent.mm.ui.widget.MMEditText mMEditText;
        com.tencent.mm.ui.widget.MMEditText mMEditText2;
        android.view.inputmethod.InputMethodManager inputMethodManager;
        boolean z17 = chatFooter.f190068t4;
        boolean z18 = z17 && !chatFooter.f190010k2;
        if (chatFooter.f190074u4 || z17) {
            chatFooter.o0();
        }
        if (chatFooter.f190010k2 && (mMEditText2 = chatFooter.f189961b4) != null && (inputMethodManager = chatFooter.U1) != null) {
            inputMethodManager.hideSoftInputFromWindow(mMEditText2.getWindowToken(), 0);
            chatFooter.f189961b4.clearFocus();
        } else {
            if (!z18 || (mMEditText = chatFooter.f189961b4) == null) {
                return;
            }
            mMEditText.setCursorVisible(false);
            chatFooter.g1();
            chatFooter.f189961b4.clearFocus();
        }
    }

    public static void d(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, android.content.Context context, java.lang.String targetLan) {
        chatFooter.f189961b4.setText("");
        android.view.View view = chatFooter.V4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "startVoice2TxtTranslation", "(Landroid/content/Context;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "startVoice2TxtTranslation", "(Landroid/content/Context;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        chatFooter.E4.setEnabled(false);
        chatFooter.C4.setEnabled(false);
        pn4.c2 N6 = pn4.c2.N6();
        int i17 = pn4.c2.f357063d;
        pn4.c2.f357063d = i17 + 1;
        java.lang.String textMsg = chatFooter.f189992g6;
        com.tencent.mm.pluginsdk.ui.chat.t3 t3Var = new com.tencent.mm.pluginsdk.ui.chat.t3(chatFooter, context);
        kotlin.jvm.internal.o.g(targetLan, "targetLan");
        kotlin.jvm.internal.o.g(textMsg, "textMsg");
        if (textMsg.length() == 0) {
            pm0.v.X(new pn4.a2(t3Var, i17, "", ""));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TranslateVoice2TxtHelper", "doTranslateCgi clientMsgID:" + i17 + " targetLan:" + targetLan + " scene:114");
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new pn4.z1(targetLan, i17, textMsg, N6, t3Var, null), 1, null);
        }
    }

    public static void e(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        java.lang.String str = (java.lang.String) ((java.util.HashMap) chatFooter.f189980e6).get(java.lang.Integer.valueOf(chatFooter.f190082v6));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.String trim = str.trim();
            java.lang.String substring = trim.substring(trim.length() - 1);
            com.tencent.mm.sdk.platformtools.t8.G1(trim);
            if (chatFooter.f189968c6 == com.tencent.mm.pluginsdk.ui.chat.b5.MODE_TRANS) {
                chatFooter.f189961b4.setVisibility(0);
            }
            if (substring.equals("。") || substring.equals(".")) {
                chatFooter.f189961b4.setText(pg5.d.a(chatFooter.getContext(), trim.substring(0, trim.length() - 1)));
            } else {
                chatFooter.f189961b4.setText(pg5.d.a(chatFooter.getContext(), trim));
            }
            chatFooter.C4.setEnabled(true);
            chatFooter.E4.setVisibility(0);
            chatFooter.E4.setEnabled(true);
            android.view.View view = chatFooter.D4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "delPunctuation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "delPunctuation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = chatFooter.V4;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "delPunctuation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "delPunctuation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.widget.MMEditText mMEditText = chatFooter.f189961b4;
            mMEditText.setSelection(mMEditText.getText().length());
            return;
        }
        boolean isConnected = com.tencent.mars.comm.NetStatusUtil.isConnected(chatFooter.getContext());
        com.tencent.mm.plugin.transvoice.model.e eVar = chatFooter.N3;
        if (isConnected) {
            eVar.b(3);
            android.view.View view3 = chatFooter.f190007j4;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showNoContentTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showNoContentTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = chatFooter.f190002i4;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showNoContentTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showNoContentTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            chatFooter.C4.setEnabled(false);
            chatFooter.f189961b4.setText("");
            android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(chatFooter.getContext(), com.tencent.mm.R.raw.icons_filled_error, -1);
            int a17 = com.tencent.mm.ui.zk.a(chatFooter.getContext(), 24);
            e17.setBounds(0, 0, a17, a17);
            chatFooter.f190036o4.setCompoundDrawables(e17, null, null, null);
            chatFooter.f190036o4.setText(chatFooter.getContext().getResources().getString(com.tencent.mm.R.string.h8u));
            chatFooter.f190036o4.setVisibility(0);
            chatFooter.f189956a4.setActivated(false);
            chatFooter.f189978e4.setImageDrawable(com.tencent.mm.ui.uk.e(chatFooter.getContext(), com.tencent.mm.R.raw.icons_filled_voice2txt_cursor, chatFooter.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac)));
            chatFooter.E4.setVisibility(0);
            chatFooter.E4.setEnabled(false);
            android.view.View view5 = chatFooter.D4;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showNoContentTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showNoContentTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            chatFooter.f189966c4.setVisibility(8);
            chatFooter.f189961b4.setVisibility(8);
            return;
        }
        eVar.b(3);
        android.view.View view6 = chatFooter.f190007j4;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showNetworkTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showNetworkTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view7 = chatFooter.f190002i4;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showNetworkTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showNetworkTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        chatFooter.C4.setEnabled(false);
        chatFooter.f189961b4.setText("");
        chatFooter.f190036o4.setCompoundDrawables(null, null, null, null);
        chatFooter.f190036o4.setText(chatFooter.getContext().getResources().getString(com.tencent.mm.R.string.h8t));
        chatFooter.f190036o4.setVisibility(0);
        chatFooter.f189956a4.setActivated(false);
        chatFooter.f189978e4.setImageDrawable(com.tencent.mm.ui.uk.e(chatFooter.getContext(), com.tencent.mm.R.raw.icons_filled_voice2txt_cursor, chatFooter.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac)));
        chatFooter.E4.setVisibility(0);
        chatFooter.E4.setEnabled(false);
        android.view.View view8 = chatFooter.D4;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(8);
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showNetworkTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showNetworkTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view9 = chatFooter.V4;
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        arrayList9.add(8);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showNetworkTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
        yj0.a.f(view9, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showNetworkTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        chatFooter.f189966c4.setVisibility(8);
        chatFooter.f189961b4.setVisibility(8);
    }

    public static void f(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        if (chatFooter.V3) {
            if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) ((java.util.HashMap) chatFooter.f189980e6).get(java.lang.Integer.valueOf(chatFooter.f190082v6)))) {
                return;
            }
            com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
            java.lang.String userName = y4Var != null ? y4Var.c() : chatFooter.f189969d;
            chatFooter.f190032n6 = userName + "_" + com.tencent.mm.sdk.platformtools.w0.a(java.lang.System.currentTimeMillis());
            android.view.View view = chatFooter.f190007j4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateTransBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateTransBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = chatFooter.f190002i4;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateTransBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateTransBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b31.l lVar = b31.l.f17613a;
            java.lang.String sessionId = chatFooter.f190032n6;
            kotlin.jvm.internal.o.g(userName, "userName");
            kotlin.jvm.internal.o.g(sessionId, "sessionId");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("view_id", "stt_translate_btn");
            hashMap.put("chat_username", userName);
            hashMap.put("stt_translate_sessionid", sessionId);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 35268);
        }
    }

    public static void g(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, java.lang.CharSequence charSequence) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = chatFooter.f189961b4;
        if (mMEditText != null) {
            com.tencent.mm.plugin.transvoice.model.e eVar = com.tencent.mm.plugin.transvoice.model.e.I;
            eVar.f175386j++;
            int selectionStart = mMEditText.getSelectionStart();
            int length = chatFooter.f189961b4.getText().length();
            eVar.D = 1;
            if (selectionStart <= 3) {
                eVar.E = 1;
            }
            if (selectionStart >= java.lang.Math.max(0, length - 3)) {
                eVar.F = 1;
            }
            int c17 = b31.l.c(charSequence);
            if (c17 > 0) {
                eVar.f175384h.add(java.lang.Integer.valueOf(c17));
            }
            int b17 = b31.l.b(charSequence);
            if (b17 > 0) {
                eVar.f175385i.add(java.lang.Integer.valueOf(b17));
            }
        }
    }

    private android.view.animation.Animation getAlphaInAnim() {
        android.view.animation.Animation[] animationArr = this.f189983f3;
        android.view.animation.Animation animation = animationArr[0];
        if (animation != null) {
            return animation;
        }
        synchronized (animationArr) {
            android.view.animation.Animation[] animationArr2 = this.f189983f3;
            android.view.animation.Animation animation2 = animationArr2[0];
            if (animation2 != null) {
                return animation2;
            }
            try {
                try {
                    android.view.animation.Animation animation3 = (android.view.animation.Animation) this.f189971d3.get(1L, java.util.concurrent.TimeUnit.MILLISECONDS);
                    animationArr2[0] = animation3;
                    return animation3;
                } catch (java.lang.Throwable unused) {
                    this.f189971d3.cancel(false);
                    android.view.animation.Animation[] animationArr3 = this.f189983f3;
                    android.view.animation.Animation animation4 = (android.view.animation.Animation) ((com.tencent.mm.pluginsdk.ui.chat.f1) this.f190001i3).call();
                    animationArr3[0] = animation4;
                    return animation4;
                }
            } catch (java.lang.Throwable unused2) {
                android.view.animation.Animation[] animationArr32 = this.f189983f3;
                android.view.animation.Animation animation42 = (android.view.animation.Animation) ((com.tencent.mm.pluginsdk.ui.chat.f1) this.f190001i3).call();
                animationArr32[0] = animation42;
                return animation42;
            }
        }
    }

    private android.view.animation.Animation getAlphaOutAnim() {
        android.view.animation.Animation[] animationArr = this.f189989g3;
        android.view.animation.Animation animation = animationArr[0];
        if (animation != null) {
            return animation;
        }
        synchronized (animationArr) {
            android.view.animation.Animation[] animationArr2 = this.f189989g3;
            android.view.animation.Animation animation2 = animationArr2[0];
            if (animation2 != null) {
                return animation2;
            }
            try {
                try {
                    android.view.animation.Animation animation3 = (android.view.animation.Animation) this.f189977e3.get(1L, java.util.concurrent.TimeUnit.MILLISECONDS);
                    animationArr2[0] = animation3;
                    return animation3;
                } catch (java.lang.Throwable unused) {
                    this.f189977e3.cancel(false);
                    android.view.animation.Animation[] animationArr3 = this.f189989g3;
                    android.view.animation.Animation animation4 = (android.view.animation.Animation) ((com.tencent.mm.pluginsdk.ui.chat.g1) this.f190006j3).call();
                    animationArr3[0] = animation4;
                    return animation4;
                }
            } catch (java.lang.Throwable unused2) {
                android.view.animation.Animation[] animationArr32 = this.f189989g3;
                android.view.animation.Animation animation42 = (android.view.animation.Animation) ((com.tencent.mm.pluginsdk.ui.chat.g1) this.f190006j3).call();
                animationArr32[0] = animation42;
                return animation42;
            }
        }
    }

    private int getDefaultLangType() {
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(getContext());
        if (f17.equals("zh_CN") || f17.equals("zh_HK") || f17.equals("zh_TW")) {
            return 1;
        }
        return f17.equals("en") ? 4 : 0;
    }

    private java.lang.String getEditingLength() {
        fl5.i iVar = this.f190021m;
        if (iVar == null || iVar.getText() == null) {
            return "edtLen: null";
        }
        return " edtLen:" + this.f190021m.getText().toString().length();
    }

    private long getImeSupportFileAbility() {
        return 7L;
    }

    private long getImeSupportIdentityAbility() {
        return 7L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getInsetsBottom() {
        android.view.WindowManager windowManager;
        android.graphics.Insets insetsIgnoringVisibility;
        if (!fp.h.c(30) || (windowManager = (android.view.WindowManager) ((android.app.Activity) getContext()).getSystemService("window")) == null || (insetsIgnoringVisibility = windowManager.getCurrentWindowMetrics().getWindowInsets().getInsetsIgnoringVisibility(android.view.WindowInsets.Type.statusBars() | android.view.WindowInsets.Type.displayCutout())) == null) {
            return 0;
        }
        return insetsIgnoringVisibility.bottom;
    }

    private int getTransLangTypeByTalker() {
        android.content.SharedPreferences sharedPreferences = getContext().getSharedPreferences("voice2txt_sp", 0);
        sharedPreferences.getInt(this.f189969d, 0);
        int defaultLangType = getDefaultLangType();
        if (defaultLangType != 0) {
            sharedPreferences.edit().putInt(this.f189969d, defaultLangType).apply();
        }
        return defaultLangType;
    }

    private long getWxKeyboarAbility() {
        return ((d73.i) i95.n0.c(d73.i.class)).Qg() ? 133143986239L : 64424509503L;
    }

    private ct.j3 getYuanBaoChatRecordsService() {
        if (this.H2 == null) {
            this.H2 = (ct.j3) i95.n0.c(ct.j3.class);
        }
        return this.H2;
    }

    public static void i(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, vu4.d dVar, java.lang.String str) {
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
        if (y4Var != null && com.tencent.mm.storage.z3.J4(y4Var.c())) {
            try {
                com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = chatFooter.f189955a3.a().f460717l;
                java.lang.String stringExtra = baseChattingUIFragment != null ? baseChattingUIFragment.getStringExtra("key_w1w_refer_scene") : "0";
                java.lang.String stringExtra2 = baseChattingUIFragment != null ? baseChattingUIFragment.getStringExtra("key_w1w_refer_scene_note") : "";
                java.lang.String stringExtra3 = baseChattingUIFragment != null ? baseChattingUIFragment.getStringExtra("key_w1w_refer_session_id") : "";
                java.lang.String c17 = chatFooter.f189955a3.c();
                java.lang.String stringExtra4 = baseChattingUIFragment != null ? baseChattingUIFragment.getStringExtra("key_w1w_refer_ext_info") : "";
                boolean booleanValue = baseChattingUIFragment != null ? baseChattingUIFragment.getBooleanExtra("key_w1w_conv_is_hello", false).booleanValue() : false;
                gr4.f fVar = (gr4.f) i95.n0.c(gr4.f.class);
                ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).getClass();
                java.lang.String c18 = mr4.a.c(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
                vu4.e eVar = vu4.e.f440307f;
                ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).getClass();
                ((fr4.g0) fVar).cj(dVar, stringExtra, stringExtra2, stringExtra3, stringExtra4, c18, eVar, str, mr4.a.b(), c17, booleanValue ? vu4.g.f440324f : vu4.g.f440323e);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChatFooter", e17, "W1w上报失败", new java.lang.Object[0]);
            }
        }
    }

    public static boolean j(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, java.lang.String str, boolean z17) {
        java.lang.Object obj;
        if (chatFooter.M0()) {
            return false;
        }
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
        if (y4Var == null || com.tencent.mm.sdk.platformtools.t8.K0(y4Var.c())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "ifInterceptGroupSolitatireMsg username == null");
            return false;
        }
        try {
            java.lang.String c17 = chatFooter.f189955a3.c();
            if (!((u63.e) ((vg3.v3) i95.n0.c(vg3.v3.class))).Ai(c17) || !z17) {
                return false;
            }
            chatFooter.f190040p0.a();
            try {
                str = ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).wi(str);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "ifInterceptGroupSolitatireMsg() emojiSoftBank2Unicode %s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
            android.util.Pair j17 = ((t63.e) i95.n0.c(t63.e.class)).wi().j(str, 1, c17);
            if (((java.lang.Integer) j17.first).intValue() <= 0 || (obj = j17.second) == null) {
                return false;
            }
            y63.a aVar = (y63.a) obj;
            java.lang.String r17 = c01.z1.r();
            kk.j jVar = x63.g.f452235a;
            x63.g.f(c17, r17, aVar, c01.id.e(), true);
            y63.a A = x63.g.A(aVar, ((t63.e) i95.n0.c(t63.e.class)).Bi().L0(c17, aVar.field_key, true), c01.z1.r(), 1);
            if (A == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "ifInterceptGroupSolitatireMsg storageGroupSolitatire == null");
                return false;
            }
            x63.g.h(A, c17);
            y63.a J2 = x63.g.J(aVar, chatFooter.f190040p0.f470397r, A);
            if (J2.P) {
                x63.g.z(J2);
            }
            J2.field_lastActiveTime = c01.id.e();
            x63.g.K(J2, true, true);
            ((t63.e) i95.n0.c(t63.e.class)).Di(str, c17, aVar, J2, A, A.field_active == 0);
            com.tencent.mm.pluginsdk.ui.chat.k5 k5Var = chatFooter.f190090x0;
            if (k5Var != null) {
                k5Var.h(str);
            }
            z63.f1 f1Var = chatFooter.f190040p0;
            f1Var.f470389j = "";
            f1Var.f470397r = null;
            f1Var.f470391l = null;
            chatFooter.b1();
            return true;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "ifInterceptGroupSolitatireMsg() Exception:%s %s", e18.getClass().getSimpleName(), e18.getMessage());
            return false;
        }
    }

    public static void k(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, java.lang.String str) {
        chatFooter.getClass();
        ((su4.x0) i95.n0.c(su4.x0.class)).getClass();
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.pluginsdk.ui.chat.a2(chatFooter, str, chatFooter.F2, c01.id.e()), "WebSearchReportLogic.TagSearchReport");
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        chatFooter.F2 = o13.n.l(73);
    }

    public static boolean l(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
        return y4Var == null || y4Var.a() == null || !(((sb5.s) chatFooter.f189955a3.a().f460708c.a(sb5.s.class)).u() || ((sb5.h0) chatFooter.f189955a3.a().f460708c.a(sb5.h0.class)).G() || ((sb5.x) chatFooter.f189955a3.a().f460708c.a(sb5.x.class)).t() || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) chatFooter.f189955a3.a().f460708c.a(sb5.f.class))).G0() || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) chatFooter.f189955a3.a().f460708c.a(sb5.f.class))).H0() || ((sb5.j0) chatFooter.f189955a3.a().f460708c.a(sb5.j0.class)).s());
    }

    public static boolean m(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, android.text.Editable editable) {
        chatFooter.getClass();
        return editable != null && editable.length() > 0 && editable.toString().trim().length() > 0;
    }

    public static boolean n(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, boolean z17) {
        if (!z17) {
            return chatFooter.f190021m.getTag(com.tencent.mm.R.id.bpj) != null;
        }
        chatFooter.setDelaySendAnim(false);
        return false;
    }

    public static void p(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        db5.d5 d5Var = chatFooter.X3;
        if (d5Var == null || !d5Var.isShowing()) {
            return;
        }
        if (chatFooter.f190010k2) {
            chatFooter.U1.hideSoftInputFromWindow(chatFooter.f189961b4.getWindowToken(), 0);
        }
        chatFooter.X3.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDelaySendAnim(boolean z17) {
        this.f190021m.setTag(com.tencent.mm.R.id.bpj, z17 ? java.lang.Boolean.TRUE : null);
    }

    private void setNewVoice2TxtCountDown(int i17) {
        com.tencent.mm.pluginsdk.ui.chat.k5 k5Var;
        if (i17 > 60 || i17 < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatFooter", "skip by invalid quantity:%s", java.lang.Integer.valueOf(i17));
            return;
        }
        int ordinal = this.f189968c6.ordinal();
        if (ordinal == 0) {
            this.C5 = java.lang.Math.min(this.f190081v5 + ((int) (this.f190087w5 * (60 - i17))), this.f190075u5);
            android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofInt(this.f189956a4.getWidth(), this.C5).setDuration(200L);
            duration.addUpdateListener(new com.tencent.mm.pluginsdk.ui.chat.i0(this));
            duration.start();
            if (i17 == 0 && this.T3) {
                android.widget.LinearLayout linearLayout = this.f189972d4;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView = this.f189966c4;
                if (soundWaveView != null) {
                    soundWaveView.setVisibility(8);
                }
                if (getChattingContext() == null || (k5Var = this.f190090x0) == null || !k5Var.j()) {
                    this.f189984f4.setText(getContext().getResources().getString(com.tencent.mm.R.string.f491308nk3));
                } else {
                    this.f189984f4.setText(getContext().getResources().getString(com.tencent.mm.R.string.f490553yc));
                    this.f189961b4.setText("");
                    ((java.util.HashMap) this.f189980e6).clear();
                    this.f190095x5 = this.f190057r5;
                    postDelayed(new com.tencent.mm.pluginsdk.ui.chat.w3(this), 100L);
                }
            } else if (i17 <= 10) {
                s1(i17);
            }
        } else if (ordinal != 1) {
            if (ordinal == 2 && i17 <= 10) {
                t1(i17);
            }
        } else if (i17 <= 10 && this.T3) {
            s1(i17);
        }
        this.D5 = i17;
    }

    public final void A(boolean z17) {
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofInt(this.f189956a4.getHeight(), this.f190095x5 + (z17 ? com.tencent.mm.ui.zk.a(getContext(), 20) : 0)).setDuration(200L);
        duration.addUpdateListener(new com.tencent.mm.pluginsdk.ui.chat.h0(this));
        duration.start();
    }

    public boolean A0() {
        if (com.tencent.mm.ui.bk.y()) {
            boolean t07 = com.tencent.mm.sdk.platformtools.t8.t0(this);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "hideVKB status：%s, view:%s, stack:%s", java.lang.Boolean.valueOf(t07), this, new com.tencent.mm.sdk.platformtools.z3());
            return t07;
        }
        int keyBordHeightPX = getKeyBordHeightPX();
        int bottom = getBottom();
        if (keyBordHeightPX / 2 <= bottom) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "hideVKB: %s, %s", java.lang.Integer.valueOf(keyBordHeightPX), java.lang.Integer.valueOf(bottom));
            return com.tencent.mm.sdk.platformtools.t8.t0(this);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "hideVKB failed!!!, %s, %s", java.lang.Integer.valueOf(keyBordHeightPX), java.lang.Integer.valueOf(bottom));
        return false;
    }

    public final void A1() {
        if (this.f189972d4.getVisibility() == 8) {
            this.f189966c4.setVisibility(0);
        }
        this.f189984f4.setVisibility(8);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f190044p4.getLayoutParams();
        layoutParams.removeRule(21);
        layoutParams.removeRule(12);
        layoutParams.addRule(13);
        this.f190044p4.requestLayout();
        ((android.widget.RelativeLayout.LayoutParams) this.f189966c4.getLayoutParams()).bottomMargin = 0;
        this.f189966c4.requestLayout();
    }

    public final void B(boolean z17) {
        android.widget.ImageButton imageButton;
        this.f189995h3 = z17;
        android.widget.Button button = this.f190027n;
        if (button == null || (imageButton = this.f190103z) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "canSend:%B, return sendBtn == null || mAttachButton == null", java.lang.Boolean.valueOf(z17));
            return;
        }
        if (this.W2 || this.X2) {
            if (imageButton.getVisibility() == 0 || this.f189954a2) {
                return;
            }
            this.f190103z.setVisibility(0);
            return;
        }
        if (button.getVisibility() == 0 && z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "canSend true ! sendBtn is visible" + getEditingLength());
            return;
        }
        if (this.f190103z.getVisibility() == 0 && !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "canSend false ! AttachButton is visible");
            return;
        }
        if (z17) {
            t();
            try {
                this.f190103z.startAnimation(getAlphaOutAnim());
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChatFooter", th6, "[-] Fail to get alphaOutAnim.", new java.lang.Object[0]);
            }
            this.f190103z.setVisibility(8);
            r1(false);
        } else {
            try {
                this.f190103z.startAnimation(getAlphaInAnim());
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChatFooter", th7, "[-] Fail to get alphaInAnim.", new java.lang.Object[0]);
            }
            if (!this.f190098y1 && !this.f189954a2) {
                this.f190103z.setVisibility(0);
                r1(true);
            }
            s();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "jacks canSend:" + z17 + getEditingLength());
        this.f190027n.getParent().requestLayout();
    }

    public final void B0() {
        if (this.Z1) {
            this.Z1 = false;
            if (this.f189987g != null) {
                int keyBordHeightPX = getKeyBordHeightPX() + this.f190059s.getHeight() + this.f190083w.getHeight();
                this.f189987g.animate().cancel();
                this.f189987g.animate().translationY(keyBordHeightPX).withEndAction(new com.tencent.mm.pluginsdk.ui.chat.v2(this)).start();
            }
        }
    }

    public final void B1(boolean z17) {
        com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout chattingScrollLayout;
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = this.C;
        if (weImageButton == null) {
            return;
        }
        boolean z18 = this.F5;
        if (z18 && z17) {
            return;
        }
        if (z18 || z17) {
            this.F5 = z17;
            if (z17) {
                weImageButton.setImageResource(com.tencent.mm.R.drawable.f481236o2);
                this.C.setContentDescription(getContext().getResources().getString(com.tencent.mm.R.string.aze));
                x(this.C, "chat_right_side_keyboard_btn");
            } else {
                weImageButton.setImageResource(com.tencent.mm.R.raw.icons_outlined_emoji);
                this.C.setContentDescription(getContext().getResources().getString(com.tencent.mm.R.string.azc));
                x(this.C, "chat_emoji_button");
            }
            this.C.setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
            com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.D2;
            if (c8Var.n()) {
                c8Var.h().post(new com.tencent.mm.pluginsdk.ui.chat.u7(c8Var));
            }
            if (z17 || this.f189999i == null || (chattingScrollLayout = this.f189982f2) == null) {
                if (z17) {
                    X0(getKeyBordHeightPX());
                }
            } else {
                com.tencent.mm.pluginsdk.ui.chat.m4 m4Var = new com.tencent.mm.pluginsdk.ui.chat.m4(this);
                java.util.LinkedList linkedList = (java.util.LinkedList) chattingScrollLayout.f190133r;
                if (linkedList.contains(m4Var)) {
                    return;
                }
                linkedList.add(m4Var);
            }
        }
    }

    public void C(java.lang.String str) {
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var;
        z63.f1 f1Var = this.f190040p0;
        if (f1Var == null || this.f190027n == null || (y4Var = this.f189955a3) == null) {
            return;
        }
        java.lang.String c17 = y4Var.c();
        android.widget.Button button = this.f190027n;
        f1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.SuggestSolitatireTips", "checkIfShow supportAnalyze:%s supportShow:%s", java.lang.Boolean.valueOf(((u63.e) ((vg3.v3) i95.n0.c(vg3.v3.class))).wi(c17)), java.lang.Boolean.valueOf(((u63.e) ((vg3.v3) i95.n0.c(vg3.v3.class))).Ai(c17)));
        f1Var.f470402w = button;
        f1Var.f470401v = str;
        if (((u63.e) ((vg3.v3) i95.n0.c(vg3.v3.class))).wi(c17)) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !str.equals(f1Var.f470389j)) {
                ((ku5.t0) ku5.t0.f312615d).A("GroupSolitaireCheck");
                str = str.replaceAll(java.lang.String.valueOf((char) 8203), "");
                try {
                    str = ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).wi(str);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.SuggestSolitatireTips", "checkIfShow() emojiSoftBank2Unicode %s %s", e17.getClass().getSimpleName(), e17.getMessage());
                }
                z63.b1 b1Var = f1Var.f470398s;
                b1Var.f470370g = str;
                b1Var.f470371h = f1Var.f470390k;
                ((ku5.t0) ku5.t0.f312615d).l(f1Var.f470398s, 500L, "GroupSolitaireCheck");
                if (com.tencent.mm.sdk.platformtools.t8.K0(f1Var.f470389j)) {
                    z63.c1 c1Var = f1Var.f470399t;
                    c1Var.f470370g = str;
                    c1Var.f470371h = f1Var.f470390k;
                    ((ku5.t0) ku5.t0.f312615d).l(f1Var.f470399t, 500L, "GroupSolitaireCopyCheck");
                }
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                f1Var.a();
            }
            f1Var.f470389j = str;
            f1Var.f470390k = c17;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b0, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean C0(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.chat.ChatFooter.C0(java.lang.String):boolean");
    }

    public final void C1() {
        if (this.Y4) {
            this.Y4 = false;
            b31.l lVar = b31.l.f17613a;
            java.lang.String userName = this.f189969d;
            java.lang.String sessionId = this.f190032n6;
            int i17 = this.Z4 ? 1 : 2;
            java.lang.String targetLang = this.f190014k6;
            kotlin.jvm.internal.o.g(userName, "userName");
            kotlin.jvm.internal.o.g(sessionId, "sessionId");
            kotlin.jvm.internal.o.g(targetLang, "targetLang");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("target_language_code", targetLang);
            hashMap.put("stt_speech_stop_type", java.lang.Integer.valueOf(i17));
            hashMap.put("chat_username", userName);
            hashMap.put("stt_translate_sessionid", sessionId);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("stt_speech_end", hashMap, 35268);
            this.Z4 = false;
            android.view.View view = this.f190030n4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "stopSpeech", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "stopSpeech", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f190024m4.setVisibility(0);
            this.f190024m4.setText(getResources().getString(com.tencent.mm.R.string.pce));
            this.f189961b4.getText().removeSpan(this.f189962b5);
            gm0.j1.b().c();
            androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new pn4.l()).a(pn4.p.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((pn4.p) a17).P6();
        }
    }

    public void D() {
        fl5.i iVar = this.f190021m;
        if (iVar != null) {
            iVar.setText("");
            B(false);
            e1();
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f189981f;
            if (chatFooterPanel != null) {
                chatFooterPanel.setToSendText("");
            }
        }
    }

    public boolean D0() {
        int i17 = this.f189970d2;
        return i17 == 3 || i17 == 2;
    }

    public void D1(boolean z17) {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        if (z17) {
            if (appPanel.D == 0) {
                appPanel.D = 1;
            }
        } else {
            boolean z18 = appPanel.D == 2;
            appPanel.D = 0;
            if (z18) {
                appPanel.o();
            }
        }
    }

    public final void E(int i17, boolean z17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "configPanel: %s, %s, %s, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f190010k2), java.lang.Boolean.valueOf(this.f190042p2), java.lang.Boolean.valueOf(this.f189959b2));
        boolean z18 = this.f190042p2 || !this.f189959b2;
        boolean z19 = i17 == 1 && !this.f190010k2;
        boolean z27 = i17 != 1 && this.f190010k2;
        if (z18 || !(z19 || z27)) {
            E1(i17, z17, i18);
        } else {
            this.f189976e2 = i17;
        }
        if (z19) {
            this.f190066t2 = 0;
            post(new com.tencent.mm.pluginsdk.ui.chat.f4(this));
        }
        if (z27) {
            A0();
        }
        if (z18) {
            this.f190010k2 = i17 == 1;
        }
    }

    public final void E0() {
        this.M4.setVisibility(8);
        this.O4.setTextColor(getResources().getColor(com.tencent.mm.R.color.adh));
        this.O4.setTextSize(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479919iy));
        this.Q4.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E1(int r21, boolean r22, int r23) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.chat.ChatFooter.E1(int, boolean, int):void");
    }

    public boolean F(com.tencent.mm.storage.f9 f9Var, r15.g gVar) {
        com.tencent.mm.pluginsdk.ui.chat.k5 k5Var = this.f190090x0;
        if (k5Var != null) {
            k5Var.m();
        }
        this.L.setTag(new com.tencent.mm.storage.ca(f9Var, gVar));
        v1(true, false);
        if (this.V1 == 1) {
            z1();
            U0(true);
            C("");
        }
        return true;
    }

    public final void F0() {
        this.L4.setVisibility(8);
        this.N4.setTextColor(getResources().getColor(com.tencent.mm.R.color.adh));
        this.N4.setTextSize(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479919iy));
        this.P4.setVisibility(8);
    }

    public final void F1(boolean z17, java.lang.Runnable runnable, int i17) {
        if (z17) {
            if (this.f189993h == null) {
                G0();
            }
            this.f189993h.animate().cancel();
            if (this.f189993h.getVisibility() != 0 || this.f189993h.getAlpha() != 1.0f) {
                setAppPanelVisible(0);
                this.f189993h.setAlpha(0.0f);
                this.f189993h.animate().setDuration(200L).alpha(1.0f).withEndAction(runnable).setListener(new com.tencent.mm.pluginsdk.ui.chat.c4(this)).start();
                this.f189993h.setUncertainEnterLocation(i17);
                this.f189993h.x();
                final com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
                appPanel.getClass();
                appPanel.f189929e = gm0.j1.b().j() + "_" + java.lang.System.currentTimeMillis();
                appPanel.post(new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.ui.chat.AppPanel$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel2 = com.tencent.mm.pluginsdk.ui.chat.AppPanel.this;
                        for (com.tencent.mm.pluginsdk.ui.chat.AppGrid appGrid : appPanel2.f189939q) {
                            appGrid.setSessionid(appPanel2.f189929e);
                            if (appPanel2.f189940r.getCurScreen() == appGrid.getCurPage()) {
                                appGrid.c();
                            }
                        }
                    }
                });
            } else if (runnable != null) {
                runnable.run();
            }
        } else {
            this.f189993h.animate().cancel();
            if (this.f189993h.getVisibility() != 4 && this.f189993h.getVisibility() != 8 && this.f189993h.getAlpha() != 0.0f) {
                this.f189993h.animate().setDuration(200L).alpha(0.0f).withEndAction(new com.tencent.mm.pluginsdk.ui.chat.d4(this, runnable));
            } else if (runnable != null) {
                runnable.run();
            }
        }
        this.f190021m.o();
    }

    public void G() {
        if (this.f189981f != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "jacks chat footer destroy smiley panel");
            this.f189981f.l();
            this.f189981f.a();
            this.f189981f.animate().cancel();
            this.f189981f = null;
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f190050q4;
        if (chatFooterPanel != null) {
            chatFooterPanel.l();
            this.f190050q4.a();
            this.f190050q4 = null;
        }
        this.f190068t4 = false;
        this.f190074u4 = false;
        this.f190080v4 = false;
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f189987g;
        if (ibVar != null) {
            ibVar.f();
            this.f189987g = null;
            this.Z1 = false;
        }
        com.tencent.mm.pluginsdk.ui.chat.k5 k5Var = this.f190090x0;
        if (k5Var != null) {
            k5Var.release();
        }
        com.tencent.mm.pluginsdk.ui.chat.g8 g8Var = this.W;
        if (g8Var != null) {
            ((com.tencent.mm.pluginsdk.ui.chat.ra) g8Var).f190617h = null;
            ((com.tencent.mm.pluginsdk.ui.chat.ra) g8Var).f190616g = null;
            ((com.tencent.mm.pluginsdk.ui.chat.ra) g8Var).d();
        }
        if (this.L1 != null) {
            com.tencent.mm.ui.blur.BlurView blurView = this.f190061s3;
            if (blurView != null) {
                blurView.getBlurController().destroy();
            }
            com.tencent.mm.ui.blur.BlurView blurView2 = this.I3;
            if (blurView2 != null) {
                blurView2.getBlurController().destroy();
            }
        }
        e70.a0 a0Var = this.f190046p6;
        if (a0Var != null) {
            ((d83.t0) a0Var).d();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "jacks destroy chat footer.");
        this.f190021m.destroy();
    }

    public final void G0() {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = (com.tencent.mm.pluginsdk.ui.chat.AppPanel) findViewById(com.tencent.mm.R.id.bhm);
        this.f189993h = appPanel;
        appPanel.setOnSwitchPanelListener(this.f189979e5);
        this.f189993h.setChattingContext(this.f189985f5);
        this.f189993h.setPortHeighPx(com.tencent.mm.sdk.platformtools.d2.g(getContext()));
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = this.f189955a3;
        java.lang.String c17 = y4Var == null ? this.f189969d : y4Var.c();
        if (c17 == null) {
            this.f189993h.t(1);
        } else if (c01.e2.D(c17) || com.tencent.mm.storage.z3.R3(c17)) {
            this.f189993h.t(0);
        } else if (c01.e2.G(c17)) {
            this.f189993h.t(4);
        } else if (com.tencent.mm.storage.z3.R4(c17)) {
            this.f189993h.t(2);
        } else {
            this.f189993h.t(1);
        }
        this.f190096y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.bhn);
    }

    public final void G1(boolean z17, java.lang.Runnable runnable) {
        if (!z17) {
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f189981f;
            if (chatFooterPanel != null && chatFooterPanel.getVisibility() != 4 && this.f189981f.getVisibility() != 8 && this.f189981f.getAlpha() != 0.0f) {
                this.f189981f.animate().cancel();
                this.f189981f.animate().setDuration(200L).alpha(0.0f).withEndAction(new com.tencent.mm.pluginsdk.ui.chat.e4(this, runnable)).start();
                return;
            } else {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        if (this.f189981f == null) {
            H0();
        }
        this.f189981f.animate().cancel();
        if (this.f189981f.getVisibility() == 0 && this.f189981f.getAlpha() == 1.0f) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            this.f189981f.setVisibility(0);
            this.f189981f.setAlpha(0.0f);
            this.f189981f.animate().setDuration(200L).alpha(1.0f).withEndAction(runnable).start();
            this.f189981f.setToSendText(this.f190021m.getText().toString());
        }
    }

    public void H() {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.P = true;
        appPanel.C.f190165w.f190766a = false;
        appPanel.o();
    }

    public void H0() {
        if (com.tencent.mm.pluginsdk.ui.chat.i6.a() == null || getContext() == null) {
            if (getContext() != null) {
                this.f189981f = new com.tencent.mm.pluginsdk.ui.chat.t5(getContext());
                return;
            }
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "[initSmiley] context always is null! %s", new com.tencent.mm.sdk.platformtools.z3());
            this.f189981f = new com.tencent.mm.pluginsdk.ui.chat.t5(com.tencent.mm.sdk.platformtools.x2.f193071a);
            return;
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f189981f;
        if (chatFooterPanel != null) {
            chatFooterPanel.a();
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel wi6 = ((g30.c0) com.tencent.mm.pluginsdk.ui.chat.i6.a()).wi(getContext());
        this.f189981f = wi6;
        wi6.setShowSearch(true);
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = this.f189981f;
        int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
        chatFooterPanel2.setEntranceScene(1);
        this.f189981f.setSearchSource(1);
        this.f189981f.setVisibility(8);
        this.f189981f.setFooterType(this.F);
        com.tencent.mm.pluginsdk.ui.chat.ChatFooterBottom chatFooterBottom = this.f190089x;
        if (chatFooterBottom != null) {
            chatFooterBottom.addView(this.f189981f, -1, -1);
        }
        this.f189981f.setOnTextOperationListener(this.f189973d5);
        this.f189981f.setSendButtonEnable(this.f190021m.getText().length() > 0);
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = this.f189955a3;
        if (y4Var != null) {
            this.f189981f.setTalkerName(y4Var.c());
        }
        this.f189981f.i();
        if (this.Y1) {
            v0();
        }
        setSmileyPanelCallback(this.f189967c5);
        this.f189981f.setSmileyPanelExpandable(true);
        com.tencent.mm.pluginsdk.ui.h1 panelSlideIndicator = this.f189981f.getPanelSlideIndicator();
        this.f189999i = panelSlideIndicator;
        ((ym5.f0) panelSlideIndicator).f463278d = new com.tencent.mm.pluginsdk.ui.chat.n2(this);
    }

    public final void H1() {
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(getContext());
        if (f17.equals("zh_CN") || f17.equals("zh_HK") || f17.equals("zh_TW")) {
            this.f190106z3.setImageResource(com.tencent.mm.R.raw.voice2txt_hint_trans_chs);
            this.F3.setImageResource(com.tencent.mm.R.raw.voice2txt_trans_chs_img);
        } else if (f17.equals("en")) {
            this.f190106z3.setImageResource(com.tencent.mm.R.raw.voice2txt_hint_trans_eng);
            this.F3.setImageResource(com.tencent.mm.R.raw.voice2txt_trans_eng_img);
        }
    }

    public void I() {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.C.f190143a.f190766a = false;
        appPanel.o();
    }

    public final void I0() {
        android.view.View view = this.B3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "initTransVoiceNormalBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "initTransVoiceNormalBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.E3;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "initTransVoiceNormalBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "initTransVoiceNormalBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.B3.setScaleX(0.5f);
        this.B3.setScaleY(0.5f);
        this.E3.setScaleX(0.5f);
        this.E3.setScaleY(0.5f);
        this.B3.setTranslationX(this.S5);
        android.view.View view3 = this.B3;
        int i17 = this.T5;
        view3.setTranslationY(-i17);
        this.E3.setTranslationX(-r2);
        this.E3.setTranslationY(-i17);
        this.C3.setIconColor(getResources().getColor(com.tencent.mm.R.color.f_));
        this.D3.setTextColor(getResources().getColor(com.tencent.mm.R.color.a_4));
        this.B3.setBackgroundDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.b9c));
        this.F3.setIconColor(getResources().getColor(com.tencent.mm.R.color.f_));
        this.G3.setTextColor(getResources().getColor(com.tencent.mm.R.color.a_4));
        this.E3.setBackgroundDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.b9c));
    }

    public final void I1() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "triggerModeChange, lastMode: %s, nowMode: %s.", this.f189974d6, this.f189968c6);
        if (this.f189974d6 != this.f189968c6) {
            K1();
            int ordinal = this.f189974d6.ordinal();
            com.tencent.mm.plugin.transvoice.model.e eVar = this.N3;
            if (ordinal == 0) {
                android.view.ViewPropertyAnimator animate = this.R4.animate();
                float f17 = this.V5;
                animate.translationY(f17).alpha(0.0f).setDuration(100L).withStartAction(new com.tencent.mm.pluginsdk.ui.chat.r0(this)).withEndAction(new com.tencent.mm.pluginsdk.ui.chat.q0(this)).start();
                this.S4.animate().translationY(f17).alpha(0.0f).setDuration(100L).start();
                this.T4.animate().translationY(f17).setDuration(100L).start();
                this.U4.animate().translationY(f17).setDuration(100L).start();
                eVar.f175401y += java.lang.System.currentTimeMillis() - this.O3;
                this.O3 = java.lang.System.currentTimeMillis();
            } else if (ordinal == 1) {
                E0();
                eVar.A += java.lang.System.currentTimeMillis() - this.O3;
                this.O3 = java.lang.System.currentTimeMillis();
            } else if (ordinal == 2) {
                F0();
                eVar.f175402z += java.lang.System.currentTimeMillis() - this.O3;
                this.O3 = java.lang.System.currentTimeMillis();
            }
            int ordinal2 = this.f189968c6.ordinal();
            if (ordinal2 == 0) {
                q();
                return;
            }
            ca5.k kVar = ca5.k.MINI;
            if (ordinal2 == 1) {
                android.content.Context context = getContext();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                android.os.Vibrator vibrator = (android.os.Vibrator) context.getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(10L);
                }
                this.M4.setVisibility(0);
                this.O4.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
                this.O4.setTextSize(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479575r));
                this.Q4.setVisibility(0);
                A1();
                this.f189966c4.h(kVar);
                this.f190036o4.setVisibility(8);
                this.f189984f4.setVisibility(8);
                this.f189961b4.setVisibility(8);
                this.f189978e4.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_voice2txt_cursor, getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac)));
                this.f189978e4.animate().translationX(-((com.tencent.mm.ui.bl.b(getContext()).x / 2.0f) - com.tencent.mm.ui.zk.a(getContext(), 75))).setDuration(150L).start();
                this.f189956a4.setActivated(false);
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f190044p4.getLayoutParams();
                layoutParams.removeRule(21);
                layoutParams.removeRule(12);
                layoutParams.addRule(13);
                this.f190044p4.requestLayout();
                y();
                z();
                return;
            }
            if (ordinal2 != 2) {
                return;
            }
            android.content.Context context2 = getContext();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.Vibrator vibrator2 = (android.os.Vibrator) context2.getSystemService("vibrator");
            if (vibrator2 != null) {
                vibrator2.vibrate(10L);
            }
            int i17 = this.f190082v6;
            eVar.f175391o = i17;
            z21.a0 a0Var = this.L3;
            this.f189961b4.setImportantForAccessibility(2);
            if (!this.f190026m6) {
                this.f190026m6 = true;
                ((java.util.HashMap) this.f189980e6).clear();
                com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = this.f189955a3;
                com.tencent.mm.plugin.transvoice.model.c cVar = new com.tencent.mm.plugin.transvoice.model.c(a0Var, i17, 0, y4Var != null ? y4Var.c() : this.f189969d, this.f190046p6, new com.tencent.mm.pluginsdk.ui.chat.d1(this));
                this.f190038o6 = cVar;
                cVar.f175374m = true;
                cVar.d();
                this.f190064s6.c(500L, 500L);
            }
            this.L4.setVisibility(0);
            this.N4.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            this.N4.setTextSize(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479575r));
            this.P4.setVisibility(0);
            this.f190036o4.setVisibility(8);
            this.f189961b4.setVisibility(0);
            this.f189978e4.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_voice2txt_cursor, getContext().getResources().getColor(com.tencent.mm.R.color.f478523a4)));
            this.f189978e4.animate().translationX((com.tencent.mm.ui.bl.b(getContext()).x / 2.0f) - com.tencent.mm.ui.zk.a(getContext(), 88)).setDuration(150L).start();
            this.f189956a4.setActivated(true);
            int i18 = this.D5;
            if (i18 < 10) {
                t1(i18);
            } else {
                this.f189966c4.setVisibility(0);
                this.f189984f4.setVisibility(8);
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f190044p4.getLayoutParams();
                layoutParams2.addRule(21);
                layoutParams2.addRule(12);
                layoutParams2.removeRule(13);
                this.f190044p4.requestLayout();
                ((android.widget.RelativeLayout.LayoutParams) this.f189966c4.getLayoutParams()).bottomMargin = com.tencent.mm.ui.zk.a(getContext(), 8);
                this.f189966c4.requestLayout();
                this.f189966c4.h(kVar);
            }
            y();
            z();
            this.f189961b4.requestFocus();
            this.f189961b4.setCursorVisible(true);
        }
    }

    public void J() {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.C.f190160r.f190766a = false;
        appPanel.o();
    }

    public final void J0() {
        db5.d5 d5Var;
        if (com.tencent.mm.pluginsdk.ui.chat.i6.a() == null || this.f190050q4 != null || (d5Var = this.X3) == null) {
            return;
        }
        android.view.View findViewById = d5Var.getContentView().findViewById(com.tencent.mm.R.id.k_r);
        if (findViewById instanceof android.widget.RelativeLayout) {
            android.content.Context context = getContext();
            int round = java.lang.Math.round(com.tencent.mm.ui.gk.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df)));
            int round2 = java.lang.Math.round(com.tencent.mm.ui.gk.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7)));
            int keyBordHeightPX = getKeyBordHeightPX();
            int c17 = com.tencent.mm.ui.bl.c(context);
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
            frameLayout.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.f478490b));
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, round + keyBordHeightPX);
            layoutParams.addRule(12);
            layoutParams.bottomMargin = c17;
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.setVisibility(8);
            ((android.widget.RelativeLayout) findViewById).addView(frameLayout);
            this.f190056r4 = frameLayout;
            com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = new com.tencent.mm.ui.widget.imageview.WeImageButton(context);
            weImageButton.setBackground(null);
            weImageButton.setPadding(0, 0, 0, 0);
            weImageButton.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            weImageButton.setImageResource(com.tencent.mm.R.drawable.f481235o1);
            weImageButton.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
            weImageButton.setContentDescription(context.getString(com.tencent.mm.R.string.axk));
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(round2, round2);
            layoutParams2.gravity = 8388659;
            layoutParams2.topMargin = (round - round2) / 2;
            layoutParams2.leftMargin = java.lang.Math.round(com.tencent.mm.ui.gk.a(i65.a.h(context, com.tencent.mm.R.dimen.f479688cn)));
            frameLayout.addView(weImageButton, layoutParams2);
            weImageButton.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.a1(this));
            this.f190062s4 = weImageButton;
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel wi6 = ((g30.c0) com.tencent.mm.pluginsdk.ui.chat.i6.a()).wi(context);
            this.f190050q4 = wi6;
            int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
            wi6.setEntranceScene(1);
            this.f190050q4.c();
            this.f190050q4.setVisibility(4);
            android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-1, keyBordHeightPX);
            layoutParams3.gravity = 80;
            frameLayout.addView(this.f190050q4, layoutParams3);
            this.f190050q4.setOnTextOperationListener(new com.tencent.mm.pluginsdk.ui.chat.b1(this));
            this.f190050q4.i();
        }
    }

    public final void J1() {
        this.K4.setProgress(4.0f);
        this.K4.setStartAngle(252.0f);
        float startAngle = this.L4.getStartAngle();
        float progress = this.L4.getProgress();
        this.f190086w4.setAlpha(0.0f);
        postDelayed(new com.tencent.mm.pluginsdk.ui.chat.s0(this), 100L);
        postDelayed(new com.tencent.mm.pluginsdk.ui.chat.v0(this), 50L);
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setFloatValues(0.0f, 2.4f);
        valueAnimator.setDuration(200L);
        valueAnimator.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        valueAnimator.start();
        valueAnimator.addUpdateListener(new com.tencent.mm.pluginsdk.ui.chat.w0(this, progress, startAngle));
        valueAnimator.addListener(new com.tencent.mm.pluginsdk.ui.chat.x0(this));
    }

    public void K() {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.C.f190147e.f190766a = false;
        appPanel.o();
    }

    public boolean K0() {
        return this.f189970d2 != 0;
    }

    public final void K1() {
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f189984f4.getLayoutParams();
        if (this.f189968c6 == com.tencent.mm.pluginsdk.ui.chat.b5.MODE_TRANS) {
            layoutParams.bottomMargin = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479673ca);
        } else {
            layoutParams.bottomMargin = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479731dn);
        }
        this.f189984f4.setLayoutParams(layoutParams);
    }

    public void L() {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.C.f190166x.f190766a = false;
        appPanel.o();
    }

    public boolean L0() {
        return this.D2.n();
    }

    public void L1() {
        this.W2 = getChatEnableEnterButtonSend();
        this.X2 = getConfigEnableEnterButtonSend();
        fl5.i iVar = this.f190021m;
        if (iVar != null) {
            iVar.setEnableSendBtn(this.W2);
        }
    }

    public void M(boolean z17) {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.C.f190163u.f190766a = !z17;
        appPanel.o();
        boolean z18 = appPanel.C.f190163u.f190766a;
    }

    public boolean M0() {
        return this.L.getTag() != null && (this.L.getTag() instanceof com.tencent.mm.storage.ca) && this.G.isShown() && this.L.isShown();
    }

    public final void M1() {
        android.view.View view = this.f190059s;
        if (view == null) {
            return;
        }
        if (this.f190071u || this.f190077v || this.f190065t) {
            view.setBackgroundResource(com.tencent.mm.R.drawable.f481916c80);
        } else {
            view.setBackgroundResource(com.tencent.mm.R.drawable.c7z);
        }
    }

    public void N() {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.C.C.f190766a = false;
        appPanel.o();
        boolean z17 = appPanel.C.D.f190766a;
    }

    public boolean N0() {
        android.view.View findViewById;
        android.view.DisplayCutout displayCutout;
        com.tencent.mm.ui.MMFragment mMFragment = this.Y2;
        if (mMFragment == null || mMFragment.getView() == null || (findViewById = this.Y2.getView().findViewById(com.tencent.mm.R.id.jlt)) == null) {
            return false;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        findViewById.getGlobalVisibleRect(rect);
        return rect.left > ((!fp.h.c(28) || (displayCutout = findViewById.getRootWindowInsets().getDisplayCutout()) == null) ? 0 : displayCutout.getSafeInsetLeft());
    }

    public final void N1(java.lang.String str) {
        if (!this.f189964c2) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "updateKeyboardProvider: not resumed %s", new com.tencent.mm.sdk.platformtools.z3());
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "updateKeyboardProvider from=%s isMultiWindow=%s lastIsPort=%s", str, java.lang.Boolean.valueOf(this.f190042p2), java.lang.Boolean.valueOf(this.f189959b2));
        if (this.f190042p2 || !this.f189959b2) {
            com.tencent.mm.ui.tools.f5 f5Var = this.f189994h2;
            if (f5Var != null) {
                f5Var.d();
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "[-] updateKeyboardProvider: try to call keyboardHeightProvider.close() when it was null.");
            }
            ((android.app.Activity) getContext()).getWindow().setSoftInputMode(18);
            return;
        }
        ((android.app.Activity) getContext()).getWindow().setSoftInputMode(this.f190000i2);
        com.tencent.mm.ui.tools.f5 f5Var2 = this.f189994h2;
        if (f5Var2 != null) {
            f5Var2.f();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "[-] updateKeyboardProvider: try to call keyboardHeightProvider.start() when it was null.");
        }
    }

    public void O() {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.C.A.f190766a = false;
        appPanel.o();
    }

    public boolean O0() {
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = this.f189955a3;
        if (y4Var == null || y4Var.a() == null) {
            return true;
        }
        return (((sb5.s) this.f189955a3.a().f460708c.a(sb5.s.class)).u() || ((sb5.h0) this.f189955a3.a().f460708c.a(sb5.h0.class)).G() || ((sb5.x) this.f189955a3.a().f460708c.a(sb5.x.class)).t() || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f189955a3.a().f460708c.a(sb5.f.class))).G0() || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f189955a3.a().f460708c.a(sb5.f.class))).H0() || ((sb5.j0) this.f189955a3.a().f460708c.a(sb5.j0.class)).s()) ? false : true;
    }

    public final void O1() {
        if (com.tencent.mm.ui.bk.A()) {
            this.S3 = false;
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getConfiguration().orientation == 2) {
            this.S3 = false;
            return;
        }
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (!f17.equals("zh_CN") && !f17.equals("zh_HK") && !f17.equals("zh_TW") && !f17.equals("en")) {
            this.S3 = false;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            this.S3 = true;
        }
    }

    public void P() {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.C.f190152j.f190766a = false;
        appPanel.o();
    }

    public boolean P0() {
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = this.f189955a3;
        if (y4Var == null || y4Var.a() == null) {
            return true;
        }
        return (((sb5.s) this.f189955a3.a().f460708c.a(sb5.s.class)).u() || ((sb5.h0) this.f189955a3.a().f460708c.a(sb5.h0.class)).G() || ((sb5.x) this.f189955a3.a().f460708c.a(sb5.x.class)).t() || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f189955a3.a().f460708c.a(sb5.f.class))).G0() || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f189955a3.a().f460708c.a(sb5.f.class))).H0() || ((sb5.j0) this.f189955a3.a().f460708c.a(sb5.j0.class)).s()) ? false : true;
    }

    public final void P1() {
        this.f190086w4.setVisibility(0);
        this.f190094x4.setVisibility(0);
        com.tencent.mm.pluginsdk.ui.chat.y0 y0Var = new com.tencent.mm.pluginsdk.ui.chat.y0(this);
        android.animation.ValueAnimator valueAnimator = this.X5;
        valueAnimator.addUpdateListener(y0Var);
        valueAnimator.start();
        if (this.f189968c6 == com.tencent.mm.pluginsdk.ui.chat.b5.MODE_VOICE) {
            this.C4.setEnabled(true);
            this.E4.setVisibility(0);
            this.E4.setEnabled(true);
            android.view.View view = this.D4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateResultOpeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateResultOpeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.E4.setText(getContext().getResources().getString(com.tencent.mm.R.string.nk9));
            this.A4.setImageResource(com.tencent.mm.R.raw.new_voice2txt_trans_ch);
            this.B4.setText(getContext().getResources().getString(com.tencent.mm.R.string.h8y));
            return;
        }
        this.C4.setEnabled(false);
        this.E4.setVisibility(8);
        this.E4.setEnabled(false);
        android.view.View view2 = this.D4;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateResultOpeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateResultOpeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.E4.setText(getContext().getResources().getString(com.tencent.mm.R.string.f490551ya));
        this.A4.setImageResource(com.tencent.mm.R.raw.new_voice2txt_voice);
        this.B4.setText(getContext().getResources().getString(com.tencent.mm.R.string.h8x));
    }

    public void Q() {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.C.f190146d.f190766a = false;
        appPanel.o();
    }

    public void Q0() {
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar;
        db5.d5 d5Var;
        com.tencent.mm.ui.widget.MMEditText mMEditText;
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "onPause");
        this.f189964c2 = false;
        if (this.f190000i2 == 48 && this.f189970d2 == 1 && !this.C2) {
            this.f190010k2 = false;
            E1(0, true, -1);
        }
        if (this.f190022m2 && this.f190021m.getText().length() == 0 && (y4Var = this.f189955a3) != null) {
            com.tencent.mm.autogen.mmdata.rpt.InputChangeLineStruct inputChangeLineStruct = new com.tencent.mm.autogen.mmdata.rpt.InputChangeLineStruct();
            inputChangeLineStruct.f58502h = 4;
            inputChangeLineStruct.f58498d = 1L;
            inputChangeLineStruct.q(y4Var.c());
            inputChangeLineStruct.p(u35.a.f424428b);
            inputChangeLineStruct.f58508n = java.lang.System.currentTimeMillis();
            u35.a.f424427a.a(inputChangeLineStruct);
            inputChangeLineStruct.k();
        }
        this.f190022m2 = false;
        A0();
        if (this.S3 && this.f190010k2 && (d5Var = this.X3) != null && d5Var.isShowing() && (mMEditText = this.f189961b4) != null) {
            mMEditText.clearFocus();
        }
        com.tencent.mm.ui.tools.f5 f5Var = this.f189994h2;
        if (f5Var != null) {
            f5Var.d();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "[-] onPause: try to call keyboardHeightProvider.close() when it was null.");
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f189981f;
        if (chatFooterPanel != null) {
            chatFooterPanel.h();
        }
        if (this.Z1 && (ibVar = this.f189987g) != null) {
            ibVar.j();
        }
        com.tencent.mm.pluginsdk.ui.chat.k5 k5Var = this.f190090x0;
        if (k5Var != null) {
            k5Var.onPause();
        }
        com.tencent.mm.pluginsdk.ui.chat.g8 g8Var = this.W;
        if (g8Var != null) {
            ((com.tencent.mm.pluginsdk.ui.chat.ra) g8Var).d();
        }
        db5.d5 d5Var2 = this.L1;
        if (d5Var2 != null && d5Var2.isShowing()) {
            this.L1.dismiss();
        }
        y0();
        this.f190021m.onPause();
        this.f190088w6.dead();
        ma0.h hVar = (ma0.h) ((ka0.i0) i95.n0.c(ka0.i0.class));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onExitChat, job:");
        sb6.append(hVar.f325148p);
        sb6.append(" isActive:");
        kotlinx.coroutines.r2 r2Var = hVar.f325148p;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(((kotlinx.coroutines.a) r2Var).a()) : null);
        com.tencent.mars.xlog.Log.i(hVar.f325139d, sb6.toString());
        kotlinx.coroutines.r2 r2Var2 = hVar.f325148p;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        n3.l1.n(this.f190021m.j(), ih5.b.f291601b, null);
        this.f190021m.setOnMsgPasteListener(null);
        this.f190021m.setInputListener(null);
        C1();
        qn4.y.d(4);
    }

    public final void Q1(int i17) {
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = this.f190047q;
        if (weImageButton == null) {
            return;
        }
        boolean z17 = i17 == com.tencent.mm.R.drawable.f481237o3;
        if (weImageButton != null) {
            if (z17) {
                weImageButton.setContentDescription(getContext().getString(com.tencent.mm.R.string.axn));
            } else {
                weImageButton.setContentDescription(getContext().getString(com.tencent.mm.R.string.axm));
            }
        }
        this.f190047q.setImageResource(i17);
        x(this.f190047q, z17 ? "chat_left_side_audio_btn" : "chat_left_side_keyboard_btn");
        this.f190047q.setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        this.f190047q.setPadding(0, 0, 0, 0);
    }

    public void R() {
        if (this.f189993h.C.F.f190766a) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.ChatFooter", "hy: disable send gift! talker: %s", this.f189969d);
        }
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.C.F.f190766a = false;
        appPanel.o();
    }

    public void R0(android.content.Context context, android.app.Activity activity) {
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var;
        com.tencent.mm.pluginsdk.ui.chat.n5 n5Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "onResume: %s, %s", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.d2.j(context)), java.lang.Integer.valueOf(getContext().getResources().getConfiguration().orientation));
        this.f189964c2 = true;
        this.Z2 = activity;
        if (this.f190000i2 == 48 && this.f189970d2 == 1 && !this.C2) {
            this.f190010k2 = false;
            E1(0, false, -1);
        }
        this.f189959b2 = getContext().getResources().getConfiguration().orientation == 1 || com.tencent.mm.sdk.platformtools.d2.j(context);
        if (fp.h.c(24)) {
            this.f190042p2 = getIsMultiWindow();
        }
        R1();
        N1("onResume");
        L1();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "registerContentReceice!!");
        this.f190021m.setOnMsgPasteListener(new fl5.c() { // from class: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$d
            @Override // fl5.c
            public final boolean a(android.content.Context context2) {
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.this;
                if (!chatFooter.H1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "not support paste content!!");
                    return false;
                }
                t35.b bVar = t35.b.f415435a;
                java.lang.Object systemService = context2 != null ? context2.getSystemService("clipboard") : null;
                android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
                java.util.List a17 = bVar.a(clipboardManager != null ? clipboardManager.getPrimaryClip() : null);
                java.util.ArrayList arrayList = (java.util.ArrayList) a17;
                if (arrayList.size() <= 1 && (arrayList.size() != 1 || ((t35.a) arrayList.get(0)).f415434c == null || ((t35.a) arrayList.get(0)).f415434c.equals(android.net.Uri.EMPTY))) {
                    return false;
                }
                ((com.tencent.mm.ui.chatting.component.xi) ((sb5.l1) chatFooter.f189955a3.a().f460708c.a(sb5.l1.class))).m0(a17);
                return true;
            }
        });
        ih5.b bVar = new ih5.b();
        bVar.f291602a = new com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$e(this);
        n3.l1.n(this.f190021m.j(), ih5.b.f291601b, bVar);
        this.f190021m.setInputListener(new com.tencent.mm.pluginsdk.ui.chat.r1(this));
        if (com.tencent.mm.pluginsdk.model.app.x5.c().f189149g) {
            com.tencent.mm.pluginsdk.model.app.x5.c().d(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f189981f;
        if (chatFooterPanel != null) {
            chatFooterPanel.setShowSend(this.W2);
            com.tencent.mm.pluginsdk.ui.chat.ChatFooterBottom chatFooterBottom = this.f190089x;
            if (!(chatFooterBottom.f190121d || chatFooterBottom.getVisibility() != 0)) {
                this.f189981f.i();
            }
            if (com.tencent.mm.storage.z3.L3(this.f189969d)) {
                this.f189981f.setShowSmiley(true);
                boolean z17 = (((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).hj(this.f189969d) & 2048) > 0;
                this.f189981f.setShowSearch(z17);
                this.f189981f.o(z17, z17);
                this.f189981f.setShowStore(z17);
                this.f189981f.p(z17, z17);
                this.f189981f.setShowGame(false);
            } else {
                this.f189981f.setShowSearch(true);
            }
        }
        boolean z18 = this.W2;
        if (!z18 && this.X1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "jacks chatting footer disable enter button send");
            this.X1 = false;
            this.f190021m.setImeOptions(0);
            fl5.i iVar = this.f190021m;
            iVar.setInputType(iVar.getInputType() | 64);
        } else if (z18 && !this.X1) {
            f0();
        }
        X0(getKeyBordHeightPX());
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        if (appPanel != null) {
            appPanel.f189937p = context;
        }
        this.V.f190522k = false;
        if (!this.Z1) {
            android.view.View findViewById = this.f189975e.findViewById(com.tencent.mm.R.id.bqn);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "sendAreaVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "sendAreaVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        l0();
        com.tencent.mm.pluginsdk.ui.chat.k5 k5Var = this.f190090x0;
        if (k5Var != null) {
            k5Var.onResume();
        }
        post(new com.tencent.mm.pluginsdk.ui.chat.w4(this));
        com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout chattingScrollLayout = this.f189982f2;
        if (chattingScrollLayout != null && (y4Var = this.f189955a3) != null && (n5Var = (com.tencent.mm.pluginsdk.ui.chat.n5) y4Var.a().f460708c.a(sb5.p0.class)) != null) {
            java.util.LinkedList linkedList = (java.util.LinkedList) chattingScrollLayout.f190133r;
            if (!linkedList.contains(n5Var)) {
                linkedList.add(n5Var);
            }
        }
        this.f190088w6.alive();
    }

    public void R1() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_custom_emoji_panel_disable_slidable, false) ? false : (L0() || !this.f189959b2 || this.f190042p2) ? false : true;
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f189981f;
        if (chatFooterPanel != null) {
            chatFooterPanel.setSmileyPanelExpandable(z17);
        }
    }

    public void S() {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.C.f190158p.f190766a = false;
        appPanel.o();
    }

    public void S0(boolean z17) {
        this.O5 = true;
        this.P5 = z17 ? 1 : 3;
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = this.f189955a3;
        u35.d.a(y4Var != null ? y4Var.c() : this.f189969d, 1, this.P5);
        if (this.M5 <= 0) {
            this.M5 = (int) this.f190090x0.c();
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f190090x0.a())) {
            java.lang.String a17 = this.f190090x0.a();
            kotlin.jvm.internal.o.g(a17, "<set-?>");
            ba5.a.f18703c = a17;
        }
        com.tencent.mm.pluginsdk.ui.chat.k5 k5Var = this.f190090x0;
        if (k5Var != null) {
            k5Var.g();
        }
        android.view.View view = this.J4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "onVoiceCancelAndStop", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "onVoiceCancelAndStop", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f189974d6 = this.f189968c6;
        this.f189968c6 = com.tencent.mm.pluginsdk.ui.chat.b5.MODE_VOICE;
        I1();
        P1();
        J1();
        this.f189984f4.setText(getContext().getResources().getString(com.tencent.mm.R.string.f491308nk3));
        this.f189972d4.setVisibility(0);
        this.f189966c4.setVisibility(8);
        this.f190064s6.d();
        com.tencent.mm.plugin.transvoice.model.c cVar = this.f190038o6;
        if (cVar != null) {
            cVar.a(false, false);
        }
    }

    public void S1() {
        this.f190021m.setMaxHeight((this.D.getMaxHeight() - this.D.getPaddingBottom()) - this.D.getPaddingTop());
    }

    public void T(int i17) {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.K = true;
        appPanel.L = i17;
        appPanel.C.f190162t.f190766a = false;
        appPanel.o();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "local disableServiceLuckyMoney, scene %s, stack：%s", valueOf, com.tencent.mm.sdk.platformtools.z3.b(true));
    }

    public final void T0() {
        this.f190019l5.start();
        this.f190025m5.start();
        this.f190031n5.start();
        this.f190037o5.start();
        this.f190045p5.start();
        this.R4.animate().alpha(1.0f).setDuration(200L).start();
        this.S4.animate().alpha(1.0f).setDuration(200L).start();
        this.f189956a4.setAlpha(0.0f);
        this.f189956a4.setTranslationY(com.tencent.mm.ui.zk.a(getContext(), 56));
        this.f189978e4.setAlpha(0);
        this.f189978e4.setTranslationY(com.tencent.mm.ui.zk.a(getContext(), 56));
        android.view.ViewGroup viewGroup = this.f189956a4;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(viewGroup, "translationY", viewGroup.getTranslationY(), 0.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.f189956a4, "alpha", 0.0f, 1.0f);
        android.widget.ImageView imageView = this.f189978e4;
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(imageView, "translationY", imageView.getTranslationY(), 0.0f);
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(this.f189978e4, "alpha", 0, 255);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofInt);
        animatorSet.start();
    }

    public final void T1(boolean z17, boolean z18) {
        if (this.f190002i4 == null) {
            return;
        }
        if (!z18) {
            this.f190018l4.setText(getResources().getString(com.tencent.mm.R.string.pcg));
            android.view.View view = this.f190012k4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoice2TxtTransLayout", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoice2TxtTransLayout", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f190024m4.setText(getResources().getString(com.tencent.mm.R.string.pce));
            android.view.View view2 = this.f189996h4;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoice2TxtTransLayout", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoice2TxtTransLayout", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f190018l4.setText(getResources().getString(com.tencent.mm.R.string.npo));
        if (this.f190012k4.getVisibility() == 8) {
            android.view.View view3 = this.f190012k4;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoice2TxtTransLayout", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoice2TxtTransLayout", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b31.l lVar = b31.l.f17613a;
            java.lang.String userName = this.f189969d;
            java.lang.String sessionId = this.f190032n6;
            java.lang.String currentLang = this.f190014k6;
            kotlin.jvm.internal.o.g(userName, "userName");
            kotlin.jvm.internal.o.g(sessionId, "sessionId");
            kotlin.jvm.internal.o.g(currentLang, "currentLang");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("view_id", "stt_change_language_btn");
            hashMap.put("chat_username", userName);
            hashMap.put("stt_translate_sessionid", sessionId);
            hashMap.put("current_language_code", currentLang);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 35268);
        }
        if (!z17) {
            android.view.View view4 = this.f189996h4;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoice2TxtTransLayout", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoice2TxtTransLayout", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (this.f189996h4.getVisibility() == 8) {
            android.view.View view5 = this.f189996h4;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoice2TxtTransLayout", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoice2TxtTransLayout", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b31.l lVar2 = b31.l.f17613a;
            java.lang.String userName2 = this.f189969d;
            java.lang.String sessionId2 = this.f190032n6;
            java.lang.String currentLang2 = this.f190014k6;
            kotlin.jvm.internal.o.g(userName2, "userName");
            kotlin.jvm.internal.o.g(sessionId2, "sessionId");
            kotlin.jvm.internal.o.g(currentLang2, "currentLang");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("view_id", "stt_read_aloud_btn");
            hashMap2.put("chat_username", userName2);
            hashMap2.put("stt_translate_sessionid", sessionId2);
            hashMap2.put("current_language_code", currentLang2);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap2, 35268);
        }
    }

    public void U(int i17) {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.M = true;
        appPanel.N = i17;
        appPanel.C.f190151i.f190766a = false;
        appPanel.o();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "local disableServiceRemittance ，scene：%s， stack：%s", valueOf, com.tencent.mm.sdk.platformtools.z3.b(true));
    }

    public void U0(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "pureForcusEdtChange: %s, %s", java.lang.Boolean.valueOf(z17), this.f190021m);
        fl5.i iVar = this.f190021m;
        if (iVar == null) {
            return;
        }
        if (z17) {
            iVar.k();
        } else {
            iVar.clearFocus();
        }
    }

    public void U1(int i17) {
        db5.d5 d5Var;
        db5.d5 d5Var2;
        if (this.S3) {
            com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView = this.f189966c4;
            if (soundWaveView == null || soundWaveView.getVisibility() != 0) {
                return;
            }
            this.f189966c4.i(i17);
            return;
        }
        boolean z17 = this.W1;
        int[] iArr = f189951y6;
        int[] iArr2 = f189952z6;
        if (z17) {
            int i18 = 0;
            while (true) {
                if (i18 >= 8) {
                    break;
                }
                if (i17 < iArr[i18] || i17 >= iArr[i18 + 1]) {
                    i18++;
                } else {
                    android.widget.ImageView imageView = this.f190079v3;
                    if (imageView != null) {
                        imageView.setBackgroundDrawable(i65.a.i(getContext(), iArr2[i18]));
                    }
                }
            }
            if (i17 != -1 || (d5Var2 = this.L1) == null) {
                return;
            }
            d5Var2.dismiss();
            android.view.View view = this.R1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoiceRcdHint", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoiceRcdHint", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.M1.setVisibility(8);
            android.view.View view2 = this.S1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoiceRcdHint", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoiceRcdHint", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int i19 = 0;
        while (true) {
            if (i19 >= 8) {
                break;
            }
            if (i17 < iArr[i19] || i17 >= iArr[i19 + 1]) {
                i19++;
            } else {
                android.widget.ImageView imageView2 = this.O1;
                if (imageView2 != null) {
                    imageView2.setBackgroundDrawable(i65.a.i(getContext(), iArr2[i19]));
                }
            }
        }
        if (i17 != -1 || (d5Var = this.L1) == null) {
            return;
        }
        d5Var.dismiss();
        android.view.View view3 = this.R1;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoiceRcdHint", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoiceRcdHint", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.M1.setVisibility(8);
        android.view.View view4 = this.S1;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoiceRcdHint", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoiceRcdHint", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void V() {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.C.f190161s.f190766a = false;
        appPanel.o();
    }

    public void V0(int i17) {
        com.tencent.mm.pluginsdk.ui.chat.z4 z4Var;
        this.V1 = i17;
        if (i17 == 1) {
            this.f190039p.setVisibility(8);
            y1(true);
            Q1(com.tencent.mm.R.drawable.f481237o3);
        } else {
            if (i17 != 2) {
                return;
            }
            this.f190039p.setVisibility(0);
            y1(false);
            y0();
            Q1(com.tencent.mm.R.drawable.f481236o2);
            if (!c01.z1.H().booleanValue() || (z4Var = this.Q2) == null) {
                return;
            }
            ((com.tencent.mm.ui.chatting.component.hm) z4Var).f199176a.m0(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE);
        }
    }

    public void W() {
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = this.C;
        if (weImageButton != null) {
            weImageButton.setVisibility(8);
        }
    }

    public void W0() {
        if (this.f190010k2 || D0() || !this.A2) {
            return;
        }
        int i17 = 0;
        this.A2 = false;
        int i18 = this.B2;
        if (i18 != -1 && i18 != 4) {
            i17 = i18;
        }
        E1(i17, true, -1);
    }

    public void X(boolean z17) {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.C.f190153k.f190766a = !z17;
        appPanel.o();
    }

    public final void X0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "[refreshBottomHeight] keyborPx:%d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.sdk.platformtools.d2.f192519c = false;
        int h17 = (com.tencent.mm.storage.z3.m4(this.f189969d) || com.tencent.mm.storage.z3.n4(this.f189969d)) ? com.tencent.mm.sdk.platformtools.d2.h(getContext(), i17, 43) : com.tencent.mm.sdk.platformtools.d2.i(getContext(), i17, this.f190042p2);
        int a17 = qk.w9.a(getContext());
        if (!this.f189959b2 || this.f190042p2) {
            this.f190092x2 = com.tencent.mm.sdk.platformtools.d2.g(getContext());
        } else {
            this.f190092x2 = h17;
        }
        int max = java.lang.Math.max(a17, this.f190092x2);
        this.f190099y2 = max;
        if (max != this.f190084w2) {
            this.f190084w2 = max;
        }
        if (this.f189999i != null) {
            q0();
            com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout chattingScrollLayout = this.f189982f2;
            if (chattingScrollLayout != null) {
                ((ym5.f0) this.f189999i).b(chattingScrollLayout.getHeight(), max, this.G.getMeasuredHeight());
                if (((ym5.f0) this.f189999i).c()) {
                    this.f190084w2 += ((ym5.f0) this.f189999i).f463290p;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "refreshBottomHeight: %s, %s, %s, %s, %s", java.lang.Boolean.valueOf(this.f189959b2), java.lang.Boolean.valueOf(this.f190042p2), java.lang.Integer.valueOf(this.f190092x2), java.lang.Integer.valueOf(this.f190084w2), java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.d2.j(getContext())));
        android.view.ViewGroup.LayoutParams layoutParams = this.f190089x.getLayoutParams();
        if (layoutParams != null) {
            int i18 = layoutParams.height;
            int i19 = this.f190084w2;
            if (i18 != i19) {
                layoutParams.height = i19;
                this.f190089x.setLayoutParams(layoutParams);
                this.f190089x.requestLayout();
            }
        }
        if (this.f189988g2) {
            int i27 = -this.f190084w2;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) getLayoutParams();
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i27) {
                marginLayoutParams.bottomMargin = i27;
                setLayoutParams(marginLayoutParams);
            }
        }
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        if (appPanel != null) {
            appPanel.setPortHeighPx(this.f190092x2);
            com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel2 = this.f189993h;
            appPanel2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "[forceRefreshSize]");
            appPanel2.y();
        }
        if (this.f189987g != null) {
            int height = this.f190092x2 + this.f190059s.getHeight() + this.f190083w.getHeight();
            android.view.ViewGroup.LayoutParams layoutParams2 = this.f189987g.getLayoutParams();
            if (layoutParams2 == null || layoutParams2.height == height) {
                return;
            }
            layoutParams2.height = height;
            this.f189987g.setLayoutParams(layoutParams2);
        }
    }

    public void Y() {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.C.f190144b.f190766a = false;
        appPanel.o();
    }

    public void Y0(java.lang.Boolean bool) {
        if (this.L.getVisibility() != 8) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$h
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.this;
                    android.view.View view = chatFooter.N;
                    if (view == null) {
                        return;
                    }
                    float x17 = view.getX();
                    int measuredWidth = chatFooter.N.getMeasuredWidth();
                    int dimensionPixelSize = chatFooter.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv) + ((int) x17);
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) chatFooter.L.getLayoutParams();
                    marginLayoutParams.width = measuredWidth - (chatFooter.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv) * 2);
                    marginLayoutParams.leftMargin = dimensionPixelSize;
                    chatFooter.L.setLayoutParams(marginLayoutParams);
                    int i17 = marginLayoutParams.width;
                    boolean z17 = chatFooter.Q.getVisibility() != 8;
                    int i18 = chatFooter.G5;
                    int i19 = (i17 - i18) - ((chatFooter.H5 + i18) + i18);
                    if (z17) {
                        i19 = (i19 - chatFooter.J5) - chatFooter.I5;
                    }
                    chatFooter.P.setMaxWidth(i19);
                }
            };
            if (!bool.booleanValue()) {
                runnable.run();
                return;
            }
            android.view.View view = this.N;
            if (view != null) {
                view.post(runnable);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.ChatFooter", "inputContainerWrapper null, skip");
            }
        }
    }

    public void Z() {
        y1(true);
        this.f190047q.setVisibility(8);
        this.f190039p.setVisibility(8);
    }

    public final void Z0() {
        if (!this.W1) {
            android.view.View view = this.N1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.Q1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.R1;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.S1;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f190049q3.setVisibility(8);
            return;
        }
        android.view.View view5 = this.N1;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view6 = this.Q1;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view7 = this.R1;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view8 = this.S1;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(8);
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f190049q3.setVisibility(0);
        android.view.View view9 = this.f190067t3;
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        arrayList9.add(0);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
        yj0.a.f(view9, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view10 = this.f190073u3;
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        arrayList10.add(0);
        java.util.Collections.reverse(arrayList10);
        yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
        yj0.a.f(view10, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f190085w3.setVisibility(8);
        android.view.View view11 = this.f190093x3;
        java.util.ArrayList arrayList11 = new java.util.ArrayList();
        arrayList11.add(0);
        java.util.Collections.reverse(arrayList11);
        yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
        yj0.a.f(view11, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f190100y3.setVisibility(8);
        android.view.View view12 = this.A3;
        java.util.ArrayList arrayList12 = new java.util.ArrayList();
        arrayList12.add(8);
        java.util.Collections.reverse(arrayList12);
        yj0.a.d(view12, arrayList12.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view12.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
        yj0.a.f(view12, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view13 = this.B3;
        java.util.ArrayList arrayList13 = new java.util.ArrayList();
        arrayList13.add(8);
        java.util.Collections.reverse(arrayList13);
        yj0.a.d(view13, arrayList13.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view13.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
        yj0.a.f(view13, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view14 = this.E3;
        java.util.ArrayList arrayList14 = new java.util.ArrayList();
        arrayList14.add(8);
        java.util.Collections.reverse(arrayList14);
        yj0.a.d(view14, arrayList14.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view14.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
        yj0.a.f(view14, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.Q3 = com.tencent.mm.pluginsdk.ui.chat.i5.MODE_INVALID;
    }

    @Override // hv4.a
    public void a(java.lang.String str, int i17) {
        if (i17 == 2) {
            java.lang.String str2 = "#" + str + " ";
            fl5.i iVar = this.f190021m;
            if (iVar == null) {
                return;
            }
            iVar.append(str2);
            fl5.i iVar2 = this.f190021m;
            iVar2.setSelection(iVar2.getText().length());
            this.f190021m.k();
            return;
        }
        java.lang.String str3 = str + " ";
        fl5.i iVar3 = this.f190021m;
        if (iVar3 == null) {
            return;
        }
        iVar3.append(str3);
        fl5.i iVar4 = this.f190021m;
        iVar4.setSelection(iVar4.getText().length());
        this.f190021m.k();
    }

    public void a0(boolean z17) {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.C.f190156n.f190766a = !z17;
        appPanel.o();
    }

    public void a1() {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        if (appPanel == null) {
            return;
        }
        appPanel.A();
    }

    @Override // hv4.a
    public void b(r45.sn3 sn3Var) {
    }

    public void b0() {
        this.f189993h.q(true);
    }

    public void b1() {
        if (!com.tencent.mm.sdk.platformtools.t8.J0(this.P.getText())) {
            this.P.setText("");
        }
        this.Q.setImageBitmap(null);
        this.R.setImageDrawable(null);
        if (this.L.getTag() != null) {
            this.L.setTag(null);
        }
        this.Q.setVisibility(8);
        this.R.setVisibility(8);
        setMsgQuoteRlVisibility(8);
    }

    public void c0(boolean z17, boolean z18) {
        this.f189993h.q(z17);
        this.f189993h.r(z18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x02cf, code lost:
    
        r1.f175495x = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c1() {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.chat.ChatFooter.c1():void");
    }

    public void d0() {
        this.f189993h.r(true);
    }

    public void d1(com.tencent.mm.pluginsdk.ui.chat.f5 f5Var) {
        post(new com.tencent.mm.pluginsdk.ui.chat.x3(this, f5Var));
    }

    public void e0() {
        this.f189993h.Q = false;
    }

    public final void e1() {
        com.tencent.mm.autogen.mmdata.rpt.AndroidChatInputStruct androidChatInputStruct = this.P2;
        if (androidChatInputStruct != null) {
            androidChatInputStruct.f55045h = 0L;
            androidChatInputStruct.f55043f = 0L;
            androidChatInputStruct.f55044g = 0L;
            androidChatInputStruct.f55046i = 0L;
            androidChatInputStruct.f55041d = 0L;
            androidChatInputStruct.f55042e = 0L;
        }
    }

    public void f0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "jacks chatting footer enable enter button send");
        this.X1 = true;
        this.f190021m.setImeOptions(4);
        fl5.i iVar = this.f190021m;
        iVar.setInputType(iVar.getInputType() & (-65));
    }

    public void f1() {
        if (!com.tencent.mm.sdk.platformtools.t8.J0(this.f190021m.getText())) {
            this.f190021m.setText("");
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f189981f;
            if (chatFooterPanel != null) {
                chatFooterPanel.setToSendText("");
            }
        }
        U0(false);
        e1();
    }

    public void g0() {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.C.f190147e.f190766a = true;
        appPanel.o();
    }

    public final void g1() {
        this.f190086w4.animate().translationY(0.0f).setDuration(200L).start();
        this.f189956a4.animate().translationY(0.0f).setDuration(200L).start();
        this.f189978e4.animate().translationY(0.0f).setDuration(200L).start();
        this.f190007j4.animate().translationY(0.0f).setDuration(200L).start();
        if (this.f189956a4.getHeight() < this.A5) {
            android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofInt(this.f189956a4.getHeight(), this.A5).setDuration(200L);
            duration.addUpdateListener(new com.tencent.mm.pluginsdk.ui.chat.c1(this));
            duration.start();
        }
    }

    public android.app.Activity getActivity() {
        return this.f189965c3;
    }

    public boolean getActivitySmileyBtn() {
        return this.F5;
    }

    public com.tencent.mm.pluginsdk.ui.chat.AppPanel getAppPanel() {
        return this.f189993h;
    }

    public java.util.ArrayList<com.tencent.mm.pluginsdk.ui.chat.x> getAppPanelUnCertainEnterArrayList() {
        return this.f189993h.getAppPanelUnCertainEnterArrayList();
    }

    public java.lang.String getAtSomebody() {
        return this.f190041p1.f190740b;
    }

    public java.util.List<java.lang.String> getAtSomebodyList() {
        return this.f190041p1.f190741c;
    }

    public int getBarGroupHeight() {
        if (this.T1 == null) {
            this.T1 = findViewById(com.tencent.mm.R.id.bl9);
        }
        android.view.View view = this.T1;
        return view != null ? view.getHeight() : getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479727dj);
    }

    public com.tencent.mm.pluginsdk.ui.chat.j6 getCallback() {
        return this.f189967c5;
    }

    public char getCharAtCursor() {
        int selectionStart = getSelectionStart();
        if (selectionStart <= 0) {
            return 'x';
        }
        return getLastText().charAt(selectionStart - 1);
    }

    public boolean getChatEnableEnterButtonSend() {
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.D2;
        return !(c8Var != null && c8Var.n()) && getConfigEnableEnterButtonSend();
    }

    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel getChatFooterPanel() {
        return this.f189981f;
    }

    public com.tencent.mm.pluginsdk.ui.chat.y4 getChattingContext() {
        return this.f189955a3;
    }

    public boolean getConfigEnableEnterButtonSend() {
        return ((java.lang.Boolean) c01.d9.b().p().l(66832, java.lang.Boolean.FALSE)).booleanValue();
    }

    public int getCurrentScrollHeight() {
        return this.f190005j2;
    }

    public boolean getFullScreenEditEnable() {
        return this.f189960b3;
    }

    public com.tencent.mm.ui.chatting.component.cd getIOnToDoBarCallback() {
        return this.K2;
    }

    public sb5.n2 getIOnTranslateResCallback() {
        return this.N2;
    }

    public int getInsertPos() {
        return this.f190041p1.f190742d;
    }

    public boolean getIsMultiWindow() {
        if (fp.e0.e() || u75.e.a() || fp.e0.f()) {
            return this.f190048q2 || ((android.app.Activity) getContext()).isInMultiWindowMode();
        }
        if (com.tencent.mm.ui.bk.w0()) {
            return false;
        }
        return ((android.app.Activity) getContext()).isInMultiWindowMode();
    }

    public boolean getIsVoiceInputPanleShow() {
        return this.Z1;
    }

    public int getKeyBordHeightPX() {
        return com.tencent.mm.sdk.platformtools.d2.g(getContext());
    }

    public java.lang.String getLastContent() {
        return this.f190041p1.f190739a;
    }

    public r15.g getLastPartialQuoteText() {
        if (this.L.getTag() == null || !(this.L.getTag() instanceof com.tencent.mm.storage.ca)) {
            return null;
        }
        return ((com.tencent.mm.storage.ca) this.L.getTag()).f193823b;
    }

    public long getLastQuoteMsgId() {
        if (this.L.getTag() == null || !(this.L.getTag() instanceof com.tencent.mm.storage.ca)) {
            return 0L;
        }
        return ((com.tencent.mm.storage.ca) this.L.getTag()).f193822a.getMsgId();
    }

    public java.lang.String getLastQuoteMsgTalker() {
        return (this.L.getTag() == null || !(this.L.getTag() instanceof com.tencent.mm.storage.ca)) ? "" : ((com.tencent.mm.storage.ca) this.L.getTag()).f193822a.Q0();
    }

    public java.lang.String getLastText() {
        fl5.i iVar = this.f190021m;
        return iVar == null ? "" : iVar.getText().toString();
    }

    public int getMode() {
        return this.V1;
    }

    public android.view.View getPanel() {
        return this.f190089x;
    }

    public int getPanelType() {
        return this.f189970d2;
    }

    public r15.g getPartialQuoteText() {
        android.widget.LinearLayout linearLayout = this.L;
        if (linearLayout == null || linearLayout.getTag() == null || !(this.L.getTag() instanceof com.tencent.mm.storage.ca) || !this.L.isShown()) {
            return null;
        }
        return ((com.tencent.mm.storage.ca) this.L.getTag()).f193823b;
    }

    public int getQuoteHeight() {
        if (!M0()) {
            return 0;
        }
        return this.L.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) this.L.getLayoutParams()).topMargin;
    }

    public com.tencent.mm.storage.f9 getQuoteMsgInfo() {
        android.widget.LinearLayout linearLayout = this.L;
        if (linearLayout == null || linearLayout.getTag() == null || !(this.L.getTag() instanceof com.tencent.mm.storage.ca) || !this.L.isShown()) {
            return null;
        }
        return ((com.tencent.mm.storage.ca) this.L.getTag()).f193822a;
    }

    public r15.b getQuoteSendExtCommonInfo() {
        java.util.Map d17;
        android.widget.LinearLayout linearLayout = this.L;
        java.lang.String str = null;
        if (linearLayout == null || linearLayout.getTag() == null || !(this.L.getTag() instanceof com.tencent.mm.storage.ca) || !this.L.isShown()) {
            return null;
        }
        com.tencent.mm.storage.f9 f9Var = ((com.tencent.mm.storage.ca) this.L.getTag()).f193822a;
        r15.g gVar = ((com.tencent.mm.storage.ca) this.L.getTag()).f193823b;
        ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).getClass();
        r15.b bVar = new r15.b();
        r15.i iVar = new r15.i();
        iVar.r(f9Var.I0());
        java.lang.String t17 = c01.ia.t(f9Var.G);
        if (t17 == null) {
            t17 = "";
        }
        iVar.q(t17);
        iVar.n(f9Var.getCreateTime() / 1000);
        java.lang.String str2 = f9Var.G;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (d17 = com.tencent.mm.sdk.platformtools.aa.d(str2, "msgsource", null)) != null) {
            str = (java.lang.String) d17.get(".msgsource.signature");
        }
        iVar.p(str != null ? str : "");
        iVar.o(gVar);
        bVar.q(iVar);
        return bVar;
    }

    public int getSelectionStart() {
        return this.f190021m.getSelectionStart();
    }

    public com.tencent.mm.pluginsdk.ui.chat.u9 getSeqAutoCompleteHelper() {
        if (this.E2 == null) {
            this.E2 = new com.tencent.mm.pluginsdk.ui.chat.u9(this);
        }
        return this.E2;
    }

    public int getSmieyType() {
        return 0;
    }

    public android.widget.LinearLayout getSmileyPanel() {
        return this.f189981f;
    }

    public sb5.a2 getTagVisibilityCallback() {
        return new com.tencent.mm.pluginsdk.ui.chat.r2(this);
    }

    public fl5.i getToSendEt() {
        return this.f190021m;
    }

    public android.view.View getV2TBtnLayout() {
        return this.M;
    }

    public android.view.View getVoiceRcdBtn() {
        return this.f190039p;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.i8
    public int getYFromBottom() {
        int height;
        int a17;
        if (this.f189970d2 == 0) {
            height = getHeight();
            a17 = this.f190084w2;
        } else {
            height = (getHeight() - this.f190084w2) + com.tencent.mm.sdk.platformtools.d2.i(getContext(), getKeyBordHeightPX(), this.f190042p2);
            com.tencent.mm.ui.chatting.component.ed edVar = this.J2;
            if (edVar == null) {
                return height;
            }
            a17 = ((com.tencent.mm.ui.chatting.component.ac) edVar).a();
        }
        return height - a17;
    }

    public void h0() {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.C.f190166x.f190766a = true;
        appPanel.o();
    }

    public void h1(boolean z17, long j17, java.lang.String str, int i17) {
        if (this.L.getTag() == null || !(this.L.getTag() instanceof com.tencent.mm.storage.ca)) {
            return;
        }
        com.tencent.mm.storage.f9 f9Var = ((com.tencent.mm.storage.ca) this.L.getTag()).f193822a;
        if (com.tencent.mm.sdk.platformtools.t8.B0(j17, f9Var.getMsgId()) && com.tencent.mm.sdk.platformtools.t8.D0(str, f9Var.Q0())) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.pluginsdk.ui.chat.p0(this, z17, i17));
        }
    }

    public void i0() {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.C.C.f190766a = true;
        appPanel.o();
        boolean z17 = appPanel.C.D.f190766a;
    }

    public void i1(int i17, boolean z17, int i18, int i19) {
        q0();
        com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout chattingScrollLayout = this.f189982f2;
        if (chattingScrollLayout != null) {
            if (this.f190072u2 && this.f189970d2 == 1) {
                chattingScrollLayout.b(0, false, i18, i19);
                return;
            } else {
                chattingScrollLayout.b(i17, z17, i18, i19);
                return;
            }
        }
        int i27 = this.f189970d2;
        if (i27 == 0 || i27 == 1) {
            this.f190089x.setVisibility(8);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "scrollParent: scrollParent is not ChattingScrollLayout");
    }

    public void j0() {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.C.f190146d.f190766a = true;
        appPanel.o();
    }

    public void j1(java.lang.String str, long j17, r15.g gVar) {
        if (j17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "invalid quote msg id:%s", java.lang.Long.valueOf(j17));
            this.L.setTag(null);
            return;
        }
        com.tencent.mm.storage.f9 f27 = pt0.f0.f2(str, j17);
        if (f27 == null || f27.getMsgId() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "try find quote msg by localid %s failed,not show quote", java.lang.Long.valueOf(j17));
            this.L.setTag(null);
        } else {
            if ((f27.F & 4) != 4 && f27.getType() != 10000) {
                this.L.setTag(new com.tencent.mm.storage.ca(f27, gVar));
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "msg(%s) is revoked!", f27.getType() + "," + (f27.F & 4));
            db5.e1.s(getContext(), getContext().getString(com.tencent.mm.R.string.gzd), "");
        }
    }

    public void k0() {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        appPanel.C.f190158p.f190766a = true;
        appPanel.o();
    }

    public void k1(java.lang.String str, int i17, boolean z17) {
        boolean z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "setLastText() text:%s", com.tencent.mm.sdk.platformtools.t8.G1(str));
        z63.f1 f1Var = this.f190040p0;
        if (f1Var != null) {
            z18 = f1Var.f470388i;
            f1Var.f470388i = false;
        } else {
            z18 = false;
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "setLastText() isBackFromGroupSolitatire");
            return;
        }
        if (z17 && (str == null || str.length() == 0 || this.f190021m == null)) {
            this.f190021m.setText("");
            e1();
            return;
        }
        this.f190091x1 = true;
        this.f190021m.setText(str);
        this.f190091x1 = false;
        if (i17 >= 0 && i17 <= this.f190021m.getText().length()) {
            this.f190021m.setSelection(i17);
        } else {
            fl5.i iVar = this.f190021m;
            iVar.setSelection(iVar.getText().length());
        }
    }

    public void l0() {
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = (com.tencent.mm.ui.widget.imageview.WeImageButton) this.f189975e.findViewById(com.tencent.mm.R.id.bqr);
        this.C = weImageButton;
        weImageButton.setVisibility(0);
        x(this.C, "chat_emoji_button");
        if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_EMOJI_CAPTURE_OUTER_EMOJI_BUTTON_RED_DOT_BOOLEAN, true)) {
            android.view.View findViewById = this.f189975e.findViewById(com.tencent.mm.R.id.bqs);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "initSmileyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "initSmileyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById2 = this.f189975e.findViewById(com.tencent.mm.R.id.bqs);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "initSmileyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "initSmileyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById3 = this.f189975e.findViewById(com.tencent.mm.R.id.bqs);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "initSmileyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "initSmileyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479738dv);
        int f18 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479646bl);
        if (this.U3) {
            f17 = java.lang.Math.round(com.tencent.mm.ui.gk.a(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479738dv)));
            f18 = java.lang.Math.round(com.tencent.mm.ui.gk.a(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479646bl)));
        }
        p0(this.C, f17, f18);
        this.C.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.g2(this));
        com.tencent.mm.pluginsdk.ui.chat.g8 g8Var = this.W;
        if (g8Var != null) {
            ((com.tencent.mm.pluginsdk.ui.chat.ra) g8Var).f190615f = this.C;
        }
        z63.f1 f1Var = this.f190040p0;
        if (f1Var != null) {
            f1Var.f470385f = this.f189975e;
        }
        if (this.U3) {
            int f19 = j65.c.f(i65.a.n(getContext()));
            int u07 = u0(f19);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.C.getLayoutParams();
            layoutParams.width = java.lang.Math.round(com.tencent.mm.ui.gk.a(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479714d7)));
            layoutParams.height = java.lang.Math.round(com.tencent.mm.ui.gk.a(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479714d7)));
            if (f19 > 1) {
                layoutParams.bottomMargin = u07;
            }
            this.C.setLayoutParams(layoutParams);
        }
    }

    public void l1(int i17, boolean z17) {
        V0(i17);
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = this.f189955a3;
        if (y4Var != null && y4Var.a() != null) {
            if (i17 == 1) {
                ((com.tencent.mm.ui.chatting.component.ho) ((sb5.o2) this.f189955a3.a().f460708c.a(sb5.o2.class))).A0();
            } else if (i17 != 2) {
                setVisibility(0);
            } else {
                ((com.tencent.mm.ui.chatting.component.ho) ((sb5.o2) this.f189955a3.a().f460708c.a(sb5.o2.class))).x0();
            }
        }
        if (i17 != 1) {
            if (i17 != 2) {
                setVisibility(0);
                return;
            } else {
                w0(true);
                B(false);
                return;
            }
        }
        if (!z17) {
            B(this.f190021m.length() > 0);
            return;
        }
        U0(true);
        z1();
        B(this.f190021m.length() > 0);
    }

    public void m0() {
        this.f189993h.q(false);
    }

    public void m1(java.lang.String str, java.lang.Boolean bool, java.lang.CharSequence charSequence) {
        android.view.ViewGroup viewGroup = this.F1;
        if (viewGroup == null || this.E1 == null) {
            return;
        }
        viewGroup.setVisibility(0);
        android.view.ViewGroup viewGroup2 = this.G1;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        o1(str, bool, charSequence, java.lang.Boolean.TRUE);
    }

    public void n0() {
        this.f189993h.r(false);
    }

    public void n1() {
        this.N3.b(1);
        this.f190039p.setEnabled(false);
        this.f190039p.setBackgroundResource(com.tencent.mm.R.drawable.awl);
        boolean z17 = this.S3;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f189991g5;
        if (z17) {
            this.X3.update();
            n3Var.sendEmptyMessageDelayed(0, 500L);
            return;
        }
        if (this.L1 != null) {
            android.view.View view = this.S1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setRcdTooShort", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setRcdTooShort", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.M1.setVisibility(8);
            android.view.View view2 = this.R1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setRcdTooShort", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setRcdTooShort", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.L1.update();
            this.M3.dismiss();
        }
        n3Var.sendEmptyMessageDelayed(0, 500L);
    }

    public final void o0() {
        this.f190074u4 = false;
        this.f190080v4 = false;
        if (this.f190068t4) {
            z0();
        }
        android.view.ViewGroup viewGroup = this.f190056r4;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = this.f190062s4;
        if (weImageButton != null) {
            weImageButton.setImageResource(com.tencent.mm.R.drawable.f481235o1);
        }
    }

    public void o1(java.lang.String str, java.lang.Boolean bool, java.lang.CharSequence charSequence, java.lang.Boolean bool2) {
        if (!bool2.booleanValue() || this.E1 == null) {
            if (bool.booleanValue()) {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(this.D1, str);
            } else {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.D1, str, null);
            }
            this.D1.setVisibility(0);
        } else {
            if (bool.booleanValue()) {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(this.E1, str);
            } else {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.E1, str, null);
            }
            this.E1.setVisibility(0);
        }
        setHint(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "[+] onAttachedToWindow called.");
        super.onAttachedToWindow();
        com.tencent.mm.sdk.event.IListener iListener = this.I2;
        if (iListener != null) {
            iListener.alive();
        }
        N1("onAttachedToWindow");
        q0();
        X0(getKeyBordHeightPX());
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (fp.h.c(24)) {
            this.f190042p2 = getIsMultiWindow();
        }
        O1();
        this.f189959b2 = configuration.orientation == 1;
        R1();
        E(0, false, -1);
        N1("onConfigurationChanged");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "onConfigurationChanged: %s, %s, %s", configuration, java.lang.Boolean.valueOf(this.f189959b2), java.lang.Boolean.valueOf(this.f190042p2));
        X0(getKeyBordHeightPX());
        pp3.u uVar = pp3.u.f357498s;
        if (uVar != null) {
            uVar.dismiss();
        }
        if (hg5.d.I()) {
            hg5.d.f281399q = com.tencent.mm.ui.bk.C();
            try {
                hg5.d dVar = hg5.d.f281398p;
                if (dVar != null) {
                    dVar.dismiss();
                }
            } catch (java.lang.Exception unused) {
            }
            hg5.d.f281398p = null;
        }
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.D2;
        if (c8Var.n()) {
            c8Var.a();
        }
        c8Var.l(c8Var.f190221c.getLineCount());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mm.ui.tools.f5 f5Var = this.f189994h2;
        if (f5Var != null) {
            f5Var.d();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "[-] onDetachedFromWindow: try to call keyboardHeightProvider.close() when it was null.");
        }
        this.f189982f2 = null;
        this.f189988g2 = false;
        com.tencent.mm.sdk.event.IListener iListener = this.I2;
        if (iListener != null) {
            iListener.dead();
        }
    }

    @Override // hv4.a
    public void onDismiss() {
        this.f190021m.k();
        this.f190060s2 = false;
        z1();
        f189950x6 = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout chattingScrollLayout;
        super.onSizeChanged(i17, i18, i19, i27);
        q0();
        com.tencent.mm.pluginsdk.ui.h1 h1Var = this.f189999i;
        if (h1Var == null || ((ym5.f0) h1Var).f463290p != 0 || (chattingScrollLayout = this.f189982f2) == null || this.G == null) {
            return;
        }
        ((ym5.f0) h1Var).b(chattingScrollLayout.getHeight(), this.f190084w2, this.G.getMeasuredHeight());
    }

    public final void p0(android.view.View view, int i17, int i18) {
        if (j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigChatfooterExpandTouch()) == 0) {
            return;
        }
        view.post(new com.tencent.mm.pluginsdk.ui.chat.i2(this, view, i17, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479646bl), i18));
    }

    public void p1(java.lang.String str, java.lang.String str2) {
        this.f190011k3 = str;
        this.f190017l3 = str2;
        if (this.f190021m != null) {
            this.f190021m.getInputExtras(true).putInt("wechat_scene", com.tencent.mm.storage.z3.R4(str2) ? 2 : 1);
            this.f190021m.getInputExtras(true).putBoolean("if_support_new_wxkb", true);
            this.f190021m.getInputExtras(true).putLong("if_support_file_ability", getImeSupportFileAbility());
            this.f190021m.getInputExtras(true).putLong("if_support_identity_ability", getImeSupportIdentityAbility());
            this.f190021m.getInputExtras(true).putLong("wechat_support_ability", getWxKeyboarAbility());
        }
    }

    public final void q() {
        this.R4.animate().translationY(0.0f).alpha(1.0f).setDuration(100L).withEndAction(new com.tencent.mm.pluginsdk.ui.chat.o0(this)).start();
        this.S4.animate().translationY(0.0f).alpha(1.0f).setDuration(100L).start();
        this.T4.animate().translationY(0.0f).setDuration(100L).start();
        this.U4.animate().translationY(0.0f).setDuration(100L).start();
        int i17 = this.D5;
        if (i17 < 10) {
            s1(i17);
        } else {
            A1();
            this.f189966c4.h(ca5.k.NORMAL);
        }
        this.f190036o4.setVisibility(8);
        this.f189961b4.setVisibility(8);
        this.f189978e4.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_voice2txt_cursor, getContext().getResources().getColor(com.tencent.mm.R.color.f478523a4)));
        this.f189978e4.animate().translationX(0.0f).setDuration(150L).start();
        this.f189956a4.setActivated(true);
        y();
        z();
        this.f189961b4.requestFocus();
        this.f189961b4.setCursorVisible(true);
    }

    public final void q0() {
        if (this.f189982f2 == null) {
            android.view.ViewParent parent = getParent();
            if (parent instanceof com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout) {
                com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout chattingScrollLayout = (com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout) parent;
                this.f189982f2 = chattingScrollLayout;
                this.f189988g2 = true;
                if (this.f189960b3) {
                    chattingScrollLayout.setAlwaysScroll(true);
                }
            }
        }
    }

    public void q1() {
        android.widget.LinearLayout linearLayout;
        if (!this.S3) {
            android.view.View view = this.R1;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setVoiceRcdHintReady", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setVoiceRcdHintReady", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.ViewGroup viewGroup = this.M1;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f189966c4 != null && (linearLayout = this.f189972d4) != null && linearLayout.getVisibility() == 8) {
            this.f189966c4.setVisibility(0);
        }
        android.view.View view2 = this.V4;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setVoiceRcdHintReady", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setVoiceRcdHintReady", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void r(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.LinkedList linkedList;
        com.tencent.mm.pluginsdk.ui.chat.x4 x4Var = this.f190041p1;
        if (x4Var.f190743e.containsKey(str)) {
            linkedList = (java.util.LinkedList) x4Var.f190743e.get(str);
        } else {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            x4Var.f190743e.put(str, linkedList2);
            linkedList = linkedList2;
        }
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put(str3, str2);
        linkedList.add(hashMap);
    }

    public java.util.HashMap r0(java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap;
        int indexOf;
        int indexOf2;
        java.lang.System.currentTimeMillis();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str2);
        com.tencent.mm.pluginsdk.ui.chat.x4 x4Var = this.f190041p1;
        if (K0) {
            if (x4Var.f190743e.containsKey(str)) {
                x4Var.f190743e.remove(str);
            }
            return null;
        }
        if (x4Var.f190743e.containsKey(str) && ((java.util.LinkedList) x4Var.f190743e.get(str)).size() > 0) {
            java.util.LinkedList linkedList = (java.util.LinkedList) x4Var.f190743e.get(str);
            java.util.LinkedList<java.lang.String> linkedList2 = new java.util.LinkedList();
            int i17 = 0;
            int i18 = 0;
            while (true) {
                boolean z17 = true;
                if (i18 >= str2.length() || (indexOf = str2.indexOf("@", i18)) == -1 || (indexOf2 = str2.indexOf(8197, indexOf)) == -1 || indexOf2 - indexOf > 40) {
                    break;
                }
                java.lang.String substring = str2.substring(indexOf + 1, indexOf2);
                java.util.Iterator it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    }
                    if (((java.util.HashMap) it.next()).containsKey(substring)) {
                        linkedList2.add(substring);
                        break;
                    }
                }
                i18 = z17 ? indexOf2 + 1 : i18 + 1;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "after split @ :%s", linkedList2);
            if (linkedList2.size() <= 0) {
                ((java.util.LinkedList) x4Var.f190743e.get(str)).clear();
                return null;
            }
            if (linkedList != null && linkedList.size() > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "[getAtSomebodyUsernames] size:%s", java.lang.Integer.valueOf(linkedList.size()));
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                for (java.lang.String str3 : linkedList2) {
                    if (linkedList.size() <= i17 || (hashMap = (java.util.HashMap) linkedList.get(i17)) == null || !hashMap.containsKey(str3)) {
                        java.util.Iterator it6 = linkedList.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                java.util.HashMap hashMap2 = (java.util.HashMap) it6.next();
                                if (hashMap2.containsKey(str3)) {
                                    linkedList3.add((java.lang.String) hashMap2.get(str3));
                                    break;
                                }
                            }
                        }
                    } else {
                        linkedList3.add((java.lang.String) hashMap.get(str3));
                    }
                    i17++;
                }
                java.util.HashMap hashMap3 = new java.util.HashMap(1);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "[getAtSomebodyUsernames]  atList size:%s", java.lang.Integer.valueOf(linkedList3.size()));
                hashMap3.put("atuserlist", "<![CDATA[" + com.tencent.mm.sdk.platformtools.t8.c1(linkedList3, ",") + "]]>");
                linkedList.clear();
                java.lang.System.currentTimeMillis();
                return hashMap3;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatFooter", "atMap is null or size 0");
        }
        return null;
    }

    public final void r1(boolean z17) {
        bw5.s8 c17;
        android.widget.ImageButton imageButton = this.f190103z;
        if (imageButton == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "mAttachButton is null");
            return;
        }
        if (z17 && imageButton.getVisibility() != 0) {
            android.widget.ImageView imageView = this.A;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        if (this.A != null) {
            if (z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                if (getAppPanelUnCertainEnterArrayList() != null && getAppPanelUnCertainEnterArrayList().size() > 0) {
                    java.util.Iterator<com.tencent.mm.pluginsdk.ui.chat.x> it = getAppPanelUnCertainEnterArrayList().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.tencent.mm.pluginsdk.ui.chat.x next = it.next();
                        if (next.f190714h2 == 1) {
                            if (!com.tencent.mm.sdk.platformtools.o4.M("plus_uncertain_enter").getBoolean(next.f190713g2, false)) {
                                if (sb6.length() > 0) {
                                    sb6.append("#");
                                }
                                sb6.append("uncertain_enter");
                            }
                        }
                    }
                }
                com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = this.f189955a3;
                if (y4Var != null && y4Var.a() != null && this.f189993h.C.F.f190766a) {
                    c00.m3 m3Var = (c00.m3) i95.n0.c(c00.m3.class);
                    boolean D = this.f189955a3.a().D();
                    boolean Vi = ((j00.d2) m3Var).Vi(D);
                    n00.g gVar = n00.g.f333821a;
                    bw5.t8 b17 = gVar.b();
                    int i17 = (!D ? (c17 = b17.c()) != null : (c17 = b17.b()) != null) ? 0 : c17.f32854r;
                    int intValue = D ? ((java.lang.Number) n00.g.f333832l.b(gVar, n00.g.f333822b[9])).intValue() : ((java.lang.Number) n00.g.f333831k.b(gVar, n00.g.f333822b[8])).intValue();
                    boolean booleanValue = i17 <= 0 ? D ? ((java.lang.Boolean) n00.g.f333826f.b(gVar, n00.g.f333822b[3])).booleanValue() : ((java.lang.Boolean) n00.g.f333825e.b(gVar, n00.g.f333822b[2])).booleanValue() : intValue >= i17;
                    boolean z18 = Vi && !booleanValue;
                    com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: should show red dot on plus is group? " + D + " should? " + Vi + " hasClicked? " + booleanValue + ", requestClickVersion " + i17 + ", clickedVersion " + intValue);
                    if (z18) {
                        if (((j00.d2) ((c00.m3) i95.n0.c(c00.m3.class))).Bi(this.f189955a3.a().D(), this.f189955a3.a().u())) {
                            if (sb6.length() > 0) {
                                sb6.append("#");
                            }
                            sb6.append("chat_tools_chat_gift_button");
                        }
                    }
                }
                if (com.tencent.mm.plugin.newtips.model.i.i(59)) {
                    if (sb6.length() > 0) {
                        sb6.append("#");
                    }
                    sb6.append("chat_attachment_item_voice_input");
                }
                if (sb6.length() > 0) {
                    this.A.setVisibility(0);
                    com.tencent.mm.pluginsdk.ui.chat.d0 d0Var = this.B;
                    if (d0Var != null) {
                        java.lang.String sb7 = sb6.toString();
                        d0Var.f190256d = sb7 != null ? sb7 : "";
                        return;
                    }
                    return;
                }
            }
            this.A.setVisibility(8);
            com.tencent.mm.pluginsdk.ui.chat.d0 d0Var2 = this.B;
            if (d0Var2 != null) {
                d0Var2.f190256d = "";
            }
        }
    }

    public void s() {
        android.widget.Button button = this.f190027n;
        if (button == null || button.getVisibility() == 8) {
            return;
        }
        if (this.U3) {
            this.Q5 = java.lang.Math.round(com.tencent.mm.ui.gk.a(com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479724dg)));
        }
        if (this.Q5 == 0) {
            this.Q5 = this.f190027n.getWidth();
            this.R5 = this.f190103z.getWidth();
        }
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setIntValues(this.Q5, this.R5);
        valueAnimator.addUpdateListener(new com.tencent.mm.pluginsdk.ui.chat.t4(this));
        valueAnimator.addListener(new com.tencent.mm.pluginsdk.ui.chat.u4(this));
        valueAnimator.setDuration(150L);
        valueAnimator.start();
    }

    public final android.graphics.drawable.PaintDrawable s0(float f17, float f18) {
        com.tencent.mm.pluginsdk.ui.chat.u3 u3Var = new com.tencent.mm.pluginsdk.ui.chat.u3(this, f17, f18);
        android.graphics.drawable.PaintDrawable paintDrawable = new android.graphics.drawable.PaintDrawable();
        paintDrawable.setShape(new android.graphics.drawable.shapes.RectShape());
        paintDrawable.setDither(true);
        paintDrawable.getPaint().setAntiAlias(true);
        paintDrawable.setShaderFactory(u3Var);
        return paintDrawable;
    }

    public final void s1(int i17) {
        com.tencent.mm.pluginsdk.ui.chat.k5 k5Var;
        this.f189984f4.setVisibility(0);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f190044p4.getLayoutParams();
        layoutParams.addRule(13);
        layoutParams.removeRule(21);
        layoutParams.removeRule(12);
        if (this.T3) {
            if ((this.f189968c6 == com.tencent.mm.pluginsdk.ui.chat.b5.MODE_VOICE) && (k5Var = this.f190090x0) != null && k5Var.j()) {
                this.f189984f4.setText(java.lang.String.format(getContext().getResources().getString(com.tencent.mm.R.string.f491307nk2), java.lang.Integer.valueOf(i17)));
            } else {
                this.f189984f4.setText(java.lang.String.format(getContext().getResources().getString(com.tencent.mm.R.string.f491309nk4), java.lang.Integer.valueOf(i17)));
            }
        } else {
            this.f189984f4.setText(java.lang.String.format(getContext().getResources().getString(com.tencent.mm.R.string.h8s), java.lang.Integer.valueOf(this.D5)));
        }
        this.f190044p4.requestLayout();
    }

    public void setActivity(android.app.Activity activity) {
        this.f189965c3 = activity;
    }

    public void setAppPanelListener(com.tencent.mm.pluginsdk.ui.chat.u uVar) {
        this.f189993h.setAppPanelListener(uVar);
    }

    public void setAppPanelTip(java.lang.CharSequence charSequence) {
        android.widget.TextView textView = this.f190096y;
        if (textView == null || this.f189993h == null) {
            return;
        }
        textView.setText(charSequence);
        if (com.tencent.mm.sdk.platformtools.t8.J0(charSequence)) {
            return;
        }
        setAppPanelTipVisible(this.f189993h.getVisibility() == 0);
    }

    public void setAppPanelTipVisible(boolean z17) {
        android.widget.TextView textView = this.f190096y;
        if (textView == null) {
            return;
        }
        if (android.text.TextUtils.isEmpty(textView.getText())) {
            this.f190096y.setVisibility(8);
            return;
        }
        if (z17) {
            int height = (this.f190089x.getHeight() - getKeyBordHeightPX()) + i65.a.b(this.f190096y.getContext(), 32);
            android.view.ViewGroup.LayoutParams layoutParams = this.f190096y.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = height;
                this.f190096y.setLayoutParams(marginLayoutParams);
            }
        }
        this.f190096y.setVisibility(z17 ? 0 : 8);
    }

    public void setAppPanelUnCertainEnterArrayList(java.util.ArrayList<com.tencent.mm.pluginsdk.ui.chat.x> arrayList) {
        this.f189993h.setAppPanelUnCertainEnterArrayList(arrayList);
    }

    public void setAppPanelVisible(int i17) {
        com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.ChatFooter", "setAppPanelVisible = %s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f189993h;
        if (appPanel != null) {
            appPanel.setVisibility(i17);
        }
        setAppPanelTipVisible(i17 == 0);
    }

    public void setAtSomebody(java.lang.String str) {
        this.f190041p1.f190740b = str;
    }

    public void setBottomPanelVisibility(int i17) {
        if (i17 == 0) {
            this.f190089x.setVisibility(i17);
        } else {
            w0(true);
        }
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = this.f189955a3;
        if (y4Var == null || y4Var.a() == null || this.f189955a3.a().f460708c.a(yn.i.class) == null) {
            return;
        }
        java.util.Iterator it = ((com.tencent.mm.ui.chatting.component.w3) ((yn.i) this.f189955a3.a().f460708c.a(yn.i.class))).f200149d.iterator();
        while (it.hasNext()) {
            ((yn.h) it.next()).B(i17);
        }
    }

    public void setChangeIdentityLayoutEnable(java.lang.String str) {
        android.view.ViewGroup viewGroup = this.F1;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            android.view.ViewGroup viewGroup2 = this.G1;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            this.F1.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.s4(this, str));
        }
    }

    public void setDefaultSmileyByDetail(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (this.f189981f == null) {
            H0();
        }
        this.f189981f.setDefaultEmojiByDetail(str);
    }

    public void setEditTextOnDragListener(android.view.View.OnDragListener onDragListener) {
        this.f190021m.setOnDragListener(onDragListener);
    }

    public void setExitType(int i17) {
        com.tencent.mm.plugin.transvoice.model.e eVar = com.tencent.mm.plugin.transvoice.model.e.I;
        com.tencent.mm.plugin.transvoice.model.e.I.b(i17);
    }

    public void setFooterEventListener(com.tencent.mm.pluginsdk.ui.chat.k5 k5Var) {
        this.f190090x0 = k5Var;
    }

    public void setFooterStatus(boolean z17) {
    }

    public void setFooterType(int i17) {
        this.F = i17;
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f189981f;
        if (chatFooterPanel != null) {
            chatFooterPanel.setFooterType(i17);
        }
    }

    public void setHint(java.lang.CharSequence charSequence) {
        fl5.i iVar = this.f190021m;
        if (iVar != null) {
            iVar.setHint(charSequence);
        }
    }

    public void setIOnTodoViewCallback(com.tencent.mm.ui.chatting.component.ed edVar) {
        this.J2 = edVar;
    }

    public void setIOnTranslateViewController(com.tencent.mm.ui.chatting.component.mn mnVar) {
        this.M2 = mnVar;
    }

    public void setIgnoreScroll(java.lang.Boolean bool) {
        this.C2 = bool.booleanValue();
    }

    public void setInputBarVisibility(int i17) {
        android.view.View view = this.f190059s;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setInputBarVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setInputBarVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void setInsertPos(int i17) {
        this.f190041p1.f190742d = i17;
    }

    public void setIsMultiWindow(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "setIsMultiWindow: %s", java.lang.Boolean.valueOf(z17));
        boolean z18 = this.f190042p2 != z17;
        this.f190042p2 = z17;
        N1("setIsMultiWindow");
        if (z18) {
            X0(getKeyBordHeightPX());
            E(0, false, -1);
        }
    }

    public void setKeyboardShow(java.lang.Boolean bool) {
        this.f190010k2 = bool.booleanValue();
    }

    public void setLastContent(java.lang.String str) {
        this.f190041p1.f190739a = str;
    }

    public void setLastText(java.lang.String str) {
        k1(str, -1, true);
    }

    public void setLbsMode(boolean z17) {
        this.f190098y1 = z17;
    }

    public void setMode(int i17) {
        l1(i17, true);
    }

    public void setMsgQuoteRlVisibility(int i17) {
        this.L.setVisibility(i17);
        Y0(java.lang.Boolean.TRUE);
    }

    public void setNeedShowVKBWhenResume(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "setNeedShowVKBWhenResume [%b]", java.lang.Boolean.valueOf(z17));
        this.R3 = z17;
    }

    public void setOnEditFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f190021m.setOnFocusChangeListener(onFocusChangeListener);
    }

    public void setOnFooterPanelSwitchListener(com.tencent.mm.pluginsdk.ui.chat.d5 d5Var) {
        this.f190015l1 = d5Var;
    }

    public void setOnFooterSwitchListener(com.tencent.mm.pluginsdk.ui.chat.e5 e5Var) {
        this.f190097y0 = e5Var;
        if (e5Var == null) {
            return;
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.bpf);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setOnFooterSwitchListener", "(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter$OnFooterSwitchListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setOnFooterSwitchListener", "(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter$OnFooterSwitchListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.y3(this));
    }

    public void setOnFooterSwitchListenerWhenDisable(com.tencent.mm.pluginsdk.ui.chat.e5 e5Var) {
        this.f190097y0 = e5Var;
        if (e5Var == null) {
            return;
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.sqd);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setOnFooterSwitchListenerWhenDisable", "(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter$OnFooterSwitchListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setOnFooterSwitchListenerWhenDisable", "(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter$OnFooterSwitchListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.z3(this));
    }

    public void setRecordNormalWording(java.lang.String str) {
        android.widget.TextView textView;
        if (str == null || (textView = this.P1) == null) {
            return;
        }
        textView.setText(str);
    }

    public void setSetTolastCustomPage(boolean z17) {
    }

    public void setSmileyPanelCallback(com.tencent.mm.pluginsdk.ui.chat.j6 j6Var) {
        this.f189967c5 = j6Var;
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f189981f;
        if (chatFooterPanel != null) {
            chatFooterPanel.setCallback(j6Var);
        }
    }

    public void setSmileyPanelCallback2(com.tencent.mm.pluginsdk.ui.chat.v9 v9Var) {
        ((com.tencent.mm.pluginsdk.ui.chat.ra) this.W).f190616g = v9Var;
    }

    public void setSupportPasteImg(boolean z17) {
        this.H1 = z17;
    }

    public void setSwitchButtonMode(int i17) {
        if (i17 == this.E5) {
            return;
        }
        this.E5 = i17;
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ntc);
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.kj7);
        if (this.E5 == 1) {
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
        } else {
            imageView.setVisibility(0);
            imageView2.setVisibility(8);
        }
    }

    public void setTipsShowCallback(com.tencent.mm.pluginsdk.ui.chat.z4 z4Var) {
        this.Q2 = z4Var;
    }

    public void setToSendTextColor(boolean z17) {
        if (!fp.h.c(11)) {
            if (z17) {
                this.f190021m.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479411yi));
                return;
            } else {
                this.f190021m.setTextColor(getResources().getColor(com.tencent.mm.R.color.t_));
                U0(false);
                return;
            }
        }
        if (fp.h.c(11)) {
            android.os.Message message = new android.os.Message();
            message.what = 1002;
            message.obj = java.lang.Boolean.valueOf(z17);
            this.T2.sendMessage(message);
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f17) {
        super.setTranslationY(f17);
        this.f190021m.f();
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.D2;
        if (c8Var.n()) {
            c8Var.u();
        }
    }

    public void setUserName(java.lang.String str) {
        this.f189969d = str;
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f189981f;
        if (chatFooterPanel != null) {
            chatFooterPanel.setTalkerName(str);
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        objArr[1] = java.lang.Boolean.valueOf(this.f189993h != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "setusername: %s, %s", objArr);
        if (this.f189993h != null) {
            if (c01.e2.D(this.f189969d) || com.tencent.mm.storage.z3.R3(this.f189969d)) {
                this.f189993h.setServiceShowFlag(0);
                return;
            }
            if (c01.e2.G(this.f189969d)) {
                this.f189993h.setServiceShowFlag(4);
            } else if (com.tencent.mm.storage.z3.R4(this.f189969d)) {
                this.f189993h.setServiceShowFlag(2);
            } else {
                this.f189993h.setServiceShowFlag(1);
            }
        }
    }

    public void setVoice2txtCountDown(int i17) {
        if (-1 == i17) {
            android.view.View view = this.f190073u3;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setVoice2txtCountDown", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setVoice2txtCountDown", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f190085w3.setVisibility(8);
            return;
        }
        if (i17 < 0 || i17 >= 10) {
            return;
        }
        if (8 == this.f190085w3.getVisibility()) {
            android.view.View view2 = this.f190073u3;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setVoice2txtCountDown", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setVoice2txtCountDown", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f190085w3.setVisibility(0);
        }
        android.widget.ImageView imageView = this.f190085w3;
        if (imageView != null) {
            imageView.setImageResource(this.f190051q5[i17]);
        }
    }

    public void setVoiceInputShowCallback(com.tencent.mm.pluginsdk.ui.chat.a5 a5Var) {
        this.R2 = a5Var;
    }

    public void setVoiceReactArea(int i17) {
        if (this.S3) {
            setNewVoice2TxtCountDown(i17);
            return;
        }
        if (i17 < 10) {
            if (this.W1) {
                setVoice2txtCountDown(i17);
            } else if (-1 == i17) {
                setRecordNormalWording(getResources().getString(com.tencent.mm.R.string.az_));
            } else {
                setRecordNormalWording(getResources().getQuantityString(com.tencent.mm.R.plurals.f489666c, i17, java.lang.Integer.valueOf(i17)));
            }
        }
    }

    public void setWordCountLimit(int i17) {
        this.f190033o = (android.widget.TextView) this.f189975e.findViewById(com.tencent.mm.R.id.f483706bs5);
        this.f190021m.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i17)});
    }

    public void t() {
        if (this.f190027n == null) {
            return;
        }
        if (this.U3) {
            this.Q5 = java.lang.Math.round(com.tencent.mm.ui.gk.a(com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479724dg)));
        }
        if (this.Q5 == 0) {
            this.Q5 = this.f190027n.getWidth();
            this.R5 = this.f190103z.getWidth();
        }
        if (this.Q5 == 0) {
            try {
                this.f190027n.startAnimation(getAlphaInAnim());
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChatFooter", th6, "[-] Fail to get alphaInAnim.", new java.lang.Object[0]);
            }
            this.f190027n.setVisibility(0);
            return;
        }
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setIntValues(this.R5, this.Q5);
        valueAnimator.addUpdateListener(new com.tencent.mm.pluginsdk.ui.chat.v4(this));
        valueAnimator.setDuration(150L);
        valueAnimator.addListener(new com.tencent.mm.pluginsdk.ui.chat.f0(this));
        valueAnimator.start();
    }

    public int t0(java.lang.String str, int i17) {
        com.tencent.mm.pluginsdk.ui.chat.x4 x4Var = this.f190041p1;
        if (x4Var.f190743e.containsKey(str) && ((java.util.LinkedList) x4Var.f190743e.get(str)).size() > 0) {
            i17 |= 1;
        }
        if (this.f190104z1) {
            i17 |= this.B1 ? 4 : 8;
        }
        if (this.A1) {
            return i17 | (this.B1 ? 16 : 32);
        }
        return i17;
    }

    public final void t1(int i17) {
        this.f189984f4.setVisibility(0);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f190044p4.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.addRule(21);
        layoutParams.addRule(12);
        if (this.T3) {
            this.f189984f4.setText(java.lang.String.format(getContext().getResources().getString(com.tencent.mm.R.string.f491309nk4), java.lang.Integer.valueOf(i17)));
        } else {
            this.f189984f4.setText(java.lang.String.format(getContext().getResources().getString(com.tencent.mm.R.string.h8s), java.lang.Integer.valueOf(this.D5)));
        }
        this.f190044p4.requestLayout();
    }

    public final void u(android.view.View view) {
        if (view == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            int i17 = layoutParams.width;
            if (i17 > 0) {
                layoutParams.width = java.lang.Math.round(com.tencent.mm.ui.gk.a(i17));
            }
            int i18 = layoutParams.height;
            if (i18 > 0) {
                layoutParams.height = java.lang.Math.round(com.tencent.mm.ui.gk.a(i18));
            }
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = java.lang.Math.round(com.tencent.mm.ui.gk.a(marginLayoutParams.leftMargin));
                marginLayoutParams.rightMargin = java.lang.Math.round(com.tencent.mm.ui.gk.a(marginLayoutParams.rightMargin));
                marginLayoutParams.topMargin = java.lang.Math.round(com.tencent.mm.ui.gk.a(marginLayoutParams.topMargin));
                marginLayoutParams.bottomMargin = java.lang.Math.round(com.tencent.mm.ui.gk.a(marginLayoutParams.bottomMargin));
            }
            view.setLayoutParams(layoutParams);
        }
        view.setPadding(java.lang.Math.round(com.tencent.mm.ui.gk.a(view.getPaddingLeft())), java.lang.Math.round(com.tencent.mm.ui.gk.a(view.getPaddingTop())), java.lang.Math.round(com.tencent.mm.ui.gk.a(view.getPaddingRight())), java.lang.Math.round(com.tencent.mm.ui.gk.a(view.getPaddingBottom())));
        if (view.getMinimumWidth() > 0) {
            view.setMinimumWidth(java.lang.Math.round(com.tencent.mm.ui.gk.a(view.getMinimumWidth())));
        }
        if (view.getMinimumHeight() > 0) {
            view.setMinimumHeight(java.lang.Math.round(com.tencent.mm.ui.gk.a(view.getMinimumHeight())));
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i19 = 0; i19 < viewGroup.getChildCount(); i19++) {
                u(viewGroup.getChildAt(i19));
            }
        }
    }

    public final int u0(int i17) {
        int round = java.lang.Math.round(com.tencent.mm.ui.gk.a(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479602ac)));
        int round2 = java.lang.Math.round(com.tencent.mm.ui.gk.a(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479738dv)));
        android.widget.TextView textView = (android.widget.TextView) this.f190021m.j();
        android.graphics.Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int round3 = java.lang.Math.round(fontMetricsInt.descent * (fontMetricsInt.descent - fontMetricsInt.ascent != 0 ? (textView.getTextSize() * 1.2f) / (fontMetricsInt.descent - fontMetricsInt.ascent) : 1.0f));
        return (java.lang.Math.max(round, (java.lang.Math.max(fontMetricsInt.bottom, round3) - java.lang.Math.min(fontMetricsInt.top, round3 - java.lang.Math.round(textView.getTextSize() * 1.2f))) + (round2 * 2)) - java.lang.Math.round(com.tencent.mm.ui.gk.a(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479714d7)))) / 2;
    }

    public void u1(boolean z17, boolean z18, java.lang.String str) {
        if (this.f190059s == null || this.f190053r == null) {
            return;
        }
        if (this.f190021m != null) {
            f1();
        }
        android.view.View findViewById = this.f190059s.findViewById(com.tencent.mm.R.id.qhk);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showDisableTips", "(ZZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showDisableTips", "(ZZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = this.f190059s.findViewById(com.tencent.mm.R.id.qhl);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showDisableTips", "(ZZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showDisableTips", "(ZZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z17) {
            android.view.View findViewById3 = this.f190059s.findViewById(com.tencent.mm.R.id.sqd);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showDisableTips", "(ZZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showDisableTips", "(ZZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById4 = this.f190059s.findViewById(com.tencent.mm.R.id.sqd);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showDisableTips", "(ZZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showDisableTips", "(ZZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z18) {
            android.view.View findViewById5 = this.f190059s.findViewById(com.tencent.mm.R.id.sqf);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showDisableTips", "(ZZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showDisableTips", "(ZZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById6 = this.f190059s.findViewById(com.tencent.mm.R.id.sqf);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showDisableTips", "(ZZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showDisableTips", "(ZZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        ((android.widget.TextView) this.f190059s.findViewById(com.tencent.mm.R.id.sqe)).setText(str);
    }

    public void v(android.view.View view) {
        com.tencent.mm.pluginsdk.ui.chat.k5 k5Var = this.f190090x0;
        if (k5Var != null) {
            k5Var.b(view);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f189993h.getVisibility());
        com.tencent.mm.pluginsdk.ui.chat.ChatFooterBottom chatFooterBottom = this.f190089x;
        int i17 = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "click attach btn: %s, %s", valueOf, java.lang.Boolean.valueOf(chatFooterBottom.f190121d || chatFooterBottom.getVisibility() != 0));
        if (this.f189970d2 == 3) {
            if (this.V1 == 1) {
                z1();
                return;
            } else {
                w0(true);
                return;
            }
        }
        E(3, true, (view == null || view.getTag() == null) ? -1 : ((java.lang.Integer) view.getTag()).intValue());
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f189987g;
        if (ibVar != null && ibVar.getVisibility() == 0 && this.Z1) {
            this.f189987g.setVisibility(8);
            this.Z1 = false;
            this.f189987g.n();
        }
        com.tencent.mm.pluginsdk.model.app.x5 c17 = com.tencent.mm.pluginsdk.model.app.x5.c();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        c17.getClass();
        if (gm0.j1.a() && context != null) {
            try {
                java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ShowAPPSuggestion");
                if (com.tencent.mm.sdk.platformtools.t8.K0(d17) || java.lang.Integer.valueOf(d17).intValue() != 1) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SuggestionAppListLogic", "cfgShowAppSuggestion %s, return", d17);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SuggestionAppListLogic", "exception in getSuggestionAppList, %s", e17.getMessage());
            }
            if (c17.f189143a) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SuggestionAppListLogic", "SuggestionApp is Loading");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.SuggestionAppListLogic", "getSuggestionAppList");
                c17.f189143a = true;
                if (java.lang.System.currentTimeMillis() - c17.f189147e < 43200000) {
                    c17.f189143a = false;
                } else {
                    gm0.j1.i();
                    c17.f189147e = gm0.j1.u().c().s(352275, 0L);
                    if (java.lang.System.currentTimeMillis() - c17.f189147e < 43200000) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.SuggestionAppListLogic", "not now sp");
                        c17.f189143a = false;
                    } else {
                        if (c17.f189145c == null) {
                            c17.f189145c = com.tencent.mm.sdk.platformtools.m2.o(context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), context);
                        }
                        com.tencent.mm.pluginsdk.model.app.z3 z3Var = new com.tencent.mm.pluginsdk.model.app.z3(3, 0, 20, c17.f189145c, new java.util.LinkedList());
                        zo3.p.Bi().getClass();
                        gm0.j1.n().f273288b.g(new com.tencent.mm.pluginsdk.model.app.v3(4, z3Var));
                    }
                }
            }
        }
        com.tencent.mm.pluginsdk.model.app.x5.c().d(com.tencent.mm.sdk.platformtools.x2.f193071a);
        ((j00.o1) ((c00.f3) i95.n0.c(c00.f3.class))).getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        n00.g gVar = n00.g.f333821a;
        java.lang.String valueOf2 = java.lang.String.valueOf(currentTimeMillis);
        gVar.getClass();
        kotlin.jvm.internal.o.g(valueOf2, "<set-?>");
        n00.g.f333824d.c(gVar, n00.g.f333822b[1], valueOf2);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftReportService", "gen chat_session_id: " + gVar.a());
        gVar.a();
        if (com.tencent.mm.storage.z3.N4(this.f190017l3)) {
            java.lang.String str = this.f190017l3;
            if (c01.e2.T(str)) {
                i17 = 2;
            } else if (c01.e2.V(str)) {
                i17 = 1;
            }
            com.tencent.mm.autogen.mmdata.rpt.ChatRoomToolPanelOperateLogStruct chatRoomToolPanelOperateLogStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatRoomToolPanelOperateLogStruct();
            chatRoomToolPanelOperateLogStruct.f55653d = chatRoomToolPanelOperateLogStruct.b("roomusrname", str, true);
            chatRoomToolPanelOperateLogStruct.f55654e = 1L;
            chatRoomToolPanelOperateLogStruct.f55657h = i17;
            chatRoomToolPanelOperateLogStruct.k();
        }
    }

    public void v0() {
        this.Y1 = true;
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f189981f;
        if (chatFooterPanel != null) {
            chatFooterPanel.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v1(boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.chat.ChatFooter.v1(boolean, boolean):void");
    }

    public void w(com.tencent.mm.pluginsdk.ui.chat.y4 y4Var) {
        this.f189955a3 = y4Var;
        z63.f1 f1Var = new z63.f1(getContext(), this.f189955a3.e(), new com.tencent.mm.pluginsdk.ui.chat.b2(this));
        this.f190040p0 = f1Var;
        f1Var.f470400u = this.O2;
        sb5.z zVar = (sb5.z) this.f189955a3.a().f460708c.a(sb5.z.class);
        ((com.tencent.mm.ui.chatting.adapter.k) zVar).f198429z1 = this.f190035o3;
        this.f190021m.getSizeAnimController().b(zVar);
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var2 = this.f189955a3;
        if (y4Var2 == null || y4Var2.a() == null) {
            return;
        }
        ((com.tencent.mm.ui.chatting.component.ho) ((sb5.o2) this.f189955a3.a().f460708c.a(sb5.o2.class))).q0().f361135k = zVar;
    }

    public void w0(boolean z17) {
        E(0, z17, -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0b72, code lost:
    
        if (r2 != 2) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w1(int r28) {
        /*
            Method dump skipped, instructions count: 3450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.chat.ChatFooter.w1(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.ui.tools.c5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w2(int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.chat.ChatFooter.w2(int, boolean):void");
    }

    public final void x(android.view.View btn, java.lang.String viewId) {
        com.tencent.mm.pluginsdk.ui.chat.f3 f3Var = new com.tencent.mm.pluginsdk.ui.chat.f3(this, viewId);
        kotlin.jvm.internal.o.g(btn, "btn");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Ai(btn, f3Var);
        aVar.ik(btn, 8, 35963);
        aVar.pk(btn, viewId);
    }

    public void x0(boolean z17, boolean z18) {
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f189981f;
        if (chatFooterPanel != null) {
            chatFooterPanel.e(z17, z18);
        }
    }

    public void x1() {
        this.V1 = 1;
        y1(true);
        B(this.f190021m.length() > 0);
        this.f190039p.setVisibility(8);
        Q1(com.tencent.mm.R.drawable.f481237o3);
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f189987g;
        if (ibVar != null) {
            ibVar.setVisibility(8);
            this.Z1 = false;
            this.f189987g.n();
        }
        E(2, true, -1);
    }

    public final void y() {
        int i17;
        int i18;
        int width = this.f189956a4.getWidth();
        int height = this.f189956a4.getHeight();
        int ordinal = this.f189968c6.ordinal();
        if (ordinal == 0) {
            i17 = this.C5;
            i18 = this.B5;
        } else if (ordinal == 1) {
            i18 = this.B5;
            i17 = this.f190069t5;
        } else if (ordinal != 2) {
            i18 = 0;
            i17 = 0;
        } else {
            i18 = this.f190095x5;
            i17 = this.f190063s5;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "beginWidth:%s, endWidth:%s, beginHeight:%s, endHeight:%s", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(i18));
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofInt(width, i17).setDuration(200L);
        duration.addUpdateListener(new com.tencent.mm.pluginsdk.ui.chat.j0(this));
        android.animation.ValueAnimator duration2 = android.animation.ValueAnimator.ofInt(height, i18).setDuration(200L);
        duration2.addUpdateListener(new com.tencent.mm.pluginsdk.ui.chat.k0(this));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(duration, duration2);
        animatorSet.start();
    }

    public void y0() {
        z63.f1 f1Var = this.f190040p0;
        if (f1Var != null) {
            f1Var.a();
        }
    }

    public final void y1(boolean z17) {
        if (z17) {
            this.G.setVisibility(0);
            this.D.setVisibility(0);
            v1(true, false);
        } else {
            this.G.setVisibility(8);
            this.D.setVisibility(8);
            this.D2.l(0);
            v1(true, false);
        }
    }

    public final void z() {
        float translationX = this.f189956a4.getTranslationX();
        int ordinal = this.f189968c6.ordinal();
        float f17 = 0.0f;
        if (ordinal != 0 && ordinal == 1) {
            f17 = -((com.tencent.mm.ui.bl.b(getContext()).x / 2) - com.tencent.mm.ui.zk.a(getContext(), 76));
        }
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(translationX, f17).setDuration(200L);
        duration.addUpdateListener(new com.tencent.mm.pluginsdk.ui.chat.l0(this));
        duration.start();
    }

    public final void z0() {
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f190050q4;
        if (chatFooterPanel == null) {
            return;
        }
        this.f190068t4 = false;
        chatFooterPanel.setVisibility(4);
        this.f190050q4.h();
    }

    public void z1() {
        com.tencent.mm.ui.MMFragment mMFragment = this.Y2;
        if (mMFragment != null && mMFragment.isSupportNavigationSwipeBack() && this.Y2.getSwipeBackLayout() != null) {
            this.Y2.getSwipeBackLayout().setOnceDisEnableGesture(true);
        }
        if (N0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "isScrolling!! pass this event!");
        } else {
            E(1, true, -1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ChatFooter(final android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        boolean z17;
        int i18;
        android.widget.ImageButton imageButton;
        this.f189975e = null;
        this.f190021m = null;
        this.f190027n = null;
        this.f190033o = null;
        this.f190065t = false;
        this.f190071u = false;
        this.f190077v = false;
        this.f190097y0 = null;
        this.f190015l1 = null;
        this.f190041p1 = new com.tencent.mm.pluginsdk.ui.chat.x4(null);
        this.f190091x1 = false;
        this.f190098y1 = false;
        this.f190104z1 = false;
        this.A1 = false;
        this.B1 = false;
        this.C1 = null;
        this.H1 = true;
        this.I1 = false;
        this.J1 = new java.util.LinkedList();
        this.K1 = (aa0.e) i95.n0.c(aa0.e.class);
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.f189954a2 = false;
        this.f189959b2 = true;
        this.f189964c2 = false;
        this.f189970d2 = 0;
        this.f189976e2 = -1;
        this.f190005j2 = 0;
        this.f190010k2 = false;
        this.f190016l2 = false;
        this.f190022m2 = false;
        this.f190028n2 = false;
        this.f190034o2 = false;
        this.f190042p2 = false;
        this.f190048q2 = false;
        this.f190054r2 = true;
        this.f190060s2 = false;
        this.f190066t2 = 0;
        this.f190072u2 = false;
        this.A2 = false;
        this.B2 = 0;
        this.C2 = false;
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        this.F2 = o13.n.l(73);
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        this.G2 = o13.n.l(73);
        this.H2 = null;
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.I2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OPPOFloatWindowModeChangedEvent>(a0Var) { // from class: com.tencent.mm.pluginsdk.ui.chat.ChatFooter.1
            {
                this.__eventId = -553854139;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OPPOFloatWindowModeChangedEvent oPPOFloatWindowModeChangedEvent) {
                com.tencent.mm.autogen.events.OPPOFloatWindowModeChangedEvent oPPOFloatWindowModeChangedEvent2 = oPPOFloatWindowModeChangedEvent;
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.this;
                boolean z18 = chatFooter.f190048q2;
                boolean z19 = oPPOFloatWindowModeChangedEvent2.f54555g.f6163a;
                if (z18 == z19) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "MultiWindowModeChanged: %b", java.lang.Boolean.valueOf(z19));
                chatFooter.f190048q2 = oPPOFloatWindowModeChangedEvent2.f54555g.f6163a;
                return false;
            }
        };
        this.J2 = null;
        this.K2 = new com.tencent.mm.pluginsdk.ui.chat.v1(this);
        this.L2 = null;
        this.M2 = null;
        this.N2 = new com.tencent.mm.pluginsdk.ui.chat.h2(this);
        this.O2 = new com.tencent.mm.pluginsdk.ui.chat.t2(this);
        this.P2 = new com.tencent.mm.autogen.mmdata.rpt.AndroidChatInputStruct();
        this.S2 = new com.tencent.mm.pluginsdk.ui.chat.q3(this);
        this.T2 = new com.tencent.mm.pluginsdk.ui.chat.a4(this);
        this.U2 = "";
        this.V2 = new com.tencent.mm.pluginsdk.ui.chat.l4(this);
        this.W2 = false;
        this.X2 = false;
        this.f189960b3 = false;
        this.f189983f3 = new android.view.animation.Animation[]{null};
        this.f189989g3 = new android.view.animation.Animation[]{null};
        this.f189995h3 = false;
        com.tencent.mm.pluginsdk.ui.chat.f1 f1Var = new com.tencent.mm.pluginsdk.ui.chat.f1(this);
        this.f190001i3 = f1Var;
        com.tencent.mm.pluginsdk.ui.chat.g1 g1Var = new com.tencent.mm.pluginsdk.ui.chat.g1(this);
        this.f190006j3 = g1Var;
        this.f190023m3 = false;
        this.f190029n3 = false;
        this.f190035o3 = new com.tencent.mm.pluginsdk.ui.chat.e2(this);
        this.f190043p3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_is_remove_send_msg_compact_code_and, 1) == 1;
        this.N3 = com.tencent.mm.plugin.transvoice.model.e.I;
        this.O3 = 0L;
        this.P3 = com.tencent.mm.pluginsdk.ui.chat.h5.MODE_INVALID;
        this.Q3 = com.tencent.mm.pluginsdk.ui.chat.i5.MODE_INVALID;
        this.R3 = false;
        this.S3 = true;
        this.T3 = false;
        this.U3 = false;
        this.V3 = false;
        this.W3 = 0.5f;
        this.f190068t4 = false;
        this.f190074u4 = false;
        this.f190080v4 = false;
        this.X4 = true;
        this.Y4 = false;
        this.Z4 = false;
        this.f189957a5 = false;
        this.f189973d5 = new com.tencent.mm.pluginsdk.ui.chat.o2(this);
        this.f189979e5 = new com.tencent.mm.pluginsdk.ui.chat.p2(this);
        this.f189985f5 = new com.tencent.mm.pluginsdk.ui.chat.q2(this);
        this.f189991g5 = new com.tencent.mm.pluginsdk.ui.chat.w2(this);
        this.f190003i5 = 0;
        this.f190008j5 = 1;
        this.f190013k5 = new com.tencent.mm.pluginsdk.ui.chat.x2(this);
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofInt(250, 1200).setDuration(200L);
        this.f190019l5 = duration;
        android.animation.ValueAnimator duration2 = android.animation.ValueAnimator.ofInt(40, 1200).setDuration(200L);
        this.f190025m5 = duration2;
        android.animation.ValueAnimator duration3 = android.animation.ValueAnimator.ofInt(72, 0).setDuration(200L);
        this.f190031n5 = duration3;
        android.animation.ValueAnimator duration4 = android.animation.ValueAnimator.ofInt(22, 0).setDuration(200L);
        this.f190037o5 = duration4;
        android.animation.ValueAnimator duration5 = android.animation.ValueAnimator.ofInt(8, 0).setDuration(200L);
        this.f190045p5 = duration5;
        com.tencent.mm.pluginsdk.ui.chat.v3 v3Var = new com.tencent.mm.pluginsdk.ui.chat.v3(this);
        this.f190051q5 = new int[]{com.tencent.mm.R.raw.count_down_0, com.tencent.mm.R.raw.count_down_1, com.tencent.mm.R.raw.count_down_2, com.tencent.mm.R.raw.count_down_3, com.tencent.mm.R.raw.count_down_4, com.tencent.mm.R.raw.count_down_5, com.tencent.mm.R.raw.count_down_6, com.tencent.mm.R.raw.count_down_7, com.tencent.mm.R.raw.count_down_8, com.tencent.mm.R.raw.count_down_9};
        this.f190057r5 = java.lang.Math.round(com.tencent.mm.ui.gk.a(getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.apu)));
        this.f190063s5 = com.tencent.mm.ui.bl.b(getContext()).x - java.lang.Math.round(com.tencent.mm.ui.gk.a(com.tencent.mm.ui.zk.a(getContext(), 32)));
        this.f190069t5 = java.lang.Math.round(com.tencent.mm.ui.gk.a(getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.apt)));
        this.f190075u5 = java.lang.Math.min(java.lang.Math.round(com.tencent.mm.ui.gk.a(com.tencent.mm.ui.zk.a(getContext(), com.tencent.mapsdk.internal.km.f50100e))), com.tencent.mm.ui.bl.b(getContext()).x - java.lang.Math.round(com.tencent.mm.ui.gk.a(com.tencent.mm.ui.zk.a(getContext(), 32))));
        this.f190081v5 = java.lang.Math.round(com.tencent.mm.ui.gk.a(com.tencent.mm.ui.zk.a(getContext(), 176)));
        this.f190087w5 = com.tencent.mm.ui.gk.a(com.tencent.mm.ui.zk.a(getContext(), 160)) / 50.0f;
        this.f190095x5 = java.lang.Math.round(com.tencent.mm.ui.gk.a(com.tencent.mm.ui.zk.a(getContext(), 94)));
        this.f190102y5 = 0;
        this.f190108z5 = 0;
        this.A5 = 0;
        this.B5 = 0;
        this.C5 = java.lang.Math.round(com.tencent.mm.ui.gk.a(com.tencent.mm.ui.zk.a(getContext(), 176)));
        this.D5 = 60;
        this.E5 = 0;
        this.F5 = false;
        this.G5 = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        this.H5 = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        this.I5 = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479674cb);
        this.J5 = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
        this.K5 = new com.tencent.mm.pluginsdk.ui.chat.o4(this);
        this.L5 = false;
        this.M5 = 0;
        this.N5 = false;
        this.O5 = false;
        this.P5 = 0;
        this.Q5 = com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479604ae);
        this.R5 = com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479714d7);
        this.S5 = com.tencent.mm.ui.zk.a(getContext(), 25);
        this.T5 = com.tencent.mm.ui.zk.a(getContext(), 55);
        com.tencent.mm.ui.zk.a(getContext(), 50);
        this.U5 = new com.tencent.mm.pluginsdk.ui.chat.g0(this);
        this.V5 = java.lang.Math.round(com.tencent.mm.ui.gk.a(com.tencent.mm.ui.zk.a(getContext(), 12)));
        this.W5 = com.tencent.mm.ui.zk.a(getContext(), 72);
        com.tencent.mm.ui.zk.a(getContext(), 25);
        this.X5 = android.animation.ValueAnimator.ofFloat(0.0f, 0.2f).setDuration(200L);
        this.Y5 = 0.65f;
        this.Z5 = 0.8f;
        this.f189958a6 = 0.45f;
        this.f189963b6 = 0.6f;
        com.tencent.mm.pluginsdk.ui.chat.b5 b5Var = com.tencent.mm.pluginsdk.ui.chat.b5.MODE_VOICE;
        this.f189968c6 = b5Var;
        this.f189974d6 = b5Var;
        this.f189980e6 = new java.util.HashMap();
        this.f189986f6 = new java.util.HashMap();
        new java.util.HashMap();
        this.f189998h6 = false;
        this.f190009j6 = "";
        this.f190014k6 = "";
        this.f190020l6 = "";
        this.f190026m6 = false;
        this.f190032n6 = "";
        this.f190052q6 = new b31.d();
        this.f190058r6 = new java.util.ArrayList();
        this.f190076u6 = false;
        this.f190082v6 = 1;
        this.f190088w6 = new com.tencent.mm.pluginsdk.ui.chat.ChatFooter.AnonymousClass122(a0Var);
        java.lang.System.currentTimeMillis();
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f447187e);
            this.f189960b3 = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }
        this.U1 = (android.view.inputmethod.InputMethodManager) context.getSystemService("input_method");
        this.f189975e = android.view.View.inflate(context, com.tencent.mm.R.layout.f488435t8, this);
        this.U3 = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigChatfooterFixBigFont()) == 1;
        this.f190034o2 = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigChatfooterLongPressSuppressMenu()) == 1;
        fl5.i iVar = (fl5.i) findViewById(com.tencent.mm.R.id.bkk);
        this.f190021m = iVar;
        jg5.c cVar = jg5.c.f299665a;
        android.view.View view = iVar.j();
        kotlin.jvm.internal.o.g(view, "view");
        cVar.b(view, 1);
        this.f190021m.d(((com.tencent.mm.plugin.websearch.w1) i95.n0.c(com.tencent.mm.plugin.websearch.w1.class)).cj());
        this.f190021m.setImeSendImageCallback(new com.tencent.mm.pluginsdk.ui.chat.h1(this));
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5((android.app.Activity) getContext());
        this.f189994h2 = f5Var;
        f5Var.f210400e = this;
        if (com.tencent.mm.ui.bk.w()) {
            this.f190021m.setImeOptions(268435456);
        }
        fl5.j g17 = fl5.j.g(this.f190021m);
        int P = gm0.j1.a() ? com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("InputLimitSessionTextMsg"), 8192) : 8192;
        g17.f42561f = 0;
        g17.f42560e = P * 2;
        g17.d(new com.tencent.mm.pluginsdk.ui.chat.i1(this));
        this.f190021m.getInputExtras(true).putBoolean("IS_CHAT_EDITOR", true);
        this.f190021m.b(((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).bj(), com.tencent.mm.sdk.platformtools.m2.f(context), new com.tencent.mm.pluginsdk.ui.chat.s1(this, context), new com.tencent.mm.pluginsdk.ui.chat.u1(this));
        this.f190021m.setKeyCodeEnterListener(new com.tencent.mm.pluginsdk.ui.chat.w1(this));
        this.f190021m.addTextChangedListener(new com.tencent.mm.pluginsdk.ui.chat.x1(this));
        hv4.l lVar = f189950x6;
        if (lVar != null) {
            lVar.dismiss();
            f189950x6 = null;
        }
        this.f190021m.getSizeAnimController().a(true);
        this.f190021m.addOnLayoutChangeListener(new com.tencent.mm.pluginsdk.ui.chat.y1(this));
        com.tencent.mm.pluginsdk.ui.chat.u9 seqAutoCompleteHelper = getSeqAutoCompleteHelper();
        fl5.i edt = this.f190021m;
        seqAutoCompleteHelper.getClass();
        kotlin.jvm.internal.o.g(edt, "edt");
        edt.setOnKeyListener(new com.tencent.mm.pluginsdk.ui.chat.t9(seqAutoCompleteHelper, edt));
        this.f190021m.setOnFocusChangeListener(new com.tencent.mm.pluginsdk.ui.chat.j1(this));
        if (android.os.Build.VERSION.SDK_INT == 28) {
            this.f190021m.setBreakStrategy(1);
        }
        this.G = (android.widget.RelativeLayout) this.f189975e.findViewById(com.tencent.mm.R.id.f487277o44);
        this.D = (com.tencent.mm.view.MaxHeightScrollView) this.f189975e.findViewById(com.tencent.mm.R.id.o4q);
        this.H = (android.widget.RelativeLayout) this.f189975e.findViewById(com.tencent.mm.R.id.srk);
        this.I = (android.widget.LinearLayout) this.f189975e.findViewById(com.tencent.mm.R.id.v_a);
        this.f189953J = (android.widget.FrameLayout) this.f189975e.findViewById(com.tencent.mm.R.id.b0i);
        this.K = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f189975e.findViewById(com.tencent.mm.R.id.b0j);
        S1();
        this.f190089x = (com.tencent.mm.pluginsdk.ui.chat.ChatFooterBottom) findViewById(com.tencent.mm.R.id.bkc);
        this.f190053r = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.bfp);
        this.f190059s = findViewById(com.tencent.mm.R.id.bl9);
        this.f190083w = findViewById(com.tencent.mm.R.id.blr);
        this.f190103z = (android.widget.ImageButton) this.f189975e.findViewById(com.tencent.mm.R.id.bjz);
        android.widget.ImageView imageView = (android.widget.ImageView) this.f189975e.findViewById(com.tencent.mm.R.id.f483641bk0);
        this.A = imageView;
        com.tencent.mm.pluginsdk.ui.chat.d0 d0Var = new com.tencent.mm.pluginsdk.ui.chat.d0(this.f190103z, imageView);
        this.B = d0Var;
        rn3.i.Di().k(d0Var.f190255c);
        this.f190027n = (android.widget.Button) this.f189975e.findViewById(com.tencent.mm.R.id.bql);
        this.L = (android.widget.LinearLayout) this.f189975e.findViewById(com.tencent.mm.R.id.jtw);
        this.M = this.f189975e.findViewById(com.tencent.mm.R.id.srt);
        this.N = this.f189975e.findViewById(com.tencent.mm.R.id.u4t);
        this.P = (android.widget.TextView) this.f189975e.findViewById(com.tencent.mm.R.id.jtu);
        this.S = (android.widget.FrameLayout) this.f189975e.findViewById(com.tencent.mm.R.id.jts);
        this.Q = (android.widget.ImageView) this.f189975e.findViewById(com.tencent.mm.R.id.jtt);
        this.R = (android.widget.ImageView) this.f189975e.findViewById(com.tencent.mm.R.id.jtx);
        this.T = (android.widget.FrameLayout) this.f189975e.findViewById(com.tencent.mm.R.id.f485999ui3);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) this.f189975e.findViewById(com.tencent.mm.R.id.jtv)).setEnableHighlight(true);
        this.U = this.f189975e.findViewById(com.tencent.mm.R.id.uw_);
        this.D1 = (android.widget.ImageView) this.f189975e.findViewById(com.tencent.mm.R.id.l5t);
        this.E1 = (android.widget.ImageView) this.f189975e.findViewById(com.tencent.mm.R.id.s0y);
        this.F1 = (android.view.ViewGroup) this.f189975e.findViewById(com.tencent.mm.R.id.s0z);
        this.G1 = (android.view.ViewGroup) this.f189975e.findViewById(com.tencent.mm.R.id.c7y);
        this.f190027n.setTextSize(0, i65.a.f(context, com.tencent.mm.R.dimen.f479919iy) * i65.a.m(context));
        android.widget.Button button = (android.widget.Button) this.f189975e.findViewById(com.tencent.mm.R.id.p6x);
        this.f190039p = button;
        if (this.U3) {
            z17 = false;
            button.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479897ia) * i65.a.q(getContext()));
        } else {
            z17 = false;
        }
        com.tencent.mm.ui.dl.i(this.f190039p.getPaint());
        this.f190047q = (com.tencent.mm.ui.widget.imageview.WeImageButton) findViewById(com.tencent.mm.R.id.bpe);
        this.f189995h3 = z17;
        if (this.f189971d3 == null) {
            this.f189971d3 = ((ku5.t0) ku5.t0.f312615d).i(f1Var);
        }
        if (this.f189977e3 == null) {
            this.f189977e3 = ((ku5.t0) ku5.t0.f312615d).i(g1Var);
        }
        if (this.f190027n != null && (imageButton = this.f190103z) != null) {
            if (!this.W2 && !this.X2) {
                if (imageButton.getVisibility() == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "initButtonStatus ! AttachButton is visible");
                } else {
                    if (!this.f190098y1 && !this.f189954a2) {
                        this.f190103z.setVisibility(0);
                        r1(true);
                    }
                    this.f190027n.setVisibility(8);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "tomys initButtonStatus");
                    this.f190027n.getParent().requestLayout();
                }
            } else if (imageButton.getVisibility() != 0) {
                this.f190103z.setVisibility(0);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "initButtonStatus, return sendBtn == null || mAttachButton == null");
        }
        L1();
        com.tencent.mm.pluginsdk.ui.chat.n9 n9Var = new com.tencent.mm.pluginsdk.ui.chat.n9(getContext(), getRootView(), this, new com.tencent.mm.pluginsdk.ui.chat.k1(this, context));
        this.V = n9Var;
        n9Var.f190523l = this;
        com.tencent.mm.feature.emoji.api.x6 x6Var = (com.tencent.mm.feature.emoji.api.x6) i95.n0.c(com.tencent.mm.feature.emoji.api.x6.class);
        android.content.Context context2 = getContext();
        android.view.View rootView = getRootView();
        android.view.View j17 = this.f190021m.j();
        ((com.tencent.mm.feature.emoji.cb) x6Var).getClass();
        com.tencent.mm.pluginsdk.ui.chat.ra raVar = new com.tencent.mm.pluginsdk.ui.chat.ra(context2, rootView, this, j17);
        this.W = raVar;
        raVar.f190617h = this.S2;
        raVar.f190633x = com.tencent.mm.pluginsdk.ui.chat.d8.kChat;
        raVar.f190628s = new com.tencent.mm.pluginsdk.ui.chat.f8() { // from class: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$a
            @Override // com.tencent.mm.pluginsdk.ui.chat.f8
            public final void a(java.lang.String str) {
                final com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.this;
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = chatFooter.f189981f;
                int i19 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
                chatFooterPanel.q(context, 5, new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i
                    @Override // java.lang.Runnable
                    public final void run() {
                        hv4.l lVar2 = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.f189950x6;
                        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter2 = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.this;
                        chatFooter2.getClass();
                        com.tencent.mars.xlog.Log.w("MicroMsg.ChatFooter", "search panel dismissed");
                        chatFooter2.f190010k2 = false;
                        chatFooter2.U0(true);
                        chatFooter2.z1();
                        chatFooter2.D();
                    }
                });
            }
        };
        this.f190021m.getImeOptions();
        this.f190021m.c(new com.tencent.mm.pluginsdk.ui.chat.l1(this));
        this.f190021m.a(new com.tencent.mm.pluginsdk.ui.chat.m1(this));
        this.f190021m.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.chat.n1(this));
        this.f190021m.setOnLongClickListener(new com.tencent.mm.pluginsdk.ui.chat.o1(this));
        x(this.f190027n, "chat_send_btn");
        this.f190027n.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.p1(this));
        O1();
        this.W3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_voice2txt_operation_area_adjust, 0.5f);
        this.T3 = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoice60minAutoSend()) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "isNewTrans2Txt:%s, transOperationAreaFactor:%s", java.lang.Boolean.valueOf(this.S3), java.lang.Float.valueOf(this.W3));
        this.K3 = new com.tencent.mm.plugin.transvoice.model.a();
        this.V3 = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigTransAndRead()) == 1;
        int i19 = com.tencent.mm.ui.bh.a(context).f197135a;
        this.f190039p.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.chat.k2(this, context));
        duration.addUpdateListener(v3Var);
        duration2.addUpdateListener(v3Var);
        duration3.addUpdateListener(v3Var);
        duration4.addUpdateListener(v3Var);
        duration5.addUpdateListener(v3Var);
        int i27 = i19 / 2;
        com.tencent.mm.plugin.transvoice.ui.v0 v0Var = new com.tencent.mm.plugin.transvoice.ui.v0(context);
        this.J3 = v0Var;
        v0Var.f175498y0 = new com.tencent.mm.pluginsdk.ui.chat.m2(this);
        int f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479648bn);
        p0(this.f190047q, f17, f17);
        x(this.f190047q, "chat_left_side_audio_btn");
        this.f190047q.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.j2(this));
        G0();
        this.f190103z.setVisibility(0);
        x(this.f190103z, "chat_plus_btn");
        this.f190103z.setContentDescription(getContext().getString(com.tencent.mm.R.string.axe));
        int f18 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479646bl);
        int f19 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479738dv);
        if (this.U3) {
            f18 = java.lang.Math.round(com.tencent.mm.ui.gk.a(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479646bl)));
            f19 = java.lang.Math.round(com.tencent.mm.ui.gk.a(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479738dv)));
        }
        p0(this.f190103z, f18, f19);
        this.f190103z.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.f2(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "[init] removeCompactCode:%s", java.lang.Boolean.valueOf(this.f190043p3));
        this.f190059s.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.chat.q1(this));
        int i28 = ((android.app.Activity) context).getWindow().getAttributes().softInputMode & 240;
        this.f190000i2 = i28;
        if (i28 != 16 && i28 != 48) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1062, 8);
            if (this.f190000i2 != 16) {
                this.f190000i2 = 48;
            }
        }
        this.f190092x2 = com.tencent.mm.sdk.platformtools.d2.g(context);
        X0(getKeyBordHeightPX());
        if (fp.h.c(24)) {
            this.f190042p2 = getIsMultiWindow();
        }
        H0();
        this.T.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$b
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                hv4.l lVar2 = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.f189950x6;
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.this;
                chatFooter.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view2);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", chatFooter, array);
                chatFooter.v1(false, true);
                yj0.a.h(chatFooter, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.L.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$c
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                hv4.l lVar2 = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.f189950x6;
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.this;
                chatFooter.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view2);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", chatFooter, array);
                try {
                    if (chatFooter.L.getTag() != null && (chatFooter.L.getTag() instanceof com.tencent.mm.storage.ca)) {
                        com.tencent.mm.storage.f9 f9Var = ((com.tencent.mm.storage.ca) chatFooter.L.getTag()).f193822a;
                        long msgId = f9Var.getMsgId();
                        java.lang.String Q0 = f9Var.Q0();
                        com.tencent.mm.plugin.msgquote.model.MsgQuoteItem b17 = lf5.g.b((com.tencent.mm.storage.ca) chatFooter.L.getTag());
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "foot quote on click msgId:%s,current isKeyboardShow:%b,panelType is %s", java.lang.Long.valueOf(msgId), java.lang.Boolean.valueOf(chatFooter.f190010k2), java.lang.Integer.valueOf(chatFooter.f189970d2));
                        chatFooter.setNeedShowVKBWhenResume(chatFooter.f190010k2 || chatFooter.f189970d2 == 1);
                        com.tencent.mm.ui.chatting.viewitems.dc.c(chatFooter.f189955a3.a(), null, chatFooter.Q.getVisibility() == 0 ? chatFooter.Q : view2, msgId, Q0, b17, new com.tencent.mm.ui.chatting.viewitems.cc(), new com.tencent.mm.ui.chatting.viewitems.qq(null, c01.z1.r()));
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "foot quote click Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
                }
                yj0.a.h(chatFooter, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (this.f189960b3) {
            this.D2 = new com.tencent.mm.pluginsdk.ui.chat.s5(this, this.f190021m);
        } else {
            this.D2 = new com.tencent.mm.pluginsdk.ui.chat.c8(this, this.f190021m);
        }
        if (this.U3) {
            R1();
            int f27 = j65.c.f(i65.a.n(getContext()));
            int u07 = u0(f27);
            int a17 = com.tencent.mm.ui.zk.a(getContext(), 8);
            int a18 = com.tencent.mm.ui.zk.a(getContext(), 8);
            int a19 = com.tencent.mm.ui.zk.a(getContext(), 8);
            switch (f27) {
                case 0:
                    a17 = com.tencent.mm.ui.zk.a(getContext(), 6);
                    a18 = com.tencent.mm.ui.zk.a(getContext(), 6);
                    a19 = com.tencent.mm.ui.zk.a(getContext(), 6);
                    i18 = 0;
                    break;
                case 1:
                    i18 = com.tencent.mm.ui.zk.a(getContext(), 4);
                    break;
                case 2:
                    i18 = com.tencent.mm.ui.zk.a(getContext(), 2);
                    break;
                case 3:
                    a17 = com.tencent.mm.ui.zk.a(getContext(), 6);
                    i18 = 0;
                    break;
                case 4:
                    a17 = com.tencent.mm.ui.zk.a(getContext(), 6);
                    i18 = com.tencent.mm.ui.zk.a(getContext(), 4);
                    break;
                case 5:
                    i18 = com.tencent.mm.ui.zk.a(getContext(), 4);
                    break;
                case 6:
                    i18 = com.tencent.mm.ui.zk.a(getContext(), 4);
                    break;
                case 7:
                    a17 = com.tencent.mm.ui.zk.a(getContext(), 6);
                    a18 = com.tencent.mm.ui.zk.a(getContext(), 6);
                    i18 = 0;
                    break;
                default:
                    i18 = 0;
                    break;
            }
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f190047q.getLayoutParams();
            layoutParams.width = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams.width));
            layoutParams.height = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams.height));
            layoutParams.leftMargin = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams.leftMargin));
            if (f27 > 1) {
                layoutParams.bottomMargin = u07;
            }
            this.f190047q.setLayoutParams(layoutParams);
            android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ntc);
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) imageView2.getLayoutParams();
            layoutParams2.width = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams2.width));
            layoutParams2.height = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams2.height));
            layoutParams2.leftMargin = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams2.leftMargin));
            layoutParams2.rightMargin = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams2.rightMargin));
            if (f27 > 1) {
                layoutParams2.bottomMargin = u07;
            }
            imageView2.setLayoutParams(layoutParams2);
            android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.d0v);
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) imageView3.getLayoutParams();
            layoutParams3.width = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams3.width));
            layoutParams3.height = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams3.height));
            if (f27 > 1) {
                layoutParams3.bottomMargin = u07;
            }
            imageView3.setLayoutParams(layoutParams3);
            android.widget.ImageView imageView4 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.kj7);
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) imageView4.getLayoutParams();
            layoutParams4.width = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams4.width));
            layoutParams4.height = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams4.height));
            layoutParams4.leftMargin = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams4.leftMargin));
            layoutParams4.rightMargin = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams4.rightMargin));
            if (f27 > 1) {
                layoutParams4.bottomMargin = u07;
            }
            imageView4.setLayoutParams(layoutParams4);
            android.widget.LinearLayout.LayoutParams layoutParams5 = (android.widget.LinearLayout.LayoutParams) this.G.getLayoutParams();
            layoutParams5.leftMargin = java.lang.Math.round(com.tencent.mm.ui.gk.a(a17));
            layoutParams5.rightMargin = java.lang.Math.round(com.tencent.mm.ui.gk.a(a18));
            this.G.setLayoutParams(layoutParams5);
            this.H.setPadding(java.lang.Math.round(com.tencent.mm.ui.gk.a(a19)), 0, java.lang.Math.round(com.tencent.mm.ui.gk.a(this.H.getPaddingRight())), 0);
            if (f27 > 1) {
                android.widget.LinearLayout.LayoutParams layoutParams6 = (android.widget.LinearLayout.LayoutParams) this.H.getLayoutParams();
                layoutParams6.bottomMargin = u07 - com.tencent.mm.ui.zk.a(getContext(), 4);
                this.H.setLayoutParams(layoutParams6);
            }
            android.widget.RelativeLayout.LayoutParams layoutParams7 = (android.widget.RelativeLayout.LayoutParams) this.f190103z.getLayoutParams();
            layoutParams7.width = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams7.width));
            layoutParams7.height = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams7.height));
            this.f190103z.setLayoutParams(layoutParams7);
            this.f190027n.setTextSize(0, com.tencent.mm.ui.gk.a(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479919iy)));
            android.widget.RelativeLayout.LayoutParams layoutParams8 = (android.widget.RelativeLayout.LayoutParams) this.f190027n.getLayoutParams();
            layoutParams8.height = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams8.height));
            layoutParams8.rightMargin = java.lang.Math.round(com.tencent.mm.ui.gk.a(i18));
            this.f190027n.setMinWidth(java.lang.Math.round(com.tencent.mm.ui.gk.a(r5.getMinWidth())));
            this.f190027n.setLayoutParams(layoutParams8);
            this.f190021m.setMinHeight(java.lang.Math.round(com.tencent.mm.ui.gk.a(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479602ac))));
            int round = java.lang.Math.round(com.tencent.mm.ui.gk.a(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479738dv)));
            this.f190021m.setPadding(round, round, round, round);
            this.f190039p.setPadding(round, round, round, round);
            if (f27 > 4) {
                android.widget.FrameLayout.LayoutParams layoutParams9 = (android.widget.FrameLayout.LayoutParams) this.I.getLayoutParams();
                layoutParams9.bottomMargin = u07 - (com.tencent.mm.ui.zk.a(getContext(), 5) / 2);
                this.I.setLayoutParams(layoutParams9);
            }
            android.widget.RelativeLayout.LayoutParams layoutParams10 = (android.widget.RelativeLayout.LayoutParams) this.f189953J.getLayoutParams();
            layoutParams10.width = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams10.width));
            layoutParams10.height = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams10.height));
            layoutParams10.topMargin = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams10.topMargin));
            layoutParams10.leftMargin = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams10.leftMargin));
            this.f189953J.setLayoutParams(layoutParams10);
            android.view.ViewGroup.LayoutParams layoutParams11 = this.K.getLayoutParams();
            layoutParams11.width = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams11.width));
            layoutParams11.height = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams11.height));
            this.K.setLayoutParams(layoutParams11);
        } else {
            int round2 = java.lang.Math.round(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479738dv));
            this.f190021m.setPadding(round2, round2, round2, round2);
        }
        java.lang.System.currentTimeMillis();
    }
}
