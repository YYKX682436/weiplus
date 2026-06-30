package com.tencent.mm.plugin.game;

@j95.b
/* loaded from: classes8.dex */
public class n1 extends i95.w implements m33.r1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.a f140593d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.i1 f140594e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.a2 f140595f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.e2 f140596g;

    public com.tencent.mm.plugin.game.model.i1 Ai() {
        gm0.j1.b().c();
        if (this.f140594e == null) {
            synchronized (this) {
                if (this.f140594e == null) {
                    this.f140594e = new com.tencent.mm.plugin.game.model.i1();
                }
            }
        }
        return this.f140594e;
    }

    public com.tencent.mm.plugin.game.model.a2 Bi() {
        gm0.j1.b().c();
        if (this.f140595f == null) {
            synchronized (this) {
                if (this.f140595f == null) {
                    this.f140595f = new com.tencent.mm.plugin.game.model.a2();
                }
            }
        }
        return this.f140595f;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.p1(this));
    }

    public com.tencent.mm.plugin.game.model.a wi() {
        gm0.j1.b().c();
        if (this.f140593d == null) {
            synchronized (this) {
                if (this.f140593d == null) {
                    this.f140593d = new com.tencent.mm.plugin.game.model.a();
                }
            }
        }
        return this.f140593d;
    }
}
