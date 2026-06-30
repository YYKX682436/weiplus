package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes11.dex */
public final class n extends com.tencent.mm.plugin.ting.uic.z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.plugin.ting.uic.z, com.tencent.mm.plugin.ting.uic.i
    public java.lang.Object d(boolean z17, boolean z18, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        com.tencent.mars.xlog.Log.i("MicroMsg.TingChatRoomFloatBallAnimationUIC", "exitWithAnimation backClose: " + z17);
        d75.b.g(new com.tencent.mm.plugin.ting.uic.m(z17, this, z18, nVar));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }
}
