package j3;

/* loaded from: classes13.dex */
public abstract class f {
    public static final android.os.Bundle a(jz5.l... lVarArr) {
        android.os.Bundle bundle = new android.os.Bundle(lVarArr.length);
        for (jz5.l lVar : lVarArr) {
            java.lang.String str = (java.lang.String) lVar.f302833d;
            java.lang.Object obj = lVar.f302834e;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof java.lang.Boolean) {
                bundle.putBoolean(str, ((java.lang.Boolean) obj).booleanValue());
            } else if (obj instanceof java.lang.Byte) {
                bundle.putByte(str, ((java.lang.Number) obj).byteValue());
            } else if (obj instanceof java.lang.Character) {
                bundle.putChar(str, ((java.lang.Character) obj).charValue());
            } else if (obj instanceof java.lang.Double) {
                bundle.putDouble(str, ((java.lang.Number) obj).doubleValue());
            } else if (obj instanceof java.lang.Float) {
                bundle.putFloat(str, ((java.lang.Number) obj).floatValue());
            } else if (obj instanceof java.lang.Integer) {
                bundle.putInt(str, ((java.lang.Number) obj).intValue());
            } else if (obj instanceof java.lang.Long) {
                bundle.putLong(str, ((java.lang.Number) obj).longValue());
            } else if (obj instanceof java.lang.Short) {
                bundle.putShort(str, ((java.lang.Number) obj).shortValue());
            } else if (obj instanceof android.os.Bundle) {
                bundle.putBundle(str, (android.os.Bundle) obj);
            } else if (obj instanceof java.lang.CharSequence) {
                bundle.putCharSequence(str, (java.lang.CharSequence) obj);
            } else if (obj instanceof android.os.Parcelable) {
                bundle.putParcelable(str, (android.os.Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof java.lang.Object[]) {
                java.lang.Class<?> componentType = obj.getClass().getComponentType();
                kotlin.jvm.internal.o.d(componentType);
                if (android.os.Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (android.os.Parcelable[]) obj);
                } else if (java.lang.String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (java.lang.String[]) obj);
                } else if (java.lang.CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (java.lang.CharSequence[]) obj);
                } else {
                    if (!java.io.Serializable.class.isAssignableFrom(componentType)) {
                        throw new java.lang.IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (java.io.Serializable) obj);
                }
            } else if (obj instanceof java.io.Serializable) {
                bundle.putSerializable(str, (java.io.Serializable) obj);
            } else if (obj instanceof android.os.IBinder) {
                j3.c.a(bundle, str, (android.os.IBinder) obj);
            } else if (obj instanceof android.util.Size) {
                j3.d.a(bundle, str, (android.util.Size) obj);
            } else {
                if (!(obj instanceof android.util.SizeF)) {
                    throw new java.lang.IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                j3.d.b(bundle, str, (android.util.SizeF) obj);
            }
        }
        return bundle;
    }
}
