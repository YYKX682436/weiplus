package um;

/* loaded from: classes13.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f428691a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f428692b;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f428691a = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        f428692b = hashMap2;
        try {
            hashMap.put(byte[].class, um.r.class.getMethod("keep_writeByteArray", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap.put(java.lang.Short.TYPE, um.r.class.getMethod("keep_writeShort", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap.put(java.lang.Short.class, um.r.class.getMethod("keep_writeShort", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            java.lang.Class cls = java.lang.Boolean.TYPE;
            hashMap.put(cls, um.r.class.getMethod("keep_writeBoolean", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap.put(java.lang.Boolean.class, um.r.class.getMethod("keep_writeBoolean", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            java.lang.Class cls2 = java.lang.Integer.TYPE;
            hashMap.put(cls2, um.r.class.getMethod("keep_writeInt", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap.put(java.lang.Integer.class, um.r.class.getMethod("keep_writeInt", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            java.lang.Class cls3 = java.lang.Float.TYPE;
            hashMap.put(cls3, um.r.class.getMethod("keep_writeFloat", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap.put(java.lang.Float.class, um.r.class.getMethod("keep_writeFloat", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap.put(java.lang.Double.TYPE, um.r.class.getMethod("keep_writeDouble", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap.put(java.lang.Double.class, um.r.class.getMethod("keep_writeDouble", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            java.lang.Class cls4 = java.lang.Long.TYPE;
            hashMap.put(cls4, um.r.class.getMethod("keep_writeLong", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap.put(java.lang.Long.class, um.r.class.getMethod("keep_writeLong", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap.put(java.lang.String.class, um.r.class.getMethod("keep_writeString", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(byte[].class, um.r.class.getMethod("keep_readByteArray", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(java.lang.Short.TYPE, um.r.class.getMethod("keep_readShort", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(java.lang.Short.class, um.r.class.getMethod("keep_readShort", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(cls, um.r.class.getMethod("keep_readBoolean", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(java.lang.Boolean.class, um.r.class.getMethod("keep_readBoolean", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(cls2, um.r.class.getMethod("keep_readInt", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(java.lang.Integer.class, um.r.class.getMethod("keep_readInt", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(cls3, um.r.class.getMethod("keep_readFloat", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(java.lang.Float.class, um.r.class.getMethod("keep_readFloat", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(java.lang.Double.TYPE, um.r.class.getMethod("keep_readDouble", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(java.lang.Double.class, um.r.class.getMethod("keep_readDouble", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(cls4, um.r.class.getMethod("keep_readLong", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(java.lang.Long.class, um.r.class.getMethod("keep_readLong", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(java.lang.String.class, um.r.class.getMethod("keep_readString", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MCacheItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public static void keep_readBoolean(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            field.setBoolean(obj, parcel.readInt() != 0);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MCacheItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public static void keep_readByteArray(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            field.set(obj, parcel.createByteArray());
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MCacheItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public static void keep_readDouble(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            field.setDouble(obj, parcel.readDouble());
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MCacheItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public static void keep_readFloat(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            field.setFloat(obj, parcel.readFloat());
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MCacheItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public static void keep_readInt(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            field.setInt(obj, parcel.readInt());
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MCacheItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public static void keep_readLong(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            field.set(obj, java.lang.Long.valueOf(parcel.readLong()));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MCacheItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public static void keep_readShort(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            field.setShort(obj, (short) parcel.readInt());
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MCacheItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public static void keep_readString(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            field.set(obj, parcel.readString());
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MCacheItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public static void keep_writeBoolean(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            parcel.writeInt(field.getBoolean(obj) ? 1 : 0);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MCacheItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public static void keep_writeByteArray(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            parcel.writeByteArray((byte[]) field.get(obj));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MCacheItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public static void keep_writeDouble(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            parcel.writeDouble(field.getDouble(obj));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MCacheItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public static void keep_writeFloat(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            parcel.writeFloat(field.getFloat(obj));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MCacheItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public static void keep_writeInt(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            parcel.writeInt(field.getInt(obj));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MCacheItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public static void keep_writeLong(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            parcel.writeLong(field.getLong(obj));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MCacheItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public static void keep_writeShort(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            parcel.writeInt(field.getShort(obj));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MCacheItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public static void keep_writeString(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            parcel.writeString((java.lang.String) field.get(obj));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MCacheItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }
}
