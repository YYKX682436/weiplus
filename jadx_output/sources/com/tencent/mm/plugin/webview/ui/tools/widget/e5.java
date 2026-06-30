package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes9.dex */
public final class e5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.ImageView f187193a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.LinearLayout f187194b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.LinearLayout f187195c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.widget.c5 f187196d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f187197e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f187198f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.l5 f187199g;

    public e5(com.tencent.mm.plugin.webview.ui.tools.widget.l5 l5Var, android.view.View itemView) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f187199g = l5Var;
        this.f187193a = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.as_);
        this.f187194b = (android.widget.LinearLayout) itemView.findViewById(com.tencent.mm.R.id.asa);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) itemView.findViewById(com.tencent.mm.R.id.asg);
        this.f187195c = (android.widget.LinearLayout) itemView.findViewById(com.tencent.mm.R.id.dgi);
        kotlin.jvm.internal.o.d(linearLayout);
        this.f187196d = new com.tencent.mm.plugin.webview.ui.tools.widget.c5(l5Var, linearLayout);
        this.f187197e = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.ajn);
        this.f187198f = new java.util.ArrayList();
    }
}
