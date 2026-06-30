package org.msgpack.core.buffer;

/* loaded from: classes7.dex */
public final class d implements java.security.PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f347840a;

    public d(java.nio.ByteBuffer byteBuffer) {
        this.f347840a = byteBuffer;
    }

    @Override // java.security.PrivilegedAction
    public java.lang.Object run() {
        java.nio.ByteBuffer byteBuffer = this.f347840a;
        java.lang.reflect.Method method = org.msgpack.core.buffer.g.f347848a;
        try {
            java.lang.reflect.Method declaredMethod = method.getReturnType().getDeclaredMethod("clean", new java.lang.Class[0]);
            java.lang.Object invoke = method.invoke(byteBuffer, new java.lang.Object[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(invoke, new java.lang.Object[0]);
            return declaredMethod;
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e17) {
            return e17;
        }
    }
}
