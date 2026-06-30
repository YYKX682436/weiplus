package ia0;

@j95.b
/* loaded from: classes8.dex */
public final class o extends i95.w implements ia0.n {
    public zk3.c Ai(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            return null;
        }
        return (zk3.c) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class);
    }

    public void Bi(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC multiTaskUIC = (com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class);
            if (multiTaskUIC != null) {
                multiTaskUIC.X6(z17);
            }
        }
    }

    public boolean Di(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            return false;
        }
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC multiTaskUIC = (com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class);
        if (multiTaskUIC != null) {
            return multiTaskUIC.Y6();
        }
        return false;
    }

    public void wi(android.app.Activity activity, java.util.HashSet hashSet) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (hashSet != null) {
            ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class)).getClass();
            hashSet.add(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class);
            hashSet.add(qk3.c.class);
        }
    }
}
