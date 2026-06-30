package q03;

/* loaded from: classes8.dex */
public final class b implements com.tencent.pigeon.settings.FlutterSettingApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, io.flutter.plugin.common.PluginRegistry.ActivityResultListener, f50.b0 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f359364d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.pigeon.settings.FlutterSettingCallback f359365e;

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public java.lang.String getDisplayUsername() {
        java.lang.String c17 = c01.z1.c();
        java.lang.String r17 = c01.z1.r();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
            return c17;
        }
        if (com.tencent.mm.storage.z3.y3(r17)) {
            return null;
        }
        return r17;
    }

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public java.lang.String getDistrict() {
        c01.fb a17 = c01.fb.a();
        java.lang.String d17 = a17.d();
        if (d17 == null) {
            d17 = "";
        }
        java.lang.String c17 = a17.c();
        return ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Di(d17) + ' ' + (c17 != null ? c17 : "");
    }

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public java.lang.String getNickname() {
        java.lang.Object l17 = gm0.j1.u().c().l(4, null);
        if (l17 instanceof java.lang.String) {
            return (java.lang.String) l17;
        }
        return null;
    }

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public java.lang.String getPatTail() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_STRING_SYNC, null);
        if (m17 instanceof java.lang.String) {
            return (java.lang.String) m17;
        }
        return null;
    }

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public boolean getSendMsgInKeybaord() {
        java.lang.Object l17 = gm0.j1.u().c().l(66832, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.Boolean");
        return ((java.lang.Boolean) l17).booleanValue();
    }

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public java.lang.Long getSex() {
        return java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.j1(gm0.j1.u().c().l(12290, null) instanceof java.lang.Integer ? (java.lang.Integer) r0 : null, 0));
    }

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public java.lang.String getSignature() {
        java.lang.Object l17 = gm0.j1.u().c().l(12291, null);
        java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (!(str.length() == 0)) {
            return str;
        }
        android.content.Context context = this.f359364d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
        }
        return context.getString(com.tencent.mm.R.string.iy8);
    }

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public java.lang.String getUsername() {
        return c01.z1.r();
    }

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public boolean getVoicePlayMode() {
        java.lang.Object l17 = gm0.j1.u().c().l(26, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.Boolean");
        return ((java.lang.Boolean) l17).booleanValue();
    }

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public java.lang.String getVoipRingtone() {
        ((dd0.q0) ((ed0.w0) i95.n0.c(ed0.w0.class))).getClass();
        vx3.i i17 = mx3.i0.i("");
        if (i17 == null) {
            return "";
        }
        java.lang.String str = i17.f441292i;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str == null ? "" : str;
    }

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public java.lang.String getWeCoin() {
        f50.d0 d0Var = (f50.d0) i95.n0.c(f50.d0.class);
        android.content.Context context = this.f359364d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
        }
        ((vd0.q3) d0Var).getClass();
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).getClass();
        long longValue = java.lang.Long.valueOf(os4.h.i()).longValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHelperService", "updateWeCoinEntry balance catch: %s", java.lang.Long.valueOf(longValue));
        if (longValue <= 0) {
            return "";
        }
        return longValue + " " + context.getString(com.tencent.mm.R.string.j1_);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_ABOUT_INVOICE_ENTRANCE_BOOLEAN, false))) == false) goto L6;
     */
    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isInvoiceEnable() {
        /*
            r4 = this;
            com.tencent.mm.sdk.platformtools.f9 r0 = com.tencent.mm.sdk.platformtools.f9.MeAvatarInvoiceTitle
            boolean r0 = r0.h()
            r1 = 1
            if (r0 != 0) goto L22
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r2 = com.tencent.mm.storage.u3.USERINFO_ABOUT_INVOICE_ENTRANCE_BOOLEAN
            r3 = 0
            boolean r0 = r0.o(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.n1(r0)
            if (r0 != 0) goto L23
        L22:
            r3 = r1
        L23:
            r0 = r3 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q03.b.isInvoiceEnable():boolean");
    }

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public boolean isLandscapeMode() {
        return com.tencent.mm.sdk.platformtools.x2.d().getBoolean("settings_landscape_mode", false);
    }

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public boolean isMultipleUser() {
        return android.os.Process.myUid() / 100000 != 0;
    }

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public boolean isMyAddressEnable() {
        android.content.Context context = this.f359364d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
        }
        return !(com.tencent.mm.sdk.platformtools.t8.P0(context) || com.tencent.mm.sdk.platformtools.f9.MeAvatarAddress.h());
    }

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public boolean isPatEnable() {
        ((vd0.q3) ((f50.d0) i95.n0.c(f50.d0.class))).getClass();
        return ((lp3.r) i95.n0.c(lp3.r.class)).Di();
    }

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public boolean isWeCoinEnable() {
        return !((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.vfs.x1 m17;
        if (i17 != 2 && i17 != 4) {
            return false;
        }
        f50.d0 d0Var = (f50.d0) i95.n0.c(f50.d0.class);
        android.app.Activity activity = this.f359364d;
        ((vd0.q3) d0Var).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingChangeAvatarHelp", "onAcvityResult requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            if (i17 == 3 || i17 == 2 || i17 == 4) {
                new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new m14.c());
            }
        } else if (i17 != 2) {
            if (i17 == 3) {
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                java.lang.String a17 = g83.a.a();
                ((ub0.r) oVar).getClass();
                java.lang.String b17 = com.tencent.mm.pluginsdk.ui.tools.l7.b(context, intent, a17);
                if (b17 != null) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("CropImageMode", 1);
                    intent2.putExtra("CropImage_OutputPath", b17);
                    intent2.putExtra("CropImage_ImgPath", b17);
                    intent2.putExtra("CropImage_from_scene", 3);
                    ((com.tencent.mm.app.y7) f14.g.b()).p(activity, intent2, 4);
                }
            } else if (i17 == 4) {
                new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new m14.d());
                if (intent != null) {
                    java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
                    java.lang.String r17 = c01.z1.r();
                    ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    android.graphics.Bitmap m18 = com.tencent.mm.modelavatar.d1.Ai().m(r17);
                    if (stringExtra == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SettingChangeAvatarHelp", "crop picture failed");
                    } else {
                        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(stringExtra);
                        java.lang.String str = a18.f213279f;
                        if (str != null) {
                            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                            if (!str.equals(l17)) {
                                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
                            }
                        }
                        com.tencent.mm.vfs.z2 m19 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SettingChangeAvatarHelp", "onActivityResult(CONTEXT_MENU_CROP_PICTURE)  file:%s, size:%d", stringExtra, java.lang.Long.valueOf((m19.a() && (m17 = m19.f213266a.m(m19.f213267b)) != null) ? m17.f213233c : 0L));
                        ((com.tencent.mm.feature.avatar.k0) ((kv.l0) i95.n0.c(kv.l0.class))).getClass();
                        new com.tencent.mm.modelavatar.y0(activity, stringExtra, false).b(1, new m14.e(m18), true);
                    }
                }
            }
        } else if (intent != null) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("CropImageMode", 1);
            intent3.putExtra("CropImage_Filter", true);
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            intent3.putExtra("CropImage_OutputPath", com.tencent.mm.modelavatar.d1.Ai().i(c01.z1.r() + ".crop", true, false));
            intent3.putExtra("CropImage_ImgPath", (java.lang.String) null);
            intent3.putExtra("CropImage_from_scene", 3);
            ((com.tencent.mm.app.y7) f14.g.b()).q(activity, intent, intent3, g83.a.a(), 4, null);
        }
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f359364d = binding.getActivity();
        binding.addActivityResultListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.settings.FlutterSettingApi.Companion companion = com.tencent.pigeon.settings.FlutterSettingApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.settings.FlutterSettingApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f359365e = new com.tencent.pigeon.settings.FlutterSettingCallback(binaryMessenger2, null, 2, 0 == true ? 1 : 0);
        p03.e eVar = (p03.e) ((f50.c0) i95.n0.c(f50.c0.class));
        eVar.getClass();
        eVar.f350427d.add(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f359364d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f359364d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.settings.FlutterSettingApi.Companion companion = com.tencent.pigeon.settings.FlutterSettingApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.settings.FlutterSettingApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f359365e = new com.tencent.pigeon.settings.FlutterSettingCallback(binaryMessenger2, null, 2, 0 == true ? 1 : 0);
        p03.e eVar = (p03.e) ((f50.c0) i95.n0.c(f50.c0.class));
        eVar.getClass();
        eVar.f350427d.remove(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f359364d = binding.getActivity();
        binding.removeActivityResultListener(this);
    }

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public void resetChatRecord() {
        f50.d0 d0Var = (f50.d0) i95.n0.c(f50.d0.class);
        android.app.Activity activity = this.f359364d;
        ((vd0.q3) d0Var).getClass();
        m14.f fVar = new m14.f(activity);
        android.content.Context context = fVar.f322869a;
        db5.e1.B(context, context.getResources().getString(com.tencent.mm.R.string.ixr), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new m14.j(fVar), null, com.tencent.mm.R.color.f478622ch);
    }

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public void saveUserInfo() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterSettingsPlugin", "saveUserInfo: ");
        c01.fb a17 = c01.fb.a();
        long longValue = getSex().longValue();
        if (longValue != -1) {
            a17.f37188b = (int) longValue;
        }
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(1, c01.fb.e(a17)));
    }

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public void sendMsgInKeyboard(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterSettingsPlugin", "sendMsgInKeyboard: " + z17);
        gm0.j1.u().c().w(66832, java.lang.Boolean.valueOf(z17));
    }

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public void setSex(long j17) {
        c01.fb a17 = c01.fb.a();
        if (j17 != -1) {
            a17.f37188b = (int) j17;
        }
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(1, c01.fb.e(a17)));
        com.tencent.mm.plugin.report.service.b1.f(4, 4);
    }

    @Override // com.tencent.pigeon.settings.FlutterSettingApi
    public void voicePlayMode(boolean z17) {
        java.lang.Object l17 = gm0.j1.u().c().l(26, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.Boolean");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterSettingsPlugin", "set voice mode from %B to %B", java.lang.Boolean.valueOf(((java.lang.Boolean) l17).booleanValue()), java.lang.Boolean.valueOf(z17));
        gm0.j1.u().c().w(26, java.lang.Boolean.valueOf(z17));
    }
}
