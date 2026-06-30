package com.tencent.mm.plugin.sport.model;

/* loaded from: classes12.dex */
public class u extends com.tencent.mm.storage.j3 {
    @Override // com.tencent.mm.storage.j3
    public synchronized long d(int i17, long j17) {
        if (i()) {
            return this.f195049i.d(i17, j17);
        }
        java.lang.Object a17 = a(i17);
        if (a17 instanceof java.lang.Long) {
            return ((java.lang.Long) a17).longValue();
        }
        if (!(a17 instanceof java.lang.Integer)) {
            return j17;
        }
        return ((java.lang.Integer) a17).longValue();
    }
}
