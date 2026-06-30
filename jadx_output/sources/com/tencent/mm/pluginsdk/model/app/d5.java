package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes15.dex */
public class d5 implements com.tencent.mm.pluginsdk.model.app.c5 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f188856a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f188857b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f188858c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f188859d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.app.b5 f188860e;

    public d5(com.tencent.mm.pluginsdk.model.app.b5 b5Var) {
        this.f188860e = b5Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public void a(boolean z17, boolean z18) {
        com.tencent.mm.pluginsdk.model.app.b5 b5Var;
        this.f188858c = true;
        this.f188857b = z17;
        if (!this.f188859d || (b5Var = this.f188860e) == null) {
            return;
        }
        b5Var.a(this.f188856a, z17);
    }

    @Override // com.tencent.mm.pluginsdk.model.app.c5
    public void b(boolean z17) {
        com.tencent.mm.pluginsdk.model.app.b5 b5Var;
        this.f188856a = z17;
        this.f188859d = true;
        if (!this.f188858c || (b5Var = this.f188860e) == null) {
            return;
        }
        b5Var.a(z17, this.f188857b);
    }

    @Override // com.tencent.mm.pluginsdk.model.app.c5
    public void reset() {
        this.f188858c = false;
        this.f188857b = false;
        this.f188859d = false;
        this.f188856a = false;
    }
}
