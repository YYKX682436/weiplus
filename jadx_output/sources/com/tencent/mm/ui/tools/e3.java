package com.tencent.mm.ui.tools;

/* loaded from: classes5.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f210371a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f210372b = new java.util.ArrayList();

    public e3(java.lang.Object obj) {
        this.f210371a = obj;
    }

    public final void a(java.lang.Object obj) {
        java.util.Iterator it = this.f210372b.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.tools.d3) it.next()).invoke(obj);
        }
    }

    public final void b(com.tencent.mm.ui.tools.d3 lambda) {
        kotlin.jvm.internal.o.g(lambda, "lambda");
        java.lang.Object obj = this.f210371a;
        if (obj != null) {
            lambda.invoke(obj);
        } else {
            ((java.util.ArrayList) this.f210372b).add(lambda);
        }
    }
}
