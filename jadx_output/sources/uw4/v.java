package uw4;

/* loaded from: classes8.dex */
public final class v implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.model.MultiTaskInfo f431757a;

    public v(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        this.f431757a = multiTaskInfo;
    }

    @Override // fs.o
    public boolean a(fs.n nVar) {
        ((ah0.c1) ((uw4.w) nVar)).getClass();
        com.tencent.mm.ipcinvoker.wx_extension.j0 j0Var = (com.tencent.mm.ipcinvoker.wx_extension.j0) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.j0.class);
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = new com.tencent.mm.ipcinvoker.type.IPCString(this.f431757a.field_id);
        ((h80.k) j0Var).getClass();
        com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.a(iPCString, com.tencent.mm.plugin.webview.luggage.y2.class, null);
        return false;
    }
}
