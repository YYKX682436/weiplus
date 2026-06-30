package com.tencent.xweb.debug;

/* loaded from: classes13.dex */
public class FragmentInfo extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment {

    /* renamed from: d, reason: collision with root package name */
    public final qx5.l f220248d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f220249e;

    public FragmentInfo(qx5.l lVar) {
        this.f220248d = lVar;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View inflate = layoutInflater.inflate(com.tencent.xwebsdk.R.layout.xweb_debug_fragment_info, viewGroup, false);
        this.f220249e = (android.widget.TextView) inflate.findViewById(com.tencent.xwebsdk.R.id.text_view_info);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        qx5.l lVar = this.f220248d;
        sb6.append(qx5.x.c(lVar.getWebView()));
        sb6.append("\n");
        sb6.append(qx5.x.b(lVar.getWebView()));
        sb6.append("\n");
        sb6.append(qx5.u.d());
        this.f220249e.setText(sb6.toString());
        this.f220249e.setOnLongClickListener(new qx5.g(this));
        return inflate;
    }
}
