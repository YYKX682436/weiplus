package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.v f190964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f190965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f190966f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.pluginsdk.ui.otherway.v vVar, com.tencent.mm.ui.widget.dialog.k0 k0Var, androidx.recyclerview.widget.RecyclerView recyclerView) {
        super(1);
        this.f190964d = vVar;
        this.f190965e = k0Var;
        this.f190966f = recyclerView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        this.f190964d.f(this.f190965e);
        androidx.recyclerview.widget.f2 adapter = this.f190966f.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        return jz5.f0.f302826a;
    }
}
