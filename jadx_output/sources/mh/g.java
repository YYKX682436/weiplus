package mh;

/* loaded from: classes12.dex */
public final class g implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.reflect.Field field = (java.lang.reflect.Field) obj;
        field.setAccessible(true);
        com.tencent.matrix.battery.accumulate.persist.FlattProperty flattProperty = (com.tencent.matrix.battery.accumulate.persist.FlattProperty) field.getAnnotation(com.tencent.matrix.battery.accumulate.persist.FlattProperty.class);
        com.tencent.matrix.battery.accumulate.persist.a aVar = com.tencent.matrix.battery.accumulate.persist.a.f52553a;
        aVar.a(field, flattProperty != null ? kotlin.jvm.internal.i0.a(flattProperty.type()) : null);
        kotlin.jvm.internal.o.d(flattProperty);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(flattProperty.index());
        java.lang.reflect.Field field2 = (java.lang.reflect.Field) obj2;
        field2.setAccessible(true);
        com.tencent.matrix.battery.accumulate.persist.FlattProperty flattProperty2 = (com.tencent.matrix.battery.accumulate.persist.FlattProperty) field2.getAnnotation(com.tencent.matrix.battery.accumulate.persist.FlattProperty.class);
        aVar.a(field2, flattProperty2 != null ? kotlin.jvm.internal.i0.a(flattProperty2.type()) : null);
        kotlin.jvm.internal.o.d(flattProperty2);
        return mz5.a.b(valueOf, java.lang.Integer.valueOf(flattProperty2.index()));
    }
}
