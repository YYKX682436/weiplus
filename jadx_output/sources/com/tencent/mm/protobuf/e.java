package com.tencent.mm.protobuf;

/* loaded from: classes12.dex */
public abstract class e extends com.tencent.mm.protobuf.f {
    private java.lang.Object[] __cachedMaps;
    private com.tencent.mm.protobuf.j[] __fields;
    private boolean[] __hasSetBitSet;
    public boolean __hasSetEnabled;
    public boolean __printBytes;

    public e(com.tencent.mm.protobuf.k... attrs) {
        kotlin.jvm.internal.o.g(attrs, "attrs");
        java.util.ArrayList arrayList = new java.util.ArrayList(attrs.length);
        for (com.tencent.mm.protobuf.k kVar : attrs) {
            arrayList.add(new com.tencent.mm.protobuf.j(kVar, null, 2, null));
        }
        this.__fields = (com.tencent.mm.protobuf.j[]) arrayList.toArray(new com.tencent.mm.protobuf.j[0]);
        this.__hasSetBitSet = new boolean[attrs.length];
        this.__cachedMaps = new java.lang.Object[attrs.length];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void addElement(int i17, T t17) {
        java.util.HashMap hashMap;
        getList(i17).add(t17);
        if (this.__fields[i17].f192158a.f192165f && (hashMap = (java.util.HashMap) this.__cachedMaps[i17]) != null && (t17 instanceof com.tencent.mm.protobuf.e)) {
            com.tencent.mm.protobuf.e eVar = (com.tencent.mm.protobuf.e) t17;
            java.lang.Object orDefault = eVar.getOrDefault(0);
            java.lang.Object orDefault2 = eVar.getOrDefault(1);
            if (orDefault == null || orDefault2 == null) {
                return;
            }
            hashMap.put(orDefault, orDefault2);
        }
    }

    public int appendAttrs(com.tencent.mm.protobuf.k[] attrs) {
        kotlin.jvm.internal.o.g(attrs, "attrs");
        com.tencent.mm.protobuf.j[] jVarArr = this.__fields;
        int length = jVarArr.length;
        java.util.ArrayList arrayList = new java.util.ArrayList(attrs.length);
        int length2 = attrs.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length2) {
            com.tencent.mm.protobuf.k kVar = attrs[i17];
            int i19 = i18 + 1;
            if (kVar.f192160a == -1) {
                kVar.f192160a = i18 + length + 1;
            }
            arrayList.add(new com.tencent.mm.protobuf.j(kVar, null, 2, null));
            i17++;
            i18 = i19;
        }
        this.__fields = (com.tencent.mm.protobuf.j[]) kz5.v.z(jVarArr, arrayList.toArray(new com.tencent.mm.protobuf.j[0]));
        boolean[] zArr = this.__hasSetBitSet;
        int length3 = attrs.length;
        kotlin.jvm.internal.o.g(zArr, "<this>");
        int length4 = zArr.length;
        boolean[] copyOf = java.util.Arrays.copyOf(zArr, length4 + length3);
        java.lang.System.arraycopy(new boolean[length3], 0, copyOf, length4, length3);
        kotlin.jvm.internal.o.d(copyOf);
        this.__hasSetBitSet = copyOf;
        this.__cachedMaps = new java.lang.Object[attrs.length];
        return length;
    }

    public final java.lang.Object b(com.tencent.mm.protobuf.k kVar, java.lang.Object obj) {
        java.lang.Object j17;
        java.lang.reflect.Constructor constructor;
        switch (kVar.f192163d) {
            case 2:
                return r26.h0.h(java.lang.String.valueOf(obj));
            case 3:
                if (!(obj instanceof java.lang.Number)) {
                    j17 = r26.h0.j(java.lang.String.valueOf(obj));
                    break;
                } else {
                    j17 = java.lang.Long.valueOf(((java.lang.Number) obj).longValue());
                    break;
                }
            case 4:
                return r26.g0.e(java.lang.String.valueOf(obj));
            case 5:
                return r26.g0.f(java.lang.String.valueOf(obj));
            case 6:
                if (!this.__printBytes) {
                    j17 = com.tencent.mm.protobuf.g.a((java.lang.String) obj, com.tencent.mapsdk.internal.rv.f51270c);
                    break;
                } else {
                    j17 = com.tencent.mm.protobuf.g.b(n51.d.a((java.lang.String) obj, 0));
                    break;
                }
            case 7:
                return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(java.lang.String.valueOf(obj), "true"));
            case 8:
                java.lang.Class cls = kVar.f192164e;
                java.lang.Object newInstance = (cls == null || (constructor = cls.getConstructor(new java.lang.Class[0])) == null) ? null : constructor.newInstance(new java.lang.Object[0]);
                return (newInstance == null || !(newInstance instanceof com.tencent.mm.protobuf.f)) ? obj : ((com.tencent.mm.protobuf.f) newInstance).fromJson(java.lang.String.valueOf(obj));
            default:
                return obj;
        }
        return j17;
    }

    public final java.lang.Object c(com.tencent.mm.protobuf.k kVar, c36.a aVar, int i17) {
        java.lang.reflect.Constructor constructor;
        switch (kVar.f192163d) {
            case 1:
                return aVar.k(i17);
            case 2:
                return java.lang.Integer.valueOf(aVar.g(i17));
            case 3:
                return java.lang.Long.valueOf(aVar.i(i17));
            case 4:
                return java.lang.Double.valueOf(aVar.e(i17));
            case 5:
                return java.lang.Float.valueOf(aVar.f(i17));
            case 6:
                return aVar.d(i17);
            case 7:
                return java.lang.Boolean.valueOf(aVar.c(i17));
            case 8:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.LinkedList j17 = aVar.j(i17);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    java.lang.Object obj = j17.get(i18);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    byte[] bArr = (byte[]) obj;
                    try {
                        java.lang.Class cls = kVar.f192164e;
                        java.lang.Object newInstance = (cls == null || (constructor = cls.getConstructor(new java.lang.Class[0])) == null) ? null : constructor.newInstance(new java.lang.Object[0]);
                        if (newInstance != null && (newInstance instanceof com.tencent.mm.protobuf.f)) {
                            if (!(bArr.length == 0)) {
                                ((com.tencent.mm.protobuf.f) newInstance).parseFrom(bArr);
                            }
                            arrayList.add(newInstance);
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
                return arrayList;
            default:
                this.__includeUnKnownField = true;
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (!(fVar instanceof com.tencent.mm.protobuf.e)) {
            return false;
        }
        com.tencent.mm.protobuf.j[] jVarArr = this.__fields;
        com.tencent.mm.protobuf.e eVar = (com.tencent.mm.protobuf.e) fVar;
        if (jVarArr.length != eVar.__fields.length) {
            return false;
        }
        int length = jVarArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (!n51.f.f335114a.a(getOrDefault(i17), eVar.getOrDefault(i17))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.mm.protobuf.f
    public int computeSize() {
        int j17;
        try {
            com.tencent.mm.protobuf.j[] jVarArr = this.__fields;
            int length = jVarArr.length;
            int i17 = 0;
            for (int i18 = 0; i18 < length; i18++) {
                com.tencent.mm.protobuf.k kVar = jVarArr[i18].f192158a;
                int i19 = kVar.f192160a;
                if (kVar.f192162c) {
                    j17 = b36.f.g(i19, kVar.f192163d, getLinkedList(i18));
                } else {
                    if (!this.__hasSetEnabled || hasSet(i18)) {
                        switch (kVar.f192163d) {
                            case 1:
                                java.lang.String string = getString(i18);
                                if (string != null) {
                                    j17 = b36.f.j(i19, string);
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                j17 = b36.f.e(i19, getInteger(i18));
                                break;
                            case 3:
                                j17 = b36.f.h(i19, getLong(i18));
                                break;
                            case 4:
                                j17 = b36.f.c(i19, getDouble(i18));
                                break;
                            case 5:
                                j17 = b36.f.d(i19, getFloat(i18));
                                break;
                            case 6:
                                com.tencent.mm.protobuf.g byteString = getByteString(i18);
                                if (byteString != null) {
                                    j17 = b36.f.b(i19, byteString);
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                j17 = b36.f.a(i19, getBoolean(i18));
                                break;
                            case 8:
                                com.tencent.mm.protobuf.f custom = getCustom(i18);
                                if (custom != null) {
                                    j17 = b36.f.i(i19, custom.computeSize());
                                    break;
                                } else {
                                    break;
                                }
                            default:
                                continue;
                        }
                    }
                }
                i17 += j17;
            }
            com.tencent.mm.protobuf.n.c(this.__initialProtobufBytes, java.lang.Integer.valueOf(i17));
            return i17;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.protobuf.n.a("computeSize(PB3) error", e17);
            return 0;
        }
    }

    public final java.lang.String debugString() {
        com.tencent.mm.protobuf.j[] jVarArr = this.__fields;
        if (jVarArr.length != 2 || !kotlin.jvm.internal.o.b(jVarArr[0].f192158a.f192161b, "key") || !kotlin.jvm.internal.o.b(this.__fields[1].f192158a.f192161b, "value")) {
            java.lang.String jSONObject = toJSON().toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            return jSONObject;
        }
        com.tencent.mm.protobuf.j[] jVarArr2 = this.__fields;
        return jVarArr2[0].f192159b + "=" + jVarArr2[1].f192159b;
    }

    public final com.tencent.mm.protobuf.f fromProtobuf(byte[] bArr) {
        return parseFrom(bArr);
    }

    public final boolean getBoolean(int i17) {
        java.lang.Boolean bool = (java.lang.Boolean) getOrDefault(i17);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final com.tencent.mm.protobuf.g getByteString(int i17) {
        return (com.tencent.mm.protobuf.g) getOrDefault(i17);
    }

    public final <T> java.util.List<T> getCommonList(int i17) {
        java.lang.Object orDefault = getOrDefault(i17);
        if (orDefault instanceof java.util.List) {
            return (java.util.List) orDefault;
        }
        return null;
    }

    public final <T extends com.tencent.mm.protobuf.f> T getCustom(int i17) {
        java.lang.Object orDefault = getOrDefault(i17);
        if (orDefault instanceof com.tencent.mm.protobuf.f) {
            return (T) orDefault;
        }
        return null;
    }

    public final double getDouble(int i17) {
        java.lang.Double d17 = (java.lang.Double) getOrDefault(i17);
        if (d17 != null) {
            return d17.doubleValue();
        }
        return 0.0d;
    }

    public final float getFloat(int i17) {
        java.lang.Float f17 = (java.lang.Float) getOrDefault(i17);
        if (f17 != null) {
            return f17.floatValue();
        }
        return 0.0f;
    }

    public final int getInteger(int i17) {
        java.lang.Integer num = (java.lang.Integer) getOrDefault(i17);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final <T> java.util.LinkedList<T> getLinkedList(int i17) {
        java.lang.Object orDefault = getOrDefault(i17);
        if (orDefault instanceof java.util.LinkedList) {
            return (java.util.LinkedList) orDefault;
        }
        return null;
    }

    public final <T> java.util.LinkedList<T> getList(int i17) {
        java.util.LinkedList<T> linkedList = getLinkedList(i17);
        if (linkedList != null) {
            return linkedList;
        }
        java.util.LinkedList<T> linkedList2 = new java.util.LinkedList<>();
        set(i17, linkedList2);
        return linkedList2;
    }

    public final long getLong(int i17) {
        java.lang.Long l17 = (java.lang.Long) getOrDefault(i17);
        if (l17 != null) {
            return l17.longValue();
        }
        return 0L;
    }

    public final <K, V> java.util.HashMap<K, V> getMap(int i17) {
        java.util.HashMap<K, V> hashMap = (java.util.HashMap) this.__cachedMaps[i17];
        if (hashMap != null) {
            return hashMap;
        }
        java.util.LinkedList<com.tencent.mm.protobuf.e> list = getList(i17);
        com.tencent.mm.protobuf.m mVar = new com.tencent.mm.protobuf.m(new com.tencent.mm.protobuf.a(list), new com.tencent.mm.protobuf.b(this.__fields[i17].f192158a, list), new com.tencent.mm.protobuf.c(list));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mm.protobuf.e eVar : list) {
            java.lang.Object orDefault = eVar.getOrDefault(0);
            java.lang.Object orDefault2 = eVar.getOrDefault(1);
            jz5.l lVar = (orDefault == null || orDefault2 == null) ? null : new jz5.l(orDefault, orDefault2);
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        mVar.a(arrayList);
        this.__cachedMaps[i17] = mVar;
        return mVar;
    }

    public java.lang.Object getOrDefault(int i17) {
        com.tencent.mm.protobuf.j jVar = this.__fields[i17];
        java.lang.Object obj = jVar.f192159b;
        if (obj != null) {
            return obj;
        }
        com.tencent.mm.protobuf.k kVar = jVar.f192158a;
        if (!kVar.f192162c || (kVar.f192166g instanceof java.util.LinkedList)) {
            return kVar.f192166g;
        }
        return null;
    }

    public final java.lang.String getString(int i17) {
        return (java.lang.String) getOrDefault(i17);
    }

    public final com.tencent.mm.protobuf.j[] get__fields() {
        return this.__fields;
    }

    public final boolean[] get__hasSetBitSet() {
        return this.__hasSetBitSet;
    }

    public final boolean hasSet(int i17) {
        return this.__hasSetBitSet[i17];
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        this.__initialProtobufBytes = bArr;
        d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
        kotlin.jvm.internal.o.f(unknownTagHandler, "unknownTagHandler");
        c36.a aVar = new c36.a(bArr, unknownTagHandler);
        for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
            if (!populateBuilderWithField(aVar, this, nextFieldNumber)) {
                aVar.b();
            }
        }
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean populateBuilderWithField(c36.a reader, com.tencent.mm.protobuf.f builder, int i17) {
        kotlin.jvm.internal.o.g(reader, "reader");
        kotlin.jvm.internal.o.g(builder, "builder");
        com.tencent.mm.protobuf.j[] jVarArr = this.__fields;
        int length = jVarArr.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                i18 = -1;
                break;
            }
            if (jVarArr[i18].f192158a.f192160a == i17) {
                break;
            }
            i18++;
        }
        if (i18 == -1) {
            this.__includeUnKnownField = true;
            return false;
        }
        com.tencent.mm.protobuf.k kVar = this.__fields[i18].f192158a;
        if (kVar.f192162c) {
            java.lang.Object c17 = c(kVar, reader, i17);
            if (c17 instanceof java.util.List) {
                java.util.Iterator it = ((java.lang.Iterable) c17).iterator();
                while (it.hasNext()) {
                    addElement(i18, it.next());
                }
            } else {
                addElement(i18, c17);
            }
        } else {
            java.lang.Object c18 = c(kVar, reader, i17);
            if (kVar.f192163d == 8 && (c18 instanceof java.util.List)) {
                java.util.Iterator it6 = ((java.lang.Iterable) c18).iterator();
                while (it6.hasNext()) {
                    set(i18, it6.next());
                }
            } else {
                set(i18, c18);
            }
        }
        return true;
    }

    public final void replaceDefault(int i17, java.lang.Object[] replaceList) {
        kotlin.jvm.internal.o.g(replaceList, "replaceList");
        int length = replaceList.length;
        for (int i18 = 0; i18 < length; i18++) {
            this.__fields[i17 + i18].f192158a.f192166g = replaceList[i18];
        }
    }

    public void set(int i17, java.lang.Object obj) {
        this.__fields[i17].f192159b = obj;
        this.__hasSetBitSet[i17] = true;
    }

    public final void set__fields(com.tencent.mm.protobuf.j[] jVarArr) {
        kotlin.jvm.internal.o.g(jVarArr, "<set-?>");
        this.__fields = jVarArr;
    }

    public final void set__hasSetBitSet(boolean[] zArr) {
        kotlin.jvm.internal.o.g(zArr, "<set-?>");
        this.__hasSetBitSet = zArr;
    }

    public final java.lang.String toHexString() {
        byte[] byteArray = toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        return kz5.z.a0(byteArray, "", null, null, 0, null, com.tencent.mm.protobuf.d.f192154d, 30, null);
    }

    public final byte[] toProtobuf() {
        return toByteArray();
    }

    public final void touchList(int i17) {
        getList(i17);
    }

    @Override // com.tencent.mm.protobuf.f
    public void writeFields(g36.f fVar) {
        if (fVar == null) {
            return;
        }
        com.tencent.mm.protobuf.j[] jVarArr = this.__fields;
        int length = jVarArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            com.tencent.mm.protobuf.k kVar = jVarArr[i17].f192158a;
            int i18 = kVar.f192160a;
            if (kVar.f192162c) {
                java.util.LinkedList linkedList = getLinkedList(i17);
                if (linkedList != null) {
                    if (!(!linkedList.isEmpty())) {
                        linkedList = null;
                    }
                    if (linkedList != null) {
                        fVar.g(i18, kVar.f192163d, linkedList);
                    }
                }
            } else if (!this.__hasSetEnabled || hasSet(i17)) {
                switch (kVar.f192163d) {
                    case 1:
                        java.lang.String string = getString(i17);
                        if (string != null) {
                            fVar.j(i18, string);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        fVar.e(i18, getInteger(i17));
                        break;
                    case 3:
                        fVar.h(i18, getLong(i17));
                        break;
                    case 4:
                        fVar.c(i18, getDouble(i17));
                        break;
                    case 5:
                        fVar.d(i18, getFloat(i17));
                        break;
                    case 6:
                        com.tencent.mm.protobuf.g byteString = getByteString(i17);
                        if (byteString != null) {
                            fVar.b(i18, byteString);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        fVar.a(i18, getBoolean(i17));
                        break;
                    case 8:
                        com.tencent.mm.protobuf.f custom = getCustom(i17);
                        if (custom != null) {
                            fVar.i(i18, custom.computeSize());
                            custom.writeFields(fVar);
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.e fromJson(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            return this;
        }
        try {
            fromJson(new org.json.JSONObject(str));
        } catch (java.lang.Exception unused) {
        }
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            com.tencent.mm.protobuf.j[] jVarArr = this.__fields;
            int length = jVarArr.length;
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String str = jVarArr[i17].f192158a.f192161b;
                if (!this.__hasSetEnabled || hasSet(i17)) {
                    java.lang.Object orDefault = getOrDefault(i17);
                    if (str != null) {
                        n51.f.f335114a.d(jSONObject, str, orDefault, this.__printBytes);
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    public final com.tencent.mm.protobuf.e fromJson(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return this;
        }
        try {
            com.tencent.mm.protobuf.j[] jVarArr = this.__fields;
            int length = jVarArr.length;
            int i17 = 0;
            int i18 = 0;
            while (i17 < length) {
                int i19 = i18 + 1;
                com.tencent.mm.protobuf.k kVar = jVarArr[i17].f192158a;
                java.lang.Object opt = jSONObject.opt(kVar.f192161b);
                if (opt != null) {
                    if (kVar.f192162c) {
                        if (opt instanceof org.json.JSONArray) {
                            int length2 = ((org.json.JSONArray) opt).length();
                            for (int i27 = 0; i27 < length2; i27++) {
                                addElement(i18, b(kVar, ((org.json.JSONArray) opt).get(i27)));
                            }
                        }
                    } else {
                        set(i18, b(kVar, opt));
                    }
                }
                i17++;
                i18 = i19;
            }
        } catch (java.lang.Exception unused) {
        }
        return this;
    }
}
