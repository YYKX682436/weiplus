package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class a4 extends android.widget.RelativeLayout {

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.Boolean f206579n = java.lang.Boolean.TRUE;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f206580d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f206581e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f206582f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f206583g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f206584h;

    /* renamed from: i, reason: collision with root package name */
    public final l75.q0 f206585i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f206586m;

    public a4(android.content.Context context) {
        super(context);
        this.f206580d = null;
        this.f206581e = null;
        this.f206582f = null;
        this.f206583g = true;
        this.f206584h = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.ui.contact.u3(this), true);
        com.tencent.mm.ui.contact.v3 v3Var = new com.tencent.mm.ui.contact.v3(this);
        this.f206585i = v3Var;
        this.f206586m = false;
        this.f206580d = context;
        r21.w.wi().add(v3Var);
        c();
        a();
    }

    public final void a() {
        java.lang.String string;
        android.graphics.Bitmap bitmap;
        com.tencent.mm.storage.o7 wi6 = r21.w.wi();
        wi6.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = wi6.f195203d.f("select * from fmessage_conversation  where isNew = 1 ORDER BY lastModifiedTime DESC limit 4", null, 2);
        while (f17.moveToNext()) {
            com.tencent.mm.storage.m7 m7Var = new com.tencent.mm.storage.m7();
            m7Var.convertFrom(f17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(m7Var.field_talker)) {
                arrayList.add(m7Var);
            }
        }
        f17.close();
        int size = arrayList.size();
        removeAllViews();
        android.content.Context context = this.f206580d;
        if (size <= 0) {
            if (context == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FMessageContactView", "initNoNew failed. context is null.");
            } else {
                android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.baw, this);
                this.f206581e = inflate;
                android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.g_9);
                this.f206582f = findViewById;
                android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.height = (int) (i65.a.f(context, com.tencent.mm.R.dimen.f479613ao) * i65.a.A(context));
                this.f206582f.setLayoutParams(layoutParams);
                tf5.m.O6(this.f206581e, 1);
                this.f206581e.setOnClickListener(new com.tencent.mm.ui.contact.x3(this));
                com.tencent.mm.ui.base.MaskLayout maskLayout = (com.tencent.mm.ui.base.MaskLayout) this.f206581e.findViewById(com.tencent.mm.R.id.g9q);
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.d1.Ai().getClass();
                java.util.Map map = com.tencent.mm.modelavatar.z.f70576c;
                int intValue = ((java.util.concurrent.ConcurrentHashMap) map).containsKey("fmessage") ? ((java.lang.Integer) ((com.tencent.mm.modelavatar.y) map).get("fmessage")).intValue() : 0;
                if (intValue != 0) {
                    com.tencent.mm.modelavatar.d1.Bi().getClass();
                    bitmap = bp.b.decodeResource(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), intValue, null);
                } else {
                    bitmap = null;
                }
                ((android.widget.ImageView) maskLayout.getContentView()).setImageBitmap(com.tencent.mm.sdk.platformtools.x.t0(bitmap, true, 1.0f, true, null));
            }
        } else if (size == 1) {
            com.tencent.mm.storage.m7 m7Var2 = (com.tencent.mm.storage.m7) arrayList.get(0);
            if (context == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FMessageContactView", "initSingleNew failed. context is null.");
            } else {
                if (i65.a.D(context)) {
                    this.f206581e = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.baz, this);
                } else {
                    this.f206581e = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.bay, this);
                }
                android.widget.TextView textView = (android.widget.TextView) this.f206581e.findViewById(com.tencent.mm.R.id.g_d);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str = m7Var2.field_displayName;
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
                android.widget.TextView textView2 = (android.widget.TextView) this.f206581e.findViewById(com.tencent.mm.R.id.g_c);
                com.tencent.mm.storage.p7 W0 = r21.w.Ai().W0(m7Var2.field_talker);
                int i17 = W0.field_type;
                java.lang.String str2 = W0.field_msgContent;
                boolean z17 = !W0.u0();
                if (i17 == 0) {
                    if (str2 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FMessageProvider", "setDigest fail, fmsgContent is null");
                        str2 = null;
                    } else {
                        com.tencent.mm.storage.y8 i18 = com.tencent.mm.storage.y8.i(str2);
                        int i19 = i18.f196364g;
                        if (i19 == 4) {
                            string = context.getString(com.tencent.mm.R.string.b1s);
                        } else if (i19 == 10 || i19 == 11) {
                            com.tencent.mm.autogen.events.FMsgGetNameEvent fMsgGetNameEvent = new com.tencent.mm.autogen.events.FMsgGetNameEvent();
                            java.lang.String str3 = i18.f196365h;
                            am.l9 l9Var = fMsgGetNameEvent.f54229g;
                            l9Var.f7230a = str3;
                            l9Var.f7231b = i18.f196366i;
                            fMsgGetNameEvent.e();
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            java.lang.String str4 = fMsgGetNameEvent.f54230h.f7330a;
                            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            if (str4 == null) {
                                str4 = "";
                            }
                            objArr[0] = str4;
                            string = context.getString(com.tencent.mm.R.string.b1v, objArr);
                        } else if (i19 == 31) {
                            string = context.getString(com.tencent.mm.R.string.f490858b24);
                        } else if (i19 != 32) {
                            switch (i19) {
                                case 58:
                                case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
                                case 60:
                                    string = context.getString(com.tencent.mm.R.string.b1t);
                                    break;
                                default:
                                    string = context.getString(com.tencent.mm.R.string.b1x);
                                    break;
                            }
                        } else {
                            string = context.getString(com.tencent.mm.R.string.b1y);
                        }
                        str2 = string;
                    }
                } else if (!z17) {
                    com.tencent.mm.storage.e9 f18 = com.tencent.mm.storage.e9.f(str2);
                    java.lang.String str5 = f18.f193864f;
                    str2 = (str5 == null || str5.trim().equals("")) ? context.getString(com.tencent.mm.R.string.fbh) : f18.f193864f;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(str2);
                }
                this.f206582f = this.f206581e.findViewById(com.tencent.mm.R.id.g9v);
                tf5.m.O6(this.f206581e, 1);
                this.f206581e.setOnClickListener(new com.tencent.mm.ui.contact.y3(this));
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) ((com.tencent.mm.ui.base.MaskLayout) this.f206581e.findViewById(com.tencent.mm.R.id.g9q)).getContentView(), m7Var2.field_talker, null);
            }
        } else if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FMessageContactView", "initMultiNew failed. context is null.");
        } else {
            this.f206581e = android.view.View.inflate(context, com.tencent.mm.R.layout.bax, this);
            int size2 = arrayList.size();
            com.tencent.mm.storage.m7 m7Var3 = (com.tencent.mm.storage.m7) arrayList.get(0);
            com.tencent.mm.ui.base.MaskLayout maskLayout2 = (com.tencent.mm.ui.base.MaskLayout) this.f206581e.findViewById(com.tencent.mm.R.id.g9q);
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) maskLayout2.getContentView(), m7Var3.field_talker, null);
            maskLayout2.setVisibility(0);
            com.tencent.mm.storage.m7 m7Var4 = (com.tencent.mm.storage.m7) arrayList.get(1);
            com.tencent.mm.ui.base.MaskLayout maskLayout3 = (com.tencent.mm.ui.base.MaskLayout) this.f206581e.findViewById(com.tencent.mm.R.id.g9r);
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) maskLayout3.getContentView(), m7Var4.field_talker, null);
            maskLayout3.setVisibility(0);
            if (size2 > 2) {
                com.tencent.mm.storage.m7 m7Var5 = (com.tencent.mm.storage.m7) arrayList.get(2);
                com.tencent.mm.ui.base.MaskLayout maskLayout4 = (com.tencent.mm.ui.base.MaskLayout) this.f206581e.findViewById(com.tencent.mm.R.id.g9s);
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) maskLayout4.getContentView(), m7Var5.field_talker, null);
                maskLayout4.setVisibility(0);
            }
            if (size2 > 3) {
                com.tencent.mm.storage.m7 m7Var6 = (com.tencent.mm.storage.m7) arrayList.get(3);
                com.tencent.mm.ui.base.MaskLayout maskLayout5 = (com.tencent.mm.ui.base.MaskLayout) this.f206581e.findViewById(com.tencent.mm.R.id.g9t);
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) maskLayout5.getContentView(), m7Var6.field_talker, null);
                maskLayout5.setVisibility(0);
            }
            this.f206582f = this.f206581e.findViewById(com.tencent.mm.R.id.g9v);
            tf5.m.O6(this.f206581e, 1);
            this.f206582f.setOnClickListener(new com.tencent.mm.ui.contact.z3(this));
        }
        android.view.View findViewById2 = this.f206581e.findViewById(com.tencent.mm.R.id.g9v);
        if (findViewById2 != null) {
            int i27 = this.f206583g ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/contact/FMessageContactView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/ui/contact/FMessageContactView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f206582f.setOnTouchListener(new com.tencent.mm.ui.contact.w3(this));
        int W02 = r21.w.wi().W0();
        android.widget.TextView textView3 = (android.widget.TextView) this.f206581e.findViewById(com.tencent.mm.R.id.g_7);
        textView3.setBackgroundResource(com.tencent.mm.ui.tools.pd.a(context));
        if (W02 <= 0) {
            textView3.setVisibility(8);
            f206579n = java.lang.Boolean.FALSE;
            return;
        }
        textView3.setVisibility(0);
        f206579n = java.lang.Boolean.TRUE;
        if (W02 > 99) {
            textView3.setText("");
            textView3.setBackgroundResource(com.tencent.mm.R.raw.badge_count_more);
        } else {
            textView3.setText("" + W02);
            textView3.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(context, W02));
        }
    }

    public void b() {
        if (c01.d9.b().p().q(143618, 0) > 0) {
            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
            com.tencent.mm.modelsimple.g1.J("fmessage", 2);
        }
        c01.d9.b().p().w(143618, 0);
    }

    public final void c() {
        int W0 = r21.w.wi().W0();
        if (W0 > 0) {
            c01.d9.b().p().w(143618, java.lang.Integer.valueOf(W0));
        }
    }

    public void setFrontGround(boolean z17) {
        this.f206586m = z17;
    }

    public void setVisible(boolean z17) {
        android.view.View findViewById = this.f206581e.findViewById(com.tencent.mm.R.id.g9v);
        if (findViewById != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/contact/FMessageContactView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/contact/FMessageContactView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f206583g = z17;
    }
}
