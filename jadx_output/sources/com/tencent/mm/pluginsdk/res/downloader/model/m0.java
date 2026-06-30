package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes5.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f189689a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile java.util.List f189690b;

    static {
        java.util.HashMap hashMap = new java.util.HashMap(1);
        f189689a = hashMap;
        hashMap.put(161516564, new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.n());
        f189690b = null;
    }

    public static java.util.Collection a() {
        if (f189690b != null) {
            return f189690b;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = f189689a.keySet().iterator();
        while (it.hasNext()) {
            com.tencent.mm.pluginsdk.res.downloader.model.o oVar = (com.tencent.mm.pluginsdk.res.downloader.model.o) f189689a.get(java.lang.Integer.valueOf(((java.lang.Integer) it.next()).intValue()));
            if (oVar != null) {
                linkedList.add(oVar);
            }
        }
        f189690b = linkedList;
        return linkedList;
    }
}
