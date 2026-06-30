package com.tencent.mm.plugin.magicbrush;

@j95.b(dependencies = {com.tencent.mm.plugin.magicbrush.s4.class})
/* loaded from: classes7.dex */
public final class h5 extends i95.w implements jc3.d0 {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.mm.plugin.magicbrush.s7 s7Var = (com.tencent.mm.plugin.magicbrush.s7) ((com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class));
        s7Var.bj("MagicBrushDemo", com.tencent.mm.plugin.magicbrush.b5.f147879a);
        s7Var.bj("MagicBrushPublicServiceDemo", com.tencent.mm.plugin.magicbrush.c5.f147883a);
        s7Var.bj("MagicSclDemo", com.tencent.mm.plugin.magicbrush.d5.f147910a);
        s7Var.bj("MagicSclNativeDemo", com.tencent.mm.plugin.magicbrush.e5.f147922a);
        s7Var.bj("MagicWorkerDemo", com.tencent.mm.plugin.magicbrush.f5.f147936a);
        for (java.lang.String str : kz5.b0.c("MagicSimpleDemo")) {
            s7Var.bj(str, new com.tencent.mm.plugin.magicbrush.g5(str));
        }
    }
}
