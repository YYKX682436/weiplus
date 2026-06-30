package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class k extends com.tencent.mm.storage.f {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f195063c = {"CREATE TABLE IF NOT EXISTS appbrandnotifymessage ( msgId INTEGER PRIMARY KEY, msgSvrId INTEGER , type INT, status INT, isSend INT, isShowTimer INTEGER, createTime INTEGER, talker TEXT, content TEXT, imgPath TEXT, reserved TEXT, lvbuffer BLOB, transContent TEXT, transBrandWording TEXT ) ", "CREATE INDEX IF NOT EXISTS  appbrandnotifymessageSvrIdIndex ON appbrandnotifymessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  appbrandnotifymessageTalkerIndex ON appbrandnotifymessage ( talker )", "CREATE INDEX IF NOT EXISTS  appbrandnotifymessageTalerStatusIndex ON appbrandnotifymessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  appbrandnotifymessageCreateTimeIndex ON appbrandnotifymessage ( createTime )", "CREATE INDEX IF NOT EXISTS  appbrandnotifymessageCreateTaklerTimeIndex ON appbrandnotifymessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  appbrandnotifymessageSendCreateTimeIndex ON appbrandnotifymessage ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  appbrandnotifymessageTalkerTypeIndex ON appbrandnotifymessage ( talker,type )"};

    public k(xg3.m0 m0Var) {
        super(m0Var);
        g(d(), "appbrandnotifymessage");
        a(new xg3.k0(32, "appbrandnotifymessage", xg3.k0.a(3500001L, 4000000L, 105000001L, 108000000L, -1L, -1L)));
    }

    @Override // com.tencent.mm.storage.f
    public java.lang.String f(java.lang.String str) {
        iz5.a.g(null, str != null && str.length() > 0);
        if (com.tencent.mm.storage.z3.B3(str)) {
            return "appbrandnotifymessage";
        }
        return null;
    }
}
