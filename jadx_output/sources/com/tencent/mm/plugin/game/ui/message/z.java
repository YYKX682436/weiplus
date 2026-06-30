package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f141663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f141664e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f141665f;

    public z(com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView, java.lang.String str, boolean z17, int i17) {
        this.f141663d = str;
        this.f141664e = z17;
        this.f141665f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.model.o1 Di = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di();
        Di.getClass();
        Di.execSQL("GameRawMessage", "update GameRawMessage set isGreet=" + this.f141664e + " , relationType = " + this.f141665f + " where quickResponseContentId = \"" + this.f141663d + "\"");
    }
}
