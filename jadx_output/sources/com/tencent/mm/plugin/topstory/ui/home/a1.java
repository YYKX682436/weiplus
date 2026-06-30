package com.tencent.mm.plugin.topstory.ui.home;

@mk0.a
/* loaded from: classes7.dex */
class a1 implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.ipcinvoker.type.IPCString, com.tencent.mm.ipcinvoker.type.IPCString> {
    private a1() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.f158127d = -1;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "PushResetMaxCacheItemCountLimitTask, MaxCacheItemCountLimit = %s", java.lang.Integer.valueOf(com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.f158127d));
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString());
        }
    }
}
