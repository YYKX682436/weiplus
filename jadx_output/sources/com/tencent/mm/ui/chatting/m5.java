package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public final class m5 extends java.util.HashMap {
    public final com.tencent.mm.ui.chatting.l5 a(java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        java.lang.String simpleName = clazz.getSimpleName();
        if (!(simpleName.length() > 0)) {
            throw new java.lang.IllegalArgumentException("Extras key(simpleName) is empty for ".concat(clazz.getName()).toString());
        }
        V v17 = get(simpleName);
        if (v17 instanceof com.tencent.mm.ui.chatting.l5) {
            return (com.tencent.mm.ui.chatting.l5) v17;
        }
        return null;
    }

    public final com.tencent.mm.ui.chatting.m5 b(com.tencent.mm.ui.chatting.l5 extra) {
        kotlin.jvm.internal.o.g(extra, "extra");
        java.lang.String simpleName = extra.getClass().getSimpleName();
        if (!(simpleName.length() > 0)) {
            throw new java.lang.IllegalArgumentException("Extras key(simpleName) is empty for ".concat(extra.getClass().getName()).toString());
        }
        put(simpleName, extra);
        return this;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return super.containsKey((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.ui.chatting.l5) {
            return super.containsValue((com.tencent.mm.ui.chatting.l5) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (com.tencent.mm.ui.chatting.l5) super.get((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof java.lang.String) ? obj2 : (com.tencent.mm.ui.chatting.l5) super.getOrDefault((java.lang.String) obj, (com.tencent.mm.ui.chatting.l5) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (com.tencent.mm.ui.chatting.l5) super.remove((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if ((obj instanceof java.lang.String) && (obj2 instanceof com.tencent.mm.ui.chatting.l5)) {
            return super.remove((java.lang.String) obj, (com.tencent.mm.ui.chatting.l5) obj2);
        }
        return false;
    }
}
