package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public class i4 extends android.view.animation.AlphaAnimation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.n4 f210480d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(com.tencent.mm.ui.tools.s4 s4Var, float f17, float f18, com.tencent.mm.ui.tools.n4 n4Var) {
        super(f17, f18);
        this.f210480d = n4Var;
    }

    @Override // android.view.animation.AlphaAnimation, android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        com.tencent.mm.ui.tools.n4 n4Var = this.f210480d;
        if (n4Var instanceof com.tencent.mm.ui.tools.o4) {
            ((com.tencent.mm.ui.tools.o4) n4Var).b(f17);
        }
        super.applyTransformation(f17, transformation);
    }
}
