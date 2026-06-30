package sp0;

/* loaded from: classes7.dex */
public final class d implements jc3.m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f410944a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f410945b;

    public d(java.lang.Object message, java.lang.ref.WeakReference weakReference) {
        kotlin.jvm.internal.o.g(message, "message");
        this.f410944a = message;
        this.f410945b = weakReference;
    }

    @Override // jc3.m
    public java.lang.Object a(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("apiName");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        return new sp0.a(optString);
    }

    @Override // jc3.m
    public void b(java.lang.Object obj, jc3.k callback) {
        sp0.d view = (sp0.d) obj;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(callback, "callback");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // jc3.m
    public void c(java.lang.Object obj, java.lang.Object obj2, jc3.k callback) {
        sp0.d view = (sp0.d) obj;
        sp0.a viewAttribute = (sp0.a) obj2;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(viewAttribute, "viewAttribute");
        kotlin.jvm.internal.o.g(callback, "callback");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // jc3.m
    public jc3.l d(java.lang.Object obj) {
        sp0.d view = (sp0.d) obj;
        kotlin.jvm.internal.o.g(view, "view");
        return new sp0.c();
    }

    @Override // jc3.m
    public void e(java.lang.Object obj, java.lang.Object obj2, jc3.k callback) {
        boolean z17;
        sp0.d view = (sp0.d) obj;
        sp0.a viewAttribute = (sp0.a) obj2;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(viewAttribute, "viewAttribute");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.ref.WeakReference weakReference = this.f410945b;
        if (weakReference == null || ((dq0.a0) weakReference.get()) == null) {
            com.tencent.mars.xlog.Log.e("MBFlutterFakeCoverView", "checkFlutterChannel error， flutter plugin null");
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            return;
        }
        java.lang.Object obj3 = view.f410944a;
        if (!(obj3 instanceof com.google.protobuf.l6)) {
            com.tencent.mars.xlog.Log.e("MBFlutterFakeCoverView", "view message is not GeneratedMessageV3");
            return;
        }
        java.lang.ref.WeakReference weakReference2 = this.f410945b;
        kotlin.jvm.internal.o.d(weakReference2);
        dq0.a0 a0Var = (dq0.a0) weakReference2.get();
        if (a0Var != null) {
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type com.google.protobuf.GeneratedMessageV3");
            a0Var.n(viewAttribute.f410941a, ((com.google.protobuf.l6) obj3).toByteArray(), new sp0.b(callback, this));
        }
    }
}
