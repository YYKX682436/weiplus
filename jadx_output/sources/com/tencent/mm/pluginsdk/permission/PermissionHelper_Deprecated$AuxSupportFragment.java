package com.tencent.mm.pluginsdk.permission;

/* loaded from: classes13.dex */
public final class PermissionHelper_Deprecated$AuxSupportFragment extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment {
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (isDetached()) {
            return;
        }
        synchronized (j35.a0.f297497c) {
            android.support.v4.media.f.a(((java.util.HashMap) j35.a0.f297498d).remove(java.lang.Integer.valueOf(i17)));
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i17, strArr, iArr);
        if (isDetached()) {
            return;
        }
        byte[] bArr = j35.a0.f297495a;
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        synchronized (j35.a0.f297495a) {
            android.support.v4.media.f.a(((java.util.HashMap) j35.a0.f297496b).remove(java.lang.Integer.valueOf(i17)));
        }
    }
}
