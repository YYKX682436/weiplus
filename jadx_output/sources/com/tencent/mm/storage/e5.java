package com.tencent.mm.storage;

/* loaded from: classes4.dex */
public final class e5 {

    /* renamed from: a, reason: collision with root package name */
    public int f193857a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f193858b = new java.util.LinkedList();

    public final boolean a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hasNew: ");
        sb6.append(this.f193857a);
        sb6.append(", ");
        java.util.LinkedList linkedList = this.f193858b;
        sb6.append(linkedList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiDesignerProductList", sb6.toString());
        int i17 = (int) com.tencent.mm.sdk.platformtools.t8.i1();
        if ((linkedList instanceof java.util.Collection) && linkedList.isEmpty()) {
            return false;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (((long) ((z85.a) it.next()).field_syncTime) > ((long) i17) - 2592000) {
                return true;
            }
        }
        return false;
    }
}
