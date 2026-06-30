package qk3;

/* loaded from: classes.dex */
public final class c extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final java.lang.String O6(int i17) {
        if (i17 == 1) {
            return getString(com.tencent.mm.R.string.gvb);
        }
        if (i17 != 2) {
            if (i17 == 3) {
                return getString(com.tencent.mm.R.string.gve);
            }
            if (i17 == 4) {
                return getString(com.tencent.mm.R.string.gvc);
            }
            if (i17 == 5) {
                return getString(com.tencent.mm.R.string.gvi);
            }
            if (i17 == 8) {
                return getString(com.tencent.mm.R.string.gvg);
            }
            if (i17 != 22) {
                if (i17 == 30) {
                    return getString(com.tencent.mm.R.string.o9w);
                }
                if (i17 != 25) {
                    if (i17 != 26) {
                        return "";
                    }
                }
            }
            return getString(com.tencent.mm.R.string.gvh);
        }
        return getString(com.tencent.mm.R.string.gvi);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.f489319c45).view(com.tencent.mm.R.id.jxs).desc(((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).Di() ? com.tencent.mm.R.string.oab : com.tencent.mm.R.string.h3h);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.bxn);
        root.view(com.tencent.mm.R.id.hhd).desc(new qk3.a(this));
        root.view(com.tencent.mm.R.id.jvf).desc(new qk3.b(this));
    }
}
