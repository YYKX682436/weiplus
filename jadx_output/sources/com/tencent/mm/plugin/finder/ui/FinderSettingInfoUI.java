package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingInfoUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderSettingInfoUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f128721p = 0;

    /* renamed from: e, reason: collision with root package name */
    public ya2.b2 f128723e;

    /* renamed from: f, reason: collision with root package name */
    public r45.nc4 f128724f;

    /* renamed from: g, reason: collision with root package name */
    public r45.d1 f128725g;

    /* renamed from: h, reason: collision with root package name */
    public az2.f f128726h;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo f128728m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f128729n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f128722d = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f128727i = "";

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f128730o = jz5.h.b(new com.tencent.mm.plugin.finder.ui.ug(this));

    public final boolean V6(android.content.Context context) {
        m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(context), false, 2, null);
        return ((j37 != null ? j37.field_extFlag : 0) & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0;
    }

    public final void W6() {
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_avatar");
        kotlin.jvm.internal.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.HeadImgAndNamePreference");
        com.tencent.mm.ui.base.preference.HeadImgAndNamePreference headImgAndNamePreference = (com.tencent.mm.ui.base.preference.HeadImgAndNamePreference) h17;
        ya2.g gVar = ya2.h.f460484a;
        java.lang.String str = this.f128722d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        ya2.b2 b17 = gVar.b(str);
        headImgAndNamePreference.L(b17 != null ? b17.w0() : null);
        com.tencent.mm.plugin.finder.ui.ah ahVar = new com.tencent.mm.plugin.finder.ui.ah(b17);
        headImgAndNamePreference.T = ahVar;
        headImgAndNamePreference.R = true;
        java.lang.String str2 = this.f128722d;
        headImgAndNamePreference.Q = null;
        android.widget.ImageView imageView = headImgAndNamePreference.M;
        if (imageView != null) {
            ahVar.a(str2, imageView, true);
        } else {
            headImgAndNamePreference.Q = str2;
        }
        if (str2 == null) {
            headImgAndNamePreference.S = false;
        } else {
            headImgAndNamePreference.S = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ad  */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X6(boolean r30) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI.X6(boolean):void");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494885am;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1000) {
            if (intent != null ? intent.getBooleanExtra("NEED_REFRESH_AVATAR", false) : false) {
                W6();
                setResult(-1, intent);
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.ny.l7(nyVar, 130, 0, null, 6, null);
        }
        java.lang.String stringExtra = getIntent().getStringExtra("finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f128722d = stringExtra;
        if (stringExtra.length() == 0) {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            this.f128722d = xy2.c.e(context);
        }
        com.tencent.mars.xlog.Log.i("FinderSettingInfoUI", "myFinderUser " + this.f128722d);
        setMMTitle(com.tencent.mm.R.string.mru);
        setBackBtn(new com.tencent.mm.plugin.finder.ui.vg(this));
        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_qq_music_switch", true);
        W6();
        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).notifyDataSetChanged();
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderSettingInfoUI)).Rj(this, iy1.a.Finder);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 12, 27010);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new com.tencent.mm.plugin.finder.ui.wg(((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(this).c(zy2.ra.class))).V6(), this));
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0520  */
    @Override // com.tencent.mm.ui.base.preference.MMPreference
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r r26, com.tencent.mm.ui.base.preference.Preference r27) {
        /*
            Method dump skipped, instructions count: 1550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI.onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r, com.tencent.mm.ui.base.preference.Preference):boolean");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getContentView().post(new com.tencent.mm.plugin.finder.ui.xg(this));
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3.Mj((com.tencent.mm.plugin.finder.report.o3) c17, this, 1L, 2L, false, 0, 0, null, 120, null);
        i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3.Mj((com.tencent.mm.plugin.finder.report.o3) c18, this, 2L, 2L, false, 0, 0, null, 120, null);
        i95.m c19 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3.Mj((com.tencent.mm.plugin.finder.report.o3) c19, this, 5L, 2L, false, 0, 0, null, 120, null);
        m92.b j37 = g92.a.j3(g92.b.f269769e, this.f128722d, false, 2, null);
        r45.nc4 u07 = j37 != null ? j37.u0() : null;
        this.f128724f = u07;
        this.f128725g = u07 != null ? (r45.d1) u07.getCustom(9) : null;
        X6(false);
        kotlinx.coroutines.l.d(getLifecycleAsyncScope(), null, null, new com.tencent.mm.plugin.finder.ui.sg(this, null), 3, null);
    }
}
