package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class cb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f200842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f200843e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f200844f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200845g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f200846h;

    public cb(kotlin.jvm.internal.h0 h0Var, int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        this.f200842d = h0Var;
        this.f200843e = i17;
        this.f200844f = i18;
        this.f200845g = str;
        this.f200846h = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ipcinvoker.wx_extension.v vVar = (com.tencent.mm.ipcinvoker.wx_extension.v) ((java.lang.ref.WeakReference) this.f200842d.f310123d).get();
        if (vVar != null) {
            vVar.a(this.f200843e, this.f200844f, this.f200845g, this.f200846h);
        }
    }
}
