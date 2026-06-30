package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class Statement extends com.tencent.wcdb.winq.Identifier {
    public boolean isWriteStatement() {
        return com.tencent.wcdb.winq.Identifier.isWriteStatement(this.cppObj);
    }
}
