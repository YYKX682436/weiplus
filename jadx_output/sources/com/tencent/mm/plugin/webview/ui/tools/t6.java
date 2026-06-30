package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class t6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f186890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186891e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186892f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.d f186893g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f186894h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f186895i;

    public t6(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, boolean z17, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.webview.permission.d dVar, android.content.Intent intent) {
        this.f186895i = c6Var;
        this.f186890d = z17;
        this.f186891e = str;
        this.f186892f = str2;
        this.f186893g = dVar;
        this.f186894h = intent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f186895i.G(this.f186890d, this.f186891e, this.f186892f, this.f186893g, this.f186894h);
    }
}
