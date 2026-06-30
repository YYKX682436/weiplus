package pk2;

/* loaded from: classes3.dex */
public interface g8 {
    static kotlinx.coroutines.r2 a(pk2.g8 g8Var, oz5.l context, kotlinx.coroutines.a1 start, yz5.p block, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: viewScopeLaunch");
        }
        if ((i17 & 1) != 0) {
            context = oz5.m.f350329d;
        }
        if ((i17 & 2) != 0) {
            start = kotlinx.coroutines.a1.DEFAULT;
        }
        pk2.k9 k9Var = (pk2.k9) g8Var;
        k9Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        return com.tencent.mm.plugin.finder.live.util.y.l(k9Var.f355924a, context, start, block);
    }
}
