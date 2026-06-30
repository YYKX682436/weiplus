package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes8.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f191083a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f191084b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f191085c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f191086d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f191087e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f191088f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.w3 f191089g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.z2 f191090h;

    public q2(android.content.Context context, java.lang.String filePath, java.lang.String fileName, java.lang.String fileExt, java.lang.String contextId, java.lang.String fileMd5, com.tencent.mm.pluginsdk.ui.tools.w3 creater) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(fileName, "fileName");
        kotlin.jvm.internal.o.g(fileExt, "fileExt");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        kotlin.jvm.internal.o.g(fileMd5, "fileMd5");
        kotlin.jvm.internal.o.g(creater, "creater");
        this.f191083a = context;
        this.f191084b = filePath;
        this.f191085c = fileName;
        this.f191086d = fileExt;
        this.f191087e = contextId;
        this.f191088f = fileMd5;
        this.f191089g = creater;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 2, 3, false);
        this.f191090h = z2Var;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cbb, (android.view.ViewGroup) null);
        com.tencent.mm.ui.bk.s0(((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.om7)).getPaint());
        z2Var.j(inflate);
        java.lang.String string = com.tencent.mm.pluginsdk.model.t3.q(com.tencent.mm.sdk.platformtools.x2.f193071a) ? context.getResources().getString(com.tencent.mm.R.string.hoi) : context.getResources().getString(com.tencent.mm.R.string.hog);
        kotlin.jvm.internal.o.d(string);
        z2Var.y(string);
        z2Var.x(0);
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.biz, (android.view.ViewGroup) null);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate2.findViewById(com.tencent.mm.R.id.hlr)).setOnClickListener(new com.tencent.mm.pluginsdk.ui.o2(this));
        z2Var.s(inflate2);
        z2Var.F = new com.tencent.mm.pluginsdk.ui.p2(this);
    }
}
