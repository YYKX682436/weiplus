package com.tencent.mm.plugin.zero;

@j95.b
/* loaded from: classes12.dex */
public class b extends i95.w {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        com.tencent.wcdb.database.SQLiteGlobal.loadLib();
        com.tencent.wcdb.support.Log.setLogger(new com.tencent.mm.plugin.zero.b$$a());
    }
}
