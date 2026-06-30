package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes.dex */
public class l0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f191250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f191251e;

    public l0(boolean z17, android.content.Context context) {
        this.f191250d = z17;
        this.f191251e = context;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        boolean z17 = this.f191250d;
        android.content.Context context = this.f191251e;
        if (z17) {
            g4Var.f(1, context.getString(com.tencent.mm.R.string.b1k));
        }
        g4Var.f(2, context.getString(com.tencent.mm.R.string.b1j));
        g4Var.f(3, context.getString(com.tencent.mm.R.string.b1l));
    }
}
