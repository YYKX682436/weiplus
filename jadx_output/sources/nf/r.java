package nf;

/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f336600a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f336601b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Class f336602c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f336603d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f336604e;

    static {
        new nf.p(null);
    }

    public r(java.lang.Object defaultValue) {
        kotlin.jvm.internal.o.g(defaultValue, "defaultValue");
        this.f336604e = jz5.h.b(new nf.q(this));
        this.f336601b = defaultValue;
        this.f336602c = defaultValue.getClass();
    }

    public final com.tencent.mm.sdk.platformtools.o4 a() {
        java.lang.Object value = ((jz5.n) this.f336604e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.sdk.platformtools.o4) value;
    }

    public final java.lang.Object b(java.lang.Object thisRef, f06.v property) {
        kotlin.jvm.internal.o.g(thisRef, "thisRef");
        kotlin.jvm.internal.o.g(property, "property");
        this.f336603d = thisRef;
        java.lang.Class cls = java.lang.Float.TYPE;
        java.lang.Class cls2 = this.f336602c;
        boolean b17 = kotlin.jvm.internal.o.b(cls2, cls) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Float.class);
        java.lang.Object obj = this.f336601b;
        if (b17) {
            com.tencent.mm.sdk.platformtools.o4 a17 = a();
            java.lang.String name = property.getName();
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Float");
            return java.lang.Float.valueOf(a17.getFloat(name, ((java.lang.Float) obj).floatValue()));
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.Integer.TYPE) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Integer.class)) {
            com.tencent.mm.sdk.platformtools.o4 a18 = a();
            java.lang.String name2 = property.getName();
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
            return java.lang.Integer.valueOf(a18.getInt(name2, ((java.lang.Integer) obj).intValue()));
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.String.class)) {
            com.tencent.mm.sdk.platformtools.o4 a19 = a();
            java.lang.String name3 = property.getName();
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String string = a19.getString(name3, (java.lang.String) obj);
            kotlin.jvm.internal.o.e(string, "null cannot be cast to non-null type T of com.tencent.luggage.util.LuggageMMKVProperty");
            return string;
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.Long.TYPE) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Long.class)) {
            com.tencent.mm.sdk.platformtools.o4 a27 = a();
            java.lang.String name4 = property.getName();
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
            return java.lang.Long.valueOf(a27.getLong(name4, ((java.lang.Long) obj).longValue()));
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.Boolean.TYPE) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Boolean.class)) {
            com.tencent.mm.sdk.platformtools.o4 a28 = a();
            java.lang.String name5 = property.getName();
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return java.lang.Boolean.valueOf(a28.getBoolean(name5, ((java.lang.Boolean) obj).booleanValue()));
        }
        if (kotlin.jvm.internal.o.b(cls2, byte[].class)) {
            byte[] j17 = a().j(property.getName());
            if (j17 != null) {
                obj = j17;
            }
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type T of com.tencent.luggage.util.LuggageMMKVProperty");
            return obj;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Class superclass = cls2.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        if (!arrayList.contains(com.tencent.mm.protobuf.f.class)) {
            throw new java.lang.IllegalAccessError("unsupported type:" + cls2);
        }
        byte[] j18 = a().j(property.getName());
        if (j18 == null) {
            return obj;
        }
        try {
            java.lang.Object newInstance = cls2.newInstance();
            kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.protobuf.BaseProtoBuf");
            com.tencent.mm.protobuf.f fVar = (com.tencent.mm.protobuf.f) newInstance;
            fVar.parseFrom(j18);
            return fVar;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("AppBrand.utils.AppBrandMMKVProperty", "parse pb failed, class:" + cls2.getCanonicalName());
            return obj;
        }
    }

    public final void c(java.lang.Object thisRef, f06.v property, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(thisRef, "thisRef");
        kotlin.jvm.internal.o.g(property, "property");
        this.f336603d = thisRef;
        if (obj == null) {
            a().W(property.getName());
            return;
        }
        java.lang.Class cls = java.lang.Float.TYPE;
        java.lang.Class cls2 = this.f336602c;
        if (kotlin.jvm.internal.o.b(cls2, cls) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Float.class)) {
            a().putFloat(property.getName(), ((java.lang.Float) obj).floatValue());
            return;
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.Integer.TYPE) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Integer.class)) {
            a().putInt(property.getName(), ((java.lang.Integer) obj).intValue());
            return;
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.String.class)) {
            a().putString(property.getName(), (java.lang.String) obj);
            return;
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.Long.TYPE) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Long.class)) {
            a().putLong(property.getName(), ((java.lang.Long) obj).longValue());
            return;
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.Boolean.TYPE) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Boolean.class)) {
            a().putBoolean(property.getName(), ((java.lang.Boolean) obj).booleanValue());
            return;
        }
        if (kotlin.jvm.internal.o.b(cls2, byte[].class)) {
            a().H(property.getName(), (byte[]) obj);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Class superclass = cls2.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        if (!arrayList.contains(com.tencent.mm.protobuf.f.class)) {
            throw new java.lang.IllegalAccessError("unsupported type:" + cls2);
        }
        a().H(property.getName(), ((com.tencent.mm.protobuf.f) obj).toByteArray());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(java.lang.Object defaultValue, java.lang.String mmkvName) {
        this(defaultValue);
        kotlin.jvm.internal.o.g(defaultValue, "defaultValue");
        kotlin.jvm.internal.o.g(mmkvName, "mmkvName");
        this.f336600a = mmkvName;
        this.f336601b = defaultValue;
        this.f336602c = defaultValue.getClass();
    }
}
