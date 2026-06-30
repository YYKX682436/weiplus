package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public final class t2 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.y2 f183118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f183119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.jv5 f183120c;

    public t2(com.tencent.mm.plugin.webview.model.y2 y2Var, java.util.ArrayList arrayList, r45.jv5 jv5Var) {
        this.f183118a = y2Var;
        this.f183119b = arrayList;
        this.f183120c = jv5Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.model.s2(i17, i18, this.f183118a, this.f183119b, this.f183120c));
    }
}
