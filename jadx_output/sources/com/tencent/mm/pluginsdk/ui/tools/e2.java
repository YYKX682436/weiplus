package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public final class e2 extends com.tencent.mm.pluginsdk.ui.tools.d2 {

    /* renamed from: p, reason: collision with root package name */
    public int f191601p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f191602q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f191603r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI) {
        super(0L, null, 0L, null, null, null, 0L, 0, false, null, false, false, 4095, null);
        this.f191603r = fileSelectorUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.d2
    public com.tencent.mm.pluginsdk.ui.tools.d2 a() {
        com.tencent.mm.pluginsdk.ui.tools.e2 e2Var = new com.tencent.mm.pluginsdk.ui.tools.e2(this.f191603r);
        b(e2Var);
        e2Var.f191602q = this.f191602q;
        e2Var.f191601p = this.f191601p;
        return e2Var;
    }
}
