package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes5.dex */
public final class o extends com.tencent.mm.ui.conversation.banner.m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17) {
        super(context, str, str2, z17);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.ui.conversation.banner.m
    public android.view.View l(java.lang.String str, android.content.Context context, android.view.ViewGroup viewGroup) {
        if (kotlin.jvm.internal.o.b("2", str)) {
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488591y1, viewGroup);
            kotlin.jvm.internal.o.d(inflate);
            return inflate;
        }
        android.view.View inflate2 = android.view.View.inflate(context, com.tencent.mm.R.layout.f488592y2, viewGroup);
        kotlin.jvm.internal.o.d(inflate2);
        return inflate2;
    }

    @Override // com.tencent.mm.ui.conversation.banner.m
    public void m() {
        xj5.j jVar;
        java.lang.ref.WeakReference weakReference = vb5.l.f434855q;
        vb5.l lVar = weakReference != null ? (vb5.l) weakReference.get() : null;
        if (lVar != null) {
            java.util.Iterator it = lVar.f434863o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    jVar = null;
                    break;
                }
                xj5.a aVar = (xj5.a) it.next();
                if (aVar instanceof xj5.j) {
                    jVar = (xj5.j) aVar;
                    break;
                }
            }
            if (jVar != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("group_msg_set_top_detach", null, kz5.c1.m(kz5.b1.e(new jz5.l("group_bar_close_scene", 3)), jVar.b()), 26356);
            }
        }
    }
}
