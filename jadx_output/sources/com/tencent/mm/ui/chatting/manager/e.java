package com.tencent.mm.ui.chatting.manager;

/* loaded from: classes9.dex */
public class e implements j45.h {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.WeakHashMap f201965b = new java.util.WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f201966a;

    public e(yb5.d dVar) {
        this.f201966a = new java.lang.ref.WeakReference(dVar);
    }

    public void a(android.content.Intent intent, int i17, j45.g gVar) {
        yb5.d dVar = (yb5.d) this.f201966a.get();
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = dVar != null ? dVar.f460717l : null;
        if (baseChattingUIFragment == null) {
            return;
        }
        java.util.WeakHashMap weakHashMap = f201965b;
        java.util.HashMap hashMap = (java.util.HashMap) weakHashMap.get(baseChattingUIFragment);
        if (hashMap == null) {
            hashMap = new java.util.HashMap();
            weakHashMap.put(baseChattingUIFragment, hashMap);
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.chatting.manager.d(this, baseChattingUIFragment));
        }
        hashMap.put(java.lang.Integer.valueOf(i17), gVar);
        baseChattingUIFragment.startActivityForResult(intent, i17);
    }
}
