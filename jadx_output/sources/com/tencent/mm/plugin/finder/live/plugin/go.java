package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class go implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ap f112719d;

    public go(com.tencent.mm.plugin.finder.live.plugin.ap apVar) {
        this.f112719d = apVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) obj;
        if (finderJumpInfo != null) {
            com.tencent.mm.plugin.finder.live.plugin.ap apVar = this.f112719d;
            synchronized (apVar) {
                pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.so(apVar, finderJumpInfo));
            }
        }
    }
}
