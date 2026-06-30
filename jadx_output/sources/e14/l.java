package e14;

/* loaded from: classes12.dex */
public class l extends e14.a {
    public boolean checkValueSkip(java.lang.String fieldSerializeName, java.lang.Object obj, boolean z17) {
        kotlin.jvm.internal.o.g(fieldSerializeName, "fieldSerializeName");
        if (z17) {
            if (obj == null || kotlin.jvm.internal.o.b(obj, 0) || kotlin.jvm.internal.o.b(obj, 0L) || kotlin.jvm.internal.o.b(obj, java.lang.Float.valueOf(0.0f)) || kotlin.jvm.internal.o.b(obj, java.lang.Double.valueOf(0.0d)) || kotlin.jvm.internal.o.b(obj, "") || kotlin.jvm.internal.o.b(r26.n0.u0(obj.toString()).toString(), "") || kotlin.jvm.internal.o.b(r26.n0.u0(obj.toString()).toString(), "null")) {
                return true;
            }
        } else if (obj == null) {
            return true;
        }
        return false;
    }

    public java.lang.String getXmlParserPrefixTag(java.lang.String tagName, java.lang.String xmlPrefixTag) {
        kotlin.jvm.internal.o.g(tagName, "tagName");
        kotlin.jvm.internal.o.g(xmlPrefixTag, "xmlPrefixTag");
        if (r26.n0.N(xmlPrefixTag)) {
            return tagName;
        }
        return xmlPrefixTag + "." + tagName;
    }

    public java.lang.String getXmlParserRootTag(java.lang.String tagName, java.lang.String xmlPrefixTag) {
        kotlin.jvm.internal.o.g(tagName, "tagName");
        kotlin.jvm.internal.o.g(xmlPrefixTag, "xmlPrefixTag");
        return r26.n0.N(xmlPrefixTag) ? tagName : (java.lang.String) kz5.n0.X(r26.n0.f0(xmlPrefixTag, new java.lang.String[]{"."}, false, 0, 6, null));
    }

    public final boolean isPrimaryClassType(java.lang.Class<?> clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        if (kotlin.jvm.internal.o.b(clazz, java.lang.Integer.TYPE) ? true : kotlin.jvm.internal.o.b(clazz, java.lang.Short.TYPE) ? true : kotlin.jvm.internal.o.b(clazz, java.lang.Long.TYPE) ? true : kotlin.jvm.internal.o.b(clazz, java.lang.Double.TYPE) ? true : kotlin.jvm.internal.o.b(clazz, java.lang.Float.TYPE) ? true : kotlin.jvm.internal.o.b(clazz, java.lang.Boolean.TYPE)) {
            return true;
        }
        return kotlin.jvm.internal.o.b(clazz, java.lang.String.class);
    }

    public boolean isPrimaryValueType(java.lang.Object obj) {
        return (obj instanceof java.lang.String) || (obj instanceof java.lang.Integer) || (obj instanceof java.lang.Long) || (obj instanceof java.lang.Boolean) || (obj instanceof java.lang.Float) || (obj instanceof java.lang.Double) || (obj instanceof java.lang.Short) || (obj instanceof java.lang.Character);
    }

    public boolean isXmlListNeedCountAttr(java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        kotlin.jvm.internal.o.g(tagName, "tagName");
        kotlin.jvm.internal.o.g(itemTagName, "itemTagName");
        return false;
    }

    public final java.lang.Class<?> primaryPbFieldToClazz(int i17) {
        if (i17 == 1) {
            return java.lang.String.class;
        }
        if (i17 == 2) {
            return java.lang.Integer.TYPE;
        }
        if (i17 == 3) {
            return java.lang.Long.TYPE;
        }
        if (i17 == 4) {
            return java.lang.Double.TYPE;
        }
        if (i17 == 5) {
            return java.lang.Float.TYPE;
        }
        if (i17 != 7) {
            return null;
        }
        return java.lang.Boolean.TYPE;
    }

    public boolean processXmlEmptySerializeNode(java.lang.String valueXml, java.lang.String tagName, boolean z17) {
        kotlin.jvm.internal.o.g(valueXml, "valueXml");
        kotlin.jvm.internal.o.g(tagName, "tagName");
        if (z17) {
            if (kotlin.jvm.internal.o.b(valueXml, "<" + tagName + "></" + tagName + ">")) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String processXmlValue(java.lang.Object value, java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(tagName, "tagName");
        kotlin.jvm.internal.o.g(itemTagName, "itemTagName");
        if (!processXmlValueUseCData(value, tagName, itemTagName, z17)) {
            return value instanceof java.lang.String ? zn4.i.f474505a.a((java.lang.String) value) : value.toString();
        }
        if (value instanceof java.lang.Number) {
            return value.toString();
        }
        if (!(value instanceof java.lang.String) || !r26.n0.B((java.lang.CharSequence) value, "]]>", false)) {
            return "<![CDATA[" + value + "]]>";
        }
        return "<![CDATA[" + r26.i0.t((java.lang.String) value, "]]>", "]]]]><![CDATA[>", false) + "]]>";
    }

    public boolean processXmlValueUseCData(java.lang.Object value, java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(tagName, "tagName");
        kotlin.jvm.internal.o.g(itemTagName, "itemTagName");
        return false;
    }

    public void putFieldValueFromJsonObject(e14.k serializeObj, org.json.JSONObject jsonObj) {
        kotlin.jvm.internal.o.g(serializeObj, "serializeObj");
        kotlin.jvm.internal.o.g(jsonObj, "jsonObj");
        serializeObj.fromJson(jsonObj);
    }

    public void putJSONArrayFromList(org.json.JSONArray array, java.lang.String key, java.util.List<?> list, boolean z17) {
        kotlin.jvm.internal.o.g(array, "array");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(list, "list");
        for (java.lang.Object obj : list) {
            if (!checkValueSkip(key, obj, z17) && obj != null) {
                if (isPrimaryValueType(obj)) {
                    array.put(obj);
                } else if (obj instanceof e14.k) {
                    array.put(((e14.k) obj).toJson(z17));
                }
            }
        }
    }

    public void putJSONObjectFromValue(org.json.JSONObject obj, java.lang.String key, java.lang.Object obj2, boolean z17) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(key, "key");
        if (checkValueSkip(key, obj2, z17) || obj2 == null) {
            return;
        }
        if (obj2 instanceof java.util.List) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            putJSONArrayFromList(jSONArray, "", (java.util.List) obj2, z17);
            obj.put(key, jSONArray);
        } else if (isPrimaryValueType(obj2)) {
            obj.put(key, obj2);
        } else if (obj2 instanceof e14.k) {
            obj.put(key, ((e14.k) obj2).toJson(z17));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void putListValueFromJsonArray(java.util.List<T> list, java.lang.Class<T> itemClazz, org.json.JSONArray jsonArr) {
        kotlin.jvm.internal.o.g(list, "list");
        kotlin.jvm.internal.o.g(itemClazz, "itemClazz");
        kotlin.jvm.internal.o.g(jsonArr, "jsonArr");
        int length = jsonArr.length();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object opt = jsonArr.opt(i17);
            if (opt != null) {
                if (opt instanceof org.json.JSONObject) {
                    java.lang.reflect.Constructor<?>[] constructors = itemClazz.getConstructors();
                    kotlin.jvm.internal.o.f(constructors, "getConstructors(...)");
                    java.lang.Object newInstance = ((java.lang.reflect.Constructor) kz5.z.L(constructors)).newInstance(new java.lang.Object[0]);
                    kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.plugin.serialize.BaseSerializeClass");
                    e14.k kVar = (e14.k) newInstance;
                    kVar.fromJson((org.json.JSONObject) opt);
                    list.add(kVar);
                } else if (isPrimaryValueType(opt)) {
                    list.add(opt);
                }
            }
        }
    }

    public void putXmlStrFromAttribute(java.lang.StringBuilder xmlBuilder, java.lang.String key, java.lang.Object obj, boolean z17) {
        kotlin.jvm.internal.o.g(xmlBuilder, "xmlBuilder");
        kotlin.jvm.internal.o.g(key, "key");
        if (checkValueSkip(key, obj, z17) || !isPrimaryValueType(obj)) {
            return;
        }
        if (!(obj instanceof java.lang.String)) {
            xmlBuilder.append(" " + key + "=\"" + obj + "\"");
            return;
        }
        xmlBuilder.append(" " + key + "=\"" + zn4.i.f474505a.a((java.lang.String) obj) + "\"");
    }

    public void putXmlStrFromList(java.lang.StringBuilder xmlBuilder, java.util.List<?> list, java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        kotlin.jvm.internal.o.g(xmlBuilder, "xmlBuilder");
        kotlin.jvm.internal.o.g(list, "list");
        kotlin.jvm.internal.o.g(tagName, "tagName");
        kotlin.jvm.internal.o.g(itemTagName, "itemTagName");
        if (!list.isEmpty()) {
            if (kotlin.jvm.internal.o.b(itemTagName, "SerializeFieldFlattenItemTagName")) {
                for (java.lang.Object obj : list) {
                    if (!checkValueSkip(tagName, obj, z17) && obj != null) {
                        if (obj instanceof e14.k) {
                            xmlBuilder.append(((e14.k) obj).toXml(z17, r26.n0.N(tagName) ? ((e14.k) obj).get__serialName() : tagName, ""));
                        } else if (isPrimaryValueType(obj)) {
                            java.lang.String str = r26.n0.N(tagName) ? "item" : tagName;
                            xmlBuilder.append("<" + str + ">");
                            xmlBuilder.append(processXmlValue(obj, tagName, itemTagName, z17));
                            xmlBuilder.append("</" + str + ">");
                        }
                    }
                }
                return;
            }
            if (isXmlListNeedCountAttr(tagName, itemTagName, z17)) {
                xmlBuilder.append("<" + tagName + " count=\"" + list.size() + "\">");
            } else {
                xmlBuilder.append("<" + tagName + ">");
            }
            for (java.lang.Object obj2 : list) {
                if (!checkValueSkip(tagName, obj2, z17) && obj2 != null) {
                    if (obj2 instanceof e14.k) {
                        xmlBuilder.append(((e14.k) obj2).toXml(z17, r26.n0.N(itemTagName) ? ((e14.k) obj2).get__serialName() : itemTagName, ""));
                    } else if (isPrimaryValueType(obj2)) {
                        java.lang.String str2 = r26.n0.N(itemTagName) ? "item" : itemTagName;
                        xmlBuilder.append("<" + str2 + ">");
                        xmlBuilder.append(processXmlValue(obj2, tagName, itemTagName, z17));
                        xmlBuilder.append("</" + str2 + ">");
                    }
                }
            }
            xmlBuilder.append("</" + tagName + ">");
        }
    }

    public void putXmlStrFromValue(java.lang.StringBuilder xmlBuilder, java.lang.String tagName, java.lang.String itemTagName, java.lang.Object obj, boolean z17) {
        kotlin.jvm.internal.o.g(xmlBuilder, "xmlBuilder");
        kotlin.jvm.internal.o.g(tagName, "tagName");
        kotlin.jvm.internal.o.g(itemTagName, "itemTagName");
        if (checkValueSkip(tagName, obj, z17) || obj == null) {
            return;
        }
        if (isPrimaryValueType(obj)) {
            xmlBuilder.append("<" + tagName + ">" + processXmlValue(obj, tagName, itemTagName, z17) + "</" + tagName + ">");
            return;
        }
        if (obj instanceof java.util.List) {
            putXmlStrFromList(xmlBuilder, (java.util.List) obj, tagName, itemTagName, z17);
        } else if (obj instanceof e14.k) {
            java.lang.String xml = ((e14.k) obj).toXml(z17, tagName, "");
            if (processXmlEmptySerializeNode(xml, tagName, z17)) {
                return;
            }
            xmlBuilder.append(xml);
        }
    }

    public void putXmlStrPrefixTag(java.lang.StringBuilder xmlBuilder, java.lang.String xmlPrefixTag) {
        kotlin.jvm.internal.o.g(xmlBuilder, "xmlBuilder");
        kotlin.jvm.internal.o.g(xmlPrefixTag, "xmlPrefixTag");
        if (!r26.n0.N(xmlPrefixTag)) {
            java.util.List f07 = r26.n0.f0(xmlPrefixTag, new java.lang.String[]{"."}, false, 0, 6, null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : f07) {
                if (!r26.n0.N((java.lang.String) obj)) {
                    arrayList.add(obj);
                }
            }
            java.lang.String g07 = kz5.n0.g0(arrayList, "><", "<", ">", 0, null, null, 56, null);
            java.lang.String g08 = kz5.n0.g0(kz5.i0.H(arrayList), "></", "</", ">", 0, null, null, 56, null);
            xmlBuilder.insert(0, g07);
            xmlBuilder.append(g08);
        }
    }

    public java.lang.Boolean toSerializeBoolean(java.lang.String str, java.lang.Boolean bool) {
        if (str == null || r26.n0.N(str)) {
            return bool;
        }
        try {
            return java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(str));
        } catch (java.lang.NumberFormatException unused) {
            return bool;
        }
    }

    public java.lang.Double toSerializeDouble(java.lang.String str, java.lang.Double d17) {
        if (str == null || r26.n0.N(str)) {
            return d17;
        }
        try {
            return java.lang.Double.valueOf(java.lang.Double.parseDouble(str));
        } catch (java.lang.NumberFormatException unused) {
            return d17;
        }
    }

    public java.lang.Float toSerializeFloat(java.lang.String str, java.lang.Float f17) {
        if (str == null || r26.n0.N(str)) {
            return f17;
        }
        try {
            return java.lang.Float.valueOf(java.lang.Float.parseFloat(str));
        } catch (java.lang.NumberFormatException unused) {
            return f17;
        }
    }

    public java.lang.Integer toSerializeInt(java.lang.String str, java.lang.Integer num) {
        if (str == null || r26.n0.N(str)) {
            return num;
        }
        try {
            return java.lang.Integer.valueOf(java.lang.Integer.parseInt(str));
        } catch (java.lang.NumberFormatException unused) {
            return num;
        }
    }

    public java.lang.Long toSerializeLong(java.lang.String str, java.lang.Long l17) {
        if (str == null || r26.n0.N(str)) {
            return l17;
        }
        try {
            return java.lang.Long.valueOf(java.lang.Long.parseLong(str));
        } catch (java.lang.NumberFormatException unused) {
            return l17;
        }
    }

    public java.lang.Short toSerializeShort(java.lang.String str, java.lang.Short sh6) {
        if (str == null || r26.n0.N(str)) {
            return sh6;
        }
        try {
            return java.lang.Short.valueOf(java.lang.Short.parseShort(str));
        } catch (java.lang.NumberFormatException unused) {
            return sh6;
        }
    }

    public java.lang.String toSerializeString(java.lang.String str, java.lang.String str2) {
        return str == null || r26.n0.N(str) ? str2 : str;
    }
}
