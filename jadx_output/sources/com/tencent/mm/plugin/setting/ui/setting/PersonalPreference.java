package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class PersonalPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.ImageView L;
    public int M;
    public java.lang.String N;

    public PersonalPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = null;
        this.M = -1;
        this.N = null;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        if (this.L == null) {
            this.L = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9o);
        }
        int i17 = this.M;
        if (i17 > 0) {
            this.L.setImageResource(i17);
        } else if (this.N != null) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.L, this.N, null);
        }
        this.L.setOnClickListener(null);
        super.t(view);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f197770d, com.tencent.mm.R.layout.bzr, viewGroup2);
        return u17;
    }

    public PersonalPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = null;
        this.M = -1;
        this.N = null;
        this.G = com.tencent.mm.R.layout.byv;
        this.H = com.tencent.mm.R.layout.f489294c10;
    }
}
