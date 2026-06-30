package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingDetailInfoUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "Lzy2/gc;", "Lr45/ri2;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public class FinderSettingDetailInfoUI extends com.tencent.mm.ui.base.preference.MMPreference implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f128709d = "Finder.FinderSettingDetailInfoUI";

    /* renamed from: e, reason: collision with root package name */
    public final int f128710e = 1000;

    /* renamed from: f, reason: collision with root package name */
    public final int f128711f = 1001;

    /* renamed from: g, reason: collision with root package name */
    public final int f128712g = 1002;

    /* renamed from: h, reason: collision with root package name */
    public final int f128713h = 1003;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f128714i = "";

    /* renamed from: m, reason: collision with root package name */
    public ya2.b2 f128715m;

    /* renamed from: n, reason: collision with root package name */
    public r45.lk2 f128716n;

    /* renamed from: o, reason: collision with root package name */
    public android.app.ProgressDialog f128717o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.ui.sd f128718p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f128719q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f128720r;

    public static final void W6(com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI finderSettingDetailInfoUI) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_scene", 1);
        intent.putExtra("finder_username", finderSettingDetailInfoUI.f128714i);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Ok(finderSettingDetailInfoUI, intent);
    }

    public static final void X6(com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI finderSettingDetailInfoUI, int i17) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(finderSettingDetailInfoUI);
        u1Var.g(finderSettingDetailInfoUI.getString(i17));
        u1Var.a(true);
        u1Var.n(finderSettingDetailInfoUI.getString(com.tencent.mm.R.string.chv));
        u1Var.q(false);
    }

    public final void V6() {
        if (this.f128720r) {
            return;
        }
        kotlinx.coroutines.l.d(getLifecycleAsyncScope(), null, null, new com.tencent.mm.plugin.finder.ui.lg(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y6() {
        /*
            Method dump skipped, instructions count: 969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI.Y6():void");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494884al;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        int i19;
        super.onActivityResult(i17, i18, intent);
        int i27 = this.f128710e;
        int i28 = this.f128711f;
        java.lang.String str3 = this.f128709d;
        if (i17 == i27) {
            if (intent == null || i18 != -1) {
                return;
            }
            setIntent(new android.content.Intent());
            java.lang.String b17 = com.tencent.mm.ui.tools.i1.b(getContext(), intent, g83.a.a());
            if (com.tencent.mm.sdk.platformtools.t8.K0(b17) || !com.tencent.mm.vfs.w6.j(b17)) {
                com.tencent.mars.xlog.Log.w(str3, "no img select");
                return;
            }
            getIntent().putExtra("key_source_img_path", b17);
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Intent intent2 = getIntent();
            i0Var.getClass();
            ((w40.e) i95.n0.c(w40.e.class)).getClass();
            qs2.v.f366327a.b(this, intent2, i28);
            return;
        }
        if (i17 == i28) {
            if (intent == null || i18 != -1) {
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("key_result_img_path");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) || !com.tencent.mm.vfs.w6.j(stringExtra)) {
                com.tencent.mars.xlog.Log.w(str3, "no avatar set");
                return;
            }
            com.tencent.mars.xlog.Log.i(str3, "avatar file length %d KB", java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(stringExtra) / 1024));
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.s0 s0Var = hb2.s0.f280090e;
            kotlin.jvm.internal.o.d(stringExtra);
            java.lang.String str4 = this.f128714i;
            s0Var.getClass();
            dn.m mVar = new dn.m();
            mVar.f241785d = "task_NetSceneUploadHead";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finder_headimg_upload_");
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            sb6.append(com.tencent.mm.sdk.platformtools.w2.b(stringExtra.getBytes()));
            mVar.field_mediaId = sb6.toString();
            mVar.field_priority = 2;
            mVar.field_needStorage = true;
            mVar.field_fullpath = stringExtra;
            mVar.field_fileType = 20301;
            mVar.field_appType = com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT;
            mVar.field_force_aeskeycdn = false;
            mVar.field_trysafecdn = true;
            mVar.field_enable_hitcheck = false;
            mVar.field_talker = "";
            mVar.field_isStreamMedia = false;
            mVar.field_bzScene = 2;
            hb2.n0 n0Var = new hb2.n0(str4, this, stringExtra);
            java.lang.String str5 = "start cdn upload task taskName:" + mVar.f241785d + " pullpath:" + mVar.field_fullpath;
            java.lang.String str6 = hb2.s0.f280091f;
            com.tencent.mars.xlog.Log.i(str6, str5);
            if (((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ui(mVar, new java.lang.ref.WeakReference(n0Var)) == null) {
                com.tencent.mars.xlog.Log.e(str6, "cdn addSendTask failed taskName:" + mVar.f241785d);
            }
            showProgress();
            return;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == this.f128712g) {
            if (intent == null || i18 != -1) {
                return;
            }
            java.lang.String stringExtra2 = intent.getStringExtra("Country");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            java.lang.String stringExtra3 = intent.getStringExtra("Contact_Province");
            java.lang.String str7 = stringExtra3 == null ? "" : stringExtra3;
            java.lang.String stringExtra4 = intent.getStringExtra("Contact_City");
            java.lang.String str8 = stringExtra4 == null ? "" : stringExtra4;
            com.tencent.mars.xlog.Log.i(str3, "countryCode " + stringExtra2 + " provinceCode" + str7 + " cityCode" + str8);
            if (kotlin.jvm.internal.o.b(stringExtra2, "unshow")) {
                g92.b bVar = g92.b.f269769e;
                ya2.b2 b2Var = this.f128715m;
                java.lang.String str9 = b2Var != null ? b2Var.field_username : null;
                if (str9 == null) {
                    str9 = "";
                }
                m92.b j37 = g92.a.j3(bVar, str9, false, 2, null);
                int i29 = (j37 != null ? j37.field_extFlag : 0) & (-5);
                ya2.b2 b2Var2 = this.f128715m;
                java.lang.String str10 = b2Var2 != null ? b2Var2.field_username : null;
                if (str10 == null) {
                    str10 = "";
                }
                m92.c cVar = new m92.c(str10);
                cVar.field_extFlag = i29;
                m92.j jVar = m92.j.f324997o;
                bVar.C(cVar, jVar);
                ya2.b2 b2Var3 = this.f128715m;
                java.lang.String str11 = b2Var3 != null ? b2Var3.field_username : null;
                if (str11 == null) {
                    str11 = "";
                }
                m92.c cVar2 = new m92.c(str11);
                cVar2.field_extFlag = i29;
                bVar.C(cVar2, jVar);
                i19 = 1;
                str2 = "";
            } else {
                str2 = stringExtra2;
                i19 = 0;
            }
            ya2.b2 b2Var4 = this.f128715m;
            if (b2Var4 != null) {
                r45.hz0 hz0Var = b2Var4.field_extInfo;
                if (hz0Var != null) {
                    hz0Var.set(0, str2);
                    hz0Var.set(1, str7);
                    hz0Var.set(2, str8);
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    r45.hz0 hz0Var2 = new r45.hz0();
                    b2Var4.field_extInfo = hz0Var2;
                    hz0Var2.set(0, str2);
                    b2Var4.field_extInfo.set(1, str7);
                    b2Var4.field_extInfo.set(2, str8);
                }
                ya2.h.f460484a.o(b2Var4);
                this.f128720r = true;
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.s0.f280090e.r(str2, str7, str8, i19, this, this.f128714i);
            pm0.v.X(com.tencent.mm.plugin.finder.ui.mg.f129523d);
            showProgress();
            return;
        }
        if (i17 != this.f128713h) {
            com.tencent.mars.xlog.Log.i(str3, "handleActivityResult by selectProfileCoverHelper: " + i17 + ' ' + i18);
            com.tencent.mm.plugin.finder.ui.sd sdVar = this.f128718p;
            if (sdVar != null) {
                com.tencent.mm.ui.MMActivity mMActivity = sdVar.f129803a;
                switch (i17) {
                    case 2000:
                        com.tencent.mars.xlog.Log.i("Finder.SelectCoverHelper", "REQUEST_CODE_CAPTURE_PROFILE_COVER return");
                        return;
                    case 2001:
                        if (intent == null || i18 != -1) {
                            return;
                        }
                        java.lang.String b18 = com.tencent.mm.ui.tools.i1.b(mMActivity, intent, g83.a.a());
                        kotlin.jvm.internal.o.d(b18);
                        sdVar.c(b18);
                        return;
                    case 2002:
                        if (intent == null || i18 != -1) {
                            return;
                        }
                        java.lang.String stringExtra5 = intent.getStringExtra("key_result_img_path");
                        sdVar.d();
                        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra5) || !com.tencent.mm.vfs.w6.j(stringExtra5)) {
                            com.tencent.mars.xlog.Log.w("Finder.SelectCoverHelper", "no profile cover set");
                            az2.f fVar = sdVar.f129804b;
                            if (fVar != null) {
                                fVar.b();
                            }
                            db5.t7.g(mMActivity, sdVar.b(com.tencent.mm.R.string.f9c));
                            return;
                        }
                        java.lang.String str12 = stringExtra5 != null ? stringExtra5 : "";
                        com.tencent.mm.plugin.finder.ui.kd kdVar = new com.tencent.mm.plugin.finder.ui.kd(sdVar, stringExtra5);
                        so2.w5 w5Var = sdVar.f129805c;
                        w5Var.getClass();
                        pf5.e.launch$default(w5Var, null, null, new so2.r5(str12, w5Var, kdVar, null), 3, null);
                        return;
                    case 2003:
                        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                        android.content.Context applicationContext = mMActivity.getApplicationContext();
                        java.lang.String a17 = g83.a.a();
                        ((ub0.r) oVar).getClass();
                        java.lang.String b19 = com.tencent.mm.pluginsdk.ui.tools.l7.b(applicationContext, intent, a17);
                        if (b19 != null) {
                            com.tencent.mars.xlog.Log.i("Finder.SelectCoverHelper", "REQUEST_CODE_CAPTURE_PROFILE_COVER_OLD: path:".concat(b19));
                            sdVar.c(b19);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
            return;
        }
        if (intent == null || i18 != -1) {
            return;
        }
        java.lang.String stringExtra6 = intent.getStringExtra("key_output_sex");
        if (stringExtra6 == null) {
            stringExtra6 = "";
        }
        if (stringExtra6.length() > 0) {
            g92.b bVar2 = g92.b.f269769e;
            ya2.b2 b2Var5 = this.f128715m;
            java.lang.String str13 = b2Var5 != null ? b2Var5.field_username : null;
            if (str13 == null) {
                str13 = "";
            }
            m92.b j38 = g92.a.j3(bVar2, str13, false, 2, null);
            int i37 = j38 != null ? j38.field_extFlag : 0;
            ya2.b2 b2Var6 = this.f128715m;
            if (b2Var6 != null) {
                int hashCode = stringExtra6.hashCode();
                if (hashCode != -1278174388) {
                    if (hashCode != -840239850) {
                        if (hashCode != 3343885 || !stringExtra6.equals("male")) {
                            return;
                        }
                        r45.hz0 hz0Var3 = b2Var6.field_extInfo;
                        if (hz0Var3 != null) {
                            hz0Var3.set(3, 1);
                        } else {
                            f0Var = null;
                        }
                        if (f0Var == null) {
                            r45.hz0 hz0Var4 = new r45.hz0();
                            b2Var6.field_extInfo = hz0Var4;
                            hz0Var4.set(3, 1);
                        }
                        ya2.h.f460484a.o(b2Var6);
                        int i38 = i37 | 8;
                        ya2.b2 b2Var7 = this.f128715m;
                        str = b2Var7 != null ? b2Var7.field_username : null;
                        m92.c cVar3 = new m92.c(str != null ? str : "");
                        cVar3.field_extFlag = i38;
                        bVar2.C(cVar3, m92.j.f324997o);
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        hb2.s0 s0Var2 = hb2.s0.f280090e;
                        r45.hz0 hz0Var5 = b2Var6.field_extInfo;
                        s0Var2.t(hz0Var5 != null ? hz0Var5.getInteger(3) : 0, 0, this, this.f128714i);
                    } else {
                        if (!stringExtra6.equals("unshow")) {
                            return;
                        }
                        r45.hz0 hz0Var6 = b2Var6.field_extInfo;
                        if (hz0Var6 != null) {
                            hz0Var6.set(3, 0);
                        } else {
                            f0Var = null;
                        }
                        if (f0Var == null) {
                            r45.hz0 hz0Var7 = new r45.hz0();
                            b2Var6.field_extInfo = hz0Var7;
                            hz0Var7.set(3, 0);
                        }
                        ya2.h.f460484a.o(b2Var6);
                        int i39 = i37 & (-9);
                        ya2.b2 b2Var8 = this.f128715m;
                        str = b2Var8 != null ? b2Var8.field_username : null;
                        m92.c cVar4 = new m92.c(str != null ? str : "");
                        cVar4.field_extFlag = i39;
                        bVar2.C(cVar4, m92.j.f324997o);
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        hb2.s0 s0Var3 = hb2.s0.f280090e;
                        r45.hz0 hz0Var8 = b2Var6.field_extInfo;
                        s0Var3.t(hz0Var8 != null ? hz0Var8.getInteger(3) : 0, 1, this, this.f128714i);
                    }
                } else {
                    if (!stringExtra6.equals("female")) {
                        return;
                    }
                    r45.hz0 hz0Var9 = b2Var6.field_extInfo;
                    if (hz0Var9 != null) {
                        hz0Var9.set(3, 2);
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        r45.hz0 hz0Var10 = new r45.hz0();
                        b2Var6.field_extInfo = hz0Var10;
                        hz0Var10.set(3, 2);
                    }
                    ya2.h.f460484a.o(b2Var6);
                    int i47 = i37 | 8;
                    ya2.b2 b2Var9 = this.f128715m;
                    str = b2Var9 != null ? b2Var9.field_username : null;
                    m92.c cVar5 = new m92.c(str != null ? str : "");
                    cVar5.field_extFlag = i47;
                    bVar2.C(cVar5, m92.j.f324997o);
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    hb2.s0 s0Var4 = hb2.s0.f280090e;
                    r45.hz0 hz0Var11 = b2Var6.field_extInfo;
                    s0Var4.t(hz0Var11 != null ? hz0Var11.getInteger(3) : 0, 0, this, this.f128714i);
                }
                this.f128720r = true;
                pm0.v.X(com.tencent.mm.plugin.finder.ui.ng.f129554d);
            }
            showProgress();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f128714i = stringExtra;
        if (stringExtra.length() == 0) {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            this.f128714i = xy2.c.e(context);
        }
        com.tencent.mars.xlog.Log.i(this.f128709d, "myFinderUser " + this.f128714i);
        setMMTitle(com.tencent.mm.R.string.f4a);
        this.f128718p = new com.tencent.mm.plugin.finder.ui.sd(this, this.f128714i);
        setBackBtn(new com.tencent.mm.plugin.finder.ui.og(this));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.finder.ui.sd sdVar = this.f128718p;
        if (sdVar != null) {
            sdVar.f129805c.onCleared();
        }
        this.f128718p = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e8  */
    @Override // com.tencent.mm.ui.base.preference.MMPreference
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r r13, com.tencent.mm.ui.base.preference.Preference r14) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI.onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r, com.tencent.mm.ui.base.preference.Preference):boolean");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeLongClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference, android.view.View view) {
        java.util.LinkedList list;
        java.lang.Object obj;
        java.lang.String string;
        kotlin.jvm.internal.o.d(preference);
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i(this.f128709d, "long click " + str);
        if (!kotlin.jvm.internal.o.b(str, "settings_finder_id")) {
            return super.onPreferenceTreeLongClick(rVar, preference, view);
        }
        r45.lk2 lk2Var = this.f128716n;
        if (lk2Var != null && (list = lk2Var.getList(20)) != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.ac5) next).getCustom(1);
                if (kotlin.jvm.internal.o.b(finderContact != null ? finderContact.getUsername() : null, this.f128714i)) {
                    obj = next;
                    break;
                }
            }
            r45.ac5 ac5Var = (r45.ac5) obj;
            if (ac5Var != null && (string = ac5Var.getString(41)) != null) {
                com.tencent.mm.sdk.platformtools.b0.e(string);
                db5.t7.m(getContext(), getContext().getResources().getString(com.tencent.mm.R.string.ewg));
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        V6();
        Y6();
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        android.app.ProgressDialog progressDialog = this.f128717o;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (ret.getInteger(1) == 0) {
            db5.t7.makeText(this, getString(com.tencent.mm.R.string.f9d), 0).show();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("NEED_REFRESH_AVATAR", true);
            setResult(-1, intent);
        } else {
            db5.t7.makeText(this, getString(com.tencent.mm.R.string.f9b), 0).show();
        }
        if (this.f128720r || ret.getInteger(1) == 0) {
            this.f128720r = false;
            V6();
        }
    }

    public final void showProgress() {
        android.app.ProgressDialog progressDialog = this.f128717o;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f128717o = db5.e1.Q(this, "", getString(com.tencent.mm.R.string.f490552yb), true, false, null);
    }
}
