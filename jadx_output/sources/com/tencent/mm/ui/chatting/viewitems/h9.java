package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class h9 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f204092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ot0.q f204093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f204094c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.qq f204097f;

    public h9(boolean z17, ot0.q qVar, android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.qq qqVar) {
        this.f204092a = z17;
        this.f204093b = qVar;
        this.f204094c = view;
        this.f204095d = dVar;
        this.f204096e = f9Var;
        this.f204097f = qqVar;
    }

    @Override // q80.f0
    public void fail() {
        boolean z17 = this.f204092a;
        yb5.d dVar = this.f204095d;
        if (!z17) {
            db5.t7.makeText(dVar.g(), com.tencent.mm.R.string.ggb, 0).show();
            return;
        }
        com.tencent.mm.ui.chatting.viewitems.c2.h0(this.f204093b, this.f204094c, dVar, this.f204096e, this.f204097f);
    }

    @Override // q80.f0
    public void success() {
    }
}
