package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class z1 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f201595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201596e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f201597f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.e2 f201598g;

    public z1(android.content.Context context, com.tencent.mm.storage.f9 f9Var, boolean z17, com.tencent.mm.ui.chatting.gallery.e2 e2Var) {
        this.f201595d = context;
        this.f201596e = f9Var;
        this.f201597f = z17;
        this.f201598g = e2Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.tencent.mm.ui.chatting.gallery.e2 e2Var;
        boolean j17 = com.tencent.mm.ui.chatting.gallery.k1.j(this.f201595d, this.f201596e, this.f201597f);
        if (j17 && (e2Var = this.f201598g) != null) {
            e2Var.a();
        }
        return j17 ? "Success" : "Fail";
    }
}
