package com.tencent.wcdb.chaincall;

/* loaded from: classes12.dex */
public class ChainCall<T extends com.tencent.wcdb.winq.Statement> {
    boolean autoInvalidateHandle;
    int changes = 0;
    com.tencent.wcdb.core.Handle handle;
    boolean needChanges;
    T statement;

    public ChainCall(com.tencent.wcdb.core.Handle handle, boolean z17, boolean z18) {
        this.handle = handle;
        this.needChanges = z17;
        this.autoInvalidateHandle = z18;
    }

    public int getChanges() {
        return this.changes;
    }

    public T getStatement() {
        return this.statement;
    }

    public void invalidateHandle() {
        if (this.autoInvalidateHandle) {
            this.handle.invalidate();
        }
    }

    public void updateChanges() {
        if (this.needChanges) {
            this.changes = this.handle.getChanges();
        }
    }
}
