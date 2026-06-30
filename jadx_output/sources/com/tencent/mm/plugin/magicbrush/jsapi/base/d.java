package com.tencent.mm.plugin.magicbrush.jsapi.base;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/jsapi/base/d;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/RequestType;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType;", "<init>", "()V", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class d implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ipcinvoker.r f148047d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f148048e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f148049f;

    /* renamed from: g, reason: collision with root package name */
    public lc3.c0 f148050g;

    public final synchronized void a(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (this.f148048e) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SimpleMainProcessTask", "hy: task already released!");
            return;
        }
        this.f148048e = true;
        com.tencent.mm.ipcinvoker.r rVar = this.f148047d;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType.FinalCallback(new com.tencent.mm.ipcinvoker.type.IPCString(data.toString())));
        } else {
            kotlin.jvm.internal.o.o("mCallback");
            throw null;
        }
    }

    public final synchronized void b(com.tencent.mm.plugin.magicbrush.base.MBJsEventBase event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.ipcinvoker.r rVar = this.f148047d;
        if (rVar == null) {
            kotlin.jvm.internal.o.o("mCallback");
            throw null;
        }
        rVar.a(new com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType.Event(event));
    }

    public abstract void c(lc3.a0 a0Var);

    public final lc3.a0 d(int i17, java.lang.String str) {
        lc3.c0 c0Var = this.f148050g;
        if (c0Var != null) {
            return c0Var.h(i17, str);
        }
        kotlin.jvm.internal.o.o("mFakeJsApi");
        throw null;
    }

    public final lc3.a0 e() {
        lc3.c0 c0Var = this.f148050g;
        if (c0Var != null) {
            return c0Var.k();
        }
        kotlin.jvm.internal.o.o("mFakeJsApi");
        throw null;
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        com.tencent.mm.plugin.magicbrush.jsapi.base.RequestType data = (com.tencent.mm.plugin.magicbrush.jsapi.base.RequestType) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String value = data.f148044d.f68406d;
        kotlin.jvm.internal.o.f(value, "value");
        this.f148049f = value;
        java.lang.String value2 = data.f148045e.f68406d;
        kotlin.jvm.internal.o.f(value2, "value");
        lc3.a0 a0Var = new lc3.a0(value2);
        this.f148047d = callback;
        this.f148050g = new fd3.d(this);
        c(a0Var);
    }
}
