package com.tencent.mm.plugin.profile.logic;

/* loaded from: classes9.dex */
public class OpenIMPreference extends com.tencent.mm.ui.base.preference.KeyValuePreference {

    /* renamed from: p1, reason: collision with root package name */
    public final java.lang.String f153523p1;

    /* renamed from: x1, reason: collision with root package name */
    public j41.e0 f153524x1;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f153525y1;

    public OpenIMPreference(android.content.Context context) {
        super(context);
        this.f153523p1 = "MicroMsg.OpenIMPreference";
        this.f153524x1 = null;
        this.f153525y1 = false;
    }

    @Override // com.tencent.mm.ui.base.preference.KeyValuePreference, com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        j41.e0 e0Var = this.f153524x1;
        if (e0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f153523p1, "onBindView detail null");
            return;
        }
        android.widget.TextView textView = this.L;
        if (textView != null) {
            int i17 = e0Var.f297622d;
            if (i17 == 2 || i17 == 3) {
                textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193075e.getColorStateList(com.tencent.mm.R.color.a0x));
            }
        }
        if (this.Y == null || android.text.TextUtils.isEmpty(this.f153524x1.f297619a)) {
            return;
        }
        this.Y.setVisibility(0);
        n11.a.b().g(this.f153524x1.f297619a, this.Y);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.Y.getLayoutParams();
        int i18 = this.f153524x1.f297624f;
        layoutParams.width = i18 > 0 ? com.tencent.mm.ui.zk.a(this.f197770d, i18) : com.tencent.mm.ui.zk.a(this.f197770d, 16);
        int i19 = this.f153524x1.f297625g;
        layoutParams.height = i19 > 0 ? com.tencent.mm.ui.zk.a(this.f197770d, i19) : com.tencent.mm.ui.zk.a(this.f197770d, 16);
        this.Y.setLayoutParams(layoutParams);
    }

    @Override // com.tencent.mm.ui.base.preference.KeyValuePreference, com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        this.Q = true;
        if (!this.f153525y1) {
            return super.u(viewGroup);
        }
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.tencent.mm.R.layout.bzl, viewGroup2);
        return u17;
    }

    public OpenIMPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f153523p1 = "MicroMsg.OpenIMPreference";
        this.f153524x1 = null;
        this.f153525y1 = false;
    }

    public OpenIMPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f153523p1 = "MicroMsg.OpenIMPreference";
        this.f153524x1 = null;
        this.f153525y1 = false;
    }
}
