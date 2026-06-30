package com.tencent.unit_rc.ur;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/tencent/unit_rc/ur/Mutex;", "Lcom/tencent/unit_rc/BaseObjectDef;", "", "tryLock", "Ljz5/f0;", "lock", "unlock", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes13.dex */
public interface Mutex extends com.tencent.unit_rc.BaseObjectDef {
    void lock();

    boolean tryLock();

    void unlock();
}
