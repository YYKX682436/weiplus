package com.tencent.mm.pluginsdk.ui.otherway.halfscreen;

/* loaded from: classes8.dex */
public final class f implements com.tencent.mm.pluginsdk.ui.otherway.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f190955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kb0.g f190956b;

    public f(java.util.ArrayList arrayList, kb0.g gVar) {
        this.f190955a = arrayList;
        this.f190956b = gVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.otherway.a
    public void a(com.tencent.mm.pluginsdk.ui.otherway.w data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f190955a.remove(data);
    }

    @Override // com.tencent.mm.pluginsdk.ui.otherway.a
    public void b(java.lang.ref.WeakReference weakReference) {
        this.f190956b.f306208l = weakReference;
    }
}
