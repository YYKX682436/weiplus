package fv4;

/* loaded from: classes8.dex */
public final class b implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fv4.f f266984a;

    public b(fv4.f fVar) {
        this.f266984a = fVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        fv4.f fVar = this.f266984a;
        int i17 = 0;
        if (objArr != null) {
            try {
                if (!(objArr.length == 0)) {
                    java.lang.Object obj2 = fVar.f266992e;
                    if (obj2 == null) {
                        return null;
                    }
                    if (!kotlin.jvm.internal.o.b(method != null ? method.getName() : null, "resize")) {
                        if (method != null) {
                            return method.invoke(obj2, java.util.Arrays.copyOf(objArr, objArr.length));
                        }
                        return null;
                    }
                    java.lang.Object obj3 = objArr[0];
                    kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((java.lang.Integer) obj3).intValue();
                    java.lang.Object obj4 = objArr[1];
                    kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Int");
                    fv4.f.k(fVar, obj2, intValue, ((java.lang.Integer) obj4).intValue());
                    return null;
                }
            } catch (java.lang.Exception e17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hook func: ");
                sb6.append(method != null ? method.getName() : null);
                sb6.append(", exception: ");
                sb6.append(e17);
                java.lang.String content = sb6.toString();
                kotlin.jvm.internal.o.g(content, "content");
                com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content);
                return null;
            }
        }
        java.lang.Object obj5 = fVar.f266992e;
        if (obj5 == null) {
            return null;
        }
        java.lang.String name = method != null ? method.getName() : null;
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -816371593) {
                if (hashCode != 474985501) {
                    if (hashCode == 1654664470 && name.equals("scheduleFrame")) {
                        fv4.f.l(fVar, obj5);
                        return null;
                    }
                } else if (name.equals("getHeight")) {
                    if (fVar.f266999l || fVar.f266998k <= 0) {
                        if (fVar.f267000m) {
                            fVar.f267000m = false;
                            fVar.o();
                        }
                        fVar.f266999l = false;
                        io.flutter.plugin.platform.PlatformViewRenderTarget platformViewRenderTarget = obj5 instanceof io.flutter.plugin.platform.PlatformViewRenderTarget ? (io.flutter.plugin.platform.PlatformViewRenderTarget) obj5 : null;
                        if (platformViewRenderTarget != null) {
                            i17 = platformViewRenderTarget.getHeight();
                        }
                    }
                    return java.lang.Integer.valueOf(i17);
                }
            } else if (name.equals("getSurface")) {
                return fv4.f.j(fVar, obj5);
            }
        }
        if (method != null) {
            return method.invoke(obj5, new java.lang.Object[0]);
        }
        return null;
    }
}
