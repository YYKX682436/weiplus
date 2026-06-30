package com.tencent.mm.plugin.multitask;

/* loaded from: classes8.dex */
public final class h2 implements com.tencent.mm.plugin.multitask.m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.multitask.t1 f150438d = new com.tencent.mm.plugin.multitask.t1(null);

    /* renamed from: e, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.multitask.h2 f150439e;

    @Override // com.tencent.mm.plugin.multitask.m0
    public void a() {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.multitask.y1.class, null);
    }

    @Override // com.tencent.mm.plugin.multitask.m0
    public float c() {
        return ((com.tencent.mm.ipcinvoker.type.IPCFloat) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.multitask.a2.class)).f68403d;
    }

    @Override // com.tencent.mm.plugin.multitask.m0
    public void e(int i17) {
        com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCInteger(i17), com.tencent.mm.plugin.multitask.b2.class);
    }

    @Override // kk3.c
    public void f(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, qn5.a aVar) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, multiTaskInfo, com.tencent.mm.plugin.multitask.c2.class, com.tencent.mm.plugin.multitask.f2.f150433d);
    }

    @Override // jk3.f
    public void g(boolean z17, boolean z18) {
    }

    @Override // com.tencent.mm.plugin.multitask.m0
    public void i(java.lang.Boolean bool, java.lang.Boolean bool2) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.multitask.PluginMultiTaskUIServiceProxy$IPCAnimationConfig(bool != null ? bool.booleanValue() : false, bool2 != null ? bool2.booleanValue() : false), com.tencent.mm.plugin.multitask.d2.class, com.tencent.mm.plugin.multitask.g2.f150436d);
    }

    @Override // com.tencent.mm.plugin.multitask.m0
    public void j(java.lang.Boolean bool, java.lang.Boolean bool2) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.multitask.PluginMultiTaskUIServiceProxy$IPCAnimationConfig(bool != null ? bool.booleanValue() : false, bool2 != null ? bool2.booleanValue() : false), com.tencent.mm.plugin.multitask.v1.class, com.tencent.mm.plugin.multitask.e2.f150431d);
    }
}
