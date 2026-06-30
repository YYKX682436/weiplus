package org.msgpack.core.buffer;

/* loaded from: classes7.dex */
public final class e implements java.security.PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f347841a;

    public e(java.nio.ByteBuffer byteBuffer) {
        this.f347841a = byteBuffer;
    }

    @Override // java.security.PrivilegedAction
    public java.lang.Object run() {
        java.nio.ByteBuffer byteBuffer = this.f347841a;
        try {
            sun.misc.Unsafe unsafe = org.msgpack.core.buffer.h.unsafe;
            java.lang.reflect.Method declaredMethod = unsafe.getClass().getDeclaredMethod("invokeCleaner", java.nio.ByteBuffer.class);
            declaredMethod.invoke(unsafe, byteBuffer);
            return declaredMethod;
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e17) {
            return e17;
        }
    }
}
