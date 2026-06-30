package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class v6 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186575e;

    public v6(nw4.k kVar, nw4.y2 y2Var) {
        this.f186574d = kVar;
        this.f186575e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.util.HashMap hashMap = new java.util.HashMap();
        int i17 = ((com.tencent.mm.ipcinvoker.type.IPCInteger) obj).f68404d;
        if (i17 == 1) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "创建成功");
            hashMap.put("code", 100);
            hashMap.put("err_msg", "openFinderCreateAcctView:ok");
        } else if (i17 == 2) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "用户取消");
            hashMap.put("code", 200);
            hashMap.put("err_msg", "openFinderCreateAcctView:cancel");
        } else if (i17 == 3) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "参数为空");
            hashMap.put("code", 300);
            hashMap.put("err_msg", "openFinderCreateAcctView:fail");
        } else if (i17 == 4) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "账号已存在");
            hashMap.put("code", 301);
            hashMap.put("err_msg", "openFinderCreateAcctView:fail");
        }
        nw4.g gVar = this.f186574d.f340863d;
        nw4.y2 y2Var = this.f186575e;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":success", hashMap);
    }
}
