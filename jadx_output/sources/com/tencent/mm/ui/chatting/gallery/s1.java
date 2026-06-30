package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class s1 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f201350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f201351e;

    public s1(java.util.List list, android.content.Context context) {
        this.f201350d = list;
        this.f201351e = context;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.util.List<com.tencent.mm.storage.f9> list = this.f201350d;
        boolean z17 = false;
        boolean z18 = list.size() <= 1;
        for (com.tencent.mm.storage.f9 f9Var : list) {
            boolean N = com.tencent.mm.ui.chatting.gallery.k1.N(f9Var);
            android.content.Context context = this.f201351e;
            boolean l17 = N ? com.tencent.mm.ui.chatting.gallery.k1.l(context, f9Var, z18) : com.tencent.mm.ui.chatting.gallery.k1.j(context, f9Var, z18);
            if (!z17 && l17) {
                z17 = true;
            }
        }
        if (z18) {
            return "";
        }
        if (z17) {
            return "Success";
        }
        return null;
    }
}
