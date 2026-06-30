package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes.dex */
public final class p extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.owo);
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            android.view.View inflate = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.czj, (android.view.ViewGroup) null);
            com.tencent.mm.ui.bk.s0(((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gzf)).getPaint());
            frameLayout.addView(inflate);
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.bzi);
            if (findViewById != null) {
                findViewById.setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.o(this));
            }
        }
    }
}
