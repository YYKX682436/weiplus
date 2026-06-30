package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f182955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182956f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182957g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.t6 f182958h;

    public j2(android.content.Context context, java.util.LinkedList linkedList, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.webview.ui.tools.widget.t6 t6Var) {
        this.f182954d = context;
        this.f182955e = linkedList;
        this.f182956f = str;
        this.f182957g = str2;
        this.f182958h = t6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f182954d;
        new com.tencent.mm.plugin.webview.ui.tools.widget.x6(context).a(this.f182955e, this.f182956f, this.f182957g, context.getString(com.tencent.mm.R.string.l8l), this.f182958h);
    }
}
