package n51;

/* loaded from: classes8.dex */
public final class e {
    public e(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null || !kotlin.jvm.internal.o.b(obj.getClass(), obj2.getClass())) {
            return false;
        }
        return ((obj instanceof java.util.List) && (obj2 instanceof java.util.List)) ? b((java.util.List) obj, (java.util.List) obj2) : ((obj instanceof com.tencent.mm.protobuf.f) && (obj2 instanceof com.tencent.mm.protobuf.f)) ? ((com.tencent.mm.protobuf.f) obj).compareContent((com.tencent.mm.protobuf.f) obj2) : ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? java.util.Arrays.equals((byte[]) obj, (byte[]) obj2) : kotlin.jvm.internal.o.b(obj, obj2);
    }

    public final boolean b(java.util.List thisField, java.util.List otherField) {
        kotlin.jvm.internal.o.g(thisField, "thisField");
        kotlin.jvm.internal.o.g(otherField, "otherField");
        if (thisField.size() != otherField.size()) {
            return false;
        }
        int size = thisField.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (!a(thisField.get(i17), otherField.get(i17))) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(java.lang.Object obj) {
        if ((obj instanceof java.lang.String) || (obj instanceof java.lang.Integer) || (obj instanceof java.lang.Long) || (obj instanceof java.lang.Boolean) || (obj instanceof java.lang.Float) || (obj instanceof java.lang.Double) || (obj instanceof java.lang.Short)) {
            return true;
        }
        return obj instanceof java.lang.Character;
    }

    public final void d(org.json.JSONObject obj, java.lang.String key, java.lang.Object obj2, boolean z17) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(key, "key");
        if (obj2 == null) {
            obj.remove(key);
            return;
        }
        if (obj2 instanceof java.util.LinkedList) {
            obj.put(key, e((java.util.LinkedList) obj2, z17));
            return;
        }
        if (obj2 instanceof com.tencent.mm.protobuf.f) {
            obj.put(key, ((com.tencent.mm.protobuf.f) obj2).toJSON());
            return;
        }
        try {
            if (obj2 instanceof com.tencent.mm.protobuf.g) {
                if (z17) {
                    obj.put(key, n51.d.c(((com.tencent.mm.protobuf.g) obj2).f192156a, 0));
                } else {
                    obj.put(key, ((com.tencent.mm.protobuf.g) obj2).i());
                }
            } else if (!(obj2 instanceof byte[])) {
                if (c(obj2)) {
                    obj.put(key, obj2);
                }
            } else {
                obj.put(key, "ByteArray[" + ((byte[]) obj2).length + "]");
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final org.json.JSONArray e(java.util.LinkedList linkedList, boolean z17) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (next instanceof java.util.LinkedList) {
                    jSONArray.put(e((java.util.LinkedList) next, z17));
                } else if (next instanceof com.tencent.mm.protobuf.f) {
                    jSONArray.put(((com.tencent.mm.protobuf.f) next).toJSON());
                } else if (!(next instanceof com.tencent.mm.protobuf.g)) {
                    kotlin.jvm.internal.o.d(next);
                    if (c(next)) {
                        jSONArray.put(next);
                    }
                } else if (z17) {
                    try {
                        jSONArray.put(n51.d.c(((com.tencent.mm.protobuf.g) next).f192156a, 0));
                    } catch (java.lang.Exception unused) {
                    }
                } else {
                    jSONArray.put(((com.tencent.mm.protobuf.g) next).i());
                }
            }
        }
        return jSONArray;
    }
}
