package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes12.dex */
public class v0 extends android.database.Observable {
    public void a() {
        for (int size = ((android.database.Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((com.tencent.mm.xcompat.recyclerview.widget.w0) ((android.database.Observable) this).mObservers.get(size)).a();
        }
    }

    public void b(int i17, int i18) {
        for (int size = ((android.database.Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((com.tencent.mm.xcompat.recyclerview.widget.w0) ((android.database.Observable) this).mObservers.get(size)).b(i17, i18);
        }
    }
}
