package org.msgpack.core.buffer;

/* loaded from: classes7.dex */
public final class c implements java.security.PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f347839a;

    public c(java.nio.ByteBuffer byteBuffer) {
        this.f347839a = byteBuffer;
    }

    @Override // java.security.PrivilegedAction
    public java.lang.Object run() {
        java.nio.ByteBuffer byteBuffer = this.f347839a;
        try {
            java.lang.reflect.Method declaredMethod = byteBuffer.getClass().getDeclaredMethod("cleaner", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(byteBuffer, new java.lang.Object[0]);
            return declaredMethod;
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e17) {
            return e17;
        }
    }
}
