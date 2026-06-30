package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes8.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f190905a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f190906b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f190907c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f190908d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f190909e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f190910f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.z2 f190911g;

    public n2(android.content.Context context, java.lang.String filePath, java.lang.String fileName, java.lang.String fileExt, java.lang.String contextId, java.lang.String fileMd5) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(fileName, "fileName");
        kotlin.jvm.internal.o.g(fileExt, "fileExt");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        kotlin.jvm.internal.o.g(fileMd5, "fileMd5");
        this.f190905a = context;
        this.f190906b = filePath;
        this.f190907c = fileName;
        this.f190908d = fileExt;
        this.f190909e = contextId;
        this.f190910f = fileMd5;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 2, 3, false);
        this.f190911g = z2Var;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.biy, (android.view.ViewGroup) null);
        com.tencent.mm.ui.bk.s0(((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.om7)).getPaint());
        z2Var.j(inflate);
        java.lang.String string = com.tencent.mm.pluginsdk.model.t3.q(com.tencent.mm.sdk.platformtools.x2.f193071a) ? context.getResources().getString(com.tencent.mm.R.string.hoi) : context.getResources().getString(com.tencent.mm.R.string.hog);
        kotlin.jvm.internal.o.d(string);
        z2Var.y(string);
        z2Var.x(0);
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.biz, (android.view.ViewGroup) null);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate2.findViewById(com.tencent.mm.R.id.hlr)).setOnClickListener(new com.tencent.mm.pluginsdk.ui.l2(this));
        z2Var.s(inflate2);
        z2Var.F = new com.tencent.mm.pluginsdk.ui.m2(this);
        com.tencent.mm.pluginsdk.model.r3.a(contextId, fileExt, fileMd5, 201L, new ty.l0(true, "", "", "", false, false).a());
    }
}
