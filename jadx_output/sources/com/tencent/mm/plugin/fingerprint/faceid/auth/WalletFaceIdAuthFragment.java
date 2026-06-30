package com.tencent.mm.plugin.fingerprint.faceid.auth;

/* loaded from: classes14.dex */
public class WalletFaceIdAuthFragment extends androidx.appcompat.app.AppCompatDialogFragment {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Dialog f136980d;

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog walletFaceIdDialog = new com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog(getActivity(), null, null);
        this.f136980d = walletFaceIdDialog;
        walletFaceIdDialog.setCancelable(false);
        return this.f136980d;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        getDialog().requestWindowFeature(1);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        android.app.Dialog dialog = this.f136980d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
