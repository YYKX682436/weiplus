package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class c2 extends com.tencent.mm.xcompat.recyclerview.widget.k1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f214487a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.d2 f214488b;

    public c2(com.tencent.mm.xcompat.recyclerview.widget.d2 d2Var) {
        this.f214488b = d2Var;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.k1
    public void a(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView, int i17) {
        if (i17 == 0 && this.f214487a) {
            this.f214487a = false;
            this.f214488b.c();
        }
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.k1
    public void b(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        if (i17 == 0 && i18 == 0) {
            return;
        }
        this.f214487a = true;
    }
}
