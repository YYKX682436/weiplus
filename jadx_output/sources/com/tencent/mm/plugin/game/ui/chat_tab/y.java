package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class y extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f141332d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f141333e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f141334f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f141335g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f141336h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f141337i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.z f141338m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.game.ui.chat_tab.z zVar, android.view.View view) {
        super(view);
        this.f141338m = zVar;
        this.f141332d = new java.util.HashMap();
        this.f141333e = true;
        this.f141334f = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bge);
        this.f141335g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bgf);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.osr);
        this.f141336h = textView;
        textView.setBackgroundResource(com.tencent.mm.ui.tools.pd.a(zVar.f141344f.f141123f2));
        this.f141337i = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.osw);
    }
}
