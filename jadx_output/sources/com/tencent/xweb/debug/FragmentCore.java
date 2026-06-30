package com.tencent.xweb.debug;

/* loaded from: classes13.dex */
public class FragmentCore extends androidx.preference.PreferenceFragmentCompat implements androidx.preference.o {

    /* renamed from: p, reason: collision with root package name */
    public final qx5.l f220246p;

    /* renamed from: q, reason: collision with root package name */
    public final qx5.f f220247q = new qx5.f();

    public FragmentCore(qx5.l lVar) {
        this.f220246p = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.preference.PreferenceFragmentCompat, androidx.preference.b0
    public boolean H(androidx.preference.Preference preference) {
        by5.c4.f("FragmentCore", "onPreferenceTreeClick, key:" + preference.f11758r);
        boolean z17 = preference instanceof com.tencent.xweb.debug.XWebTraceFileListPreference;
        qx5.l lVar = this.f220246p;
        if (z17) {
            ((qx5.m) preference).b(lVar);
        }
        if (!(preference instanceof com.tencent.xweb.debug.XWebDebugPreference) && !(preference instanceof com.tencent.xweb.debug.XWebDebugSwitchPreference)) {
            if (preference.f11760t == null) {
                return false;
            }
            getActivity();
            return false;
        }
        qx5.m mVar = (qx5.m) preference;
        qx5.a b17 = mVar.b(lVar);
        by5.c4.f("FragmentCore", "onPreferenceTreeClick, debugKey:" + mVar.h() + ", commandResult:" + b17);
        if (lVar == null) {
            return true;
        }
        lVar.e(getContext(), b17);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.preference.o
    public boolean h0(androidx.preference.Preference preference, java.lang.Object obj) {
        by5.c4.f("FragmentCore", "onPreferenceChange, key:" + preference.f11758r + ", newValue:" + obj);
        if (!(preference instanceof com.tencent.xweb.debug.XWebDebugEditTextPreference) && !(preference instanceof com.tencent.xweb.debug.XWebDebugListPreference) && !(preference instanceof com.tencent.xweb.debug.XWebTraceFileListPreference)) {
            return false;
        }
        qx5.m mVar = (qx5.m) preference;
        qx5.l lVar = this.f220246p;
        qx5.a a17 = mVar.a(lVar, obj);
        by5.c4.f("FragmentCore", "onPreferenceChange, debugKey:" + mVar.h() + ", commandResult:" + a17);
        if (lVar != null) {
            lVar.e(getContext(), a17);
        }
        n0();
        return true;
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public void l0(android.os.Bundle bundle, java.lang.String str) {
        androidx.preference.Preference j07;
        m0(com.tencent.xwebsdk.R.xml.fragment_core_preferences, str);
        this.f220247q.b(this.f11775d.f11800g, this);
        if (!"com.tencent.mm".equalsIgnoreCase(org.xwalk.core.XWalkEnvironment.l()) && (j07 = j0("pref_category_wechat")) != null) {
            j07.I(false);
        }
        n0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c9, code lost:
    
        if (r5 == 0) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0() {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.debug.FragmentCore.n0():void");
    }
}
