package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSelectSexUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderSelectSexUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f128696h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f128697d = "Finder.FinderSelectSexUI";

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.SelectPreference f128698e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.SelectPreference f128699f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.SelectPreference f128700g;

    public final void V6() {
        com.tencent.mm.ui.base.preference.SelectPreference selectPreference = this.f128700g;
        if (selectPreference == null) {
            kotlin.jvm.internal.o.o("selectUnshow");
            throw null;
        }
        if (!selectPreference.P) {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference2 = this.f128699f;
            if (selectPreference2 == null) {
                kotlin.jvm.internal.o.o("selectFeMale");
                throw null;
            }
            if (!selectPreference2.P) {
                com.tencent.mm.ui.base.preference.SelectPreference selectPreference3 = this.f128698e;
                if (selectPreference3 == null) {
                    kotlin.jvm.internal.o.o("selectMale");
                    throw null;
                }
                if (!selectPreference3.P) {
                    enableOptionMenu(0, false);
                    return;
                }
            }
        }
        enableOptionMenu(0, true);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getFooterResourceId() {
        return com.tencent.mm.R.layout.b8p;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494882ak;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderSelectSexUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference != null ? preference.f197780q : null;
        if (str == null) {
            str = "";
        }
        if (kotlin.jvm.internal.o.b(str, "select_male")) {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference = this.f128698e;
            if (selectPreference == null) {
                kotlin.jvm.internal.o.o("selectMale");
                throw null;
            }
            selectPreference.P = true;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference2 = this.f128699f;
            if (selectPreference2 == null) {
                kotlin.jvm.internal.o.o("selectFeMale");
                throw null;
            }
            selectPreference2.P = false;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference3 = this.f128700g;
            if (selectPreference3 == null) {
                kotlin.jvm.internal.o.o("selectUnshow");
                throw null;
            }
            selectPreference3.P = false;
            if (rVar != null) {
                ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
            }
        } else if (kotlin.jvm.internal.o.b(str, "select_female")) {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference4 = this.f128698e;
            if (selectPreference4 == null) {
                kotlin.jvm.internal.o.o("selectMale");
                throw null;
            }
            selectPreference4.P = false;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference5 = this.f128699f;
            if (selectPreference5 == null) {
                kotlin.jvm.internal.o.o("selectFeMale");
                throw null;
            }
            selectPreference5.P = true;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference6 = this.f128700g;
            if (selectPreference6 == null) {
                kotlin.jvm.internal.o.o("selectUnshow");
                throw null;
            }
            selectPreference6.P = false;
        } else {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference7 = this.f128698e;
            if (selectPreference7 == null) {
                kotlin.jvm.internal.o.o("selectMale");
                throw null;
            }
            selectPreference7.P = false;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference8 = this.f128699f;
            if (selectPreference8 == null) {
                kotlin.jvm.internal.o.o("selectFeMale");
                throw null;
            }
            selectPreference8.P = false;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference9 = this.f128700g;
            if (selectPreference9 == null) {
                kotlin.jvm.internal.o.o("selectUnshow");
                throw null;
            }
            selectPreference9.P = true;
        }
        V6();
        if (rVar != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        }
        return false;
    }
}
