package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class a9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f191516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.d9 f191517e;

    public a9(com.tencent.mm.pluginsdk.ui.tools.d9 d9Var, android.content.Context context) {
        this.f191517e = d9Var;
        this.f191516d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.tools.d9 d9Var = this.f191517e;
        if (d9Var.f191593r) {
            return;
        }
        hy4.h hVar = hy4.h.f286106a;
        android.content.Context context = this.f191516d;
        d9Var.f191592q = hVar.a(context.getString(com.tencent.mm.R.string.f490604zq), context, d9Var.f191592q);
    }
}
