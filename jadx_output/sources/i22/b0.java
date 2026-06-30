package i22;

/* loaded from: classes15.dex */
public class b0 {

    /* renamed from: n, reason: collision with root package name */
    public static final n22.q f287931n = new n22.q(2003);

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f287934c;

    /* renamed from: d, reason: collision with root package name */
    public i22.q0 f287935d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.model.f0 f287936e;

    /* renamed from: f, reason: collision with root package name */
    public int f287937f;

    /* renamed from: i, reason: collision with root package name */
    public i22.a0 f287940i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f287941j;

    /* renamed from: k, reason: collision with root package name */
    public r45.zj0 f287942k;

    /* renamed from: l, reason: collision with root package name */
    public bw5.ra f287943l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct f287944m;

    /* renamed from: a, reason: collision with root package name */
    public boolean f287932a = false;

    /* renamed from: g, reason: collision with root package name */
    public long f287938g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f287939h = "";

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f287933b = com.tencent.mm.sdk.platformtools.x2.f193071a;

    public void a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        int i19;
        if (intent != null) {
            i19 = intent.getIntExtra("key_err_code", 0);
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "errCode:" + i19);
            str = intent.getStringExtra("key_err_msg");
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "errMsg:" + str);
        } else {
            str = "";
            i19 = 0;
        }
        this.f287932a = false;
        if (i18 != -1) {
            if (i17 == 2001) {
                if (c01.z1.y()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(166L, 6L, 1L, false);
                    return;
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(166L, 2L, 1L, false);
                    return;
                }
            }
            return;
        }
        if (i17 != 2001) {
            if (i17 != 2003) {
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "onActivityResult unknow request");
                return;
            }
            java.lang.String str2 = f287931n.f334308a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            android.app.Activity activity = (android.app.Activity) this.f287934c;
            if (intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("Chat_User", stringExtra);
                    intent2.putExtra("smiley_product_id", str2);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent2, activity);
                }
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12069, 3, str2);
            return;
        }
        if (intent != null && i19 == 0) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_response_product_ids");
            java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_response_series_ids");
            int size = stringArrayListExtra.size();
            boolean z17 = false;
            for (int i27 = 0; i27 < size; i27++) {
                java.lang.String str3 = stringArrayListExtra.get(i27);
                java.lang.String str4 = stringArrayListExtra2.get(i27);
                if (this.f287941j.equals(str3)) {
                    r45.zj0 zj0Var = this.f287942k;
                    if (zj0Var != null) {
                        java.lang.String str5 = zj0Var.f392140s;
                        java.lang.String str6 = zj0Var.f392130f;
                        java.lang.String str7 = zj0Var.f392129e;
                        i22.a0 a0Var = this.f287940i;
                        if (a0Var != null) {
                            a0Var.s(str3, str4, str6, str7, str5);
                        }
                    }
                    this.f287935d.b(0, this.f287941j);
                    db5.e1.T(this.f287934c, str);
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "doScene ExchangeEmotionPackNetScene productId:%s", str3);
                    if (stringArrayListExtra.size() > 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "some other product verify.");
                        i22.a0 a0Var2 = this.f287940i;
                        if (a0Var2 != null) {
                            a0Var2.x();
                        }
                    }
                    z17 = true;
                } else {
                    this.f287935d.b(5, this.f287941j);
                }
            }
            if (!z17) {
                c(str);
            }
            if (c01.z1.y()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(166L, 4L, 1L, false);
                return;
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(166L, 0L, 1L, false);
                return;
            }
        }
        if (intent == null || i19 != 100000002) {
            if (intent != null && i19 == 1) {
                if (c01.z1.y()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(166L, 6L, 1L, false);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(166L, 2L, 1L, false);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "user cancel pay emoji.");
                return;
            }
            java.lang.String str8 = this.f287941j;
            if (str8 != null) {
                this.f287935d.e(str8);
                this.f287935d.f();
            }
            c(str);
            if (c01.z1.y()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(166L, 5L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(166L, 1L, 1L, false);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "failed pay emoji. errormsg:%s", str);
            return;
        }
        r45.zj0 zj0Var2 = this.f287942k;
        if (zj0Var2 != null) {
            java.lang.String str9 = zj0Var2.f392140s;
            java.lang.String str10 = this.f287941j;
            java.lang.String str11 = zj0Var2.f392130f;
            java.lang.String str12 = zj0Var2.f392129e;
            i22.a0 a0Var3 = this.f287940i;
            if (a0Var3 != null) {
                a0Var3.s(str10, null, str11, str12, str9);
            }
            this.f287935d.b(0, this.f287941j);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "emoji has paied. now doScene ExchangeEmotionPackNetScene productId:%s", this.f287941j);
        c(str);
        if (c01.z1.y()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(166L, 7L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(166L, 3L, 1L, false);
        }
    }

    public void b() {
        java.lang.String string;
        i22.q0 q0Var = this.f287935d;
        if (q0Var == null || q0Var.d() == null) {
            return;
        }
        j12.i d17 = this.f287935d.d();
        if (d17 != null) {
            this.f287942k = d17.f297167b;
            this.f287943l = d17.f297168c;
        }
        r45.zj0 zj0Var = this.f287942k;
        if (zj0Var == null && this.f287943l == null) {
            return;
        }
        if (zj0Var == null) {
            this.f287942k = n22.k.a(this.f287943l);
        }
        r45.zj0 zj0Var2 = this.f287942k;
        java.lang.String str = zj0Var2.f392128d;
        java.lang.String str2 = zj0Var2.f392130f;
        java.lang.String str3 = zj0Var2.f392141t;
        int i17 = zj0Var2.f392135n;
        int i18 = zj0Var2.B;
        int i19 = this.f287935d.d().f297171f;
        boolean y17 = c01.z1.y();
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = android.text.TextUtils.isEmpty(str3) ? "" : str3;
        objArr[2] = java.lang.Integer.valueOf(i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "[onProductClick] productId:%s, productPrice:%s, productStatus:%d", objArr);
        this.f287941j = str;
        if (i19 == -1) {
            if (!j12.g.a(this.f287942k) && !j12.g.c(this.f287942k) && (y17 || !android.text.TextUtils.isEmpty(this.f287942k.f392133i))) {
                if (y17) {
                    com.tencent.mm.plugin.emoji.model.f0 f0Var = this.f287936e;
                    if (f0Var == null) {
                        return;
                    }
                    com.tencent.mm.storage.f5 b17 = ((com.tencent.mm.plugin.emoji.model.q) f0Var).b(str);
                    if (android.text.TextUtils.isEmpty(b17.f193922e)) {
                        r3 = b17.f193920c;
                    }
                }
                r3 = 4;
            }
            this.f287935d.b(r3, str);
            return;
        }
        if (i19 == 0) {
            this.f287935d.b(3, str);
            return;
        }
        if (i19 != 3) {
            if (i19 != 4) {
                if (i19 != 5) {
                    if (i19 == 7) {
                        if (this.f287935d.d().f297175j) {
                            java.lang.String str4 = this.f287942k.f392128d;
                            if (str4 == null) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "pid must not be null");
                                return;
                            }
                            if (this.f287934c == null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "start reward ui faild. context is null");
                                return;
                            }
                            r3 = this.f287937f != 9 ? 4 : 3;
                            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            d22.b0 b0Var = new d22.b0(str4);
                            b0Var.f364190g = r3;
                            kotlin.jvm.internal.o.g(java.lang.String.valueOf(this.f287938g), "<set-?>");
                            b0Var.f364155a = this.f287937f;
                            d22.u.f225876a.a(this.f287934c, b0Var);
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12738, str4, java.lang.Integer.valueOf(r3), java.lang.Integer.valueOf(this.f287937f), 0);
                            return;
                        }
                        return;
                    }
                    switch (i19) {
                        case 9:
                            gm0.j1.n().f273288b.g(new z12.w(str, 2));
                            return;
                        case 10:
                            com.tencent.mm.plugin.emoji.model.f0 f0Var2 = this.f287936e;
                            if (f0Var2 != null) {
                                int i27 = ((com.tencent.mm.plugin.emoji.model.q) f0Var2).b(str).f193921d;
                                android.content.Context context = this.f287933b;
                                switch (i27) {
                                    case 10233:
                                        string = context.getString(com.tencent.mm.R.string.bwv);
                                        break;
                                    case 10234:
                                        string = context.getString(com.tencent.mm.R.string.bwe);
                                        break;
                                    case 10235:
                                        string = context.getString(com.tencent.mm.R.string.c0a);
                                        break;
                                    default:
                                        string = context.getString(com.tencent.mm.R.string.c0f);
                                        break;
                                }
                                db5.e1.s(this.f287934c, string, null);
                                return;
                            }
                            return;
                        case 11:
                            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "[onProductClick] cannot action when loading.");
                            return;
                        case 12:
                            break;
                        default:
                            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "[onProductClick] unkonw product status");
                            return;
                    }
                }
            }
            if (this.f287932a) {
                return;
            }
            if ((i17 & 512) == 512) {
                n22.i iVar = n22.j.f334293a;
                if (iVar.a()) {
                    iVar.e(true);
                    iVar.b(this.f287934c).C();
                    return;
                } else {
                    n22.j.a(this.f287934c, str, "", i18, str3, str2);
                    iVar.e(true);
                    this.f287932a = true;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12066, 2, java.lang.Integer.valueOf(this.f287937f), "", str, java.lang.Long.valueOf(this.f287938g), this.f287939h, java.lang.Integer.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.l(this.f287942k.D)), java.lang.Integer.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.n(this.f287942k.D)), com.tencent.mm.plugin.emoji.model.EmojiLogic.m(this.f287942k.D));
                    return;
                }
            }
            return;
        }
        if (n22.l.c(this.f287942k)) {
            z12.e.f().h();
            return;
        }
        r45.zj0 zj0Var3 = this.f287942k;
        java.lang.String str5 = zj0Var3.f392129e;
        java.lang.String str6 = zj0Var3.f392140s;
        i22.a0 a0Var = this.f287940i;
        if (a0Var != null) {
            a0Var.s(str, null, str2, str5, str6);
        }
        this.f287935d.h(0, str);
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "doScene ExchangeEmotionPackNetScene productId:%s", str);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12066, 0, java.lang.Integer.valueOf(this.f287937f), "", str, java.lang.Long.valueOf(this.f287938g), this.f287939h, java.lang.Integer.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.l(this.f287942k.D)), java.lang.Integer.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.n(this.f287942k.D)), com.tencent.mm.plugin.emoji.model.EmojiLogic.m(this.f287942k.D));
        com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct emoticonStoreActionStruct = this.f287944m;
        if (emoticonStoreActionStruct != null) {
            emoticonStoreActionStruct.f56072f = 2;
            emoticonStoreActionStruct.u(this.f287942k.f392128d);
            this.f287944m.q(this.f287942k.f392130f);
            this.f287944m.r(java.lang.String.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.l(this.f287942k.D)));
            this.f287944m.t(java.lang.String.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.n(this.f287942k.D)));
            this.f287944m.s(com.tencent.mm.plugin.emoji.model.EmojiLogic.m(this.f287942k.D));
            this.f287944m.k();
        }
    }

    public final void c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = this.f287933b.getString(com.tencent.mm.R.string.bx8);
        }
        db5.e1.t(this.f287934c, str, "", new i22.z(this));
    }
}
