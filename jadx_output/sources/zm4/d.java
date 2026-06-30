package zm4;

/* loaded from: classes8.dex */
public final class d extends com.tencent.mm.ui.component.UIComponent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        jz5.h.b(new zm4.c(this));
    }

    public final zm4.a O6(boolean z17) {
        zm4.a aVar = new zm4.a(null, 1, null);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.List<wm4.y> list = ((com.tencent.mm.plugin.topstory.ui.home.d) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.topstory.ui.home.d.class)).f174950e;
        if (list != null) {
            for (wm4.y yVar : list) {
                zm4.b bVar = new zm4.b();
                bVar.f474177a = yVar.f447318b;
                android.app.Activity context = getContext();
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.topstory.ui.home.y1 y1Var = (com.tencent.mm.plugin.topstory.ui.home.y1) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.topstory.ui.home.y1.class);
                int i17 = yVar.f447318b;
                int i18 = y1Var.f175115f;
                bVar.f474182f = i18 != -1 && i18 == i17;
                bVar.f474181e = yVar.f447323g;
                bVar.f474180d = yVar.f447327k;
                if (z17) {
                    android.app.Activity context2 = getContext();
                    kotlin.jvm.internal.o.g(context2, "context");
                    if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.topstory.ui.home.y1.class);
                    kotlin.jvm.internal.o.f(a17, "get(...)");
                    com.tencent.mm.plugin.topstory.ui.home.y1 y1Var2 = (com.tencent.mm.plugin.topstory.ui.home.y1) a17;
                    java.lang.Integer num = y1Var2.f175118i;
                    int i19 = yVar.f447318b;
                    if (num != null && num.intValue() == i19) {
                        bVar.f474178b = y1Var2.f175116g;
                        bVar.f474179c = y1Var2.f175117h;
                    }
                } else {
                    bVar.f474178b = yVar.f447325i;
                    bVar.f474179c = yVar.f447326j;
                }
                aVar.f474176a.add(bVar);
            }
        }
        return aVar;
    }
}
