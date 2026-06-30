package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SnsSightUploadSayFooter extends com.tencent.mm.ui.BasePanelKeybordLayout {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f167388t = 0;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f167389n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel f167390o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f167391p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageButton f167392q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SightRangeWidget f167393r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SightLocationWidget f167394s;

    public SnsSightUploadSayFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f167391p = null;
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        this.f167389n = mMActivity;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.ctk, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCommentModeView", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        android.widget.ImageButton imageButton = (android.widget.ImageButton) viewGroup.findViewById(com.tencent.mm.R.id.f482835p9);
        this.f167392q = imageButton;
        imageButton.setOnClickListener(new com.tencent.mm.plugin.sns.ui.hq(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCommentModeView", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSmilayPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        if (com.tencent.mm.pluginsdk.ui.chat.i6.a() == null) {
            this.f167390o = new com.tencent.mm.pluginsdk.ui.chat.t5(mMActivity);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSmilayPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        } else {
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel wi6 = ((g30.c0) com.tencent.mm.pluginsdk.ui.chat.i6.a()).wi(getContext());
            this.f167390o = wi6;
            wi6.setEntranceScene(2);
            this.f167390o.setSearchSource(6);
            this.f167390o.setVisibility(8);
            ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.m7g)).addView(this.f167390o, -1, 0);
            this.f167390o.c();
            this.f167390o.i();
            this.f167390o.setOnTextOperationListener(new com.tencent.mm.plugin.sns.ui.iq(this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSmilayPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initRangeWidget", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.tencent.mm.plugin.sns.ui.SightRangeWidget sightRangeWidget = (com.tencent.mm.plugin.sns.ui.SightRangeWidget) viewGroup.findViewById(com.tencent.mm.R.id.li_);
        this.f167393r = sightRangeWidget;
        sightRangeWidget.a(null);
        this.f167393r.f166614w = 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initRangeWidget", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initLocationWidget", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        this.f167394s = (com.tencent.mm.plugin.sns.ui.SightLocationWidget) viewGroup.findViewById(com.tencent.mm.R.id.f485692io1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initLocationWidget", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
    }

    public static /* synthetic */ com.tencent.mm.ui.widget.MMEditText i(com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter snsSightUploadSayFooter) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.tencent.mm.ui.widget.MMEditText mMEditText = snsSightUploadSayFooter.f167391p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        return mMEditText;
    }

    public r45.ed4 getLocation() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.mm.plugin.appbrand.jsapi.lbs.e0.NAME, "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        r45.ed4 location = this.f167394s.getLocation();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.mm.plugin.appbrand.jsapi.lbs.e0.NAME, "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        return location;
    }

    @Override // com.tencent.mm.ui.BasePanelKeybordLayout
    public java.util.List<android.view.View> getPanelView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPanelView", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f167390o);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPanelView", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        return arrayList;
    }

    public void setMMEditText(com.tencent.mm.ui.widget.MMEditText mMEditText) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMMEditText", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        this.f167391p = mMEditText;
        mMEditText.setOnClickListener(new com.tencent.mm.plugin.sns.ui.eq(this));
        mMEditText.setOnEditorActionListener(new com.tencent.mm.plugin.sns.ui.fq(this));
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.sns.ui.gq(this), 200L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMMEditText", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
    }
}
