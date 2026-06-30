package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public final class x2 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.y2 f183184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jv5 f183185e;

    public x2(com.tencent.mm.plugin.webview.model.y2 y2Var, r45.jv5 jv5Var) {
        this.f183184d = y2Var;
        this.f183185e = jv5Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.tencent.mm.plugin.webview.model.y2 y2Var = this.f183184d;
        fl1.o oVar = y2Var.f183195c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String string = bundle.getString("userName", "");
        java.lang.String string2 = y2Var.f183193a.getResources().getString(com.tencent.mm.R.string.a07);
        java.lang.String str = this.f183185e.f378131d;
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String string3 = bundle.getString("userIcon", "");
        ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
        arrayList.add(new fl1.h1(0, string, string2, str, true, com.tencent.mm.modelavatar.z.h(string3, null, false), 0));
        oVar.setSelectListItem(arrayList);
        y2Var.f183194b.c(y2Var.f183195c);
    }
}
