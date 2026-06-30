package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class u implements com.tencent.mm.pluginsdk.ui.otherway.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f190994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.v f190995b;

    public u(java.util.ArrayList arrayList, com.tencent.mm.pluginsdk.ui.otherway.v vVar) {
        this.f190994a = arrayList;
        this.f190995b = vVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.otherway.a
    public void a(com.tencent.mm.pluginsdk.ui.otherway.w data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f190994a.remove(data);
    }

    @Override // com.tencent.mm.pluginsdk.ui.otherway.a
    public void b(java.lang.ref.WeakReference weakReference) {
        kb0.g gVar = this.f190995b.f191010k;
        if (gVar != null) {
            gVar.f306208l = weakReference;
        }
    }
}
