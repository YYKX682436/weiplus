package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class yq extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq(android.view.View view) {
        super(4);
        this.f133415d = view;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        ((java.lang.Number) obj).intValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        r45.tp2 resp = (r45.tp2) obj4;
        kotlin.jvm.internal.o.g(resp, "resp");
        if (intValue != 0) {
            r45.zm6 zm6Var = (r45.zm6) resp.getCustom(7);
            boolean z17 = true;
            if (zm6Var != null && zm6Var.getBoolean(1)) {
                r45.zm6 zm6Var2 = (r45.zm6) resp.getCustom(7);
                java.lang.String string = zm6Var2 != null ? zm6Var2.getString(0) : null;
                if (string != null && string.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    android.content.Context context = this.f133415d.getContext();
                    r45.zm6 zm6Var3 = (r45.zm6) resp.getCustom(7);
                    db5.t7.makeText(context, zm6Var3 != null ? zm6Var3.getString(0) : null, 0).show();
                    com.tencent.mars.xlog.Log.i("LiveCommentPopupWindowItemClick", "tickle failed ,errCode " + intValue);
                }
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            com.tencent.mars.xlog.Log.i("LiveCommentPopupWindowItemClick", "tickle failed ,errCode " + intValue);
        }
        return jz5.f0.f302826a;
    }
}
