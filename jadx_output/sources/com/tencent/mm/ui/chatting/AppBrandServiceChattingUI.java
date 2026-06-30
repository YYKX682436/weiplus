package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class AppBrandServiceChattingUI extends com.tencent.mm.ui.chatting.ChattingUI {
    @Override // com.tencent.mm.ui.chatting.ChattingUI
    public com.tencent.mm.ui.chatting.ChattingUIFragment c7() {
        return new com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI(true);
    }

    @Override // com.tencent.mm.ui.chatting.ChattingUI, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (getIntent().getBooleanExtra("enableAnimation", false)) {
            initNavigationSwipeBack();
        } else {
            overridePendingTransition(0, 0);
        }
        super.onCreate(null);
    }

    /* loaded from: classes9.dex */
    public static class AppBrandServiceChattingFmUI extends com.tencent.mm.ui.chatting.ChattingUIFragment {
        public int N;
        public com.tencent.mm.plugin.appbrand.config.WxaExposedParams P;
        public java.lang.String Q;
        public java.lang.String R;
        public java.lang.String S;
        public java.lang.String T;
        public java.lang.String U;
        public byte[] V;
        public java.lang.String W;
        public boolean X;
        public boolean Y;
        public int Z;

        /* renamed from: l1, reason: collision with root package name */
        public final com.tencent.mm.pluginsdk.ui.chat.e5 f198141l1;

        /* renamed from: p0, reason: collision with root package name */
        public java.lang.String f198142p0;

        /* renamed from: p1, reason: collision with root package name */
        public final com.tencent.mm.pluginsdk.ui.span.z f198143p1;

        /* renamed from: x0, reason: collision with root package name */
        public java.lang.String f198144x0;

        /* renamed from: x1, reason: collision with root package name */
        public ab5.i0 f198145x1;

        /* renamed from: y0, reason: collision with root package name */
        public k91.l5 f198146y0;

        /* renamed from: y1, reason: collision with root package name */
        public final com.tencent.mm.ui.chatting.component.appbrand.g f198147y1;

        public AppBrandServiceChattingFmUI() {
            this.f198141l1 = new com.tencent.mm.ui.chatting.k0(this);
            this.f198143p1 = new com.tencent.mm.ui.chatting.l0(this);
            this.f198147y1 = new com.tencent.mm.ui.chatting.component.appbrand.g(new com.tencent.mm.ui.chatting.component.appbrand.f());
        }

        public static void n1(com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI appBrandServiceChattingFmUI, java.lang.String str) {
            appBrandServiceChattingFmUI.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("keyOutPagePath", str);
            appBrandServiceChattingFmUI.thisActivity().setResult(-1, intent);
            appBrandServiceChattingFmUI.finish();
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
        @Override // com.tencent.mm.ui.chatting.ChattingUIFragment, com.tencent.mm.ui.chatting.BaseChattingUIFragment
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void L0() {
            /*
                Method dump skipped, instructions count: 373
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.L0():void");
        }

        @Override // com.tencent.mm.ui.chatting.ChattingUIFragment, com.tencent.mm.ui.chatting.BaseChattingUIFragment
        public void U0() {
            int i17 = this.N;
            yb5.d dVar = this.f198152f;
            if (i17 == 2 || i17 == 3) {
                com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p("appbrandcustomerservicemsg");
                if (p17 == null || com.tencent.mm.sdk.platformtools.t8.K0(p17.h1())) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceChattingUI", "update Unread: can not find SPUSER_APP_BRAND_SERVICE cvs");
                } else {
                    int d17 = p17.d1();
                    com.tencent.mm.autogen.events.AppBrandGetServiceUnreadCountEvent appBrandGetServiceUnreadCountEvent = new com.tencent.mm.autogen.events.AppBrandGetServiceUnreadCountEvent();
                    appBrandGetServiceUnreadCountEvent.f53978g.f7755a = dVar.x();
                    appBrandGetServiceUnreadCountEvent.e();
                    int i18 = appBrandGetServiceUnreadCountEvent.f53979h.f7855a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceChattingUI", "parUnReadCount:%d, unReadCount:%d", java.lang.Integer.valueOf(d17), java.lang.Integer.valueOf(i18));
                    p17.Y1(java.lang.Math.max(0, d17 - i18));
                    if (((com.tencent.mm.storage.m4) c01.d9.b().r()).Y(p17, p17.h1(), true, true) == -1) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceChattingUI", "update SPUSER_APP_BRAND_SERVICE cvs unread failed");
                    } else {
                        com.tencent.mm.autogen.events.AppBrandSetServiceUnreadCountEvent appBrandSetServiceUnreadCountEvent = new com.tencent.mm.autogen.events.AppBrandSetServiceUnreadCountEvent();
                        appBrandSetServiceUnreadCountEvent.f53985g.f8412a = dVar.x();
                        appBrandSetServiceUnreadCountEvent.e();
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceChattingUI", "writeOpLogAndMarkRead clear AppBrandKvData username:%s", dVar.x());
                com.tencent.mm.autogen.events.AppBrandSetServiceUnreadCountEvent appBrandSetServiceUnreadCountEvent2 = new com.tencent.mm.autogen.events.AppBrandSetServiceUnreadCountEvent();
                appBrandSetServiceUnreadCountEvent2.f53985g.f8412a = dVar.x();
                appBrandSetServiceUnreadCountEvent2.e();
            }
            super.U0();
        }

        @Override // com.tencent.mm.ui.chatting.ChattingUIFragment
        public void e1() {
            super.e1();
            com.tencent.mm.autogen.events.LocationServerEvent locationServerEvent = new com.tencent.mm.autogen.events.LocationServerEvent();
            am.ej ejVar = locationServerEvent.f54481g;
            ejVar.f6559a = 0;
            ejVar.f6560b = com.tencent.mm.sdk.platformtools.m2.d();
            com.tencent.mm.storage.z3.R4(this.f198152f.x());
            locationServerEvent.e();
        }

        public final float o1(int i17) {
            return android.util.TypedValue.applyDimension(1, i17, getContext().getResources().getDisplayMetrics());
        }

        @Override // com.tencent.mm.ui.MMFragment, android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            super.onViewAttachedToWindow(view);
            int i17 = this.N;
            if ((i17 == 2 || i17 == 3 || i17 == 4) && this.X) {
                if (this.f198145x1 == null) {
                    com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198152f.f460708c.a(sb5.s0.class))).f199263e;
                    ab5.i0 i0Var = new ab5.i0(getActivity(), chatFooter, chatFooter);
                    this.f198145x1 = i0Var;
                    i0Var.f2960p = false;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.W)) {
                    l01.d0.f314761a.n(this.f198145x1, this.U, null, ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Bi((int) o1(75), (int) o1(60)));
                } else {
                    l01.d0.f314761a.n(this.f198145x1, "file://" + this.W, null, ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Bi((int) o1(75), (int) o1(60)));
                }
                ab5.i0 i0Var2 = this.f198145x1;
                i0Var2.f2961q = new com.tencent.mm.ui.chatting.n0(this);
                gm0.j1.e().j(new ab5.g0(i0Var2));
            }
        }

        public final java.lang.String p1() {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.Q)) {
                k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(this.f198152f.x());
                this.Q = Bi == null ? null : Bi.field_appId;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.Q)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceChattingUI", "error, appId is null");
            }
            return this.Q;
        }

        @Override // com.tencent.mm.ui.chatting.ChattingUIFragment, com.tencent.mm.ui.chatting.BaseChattingUIFragment
        public void s0() {
            byte[] bArr;
            yb5.d dVar = this.f198152f;
            if (!dVar.f460708c.f201962a.containsKey(sb5.a.class)) {
                dVar.z(sb5.a.class, this.f198147y1);
            }
            super.s0();
            this.N = getIntExtra("app_brand_chatting_from_scene", 1);
            this.P = (com.tencent.mm.plugin.appbrand.config.WxaExposedParams) getParcelableExtra("app_brand_chatting_expose_params");
            java.lang.String stringExtra = getStringExtra("key_scene_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.R = stringExtra;
            this.S = getStringExtra("sendMessageTitle");
            this.T = getStringExtra("sendMessagePath");
            this.U = getStringExtra("sendMessageImg");
            try {
                android.graphics.Bitmap m17 = com.tencent.mm.sdk.platformtools.x.m(1, 1, android.graphics.Bitmap.Config.ARGB_8888, false);
                new android.graphics.Canvas(m17).drawColor(-1);
                bArr = com.tencent.mm.sdk.platformtools.x.a(m17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceChattingUI", "obtainMessageDefaultImg fail:%s", e17);
                bArr = new byte[0];
            }
            this.V = bArr;
            this.W = getStringExtra("sendMessageLocalImg");
            this.X = getBooleanExtra("showMessageCard", false).booleanValue();
            this.Y = getBooleanExtra("needDelThumb", false).booleanValue();
            this.Z = getIntExtra("app_brand_chatting_from_scene_new", 3);
            this.f198142p0 = getStringExtra("app_brand_chatting_from_scene_note_new");
            this.f198144x0 = getStringExtra("app_brand_chatting_from_app_id");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceChattingUI", "AppBrandServiceChattingFmUI onCreate fromScene:%d", java.lang.Integer.valueOf(this.N));
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceChattingUI", "AppBrandServiceChattingFmUI onCreate wxaExposedParams:%s", this.P);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceChattingUI", "mSceneId:%s, sendMessageTitle:%s, sendMessagePath:%s, sendMessageImg:%s, showMessageCard:%b, needDelThumb:%b", this.R, this.S, this.T, this.U, java.lang.Boolean.valueOf(this.X), java.lang.Boolean.valueOf(this.Y));
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceChattingUI", "AppBrandServiceChattingFmUI onCreate newScene: %d, newSceneNote: %s, fromAppId: %s", java.lang.Integer.valueOf(this.Z), this.f198142p0, this.f198144x0);
        }

        @Override // com.tencent.mm.ui.chatting.ChattingUIFragment, com.tencent.mm.ui.chatting.BaseChattingUIFragment
        public void w0() {
            super.w0();
            ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).Ni(this.f198143p1);
        }

        @Override // com.tencent.mm.ui.chatting.ChattingUIFragment, com.tencent.mm.ui.chatting.BaseChattingUIFragment
        public void x0() {
            super.x0();
            ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).wi(this.f198143p1);
        }

        public AppBrandServiceChattingFmUI(boolean z17) {
            super(z17);
            this.f198141l1 = new com.tencent.mm.ui.chatting.k0(this);
            this.f198143p1 = new com.tencent.mm.ui.chatting.l0(this);
            this.f198147y1 = new com.tencent.mm.ui.chatting.component.appbrand.g(new com.tencent.mm.ui.chatting.component.appbrand.f());
        }
    }
}
