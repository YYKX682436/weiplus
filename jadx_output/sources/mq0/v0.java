package mq0;

@j95.b
/* loaded from: classes7.dex */
public final class v0 extends i95.w implements mq0.e0 {
    public void Ai(java.lang.String jsapiName, int i17, java.lang.String str, java.lang.String bizName) {
        kotlin.jvm.internal.o.g(jsapiName, "jsapiName");
        kotlin.jvm.internal.o.g(bizName, "bizName");
        if (((je3.i) i95.n0.c(je3.i.class)).Ii(0.001f)) {
            com.tencent.mm.autogen.mmdata.rpt.MagicCardRuntimeKVStruct magicCardRuntimeKVStruct = new com.tencent.mm.autogen.mmdata.rpt.MagicCardRuntimeKVStruct();
            mq0.u0[] u0VarArr = mq0.u0.f330622d;
            magicCardRuntimeKVStruct.f59075d = magicCardRuntimeKVStruct.b("bizType", "jsapiError", true);
            magicCardRuntimeKVStruct.f59076e = magicCardRuntimeKVStruct.b("type", jsapiName, true);
            magicCardRuntimeKVStruct.f59077f = magicCardRuntimeKVStruct.b("subType", java.lang.String.valueOf(i17), true);
            magicCardRuntimeKVStruct.f59082k = magicCardRuntimeKVStruct.b("extInfoStr1", str, true);
            magicCardRuntimeKVStruct.f59079h = magicCardRuntimeKVStruct.b("bizName", bizName, true);
            magicCardRuntimeKVStruct.k();
            magicCardRuntimeKVStruct.n();
        }
    }

    public void wi(java.lang.String type, java.lang.String subType, java.lang.String sessionId, java.lang.String bizName, java.lang.String frameSetRootPath, java.lang.String frameSetName, java.lang.String... extInfoStr) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(subType, "subType");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(frameSetRootPath, "frameSetRootPath");
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        kotlin.jvm.internal.o.g(extInfoStr, "extInfoStr");
        if (((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).Bi(bizName)) {
            com.tencent.mm.autogen.mmdata.rpt.MagicCardRuntimeKVStruct magicCardRuntimeKVStruct = new com.tencent.mm.autogen.mmdata.rpt.MagicCardRuntimeKVStruct();
            mq0.u0[] u0VarArr = mq0.u0.f330622d;
            magicCardRuntimeKVStruct.f59075d = magicCardRuntimeKVStruct.b("bizType", "startupCover", true);
            magicCardRuntimeKVStruct.f59076e = magicCardRuntimeKVStruct.b("type", type, true);
            magicCardRuntimeKVStruct.f59077f = magicCardRuntimeKVStruct.b("subType", subType, true);
            magicCardRuntimeKVStruct.f59078g = magicCardRuntimeKVStruct.b(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, sessionId, true);
            magicCardRuntimeKVStruct.f59079h = magicCardRuntimeKVStruct.b("bizName", bizName, true);
            magicCardRuntimeKVStruct.f59080i = magicCardRuntimeKVStruct.b("frameSetRootPath", frameSetRootPath, true);
            magicCardRuntimeKVStruct.f59081j = magicCardRuntimeKVStruct.b("frameSetName", frameSetName, true);
            if (!(extInfoStr.length == 0)) {
                magicCardRuntimeKVStruct.f59082k = magicCardRuntimeKVStruct.b("extInfoStr1", extInfoStr[0], true);
            }
            if (extInfoStr.length > 1) {
                magicCardRuntimeKVStruct.f59083l = magicCardRuntimeKVStruct.b("extInfoStr2", extInfoStr[1], true);
            }
            if (extInfoStr.length > 2) {
                magicCardRuntimeKVStruct.f59084m = magicCardRuntimeKVStruct.b("extInfoStr3", extInfoStr[2], true);
            }
            magicCardRuntimeKVStruct.k();
            magicCardRuntimeKVStruct.n();
        }
    }
}
