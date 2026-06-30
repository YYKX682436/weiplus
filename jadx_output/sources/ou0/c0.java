package ou0;

/* loaded from: classes5.dex */
public abstract class c0 {
    public static final float a(float f17, float f18, float f19, float f27, ou0.b flag, yz5.l lVar) {
        float f28;
        kotlin.jvm.internal.o.g(flag, "flag");
        if (!(f18 - f27 <= f17 && f17 <= f27 + f18)) {
            flag.f348887e = false;
            return f19;
        }
        flag.f348887e = true;
        boolean z17 = flag.f348888f;
        float f29 = flag.f348884b;
        if (z17) {
            flag.a(f19);
            flag.c();
            if (flag.c()) {
                return f29;
            }
            flag.f348888f = false;
            f28 = flag.f348885c;
            flag.f348885c = f29;
        } else {
            flag.f348888f = true;
            if (lVar != null) {
                lVar.invoke(flag);
            }
            f28 = flag.b(f17, f18, f19);
            flag.f348885c = f29;
        }
        return f28;
    }
}
