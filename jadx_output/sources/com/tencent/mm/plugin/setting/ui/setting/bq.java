package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class bq extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.base.MaskLayout f160883d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f160884e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f160885f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f160886g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f160887h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.LinearLayout f160888i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.CheckBox f160889m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f160890n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.LinearLayout f160891o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI f160892p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq(com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI, android.view.View view) {
        super(view);
        this.f160892p = unfamiliarContactDetailUI;
        this.f160890n = view;
        this.f160883d = (com.tencent.mm.ui.base.MaskLayout) view.findViewById(com.tencent.mm.R.id.ca6);
        this.f160884e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cen);
        this.f160885f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483870ca5);
        this.f160886g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.cfo);
        this.f160887h = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.cfp);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.btg);
        this.f160888i = linearLayout;
        this.f160889m = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.btf);
        this.f160891o = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.hhc);
        linearLayout.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.zp(this, unfamiliarContactDetailUI));
        view.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.aq(this, unfamiliarContactDetailUI));
    }
}
