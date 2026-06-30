package com.tencent.mm.xeffect;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002R4\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000ej\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/xeffect/WeJsonMessageCallbackMgr;", "", "", "nPtr", "", "sourceId", "", com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "type", "callback", "Lcom/tencent/mm/xeffect/IWeJsonMessageCallback;", "Ljz5/f0;", "setCallback", "removeAll", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "callbackMap", "Ljava/util/HashMap;", "<init>", "()V", "renderlib_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes10.dex */
public final class WeJsonMessageCallbackMgr {
    public static final com.tencent.mm.xeffect.WeJsonMessageCallbackMgr INSTANCE = new com.tencent.mm.xeffect.WeJsonMessageCallbackMgr();
    private static final java.util.HashMap<java.lang.Long, com.tencent.mm.xeffect.IWeJsonMessageCallback> callbackMap = new java.util.HashMap<>();

    private WeJsonMessageCallbackMgr() {
    }

    public static final int callback(long nPtr, int sourceId, java.lang.String message, int type) {
        kotlin.jvm.internal.o.h(message, "message");
        com.tencent.mm.xeffect.IWeJsonMessageCallback iWeJsonMessageCallback = callbackMap.get(java.lang.Long.valueOf(nPtr));
        if (iWeJsonMessageCallback == null) {
            return 0;
        }
        iWeJsonMessageCallback.a(sourceId, message, tq5.g.values()[type]);
        return 0;
    }

    public final com.tencent.mm.xeffect.IWeJsonMessageCallback removeAll(long nPtr) {
        com.tencent.mm.xeffect.IWeJsonMessageCallback remove;
        java.util.HashMap<java.lang.Long, com.tencent.mm.xeffect.IWeJsonMessageCallback> hashMap = callbackMap;
        synchronized (hashMap) {
            remove = hashMap.remove(java.lang.Long.valueOf(nPtr));
        }
        return remove;
    }

    public final void setCallback(long j17, com.tencent.mm.xeffect.IWeJsonMessageCallback iWeJsonMessageCallback) {
        java.util.HashMap<java.lang.Long, com.tencent.mm.xeffect.IWeJsonMessageCallback> hashMap = callbackMap;
        synchronized (hashMap) {
            hashMap.put(java.lang.Long.valueOf(j17), iWeJsonMessageCallback);
        }
    }
}
