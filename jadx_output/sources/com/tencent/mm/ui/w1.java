package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class w1 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.CheckCanSubscribeBizUI f211187a;

    public w1(com.tencent.mm.ui.CheckCanSubscribeBizUI checkCanSubscribeBizUI) {
        this.f211187a = checkCanSubscribeBizUI;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckCanSubscribeBizUI", "hasConcerned  getContactCallBack  succ:" + z17);
        if (z17) {
            return;
        }
        new com.tencent.mm.sdk.platformtools.n3().post(new com.tencent.mm.ui.v1(this));
    }
}
