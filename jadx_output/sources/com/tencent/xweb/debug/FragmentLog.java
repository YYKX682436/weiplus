package com.tencent.xweb.debug;

/* loaded from: classes13.dex */
public class FragmentLog extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f220250d;

    public FragmentLog(qx5.l lVar) {
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View inflate = layoutInflater.inflate(com.tencent.xwebsdk.R.layout.xweb_debug_fragment_log, viewGroup, false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.xwebsdk.R.id.text_view_log);
        this.f220250d = textView;
        by5.w wVar = by5.c4.f36423a;
        android.content.SharedPreferences a17 = by5.d4.a("UPDATELOG", true);
        textView.setText(a17 != null ? a17.getString("log", "") : "");
        this.f220250d.setOnLongClickListener(new qx5.h(this));
        return inflate;
    }
}
