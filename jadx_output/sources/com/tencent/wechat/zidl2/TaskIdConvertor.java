package com.tencent.wechat.zidl2;

/* loaded from: classes15.dex */
public class TaskIdConvertor {
    private static final java.lang.String TAG = "TaskIdConvertor";
    private java.util.concurrent.ConcurrentHashMap<com.tencent.wechat.zidl2.TaskIdConvertor.ClientIdContext, java.lang.Long> clientToServerIdMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.wechat.zidl2.TaskIdConvertor.ClientIdContext> serverToClientIdMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.atomic.AtomicLong taskId = new java.util.concurrent.atomic.AtomicLong(0);

    /* loaded from: classes15.dex */
    public class ClientIdContext {
        private java.lang.String clientId;
        private long taskId;

        public ClientIdContext(java.lang.String str, long j17) {
            this.clientId = str;
            this.taskId = j17;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.tencent.wechat.zidl2.TaskIdConvertor.ClientIdContext)) {
                return false;
            }
            com.tencent.wechat.zidl2.TaskIdConvertor.ClientIdContext clientIdContext = (com.tencent.wechat.zidl2.TaskIdConvertor.ClientIdContext) obj;
            return this.taskId == clientIdContext.taskId && java.util.Objects.equals(this.clientId, clientIdContext.clientId);
        }

        public java.lang.String getClientId() {
            return this.clientId;
        }

        public long getTaskId() {
            return this.taskId;
        }

        public int hashCode() {
            return java.util.Objects.hash(this.clientId, java.lang.Long.valueOf(this.taskId));
        }
    }

    public long GenTaskId() {
        return this.taskId.incrementAndGet();
    }

    public void removeServerId(long j17) {
        com.tencent.wechat.zidl2.TaskIdConvertor.ClientIdContext clientIdContext = this.serverToClientIdMap.get(java.lang.Long.valueOf(j17));
        if (clientIdContext == null) {
            return;
        }
        this.clientToServerIdMap.remove(java.lang.Long.valueOf(j17));
        this.serverToClientIdMap.remove(clientIdContext);
    }

    public com.tencent.wechat.zidl2.TaskIdConvertor.ClientIdContext toClientId(long j17) {
        return this.serverToClientIdMap.get(java.lang.Long.valueOf(j17));
    }

    public long toServerId(java.lang.String str, long j17) {
        com.tencent.wechat.zidl2.TaskIdConvertor.ClientIdContext clientIdContext = new com.tencent.wechat.zidl2.TaskIdConvertor.ClientIdContext(str, j17);
        java.lang.Long l17 = this.clientToServerIdMap.get(clientIdContext);
        if (l17 != null) {
            com.tencent.wechat.zlog.Zlog.d(hw5.a.WARN, TAG, java.lang.String.format("ToServerId failed %s %d", str, java.lang.Long.valueOf(j17)), new java.lang.Object[0]);
            return l17.longValue();
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(GenTaskId());
        this.clientToServerIdMap.put(clientIdContext, valueOf);
        this.serverToClientIdMap.put(valueOf, clientIdContext);
        return valueOf.longValue();
    }
}
