package com.tencent.mm.plugin.wepkg.event;

/* loaded from: classes8.dex */
public class e implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.event.f f188331d;

    public e(com.tencent.mm.plugin.wepkg.event.f fVar) {
        this.f188331d = fVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.wepkg.event.f fVar = this.f188331d;
        if (fVar != null) {
            ((com.tencent.mm.plugin.wepkg.event.b) fVar).getClass();
            ((java.util.HashSet) com.tencent.mm.plugin.wepkg.event.ForceUpdateNotify.f188328e).clear();
        }
    }
}
