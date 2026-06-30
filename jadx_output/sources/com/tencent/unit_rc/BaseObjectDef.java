package com.tencent.unit_rc;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/tencent/unit_rc/BaseObjectDef;", "", "", "isProxy", "", ya.b.INDEX, "Ljz5/f0;", "notifyFieldUpdated", "", "getStrongPointer", "()J", "strongPointer", "getWeakPointer", "weakPointer", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes11.dex */
public interface BaseObjectDef {
    long getStrongPointer();

    long getWeakPointer();

    boolean isProxy();

    void notifyFieldUpdated(int i17);
}
