package j0;

/* loaded from: classes14.dex */
public final class s3 {
    public s3(kotlin.jvm.internal.i iVar) {
    }

    public final g2.q0 a(g2.g0 textInputService, g2.e0 value, g2.e editProcessor, g2.l imeOptions, yz5.l onValueChange, yz5.l onImeActionPerformed) {
        kotlin.jvm.internal.o.g(textInputService, "textInputService");
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(editProcessor, "editProcessor");
        kotlin.jvm.internal.o.g(imeOptions, "imeOptions");
        kotlin.jvm.internal.o.g(onValueChange, "onValueChange");
        kotlin.jvm.internal.o.g(onImeActionPerformed, "onImeActionPerformed");
        j0.r3 r3Var = new j0.r3(editProcessor, onValueChange);
        g2.x xVar = textInputService.f267701a;
        g2.p0 p0Var = (g2.p0) xVar;
        p0Var.getClass();
        p0Var.f267734c = true;
        p0Var.f267737f = value;
        p0Var.f267738g = imeOptions;
        p0Var.f267735d = r3Var;
        p0Var.f267736e = onImeActionPerformed;
        ((u26.o) p0Var.f267741j).e(g2.h0.StartInput);
        g2.q0 q0Var = new g2.q0(textInputService, xVar);
        textInputService.f267702b.set(q0Var);
        return q0Var;
    }
}
