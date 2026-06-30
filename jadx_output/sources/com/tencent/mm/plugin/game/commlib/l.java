package com.tencent.mm.plugin.game.commlib;

@j95.b
/* loaded from: classes8.dex */
public class l extends i95.w implements h43.e {

    /* renamed from: d, reason: collision with root package name */
    public volatile j43.c f139388d;

    public final j43.c wi() {
        if (this.f139388d == null && gm0.j1.a()) {
            synchronized (this) {
                if (this.f139388d == null) {
                    this.f139388d = new j43.c(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f139388d;
    }
}
