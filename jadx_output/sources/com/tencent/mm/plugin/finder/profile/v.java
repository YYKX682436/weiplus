package com.tencent.mm.plugin.finder.profile;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f124436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124437e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.util.List list, java.lang.String str) {
        super(0);
        this.f124436d = list;
        this.f124437e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.List list = this.f124436d;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(new com.tencent.mm.plugin.finder.profile.e0(262144, (r45.ro2) it.next()));
        }
        com.tencent.mars.xlog.Log.i("Finder.UserPoiHandler", "[saveData] infoList.size=" + list.size() + ", firstPage.size=" + linkedList.size());
        if (linkedList.size() > 0) {
            bu2.e0.f24498a.a(20, this.f124437e, linkedList);
        }
        return jz5.f0.f302826a;
    }
}
