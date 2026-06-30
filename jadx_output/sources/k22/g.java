package k22;

/* loaded from: classes12.dex */
public final class g implements com.tencent.mm.modelbase.u0 {
    public long A;
    public int B;
    public java.lang.String C;
    public final java.lang.String D;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f303483d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.emotion.EmojiInfo f303484e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f303485f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f303486g;

    /* renamed from: h, reason: collision with root package name */
    public final int f303487h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.z2 f303488i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.emoji.view.AbsEmojiView f303489m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f303490n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f303491o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f303492p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f303493q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f303494r;

    /* renamed from: s, reason: collision with root package name */
    public z12.o f303495s;

    /* renamed from: t, reason: collision with root package name */
    public z12.q f303496t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f303497u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f303498v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.a f303499w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.a f303500x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.a f303501y;

    /* renamed from: z, reason: collision with root package name */
    public int f303502z;

    public g(android.content.Context context, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, boolean z17, long j17, java.lang.String str, java.lang.String sdkRequestID, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        kotlin.jvm.internal.o.g(sdkRequestID, "sdkRequestID");
        this.f303483d = context;
        this.f303484e = emojiInfo;
        this.f303485f = z17;
        this.f303486g = sdkRequestID;
        this.f303487h = i17;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 3, 1);
        this.f303488i = z2Var;
        kotlinx.coroutines.z0.b();
        this.f303497u = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dbw, (android.view.ViewGroup) null);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a6n, (android.view.ViewGroup) null);
        this.f303498v = inflate;
        this.D = "MicroMsg.EmojiStoreV3SingleProductHalfDialog";
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(emojiInfo.field_md5);
        if (u17 != null) {
            long j18 = emojiInfo.field_emojiFlag;
            this.f303484e = u17;
            u17.field_emojiFlag = j18;
        }
        this.f303494r = this.f303484e.field_catalog == 81;
        c();
        android.view.View view = z2Var.f212058g;
        if (view != null) {
            dy1.a.i(view, "emoticon_album_halfpanel");
        }
        android.view.View view2 = z2Var.f212058g;
        if (view2 != null) {
            dy1.a.d(view2, 32, 10, false);
        }
        android.view.View view3 = z2Var.f212058g;
        if (view3 != null) {
            dy1.a.k(view3, b());
        }
        com.tencent.mm.ui.widget.button.WeButton weButton = z2Var.f212071w;
        if (weButton != null) {
            dy1.a.i(weButton, "emoticon_album_halfshare");
        }
        com.tencent.mm.ui.widget.button.WeButton weButton2 = z2Var.f212071w;
        if (weButton2 != null) {
            dy1.a.k(weButton2, b());
        }
        com.tencent.mm.ui.widget.button.WeButton weButton3 = z2Var.f212071w;
        if (weButton3 != null) {
            dy1.a.d(weButton3, 8, 10, false);
        }
        com.tencent.mm.ui.widget.button.WeButton weButton4 = z2Var.f212070v;
        if (weButton4 != null) {
            dy1.a.i(weButton4, "emoticon_album_halfadd");
        }
        com.tencent.mm.ui.widget.button.WeButton weButton5 = z2Var.f212070v;
        if (weButton5 != null) {
            dy1.a.k(weButton5, b());
        }
        com.tencent.mm.ui.widget.button.WeButton weButton6 = z2Var.f212070v;
        if (weButton6 != null) {
            dy1.a.d(weButton6, 8, 10, false);
        }
        k22.a aVar = new k22.a(this);
        k22.b bVar = new k22.b(this);
        z2Var.D = aVar;
        z2Var.E = bVar;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.dbb);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.emoji.view.AbsEmojiView absEmojiView = (com.tencent.mm.emoji.view.AbsEmojiView) findViewById;
        this.f303489m = absEmojiView;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.s(absEmojiView, 2);
        com.tencent.mm.emoji.view.AbsEmojiView absEmojiView2 = this.f303489m;
        if (absEmojiView2 == null) {
            kotlin.jvm.internal.o.o("emojiView");
            throw null;
        }
        absEmojiView2.setStatusListener(new k22.c(this));
        com.tencent.mm.emoji.view.AbsEmojiView absEmojiView3 = this.f303489m;
        if (absEmojiView3 == null) {
            kotlin.jvm.internal.o.o("emojiView");
            throw null;
        }
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = this.f303484e;
        absEmojiView3.setEmojiInfo(emojiInfo2);
        java.lang.String md52 = emojiInfo2.getMd5();
        s25.a wi6 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
        if (com.tencent.mm.sdk.platformtools.t8.K0(md52)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV3SingleProductHalfDialog", "no desc, emojiInfo md5 error");
        } else {
            java.lang.String field_custom_meaning = ((y12.h) wi6).v(md52);
            field_custom_meaning = field_custom_meaning == null ? "" : field_custom_meaning;
            if (com.tencent.mm.sdk.platformtools.t8.K0(field_custom_meaning) && !com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo2.H2)) {
                field_custom_meaning = emojiInfo2.H2;
                kotlin.jvm.internal.o.f(field_custom_meaning, "meaning");
            }
            if ((field_custom_meaning.length() == 0) && !com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo2.field_custom_meaning)) {
                field_custom_meaning = emojiInfo2.field_custom_meaning;
                kotlin.jvm.internal.o.f(field_custom_meaning, "field_custom_meaning");
            }
            android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.dba);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            this.f303490n = (android.widget.TextView) findViewById2;
            d(field_custom_meaning);
            android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.t7l);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            this.f303491o = (android.widget.TextView) findViewById3;
            long j19 = 16;
            boolean z18 = (((emojiInfo2.field_emojiFlag & j19) > 0L ? 1 : ((emojiInfo2.field_emojiFlag & j19) == 0L ? 0 : -1)) != 0) || (j17 & j19) != 0;
            int i18 = com.tencent.mm.plugin.emoji.model.EmojiLogic.f97533a;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_emoticon_original_label_android, false)).booleanValue() || java.lang.Boolean.valueOf(bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.emoji.RepairerConfigEmoticonShowOriginalAllowed()) == 1).booleanValue());
            kotlin.jvm.internal.o.f(valueOf, "isEmoticonShowOriginalAllowed(...)");
            if (valueOf.booleanValue() && z18) {
                android.widget.TextView textView = this.f303491o;
                if (textView == null) {
                    kotlin.jvm.internal.o.o("originalTipsTv");
                    throw null;
                }
                textView.setVisibility(0);
                android.widget.TextView textView2 = this.f303491o;
                if (textView2 == null) {
                    kotlin.jvm.internal.o.o("originalTipsTv");
                    throw null;
                }
                textView2.setText(context.getString(com.tencent.mm.R.string.a_9));
            } else {
                android.widget.TextView textView3 = this.f303491o;
                if (textView3 == null) {
                    kotlin.jvm.internal.o.o("originalTipsTv");
                    throw null;
                }
                textView3.setVisibility(8);
            }
            android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.dbe);
            kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
            this.f303493q = findViewById4;
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById4, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = this.f303493q;
                if (view4 == null) {
                    kotlin.jvm.internal.o.o("relativeInfoRoot");
                    throw null;
                }
                android.view.View findViewById5 = view4.findViewById(com.tencent.mm.R.id.lt6);
                kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
                this.f303492p = (android.widget.TextView) findViewById5;
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById4, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            z2Var.j(inflate);
            z2Var.l(new k22.d(this));
        }
        gm0.j1.n().f273288b.a(521, this);
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo3 = this.f303484e;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo3.field_groupId)) {
            gm0.j1.n().f273288b.g(new z12.p(emojiInfo3.field_groupId));
        }
        if (z17) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo3.field_groupId)) {
                gm0.j1.n().f273288b.a(412, this);
                this.f303496t = new z12.q(emojiInfo3.field_groupId, 1, -1);
                gm0.j1.n().f273288b.g(this.f303496t);
            } else {
                if (com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo3.field_designerID)) {
                    return;
                }
                gm0.j1.n().f273288b.a(239, this);
                this.f303495s = new z12.o(emojiInfo3.field_designerID);
                gm0.j1.n().f273288b.g(this.f303495s);
            }
        }
    }

    public static final void a(k22.g gVar, java.lang.String str) {
        java.lang.String str2 = gVar.C;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        try {
            org.json.JSONObject optJSONObject = new org.json.JSONObject(gVar.C).optJSONObject(str);
            if (optJSONObject == null) {
                return;
            }
            java.lang.String optString = optJSONObject.optString("actionType");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            java.lang.String optString2 = optJSONObject.optString("eleId");
            kotlin.jvm.internal.o.f(optString2, "optString(...)");
            java.lang.String optString3 = optJSONObject.optString("eleInfo");
            kotlin.jvm.internal.o.f(optString3, "optString(...)");
            java.lang.String optString4 = optJSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE_INFO);
            kotlin.jvm.internal.o.f(optString4, "optString(...)");
            java.lang.String optString5 = optJSONObject.optString("pageId");
            kotlin.jvm.internal.o.f(optString5, "optString(...)");
            j22.a.c(optString, optString2, optString3, optString4, optString5);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i(gVar.D, "reportLiteAppAction error: " + e17);
        }
    }

    public final java.util.Map b() {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f303484e;
        java.lang.String str = emojiInfo.field_groupId;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        hashMap.put("pid", str);
        java.lang.String md52 = emojiInfo.getMd5();
        hashMap.put("emoticon_md5", md52 != null ? md52 : "");
        hashMap.put("emoticon_type", 1);
        hashMap.put("emoticon_enter_scene", java.lang.Integer.valueOf(this.f303487h));
        java.lang.String str2 = this.f303486g;
        hashMap.put("emoticon_sessionid", str2);
        hashMap.put("requestid", str2);
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r1.isEnabled() == true) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r6 = this;
            com.tencent.mm.ui.widget.dialog.z2 r0 = r6.f303488i
            com.tencent.mm.ui.widget.button.WeButton r1 = r0.f212071w
            android.content.Context r2 = r6.f303483d
            if (r1 != 0) goto L9
            goto L17
        L9:
            android.content.res.Resources r3 = r2.getResources()
            r4 = 2131760195(0x7f101443, float:1.9151404E38)
            java.lang.String r3 = r3.getString(r4)
            r1.setText(r3)
        L17:
            com.tencent.mm.ui.widget.button.WeButton r1 = r0.f212070v
            boolean r3 = r6.f303494r
            if (r1 != 0) goto L1e
            goto L3a
        L1e:
            java.lang.String r4 = "getString(...)"
            if (r3 == 0) goto L2d
            r5 = 2131755473(0x7f1001d1, float:1.9141826E38)
            java.lang.String r2 = i65.a.r(r2, r5)
            kotlin.jvm.internal.o.f(r2, r4)
            goto L37
        L2d:
            r5 = 2131760392(0x7f101508, float:1.9151803E38)
            java.lang.String r2 = i65.a.r(r2, r5)
            kotlin.jvm.internal.o.f(r2, r4)
        L37:
            r1.setText(r2)
        L3a:
            if (r3 == 0) goto L65
            com.tencent.mm.ui.widget.button.WeButton r1 = r0.f212070v
            r2 = 0
            if (r1 == 0) goto L49
            boolean r1 = r1.isEnabled()
            r3 = 1
            if (r1 != r3) goto L49
            goto L4a
        L49:
            r3 = r2
        L4a:
            if (r3 == 0) goto L65
            com.tencent.mm.ui.widget.button.WeButton r1 = r0.f212070v
            if (r1 == 0) goto L56
            r3 = 2131690843(0x7f0f055b, float:1.9010741E38)
            r1.setIcon(r3)
        L56:
            com.tencent.mm.ui.widget.button.WeButton r1 = r0.f212070v
            if (r1 != 0) goto L5b
            goto L5e
        L5b:
            r1.setEnabled(r2)
        L5e:
            com.tencent.mm.ui.widget.button.WeButton r0 = r0.f212070v
            if (r0 == 0) goto L65
            r0.setBackgroundColor(r2)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k22.g.c():void");
    }

    public final void d(java.lang.String newDesc) {
        kotlin.jvm.internal.o.g(newDesc, "newDesc");
        android.widget.TextView textView = this.f303490n;
        if (textView == null) {
            kotlin.jvm.internal.o.o("descTv");
            throw null;
        }
        textView.setVisibility(newDesc.length() == 0 ? 8 : 0);
        android.widget.TextView textView2 = this.f303490n;
        if (textView2 != null) {
            textView2.setText(newDesc);
        } else {
            kotlin.jvm.internal.o.o("descTv");
            throw null;
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        o11.g gVar;
        r45.zj0 zj0Var;
        java.lang.String str2 = this.D;
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.i(str2, "netScene null");
            return;
        }
        int type = m1Var.getType();
        com.tencent.mars.xlog.Log.i(str2, "onSceneEnd: sceneType:" + type + ", errType:" + i17 + ", errCode:" + i18);
        if (type == 239 || type == 412 || type == 521) {
            gm0.j1.n().f273288b.q(521, this);
        }
        android.content.Context context = this.f303483d;
        boolean z17 = this.f303485f;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f303484e;
        if (type == 239) {
            if (i18 == 0 && (m1Var instanceof z12.o) && kotlin.jvm.internal.o.b(m1Var, this.f303495s)) {
                r45.ee3 H = ((z12.o) m1Var).H();
                r45.v75 v75Var = H != null ? H.f373357d : null;
                if (z17) {
                    if (v75Var == null) {
                        com.tencent.mars.xlog.Log.i(str2, "updateDesignerRelativeInfo error, PersonalDesigner error, md5:" + emojiInfo.getMd5());
                        return;
                    }
                    java.lang.String str3 = v75Var.f387965e;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        com.tencent.mars.xlog.Log.i(str2, "updateDesignerRelativeInfo error, designerName null, md5:" + emojiInfo.getMd5());
                        android.view.View view = this.f303493q;
                        if (view == null) {
                            kotlin.jvm.internal.o.o("relativeInfoRoot");
                            throw null;
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(4);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateDesignerRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/PersonalDesigner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateDesignerRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/PersonalDesigner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    j22.a.d(this.f303484e, 3, this.f303502z, this.A, this.f303487h);
                    android.widget.TextView textView = this.f303492p;
                    if (textView == null) {
                        kotlin.jvm.internal.o.o("relativeInfoTv");
                        throw null;
                    }
                    textView.setText(str3);
                    android.widget.TextView textView2 = this.f303492p;
                    if (textView2 == null) {
                        kotlin.jvm.internal.o.o("relativeInfoTv");
                        throw null;
                    }
                    textView2.setOnClickListener(new k22.e(this, v75Var));
                    android.view.View view2 = this.f303493q;
                    if (view2 == null) {
                        kotlin.jvm.internal.o.o("relativeInfoRoot");
                        throw null;
                    }
                    android.widget.TextView textView3 = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.lt7);
                    if (textView3 != null) {
                        textView3.setText(i65.a.r(context, com.tencent.mm.R.string.bxk));
                    }
                    java.lang.String str4 = v75Var.f387967g;
                    boolean z18 = str4 != null && str4.length() > 0;
                    android.view.View view3 = this.f303493q;
                    if (view3 == null) {
                        kotlin.jvm.internal.o.o("relativeInfoRoot");
                        throw null;
                    }
                    ((com.tencent.mm.ui.widget.imageview.WeImageView) view3.findViewById(com.tencent.mm.R.id.qw9)).setVisibility(z18 ? 0 : 8);
                    android.view.View view4 = this.f303493q;
                    if (view4 == null) {
                        kotlin.jvm.internal.o.o("relativeInfoRoot");
                        throw null;
                    }
                    android.widget.ImageView imageView = (android.widget.ImageView) view4.findViewById(com.tencent.mm.R.id.f486600lt5);
                    java.lang.String str5 = v75Var.f387966f;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                        if (imageView == null) {
                            return;
                        }
                        imageView.setVisibility(8);
                        return;
                    }
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    n11.a b17 = n11.a.b();
                    java.lang.String str6 = emojiInfo.field_groupId;
                    int i19 = y12.f.f458859a;
                    java.lang.String o17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.o(n22.m.g(), str6, str5);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(o17)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
                        gVar = null;
                    } else {
                        o11.f fVar = new o11.f();
                        fVar.f342077a = true;
                        fVar.f342078b = true;
                        fVar.f342082f = o17;
                        fVar.f342096t = true;
                        gVar = fVar.a();
                    }
                    b17.h(str5, imageView, gVar);
                    android.view.View view5 = this.f303493q;
                    if (view5 == null) {
                        kotlin.jvm.internal.o.o("relativeInfoRoot");
                        throw null;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateDesignerRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/PersonalDesigner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateDesignerRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/PersonalDesigner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                return;
            }
            return;
        }
        if (type != 412) {
            if (type == 521 && i18 == 0) {
                java.lang.String v17 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).v(emojiInfo.getMd5());
                java.lang.String str7 = v17 != null ? v17 : "";
                if (com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
                    return;
                }
                d(str7);
                return;
            }
            return;
        }
        if (i18 == 0 && (m1Var instanceof z12.q) && kotlin.jvm.internal.o.b(m1Var, this.f303496t)) {
            new r45.qj0();
            r45.qj0 qj0Var = ((r45.se3) ((z12.q) m1Var).f469350d.f70711b.f70700a).f385652d;
            if (qj0Var == null) {
                zj0Var = null;
            } else {
                zj0Var = new r45.zj0();
                zj0Var.f392136o = qj0Var.f384042q;
                zj0Var.f392129e = qj0Var.f384033e;
                zj0Var.f392130f = qj0Var.f384034f;
                zj0Var.f392135n = qj0Var.f384039n;
                zj0Var.f392131g = qj0Var.f384035g;
                zj0Var.f392137p = qj0Var.f384043r;
                zj0Var.f392134m = qj0Var.f384038m;
                zj0Var.f392133i = qj0Var.f384037i;
                zj0Var.f392141t = qj0Var.f384045t;
                zj0Var.f392142u = qj0Var.f384046u;
                zj0Var.f392128d = qj0Var.f384032d;
                zj0Var.B = qj0Var.I;
                zj0Var.A = qj0Var.H;
            }
            if (z17) {
                if (zj0Var == null) {
                    com.tencent.mars.xlog.Log.i(str2, "updateEmotionRelativeInfo error, EmotionSummary error, md5:" + emojiInfo.getMd5());
                    return;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(zj0Var.f392130f)) {
                    com.tencent.mars.xlog.Log.i(str2, "updateEmotionRelativeInfo error, emotion pack name null, md5:" + emojiInfo.getMd5());
                    android.view.View view6 = this.f303493q;
                    if (view6 == null) {
                        kotlin.jvm.internal.o.o("relativeInfoRoot");
                        throw null;
                    }
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(4);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view6, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateEmotionRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/EmotionSummary;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateEmotionRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/EmotionSummary;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                j22.a.d(this.f303484e, 3, this.f303502z, this.A, this.f303487h);
                if (kotlin.jvm.internal.o.b(zj0Var.f392128d, emojiInfo.field_groupId)) {
                    android.widget.TextView textView4 = this.f303492p;
                    if (textView4 == null) {
                        kotlin.jvm.internal.o.o("relativeInfoTv");
                        throw null;
                    }
                    textView4.setText(zj0Var.f392130f);
                    android.widget.TextView textView5 = this.f303492p;
                    if (textView5 == null) {
                        kotlin.jvm.internal.o.o("relativeInfoTv");
                        throw null;
                    }
                    textView5.setOnClickListener(new k22.f(this, zj0Var));
                }
                android.view.View view7 = this.f303493q;
                if (view7 == null) {
                    kotlin.jvm.internal.o.o("relativeInfoRoot");
                    throw null;
                }
                android.widget.TextView textView6 = (android.widget.TextView) view7.findViewById(com.tencent.mm.R.id.lt7);
                if (textView6 != null) {
                    textView6.setText(i65.a.r(context, com.tencent.mm.R.string.bxl));
                }
                android.view.View view8 = this.f303493q;
                if (view8 == null) {
                    kotlin.jvm.internal.o.o("relativeInfoRoot");
                    throw null;
                }
                ((android.widget.ImageView) view8.findViewById(com.tencent.mm.R.id.qw9)).setVisibility(8);
                java.lang.String str8 = zj0Var.f392129e;
                android.view.View view9 = this.f303493q;
                if (view9 == null) {
                    kotlin.jvm.internal.o.o("relativeInfoRoot");
                    throw null;
                }
                android.widget.ImageView imageView2 = (android.widget.ImageView) view9.findViewById(com.tencent.mm.R.id.f486600lt5);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str8)) {
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                    if (n22.l.b(zj0Var.f392128d)) {
                        n11.a.b().g("", imageView2);
                        if (imageView2 != null) {
                            imageView2.setImageResource(com.tencent.mm.R.drawable.icon_002_cover);
                        }
                    } else {
                        n11.a b18 = n11.a.b();
                        java.lang.String str9 = zj0Var.f392129e;
                        b18.h(str9, imageView2, y12.f.b(zj0Var.f392128d, str9));
                    }
                } else if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                android.view.View view10 = this.f303493q;
                if (view10 == null) {
                    kotlin.jvm.internal.o.o("relativeInfoRoot");
                    throw null;
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view10, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateEmotionRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/EmotionSummary;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view10, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateEmotionRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/EmotionSummary;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
