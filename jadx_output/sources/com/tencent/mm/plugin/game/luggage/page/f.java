package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class f extends com.tencent.mm.plugin.webview.luggage.b4 {

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.plugin.game.luggage.page.e f139886l;

    public f(android.app.Activity activity) {
        super(activity);
        java.util.LinkedList linkedList;
        this.f406660a = com.tencent.mm.plugin.game.luggage.page.b0.class;
        sd.f fVar = this.f406664e;
        synchronized (com.tencent.mm.plugin.game.luggage.jsapi.a.class) {
            com.tencent.mm.plugin.game.luggage.jsapi.a.f139583a = new java.util.LinkedList();
            com.tencent.mm.plugin.game.luggage.jsapi.a.b();
            linkedList = com.tencent.mm.plugin.game.luggage.jsapi.a.f139583a;
        }
        fVar.getClass();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            fVar.f406599a.add((java.lang.Class) it.next());
        }
    }
}
