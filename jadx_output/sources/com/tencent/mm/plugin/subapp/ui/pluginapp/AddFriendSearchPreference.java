package com.tencent.mm.plugin.subapp.ui.pluginapp;

/* loaded from: classes3.dex */
public class AddFriendSearchPreference extends com.tencent.mm.ui.base.preference.Preference {
    public java.lang.String L;
    public android.view.View.OnClickListener M;
    public android.widget.TextView N;
    public android.view.View P;

    public AddFriendSearchPreference(android.content.Context context) {
        this(context, null);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        view.setOnTouchListener(new gg4.a(this));
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.mmz);
        this.N = textView;
        textView.setText(this.L);
        this.N.setContentDescription(this.L);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.mes);
        this.P = findViewById;
        if (this.M != null) {
            findViewById.setOnClickListener(new gg4.b(this));
        }
        E(8);
    }

    public AddFriendSearchPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddFriendSearchPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
        this.M = null;
        this.N = null;
        this.P = null;
        this.G = com.tencent.mm.R.layout.bz9;
    }
}
