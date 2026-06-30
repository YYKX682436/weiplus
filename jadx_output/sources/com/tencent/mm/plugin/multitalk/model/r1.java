package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modeltalkroom.MultiTalkGroup f150084d;

    public r1(com.tencent.mm.plugin.multitalk.model.v0 v0Var, com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup) {
        this.f150084d = multiTalkGroup;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup = this.f150084d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(multiTalkGroup.f71606d)) {
            java.lang.String str = multiTalkGroup.f71607e;
        }
    }
}
