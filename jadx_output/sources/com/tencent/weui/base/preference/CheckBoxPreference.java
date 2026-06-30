package com.tencent.weui.base.preference;

/* loaded from: classes3.dex */
public class CheckBoxPreference extends android.preference.Preference {

    /* renamed from: d, reason: collision with root package name */
    public boolean f220100d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f220101e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f220102f;

    /* renamed from: g, reason: collision with root package name */
    public int f220103g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f220104h;

    /* renamed from: i, reason: collision with root package name */
    public int f220105i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f220106m;

    public CheckBoxPreference(android.content.Context context) {
        this(context, null);
    }

    public boolean h() {
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f220101e;
        return mMSwitchBtn != null ? mMSwitchBtn.f211363x : this.f220100d;
    }

    public void i(int i17) {
        this.f220105i = i17;
        android.widget.TextView textView = this.f220102f;
        if (textView != null) {
            textView.setVisibility(i17);
        }
    }

    public void j(boolean z17) {
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f220101e;
        if (mMSwitchBtn != null) {
            this.f220100d = z17;
            mMSwitchBtn.setCheck(z17);
        }
    }

    @Override // android.preference.Preference
    public void onBindView(android.view.View view) {
        super.onBindView(view);
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) view.findViewById(com.tencent.mm.R.id.btf);
        this.f220101e = mMSwitchBtn;
        mMSwitchBtn.setSwitchListener(new ex5.a(this));
        this.f220101e.setCheck(this.f220100d);
        if (!isEnabled()) {
            this.f220101e.setEnabled(false);
            ((android.widget.TextView) view.findViewById(android.R.id.title)).setTextColor(view.getResources().getColor(com.tencent.mm.R.color.f478720fb));
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o_v);
        this.f220102f = textView;
        java.lang.String str = this.f220104h;
        int i17 = this.f220103g;
        this.f220103g = i17;
        this.f220104h = str;
        if (textView != null) {
            if (i17 > 0) {
                textView.setBackgroundResource(i17);
            }
            if (!android.text.TextUtils.isEmpty(this.f220104h)) {
                this.f220102f.setText(this.f220104h);
            }
        }
        i(this.f220105i);
    }

    @Override // android.preference.Preference
    public android.view.View onCreateView(android.view.ViewGroup viewGroup) {
        android.view.View onCreateView = super.onCreateView(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) onCreateView.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f489297c13, viewGroup2);
        this.f220106m = onCreateView;
        return onCreateView;
    }

    public CheckBoxPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckBoxPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f220100d = false;
        this.f220103g = -1;
        this.f220104h = "";
        this.f220105i = 8;
        setLayoutResource(com.tencent.mm.R.layout.byv);
    }
}
