package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class p3 implements android.view.ViewStub.OnInflateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.q3 f201262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f201263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f201264c;

    public p3(com.tencent.mm.ui.chatting.gallery.q3 q3Var, int i17, android.view.View view) {
        this.f201262a = q3Var;
        this.f201263b = i17;
        this.f201264c = view;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(android.view.ViewStub viewStub, android.view.View view) {
        fq.d a17 = fq.d.a(view);
        final com.tencent.mm.ui.chatting.gallery.q3 q3Var = this.f201262a;
        android.util.SparseArray sparseArray = q3Var.f201292a;
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s(q3Var) { // from class: com.tencent.mm.ui.chatting.gallery.o3
            @Override // kotlin.jvm.internal.s, f06.s
            public java.lang.Object get() {
                return java.lang.Boolean.valueOf(((com.tencent.mm.ui.chatting.gallery.q3) this.receiver).f201296e);
            }
        };
        int i17 = this.f201263b;
        sparseArray.put(i17, new com.tencent.mm.ui.chatting.gallery.g4(a17, i17, this.f201264c, sVar));
    }
}
