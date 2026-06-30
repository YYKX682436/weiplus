package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class u1 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f201465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f201467f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.e2 f201468g;

    public u1(android.content.Context context, com.tencent.mm.storage.f9 f9Var, boolean z17, com.tencent.mm.ui.chatting.gallery.e2 e2Var) {
        this.f201465d = context;
        this.f201466e = f9Var;
        this.f201467f = z17;
        this.f201468g = e2Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.tencent.mm.ui.chatting.gallery.e2 e2Var;
        boolean l17 = com.tencent.mm.ui.chatting.gallery.k1.l(this.f201465d, this.f201466e, this.f201467f);
        if (l17 && (e2Var = this.f201468g) != null) {
            e2Var.a();
        }
        return l17 ? "Success" : "Fail";
    }
}
