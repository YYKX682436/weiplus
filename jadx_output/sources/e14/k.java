package e14;

/* loaded from: classes12.dex */
public class k extends e14.l implements e14.s, e14.n {
    private boolean __lazy;
    private e14.s __parentVisitor;
    private e14.p __parser;
    private boolean __useLruCache;
    private java.lang.Integer waitingIndex;
    private java.lang.String __serialName = "";
    private java.lang.String __xmlPrefixTag = "";
    private boolean __trim = true;
    private java.util.Map<java.lang.String, java.lang.Integer> __nameMap = kz5.q0.f314001d;

    public static final void access$tryPauseLazyParse(e14.k kVar, int i17) {
        java.lang.Integer num;
        e14.p pVar;
        if (!kVar.__lazy || (num = kVar.waitingIndex) == null || num.intValue() != i17 || (pVar = kVar.__parser) == null) {
            return;
        }
        pVar.f246437b = true;
    }

    @Override // com.tencent.mm.protobuf.e
    public int appendAttrs(com.tencent.mm.protobuf.k[] attrs) {
        kotlin.jvm.internal.o.g(attrs, "attrs");
        int appendAttrs = super.appendAttrs(attrs);
        com.tencent.mm.protobuf.j[] jVarArr = get__fields();
        java.util.ArrayList arrayList = new java.util.ArrayList(jVarArr.length);
        int length = jVarArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            arrayList.add(new jz5.l(jVarArr[i17].f192158a.f192161b, java.lang.Integer.valueOf(i18)));
            i17++;
            i18++;
        }
        this.__nameMap = kz5.c1.q(arrayList);
        return appendAttrs;
    }

    public void cloneFrom(e14.n other) {
        kotlin.jvm.internal.o.g(other, "other");
        if (!(other instanceof e14.k)) {
            fromJson(other.toJson());
            return;
        }
        com.tencent.mm.protobuf.j[] jVarArr = ((e14.k) other).deepCopy().get__fields();
        int length = jVarArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            com.tencent.mm.protobuf.j jVar = jVarArr[i17];
            int i19 = i18 + 1;
            if (get__fields().length <= i18 || !kotlin.jvm.internal.o.b(get__fields()[i18].f192158a.f192161b, jVar.f192158a.f192161b)) {
                java.lang.Integer num = this.__nameMap.get(jVar.f192158a.f192161b);
                if (num != null && num.intValue() >= 0 && num.intValue() < get__fields().length) {
                    get__fields()[num.intValue()].f192159b = jVar.f192159b;
                    get__fields()[num.intValue()].f192158a.f192166g = jVar.f192158a.f192166g;
                }
            } else {
                get__fields()[i18].f192159b = jVar.f192159b;
                get__fields()[i18].f192158a.f192166g = jVar.f192158a.f192166g;
            }
            i17++;
            i18 = i19;
        }
    }

    public final java.lang.Object d(java.lang.String str, int i17) {
        if (i17 == 1) {
            return str;
        }
        if (i17 == 2) {
            return toSerializeInt(str, null);
        }
        if (i17 == 3) {
            return toSerializeLong(str, null);
        }
        if (i17 == 4) {
            return toSerializeDouble(str, null);
        }
        if (i17 == 5) {
            return toSerializeFloat(str, null);
        }
        if (i17 == 7) {
            return toSerializeBoolean(str, null);
        }
        throw new java.lang.Exception("Unknown primary data type " + str);
    }

    public final e14.k deepCopy() {
        int i17 = 0;
        e14.k kVar = (e14.k) getClass().getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        com.tencent.mm.protobuf.j[] jVarArr = get__fields();
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(jVarArr, jVarArr.length);
        kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
        int length = copyOf.length;
        int i18 = 0;
        while (i17 < length) {
            com.tencent.mm.protobuf.j jVar = (com.tencent.mm.protobuf.j) copyOf[i17];
            com.tencent.mm.protobuf.k kVar2 = kVar.get__fields()[i18].f192158a;
            zn4.a aVar = zn4.a.f474492a;
            kVar2.f192166g = aVar.a(jVar.f192158a.f192166g);
            kVar.get__fields()[i18].f192159b = aVar.a(jVar.f192159b);
            i17++;
            i18++;
        }
        kotlin.jvm.internal.o.d(kVar);
        return kVar;
    }

    public final void e(java.lang.String str, java.lang.String str2) {
        java.util.Map<java.lang.String, java.lang.String> a17;
        boolean containsKey;
        boolean containsKey2;
        java.lang.String xmlParserRootTag = getXmlParserRootTag(this.__serialName, str2);
        java.lang.String str3 = str + "_" + xmlParserRootTag;
        if (this.__useLruCache) {
            zn4.i iVar = zn4.i.f474505a;
            e14.o c17 = iVar.c();
            synchronized (c17) {
                containsKey2 = c17.f246432a.containsKey(str3);
            }
            if (containsKey2) {
                java.lang.Object a18 = iVar.c().a(str3);
                if (a18 instanceof java.util.Map) {
                    a17 = (java.util.Map) a18;
                } else {
                    iVar.c().c(str3);
                    a17 = e14.r.a(str, xmlParserRootTag);
                }
            } else {
                a17 = e14.r.a(str, xmlParserRootTag);
            }
        } else {
            a17 = e14.r.a(str, xmlParserRootTag);
        }
        if (a17 != null) {
            fromXmlMap(a17, str2);
            if (this.__useLruCache) {
                zn4.i iVar2 = zn4.i.f474505a;
                e14.o c18 = iVar2.c();
                synchronized (c18) {
                    containsKey = c18.f246432a.containsKey(str3);
                }
                if (containsKey) {
                    return;
                }
                iVar2.c().b(str3, a17);
            }
        }
    }

    @Override // e14.s
    public e14.s enterParent(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        java.lang.Integer num = this.__nameMap.get(name);
        if (num == null || num.intValue() < 0 || num.intValue() >= get__fields().length) {
            ho4.g gVar = new ho4.g(this);
            this.__includeUnKnownField = true;
            return gVar;
        }
        com.tencent.mm.protobuf.j jVar = get__fields()[num.intValue()];
        com.tencent.mm.protobuf.k kVar = jVar.f192158a;
        int i17 = kVar.f192163d;
        com.tencent.mm.protobuf.k kVar2 = jVar.f192158a;
        if (i17 != 8) {
            if (!kVar.f192162c || kotlin.jvm.internal.o.b(kVar.f192168i, "SerializeFieldFlattenItemTagName")) {
                return new ho4.e(this, new e14.f(this, num, jVar));
            }
            touchList(num.intValue());
            java.lang.String itemTagName = kVar2.f192168i;
            kotlin.jvm.internal.o.f(itemTagName, "itemTagName");
            return new ho4.c(this, itemTagName, new e14.d(this, num, jVar), new e14.e(this, num));
        }
        if (kVar.f192162c && !kotlin.jvm.internal.o.b(kVar.f192168i, "SerializeFieldFlattenItemTagName")) {
            touchList(num.intValue());
            java.lang.String itemTagName2 = kVar2.f192168i;
            kotlin.jvm.internal.o.f(itemTagName2, "itemTagName");
            return new ho4.f(this, itemTagName2, new e14.b(jVar, this, num), new e14.c(this, num));
        }
        java.lang.Class cls = kVar2.f192164e;
        kotlin.jvm.internal.o.d(cls);
        e14.k kVar3 = (e14.k) cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        kVar3.__parentVisitor = this;
        kVar3.__lazy = this.__lazy;
        kVar3.__parser = this.__parser;
        i(num.intValue(), jVar, kVar3);
        return kVar3;
    }

    public boolean existTag(java.lang.String tagName) {
        kotlin.jvm.internal.o.g(tagName, "tagName");
        return this.__nameMap.containsKey(tagName);
    }

    @Override // e14.s
    public e14.s exitParent() {
        return this.__parentVisitor;
    }

    public final void f(java.util.Map map, java.lang.String str, java.lang.String str2) {
        java.lang.reflect.Constructor declaredConstructor;
        java.lang.String str3;
        java.lang.StringBuilder sb6;
        if (!r26.n0.N(str2)) {
            str = str2 + "." + str;
        }
        com.tencent.mm.protobuf.j[] jVarArr = get__fields();
        int length = jVarArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            com.tencent.mm.protobuf.j jVar = jVarArr[i17];
            int i19 = i18 + 1;
            com.tencent.mm.protobuf.k kVar = jVar.f192158a;
            java.lang.Object obj = null;
            if (kVar.f192162c) {
                java.lang.Class cls = kVar.f192164e;
                java.lang.String str4 = str + "." + kVar.f192161b;
                if (cls == null) {
                    java.lang.Class<?> primaryPbFieldToClazz = primaryPbFieldToClazz(kVar.f192163d);
                    if (primaryPbFieldToClazz != null) {
                        java.lang.String itemTagName = kVar.f192168i;
                        kotlin.jvm.internal.o.f(itemTagName, "itemTagName");
                        java.util.LinkedList g17 = g(primaryPbFieldToClazz, map, str4, itemTagName);
                        if (!g17.isEmpty()) {
                            getList(i18).addAll(g17);
                        }
                        obj = jz5.f0.f302826a;
                    }
                    if (obj == null) {
                        zn4.f.f474499a.a(new e14.g(jVar, map));
                    }
                } else {
                    java.lang.String itemTagName2 = kVar.f192168i;
                    kotlin.jvm.internal.o.f(itemTagName2, "itemTagName");
                    java.util.LinkedList g18 = g(cls, map, str4, itemTagName2);
                    if (!g18.isEmpty()) {
                        getList(i18).addAll(g18);
                    }
                }
            } else if (kVar.f192164e == null) {
                if (kVar.f192167h) {
                    str3 = kVar.f192161b;
                    sb6 = new java.lang.StringBuilder(".");
                    sb6.append(str);
                    sb6.append(".$");
                } else {
                    str3 = kVar.f192161b;
                    sb6 = new java.lang.StringBuilder(".");
                    sb6.append(str);
                    sb6.append(".");
                }
                sb6.append(str3);
                java.lang.String str5 = (java.lang.String) map.get(sb6.toString());
                if (str5 != null) {
                    com.tencent.mm.protobuf.j jVar2 = get__fields()[i18];
                    i(i18, jVar2, d(str5, jVar2.f192158a.f192163d));
                }
            } else {
                if (map.containsKey("." + str + "." + kVar.f192161b)) {
                    java.lang.Class cls2 = kVar.f192164e;
                    if (cls2 != null && (declaredConstructor = cls2.getDeclaredConstructor(new java.lang.Class[0])) != null) {
                        obj = declaredConstructor.newInstance(new java.lang.Object[0]);
                    }
                    if (obj instanceof e14.k) {
                        java.lang.String name = kVar.f192161b;
                        kotlin.jvm.internal.o.f(name, "name");
                        ((e14.k) obj).f(map, name, str);
                        i(i18, jVar, obj);
                    } else {
                        zn4.f.f474499a.a(new e14.h(jVar, map));
                    }
                }
            }
            i17++;
            i18 = i19;
        }
    }

    public void fromJsonStr(java.lang.String jsonStr) {
        boolean containsKey;
        kotlin.jvm.internal.o.g(jsonStr, "jsonStr");
        if (this.__useLruCache) {
            zn4.i iVar = zn4.i.f474505a;
            e14.o b17 = iVar.b();
            synchronized (b17) {
                containsKey = b17.f246432a.containsKey(jsonStr);
            }
            if (containsKey) {
                e14.k kVar = (e14.k) iVar.b().a(jsonStr);
                kotlin.jvm.internal.o.d(kVar);
                cloneFrom(kVar);
                return;
            }
        }
        fromJson(new org.json.JSONObject(jsonStr));
        if (this.__useLruCache) {
            zn4.i.f474505a.b().b(jsonStr, deepCopy());
        }
    }

    public void fromXml(java.lang.String xml, java.lang.String xmlPrefixTag) {
        kotlin.jvm.internal.o.g(xml, "xml");
        kotlin.jvm.internal.o.g(xmlPrefixTag, "xmlPrefixTag");
        e14.m.a(this, xml, xmlPrefixTag, false, false, 8, null);
    }

    public void fromXmlMap(java.util.Map<java.lang.String, java.lang.String> xmlValueMap) {
        kotlin.jvm.internal.o.g(xmlValueMap, "xmlValueMap");
        fromXmlMap(xmlValueMap, this.__xmlPrefixTag);
    }

    public final java.util.LinkedList g(java.lang.Class cls, java.util.Map map, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i17 = 0;
        while (true) {
            if (isPrimaryClassType(cls)) {
                java.lang.String str3 = r26.n0.N(str2) ? "item" : str2;
                if (i17 == 0) {
                    sb6 = new java.lang.StringBuilder(".");
                    sb6.append(str);
                    sb6.append(".");
                    sb6.append(str3);
                } else {
                    sb6 = new java.lang.StringBuilder(".");
                    sb6.append(str);
                    sb6.append(".");
                    sb6.append(str3);
                    sb6.append(i17);
                }
                java.lang.String sb7 = sb6.toString();
                if (!map.containsKey(sb7)) {
                    break;
                }
                java.lang.String str4 = (java.lang.String) map.get(sb7);
                if (str4 != null) {
                    if (kotlin.jvm.internal.o.b(cls, java.lang.Integer.TYPE)) {
                        linkedList.add(toSerializeInt(str4, 0));
                    } else if (kotlin.jvm.internal.o.b(cls, java.lang.Short.TYPE)) {
                        linkedList.add(toSerializeShort(str4, (short) 0));
                    } else if (kotlin.jvm.internal.o.b(cls, java.lang.Long.TYPE)) {
                        linkedList.add(toSerializeLong(str4, 0L));
                    } else if (kotlin.jvm.internal.o.b(cls, java.lang.Double.TYPE)) {
                        linkedList.add(toSerializeDouble(str4, java.lang.Double.valueOf(0.0d)));
                    } else if (kotlin.jvm.internal.o.b(cls, java.lang.Float.TYPE)) {
                        linkedList.add(toSerializeFloat(str4, java.lang.Float.valueOf(0.0f)));
                    } else if (kotlin.jvm.internal.o.b(cls, java.lang.Boolean.TYPE)) {
                        linkedList.add(toSerializeBoolean(str4, java.lang.Boolean.FALSE));
                    } else if (kotlin.jvm.internal.o.b(cls, java.lang.String.class)) {
                        linkedList.add(toSerializeString(str4, ""));
                    }
                }
                i17++;
            } else {
                java.lang.Object newInstance = cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.plugin.serialize.BaseSerializeClass");
                e14.k kVar = (e14.k) newInstance;
                java.lang.String str5 = r26.n0.N(str2) ? kVar.__serialName : str2;
                if (i17 != 0) {
                    str5 = str5 + i17;
                }
                if (!map.containsKey("." + str + "." + str5)) {
                    break;
                }
                kVar.f(map, str5, str);
                linkedList.add(kVar);
                i17++;
            }
        }
        return linkedList;
    }

    @Override // com.tencent.mm.protobuf.e
    public java.lang.Object getOrDefault(int i17) {
        if (this.__lazy && this.__parser != null && this.waitingIndex == null && !hasSet(i17)) {
            if (this.waitingIndex != null) {
                return super.getOrDefault(i17);
            }
            this.waitingIndex = java.lang.Integer.valueOf(i17);
            e14.p pVar = this.__parser;
            if (pVar != null) {
                pVar.b();
            }
            this.waitingIndex = null;
        }
        return super.getOrDefault(i17);
    }

    public java.lang.Object getTagValue(java.lang.String tagName) {
        kotlin.jvm.internal.o.g(tagName, "tagName");
        java.lang.Integer num = this.__nameMap.get(tagName);
        if (num != null) {
            return getOrDefault(num.intValue());
        }
        return null;
    }

    public final e14.s get__parentVisitor() {
        return this.__parentVisitor;
    }

    public final java.lang.String get__serialName() {
        return this.__serialName;
    }

    public final boolean get__trim() {
        return this.__trim;
    }

    public final boolean get__useLruCache() {
        return this.__useLruCache;
    }

    public final java.lang.String get__xmlPrefixTag() {
        return this.__xmlPrefixTag;
    }

    public final void i(int i17, com.tencent.mm.protobuf.j jVar, java.lang.Object obj) {
        java.lang.Integer num;
        e14.p pVar;
        if (jVar.f192158a.f192162c) {
            addElement(i17, obj);
            return;
        }
        if (hasSet(i17)) {
            return;
        }
        set(i17, obj);
        if (!this.__lazy || (num = this.waitingIndex) == null || num.intValue() != i17 || (pVar = this.__parser) == null) {
            return;
        }
        pVar.f246437b = true;
    }

    public final void set__parentVisitor(e14.s sVar) {
        this.__parentVisitor = sVar;
    }

    public final void set__serialName(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.__serialName = str;
    }

    public final void set__trim(boolean z17) {
        this.__trim = z17;
    }

    public final void set__useLruCache(boolean z17) {
        this.__useLruCache = z17;
    }

    public final void set__xmlPrefixTag(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.__xmlPrefixTag = str;
    }

    @Override // e14.n
    public org.json.JSONObject toJson() {
        return toJson(this.__trim);
    }

    public java.lang.String toXml(boolean z17, java.lang.String xmlPrefixTag) {
        kotlin.jvm.internal.o.g(xmlPrefixTag, "xmlPrefixTag");
        return toXml(z17, this.__serialName, xmlPrefixTag);
    }

    @Override // e14.s
    public void writeAttr(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        java.lang.Integer num = this.__nameMap.get(key);
        if (num == null || num.intValue() < 0 || num.intValue() >= get__fields().length || !get__fields()[num.intValue()].f192158a.f192167h) {
            this.__includeUnKnownField = true;
            return;
        }
        int intValue = num.intValue();
        com.tencent.mm.protobuf.j jVar = get__fields()[intValue];
        i(intValue, jVar, d(value, jVar.f192158a.f192163d));
    }

    @Override // e14.s
    public void writeText(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        this.__includeUnKnownField = true;
        zn4.f.f474500b.invoke(new e14.j(text));
    }

    @Override // e14.n
    public void fromXml(java.lang.String xml, java.lang.String xmlPrefixTag, boolean z17, boolean z18) {
        java.lang.String str;
        boolean containsKey;
        kotlin.jvm.internal.o.g(xml, "xml");
        kotlin.jvm.internal.o.g(xmlPrefixTag, "xmlPrefixTag");
        set__hasSetBitSet(new boolean[get__hasSetBitSet().length]);
        if (zn4.f.f474502d && !z18) {
            e(xml, xmlPrefixTag);
            return;
        }
        try {
            this.__lazy = z17;
            java.lang.String xmlParserRootTag = getXmlParserRootTag(this.__serialName, xmlPrefixTag);
            java.lang.String str2 = xml + "_" + xmlParserRootTag;
            if (this.__useLruCache) {
                zn4.i iVar = zn4.i.f474505a;
                e14.o b17 = iVar.b();
                synchronized (b17) {
                    containsKey = b17.f246432a.containsKey(str2);
                }
                if (containsKey) {
                    e14.k kVar = (e14.k) iVar.b().a(str2);
                    if (kVar != null) {
                        cloneFrom(kVar);
                        return;
                    }
                    iVar.b().c(str2);
                }
            }
            int L = r26.n0.L(xml, "<" + xmlParserRootTag, 0, false, 6, null);
            if (L < 0) {
                return;
            }
            if (L > 0) {
                str = xml.substring(L);
                kotlin.jvm.internal.o.f(str, "substring(...)");
            } else {
                str = xml;
            }
            e14.p pVar = new e14.p(str, new ho4.b(xmlPrefixTag, this.__serialName, this));
            this.__parser = pVar;
            if (this.__lazy) {
                return;
            }
            pVar.b();
            if (this.__useLruCache) {
                zn4.i.f474505a.b().b(str2, deepCopy());
            }
        } catch (java.lang.Exception e17) {
            zn4.f.f474499a.a(new e14.i(e17));
            e(xml, xmlPrefixTag);
        }
    }

    public void fromXmlMap(java.util.Map<java.lang.String, java.lang.String> xmlValueMap, java.lang.String xmlPrefixTag) {
        kotlin.jvm.internal.o.g(xmlValueMap, "xmlValueMap");
        kotlin.jvm.internal.o.g(xmlPrefixTag, "xmlPrefixTag");
        f(xmlValueMap, this.__serialName, xmlPrefixTag);
    }

    @Override // com.tencent.mm.protobuf.e, com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        return super.toJSON();
    }

    public org.json.JSONObject toJson(boolean z17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.tencent.mm.protobuf.j[] jVarArr = get__fields();
        int length = jVarArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            java.lang.String name = jVarArr[i17].f192158a.f192161b;
            kotlin.jvm.internal.o.f(name, "name");
            putJSONObjectFromValue(jSONObject, name, getOrDefault(i18), z17);
            i17++;
            i18++;
        }
        return jSONObject;
    }

    public final java.lang.String toXml(boolean z17, java.lang.String tagName, java.lang.String xmlPrefixTag) {
        kotlin.jvm.internal.o.g(tagName, "tagName");
        kotlin.jvm.internal.o.g(xmlPrefixTag, "xmlPrefixTag");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("<".concat(tagName));
        com.tencent.mm.protobuf.j[] jVarArr = get__fields();
        kotlin.jvm.internal.o.g(jVarArr, "<this>");
        kz5.y yVar = new kz5.y(jVarArr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kz5.w0 w0Var = new kz5.w0((java.util.Iterator) yVar.invoke());
        while (w0Var.hasNext()) {
            java.lang.Object next = w0Var.next();
            if (((com.tencent.mm.protobuf.j) ((kz5.u0) next).f314016b).f192158a.f192167h) {
                arrayList.add(next);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kz5.u0 u0Var = (kz5.u0) it.next();
            int i17 = u0Var.f314015a;
            com.tencent.mm.protobuf.j jVar = (com.tencent.mm.protobuf.j) u0Var.f314016b;
            java.lang.Object orDefault = getOrDefault(i17);
            if (orDefault != null) {
                java.lang.String name = jVar.f192158a.f192161b;
                kotlin.jvm.internal.o.f(name, "name");
                putXmlStrFromAttribute(sb6, name, orDefault, z17);
            }
        }
        sb6.append(">");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        kz5.w0 w0Var2 = new kz5.w0((java.util.Iterator) yVar.invoke());
        while (w0Var2.hasNext()) {
            java.lang.Object next2 = w0Var2.next();
            if (!((com.tencent.mm.protobuf.j) ((kz5.u0) next2).f314016b).f192158a.f192167h) {
                arrayList2.add(next2);
            }
        }
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            kz5.u0 u0Var2 = (kz5.u0) it6.next();
            int i18 = u0Var2.f314015a;
            com.tencent.mm.protobuf.j jVar2 = (com.tencent.mm.protobuf.j) u0Var2.f314016b;
            java.lang.Object orDefault2 = getOrDefault(i18);
            if (orDefault2 != null) {
                java.lang.String name2 = jVar2.f192158a.f192161b;
                kotlin.jvm.internal.o.f(name2, "name");
                java.lang.String itemTagName = jVar2.f192158a.f192168i;
                kotlin.jvm.internal.o.f(itemTagName, "itemTagName");
                putXmlStrFromValue(sb6, name2, itemTagName, orDefault2, z17);
            }
        }
        sb6.append("</" + tagName + ">");
        putXmlStrPrefixTag(sb6, xmlPrefixTag);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public void fromXml(java.lang.String xml, boolean z17) {
        kotlin.jvm.internal.o.g(xml, "xml");
        e14.m.a(this, xml, this.__xmlPrefixTag, z17, false, 8, null);
    }

    public void fromXml(java.lang.String xml) {
        kotlin.jvm.internal.o.g(xml, "xml");
        e14.m.a(this, xml, this.__xmlPrefixTag, false, false, 8, null);
    }

    public java.lang.String toXml() {
        return toXml(this.__trim, this.__serialName, this.__xmlPrefixTag);
    }

    public java.lang.String toXml(boolean z17) {
        return toXml(z17, this.__serialName, this.__xmlPrefixTag);
    }
}
