package com.tencent.mm.plugin.setting.ui.setting_new.settings.personal_info;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/personal_info/SettingActivityItemAvatar;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SettingActivityItemAvatar extends s24.a {

    /* renamed from: p, reason: collision with root package name */
    public final boolean f161977p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingActivityItemAvatar(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        boolean z17 = false;
        if (getIntent().getBooleanExtra("intent_set_avatar", false)) {
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ui(activity);
            z17 = getIntent().getBooleanExtra("KEnterFromBanner", false);
        }
        this.f161977p = z17;
    }

    @Override // s24.a
    public java.lang.String L7() {
        return ".ui.setting.SettingMessageRingtoneUI";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return "setting";
    }

    public final void N7() {
        vh0.e1 e1Var = (vh0.e1) i95.n0.c(vh0.e1.class);
        iy1.c cVar = iy1.c.MainUI;
        ((y14.j) e1Var).getClass();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Gj(50402, "page_in", new java.util.HashMap(), 35480);
        android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.class);
        android.app.Activity context = getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/settings/personal_info/SettingActivityItemAvatar", "jumpToPreviewHdHeadImg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/setting/ui/setting_new/settings/personal_info/SettingActivityItemAvatar", "jumpToPreviewHdHeadImg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // a24.i
    public yz5.l T6() {
        return new o24.a(this);
    }

    @Override // a24.i
    public android.view.View.OnClickListener U6() {
        return new o24.b(this);
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_PersonalInfo_Avatar";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPersonalInfo.class, null);
    }

    @Override // s24.a, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.ipu;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPersonalInfo.class;
    }

    @Override // a24.i
    public int m7() {
        return 2;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.vfs.x1 m17;
        com.tencent.mars.xlog.Log.i("MircoMsg.SettingActivityAvatar", "onAcvityResult requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            if (i17 == 2 || i17 == 3 || i17 == 4) {
                new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new o24.c());
                return;
            }
            return;
        }
        if (i17 == 2) {
            if (intent == null) {
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("CropImageMode", 1);
            intent2.putExtra("CropImage_Filter", true);
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            intent2.putExtra("CropImage_OutputPath", com.tencent.mm.modelavatar.d1.Ai().i(c01.z1.r() + ".crop", true, false));
            intent2.putExtra("CropImage_ImgPath", (java.lang.String) null);
            intent2.putExtra("CropImage_from_scene", 3);
            ((com.tencent.mm.app.y7) f14.g.b()).q(getActivity(), intent, intent2, g83.a.a(), 4, null);
            return;
        }
        if (i17 == 3) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.app.Activity context = getContext();
            java.lang.String a17 = g83.a.a();
            ((ub0.r) oVar).getClass();
            java.lang.String b17 = com.tencent.mm.pluginsdk.ui.tools.l7.b(context, intent, a17);
            if (b17 == null) {
                return;
            }
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("CropImageMode", 1);
            intent3.putExtra("CropImage_OutputPath", b17);
            intent3.putExtra("CropImage_ImgPath", b17);
            intent3.putExtra("CropImage_from_scene", 3);
            ((com.tencent.mm.app.y7) f14.g.b()).p(getActivity(), intent3, 4);
            return;
        }
        if (i17 != 4) {
            return;
        }
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new o24.d());
        if (intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
        java.lang.String r17 = c01.z1.r();
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        android.graphics.Bitmap m18 = com.tencent.mm.modelavatar.d1.Ai().m(r17);
        if (stringExtra == null) {
            com.tencent.mars.xlog.Log.e("MircoMsg.SettingActivityAvatar", "crop picture failed");
            return;
        }
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(stringExtra);
        java.lang.String str = a18.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m19 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
        long j17 = 0;
        if (m19.a() && (m17 = m19.f213266a.m(m19.f213267b)) != null) {
            j17 = m17.f213233c;
        }
        com.tencent.mars.xlog.Log.i("MircoMsg.SettingActivityAvatar", "onActivityResult(CONTEXT_MENU_CROP_PICTURE)  file:%s, size:%d", stringExtra, java.lang.Long.valueOf(j17));
        kv.l0 l0Var = (kv.l0) i95.n0.c(kv.l0.class);
        android.app.Activity context2 = getContext();
        ((com.tencent.mm.feature.avatar.k0) l0Var).getClass();
        new com.tencent.mm.modelavatar.y0(context2, stringExtra, false).b(1, new o24.e(m18, this), true);
    }

    @Override // s24.a, a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        t7(getActivity().getIntent());
        if (j62.e.g().c(new com.tencent.mm.repairer.config.yuanbao.RepairerConfigYuanBaoMakingAvatarEnable()) == 1) {
            N7();
            return;
        }
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ui(getActivity());
    }
}
